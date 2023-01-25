package W_02.P01_Collections;

import java.util.Objects;

public class P_Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public P_Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        P_Student pStudent = (P_Student) o;
        return id == pStudent.id && Objects.equals(name, pStudent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
