package edu.bsuir.elements.applicationelements;

import org.openqa.selenium.By;

public class ApplicationPageElements {
    public static String URL = "http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/createApplication";

    public static By NAME = By.xpath("//*[@id=\"name\"]");

    public static By PLANNED_CLOSING_DATE = By.xpath("//*[@id=\"plannedClosingDate\"]");

    public static By PRIORITY_LOW = By.xpath("//div//label[text() = 'низкий']");
    public static By PRIORITY_MIDDLE = By.xpath("//div//label[text() = 'средний']");
    public static By PRIORITY_HIGH = By.xpath("//div//label[text() = 'высокий']");

    public static By QUANTITY = By.xpath("//*[@id=\"quantity\"]");

    public static By CREATION_REASON = By.xpath("//*[@id=\"creationReason\"]");

    public static By CONTRACT_TYPE_0 = By.id("contractType-0");
    public static By CONTRACT_TYPE_1 = By.id("contractType-1");
    public static By CONTRACT_TYPE_2 = By.id("contractType-2");

    public static By SALARY = By.id("salary");

    public static By SALARY_TYPE_BEL = By.xpath("//select[@id = 'currency']//option[@value = '0']");
    public static By SALARY_TYPE_RUS = By.xpath("//select[@id = 'currency']//option[@value = '1']");
    public static By SALARY_TYPE_USD = By.xpath("//select[@id = 'currency']//option[@value = '2']");
    public static By SALARY_TYPE_EUR = By.xpath("//select[@id = 'currency']//option[@value = '3']");

    public static By SCHEDULE_TYPE_1 = By.xpath("//*[@id=\"jobType\"]/option[1]");
    public static By SCHEDULE_TYPE_2 = By.xpath("//*[@id=\"jobType\"]/option[2]");
    public static By SCHEDULE_TYPE_3 = By.xpath("//*[@id=\"jobType\"]/option[3]");
    public static By SCHEDULE_TYPE_4 = By.xpath("//*[@id=\"jobType\"]/option[4]");

    public static By EMPLOYEES = By.id("employees");

    public static By BUSINESS_TRIP = By.id("businessTrip");

    public static By TIMETABLE = By.id("timetable");

    public static By PROBATION_PERIOD = By.id("probationPeriod");

    public static By RESPONSIBILITIES = By.id("responsibilities");

    public static By CANDIDATE_TYPE_EXTERNAL = By.id("candidateTypeExternal");
    public static By CANDIDATE_TYPE_INTERNAL = By.id("candidateTypeInternal");

    public static By EDUCATION_LEVEL_NO = By.xpath("//select[@id = 'education']//option[@value = '-1']");
    public static By EDUCATION_LEVEL_1 = By.xpath("//select[@id = 'education']//option[@value = '1']");
    public static By EDUCATION_LEVEL_2 = By.xpath("//select[@id = 'education']//option[@value = '2']");
    public static By EDUCATION_LEVEL_3 = By.xpath("//select[@id = 'education']//option[@value = '3']");
    public static By EDUCATION_LEVEL_4 = By.xpath("//select[@id = 'education']//option[@value = '4']");

    public static By EDUCATION_SPECIALIZATION = By.id("educationSpecialization");

    public static By EXPERIENCE_0 = By.xpath("//select[@id = 'experience']//option[@value = '0']");
    public static By EXPERIENCE_1 = By.xpath("//select[@id = 'experience']//option[@value = '1']");
    public static By EXPERIENCE_2 = By.xpath("//select[@id = 'experience']//option[@value = '3']");
    public static By EXPERIENCE_4 = By.xpath("//select[@id = 'experience']//option[@value = '5']");

    public static By PRIORITY_WORKING_EXPERIENCE = By.id("priority.working.experience");

    public static By UNDESIRABLE_WORKING_EXPERIENCE = By.id("undesirableWorkingExperience");

    public static By EDIT_REQUIRED_COMPETENCE_BUTTON = By.id("editrequiredCompetence");
    public static By MS_OFFICE = By.xpath("//span[text()='MS Office']");
    public static By MS_EXCEL =  By.xpath("//span[text() = 'MS Word']");
    public static By OK_COMPETENCE_BUTTON = By.xpath("");
    public static By COMMENT = By.id("comment");
    public static By SAVE_BUTTON = By.id("save");
}
