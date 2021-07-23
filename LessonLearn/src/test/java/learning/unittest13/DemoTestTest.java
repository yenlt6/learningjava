//package learning.unittest13;
//
//import junit.framework.TestCase;
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DisplayName("JUnit5Example")
//public class DemoTestTest extends TestCase {
//    //@BeforeAll dùng để chỉ định test method chạy đầu tiên
//    //Nó phải được đặt là phương thức tĩnh (static), nếu không chương trình sẽ không biên dịch được
//    @BeforeAll
//    static void setup() {
//        System.out.println("BeforeAll");
//    }
//
//    //@BeforeEach chỉ định 1 method sẽ luôn được thực thi trước mỗi test method thực thi
//    @BeforeEach
//    public void beforeEach() {
//        System.out.println("BeforeEach");
//    }
//
//    //@AfterAll Chỉ định method sẽ được thực thi khi tất cả các test method trong class thực thi xong
//    //Nó phải được đặt trên static method
//    @AfterAll
//    public static void afterAll() {
//        System.out.println("AfterAll");
//    }
//
//    //@AfterEach Chỉ định 1 method luôn thực thi sau khi 1 test method thực thi xong
//    @AfterEach
//    public void afterEach() {
//        System.out.println("AfterEach");
//    }
//
//    @Test
//    @DisplayName("My test method")
//    public void test() {
//        System.out.println("Test");
//    }
//
//    //disable() method không được thực thi vì bị ngắn chặn bởi @Disabled
//    @Test
//    @Disabled
//    public void disable() {
//        System.out.println("disable");
//    }
//
//}