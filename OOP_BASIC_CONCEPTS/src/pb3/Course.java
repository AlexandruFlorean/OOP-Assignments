package pb3;

public class Course {
    private Student[] student;
    private Grade[] grade;

    public Course(Student[] student, Grade[] grade) {
        this.grade = grade;
        this.student = student;
    }

    public void gradeAverage() {
        int sumMin = 0;
        int sumMax = 0;
        for (int i = 0; i < student.length; i++) {
            int sum = 0;
            int j;
            for (j = 0; j < grade[i].lenghtArray(); j++) {
                sum += grade[i].getArray(j);
            }
            sum /= ++j;
            System.out.println(student[i] + "average: " + sum);
            if(i == 0) {
                sumMax = sumMin = sum;
            } else {
                if(sumMax < sum) {
                    sumMax = sum;
                }
                if(sumMin > sum) {
                    sumMin = sum;
                }
            }
        }
        System.out.println("Highest grade average: " + sumMax + '\'' +
                           "lowest grade average: " + sumMin);
    }
}
