import java.util.*;

class hmmm {
    String n;
    char g;
    int a;

    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        hmmm hmm = new hmmm();
        System.out.println("Enter your name: ");
        hmm.n = S.nextLine();
        System.out.println("Enter your gender (M/F): ");
        hmm.g = S.next().charAt(0);
        System.out.println("Enter your age: ");
        hmm.a = S.nextInt();

        String k;

        switch (hmm.g) {
            case 'M':
            case 'm':
                if (hmm.a < 21) {
                    k = "boy";
                } else {
                    k = "man";
                }
                break;
            case 'F':
            case 'f':
                if (hmm.a < 21) {
                    k = "girl";
                } else {
                    k = "woman";
                }
                break;
            default:
                k = "invalid";
                break;
        }

        System.out.println(hmm.n + " is a " + k);
    }
}
