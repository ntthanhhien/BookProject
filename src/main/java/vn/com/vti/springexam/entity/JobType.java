package vn.com.vti.springexam.entity;

public class JobType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_type.job_type_id
     *
     * @mbg.generated Mon Mar 27 21:17:49 JST 2023
     */
    private String jobTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_type.job_type_name
     *
     * @mbg.generated Mon Mar 27 21:17:49 JST 2023
     */
    private String jobTypeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_type.job_type_id
     *
     * @return the value of job_type.job_type_id
     *
     * @mbg.generated Mon Mar 27 21:17:49 JST 2023
     */
    public String getJobTypeId() {
        return jobTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_type.job_type_id
     *
     * @param jobTypeId the value for job_type.job_type_id
     *
     * @mbg.generated Mon Mar 27 21:17:49 JST 2023
     */
    public void setJobTypeId(String jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_type.job_type_name
     *
     * @return the value of job_type.job_type_name
     *
     * @mbg.generated Mon Mar 27 21:17:49 JST 2023
     */
    public String getJobTypeName() {
        return jobTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_type.job_type_name
     *
     * @param jobTypeName the value for job_type.job_type_name
     *
     * @mbg.generated Mon Mar 27 21:17:49 JST 2023
     */
    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }
}