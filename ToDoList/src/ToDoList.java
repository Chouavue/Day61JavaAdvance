import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> list;

    public ToDoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }
    public void print(){
       int count =0 ;
       for (String wordList : this.list){
           count++;
           System.out.println(count + ":" + wordList);
       }
    }
    public void remove (int number){
        this.list.remove(number -1);
    }
}
