import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        clearScreen();
        int n = 29;
        char[] arr = new char[n];
        // char[] availableChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_', '-',
        //                          'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        //                          'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        //                          'Y', 'Z', 
        //                          'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        //                          'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        //                          'y', 'z'};

        char[] availableChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-',
                                 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                                 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                                 'Y', 'Z', 
                                 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                                 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                                 'y', 'z'};


        /*
         * Reference: https://stackoverflow.com/a/363692
         */
        for (int i=0; i<n; ++i) {
            arr[i] = availableChars[ThreadLocalRandom.current().nextInt(0, availableChars.length)];
            System.out.print(arr[i]);
        }
        System.out.println();


        endLine();
    }

    public static void clearScreen() {
        System.out.print("\033\143");
        System.out.flush();
    }

    public  static void endLine() {
        System.out.println("============================================================");
    }
}
