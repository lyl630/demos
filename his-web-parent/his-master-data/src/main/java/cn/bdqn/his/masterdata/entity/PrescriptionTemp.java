package cn.bdqn.his.masterdata.entity;

import java.util.Date;

/**
 * 处方模板表
 */
public class PrescriptionTemp {
    private Integer id;
    private String templateId;
    private String templatename;
private String templatedes;
private Integer preType;
    private Integer templateQuan;
    private String diagnosis;
    private Date create_time;
    private Integer eid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    public String getTemplatedes() {
        return templatedes;
    }

    public void setTemplatedes(String templatedes) {
        this.templatedes = templatedes;
    }

    public Integer getPreType() {
        return preType;
    }

    public void setPreType(Integer preType) {
        this.preType = preType;
    }

    public Integer getTemplateQuan() {
        return templateQuan;
    }

    public void setTemplateQuan(Integer templateQuan) {
        this.templateQuan = templateQuan;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}
