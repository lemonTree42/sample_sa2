package p2;

public class Hotel2 {
    private int capacity;

    public Hotel(int capacity) {
        this.capacity = capacity;
    }

    public void bookRoom(int amount) {
        capacity -= amount;
    }

    public int getCapacity() {
        return capacity;
    }
}
