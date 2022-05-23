import java.util.Scanner;

public class UserInterface {
    private ToDoList list;
    private Scanner scanner;

    public UserInterface(ToDoList list, Scanner scanner){
        this.list = list;
        this.scanner= scanner;
    }
    public void start (){
        while(true){
            System.out.println("Command: ");
            String input = this.scanner.next();

            if(input.equals("stop")){
                break;
            }
            if(input.equals("add")){
                System.out.print("To Add: ");
                String word = this.scanner.nextLine();
                list.add(word);
                continue;
            }else if (input.equals("list")){
                this.list.print();
            }else if (input.equals("remove")){
                System.out.print("Which one is removed?");
                int removeNum = Integer.valueOf(scanner.nextLine());

                list.remove(removeNum);

            }
        }
    }
}
