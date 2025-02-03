// ControlFlow/SwitchCase.java

public class SwitchCase {
    public static void main(String[] args) {
        int day = 3; // 1 = Monday, 2 = Tuesday, etc.

        // Using switch-case to determine the day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Switch-case with strings (Java 7 and above)
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("You chose an Apple.");
                break;
            case "Banana":
                System.out.println("You chose a Banana.");
                break;
            case "Orange":
                System.out.println("You chose an Orange.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }
    }
}
