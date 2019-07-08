@Registration
Feature: As a user, I want to register Facebook using Automation

Scenario: Register Facebook
Given I open "https://www.facebook.com/" in browser
When I input "Mohamad" in Nama depan text field
And I input "Romli" in Nama belakang text field
And I input "MohamadRomli@gmail.com" in Email text field
And I input "MohamadRomli@gmail.com" in re-Enter Email text field
And I input "IniP@ssw0rd" in password text field
And I select "13" in day dropdown list
And I select "Okt" in month dropdown list
And I select "1988" in year dropdown list
And I click "Khusus" as Laki-laki radio button
Then I click "Daftar" as Daftar button