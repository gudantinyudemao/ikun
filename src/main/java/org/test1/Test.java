package org.test1;

/* JDBC java database connection
 * @author WuWei
 * @date 2024/7/22 下午2:44
 */
public class Test {
    public static void main(String[] args) {
//        // 1.驱动加载
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        }catch(ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功!");
//
//        // 2.获取jdbc连接
//        String url = "jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
//        String username = "root";
//        String password = "a12345";
//        Connection connection = null;
//        try{
//            connection =
//                    DriverManager.getConnection(url,username,password);
//        } catch(SQLException e){
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功!");
//        try {
//            Statement s = connection.createStatement();
//            // 准备一个sql语句
//            String sql = "INSERT INTO stu " + "(name,gender,birthday,addr,qqnumber) VALUES" + "('刘不负责','男','2003-02-15','江苏南京',3124076825)";
//            // 运行sql语句
//            s.execute(sql);
//        }catch(SQLException e){
//            e.printStackTrace();
//            // 驱动加载 连接获取 创建编译语句对象 执行语句
//            // 驱动加载 连接获取 创建编译语句对象 执行语句 获取查询结果集
//        }

//        Student s1 = new Student(0,"吴菲","男",new Date(),"南京",110);
//        StudentDAO studentDAO1 = new StudentDAOImpl();
////        studentDAO1.insert(s1);
//        Student s2 = new Student(6,"不留情","男",new Date(),"南京",110);
//        StudentDAO studentDAO2 = new StudentDAOImpl();
//        studentDAO2.update(s2);

    }

}
