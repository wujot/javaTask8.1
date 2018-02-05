import java.util.Scanner;

public class HumanTest {

    public static void main(String[] args) {

        // create array of 3 human elements
        Human[] humans = new Human[3];
        humans[0] = new Human();
        humans[1] = new Human();
        humans[2] = new Human();

        Scanner sc = new Scanner(System.in);

        // prompt user to fill in array with details
        do {
            for (int i = 0; i < humans.length; i++) {
                System.out.println("Give a name of the human: ");
                humans[i].setName(sc.nextLine());
                System.out.println("Give an age of the human: ");
                humans[i].setAge(Integer.parseInt(sc.nextLine()));
            }
        }while (arrayIsEmpty(humans));
    }

    // method to check if array is filled in fully
    public static boolean arrayIsEmpty(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] == null)
                return true;
        }
        return false;
    }
}
