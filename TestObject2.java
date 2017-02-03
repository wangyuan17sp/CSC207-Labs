
public class TestObject2 {
    public int value;   // Down there prints 1,1
    public static int value2;
    
    public TestObject2() { 
        value += 1; 
        value2 += 1;
        }
    
    public static void main(String[] args) {
        TestObject2 t = new TestObject2();
        System.out.println("Initial value: " + t.value);
        System.out.println("Initial value2: " + t.value2);
        t = new TestObject2();
        t = new TestObject2();
        t = new TestObject2();
        System.out.println("Final value: " + t.value);
        System.out.println("Finale value2: " + t.value2);
        
    }
}
