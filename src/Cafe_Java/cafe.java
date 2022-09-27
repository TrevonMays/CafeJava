package Cafe_Java;

public class cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffee = 2.5;
        double latte = 3.7;
        double cappuccino = 2.7;


//                Drinks
        String hotCoffee = "coffee";
        String hotDrink = "latte";


        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
//        // Example:
//        System.out.println(customer1 + readyMessage); // Displays "Cindhuri, your order is ready"
//        if(isReadyOrder1){
//            System.out.printf("%s %s",customer4,readyMessage);
//        }
//        else{
//            System.out.printf(pendingMessage);
//        }
//        System.out.printf("%s %s $%.2f",customer2,displayTotalMessage,latte); // Displays "sam, your order is ready"
//
//        if(isReadyOrder2){
//            System.out.printf("%s %s",customer2,readyMessage);
//        }else{
//          System.out.printf("%s %d",customer4,latte);
//        }

        if(isReadyOrder3){
            System.out.printf("%s sorry you was charged for a %s but was charged %s ",customer3,hotCoffee,hotDrink);
        } else {
            System.out.println((latte - coffee));
        }

        // ** Your customer interaction print statements will go here ** //
    }
}

