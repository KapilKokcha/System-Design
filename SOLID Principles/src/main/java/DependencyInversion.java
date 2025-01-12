// class should depend on interfaces rather than concert class
public class DependencyInversion {
}

//class WirelessKeyboard{
//
//}

interface Keyboard{

}

class WirelessKeyboard implements Keyboard{

}

class MacBook{
//  WirelessKeyboard wirelessKeyboard; // It should not depend directly on concert class
    private final Keyboard keyboard;
    public MacBook(Keyboard keyboard){
        this.keyboard=keyboard;
    }
}