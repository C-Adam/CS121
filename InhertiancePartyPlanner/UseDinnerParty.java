package InhertiancePartyPlanner;

import javax.swing.*;

public class UseDinnerParty {
    public static void main(String[] args) {

        Party my_party = new Party();

        int guest_amount = Integer.parseInt(JOptionPane.showInputDialog("How many guests are invited?"));

        my_party.SetGuests(guest_amount);

        my_party.DisplayInvitation();

        DinnerParty my_dinner_party = new DinnerParty();
        int dinner_guests = Integer.parseInt(JOptionPane.showInputDialog("How many guests will be attending the dinner?"));
        int dinner_choice = Integer.parseInt(JOptionPane.showInputDialog("What would you like for dinner? 1: Chicken | 2: Veggies"));
        String desert_choice = JOptionPane.showInputDialog("What would you like for Desert?");
        my_dinner_party.SetGuests(dinner_guests);
        my_dinner_party.SetDinnerChoice(dinner_choice);
        my_dinner_party.SetDesertChoice(desert_choice);

        JOptionPane .showMessageDialog(null, "The party has " + my_party.GetGuests() + " guests" + "\n" + "This dinner party has " + my_dinner_party.GetGuests() + " guests" + "\n" +"Dinner choice: " + my_dinner_party.GetDinner_choice() + "\n" +"Desert: " + my_dinner_party.GetDesertChoice() + "\n" + my_dinner_party.DisplayInvitation());
    }
}
