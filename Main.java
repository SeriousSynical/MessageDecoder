import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialization
        boolean flag;

        String replay = "Yes";
        
        String message = null;
        Scanner keyboard = new Scanner(System.in);
        
        do {

            // Prompt User Input
            flag = true;
            do {

                try {

                    System.out.print("Input message: ");
                    message = keyboard.nextLine();
                    flag = false;

                } catch (Exception e) {

                    System.out.println("Invalid input.");

                }

            } while (flag);

            // Output Message
            System.out.println("New Message: " + Decoder.messageSwapper(message));

            // Prompt Replay
            flag = true;
            do {

                try {

                    System.out.print("Would you like to encrypt/decode another message?: ");
                    replay = keyboard.nextLine();
                    if (!(replay.toLowerCase().charAt(0) == 'y' || replay.toLowerCase().charAt(0) == 'n')) {

                        System.out.println("Invalid Input.");

                    } else {

                        flag = false;

                    }

                } catch (Exception e) {

                    System.out.println("Invalid Input.");

                }

            } while (flag);

        } while (replay.toLowerCase().charAt(0) == 'y');

    }
}
