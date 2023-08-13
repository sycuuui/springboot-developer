import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll
    static void beforeALl(){
        System.out.println("@BeforeALl");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test1");
    }
    @Test
    public void test3(){
        System.out.println("test1");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }
}
