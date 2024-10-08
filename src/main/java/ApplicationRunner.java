import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.gubern.database.pool.ConnectionPool;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean(ConnectionPool.class));
    }
}
