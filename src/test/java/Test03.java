import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: hu
 * @create: 2020-02-12 16:34
 */
public class Test03 {
  private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc03.xml");
  /*为各种属性赋值
   * 测试使用null值：默认引用类型就是null，基本类型是默认值
   * */
  @Test
  public void Test01() {
    Object bean = ioc.getBean("airStaticFactory01");
    System.out.println(bean);
    System.out.println("容器启动完成");
  }
}
