package com.map.mapping.Entities;

import jakarta.persistence.*;
import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="Laptop")
public class Laptop {

    @Id
    private int laptopId;
    private  String modelNumber;
    private String brand;

    //to create a foreign key
    @OneToOne
    //to name reference column name
    @JoinColumn(name ="student_id")
    private Student student;
}
