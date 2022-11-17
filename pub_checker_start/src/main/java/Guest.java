
public class Guest {

    private String name;
    private int age;
    private double wallet;
    private int mentalState;
    private boolean inBannedList;
    private char currency;
    private String favouriteDrink;

    // CONSTRUCTOR
    public Guest(String name, int age, Double wallet, int mentalState, boolean inBannedList, char currency, String favouriteDrink){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.mentalState = mentalState;
        this.inBannedList = inBannedList;
        this.currency = currency;
        this.favouriteDrink = favouriteDrink;
    }

    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void setWallet(double wallet){
        this.wallet = wallet;
    }

    public int getMentalState(){
        return this.mentalState;
    }

    public void setMentalState(int mentalState){
        this.mentalState = mentalState;
    }

    public boolean getInBannedList(){
        return this.inBannedList;
    }

    public void setInBannedList(boolean inBannedList){
        this.inBannedList = inBannedList;
    }

    public char getCurrency(){
        return this.currency;
    }

    public void setCurrency(char currency){
        this.currency = currency;
    }

    public String getFavouriteDrink(){
        return this.favouriteDrink;
    }

    public void setFavouriteDrink(String favouriteDrink){
        this.favouriteDrink = favouriteDrink;
    }
}
