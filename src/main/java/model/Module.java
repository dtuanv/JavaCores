package model;

import java.util.Objects;

public class Module {
    private long id;

    private String name;
    private String nameIntern;

    public Module(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Module(long id, String name, String nameIntern) {
        this.id = id;
        this.name = name;
        this.nameIntern = nameIntern;
    }
    public String getNameIntern() {
        return nameIntern;
    }

    public void setNameIntern(String nameIntern) {
        this.nameIntern = nameIntern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return id == module.id && Objects.equals(name, module.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameIntern);
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
