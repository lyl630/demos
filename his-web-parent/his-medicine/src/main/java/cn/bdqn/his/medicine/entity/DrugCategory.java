package cn.bdqn.his.medicine.entity;

/**
 * 药品分类表
 */
public class DrugCategory {
    private int id;
    private String categoryname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
