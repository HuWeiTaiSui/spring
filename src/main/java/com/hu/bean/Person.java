package com.hu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @program: spring
 * @description:
 * @author: hu
 * @create: 2020-02-10 18:16
 */
public class Person {
  // 基本类型直接使用
  private String lastName = "张三";
  private Integer age;
  private String gender;
  private Car car;
  private List<Book> books;
  private Map<String, Object> objectMap;
  private Properties properties;

  @Override
  public String toString() {
    return "Person{"
        + "lastName='"
        + lastName
        + '\''
        + ", age="
        + age
        + ", gender='"
        + gender
        + '\''
        + ", car="
        + car
        + ", books="
        + books
        + ", objectMap="
        + objectMap
        + ", properties="
        + properties
        + ", email='"
        + email
        + '\''
        + '}';
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public Map<String, Object> getObjectMap() {
    return objectMap;
  }

  public void setObjectMap(Map<String, Object> objectMap) {
    this.objectMap = objectMap;
  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  public Person(String lastName, Integer age, String gender) {
    this.age = age;
    this.gender = gender;
    System.out.println("三个参数的构造器.... age");
  }

  public Person(String lastName, String email, String gender) {
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    System.out.println("三个参数的构造器.... email");
  }

  public Person(String lastName, Integer age, String gender, String email) {
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.email = email;
    System.out.println("有参构造器....");
  }

  public Person() {
    System.out.println("Person创建了.....");
  }

  private String email;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
    System.out.println("lastName  = " + lastName);
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
