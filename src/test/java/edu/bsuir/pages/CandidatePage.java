package edu.bsuir.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.Element;
import edu.bsuir.elements.candidatepageelements.CandidatePageElements;
import edu.bsuir.helper.Helper;

public class CandidatePage {
    public void getCandidatesPage() {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);
    }

    public void findCandidate(String string) {
        Element element = new Element("Search", CandidatePageElements.CANDIDATE_SEARCH);
        element.typeText(string);
    }

    public void getFiltersTitles() throws InterruptedException {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);

        Thread.sleep(1000);

        Element candidatePageTitle = new Element ("Заголовок", CandidatePageElements.TITLE);
        candidatePageTitle.isElementPresent();
        Element candidatePageFilterTitle = new Element ("Заголовок фильтр", CandidatePageElements.FILTER_TITLE);
        candidatePageFilterTitle.isElementPresent();
        Element candidatePageExpetienceTitle = new Element ("Заголовок опыт работы", CandidatePageElements.EXPERIENCE_TITLE);
        candidatePageExpetienceTitle.isElementPresent();
        Element candidatePageStatusTitle = new Element ("Заголовок статус", CandidatePageElements.STATUS_TITLE);
        candidatePageStatusTitle.isElementPresent();
        Element candidatePageVacancyTitle = new Element ("Загловок вакансия", CandidatePageElements.VACANCY_TITLE);
        candidatePageVacancyTitle.isElementPresent();
        Element candidatePageRelocationTitle = new Element ("Заголовок возможен перевод", CandidatePageElements.RELOCATION_TITLE);
        candidatePageRelocationTitle.isElementPresent();
        Element candidatePageEducationTitle = new Element ("Заголовок образование", CandidatePageElements.EDUCATION_TITLE);
        candidatePageEducationTitle.isElementPresent();
        Element candidatePageUniversityTitle = new Element ("Заголовок университет", CandidatePageElements.UNIVERSITY_TITLE);
        candidatePageUniversityTitle.isElementPresent();
        Element candidatePageCompetenceTitle = new Element ("Заголовок компетенция", CandidatePageElements.COMPETENCE_TITLE);
        candidatePageCompetenceTitle.isElementPresent();
    }

    public void searchCandidateByWorkExperience() throws InterruptedException {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);

        Thread.sleep(1000);

        Element candidateWorkExperienceFromOneYear = new Element("Опыт работы", CandidatePageElements.WORK_EXPERIENCE_FROM_ONE_YEAR);
        candidateWorkExperienceFromOneYear.clickElement();

    }

    public void vacancyMenu() throws InterruptedException {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);

        Thread.sleep(1000);

        Element candidateVacancy = new Element("Вакансия", CandidatePageElements.VACANCY_SELECT);
        candidateVacancy.clickElement();
        Element candidateVacancySearchInput = new Element("Поиск вакансия", CandidatePageElements.VACANCY_SEARCH_INPUT_FIELD);
        candidateVacancySearchInput.typeText("Д");
    }

    public void checkStatusFilter() throws InterruptedException {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);

        Thread.sleep(1000);

        Element candidateStatus = new Element("Статус", CandidatePageElements.STATUS_NEW);
        candidateStatus.clickElement();
    }

    public void relocationAvailable() throws InterruptedException {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);
        Thread.sleep(1000);

        Element candidateRelocation = new Element("Возможен переезд", CandidatePageElements.RELOCATION_AVAILABLE);
        candidateRelocation.clickElement();
    }

    public void educationFilter() throws Exception {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);
        Thread.sleep(1000);

        Element candidateEducation = new Element("Образование", CandidatePageElements.EDUCATION_SELECT);
        candidateEducation.clickElement();
        Element candidateEducationHigher = new Element("Высшее", CandidatePageElements.EDUCATION_HIGHER);
        candidateEducationHigher.clickElement();
    }

    public void universityFilter() throws InterruptedException {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);
        Helper.wait(5);
        Element candidateUniversity = new Element("Университет", CandidatePageElements.UNIVERSITY_SELECT);
        candidateUniversity.clickElement();
        Element candidateUniversityBSU = new Element("БГУ", CandidatePageElements.UNIVERSITY_BSU);
        candidateUniversityBSU.clickElement();
    }

    public void competenceFilter() throws Exception {
        WebDriverSingleton.getInstance().get(CandidatePageElements.URL);

        Thread.sleep(1000);


        Element  candidateCompetence = new Element("Компетенция", CandidatePageElements.COMPETENCE_SELECT);
        candidateCompetence.clickElement();
        Element candidateCompetenceEnglish = new Element("Английский язык", CandidatePageElements.COMPETENCE_ENGLISH);
        candidateCompetenceEnglish.clickElement();
    }
}
