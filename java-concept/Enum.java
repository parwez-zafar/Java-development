
enum Status {
    Running, Failed, Pending, Success;
}

// enum extens enum class

enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), TinkPad(1800);

    private int price;

    private Laptop(int price) { // we are using private constructor here because we are creating the object in the same class
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
}

public class Enum {

    public static void main(String a[]) {
        Status s = Status.Running;
        System.out.println(s.ordinal()); // ordinal gives index

        Status[] s2 = Status.values(); // get all value as an array
        System.out.println(s2[0]);

        // enum with if else and switch

        s = Status.Pending;
        if (s == Status.Running)
            System.out.println("All Good");
        else if (s == Status.Failed)
            System.out.println("Try Again");
        else if (s == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

        switch (s) {
            case Running:
                System.out.println("All Good");

                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }


        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

    }
}
