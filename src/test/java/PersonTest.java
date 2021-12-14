package test.java;

import main.java.Person;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Task 1: Verify person details")
    public void verifyPersonDetails_task_1() {
        Person person = new Person("Albert", "Einstein", 25, List.of("Berlin"), false);

       // TODO
    }

    @Test
    @DisplayName("Task 2: Verify person details")
    public void verifyPersonDetails_task_2() {
        Person person = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);

       // TODO
    }

    @Test
    @DisplayName("Task 3: Verify person details")
    public void verifyPersonDetails_task_3() {
        Person person = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);

       // TODO
    }

    @Test
    @DisplayName("Task 4: verify PersonDetails By Comparing With Other Person")
    public void verifyPersonDetailsByComparingWithOtherPerson() {
        Person person1 = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);
        Person person2 = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);


        // TODO
    }

    @Test
    @DisplayName("Task 5: verify PersonDetails By Comparing Class Type")
    public void verifyPersonDetailsByComparingClassType() {
        Person person1 = new Person("Albert", "Einstein", 25, List.of("Berlin"), true);
        Person person2 = new Person("Lala", "Berlin", 25, List.of("Munich"), false);

       // TODO

    }

    @Test
    @DisplayName("Task 6: verify PersonDetails By Comparing List elements")
    public void verifyPersonDetailsByComparingList() {
        List<String> citiesVisited = List.of("Berlin", "Munich", "Hamburg", "Frankfurt");
        Person person = new Person("Albert", "Einstein", 25, citiesVisited, true);

        List<String> actualCitiesVisited = person.getCitiesVisited();

        // TODO
    }

    @Test
    @DisplayName("Task 7: verify exception handling cases")
    public void verifyExceptionHandling() {
        List<String> citiesVisited = List.of("Berlin", "Munich", "Hamburg", "Frankfurt");
        Person person = new Person("Albert", "Einstein", 25, citiesVisited, true);

        // TODO
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
