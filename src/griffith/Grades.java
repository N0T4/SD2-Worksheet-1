package griffith;

public class Grades {

    // Find the maximum grade
    public int gradesMax(int[] grades) {
        if (grades.length == 0) return 0; // Handle empty array case
        
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    // Calculate the total of grades
    public int gradesTotal(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    // Calculate the average of grades
    public double gradesAverage(int[] grades) {
        if (grades.length == 0) return 0; // Handle empty array case
        
        return (double) gradesTotal(grades) / grades.length;
    }

    // Count grades below minGrade
    public int countFails(int[] grades, int minGrade) {
        int count = 0;
        for (int grade : grades) {
            if (grade < minGrade) {
                count++;
            }
        }
        return count;
    }
}


