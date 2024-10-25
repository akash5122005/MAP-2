import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       HashMap<String, String> phonebook = new HashMap<>();

       int n = scanner.nextInt();
       scanner.nextLine();

       for(int i = 0; i < n; i++){
        String name = scanner.next();
        String phoneNumber = scanner.next();
        phonebook.put(name, phoneNumber);
       }

        String searchName = scanner.next();
        if(phonebook.containsKey(searchName)){
            System.out.println(searchName + ": " + phonebook.get(searchName));
        } else {
            System.out.println(searchName+ " not found");
        }
       
        scanner.close();
    }
}
