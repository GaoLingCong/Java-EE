package C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class _02_C3PO演示2 {
    public static void main(String[] args) throws SQLException {
        //1.1获取DataSource 使用指定名称配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        //获取连接
        for (int i = 1; i < 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);
        }
    }
}
