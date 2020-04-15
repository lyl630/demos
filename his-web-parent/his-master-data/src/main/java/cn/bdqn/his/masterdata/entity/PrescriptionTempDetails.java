package cn.bdqn.his.masterdata.entity;

import java.util.Date;

/**
 * 处方模板详情表
 */
public class PrescriptionTempDetails {
    private int id;

    private int drugId;
    private String singleDose;
    private String usage;
private String freQuency;
private String days;
private String total;
private double unitPrice;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    private int pretempId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPretempId() {
        return pretempId;
    }

    public void setPretempId(int pretempId) {
        this.pretempId = pretempId;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getSingleDose() {
        return singleDose;
    }

    public void setSingleDose(String singleDose) {
        this.singleDose = singleDose;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getFreQuency() {
        return freQuency;
    }

    public void setFreQuency(String freQuency) {
        this.freQuency = freQuency;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
