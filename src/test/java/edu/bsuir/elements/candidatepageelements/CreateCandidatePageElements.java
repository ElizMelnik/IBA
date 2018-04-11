package edu.bsuir.elements.candidatepageelements;

import edu.bsuir.elements.Element;
import org.openqa.selenium.By;

public class CreateCandidatePageElements {
    public static final String URL = "http://testing.cld.iba.by/web/guest/recruiting/candidates/-/candidates/createProfile";

    public static final Element BACK_TO_LIST = new Element("Назад к списку", By.xpath("//div[@id=\"buttonsBar\"]/div/a"));
    public static final Element CANCEL_BUTTON = new Element ("Кнопка отмена", By.xpath("//*[@id=\"cancelButton\"]"));
    public static final Element SAVE_BUTTON = new Element( "Кнопка сохранить",By.xpath("//*[@id=\"saveButton\"]"));

    public static final Element PHOTO = new Element ("Фото", By.xpath("//*[@id=\"currentImage\"]"));

    public static final Element SURNAME = new Element ("Фамилия", By.xpath("//*[@id=\"surname\"]"));
    public static final Element NAME = new Element ("Имя", By.xpath("//*[@id=\"name\"]"));
    public static final Element SECOND_NAME = new Element ("Отчество", By.xpath("//*[@id=\"secondName\"]"));

    public static final Element COUNTRY = new Element ("Страна", By.xpath("//*[@id=\"country\"]"));
    public static final Element CITY = new Element ("Город", By.xpath("//*[@id=\"city\"]"));

    public static final Element PHONE = new Element ("Телефон", By.xpath("//*[@id=\"primaryTelephone\"]"));
    public static final Element EMAIL= new Element ("E-mail", By.xpath("//*[@id=\"primaryEmail\"]"));
    public static final Element SKYPE = new Element ("Skype", By.xpath("//*[@id=\"skype\"]"));

    public static final Element RELOCATION_CHECKBOX = new Element ("Чекбокс-возможен переезд", By.xpath("//*[@id=\"relocation\"]"));

    public static final Element DATE_OF_BIRTH_DAY = new Element ("День рождения", By.xpath("//*[@id=\"dateOfBirthDay\"]"));
    public static final Element DATE_OF_BIRTH_MONTH = new Element ("Месяц рождения", By.xpath("//*[@id=\"dateOfBirthMonth\"]"));
    public static final Element DATE_OF_BIRTH_YEAR = new Element ("Год рождения", By.xpath("//*[@id=\"dateOfBirthYear\"]"));

    public static final Element EDUCATION_DROPWOWN = new Element ("Образование", By.xpath("//*[@class=\"education\"]/div/div/select"));

    public static final Element DESIRED_POSITION = new Element ("Желаемая должность", By.xpath("//*[@id=\"desiredPosition\"]"));
    public static final Element ADDITIONAL_INFO = new Element ("Доп информация", By.xpath("//*[@id=\"additionalInfo\"]"));
    public static final Element EDIT_COMPETENCE_BUTTON = new Element ("Редиктировать компетенции", By.xpath("//*[@id=\"editCompetence\"]"));
    public static final Element LOAD_CV_LINK = new Element ("Загрузить резюме", By.xpath("//*[@id=\"loadCVLink\"]"));
    public static final Element COMPETENCE_TAB = new Element ("Вкладка компетенции", By.xpath("//div[@id='myTab']/ul/li[1]/a"));
    public static final Element EDUCATION_TAB = new Element ("Вкладка образование", By.xpath("//div[@id='myTab']/ul/li[2]/a"));
    public static final Element EXPERIENCE_TAB = new Element ("Вкладка опыт работы", By.xpath("//div[@id='myTab']/ul/li[3]/a"));
    public static final Element MOTIVATION_TAB = new Element ("Вкладка мотивация", By.xpath("//div[@id='myTab']/ul/li[4]/a"));
    public static final Element COMMENTS_TAB = new Element ("", By.xpath("//div[@id='myTab']/ul/li[5]/a"));
    public static final Element HISTORY_TAB = new Element ("", By.xpath("//div[@id='myTab']/ul/li[6]/a"));
    public static final Element RECOMENDATIONS_TAB = new Element ("Вкладка рекомендации", By.xpath("//div[@id='myTab']/ul/li[7]/a"));
    public static final Element PROTOCOL_TAB = new Element ("", By.xpath("//div[@id='myTab']/ul/li[8]/a"));

    public static final Element ADD_EDUCATION_INFO_BUTTON = new Element ("Образовние - кнопка добавления", By.xpath("//div[contains(@class, 'add-education-details')]/span[contains(@id,'addEducation')]/span"));
    public static final Element UNIVERSITY_FIELD = new Element ("Образовние - университет", By.xpath("//*[@id=\"university\"]"));
    public static final Element FACULTY_FIELD = new Element ("Образовние - факультет", By.xpath("//*[@id=\"faculty\"]"));
    public static final Element SPECIALIZATION_FIELD = new Element ("Образовние - специальность", By.xpath("//*[@id=\"specialization\"]"));
    public static final Element ED_START_YEAR_DROPDOWN = new Element ("Образовние - год начала", By.xpath("//*[@id=\"startYear\"]"));
    public static final Element ED_STOP_YEAR_DROPDOWN = new Element ("Образовние - год окончания", By.xpath("//*[@id=\"endYear\"]"));
    public static final Element DELETE_EDUCATION_INFO_BUTTON = new Element ("Образовние - кнопка удаления", By.xpath("//div[contains(@class, 'education-details')]//span[contains(@class,'remove')]"));

    public static final Element ADD_EXPERIENCE_INFO_BUTTON  = new Element ("Добавить опыт работы", By.xpath("//span[contains(@id,'addWor')]/span"));
    public static final Element DELETE_EXPERIENCE_INFO_BUTTON  = new Element ("Удалить опыт работы", By.xpath("//span[contains(@class,'remove-work-exp')]"));
    public static final Element EXP_POSITION = new Element ("Опыт работы - должность", By.xpath("//*[@id=\"position\"]"));
    public static final Element EXP_COMPANY = new Element ("Опыт работы - компания", By.xpath("//*[@id=\"company\"]"));
    public static final Element EXP_START_MONTH = new Element ("Опыт работы - месяц начала", By.xpath("//*[@id=\"startMonth\"]"));
    public static final Element EXP_START_YEAR = new Element ("Опыт работы - год начала ", By.xpath("//*[@id=\"startYear\"]"));
    public static final Element EXP_STOP_MONTH = new Element ("Опыт работы - месяц окончания", By.xpath("//*[@id=\"endMonth\"]"));
    public static final Element EXP_STOP_YEAR = new Element ("Опыт работы - год окончания", By.xpath("//*[@id=\"endYear\"]"));
    public static final Element EXP_DESCRIPTION = new Element ("Опыт работы - описание", By.xpath("//*[@id=\"description\"]"));
    public static final Element EXP_TILL_NOW_CHECKBOX = new Element ("Опыт работы - по настоящее время", By.xpath("//*[@id=\"tillNow\"]"));

    public static final Element MOTIVATION_MATERIAL_INTEREST = new Element("Мотивация - материальная заинтересованность", By.xpath("//*[@id=\"motivationFactor_0\"]"));
    public static final Element MOTIVATION_STABILITY = new Element("Мотивация - стабильность и защищённость", By.xpath("//*[@id=\"motivationFactor_1\"]"));
    public static final Element MOTIVATION_SOCIAL_PACKAGE = new Element("Мотивация - соц. пакет", By.xpath("//*[@id=\"motivationFactor_2\"]"));
    public static final Element MOTIVATION_SOCIAL_STATUS = new Element("Мотивация - социальный статус", By.xpath("//*[@id=\"motivationFactor_3\"]"));
    public static final Element MOTIVATION_RELATIONSHIP = new Element("Мотивация - межличностные отношения", By.xpath("//*[@id=\"motivationFactor_4\"]"));
    public static final Element MOTIVATION_CONTROL = new Element("Мотивация - степень контроля", By.xpath("//*[@id=\"motivationFactor_5\"]"));
    public static final Element MOTIVATION_PERSPECTIVE = new Element("Мотивация - карьерный рост", By.xpath("//*[@id=\"motivationFactor_6\"]"));
    public static final Element MOTIVATION_RESPONSIBILITY = new Element("Мотивация - ответственность", By.xpath("//*[@id=\"motivationFactor_7\"]"));
    public static final Element MOTIVATION_CREATIVITY = new Element("Мотивация - креативность", By.xpath("//*[@id=\"motivationFactor_8\"]"));
    public static final Element MOTIVATION_RECOGNITION = new Element("Мотивация - признание", By.xpath("//*[@id=\"motivationFactor_9\"]"));
    public static final Element MOTIVATION_PROFESSIONAL_GROWTH = new Element("Мотивация - проф рост", By.xpath("//*[@id=\"motivationFactor_10\"]"));
    public static final Element MOTIVATION_SUCCESS = new Element("Мотивация - успех", By.xpath("//*[@id=\"motivationFactor_11\"]"));

    public static final Element ADD_RECOMENDATIONS_INFO_BUTTON  = new Element("Добавить рекомендацию", By.xpath("//span[contains(@id,'addRecommendation')]/span"));
    public static final Element RECOMMENDATION_NAME = new Element("Рекомендация - имя", By.xpath("//*[@id=\"recName\"]"));
    public static final Element RECOMMENDATION_POSITION = new Element("Рекомендация - фамилия", By.xpath("//*[@id=\"recPosition\"]"));
    public static final Element RECOMMENDATION_COMPANY = new Element("Рекомендация - компания", By.xpath("//*[@id=\"recCompany\"]"));
    public static final Element RECOMMENDATION_PHONE = new Element("Рекомендация - телефон", By.xpath("//*[@id=\"recTelephone\"]"));
    public static final Element DELETE_RECOMENDATIONS_INFO_BUTTON  = new Element("Удалить рекомендацию", By.xpath("//span[contains(@class,'remove-recommendation')]"));

    public static final Element REQUEST_TEXT = new Element("", By.xpath("//*[@id=\"requestText\"]"));
    public static final Element PARSE_REQUEST_BUTTON = new Element("", By.xpath("//*[@id=\"parseRequestBtn\"]"));
    public static final Element CLEAR_REQUEST_BUTTON = new Element("", By.xpath("//*[@id=\"clearRequestBtn\"]"));

    public static final Element ERROR_MESSAGE = new Element("Сообщение об ошибке", By.xpath("//*[@id=\"errorMessage\"]"));
    public static final Element WRONG_TELEPHONE = new Element("", By.xpath("//div[@class='validateTelephone']"));
    public static final Element WRONG_EMAIL = new Element("", By.xpath("//div[@class='email']"));

    public static final Element UPLOAD_RESUME = new Element("Загрузить резюме",
            By.xpath("//input[@id = 'profileCVInput']"));
    public static final Element ADD_ATTACHMENT = new Element("Прикрепить файл",
            By.xpath("//label[@id = 'add-attachment']//i[@class =  'fa fa-plus add-attachment']"));
    public static final Element ADDED_ATTACHMENT = new Element("Прикрепленный файл",
            By.xpath("//div[@class = 'control-group']//span[@class = 'link']"));
}
