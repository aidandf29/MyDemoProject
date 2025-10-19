
Feature: API Testing for FakerAPI Companies

  @QuantityValidation
  Scenario Outline: Validate company list returns correct number of data
    Given I send GET request to "https://fakerapi.it/api/v1/companies?_quantity=<qty>"
    Then the response status should be 200
    And the number of companies returned should be <qty>

    Examples:
      | qty |
      | 20  |
      | 5   |
      | 1   |

  @SchemaAndIdValidation
  Scenario: Validate companies endpoint and check id and schema
    Given I send GET request to "https://fakerapi.it/api/v1/companies"
    Then the response status should be 200
    And all ids in the response should not be null
    And the response should match JSON schema "schemas/companies_schema.json"
