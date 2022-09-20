package com.nuwe.backend.persistence.entities;

import com.nuwe.backend.util.Constants;
import org.apache.tomcat.util.bcel.Const;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Constants.WORKS_OFFERTS)
public class WorkOfferts {

    @Id
    private Long id;

    @Column(name = Constants.TITLE, length = 30)
    private String title;

    @Column(name = Constants.COMPANY_NAME, length = 30)
    private String companyName;

    @Column(name = Constants.DESCRIPTION, length = 1000)
    private String description;

    @Column(name = Constants.SKILLS, length = 120)
    private String skills;

    @Column(name = Constants.MARKET, length = 20)
    private String market;

    @Column(name = Constants.WORK_TYPE, length = 30)
    private String workType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    @Column(name="company-location", length = 30)
    private String companyLocation;
}
