package Chapter_12.TowersOfHanoi;

//********************************************************************
//  TowersOfHanoi.java       Author: Lewis/Loftus
//
//  Represents the classic Towers of Hanoi puzzle.
//********************************************************************

public class TowersOfHanoi
{
    private int totalDisks;

    //-----------------------------------------------------------------
    //  Sets up the puzzle with the specified number of disks.
    //-----------------------------------------------------------------
    public TowersOfHanoi(int disks)
    {
        totalDisks = disks;
    }

    //-----------------------------------------------------------------
    //  Performs the initial call to moveTower to solve the puzzle.
    //  Moves the disks from tower 1 to tower 3 using tower 2.
    //-----------------------------------------------------------------
    public void solve()
    {
        moveTower(totalDisks, 1, 3, 2);
    }

    //-----------------------------------------------------------------
    //  Moves the specified number of disks from one tower to another
    //  by moving a subtower of n-1 disks out of the way, moving one
    //  disk, then moving the subtower back. Base case of 1 disk.
    //-----------------------------------------------------------------
    
    // To move n disks:
    // 1. Move n-1 disks out of the way.
    // 2. Move the largest disk to its destination.
    // 3. Move the n-1 disks onto the largest disk.
    private void moveTower(int numDisks, int start, int end, int temp)
    {
        // If there is only one disk, just move it to where it needs to go
        // For example, if we call moveTower(1,1,3,2), we would call moveOneDisk(1,3)
        if (numDisks == 1) {
            moveOneDisk(start, end);
        }
        // Otherwise, there is more than one disk, so we need to break
        // the problem into smaller problems.
        else
        {
            // First, move the top n-1 disks from start to temp.
            // We use end as the temporary tower during this process.
            moveTower(numDisks - 1, start, temp, end);

            // Now that the top n-1 disks are out of the way,
            // move the remaining (largest) disk from start to end.
            moveOneDisk(start, end);

            // Finally, move the n-1 disks from temp to end.
            // We use start as the temporary tower during this process.
            moveTower(numDisks - 1, temp, end, start);
        }
    }

    //-----------------------------------------------------------------
    //  Prints instructions to move one disk from the specified start
    //  tower to the specified end tower.
    //-----------------------------------------------------------------
    private void moveOneDisk(int start, int end)
    {
        System.out.println("Move one disk from " + start + " to " +
                end);
    }
}
