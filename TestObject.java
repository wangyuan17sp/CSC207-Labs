
public class TestObject {

    public static int value;
    
    public TestObject() { 
        value += 1; 
        }
    
    public static void main(String[] args) {
        System.out.println(TestObject.value);
        TestObject to = new TestObject();
        System.out.println(TestObject.value);
        
    }
}
