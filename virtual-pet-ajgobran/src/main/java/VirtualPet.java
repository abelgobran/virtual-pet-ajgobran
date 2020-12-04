import java.util.Scanner;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;
    private String name;
    private int tickTimer;

    public VirtualPet(int hunger, int thirst, int waste, int boredom, int sickness, String name) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
        this.name = name;
        this.tickTimer = 0;

    }
    public void getFun() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose activity: \n play catch \n Take walk \n Belly rub");
        String funChoice = input.nextLine().toLowerCase();

        boredom += funSource(funChoice);
    }

    private int funSource(String funChoice) {
        int play = 7;
        int walk = 4;
        int rub = 6;

        switch (funChoice) {
            case "play catch":
                return play;
            case "take walk":
                return walk;
            case "belly rub":
                return rub;
        }
        return 2;
    }

    public void getWater() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select  a water Source: \n faucet \n river \n purified \n alkaline \n \n Type your response:");
        String waterChoice = input.nextLine().toLowerCase();

        thirst += waterSource(waterChoice);

    }
    public int waterSource(String waterSource){
        int faucet = 3;
        int river = 5;
        int purified = 4;
        int alkaline = 8;

        switch (waterSource) {
            case "faucet":
                return faucet;
            case "river":
                return river;
            case "purified":
                return purified;
            case "alkaline":
                return alkaline;
        }
        return 2;

    }
    public void untick() {
        tickTimer--;
        hunger++;
        thirst++;
        waste++;
        boredom++;
        sickness++;
    }

    public boolean tick() {
        tickTimer++;
        hunger--;
        thirst--;
        waste--;
        boredom--;
        sickness--;



        if (tickTimer > 40) {
            System.out.println("Your pet has went to pet heaven, to live the good life.");
            return false;
        }
        if (hunger <= 0) {
            System.out.println(this.name + " has dies of hunger");
            return false;
        }
        if (thirst <= 0) {
            System.out.println(name + " has died of thirst.");
            return false;
        }
        if (waste <= 0) {
            System.out.println(name + " has died of constipation.");
            return false;

        }
        if (boredom <= 0) {
            System.out.println(name + " has died of boredom.");
            return false;
        }
        if (sickness<= 0) {
            System.out.println(name + " has died from sickness.");
            return false;
        }
            return true;


    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getSickness() {
        return sickness;
    }

    public String getName() {
        return name;
    }

    public int getTickTimer() {
        return tickTimer;
    }
    public void feed(){
        hunger += 3;
        System.out.println(name + " hath eaten!");
    }

   /* public void water() {
        thirst +=3;
        System.out.println(name + " does not longer thirst.");
    }*/

    public void bathroom() {
        waste += 3;
        System.out.println(name + " has used the bathroom.");
    }

    public void fun() {
        boredom += 3;
        System.out.println(name + " is now content.");
    }

    public void cure() {
        sickness += 3;
        System.out.println(name + " no longer has DaRona(covid free)");
    }



}
