package com.hu.bean;

/**
 * @program: spring
 * @description:
 * @author: hu
 * @create: 2020-02-12 20:47
 */
public class AirPlane {
  private String fdj;
  private String yc; // 异常
  private Integer cd; // 飞机长度
  private String jzname; // 机长
  private String fjzname; // 副机长

  public String getFdj() {
    return fdj;
  }

  public void setFdj(String fdj) {
    this.fdj = fdj;
  }

  public String getYc() {
    return yc;
  }

  public void setYc(String yc) {
    this.yc = yc;
  }

  public Integer getCd() {
    return cd;
  }

  public void setCd(Integer cd) {
    this.cd = cd;
  }

  public String getJzname() {
    return jzname;
  }

  public void setJzname(String jzname) {
    this.jzname = jzname;
  }

  public String getFjzname() {
    return fjzname;
  }

  public void setFjzname(String fjzname) {
    this.fjzname = fjzname;
  }

  @Override
  public String toString() {
    return "AirPlane{"
        + "fdj='"
        + fdj
        + '\''
        + ", yc='"
        + yc
        + '\''
        + ", cd="
        + cd
        + ", jzname='"
        + jzname
        + '\''
        + ", fjzname='"
        + fjzname
        + '\''
        + '}';
  }
}
