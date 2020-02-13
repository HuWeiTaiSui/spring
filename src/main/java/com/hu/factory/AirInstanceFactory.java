package com.hu.factory;

import com.hu.bean.AirPlane;

/**
 * @program: spring
 * @description:实例工厂
 * @author: hu
 * @create: 2020-02-12 21:18
 */
public class AirInstanceFactory {
  // new AirInstanceFactory().getAirPlane()
  public AirPlane getAirPlane(String jzname) {
    System.out.println("AirInstanceFactory..............");
    AirPlane airPlane = new AirPlane();
    airPlane.setFdj("发动机2号");
    airPlane.setJzname(jzname);
    return airPlane;
  }
}
