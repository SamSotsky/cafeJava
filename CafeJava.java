public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 7.5;
        double latte = 4.7;
        double cappuccino = 9.8;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sammy";
        String customer3 = "Jimmy";
        String customer4 = "knoah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + dripCoffee); // Displays "Welcome to Cafe Java, Cindhuri"
    	if(isReadyOrder1) {
            System.out.println(customer1 + dripCoffee);
        }
        if(isReadyOrder4) {
            System.out.println(customer4 + dripCoffee);
        }
        if(isReadyOrder3) {
            System.out.println(customer2 + (latte + latte));
        }
        System.out.println(customer3 + (dripCoffee - latte));
    }
}
