class Test {

    // class contents
    void show()
    {
        System.out.println("Test::show() called");
    }
}

public class memory{

    // Driver Code
    public static void main(String[] args)
    {

        // Error here because t
        // is not initialized
        Test t = new Test();
        t.show();
    }
}
