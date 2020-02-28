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

        // Creates array for 3 slots
        int[] symslot = new int[3];
        symslot[0] = 0;
        symslot[1] = 0;
        symslot[2] = 0;

        System.out.print("You spinned " + symbol(slot1, symslot, 0));
        System.out.print(symbol(slot2, symslot, 1));
        System.out.println(symbol(slot3, symslot, 2));

        // If 2 match
        if (symslot[0] == symslot[1] || symslot[0] == symslot[2] || symslot[1] == symslot[2] )
        {
            System.out.println("Two of your symbols matched! Use code TWENTY for 20% off at https://preciousbykate.com. ");
        }
        // If 3 match (jackpot)
        else if (symslot[0] == symslot[1] && symslot[1] == symslot[2])
        {
            System.out.println("Congrats, you're a jackpot winner!! Use code FIFTY for 50% off at https://preciousbykate.com.");
        }
        // If no matches
        else
        {
            System.out.println("No matches, but no worries! Use code TEN for 10% off at https://preciousbykate.com. ");
        }
    }

    private static String symbol (int slotnum, int[] symslot, int wheel)
    {
        String output = "";
        // Updates symslot wheel with symbols, assigns number to corresponding symbol
        switch(slotnum)
        {
            case 0:
            case 1:
            case 2:
                // Matches number to corresponding symbol
                output = "☆ ";
                // Assigns number to that symbol
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