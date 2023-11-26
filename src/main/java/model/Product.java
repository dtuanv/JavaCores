package model;

import java.util.Set;

public class Product {
    private long id;
    private String name;

    private Set<Module> moduleSet;


    public Product(long id, String name, Set<Module> moduleSet) {
        this.id = id;
        this.name = name;
        this.moduleSet = moduleSet;
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

    public Set<Module> getModuleSet() {
        return moduleSet;
    }

    public void setModuleSet(Set<Module> moduleSet) {
        this.moduleSet = moduleSet;
    }


}
