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

        runner.numberOfStudents = 25;
        runner.numberOfProfessors = 5;

        Students [] stud = new Students[runner.numberOfStudents];
        Professor [] prof = new Professor[runner.numberOfProfessors];

        runner.createStudents(stud);
        runner.createProfessors(prof);
//        for (int i = 0; i < stud.length; i++) {
//            System.out.println(stud[i].firstname + " " + stud[i].lastname + " " + stud[i].subject);
//        }
//        for (int i = 0; i < prof.length; i++) {
//            System.out.println(prof[i].firstname + " " + prof[i].lastname + " " + prof[i].subject);
//        }

        runner.assignStudentsToGroups(stud, prof);
    }

    public void createStudents(Students [] stud) {

        for (int i = 0; i < stud.length; i++) {
            String subject = selectSubject();
            stud[i] = new Students("StudentName" + i, "StudentLastname" + i, subject);
        }
    }

    public void createProfessors(Professor [] prof) {

        for (int i = 0; i < prof.length; i++) {
            String subject = selectSubject();
            prof[i] = new Professor("ProfessorName" + i, "ProfessorLastname" + i, subject);
        }
    }

    public void assignStudentsToGroups(Students [] stud, Professor [] prof) {


        for (int i = 0; i < prof.length ; i++) {


            for (int j = 0; j < stud.length; j++) {


            }
        }
    }


    public String selectSubject() {

        int x = (int) (Math.random()*Subjects.subjects.length);
        return Subjects.subjects[x];
    }
}
