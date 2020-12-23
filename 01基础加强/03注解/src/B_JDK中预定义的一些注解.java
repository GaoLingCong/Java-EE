import java.util.Date;
@SuppressWarnings("all")
public class B_JDK中预定义的一些注解 {

/**
 * JDK中预定义的一些注解
 * 		* @Override	：检测被该注解标注的方法是否是继承自父类(接口)的
 * 		* @Deprecated：该注解标注的内容，表示已过时
 * 		* @SuppressWarnings：压制警告
 * 	        常用all
 * 	        右边小红线和小黄线警告 加压制就会消失
 *
 *
 */
    @Override
    public String toString() {
        return super.toString();
    }


    public void  show1(){
        //有缺陷
    }
    public void show(){
        //替代show方法
    }
    public void demoP(){
        show();
        Date date = new Date();
    }
}
