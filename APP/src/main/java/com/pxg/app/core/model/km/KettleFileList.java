package com.pxg.app.core.model.km;

import java.io.Serializable;
import java.util.Date;

public class KettleFileList implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column km.kettle_file_list.id
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column km.kettle_file_list.name
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column km.kettle_file_list.description
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column km.kettle_file_list.file_text
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private String fileText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column km.kettle_file_list.status
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column km.kettle_file_list.job_type_id
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private Integer jobTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column km.kettle_file_list.upload_time
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private Date uploadTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table km.kettle_file_list
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column km.kettle_file_list.id
     *
     * @return the value of km.kettle_file_list.id
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column km.kettle_file_list.id
     *
     * @param id the value for km.kettle_file_list.id
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column km.kettle_file_list.name
     *
     * @return the value of km.kettle_file_list.name
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column km.kettle_file_list.name
     *
     * @param name the value for km.kettle_file_list.name
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column km.kettle_file_list.description
     *
     * @return the value of km.kettle_file_list.description
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column km.kettle_file_list.description
     *
     * @param description the value for km.kettle_file_list.description
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column km.kettle_file_list.file_text
     *
     * @return the value of km.kettle_file_list.file_text
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public String getFileText() {
        return fileText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column km.kettle_file_list.file_text
     *
     * @param fileText the value for km.kettle_file_list.file_text
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public void setFileText(String fileText) {
        this.fileText = fileText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column km.kettle_file_list.status
     *
     * @return the value of km.kettle_file_list.status
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column km.kettle_file_list.status
     *
     * @param status the value for km.kettle_file_list.status
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column km.kettle_file_list.job_type_id
     *
     * @return the value of km.kettle_file_list.job_type_id
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public Integer getJobTypeId() {
        return jobTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column km.kettle_file_list.job_type_id
     *
     * @param jobTypeId the value for km.kettle_file_list.job_type_id
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public void setJobTypeId(Integer jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column km.kettle_file_list.upload_time
     *
     * @return the value of km.kettle_file_list.upload_time
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column km.kettle_file_list.upload_time
     *
     * @param uploadTime the value for km.kettle_file_list.upload_time
     *
     * @mbg.generated Sun Sep 01 17:12:23 CST 2019
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}