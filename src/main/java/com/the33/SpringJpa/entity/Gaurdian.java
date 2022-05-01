package com.the33.SpringJpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides(
        @AttributeOverride(name ="g_name", column = @Column(name = "name")))

public class Gaurdian {



    private String name;
    private String relation;


}
