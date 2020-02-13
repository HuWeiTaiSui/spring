import com.hu.bean.Book;
import com.hu.bean.Car;
import com.hu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @program: spring
 * @description:
 * @author: hu
 * @create: 2020-02-11 15:15
 */
public class Test02 {
  private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc02.xml");
  /*为各种属性赋值
   * 测试使用null值：默认引用类型就是null，基本类型是默认值
   * */
  @Test
  public void Test01() {
    Person person01 = (Person) ioc.getBean("person01");
    // 判断LastName是否等于空
    System.out.println(person01.getLastName() == null);
  }

  @Test
  public void Test0() {
    Person person01 = (Person) ioc.getBean("person01");
    // 判断LastName是否等于空
    System.out.println(person01.getCar());
    Object car01 = ioc.getBean("car01");
    System.out.println(car01 == person01);
  }

  @Test
  public void Test03() {
    Person bean = (Person) ioc.getBean("person01");
    // ioc中拿到的Person
    System.out.println("没有修改之前..." + bean.getCar());

    // ioc中拿到car01，修改CarName值
    Car car01 = (Car) ioc.getBean("car01");
    car01.setCarName("小汽车");
    System.out.println("修改之后..." + bean.getCar());
  }
  // 引用 内外bean
  @Test
  public void Test04() {
    Person bean = (Person) ioc.getBean("person01");
    Car car = bean.getCar();
    System.out.println(car);
  }
  // list map
  @Test
  public void Test05() {
    /* Person bean = (Person) ioc.getBean("person01");
    List<Book> books = bean.getBooks();
    System.out.println(books);*/
    Person bean = (Person) ioc.getBean("person02");
    Map<String, Object> objectMap = bean.getObjectMap();
    System.out.println(objectMap);
  }
  // 继承
  @Test
  public void Test06() {
    Book ps = (Book) ioc.getBean("book03");
    System.out.println(ps);
  }
}
