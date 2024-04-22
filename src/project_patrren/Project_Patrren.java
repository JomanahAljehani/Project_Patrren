package project_patrren;
import java.util.ArrayList;
import java.util.List;

class Course {
    private final String title;
    private final String description;
    private final List<Video> videos;
    private final List<Quiz> quizzes;
    private final List<Assignment> assignments;

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
        this.videos = new ArrayList<>();
        this.quizzes = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    // Methods for managing videos, quizzes, and assignments within the course
    // ...
}

// User class represents a user (student or instructor) of the platform
class User {
    private final String username;
    private final String email;
    private final boolean isInstructor;

    public User(String username, String email, boolean isInstructor) {
        this.username = username;
        this.email = email;
        this.isInstructor = isInstructor;
    }

    // Methods for managing user profile and authentication
    // ...
}

// Video class represents a video lesson within a course
class Video {
    private final String title;
    private final String url;
    private final int duration; // in minutes

    public Video(String title, String url, int duration) {
        this.title = title;
        this.url = url;
        this.duration = duration;
    }

    // Methods for managing video playback and information
    // ...
}

// Quiz class represents a quiz associated with a course
class Quiz {
    private final String title;
    private final List<Question> questions;

    public Quiz(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    // Methods for managing quiz questions and answers
    // ...
}

// Assignment class represents an assignment associated with a course
class Assignment {
    private final String title;
    private final String description;
    private final String submissionUrl;

    public Assignment(String title, String description, String submissionUrl) {
        this.title = title;
        this.description = description;
        this.submissionUrl = submissionUrl;
    }

    // Methods for managing assignment details and submissions
    // ...
}

// Enrollment class represents a user's enrollment in a course
class Enrollment {
    private final Course course;
    private final User user;

    public Enrollment(Course course, User user) {
        this.course = course;
        this.user = user;
    }

    // Methods for managing course enrollment and access
    // ...
}

// Platform class represents the online learning platform itself, managing courses, users, and enrollments
class Platform {
    private final List<Course> courses;
    private final List<User> users;
    private final List<Enrollment> enrollments;

    public Platform() {
        this.courses = new ArrayList<>();
        this.users = new ArrayList<>();
        this.enrollments = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    // Methods for managing courses, users, and enrollments on the platform
    // ...
}

public class Project_Patrren {
    public static void main(String[] args) {
        // Create an instance of the online learning platform
        Platform platform = new Platform();

// Create some courses
        Course course1 = new Course("Java Programming", "Learn Java from scratch");
        Course course2 = new Course("Web Development", "Build modern web applications");

        // Create some users
        User user1 = new User("Jomanah", "jomanah.doe@example.com", false);
        User user2 = new User("Jane", "jana.smith@example.com", true);

        // Enroll users in courses
        Enrollment enrollment1 = new Enrollment(course1, user1);
        Enrollment enrollment2 = new Enrollment(course2, user2);

        // Add courses, users, and enrollments to the platform
        platform.addCourse(course1);
        platform.addCourse(course2);
        platform.addUser(user1);
        platform.addUser(user2);
        platform.addEnrollment(enrollment1);
        platform.addEnrollment(enrollment2);

        // Perform operations on the platform, such as accessing courses, managing users, etc.

        // Example: Retrieve all courses available on the platform
        List<Course> availableCourses = platform.getAllCourses();
        System.out.println("Available Courses:");
        availableCourses.forEach((course) -> {
            System.out.println(course.getTitle());
        });
    }
    
}


