Feature: Verifying the all the dashboard pages

  Background: Pre requists
    Given user navigate to application
    When user goto "Dashboards" inside "Data" menu
    Then  user verify breadcrumb as "Home>Data>Dashboards"

  Scenario Outline: Verify the Alumni clinical Dashboards page
    When  user click on "<Dashboard Name>"
    Then user verify breadcrumb as "<BreadCrumb>"
    And user verify page header as "<header>"
    Examples:
      | Dashboard Name                       | BreadCrumb                                                                           | header                                                  |
      | Alumni Clinician Dashboards          | Home>Topics>Health Workforce>Bureau of Health Workforce Clinician Dashboards         | Bureau of Health Workforce Clinician Dashboards         |
      | Applicant Dashboards                 | Home>Topics>Health Workforce>Bureau of Health Workforce Program Applicant Dashboards | Bureau of Health Workforce Program Applicant Dashboards |
      | Area Health Resources Files          | Home>Topics>Health Workforce>Area Health Resources Files                             | Area Health Resources Files                             |
      | Community Health Quality Recognition | Home>Topics>Health Centers>Community Health Quality Recognition Dashboard            | Community Health Quality Recognition Dashboard          |