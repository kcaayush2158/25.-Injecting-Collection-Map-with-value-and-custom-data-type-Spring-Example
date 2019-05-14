package model;

import java.util.Map;

public class CompanyInfo
{
    private Map<Integer,String> empIdandNameMap;
    private Map<Integer,Student> studentIdMap;

    public Map<Integer, String> getEmpIdandNameMap() {
        return empIdandNameMap;
    }

    public void setEmpIdandNameMap(Map<Integer, String> empIdandNameMap) {
        this.empIdandNameMap = empIdandNameMap;
    }

    public Map<Integer, Student> getStudentIdMap() {
        return studentIdMap;
    }

    public void setStudentIdMap(Map<Integer, Student> studentIdMap) {
        this.studentIdMap = studentIdMap;
    }
}
