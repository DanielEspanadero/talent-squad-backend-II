package com.nuwe.backend.persistence.entities;

import com.nuwe.backend.util.Constants;

import javax.persistence.*;

@Entity
@Table(name = Constants.WORK_OFFERTS)
public class WorkOfferts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name= Constants.TITLE, nullable = false)
    private String title;

    @Column(name = Constants.COMPANY_NAME)
    private String companyName;

    @Column(name = Constants.DESCRIPTION)
    private String description;

    @Column(name = Constants.SKILLS)
    private String skills;

    @Column(name = Constants.MARKET)
    private String market;

    @Column(name = Constants.WORK_TYPE)
    private String workType;

    @Column(name = Constants.COMPANY_LOCATION)
    private String companyLocation;

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
}
