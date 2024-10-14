
enum Status{
    Running, Failed, Pending, Success;
}

public class Enum {
   
    public static void main(String a[])
    {
        Status s = Status.Running;
        System.out.println(s.ordinal()); // ordinal gives index

        Status[] s2 = Status.values(); // get all value as an array
        System.out.println(s2[0]);
        
    }
}
