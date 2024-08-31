import com.model.FootballPlayer;
import com.model.TeamManager;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeamManager tm = new TeamManager();
        while(true) {
            System.out.println("""
        ========Football Team Management========
        1.Add player
        2.Display all players in team
        3.Exit the program
        Enter your choice:""");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    try {
                        System.out.print("""
                                ========Add new player========
                                Enter player name:""");
                        sc = new Scanner(System.in);
                        String name = sc.nextLine();
                        System.out.print("Enter player height: ");
                        sc = new Scanner(System.in);
                        float height = sc.nextFloat();
                        System.out.print("Enter player weight: ");
                        sc = new Scanner(System.in);
                        float weight = sc.nextFloat();
                        System.out.print("Enter player age: ");
                        sc = new Scanner(System.in);
                        int age = sc.nextInt();
                        System.out.print("Enter player shirt number: ");
                        sc = new Scanner(System.in);
                        int shirtNumber = sc.nextInt();
                        System.out.print("Enter player position: ");
                        sc = new Scanner(System.in);
                        String position = sc.nextLine();
                        tm.addPlayer(new FootballPlayer(name, height, weight, age, shirtNumber, position));
                    } catch (Exception e) {
                        System.out.println("Error when trying to add player");
                        System.out.println(Arrays.toString(e.getStackTrace()));
                    }
                    break;
                case 2:
                    try {
                        tm.display();
                    } catch (Exception e) {
                        System.out.println("Error displaying all players in team");
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please re-enter");
            }
        }
    }
}
