package WorldWanderer;

//Author: Avanthi Nannegari (s4137277)

import java.util.ArrayList;
import java.util.List;

class Review {
    private String reviewId;
    private int rating;        
    private String comment;
    private String createdAt;
    public void edit(String text) { 
        comment = text; 
    }
    public int stars() { 
        return rating; 
    }
    public String getComment() { 
        return comment; 
    }   public void setComment(String v) { 
        comment = v;
    }
    public int getRating() { 
        return rating; 
    }
}

class ReviewService {
    private boolean moderationEnabled = true;
    private int minWords = 5;
    private final List<Review> store = new ArrayList<>();

    public Review create(User user, Airline target, int rating, String text) {
        Review r = new Review();
        store.add(r);
        return r;
    }

    public List<Review> listForAirline(String code) { 
        return new ArrayList<>(store); 
    }
    public boolean isModerationEnabled() { 
        return moderationEnabled;
    }
    public void setModerationEnabled(boolean v) { 
        moderationEnabled = v; 
    }
}