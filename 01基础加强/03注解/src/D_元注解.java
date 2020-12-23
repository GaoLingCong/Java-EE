/*import java.lang.annotation.*;* 元注解：用于描述注解的注解

元注解：用于描述注解的注解
     * @Target：描述注解能够作用的位置
     * @Retention：描述注解被保留的阶段
     * @Documented：描述注解是否被抽取到api文档中
     * @Inherited：描述注解是否被子类继承




        * @Target：描述注解能够作用的位置
        * ElementType取值：
        * TYPE：可以作用于类上
        * METHOD：可以作用于方法上
        * FIELD：可以作用于成员变量上


        * @Retention：描述注解被保留的阶段
        * @Retention(RetentionPolicy.RUNTIME)：当前被描述的注解，会保留到class字节码文件中，并被JVM读取到



        * @Documented：描述注解是否被抽取到api文档中


        * @Inherited：描述注解是否被子类继承


        * 在程序使用(解析)注解：获取注解中定义的属性值
        1. 获取注解定义的位置的对象  （Class，Method,Field）
        2. 获取指定的注解
        * getAnnotation(Class)
//其实就是在内存中生成了一个该注解接口的子类实现对象

public class ProImpl implements Pro{
    public String className(){
        return "cn.itcast.annotation.Demo1";
    }
    public String methodName(){
        return "show";
    }
		3. 调用注解中的抽象方法获取配置的属性值
}*/
public class D_元注解 {
}
