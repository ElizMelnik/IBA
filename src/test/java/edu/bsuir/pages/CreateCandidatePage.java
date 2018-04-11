package edu.bsuir.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.Element;
import edu.bsuir.elements.candidatepageelements.CreateCandidatePageElements;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CreateCandidatePage {
    WebDriver driver =  WebDriverSingleton.getInstance();

    public void openCreateCandidatePage(){
        driver.get(CreateCandidatePageElements.URL);
    }

    public void clickBackToListLink(){
        CreateCandidatePageElements.BACK_TO_LIST.clickElement();
    }
    public void clickSaveButton(){
        CreateCandidatePageElements.SAVE_BUTTON.clickElement();
    }

    public void enterName(String name){ CreateCandidatePageElements.NAME.typeText(name); }
    public void enterSurname(String surname){ CreateCandidatePageElements.SURNAME.typeText(surname); }
    public void enterSecondName(String secondname){ CreateCandidatePageElements.SECOND_NAME.typeText(secondname); }
    public void enterCountry(String country){ CreateCandidatePageElements.COUNTRY.typeText(country); }
    public void enterCity(String city){ CreateCandidatePageElements.CITY.typeText(city); }
    public void enterPhone(String phone){ CreateCandidatePageElements.PHONE.typeText(phone); }
    public void enterEmail(String email){ CreateCandidatePageElements.EMAIL.typeText(email); }
    public void enterSkype(String skype){ CreateCandidatePageElements.SKYPE.typeText(skype); }
    public void clickRelocationCheckbox(){ CreateCandidatePageElements.RELOCATION_CHECKBOX.clickElement(); }
    public void enterBirthDay(String bday){ CreateCandidatePageElements.DATE_OF_BIRTH_DAY.typeText(bday); }
    public void enterBirthMonth(String bmonth){ CreateCandidatePageElements.DATE_OF_BIRTH_MONTH.typeText(bmonth); }
    public void enterBirthYear(String byear){ CreateCandidatePageElements.DATE_OF_BIRTH_YEAR.typeText(byear); }

    public void enterDesiredPosition(String desireposition){ CreateCandidatePageElements.DESIRED_POSITION.typeText(desireposition); }
    public void enterAdditionalInfo(String addinfo){ CreateCandidatePageElements.ADDITIONAL_INFO.typeText(addinfo); }
    public void enterEditCompetenceButton(){ CreateCandidatePageElements.EDIT_COMPETENCE_BUTTON.clickElement(); }


    public void clickCompetenceTab(){ CreateCandidatePageElements.COMPETENCE_TAB.clickElement(); }
    public void clickEducationTab(){ CreateCandidatePageElements.EDUCATION_TAB.clickElement(); }
    public void clickExperienceTab(){ CreateCandidatePageElements.EXPERIENCE_TAB.clickElement(); }
    public void clickMotivationTab(){ CreateCandidatePageElements.MOTIVATION_TAB.clickElement(); }
    public void clickRecommendationsTab(){ CreateCandidatePageElements.RECOMENDATIONS_TAB.clickElement(); }

    public void clickAddEducation(){ CreateCandidatePageElements.ADD_EDUCATION_INFO_BUTTON.clickElement(); }
    public void clickDeleteEducation(){ CreateCandidatePageElements.DELETE_EDUCATION_INFO_BUTTON.clickElement(); }
    public void enterUniversity(String argument){ CreateCandidatePageElements.UNIVERSITY_FIELD.typeText(argument); }
    public void enterFaculty(String argument){ CreateCandidatePageElements.FACULTY_FIELD.typeText(argument); }
    public void enterSpecialization(String argument){ CreateCandidatePageElements.SPECIALIZATION_FIELD.typeText(argument); }

    public void clickAddExperience(){ CreateCandidatePageElements.ADD_EXPERIENCE_INFO_BUTTON.clickElement(); }
    public void clickDeleteExperience(){ CreateCandidatePageElements.DELETE_EXPERIENCE_INFO_BUTTON.clickElement(); }
    public void enterPosition(String position){ CreateCandidatePageElements.EXP_POSITION.typeText(position); }
    public void enterCompany(String company){ CreateCandidatePageElements.EXP_COMPANY.typeText(company); }
    public void enterDescription(String description){ CreateCandidatePageElements.EXP_DESCRIPTION.typeText(description); }

    public void clickTillNowCheckbox(){ CreateCandidatePageElements.EXP_TILL_NOW_CHECKBOX.clickElement(); }


    public void clickAddRecommendation(){ CreateCandidatePageElements.ADD_RECOMENDATIONS_INFO_BUTTON.clickElement(); }
    public void clickDeleteRecommendation(){ CreateCandidatePageElements.DELETE_RECOMENDATIONS_INFO_BUTTON.clickElement(); }
    public void enterRecommendationName(String recomname){ CreateCandidatePageElements.RECOMMENDATION_NAME.typeText(recomname); }
    public void enterRecommendationPosition(String recomposition){ CreateCandidatePageElements.RECOMMENDATION_POSITION.typeText(recomposition); }
    public void enterRecommendationCompany(String recomcompany){ CreateCandidatePageElements.RECOMMENDATION_COMPANY.typeText(recomcompany); }
    public void enterRecommendationPhone(String recomphone){ CreateCandidatePageElements.RECOMMENDATION_PHONE.typeText(recomphone); }

    public String readErrorMessage(){ return CreateCandidatePageElements.ERROR_MESSAGE.getElementText(); }
    public String readWrongTelephone(){ return CreateCandidatePageElements.WRONG_TELEPHONE.getElementText();}
    public String readWrongEmail(){ return CreateCandidatePageElements.WRONG_EMAIL.getElementText();}

    public String getAbsolutePath(String file) {
        Path path = Paths.get(file);
        return path.toAbsolutePath().toString();
    }

    public void uploadFileUsingRobot(String fName) {
        CreateCandidatePageElements.ADD_ATTACHMENT.doubleClick();
        sendFile(getAbsolutePath("src/resources/" + fName + ""));
    }
    private void sendFile(String path) {
        try{
            setClipboardData(path);
            Robot robot = new Robot();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void uploadFileUsingSelenium(String fName) {
        CreateCandidatePageElements.UPLOAD_RESUME.typeText(getAbsolutePath("resources/" + fName + ""));
    }

    private void setClipboardData(String str) {
        StringSelection strSelection = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
    }

}
