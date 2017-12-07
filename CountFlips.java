
public class CountFlips
{
    /**
     * flips a coin multiple times and counts the number of heads and tails that results
     */
    public static void main (String [] args)
    {
        final int NUM_FLIPS = 1000;
        int heads = 0, tails = 0;

        Coin myCoin = new Coin();

        for ( int count = 1; count <= NUM_FLIPS; count ++)
        { 
            myCoin.flip();

            if (myCoin.isHeads())
                heads++;
            else 
                tails++;
            System.out.println (myCoin);
        }

        System.out.println ("The number of flips: " + NUM_FLIPS);
        System.out.print  ("The number of heads: " + heads);
        System.out.println ("\tThe number of tails: " + tails);
        
    }
}