/*
 * Concept: Method Overriding
Create an educational content system where different course types display progress
differently:
● Video courses show completion percentage and watch time
● Interactive courses show quiz scores and hands-on projects completed
● Reading courses show pages read and note-taking progress
● Certification courses show exam attempts and certification status
All courses share basic info (title, instructor, enrollment date) but track and display
progress uniquely.
Hint: Common learning foundation, specialized progress tracking per course
type!
 */

import java.util.Date;

// Common learning foundation
class Course {
    protected String title;
    protected String instructor;
    protected Date enrollmentDate;

    public Course(String title, String instructor, Date enrollmentDate) {
        this.title = title;
        this.instructor = instructor;
        this.enrollmentDate = enrollmentDate;
    }

    public void displayProgress() {
        System.out.println("Progress for course: " + title);
    }
}

// Video course
class VideoCourse extends Course {
    private double completionPercentage;
    private int watchTimeMinutes;

    public VideoCourse(String title, String instructor, Date enrollmentDate, double completionPercentage, int watchTimeMinutes) {
        super(title, instructor, enrollmentDate);
        this.completionPercentage = completionPercentage;
        this.watchTimeMinutes = watchTimeMinutes;
    }

    @Override
    public void displayProgress() {
        System.out.println("Video Course: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled on: " + enrollmentDate);
        System.out.println("Completion: " + completionPercentage + "%");
        System.out.println("Watch Time: " + watchTimeMinutes + " minutes");
    }
}

// Interactive course
class InteractiveCourse extends Course {
    private int quizScore;
    private int projectsCompleted;

    public InteractiveCourse(String title, String instructor, Date enrollmentDate, int quizScore, int projectsCompleted) {
        super(title, instructor, enrollmentDate);
        this.quizScore = quizScore;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public void displayProgress() {
        System.out.println("Interactive Course: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled on: " + enrollmentDate);
        System.out.println("Quiz Score: " + quizScore);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}

// Reading course
class ReadingCourse extends Course {
    private int pagesRead;
    private int notesTaken;

    public ReadingCourse(String title, String instructor, Date enrollmentDate, int pagesRead, int notesTaken) {
        super(title, instructor, enrollmentDate);
        this.pagesRead = pagesRead;
        this.notesTaken = notesTaken;
    }

    @Override
    public void displayProgress() {
        System.out.println("Reading Course: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled on: " + enrollmentDate);
        System.out.println("Pages Read: " + pagesRead);
        System.out.println("Notes Taken: " + notesTaken);
    }
}

// Certification course
class CertificationCourse extends Course {
    private int examAttempts;
    private boolean certified;

    public CertificationCourse(String title, String instructor, Date enrollmentDate, int examAttempts, boolean certified) {
        super(title, instructor, enrollmentDate);
        this.examAttempts = examAttempts;
        this.certified = certified;
    }

    @Override
    public void displayProgress() {
        System.out.println("Certification Course: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled on: " + enrollmentDate);
        System.out.println("Exam Attempts: " + examAttempts);
        System.out.println("Certification Status: " + (certified ? "Certified" : "Not Certified"));
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Date now = new Date();

        VideoCourse vc = new VideoCourse("Java Basics", "Dr. Smith", now, 75.5, 120);
        InteractiveCourse ic = new InteractiveCourse("Python Interactive", "Ms. Lee", now, 85, 3);
        ReadingCourse rc = new ReadingCourse("History 101", "Mr. Brown", now, 150, 10);
        CertificationCourse cc = new CertificationCourse("AWS Certification", "Mrs. Green", now, 2, true);

        vc.displayProgress();
        System.out.println();
        ic.displayProgress();
        System.out.println();
        rc.displayProgress();
        System.out.println();
        cc.displayProgress();
    }
}