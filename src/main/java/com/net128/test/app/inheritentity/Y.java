package com.net128.test.app.inheritentity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Y {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String yattr1;
    
    @Column
    private String yattr2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Y y)) return false;
        return Objects.equals(id, y.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}