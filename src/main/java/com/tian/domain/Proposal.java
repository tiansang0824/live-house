package com.tian.domain;

import org.springframework.stereotype.Component;

/**
 * 用来保存用户建议书的bean。主要属性和communication.jsp中的表单一一对应。
 */
@Component("proposal")
public class Proposal {
    // 表单的全部属性。
    private int pid;
    private String proposerName;
    private String proposerJob;
    private String idNum;
    private String phoneNum;
    private String email;
    private String sort;
    private String problem;
    private String title;
    private String content;
    private boolean isPublic;

    // 构造器。
    public Proposal(int pid, String proposerName, String proposerJob, String idNum, String phoneNum, String email, String sort, String problem, String title, String content, boolean isPublic) {
        this.pid = pid;
        this.proposerName = proposerName;
        this.proposerJob = proposerJob;
        this.idNum = idNum;
        this.phoneNum = phoneNum;
        this.email = email;
        this.sort = sort;
        this.problem = problem;
        this.title = title;
        this.content = content;
        this.isPublic = isPublic;
    }

    // toString函数。
    @Override
    public String toString() {
        return "Proposal{" +
                "pid=" + pid +
                ", proposerName='" + proposerName + '\'' +
                ", proposerJob='" + proposerJob + '\'' +
                ", idNum='" + idNum + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", sort='" + sort + '\'' +
                ", problem='" + problem + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isPublic=" + isPublic +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public String getProposerJob() {
        return proposerJob;
    }

    public void setProposerJob(String proposerJob) {
        this.proposerJob = proposerJob;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
}
