import java.lang.reflect.Field;

public class B获取对象成员变量们 {




    /**
     Class对象功能：
     * 获取功能：
     1. 获取成员变量们
     * Field[] getFields()
     * Field getField(String name)

     * Field[] getDeclaredFields()
     * Field getDeclaredField(String name)
     2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>... parameterTypes)

     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
     3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)

     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

     4. 获取类名
     * String getName()
     *
     *
     *
     *
     * Field：成员变量
     * 操作：
     1. 设置值
     * void set(Object obj, Object value)
     2. 获取值
     * get(Object obj)

     3. 忽略访问权限修饰符的安全检查
     * setAccessible(true):暴力反射



     */
    public static void main(String[] args)throws Exception {

        //0.获取Person的Class对象
        Class PersonClass = Person.class;
         /*
             1. 获取成员变量们
                 * Field[] getFields()
                 * Field getField(String name)

                 * Field[] getDeclaredFields()
                 * Field getDeclaredField(String name)

         */
        //1.Field[] getFields()获取所有public修饰的成员变量
        Field[] fields = PersonClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("------------------------------------------");

        //2.Field getField(String name)
        Field a = PersonClass.getField("a");
        //获取成员变量a 的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p,"啊道");
        System.out.println(p);
        System.out.println("===================");


        //Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = PersonClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //Field getDeclaredField(String name)
        Field d = PersonClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);


    }
}
