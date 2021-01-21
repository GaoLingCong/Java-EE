package 综合运用编写简单测试框架;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)////描述注解被保留的阶段 三个阶段之一运行阶段
@Target(ElementType.METHOD)////ElementType描述注解能够作用的位置 METHOD：可以作用于方法上
public @interface Check {
}
