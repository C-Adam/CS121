package InhertiancePartyPlanner;

public class Party {
    public int guests;

    public void SetGuests(int guests){
        this.guests = guests;
    }

    public int GetGuests(){return guests;}

    public String DisplayInvitation(){
        return "Please come to my party!";
    }
}