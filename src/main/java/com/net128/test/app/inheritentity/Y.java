package com.net128.test.app.inheritentity;

import lombok.*;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Y extends Identifiable {
    @Column
    private String yattr1;
    
    @Column
    private String yattr2;
}