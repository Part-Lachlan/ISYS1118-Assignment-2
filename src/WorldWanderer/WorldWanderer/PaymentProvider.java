package WorldWanderer;

//Author: Lachlan Partridge (s4103594)

public class PaymentProvider() {
    private String token;

    publice getToken() { return token; }

    public void generateToken() {
        // Simulate token generation
        token = "sample_token_12345";
        }

    public boolean processPayment(int amount) {
        // Simulate payment processing
        return true; // Assume payment is always successful for this simulation
    }
    
    public void sendInvoice(String email, int amount) {
        // Simulate sending an invoice
        System.out.println("Invoice sent to " + email + " for amount: $" + amount);
    }
}