package homework_4;

/*
Есть такая ситуация: в университете есть лекторы и студенты.
О каждом лекторе известно его имя, фамилия, преподаваемый
предмет(назовеём это специализация) и группа судентов, которую
он курирует. О студенте известно имя, фамилия, курс и специализация.
У студентов должна быть возможность записаться в группу к лектору,
но при таком условии: группа кандидатов должна набраться 5 человек.
Лектор проверяет, что специализация кандидатов соответствует его
собственной и, если ок, то записывает их в свою группу.
*/

public class Runner {
    int numberOfStudents;
    int numberOfProfessors;

    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.numberOfStudents = 100;
        runner.numberOfProfessors = 20;

        Students [] stud = new Students[runner.numberOfStudents];
        Professor [] prof = new Professor[runner.numberOfProfessors];

        runner.createStudents(stud);
        runner.createProfessors(prof);

        for (int i = 0; i < prof.length; i++) {
            runner.assignStudentsToGroups(stud, prof[i]);
        }

    }

    public String selectSubject() {

        int x = (int) (Math.random()*Subjects.subjects.length);
        return Subjects.subjects[x];
    }

    public void createStudents(Students [] stud) {

        for (int i = 0; i < stud.length; i++) {
            String subject = selectSubject();
            stud[i] = new Students("StudentName" + (i + 1), "StudentLastname" + (i + 1), subject, false);
        }
    }

    public void createProfessors(Professor [] prof) {

        for (int i = 0; i < prof.length; i++) {
            String subject = selectSubject();
            prof[i] = new Professor("ProfessorName" + (i + 1), "ProfessorLastname" + (i + 1), subject);
        }
    }

    public void assignStudentsToGroups(Students [] stud, Professor prof) {

        int k = 0;

        System.out.println("\nGroup of " + prof.lastname + ": [" + prof.subject + "]");

        for (int i = 0; i < stud.length; i++) {

            if (k == 5) {
                break;
            }

            if(stud[i].subject.equals(prof.subject) && !stud[i].inGroup) {
                stud[i].inGroup = true;
                k++;
                System.out.println(stud[i].firstname + " " + stud[i].lastname);
            }
        }

    }

}
