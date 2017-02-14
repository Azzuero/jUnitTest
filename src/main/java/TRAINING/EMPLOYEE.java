package TRAINING;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class EMPLOYEE {
    private String crmd;
    private String ambient;
    private String position;

    @Id
    @Column(name = "CRMD", nullable = false, length = 10)
    public String getCrmd() {
        return crmd;
    }

    public void setCrmd(String crmd) {
        this.crmd = crmd;
    }

    @Basic
    @Column(name = "AMBIENT", nullable = true, length = 20)
    public String getAmbient() {
        return ambient;
    }

    public void setAmbient(String ambient) {
        this.ambient = ambient;
    }

    @Basic
    @Column(name = "POSITION", nullable = true, length = 20)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}