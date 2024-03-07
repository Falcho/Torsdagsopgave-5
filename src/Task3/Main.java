package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room bathroom = new Room(2, 3, 1);
        Room entrance = new Room(3, 2, 0);
        Room livingRoom = new Room(2, 1, 3);
        Room schoolKitchen = new Room(4,12,6);

        ArrayList<Room> numberOfRooms = new ArrayList<>();
        numberOfRooms.add(bathroom);
        numberOfRooms.add(entrance);
        numberOfRooms.add(livingRoom);
        numberOfRooms.add(schoolKitchen);

        Building school = new Building(numberOfRooms, 1, 1, true);

        System.out.println("Total amount of lamps in building: "+countLampsInBuilding(school));
    }

    private static int countLampsInBuilding(Building building) {
        int counter = 0;
        for (Room room : building.getNumberOfRooms()) {
             counter += room.getNumberOfLamps();
        }
        return counter;
    }



    }



