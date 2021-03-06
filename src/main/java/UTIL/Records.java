package UTIL;

import TRAINING.EMPLOYEE;
import TRAINING.SKILL;
import TRAINING.SKILL_SET;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Records {
    public static EMPLOYEE employee1 = new EMPLOYEE("crm0033", "JAVA", "JD");
    public static EMPLOYEE employee2 = new EMPLOYEE("crm0034", "JAVA", "MD");
    public static EMPLOYEE employee3 = new EMPLOYEE("crm0035", "JAVA", "SD");
    public static EMPLOYEE employee4 = new EMPLOYEE("crm0036", ".NET", "JD");
    public static EMPLOYEE employee5 = new EMPLOYEE("crm0037", ".NET", "SD");

    public static SKILL skill1 = new SKILL(1, "Java", null);
    public static SKILL skill2 = new SKILL(2, "Italiano", null);
    public static SKILL skill3 = new SKILL(3, "Spring", 1);
    public static SKILL skill4 = new SKILL(4, "Bath", 3);
    public static SKILL skill5 = new SKILL(5, "1", 2);//Italiano
    public static SKILL skill6 = new SKILL(6, "2", 2);//Italiano
    public static SKILL skill7 = new SKILL(7, "3", 2);//Italiano
    public static SKILL skill8 = new SKILL(8, "4", 2);//Italiano
    public static SKILL skill9 = new SKILL(9, "5", 2);//Italiano
    public static SKILL skill10 = new SKILL(10, "6", 2);//Italiano
    public static SKILL skill11 = new SKILL(11, "1", 1);//Java
    public static SKILL skill12 = new SKILL(12, "2", 1);//Java
    public static SKILL skill13 = new SKILL(13, "3", 1);//Java
    public static SKILL skill14 = new SKILL(14, "1", 4);//Bath
    public static SKILL skill15 = new SKILL(15, "2", 4);//Bath
    public static SKILL skill16 = new SKILL(16, "3", 4);//Bath
    public static SKILL skill17 = new SKILL(17, "4", 4);//Bath

    //public static List<SKILL> skillList = new ArrayList<SKILL>();


    public static SKILL_SET skill_set1 = new SKILL_SET(new Date(2017,02,17), Records.employee1, Records.employee3, Records.skill5 );
    public static SKILL_SET skill_set2 = new SKILL_SET(new Date(2017,02,17), Records.employee2, Records.employee3, Records.skill10 );
    public static SKILL_SET skill_set3 = new SKILL_SET(new Date(2017,02,17), Records.employee4, Records.employee3, Records.skill6 );

    public static Set<SKILL_SET> skill_sets(){
        Set<SKILL_SET> skill_sets = new HashSet<SKILL_SET>();
          skill_sets.add(skill_set1);
          skill_sets.add(skill_set2);
          skill_sets.add(skill_set3);
        return skill_sets;
    }


}
