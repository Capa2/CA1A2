package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@NamedQuery(name = "Hobby.deleteAllRows", query = "DELETE from Hobby")
public class Hobby implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private String category;
    private String environment;
    
    @ManyToMany(mappedBy = "hobbies")
    private List<Person> persons;

    public Hobby() {
    }

    public Hobby(String name, String url, String category, String environment) {
        this.name = name;
        this.url = url;
        this.category = category;
        this.environment = environment;
        this.persons = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    
    public List<Person> getPersons()
    {
        return persons;
    }
}
