package Objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Author {

    private String name;
    private Date birthday;
    private long id;

    public Author() {
    }

    public Author(String name, Date birthday, long id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        SimpleDateFormat smp = new SimpleDateFormat("dd-MMMM-yyyy");
        return name + " " + smp.format(birthday);
    }
}
