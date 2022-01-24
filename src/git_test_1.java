import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class git_test_1 {

    public static final Logger logger = Logger.getLogger(git_test_1.class.getName());

    public static void main(String[] args) {
        System.out.println("Test 1");
        logger.info("Test with logger");

        phonebook.put("John", 123);
        phonebook.put("Steve", 456);

        logger.info("This show us Map variable: "+phonebook);
        //logger.info("Another way to use logger: {}", phonebook);
    }

    static Map<String,Integer> phonebook=new HashMap<String,Integer>();
}
