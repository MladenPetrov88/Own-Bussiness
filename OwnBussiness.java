import java.util.Scanner;

public class OwnBussiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int roomSpace = width * lenght * height;

        while (!input.equals("Done")){
            int counts = Integer.parseInt(input);
            roomSpace = roomSpace - counts;
            if (roomSpace <= 0){
                int spaceNeed = Math.abs(roomSpace);
                System.out.printf("No more free space! You need %d Cubic meters more.", spaceNeed);
                break;
            }
            input = scanner.nextLine();
            if (input.equals("Done")){
                System.out.printf("%d Cubic meters left.", roomSpace);
            }
        }
    }
}
