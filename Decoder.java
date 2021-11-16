public class Decoder {

    public static String messageSwapper (String message) {

        StringBuilder newMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {

            if (letter >= 97 && letter <= 122) {

                letter = (char)(122 - (letter - 97));

            } else if (letter >= 65 && letter <= 90) {

                letter = (char)(90 - (letter - 65));

            }

            newMessage.append(letter);

        }

        return newMessage.toString();

    }

}
