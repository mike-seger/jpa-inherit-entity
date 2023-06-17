package com.net128.test.app.inheritentity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class W extends Y {

    @Column
    private String wattr1;
    
    @Column
    private String wattr2;

}