import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ServerTest {
    Server server;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;
    Guest guest6;
    Guest guest7;
    ArrayList<String> drinks;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest1 = new Guest("A", 18, 4.0, 80, false, '£', "Beer");
        guest2 = new Guest("B", 20, 50.0, 20, false, '£', "Gin");
        guest3 = new Guest("C", 42, 600.0, 50, true, '£', "Cocktails");
        guest4 = new Guest("D", 16, 20.0, 100, false, '£', "Martini");
        guest5 = new Guest("E", 24, 100.0, 90, false, '$', "Whiskey");
        guest6 = new Guest("Mr.Perfect", 23,888.0,100,false,'£', "Mojito");
        guest7 = new Guest("G", 30, 500.0, 80, false, '£', "Margarita");
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeGuestOver18(){
        boolean result = server.canServeGuest(guest6);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canNotServeGuestUnder18(){
        boolean result = server.canServeGuest(guest4);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canServeGuestWithEnoughMoney(){
        boolean result = server.canServeGuest(guest6);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canNotServeGuestWithoutEnoughMoney(){
        boolean result = server.canServeGuest(guest1);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canServeSoberGuest(){
        boolean result = server.canServeGuest(guest6);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canNotServeDrunkGuest(){
        boolean result = server.canServeGuest(guest2);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void canServeWelcomedGuest(){
        boolean result = server.canServeGuest(guest6);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canNotServeBannedGuest(){
        boolean result = server.canServeGuest(guest3);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void canServeGuestWithLocalCurrency(){
        boolean result = server.canServeGuest(guest6);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canNotServeGuestWithoutLocalCurrency(){
        boolean result = server.canServeGuest(guest5);
        assertThat(result).isEqualTo(false);
    }

    // EXTENSIONS
    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)
    @Test
    public void canServeIfCanMakeFavouriteDrink(){
        boolean result = server.canServeGuest(guest6);
        assertThat(result).isEqualTo(true);
    }

}
