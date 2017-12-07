public class FlipRace
{
    /*
     * Flips two coin until heads comes up 50 times in a row.
     */

    public static void main (String args [])
    {
        final int GOAL = 5;
        int count1 = 0, count2 = 0, totalFlips = 0, count11 = 0, count22 = 0;

        Coin coin1 = new Coin();
        Coin coin2 = new Coin();

        while (count1 < GOAL && count2 < GOAL && count11 < GOAL && count22 < GOAL)
        { 
            coin1.flip();
            coin2.flip();
            totalFlips ++;

            System.out.print("Coin 1: " + coin1);
            System.out.println("\tCoin 2: " + coin2);

            if (coin1.isHeads())
                count1 ++;
            else 
                count1 = 0;
            if (coin2.isHeads())
                count2 ++;
            else 
                count2 = 0;
            if (coin1.isTails())
                count11 ++;
            else 
                count11 = 0;
            if (coin2.isTails())
                count22 ++;
            else 
                count22 = 0;
        }

        if (count1 < GOAL && count11 < GOAL)
            System.out.println ("Coin 2 Wins!");
        else
        if (count2 < GOAL && count22 < GOAL)
            System.out.println ("Coin 1 Wins!");
        System.out.println ("The total number of times each coin was flipped is " + totalFlips);
    }
}