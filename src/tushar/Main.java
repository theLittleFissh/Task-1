package tushar;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    String section;
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("CHOOSE YOUR SECTION :");
        String section=sc.nextLine();
        Info info=new Info();
        System.out.println(info.Name);
        System.out.println("ID : "+info.Id);
        Hobby sok=new Hobby();


        System.out.println("Section : "+section);
        System.out.println("Hobby : "+sok.HobbyName);
    }
}

/*  Name : MD.Ashikur Rahman Tushar
    Id: 2012020135
    Section: C
    Email: tushufish9@gmail.com
    Date: 15th July 2021
 */

