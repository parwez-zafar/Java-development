import java.util.*;

public class MyMap {
    public static void main(String a[]){
        Map<String, Integer> students = new HashMap<>();
        
        students.put("Parwez", 50);
        students.put("name2", 55);
        students.put("name3", 515);

        students.put("name3", 30);
        System.out.println(students);
        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
        
    }
    
}
