package cn.bdqn.his.masterdata.entity;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * 添加附加费用
 */
public class Additionalcost {
    private Integer id;
    private String singledose;
    private Integer number;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSingledose() {
        return singledose;
    }

    public void setSingledose(String singledose) {
        this.singledose = singledose;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
