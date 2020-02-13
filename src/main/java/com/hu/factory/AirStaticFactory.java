package com.hu.factory;

import com.hu.bean.AirPlane;

/**
 * @program: spring
 * @description:静态工厂
 * @author: hu
 * @create: 2020-02-12 21:18
 */
public class AirStaticFactory {
  // AirStaticFactory.getAirPlane()
  public static AirPlane getAirPlane(String jzname) {
    System.out.println("AirStaticFactory.......");
    AirPlane airPlane = new AirPlane();
    airPlane.setFdj("发动机1号");
    airPlane.setJzname(jzname);
    return airPlane;
  }
}
