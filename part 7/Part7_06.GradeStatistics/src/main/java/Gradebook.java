import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gradebook {
    private ArrayList<Integer> grades;

    public Gradebook() {
        this.grades = new ArrayList<>();
    }

    public boolean isValidInput(int grade) {
        return grade >= 0 && grade <= 100;
    }

    public void addGrade(int grade) {
        if (isValidInput(grade)) {
            this.grades.add(grade);
        }
    }

    public String pointAvg() {
        int sum = 0;
        for (int num : this.grades) {
            sum += num;
        }
        return "Point average (all): " + 1.0*sum/this.grades.size();
    }

    public String passPointAvg() {
        ArrayList<Integer> passing = new ArrayList<>();
        int sum = 0;
        for (int num : this.grades) {
            if (num >= 50) {
                passing.add(num);
                sum += num;
            }
        }
        if (passing.isEmpty()) {
            return "Point average (passing): -";
        }
        return "Point average (passing): " + 1.0*sum/passing.size();
    }

    public String peoplePassing() {
        int passing = 0;
        for (int num : this.grades) {
            if (num >= 50) {
                passing++;
            }
        }
        return "Passing percentage: " + 100.0*passing/this.grades.size();
    }

    public int pointToGrade(int point) {
        if (point >= 90) {
            return 5;
        } else if (point >= 80) {
            return 4;
        } else if (point >= 70) {
            return 3;
        } else if (point >= 60) {
            return 2;
        } else if (point >= 50) {
            return 1;
        } else {
            return 0;
        }
    }

    public String gradesToStars(int gradeSearch){
        String stars = "";
        for(int grade: this.grades){
            if(pointToGrade(grade) == gradeSearch){
                stars += "*";
            }
        }
        return stars;
    }

    public String gradeDistribution() {
        return  "Grade distribution: " + "\n" +
                "5: " + this.gradesToStars(5) + "\n" +
                "4: " + this.gradesToStars(4) + "\n" +
                "3: " + this.gradesToStars(3) + "\n" +
                "2: " + this.gradesToStars(2) + "\n" +
                "1: " + this.gradesToStars(1) + "\n" +
                "0: " + this.gradesToStars(0);
    }

    @Override
    public String toString() {
        return pointAvg() + "\n" + passPointAvg() + "\n" +
                peoplePassing() + "\n" + gradeDistribution();
    }
}
