package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // Target의 기능은 어노테이션을 붙일 수 있는 대상을 지정하는 것이다. // 위의 매개 변수로 TYPE / CONSTRUCTOR / METHOD / FIELD // 주었다. CONSTRUCTOR / METHOD / FIELD 3 가지는 이름 그대로 // 생성자와 메소드 필드에 어노테이션을 붙일 수 있다는 의미이며, // TYPE 는 클래스,인터페이스,열거타입에 어노테이션을 붙일 수 있다는 의미이다.
@Retention(RetentionPolicy.RUNTIME) // 어느 시점까지 어노테이션의 메모리를 가져갈 지 설정
@Documented // 해당 어노테이션을 javadoc에 포함시킴
public @interface MyIncludeComponent {
}
