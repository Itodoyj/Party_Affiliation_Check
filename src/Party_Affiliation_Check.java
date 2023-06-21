// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Party_Affiliation_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your party affiliation: ");
        String party = scanner.nextLine().toLowerCase();

        String response;
        if (party.equals("democrat") || party.equals("donkey")) {
            response = "You are affiliated with the Donkey party.";
        } else if (party.equals("republican") || party.equals("elephant")) {
            response = "You are affiliated with the Elephant party.";
        } else if (party.equals("person")) {
            response = "You are a person without party affiliation.";
        } else {
            response = "You are affiliated with another party or your response is unclear.";
        }

        System.out.println(response);

        scanner.close();
    }
}
