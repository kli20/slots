// by Kate Li

// import java.util.Scanner;

public class Slots
{
    public static void main (String[] args)
    {
        System.out.println("Spin to win a coupon! ");
        int slot1 = (int) Math.round(Math.random() * 10);
        int slot2 = (int) Math.round(Math.random() * 10);
        int slot3 = (int) Math.round(Math.random() * 10);

        System.out.print("You spinned ");
        // Match slot number to a symbol
        switch(slot1)
        {
            case 1:
            case 2:
                System.out.print("☆ ");
                break;
            case 3:
            case 4:
                System.out.print("♡ ");
                break;
            case 5:
            case 6:
                System.out.print("✧ ");
                break;
            case 7:
            case 8:
                System.out.print("❀ ");
                break;
            case 9:
            case 10:
                System.out.print("☽ ");
                break;
        }
        switch(slot2)
        {
            case 1:
            case 2:
                System.out.print("☆ ");
                break;
            case 3:
            case 4:
                System.out.print("♡ ");
                break;
            case 5:
            case 6:
                System.out.print("✧ ");
                break;
            case 7:
            case 8:
                System.out.print("❀ ");
                break;
            case 9:
            case 10:
                System.out.print("☽ ");
                break;
        }
        switch(slot3)
        {
            case 1:
            case 2:
                System.out.println("☆ ");
                break;
            case 3:
            case 4:
                System.out.println("♡ ");
                break;
            case 5:
            case 6:
                System.out.println("✧ ");
                break;
            case 7:
            case 8:
                System.out.println("❀ ");
                break;
            case 9:
            case 10:
                System.out.println("☽ ");
                break;
        }

    }
}