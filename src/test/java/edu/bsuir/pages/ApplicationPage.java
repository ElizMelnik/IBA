package edu.bsuir.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.Element;
import edu.bsuir.elements.applicationelements.ApplicationPageElements;

public class ApplicationPage {
    public void application() throws Exception {
        WebDriverSingleton.getInstance().get(ApplicationPageElements.URL);

        Element applicationName = new Element("Название заявки", ApplicationPageElements.NAME);
        applicationName.typeText("QA Engineer");

        Element applicationDate = new Element("Дата закрытия", ApplicationPageElements.PLANNED_CLOSING_DATE);
        applicationDate.typeText("11.04.2018");

        Element applicationPriority = new Element("Приоритет заявки", ApplicationPageElements.PRIORITY_HIGH);
        applicationPriority.clickElement();

        Element applicationQuantity = new Element("Количество сотрудников", ApplicationPageElements.QUANTITY);
        applicationQuantity.typeText("2");

        Element applicationReason = new Element("Причина появления", ApplicationPageElements.CREATION_REASON);
        applicationReason.typeText("Нехватка");

        Element applicationContractType = new Element("Тип договора", ApplicationPageElements.CONTRACT_TYPE_1);
        applicationContractType.clickElement();

        Element applicationSalary = new Element("Размер зарплаты", ApplicationPageElements.SALARY);
        applicationSalary.typeText("500");

        Element applicationSalaryType = new Element("Валюта", ApplicationPageElements.SALARY_TYPE_USD);
        applicationSalaryType.clickElement();

        Element applicationSchedule = new Element("Занятость", ApplicationPageElements.SCHEDULE_TYPE_3);
        applicationSchedule.clickElement();

        Element applicationEmployees = new Element("Подчиненные", ApplicationPageElements.EMPLOYEES);
        applicationEmployees.typeText("3");

        Element applicationBusinessTrip = new Element("Командировки", ApplicationPageElements.BUSINESS_TRIP);
        applicationBusinessTrip.typeText("США / Австралия");

        Element applicationTimetable = new Element("График работы", ApplicationPageElements.TIMETABLE);
        applicationTimetable.typeText("40 часов в неделю");

        Element applicationProbationPeriod = new Element("Испытательный срок", ApplicationPageElements.PROBATION_PERIOD);
        applicationProbationPeriod.typeText("2 месяца");

        Element applicationResponsibilities = new Element("Обязанности", ApplicationPageElements.RESPONSIBILITIES);
        applicationResponsibilities.typeText("Много и упорно работать");

        Element applicationCandidateType = new Element("Тип кандидата", ApplicationPageElements.CANDIDATE_TYPE_INTERNAL);
        applicationCandidateType.clickElement();

        Element applicationEducationLevel = new Element("Уровень образования", ApplicationPageElements.EDUCATION_LEVEL_3);
        applicationEducationLevel.clickElement();

        Element applicationRequiredEducation = new Element("Требуемый уровень образования", ApplicationPageElements.EDUCATION_SPECIALIZATION);
        applicationRequiredEducation.typeText("BSU");

        Element applicationExperience = new Element("Опыт работы", ApplicationPageElements.EXPERIENCE_4);
        applicationExperience.clickElement();

        Element applicationPriorityOrganisations = new Element("Приоритетные организации", ApplicationPageElements.PRIORITY_WORKING_EXPERIENCE);
        applicationPriorityOrganisations.typeText("IBA");

        Element applicationUndesirableExperience = new Element("Плохие организации", ApplicationPageElements.UNDESIRABLE_WORKING_EXPERIENCE);
        applicationUndesirableExperience.typeText("БГУИР");

        Element applicationEditRequiredCompetence = new Element("Обязательные компетенции", ApplicationPageElements.EDIT_REQUIRED_COMPETENCE_BUTTON);
        applicationEditRequiredCompetence.getElement().click();
        Element msOffice = new Element("Офис майрософт", ApplicationPageElements.MS_OFFICE);
        msOffice.clickElement();
        Element applicationMSExcel = new Element("Word", ApplicationPageElements.MS_EXCEL);
        applicationMSExcel.doubleClick();
        Element applicationOKCompetenceButton = new Element("Ok", ApplicationPageElements.OK_COMPETENCE_BUTTON);
        applicationOKCompetenceButton.doubleClick();

        Element applicationComment = new Element("Comment", ApplicationPageElements.COMMENT);
        applicationComment.typeText("Magic");

        Element applicationSaveButton = new Element("Save", ApplicationPageElements.SAVE_BUTTON);
        applicationSaveButton.doubleClick();

    }
}