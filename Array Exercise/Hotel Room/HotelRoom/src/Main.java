import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];
        int studentsLegth = sc.nextInt();
        Students[] st = new Students[studentsLegth];
        //Room r = new Room(new Students("João", "bizinha@gmail.com", 5));


        for (int i = 0; i < studentsLegth; i++) {
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new Room(new Students(name,email,room));
        }

        System.out.println("Busy rooms");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i]!= null){
                System.out.printf("%d: %s, %s \n", i, rooms[i].getStudents().getName(), rooms[i].getStudents().getEmail());
            }

        }
    }


}