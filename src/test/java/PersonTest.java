package test.java;

import main.java.Person;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

class PersonTest {

    @Test
    @DisplayName("Task 1: Verify person details")
    public void verifyPersonDetails_task_1() {
        Person person = new Person("Albert", "Einstein", 25, List.of("Berlin"), false);
        assertThat(person.getFirstName()).isEqualTo("Albert");
        assertThat(person.getLastName()).isEqualTo("Einstein");
        assertThat(person.getAge()).isEqualTo(25);
        assertThat(person.isMarried()).isEqualTo(false);
        assertThat(person.getLastName()).isNotEqualTo("Tommy");
    }

    @Test
    @DisplayName("Task 2: Verify person details")
    public void verifyPersonDetails_task_2() {
        Person person = new Person("Albert", null, 25, List.of("Berlin"), true);
        assertThat(person.getFirstName()).isNotEmpty().isEqualTo("Albert");
        assertThat(person.getLastName()).isNull();
        assertThat(person.getAge()).isEqualTo(25);
        assertThat(person.isMarried()).isEqualTo(true);
        assertThat(person.getLastName()).isNotEqualTo("Tommy");
    }

    @Test
    @DisplayName("Task 3: Verify person details")
    public void verifyPersonDetails_task_3() {
        Person person = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);
        assertThat(person.getFirstName()).startsWith("A");
        assertThat(person.getLastName()).doesNotStartWith("T");
        assertThat(person.getFirstName()).contains("ber");
        assertThat(person.getLastName()).endsWith("n");
        assertThat(person.getAge()).isEqualTo(25);
        assertThat(person.getFirstName()).hasSize(6);
//        assertThat(person.getLastName()).LessThan(9);
    }

    @Test
    @DisplayName("Task 4: verify PersonDetails By Comparing With Other Person")
    public void verifyPersonDetailsByComparingWithOtherPerson() {
        Person person1 = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);
        Person person2 = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);

        assertThat(person1).isEqualTo(person2);
    }

    @Test
    @DisplayName("Task 5: verify PersonDetails By Comparing Class Type")
    public void verifyPersonDetailsByComparingClassType() {
        Person person1 = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);
        Person person2 = new Person("Lala", "Berlin", 25, List.of("Munich"), false);

        assertThat(person1).isEqualTo(person2);
        assertThat(person1).isNotEqualTo(person2);

    }

    @Test
    @DisplayName("Task 6: verify PersonDetails By Comparing List elements")
    public void verifyPersonDetailsByComparingList() {
        List<String> citiesVisited = List.of("Berlin", "Munich", "Hamburg", "Frankfurt");
        Person person = new Person("Albert", "Einstein", 25, citiesVisited, true);

        List<String> actualCitiesVisited = person.getCitiesVisited();

        assertThat(actualCitiesVisited).isNotEmpty();
        assertThat(actualCitiesVisited).contains("Frankfurt");
        assertThat(actualCitiesVisited).doesNotContain("Brazil");
    }

    @Test
    @DisplayName("Task 7: verify exception handling cases")
    public void verifyExceptionHandling() {
        List<String> citiesVisited = List.of("Berlin", "Munich", "Hamburg", "Frankfurt");
        Person person = new Person("Albert", "Einstein", 25, citiesVisited, true);

//        assertThat(person.getFirstName()).not(.throws(new IllegalArgumentException))
//        assertThat(person.setFirstName(null))throws(new IllegalArgumentException)
    }

    @Test
    @DisplayName("Task 8: verify with SoftAssertions")
    public void verifyWithSoftAssertions() {
        Person person = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);

        SoftAssertions softly = new SoftAssertions();
       // TODO

    }

    @Test
    @DisplayName("Task 9: verify with SoftAssertions-2")
    public void verifyWithSoftAssertions2() {
        Person person = new Person("Albert", "Einstein", 25, List.of("Munich"), true);

        SoftAssertions softly = new SoftAssertions();
        // TODO
    }

}
