package main;

import model.CompanyInfo;
import model.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        CompanyInfo companyInfo = context.getBean("companyinfo",CompanyInfo.class);
        Map<Integer,String> empIdAndNameMap = companyInfo.getEmpIdandNameMap();

        System.out.println("--------------------------------------------------------------");
        Set<Entry<Integer,String>> entrySet = empIdAndNameMap.entrySet();
        for(Map.Entry<Integer,String> entry :entrySet){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        System.out.println("--------------------------------------------------------------");

        Map<Integer,Student> empidAndMap = companyInfo.getStudentIdMap();
        Set<Entry<Integer,Student>> entryIdandMap = empidAndMap.entrySet();
        for(Entry<Integer,Student> entryIdandMap2 : entryIdandMap){
            Student student = entryIdandMap2.getValue();//need to make the student object
            System.out.println(student.getStudentId()+"\t"+student.getStudentName());
        }

        context.close();
    }
}
