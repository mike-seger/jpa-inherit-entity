package com.net128.test.app.inheritentity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class X extends Y {

    @Column
    private String xattr1;
    
    @Column
    private String xattr2;

}