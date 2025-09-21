package WorldWanderer;

//Author: Avanthi Nannegari (s4137277)

import java.util.ArrayList;
import java.util.List;

class Price {
	private double amount;
    private String currency;
    public Price(double amount, String currency) {
		this.amount = amount; this.currency = currency; 
	}
    public double convertTo(String target) {
		return amount; 
	}
    public String format() {
		return amount + " " + currency; 
	}
    public double getAmount() { 
		return amount; 
	}
    public void setAmount(double v) { 
		amount = v; 
	}
    public String getCurrency() { 
		return currency; 
	}
    public void setCurrency(String v) { 
		currency = v; 
	}
}

class SearchCriteria {
    private String origin, destination, departDate, returnDate, cabin;
    private int adults, children;
    public boolean isValid() { 
		return origin != null && destination != null; 
	}
    public String key() { 
		return origin+"_"+destination+"_"+departDate+"_"+returnDate+"_"+cabin+"_"+adults+"_"+children; 
	}
    public String getOrigin() { 
		return origin; 
	}  
	public void setOrigin(String v) { 
		origin = v; 
	}
    public String getDestination() { 
		return destination; 
	}  
	public void setDestination(String v) { 
		destination = v; 
	}
}

class FlightSearchService {
    private int cacheTtlMinutes = 5;
    private List<String> providers = new ArrayList<>();
    public List<FlightResult> search(SearchCriteria criteria) { 
		return new ArrayList<>(); 
	}
    public void refreshCache(String key) {

	}
    public int getCacheTtlMinutes() { 
		return cacheTtlMinutes; 
	}
    public void setCacheTtlMinutes(int m) { 
		cacheTtlMinutes = m; 
	}
}

class FlightResult {
    private String id;
    private Price totalPrice;
    private Itinerary itinerary;
    private List<FareOption> fares = new ArrayList<>();
    public int totalDuration() { 
		return itinerary == null ? 0 : itinerary.totalDuration(); 
	}
    public int stopCount() { 
		return itinerary == null ? 0 : Math.max(0, itinerary.getSegments().size() - 1); 
	}
    public Price getTotalPrice() { 
		return totalPrice; 
	}
    public Itinerary getItinerary() { 
		return itinerary; 
	}
}

class Itinerary {
    private String id;
    private List<FlightSegment> segments = new ArrayList<>();
    public void addSegment(FlightSegment seg) { 
		segments.add(seg); 
	}
    public int layoverAt(int index) { 
		return 0; 
	}
    public List<FlightSegment> getSegments() { 
		return segments; 
	}
    public String getId() { 
		return id; 
	}
    public int totalDuration() { 
		return 0; 
	}
}

class FlightSegment {
    private Airport origin, destination;
    private String depTime, arrTime;
    private Airline airline;
    public int duration() { 
		return 0; 
	}
    public boolean isOvernight() { 
		return false; 
	}
    public Airport getOrigin() { 
		return origin; 
	}
    public Airport getDestination() { 
		return destination; 
	}
    public String getDepTime() { 
		return depTime; 
	}
    public String getArrTime() { 
		return arrTime; 
	}
}

class Airline {
    private String code, name;
    public String logoUrl() { 
		return ""; 
	}
    public boolean isPartner() { 
		return false; 
	}
    public String getCode() { 
		return code; 
	}  
	public void setCode(String v) { 
		code = v; 
	}
    public String getName() { 
		return name; 
	} 
	public void setName(String v) { 
		name = v; 
	}
}

class Airport {
    private String code, name;
    public String timezone() { 
		return "UTC"; 
	}
    public boolean isInternational() { 
		return true; 
	}
    public String getCode() { 
		return code; 
	}  
	public void setCode(String v) { 
		code = v; 
	}
    public String getName() { 
		return name; 
	}  
	public void setName(String v) { 
		name = v; 
	}
}

class FareOption {
    private String fareCode;
    private boolean refundable;
    private Price price;
    public String rulesSummary() { 
		return ""; 
	}
    public double priceWithFees() { 
		return price == null ? 0 : price.getAmount(); 
	}
    public Price getPrice() { 
		return price; 
	}
    public boolean isRefundable() { 
		return refundable; 
	}
}

enum BookingStatus { PENDING, CONFIRMED, CANCELLED }
class FlightBooking {
    private String bookingId;
    private BookingStatus status = BookingStatus.PENDING;
    private User user;            
    private Itinerary itinerary;  
    private Payment payment;      
    public void confirm(Payment p) {
        this.payment = p;
        this.status = BookingStatus.CONFIRMED;
    }
    public void cancel() {
        this.status = BookingStatus.CANCELLED;
    }
    public String getBookingId() { 
		return bookingId; 
	}
    public void setBookingId(String bookingId) { 
		this.bookingId = bookingId; 
	}
    public BookingStatus getStatus() { 
		return status; 
	}
    public void setStatus(BookingStatus status) { 
		this.status = status; 
	}
    public User getUser() { 
		return user; 
	}
    public void setUser(User user) { 
		this.user = user; 
	}
    public Itinerary getItinerary() { 
		return itinerary; 
	}
    public void setItinerary(Itinerary itinerary) { 
		this.itinerary = itinerary; 
	}
    public Payment getPayment() { 
		return payment; 
	}
}


enum PaymentStatus { INITIATED, AUTHORISED, CAPTURED, FAILED }
class Payment {
    private String paymentId;
    private Price amount;
    private PaymentStatus status = PaymentStatus.INITIATED;
    public boolean authorise() {
        this.status = PaymentStatus.AUTHORISED;
        return true;
    }
    public boolean capture() {
        this.status = PaymentStatus.CAPTURED;
        return true;
    }
    public String getPaymentId() { 
		return paymentId; 
	}
    public void setPaymentId(String paymentId) { 
		this.paymentId = paymentId; 
	}
    public Price getAmount() { 
		return amount; 
	}
    public void setAmount(Price amount) { 
		this.amount = amount; 
	}
    public PaymentStatus getStatus() { 
		return status; 
	}
    public void setStatus(PaymentStatus status) { 
		this.status = status; 
	}
}