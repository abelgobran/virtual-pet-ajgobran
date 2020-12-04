import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name for your pet..");
        String name = input.nextLine();

        VirtualPet virtualPet = new VirtualPet(20,20,20, 20,20, name);System.out.println("Name: " + virtualPet.getName());
        do {
            System.out.println("hunger: " + virtualPet.getHunger());
            System.out.println("thirst: " + virtualPet.getThirst());
            System.out.println("waste: " + virtualPet.getWaste());
            System.out.println("boredom: " + virtualPet.getBoredom());
            System.out.println("sickness: " + virtualPet.getSickness());

            System.out.println("\n What would you like to do?");
            System.out.println("options: \n 1. Feed.. \n 2. Refill water \n 3. Bathroom break \n 4. play \n 5. Administer Medication ");
            System.out.println("Choose and option: ");
            String action = input.nextLine();



            switch (action) {
                case "1":
                    virtualPet.feed();
                    break;
                case "2":
                    virtualPet.getWater();
                    break;
                case "3":
                    virtualPet.bathroom();
                    break;
                case "4":
                    virtualPet.getFun();
                    break;
                case "5":
                    virtualPet.cure();
                    break;
                default:
                    System.out.println("\n Please enter the number of the choice you would like: \n");
                    virtualPet.untick();

            }
        }while(virtualPet.tick());
    }

}
