## JUnit

https://techmaster.vn/posts/36503/junit-5-java-testing-framework-phan-1

https://github.com/EriChannel/JUnit-5-Tutorial
https://techmaster.vn/posts/36507/junit-5-assertions-phan-2



JUnit là một Java testing framework được sử dụng phổ biến trong các dự án Java. JUnit 5 là phiên bản mới nhất của JUnit, nó có một số cải tiến thú vị, với mục tiêu hỗ trợ các tính năng mới từ phiên bản Java 8 trở đi cũng như cho phép nhiều kiểu kiểm thử khác nhau.

## Cài đặt JUnit 5
Hãy thêm đoạn code này vào file pom.xml
```java
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-launcher</artifactId>
    <version>1.6.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.6.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.vintage</groupId>
    <artifactId>junit-vintage-engine</artifactId>
    <version>5.6.0</version>
    <scope>test</scope>
</dependency>
```

## Cấu tạo của JUnit 5
_JUnit 5 = Junit Platform + JUnit Jupiter + JUnit Vintage_
 - **JUnit Platform** đóng vai trò là nền tảng khởi chạy các framework kiểm thử trên JVM. Nó cũng xác định API TestEngine để phát triển framework kiểm thử chạy trên platform. Ngoài ra, nền tảng này còn cung cấp Console Launcher để khởi chạy platform từ command line và trình chạy dựa trên JUnit 4 để chạy bất kỳ TestEngine nào trên nền tàng trong môi trường dựa trên JUnit 4.

   JUnit Platform cũng tồn tại trong các IDE phổ biến (như IntelliJ IDEA, Eclipse, NetBeans, và VS Code) và các công cụ xây dựng (Như Gradle, Maven, Ant)

 - **JUnit Jupite**r là sự kết hợp của mô hình lập trình mới và mô hình mở rộng để viết testcase và phần mở rộng trong JUnit 5. Jupiter sub-project cung cấp một TestEngine để chạy các kiểm thử dựa trên nền tảng này

 - **JUnit Vintage** cung cấp TestEngine để chạy cac kiểm thử dựa trên JUnit 3 và JUnit 4

## Annotations
 - `@Test` – Đặt ở đầu method để thông báo rằng method được dùng để kiểm thử(test method).
 - `@ParameterizedTest` – Test method chạy nhiều lần với các tham số khác nhau.
 - `@RepeatedTest`  - Test method chạy kiểm thử lặp lại n lần.
 - `@TestFactory` – Chỉ định method là một test factory cho các dynamic test.
 - `@TestTemplate` – Chỉ định method là một mẫu cho các test case.
 - `@TestMethodOrder` – Cấu hình thứ tự thực thi cho các @Test.
 - `@TestInstance` – Quy định vòng đời của cho các annotation test class 
 - `@DisplayName` – Đặt tên cho test class hoặc test method.
 - `@DisplayNameGeneration` – Đặt tên cho các test class được generate.
 - `@BeforeEach` – chỉ định 1 method luôn được thực thi trước mỗi test method thực thi.
 - `@AfterEach` – chỉ định 1 method luôn thực thi sau khi 1 test method thực thi xong.
 - `@BeforeAll` – Chỉ định method sẽ được thực thi đầu tiên trong test class.
 - `@AfterAll` – Chỉ định method sẽ được thực thi khi tất cả các test method trong class thực thi xong.
 - `@Disable` – Vô hiệu hoá một test method hay một test class thực thi

## Viết test
![image](https://github.com/EriChannel/JUnit-5-Tutorial/blob/82105980f2a55ce8c0e6dda61ea4fb26c2dc2d84/Images/junit.png)

