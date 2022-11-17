import java.util.ArrayList;
public class Server {

    ArrayList<String> drinks = new ArrayList<>();


    //METHODS
    public boolean canServeGuest(Guest guest){

        if(guest.getAge() < 18){
            return false;
        }
        if(guest.getWallet() < 5.0){
            return false;
        }
        if(guest.getMentalState() < 50){
            return false;
        }
        if(guest.getInBannedList() == true){
            return false;
        }
        if(guest.getCurrency() != '£'){
            return false;
        }
        for(String drink : drinks){
            if(guest.getFavouriteDrink() != drink){
                return false;
            }
        }
        return true;
    }
}
