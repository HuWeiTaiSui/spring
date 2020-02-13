import com.hu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: hu
 * @create: 2020-02-10 18:29
 */
public class test {
  private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
  /*
   * 1.从容器中拿到这个组件
   * */
  @Test
  public void test() {
    // ApplicationContext：表示ioc容器
    // ClassPathXmlApplicationContext:表示当前应用的xml配置文件在ClassPath下
    // 根据spring的配置文件得到ioc容器对象
    ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
    Person bean = (Person) ioc.getBean("person01");
    Person bean1 = (Person) ioc.getBean("person03");
    System.out.println(bean1);
  }
  /*
  *2.根据bean的类型从IOc容器中获取BEan的实例
  * 如果ioc容器中这个类型的bean有多个，查找就会报错:
    org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    No qualifying bean of type 'com.hu.bean.Person' available:
    expected single matching bean but found 2: person01,person02
  * */
  @Test
  public void test01() {
    //  Person bean= ioc.getBean(Person.class);
    // System.out.println(bean);
    Person person02 = ioc.getBean("person02", Person.class);
    System.out.println(person02);
    Object bean = ioc.getBean("person03");
    System.out.println(bean);
    Object bean1 = ioc.getBean("person04");
    System.out.println(bean1);
  }
}
