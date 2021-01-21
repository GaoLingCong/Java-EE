public  @interface MyAnno {

    int value();
    Person per();
    MyAnno2 anno2();
    String strs();
    String name() default "张三";


}
