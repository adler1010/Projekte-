import java.util.Scanner;

public class TextAdventureA {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean hasKey = false;
    private static String currentRoom = "Eingang";

    public static void main(String[] args) {
        System.out.println("Willkommen zum Textabenteuer!");
        while (true) {
            switch (currentRoom) {
                case "Eingang":
                    enterRoom("Du bist im Eingang. Du kannst nach Norden gehen.");
                    moveRoom("Norden", "Wohnzimmer");
                    break;
                case "Wohnzimmer":
                    enterRoom("Du bist im Wohnzimmer. Du kannst nach Süden oder Osten gehen.");
                    moveRoom("Süden", "Eingang");
                    moveRoom("Osten", "Schlafzimmer");
                    break;
                case "Schlafzimmer":
                    if (!hasKey) {
                        System.out.println("Du hast einen Schlüssel gefunden!");
                        hasKey = true;
                    }
                    enterRoom("Du bist im Schlafzimmer. Du kannst nach Westen gehen.");
                    moveRoom("Westen", "Wohnzimmer");
                    break;
                default:
                    System.out.println("Unbekannter Raum");
                    break;
            }
        }
    }

    private static void enterRoom(String message) {
        System.out.println(message);
    }

    private static void moveRoom(String direction, String room) {
        System.out.println("Gehe " + direction + " um " + room + " zu betreten.");
        System.out.print("Deine Aktion: ");
        String action = scanner.nextLine();
        if (action.equalsIgnoreCase(direction)) {
            currentRoom = room;
        }
    }
}
