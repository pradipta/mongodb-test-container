import com.github.pradipta.container.mongo.MongoDBContainer;
import org.junit.Assert;
import org.junit.Test;

public class MongoDBContainerTest {
    private final MongoDBContainer container = new MongoDBContainer();
    @Test
    public void test() {
        container.start();
        Assert.assertTrue(container.isRunning());
    }
}
