public class DinnerParty extends Party {
    private int dinner_choice;
    private String desert_choice;

    public void SetDinnerChoice(int dinner_choice){
        this.dinner_choice = dinner_choice;
    }

    public void SetDesertChoice (String desert_choice){
        this.desert_choice = desert_choice;
    }

    public int GetDinner_choice(){return dinner_choice;}

    public String GetDesertChoice(){return desert_choice;}
}

