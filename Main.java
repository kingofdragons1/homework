import java.time.LocalTime;

class Student {
    void learn() {
        System.out.println("Я учусь. .zZ");
    }

    void finishLearning() {
        System.out.println("Я закончил учиться");
    }
}

class StudentWithClock extends Student {
    @Override
    void learn() {
        super.learn(); // Вызываем метод learn() из родительского класса
        printCurrentTime();
    }

    private void printCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        System.out.printf("Текущее время: %02d:%02d:%02d%n", currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
    }
}

public class Main {
    public static void main(String[] args) {
        StudentWithClock student = new StudentWithClock();
        student.learn();
        student.finishLearning();
    }
}
