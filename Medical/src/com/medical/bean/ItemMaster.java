package com.medical.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "itemmaster")
public class ItemMaster implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "category", nullable = true, length = 100)
    private String category;
    @Column(name = "code", nullable = false, length = 40)
    private String code;
    @Column(name = "purpose", nullable = true, length = 200)
    private String purpose;
    @Column(name = "stocklevel")
    private Integer stocklevel;
    @Column(name = "remark", nullable = true, length = 200)
    private String remark;

    @Column(name = "datecrtd")
    private Date datecrtd = new Date();

    @Column(name = "datemdfd")
    private Date datemdfd = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatecrtd() {
        return datecrtd;
    }

    public void setDatecrtd(Date datecrtd) {
        this.datecrtd = datecrtd;
    }

    public Date getDatemdfd() {
        return datemdfd;
    }

    public void setDatemdfd(Date datemdfd) {
        this.datemdfd = datemdfd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getStocklevel() {
        return stocklevel;
    }

    public void setStocklevel(Integer stocklevel) {
        this.stocklevel = stocklevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ItemMaster [id=" + id + ", name=" + name + ", category=" + category + ", code=" + code + ", purpose=" + purpose
                        + ", stocklevel=" + stocklevel + ", remark=" + remark + ", datecrtd=" + datecrtd + ", datemdfd=" + datemdfd
                        + "]";
    }

}
