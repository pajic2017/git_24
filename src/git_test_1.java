import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class git_test_1 {

    /*constructor without field*/
    public git_test_1(){

    }

    public static final Logger logger = Logger.getLogger(git_test_1.class.getName());

    public static void main(String[] args) {
        System.out.println("Test 1");
        logger.info("Test with logger");

        phonebook.put("John", 123);
        phonebook.put("Steve", 456);
        phonebook.put("Marko",987);
        phonebook.put("Janko",513);
        phonebook.put("Zoran",681);
        logger.info("This show us Map variable: "+phonebook);
    }

    /*private instance variable*/
    static Map<String,Integer> phonebook=new HashMap<String,Integer>();
}
