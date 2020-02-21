// by Kate Li

// import java.util.Scanner;

public class Slots
{
    public static void main (String[] args)
    {
        System.out.println("Spin to win a coupon! ");
        // Generates 3 random numbers that will correspond with a slot
        int slot1 = (int) Math.round(Math.random() * 10);
        int slot2 = (int) Math.round(Math.random() * 10);
        int slot3 = (int) Math.round(Math.random() * 10);

        System.out.println("You spinned " + slot1 + " " + slot2 + " " + slot3);

        System.out.print("You spinned ");
        // Match slot number to a symbol

        int symslot1 = 0;
        int symslot2 = 0;
        int symslot3 = 0;

        switch(slot1)
        {
            case 0:
            case 1:
            case 2:
                System.out.print("☆ ");
                symslot1 = 1;
                break;
            case 3:
            case 4:
                System.out.print("♡ ");
                symslot1 = 2;
                break;
            case 5:
            case 6:
                System.out.print("✧ ");
                symslot1 = 3;
                break;
            case 7:
            case 8:
                System.out.print("❀ ");
                symslot1 = 4;
                break;
            case 9:
            case 10:
                System.out.print("☽ ");
                symslot1 = 5;
                break;
        }
        switch(slot2)
        {
            case 0:
            case 1:
            case 2:
                System.out.print("☆ ");
                symslot2 = 1;
                break;
            case 3:
            case 4:
                System.out.print("♡ ");
                symslot2 = 2;
                break;
            case 5:
            case 6:
                System.out.print("✧ ");
                symslot2 = 3;
                break;
            case 7:
            case 8:
                System.out.print("❀ ");
                symslot2 = 4;
                break;
            case 9:
            case 10:
                System.out.print("☽ ");
                symslot2 = 5;
                break;
        }
        switch(slot3)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("☆ ");
                symslot3 = 1;
                break;
            case 3:
            case 4:
                System.out.println("♡ ");
                symslot3 = 2;
                break;
            case 5:
            case 6:
                System.out.println("✧ ");
                symslot3 = 3;
                break;
            case 7:
            case 8:
                System.out.println("❀ ");
                symslot3 = 4;
                break;
            case 9:
            case 10:
                System.out.println("☽ ");
                symslot3 = 5;
                break;
        }

        System.out.println("Your symslot is " + symslot1 + " " + symslot2 + " " + symslot3);

    // count how many slots have a match (several possible numbers)
    // If no matches
    // if (symslot1 == syms )
    // If 2 match

    // If 3 match (Jackpot)
    // if slot1 = 0, 1, 2 MATCHES with slot2 = 0, 1, 2, MATCHES with slot3 = 0, 1, or 2
    }
}