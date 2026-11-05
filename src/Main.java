import java.util.Scanner;

public class Main {
    public static void main(String) {
        Scanner input = new Scanner(System.in);
        int people;
        int maxPoints;
        Players player;

        System.out.println("Enter the number of people that will be playing the game: ");
        people = input.nextInt();
        System.out.println("Enter the maximum amount of points that you would like to go to: ");
        maxPoints = input.nextInt();
    }

    /**
     * gets the number of player inputted by user
     * @return number of players
     */
    public int getNumberOfPlayers()
    {
        return people;
    }

    /**
     * Gets the number of points that the players will go to.
     * @return max points
     */
    public int getMaxPoints()
    {
        return maxPoints;
    }

    /**
     * The return on this depends on the toString in class Players
     */
    public class displayPlayerStats(Players player)
    {
        return Players.toString;
    }
}