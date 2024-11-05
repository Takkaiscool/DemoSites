Feature: About the  data page verification
  @smoke
  Scenario: Verify the data for daily refresh cycle
    Given user navigate to application
    When user goto "About the Data" inside "Data" menu
    Then  user verify breadcrumb as "Home>Data>About the Data"
    Then user verify the refresh cycle for daily
      | Data Source                                            | Metadata      | Date of Source Data | Refresh Cycle | Data Available In                                                                                                                                                                                               | Data Type |
      | Federal Tort Claims Act Deemed Entities                | Metadata XLSX | 10/30/2024          | Daily         | Dashboard                                                                                                                                                                                                       | HRSA      |
      | Health Center Controlled Networks (HCCN)               | Metadata XLSX | 10/30/2024          | Daily         | Find a Health Center Controlled Network                                                                                                                                                                         | HRSA      |
      | Health Center Service Delivery Sites (HCSD)            | Metadata XLSX | 10/30/2024          | Daily         | Dashboard, Data by Geography, Data Download, Data Explorer, Find a Health Center, HRSA Fact Sheets, Map Tool, Quick Maps, Widget                                                                                | HRSA      |
      | Health Professional Shortage Areas (HPSA)              | Metadata XLSX | 10/30/2024          | Daily         | Data by Geography, Data Download, Data Explorer, Find Shortage Areas by Address, HPSA Find, HRSA Fact Sheets, Map Gallery, Map Tool, Quick Maps                                                                 | HRSA      |
      | HRSA Grants                                            | Metadata XLSX | 10/30/2024          | Daily         | Awarded Grants by Program Area Report, Awarded Grants by State and County, Dashboard, Data by Geography, Data Download, Data Explorer, Find Grants, HRSA Fact Sheets, Map Gallery, Map Tool, Quick Maps, Widget | HRSA      |
      | Medically Underserved Areas/Populations (MUA/P)        | Metadata XLSX | 10/30/2024          | Daily         | Data by Geography, Data Download, Data Explorer, Find Shortage Areas by Address, HRSA Fact Sheets, Map Gallery, Map Tool, MUA Find, Quick Maps                                                                  | HRSA      |
      | National Health Service Corps (NHSC) Job Opportunities | Metadata XLSX | 10/30/2024          | Daily         | Data Download, Data Explorer                                                                                                                                                                                    | HRSA      |
      | National Health Service Corps (NHSC) Providers         | Metadata XLSX | 10/30/2024          | Daily         | Dashboard, Data Download, Data Explorer                                                                                                                                                                         | HRSA      |
      | Nurse Corps Program (NCP)                              | Metadata XLSX | 10/30/2024          | Daily         | Data Download, Data Explorer, HRSA Fact Sheets, Map Tool                                                                                                                                                        | HRSA      |

  Scenario: Verify the data for monthly refresh cycle
    Given user navigate to application
    When user goto "About the Data" inside "Data" menu
    Then  user verify breadcrumb as "Home>Data>About the Data"
    Then user verify the refresh cycle for monthly
      | Data Source                                            | Metadata      | Date of Source Data | Refresh Cycle | Data Available In                                                                                                                                                                                               | Data Type   |
      | Congressional Representatives and Senators             | Metadata XLSX | 11/02/2024          | Monthly       | Data by Geography, Data Explorer, HRSA Fact Sheets                                                                                                                                                              | Other Gov't |


  Scenario: Verify the data for yearly refresh cycle
    Given user navigate to application
    When user goto "About the Data" inside "Data" menu
    Then  user verify breadcrumb as "Home>Data>About the Data"
    Then user verify the refresh cycle for monthly
      | Data Source                                            | Metadata      | Date of Source Data | Refresh Cycle | Data Available In                                                                                                                                                                                               | Data Type   |
      | Congressional Representatives and Senators             | Metadata XLSX | 11/02/2024          | Monthly       | Data by Geography, Data Explorer, HRSA Fact Sheets                                                                                                                                                              | Other Gov't |







