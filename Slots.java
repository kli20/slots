// by Kate Li

import java.util.Arrays;

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

        // System.out.print("You spinned ");

        int[] symslot = new int[3];
        symslot[0] = 0;
        symslot[1] = 0;
        symslot[2] = 0;

        System.out.print("You spinned " + symbol(slot1, symslot, 0));
        System.out.print(symbol(slot2, symslot, 1));
        System.out.println(symbol(slot3, symslot, 2));

        // Match slot number to a symbol
        // switch(slot1)
        // {
        //     case 0:
        //     case 1:
        //     case 2:
        //         System.out.print("☆ ");
        //         symslot1 = 1;
        //         break;
        //     case 3:
        //     case 4:
        //         System.out.print("♡ ");
        //         symslot1 = 2;
        //         break;
        //     case 5:
        //     case 6:
        //         System.out.print("✧ ");
        //         symslot1 = 3;
        //         break;
        //     case 7:
        //     case 8:
        //         System.out.print("❀ ");
        //         symslot1 = 4;
        //         break;
        //     case 9:
        //     case 10:
        //         System.out.print("☽ ");
        //         symslot1 = 5;
        //         break;
        // }
        // switch(slot2)
        // {
        //     case 0:
        //     case 1:
        //     case 2:
        //         System.out.print("☆ ");
        //         symslot2 = 1;
        //         break;
        //     case 3:
        //     case 4:
        //         System.out.print("♡ ");
        //         symslot2 = 2;
        //         break;
        //     case 5:
        //     case 6:
        //         System.out.print("✧ ");
        //         symslot2 = 3;
        //         break;
        //     case 7:
        //     case 8:
        //         System.out.print("❀ ");
        //         symslot2 = 4;
        //         break;
        //     case 9:
        //     case 10:
        //         System.out.print("☽ ");
        //         symslot2 = 5;
        //         break;
        // }
        // switch(slot3)
        // {
        //     case 0:
        //     case 1:
        //     case 2:
        //         System.out.println("☆ ");
        //         symslot3 = 1;
        //         break;
        //     case 3:
        //     case 4:
        //         System.out.println("♡ ");
        //         symslot3 = 2;
        //         break;
        //     case 5:
        //     case 6:
        //         System.out.println("✧ ");
        //         symslot3 = 3;
        //         break;
        //     case 7:
        //     case 8:
        //         System.out.println("❀ ");
        //         symslot3 = 4;
        //         break;
        //     case 9:
        //     case 10:
        //         System.out.println("☽ ");
        //         symslot3 = 5;
        //         break;
        // }

        // System.out.println("Your symslot is " + symslot1 + " " + symslot2 + " " + symslot3);

        // If 2 match
        if (symslot[0] == symslot[1] || symslot[0] == symslot[2] || symslot[1] == symslot[2] )
        {
            System.out.println("Two of your symbols matched! Use code __ for 20% off");
        }
        // If 3 match (Jackpot)
        else if (symslot[0] == symslot[1] && symslot[1] == symslot[2])
        {
            System.out.println("Jackpot winner!! 50% off");
        }
        // No matches
        else
        {
            System.out.println("No matches :( 10% off");
        }

    }

    private static String symbol (int slotnum, int[] symslot, int wheel)
    {
        String output = "";
        // update symslot wheel with symbols, assigns number to corresponding symbol
        switch(slotnum)
        {
            case 0:
            case 1:
            case 2:
                output = "☆ ";
                symslot[wheel] = 1;
                break;
            case 3:
            case 4:
                output = "♡ ";
                symslot[wheel] = 2;
                break;
            case 5:
            case 6:
                output = "✧ ";
                symslot[wheel] = 3;
                break;
            case 7:
            case 8:
                output = "❀ ";
                symslot[wheel] = 4;
                break;
            case 9:
            case 10:
                output = "☽ ";
                symslot[wheel] = 5;
                break;
        }
        return output;
    }
}