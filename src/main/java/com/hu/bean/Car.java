package com.hu.bean;

/**
 * @program: spring
 * @description:
 * @author: hu
 * @create: 2020-02-11 14:59
 */
public class Car {
  private String carName;
  private Integer price;
  private String color;

  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Car{"
        + "carName='"
        + carName
        + '\''
        + ", price="
        + price
        + ", color='"
        + color
        + '\''
        + '}';
  }
}
