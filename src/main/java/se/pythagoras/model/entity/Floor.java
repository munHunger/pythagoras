package se.pythagoras.model.entity;

import javax.persistence.*;

@Table(name = "floor")
@Entity
public class Floor {
    @Column(length = 64)
    @Id
    private String id;
    @Column
    private int area;
    @Column
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "parent")
    private Building parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Building getParent() {
        return parent;
    }

    public void setParent(Building parent) {
        this.parent = parent;
    }
}
