// It states that Interfaces should be such that, subclass should not implement unnecessary function they do not need

public class InterfaceSegmented {
}

interface ResturantEmployee{
    void washDish();
    void serverFood();
    void cookFood();
}

class Waiter implements ResturantEmployee{
    // It have to give/implement the cookFood also which is not its duty
}

class Chef implements ResturantEmployee{
    // It have to give/implement the serverFood also which is not its duty
}