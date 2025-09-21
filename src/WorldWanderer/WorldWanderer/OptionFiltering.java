package WorldWanderer;

//Author: Avanthi Nannegari (s4137277)

import java.util.ArrayList;
import java.util.List;

abstract class Filter {
    private String name;
    private boolean enabled = true;
    public abstract boolean matches(FlightResult r);
    public void toggle(boolean on) { 
        enabled = on; 
    }
    public String getName() { 
        return name; 
    }   
    public void setName(String v) { 
        name = v; 
    }
    public boolean isEnabled() { 
        return enabled; 
    }
}

class FilterSet {
    private boolean active = true;
    private List<Filter> filters = new ArrayList<>();
    public List<FlightResult> applyTo(List<FlightResult> results) { 
        return results; 
    } 
    public void clear() { 
        filters.clear(); 
    }
    public List<Filter> getFilters() { 
        return filters; 
    }
    public boolean isActive() { 
        return active; 
    }  
    public void setActive(boolean v) { 
        active = v; 
    }
}

class PriceFilter extends Filter {
    private double maxPrice;
    public void setMaxPrice(double p) { 
        maxPrice = p; 
    }
    @Override public boolean matches(FlightResult r) {
        return r != null && r.getTotalPrice() != null && r.getTotalPrice().getAmount() <= maxPrice;
    }
}

class DurationFilter extends Filter {
    private int maxMinutes;
    public void setMaxMinutes(int m) { 
        maxMinutes = m; 
    }
    @Override public boolean matches(FlightResult r) { 
        return r != null && r.totalDuration() <= maxMinutes; 
    }
}

class StopsFilter extends Filter {
    private int maxStops;
    public void setMaxStops(int n) { 
        maxStops = n; 
    }
    @Override public boolean matches(FlightResult r) { 
        return r != null && r.stopCount() <= maxStops; 
    }
}

class AirlineFilter extends Filter {
    private List<String> allowedAirlines = new ArrayList<>();
    public void allow(String code) { 
        allowedAirlines.add(code); 
    }
    @Override public boolean matches(FlightResult r) { 
        return true; 
    }
}

