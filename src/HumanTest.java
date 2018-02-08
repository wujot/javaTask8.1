import java.util.Scanner;

public class HumanTest {

    public static void main(String[] args) {

        // create array of 3 human elements
        Human[] humans = new Human[3];
        humans[0] = null;
        humans[1] = null;
        humans[2] = null;

        Scanner sc = new Scanner(System.in);

        do {
            for (int i = 0; i < humans.length; i++) {
                Human temp = new Human();
            System.out.println("Give a name of the human: ");
            temp.setName(sc.nextLine());
            System.out.println("Give an age of the human: ");
            temp.setAge(Integer.parseInt(sc.nextLine()));
                for (int j = 0; j < humans.length; j++) {
                    if (temp.equals(humans[j])) {
                        System.out.println("Object already exist.");
                        break;
                    } else {
                        humans[i] = temp;
                        break;
                    }
                }
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
