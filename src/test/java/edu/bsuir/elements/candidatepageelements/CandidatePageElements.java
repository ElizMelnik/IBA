package edu.bsuir.elements.candidatepageelements;

import org.openqa.selenium.By;

public class CandidatePageElements {
    public static String URL = "http://testing.cld.iba.by/web/guest/recruiting/candidates";

    public static By TITLE = By.xpath("//*[@id=\"content\"]/div[1]");

    public static By FILTER_TITLE =  By.xpath("//*[@id=\"filterPanelHeader\"]/b");
    public static By FILTER_CLEAN = By.id("filter-clear-link");

    public static By EXPERIENCE_TITLE = By.xpath("//*[@id=\"experience_filter\"]/div/b");
    public static By WORK_EXPERIENCE_NO = By.xpath("//select[@id='experience']//option[@value='0']");
    public static By WORK_EXPERIENCE_FROM_ONE_YEAR = By.xpath("//select[@id='experience']//option[@value='12']");
    public static By WORK_EXPERIENCE_FROM_THREE_YEAR = By.xpath("//select[@id='experience']//option[@value='36']");
    public static By WORK_EXPERIENCE_FROM_FIVE_YEAR = By.xpath("//select[@id='experience']//option[@value='60']");

    public static By STATUS_TITLE = By.xpath("//*[@id=\"status_filter\"]/div[1]/b");
    public static By STATUS_NEW = By.xpath("//*[@id=\"status_New\"]");
    public static By STATUS_ON_APPROVAL = By.xpath("//*[@id=\"status_OnApprovalForTheVacancy\"]");
    public static By STATUS_AVAILABLE_FOR_APPROVAL = By.xpath("//*[@id=\"status_AvailableForApproval\"]");
    public static By STATUS_HIRED = By.xpath("//*[@id=\"status_Hired\"]");

    public static By VACANCY_TITLE = By.xpath("//*[@id=\"vacancy_filter\"]/div/b");
    // public static By VACANCY_SELECT = By.xpath("//*[@id=\"yui_patched_v3_11_0_3_1522839949782_832\"]");
    public static By VACANCY_SELECT = By.xpath("//*[@id=\"vacancy_filter\"]/span/div/button");

    //public static By VACANCY_SEARCH_INPUT_FIELD = By.id("searchInput");
    public static By VACANCY_SEARCH_INPUT_FIELD = By.xpath("//div[@id='vacancy_filter']//input[@id='searchInput']");

    public static By RELOCATION_TITLE = By.xpath("//*[@id=\"relocation_filter\"]/div[1]/b");
    public static By RELOCATION_AVAILABLE = By.xpath("//*[@id=\"relocation_Available\"]");
    public static By RELOCATION_UNAVAILABLE = By.xpath("//*[@id=\"relocation_Unavailable\"]");

    public static By EDUCATION_TITLE = By.xpath("//*[@id=\"education_filter\"]/div/b");
    public static By EDUCATION_SELECT = By.xpath("//*[@id=\"yui_patched_v3_11_0_3_1522906137418_884\"]");
    public static By EDUCATION_SEARCH_FIELD = By.xpath("//*[@id=\"education_filter\"]/span/div/button");
    public static By EDUCATION_NO = By.xpath("//*[@id=\"education_filtermultiselect-0\"]");
    public static By EDUCATION_GENERAL_AVERAGE = By.xpath("//*[@id=\"education_filtermultiselect-1\"]");
    public static By EDUCATION_VOCATION_AND_TECHNICAL = By.xpath("//*[@id=\"education_filtermultiselect-2\"]");
    public static By EDUCATION_SPECIALIZED_SECONDARY = By.xpath("//*[@id=\"education_filtermultiselect-3\"]");
    public static By EDUCATION_HIGHER = By.xpath("//*[@id=\"education_filtermultiselect-4\"]");
    public static By EDUCATION_INCONPLETE_HIGHER = By.xpath("//*[@id=\"education_filtermultiselect-5\"]");

    public static By UNIVERSITY_TITLE = By.xpath("//*[@id=\"universities_filter\"]/div/b");
    public static By UNIVERSITY_SELECT = By.xpath("//*[@id=\"yui_patched_v3_11_0_3_1522906137418_7412\"]");
    public static By UNIVERSITY_SEARCH_FIELD = By.xpath("//*[@id=\"searchInput\"]");
    public static By UNIVERSITY_BSU = By.xpath("//*[@id=\"universities_filtermultiselect-0\"]");
    public static By UNIVERSITY_BSUIR = By.xpath("//*[@id=\"universities_filtermultiselect-1\"]");
    public static By UNIVERSITY_BSEU = By.xpath("//*[@id=\"universities_filtermultiselect-2\"]");
    public static By UNIVERSITY_BSTU = By.xpath("//*[@id=\"universities_filtermultiselect-3\"]");

    public static By COMPETENCE_TITLE = By.xpath("//*[@id=\"universities_filter\"]/div/b");
    public static By COMPETENCE_SELECT = By.xpath("//*[@id=\"yui_patched_v3_11_0_3_1522906137418_7462\"]");
    public static By COMPETENCE_SEARCH_FIELD = By.xpath("//*[@id=\"searchInput\"]");
    public static By COMPETENCE_MS_ACCESS = By.xpath("//*[@id=\"competencies_filtermultiselect-0\"]");
    public static By COMPETENCE_MS_ONENOTE = By.xpath("//*[@id=\"competencies_filtermultiselect-1\"]");
    public static By COMPETENCE_ENGLISH = By.xpath("//*[@id=\"competencies_filtermultiselect-2\"]");
    public static By COMPETENCE_FRENCH = By.xpath("//*[@id=\"competencies_filtermultiselect-3\"]");

    public static By CANDIDATE_SEARCH = By.xpath("//input[@placeholder = 'Поиск...']");

    public static By CANDIDATE_CREATE = By.xpath("//*[@id=\"createProfileButton\"]");

    public static By SEARCH_RESULT_FIO = By.xpath("//span[@class = 'fio']");

}
