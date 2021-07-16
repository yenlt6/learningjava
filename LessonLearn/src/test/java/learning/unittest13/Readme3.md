Trong bài viết này chúng ta sẽ khám phá AssertJ - một opensource - thư viện điều khiển được sử dụng để viết các assertions trong Java tests

## Giới thiệu về AssertJ

AssertJ là một thư viện để đơn giản hóa việc viết các assertions. Nó cũng cải thiện khả năng đọc các câu lệnh assertion. AssertJ có fluent interface cho assertions, giúp bạn dễ dàng viết code. Method cơ sở cho các AssertJ là assertThat.

* * *

## Cài đặt AssertJ trong dự án Maven

Để sử dụng AssertJ, bạn cần thêm dependency của JUnit và file pom.xml

```java
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.4.1</version>
    <scope>test</scope>
</dependency>

```

Dependency này chỉ bao gồm các assertions Java cơ bản. Nếu bạn muốn sử dụng assertion nâng cao, bạn sẽ phải thêm modules bổ sung riêng

* * *

## Sử dụng AssertJ

### Viết assertions

Để viết assertions, bạn luôn cần bắt đầu bằng cách chuyển object của mình tới phương thức assertThat() và thực hiện theo các assertions thực tế.

```java
assertThat(anyReferenceOrValue);

```

Để bắt đầu, ta cần import:

```java
import static org.assertj.core.api.Java6Assertions.assertThat;

```

Ví dụ:

```java
@Test
@DisplayName("TestAssertJ")
void sampleAssertion(){
    assertThat("This is my sample Test").isNotNull()
            .startsWith("This")
            .contains("sample")
            .endsWith("Test");
}

```

Result:

![](https://techmaster.vn/media/static/bq0a8rs51co78aldi4p0/c2o6ejs51cofhqf7v5q0)

### Object Assertions

Các đối tượng có thể được so sánh theo nhiều cách khác nhau hoặc để xác định hai object là bằng nhau

Ví dụ mình có:

```java
public class Dog {
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}

```

Giờ hãy thử so sánh hai đối tượng sau

```java
@Test
@DisplayName("TestObject")
void testMethod_Objects(){
    Dog mic = new Dog("Mic", 10.5);
    Dog micClone = new Dog("Mic", 10.5);

    //Test will fail as isEqualTo() compares object reference
    assertThat(mic).isEqualTo(micClone);
}

```

Tại đây mình sử dụng _**isEqualTo()**_ để so sánh hai object là _**mic**_ và _**micClone**_. Tuy nhiên test không thành công bởi isEqualTo() so sánh các tham chiếu đối tượng chứ không so sánh nội dung

![](https://techmaster.vn/media/static/bq0a8rs51co78aldi4p0/c2ob4s451cofhqf7v5r0)

Thay vào đó nếu chúng ta muốn so sánh nội dung của chúng, chúng ta có thể sử dụng _**isEqualToComparingFieldByFieldRecursenty()**_:

```java
assertThat(mic).isEqualToComparingFieldByFieldRecursively(micClone);

```

Hoặc nếu chỉ muốn so sánh một thuộc tính ta có thể sử dụng _**isEqualToComparingOnlyGivenFields()**_

```java
@Test
@DisplayName("TestObject")
void testMethod_Objects(){
    Dog mic = new Dog("Mic", 10.5);
    Dog otherDog = new Dog("Mic", 15.5);

    //Only compare name
    assertThat(mic).isEqualToComparingOnlyGivenFields(otherDog, "name");
}

```

Ở đây mình chỉ so sánh thuộc tính name

## Array Assertions

Đối với mảng, có nhiều cách để khẳng định rằng nội dung của chúng tốn tại. Một trong những assertions phổ biến nhất là kiểm tra xem mảng có chứa phần tử đã cho hay không

```java
@Test
@DisplayName("TestArray")
void testMethod_Arrays(){
    String [] countries = new String[]{"Russia", "Viet Nam", "America", "Japan", "China"};
    assertThat(countries).contains("Viet Nam");
}

```

Hoặc nếu mảng không trống:

```java
assertThat(countries).isNotEmpty();

```

Hoặc nếu mảng bắt đầu với một phần tử nhất định:

```java
assertThat(countries).startsWith("Russia");

```

Hoặc kết hợp nhiều assertions:

```java
assertThat(countries).isNotEmpty() //Array is not empty
        .contains("Viet Nam")      //contains "Viet Nam" element
        .doesNotContainNull()      //does not contains any nulls
        .containsSequence("America", "Japan");  //contains sequence of element "America", "Japan"

```

### Strings Assertions

Có nhiều assertions phổ biến đối với chuỗi, hãy xem ví dụ sau:

```java
@Test
@DisplayName("TestStrings")
void testMethod_Strings(){
    String say = "Chị không muốn nhiêu bug nhưng mà bug nhiều nên chị phải fix";

    assertThat(say).isNotNull()     //String is not empty
            .startsWith("Chị")      //Start with "Chị
            .doesNotContain("Anh")  //Not contain "Anh"
            .endsWith("fix");       //End with "fix"
}

```

Ở đây mình kết hợp nhiều assertion với nhau bao gồm _**isNotNull()**_ để kiểm tra chuỗi có null không, _**startsWith()**_ chuỗi bắt đầu với từ “Chị”, _**doesNotContain()**_ không chứa từ “Anh”, _**endsWith()**_ chuỗi kết thúc bằng từ “fix”

Ngoài ra, chúng ta còn có thể so sánh với _**isEqualTo()**_

```java
String say = "Chị không muốn nhiêu bug nhưng mà bug nhiều nên chị phải fix";
String sayClone = say;

assertThat(say).isEqualTo(sayClone);

```

### Numbers Assertions

Number Assertion nhằm so sánh các giá trị số trong hoặc không có khoảng chênh lệch nhất định. Ví dụ, nếu bạn muốn kiểm tra xem hai giá trị có bằng nhau theo một độ chính xác nhất định hay không, chúng ta có thể thực hiện như sau:

```java
@Test
@DisplayName("TestNumbers")
void testMethod_Numbers(){
    Double value = 12.0;
    assertThat(value).isEqualTo(12.2, withPrecision(1d));
}

```

Tại đây ta có độ chính xác là 1.

Hoặc có offset

```java
assertThat(value).isCloseTo(15.0, Offset.offset(3d));

```

Hoặc value nằm trong một khoảng, ví dụ:

```java
assertThat(value).isBetween(10.0, 15.0); //value >= 10.0 and value <= 15.0

```

Hoặc

```java
assertThat(value).isStrictlyBetween(10.0, 15.0); //value > 10.0 and value < 15.
```

* * *

### Map Assertions

Map Assertions cho phép bạn kiểm tra xem map có chứa entry, tập hợp các entry, hoặc key/values riêng biệt hay không

Ví dụ dưới đây liệt kê một số assertions chúng ta hay sử dụng đối với Map:

```java
@Test
@DisplayName("TestMap")
void testMethod_Map(){
    Map<String, String> countryCityMap = new HashMap<String, String>();
    countryCityMap.put("Viet Nam", "Ha Noi");
    countryCityMap.put("Japan", "Tokyo");
    countryCityMap.put("Canada", "Ottawa");
    countryCityMap.put("Australian", "Canberra");

    assertThat(countryCityMap).isNotEmpty()          //Map is not empty
            .hasSize(4)                              //Size = 4
            .doesNotContainValue("Sydney")           //Does not contain value "Sydney"
            .contains(entry("Viet Nam", "Ha Noi"))   //Contain ("Viet Nam", "Ha Noi")
            .containsKey("Japan")                    //Contains key "Japan"
            .containsValue("Ottawa");                //Contains value Ottawa
}
```

* * *

### Throwable assertions

Throwable assertions cho phép kiểm tra các message của ngoại lệ, stack trade, kiểm tra nguyên nhân hoặc xác minh nếu một ngoại lệ được đưa ra

Ví dụ:

```java
@Test
@DisplayName("TestThrowable")
void testMethod_Throwable(){
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("This is error message");
    IllegalArgumentException illegalArgumentExceptionWithCause = new IllegalArgumentException("This is error message", new IOException());

    assertThat(illegalArgumentException).hasNoCause()
            .hasMessageStartingWith("T")
            .hasMessageEndingWith("e");
    assertThat(illegalArgumentExceptionWithCause).hasCauseExactlyInstanceOf(IOException.class);
}
```

* * *

### Class Assertions và miêu tả Assertions

Class Assertion chủ yếu thực hiện các việc kiểm tra các trường, method, có annotation hay không, có là interface, có là lớp final,…

Chúng ta có thể tạo ra các mô tả cho assertions của mình với phương thức _as()_

```java
@Test
@DisplayName("TestThrowable")
void testMethod_Class(){
    Dog mic = new Dog("Mic", 10.5);
    assertThat(Dog.class).isNotAnnotation()
            .isNotFinal()
            .hasDeclaredFields("name")
            .hasDeclaredFields("weight");
    assertThat(mic.getWeight()).as("%d's weight need to be more than 0", mic.getName())
            .isGreaterThan(0);
}
```