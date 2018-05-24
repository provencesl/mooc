package com.edu.pojo;

public class Coursedetails {
    private Integer classid;

    private Integer courseid;

    private String homework;

    private String videourl;

    private String ppturl;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework == null ? null : homework.trim();
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getPpturl() {
        return ppturl;
    }

    public void setPpturl(String ppturl) {
        this.ppturl = ppturl == null ? null : ppturl.trim();
    }
}