enum classType {
    cardio,
    Strength,
    Relaxation
}

class gymClass {
    classType Type;
    String className;
    String teacherName;

    gymClass(classType Type, String className, String teacherName) {
        this.Type = Type;
        this.className = className;
        this.teacherName = teacherName;
    }

    public classType getType() {
        return Type;
    }

    public String getName() {
        return className;
    }

    public String getTeacherName() {
        return teacherName;
    }
}

public class StreamingSite {

}
