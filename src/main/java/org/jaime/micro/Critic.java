package org.jaime.micro;

import java.util.Set;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "critics")
public class Critic extends PanacheEntity {
    @Column(nullable = false, unique = true)
    public String name;

    @OneToMany(mappedBy = "critic")
    public Set<Review> reviews;
} 