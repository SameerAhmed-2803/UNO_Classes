public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setExits(Room n, Room e, Room w, Room s) {
        this.north = n;
        this.east = e;
        this.west = w;
        this.south = s;
    }

    public String getExits() {
        String dir = "";
        if (north != null)
            dir += "[N]orth: " + north.getName() + "\n";
        if (east != null)
            dir += "[E]ast: " + east.getName() + "\n";
        if (west != null)
            dir += "[W]est: " + west.getName() + "\n";
        if (south != null)
            dir += "[S]outh: " + south.getName() + "\n";
        return dir;
    }

    public String getName() {
        return this.name;
    }

    public Room getNorth() {
        return this.north;
    }

    public Room getEast() {
        return this.east;
    }

    public Room getWest() {
        return this.west;
    }

    public Room getSouth() {
        return this.south;
    }

    @Override
    public String toString() {
        return "[" + name + "]\n" + description + "\n" + getExits();
    }
}
