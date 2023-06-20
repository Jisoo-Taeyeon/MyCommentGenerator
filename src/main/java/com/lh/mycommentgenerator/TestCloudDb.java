package com.lh.mycommentgenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Lihu
 * @PROJECT_NAME: distributedLearning
 * @DESCRIPTION:
 * @USER: Irene-Jisoo
 * @DATE: 2023/2/7 14:55
 */
public class TestCloudDb {
    public static void main(String []args) {
        //创建数据库连接对象并置为null
        Connection con = null;

        //创建驱动程序名
        String driver = "com.mysql.cj.jdbc.Driver";

        //url指向数据库
        String url = "jdbc:mysql://1.15.121.102/cloudb";//String url = "jdbc:mysql://服务器ip/数据库名";


        //mysql用户名
        String user = "Irene";//String user = 数据库用户名;


        //mysql密码
        String password = "2292410586";//String password = 数据库密码;

        try {

            //加载驱动程序
            Class.forName(driver);
            //连接mysql
            con = DriverManager.getConnection(url,user,password);
            //判断数据库是否连接成功
            if(!con.isClosed()) {
                System.out.println("mysql连接成功");

                /*********************************************/

                /*********************************************/
            }
        }catch(ClassNotFoundException e) {
            System.out.println("载入JDBC驱动类出错");
            e.printStackTrace();
        }catch(SQLException e) {
            System.out.println("mysql连接出错");
            e.printStackTrace();
        }finally {
            try {
                con.close();
                System.out.println("mysql关闭成功");
            }catch(SQLException e) {
                System.out.println("关闭数据库连接出错");
                e.printStackTrace();
                con = null;
            }
        }
    }

}
