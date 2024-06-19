package com.map.mapping.Entities;

import jakarta.persistence.*;
import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="Student")
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String Address;

    //foreign key will not be made but will be mapped with the foreign key created in Laptop file
    //cascade is used for saving file with foreign key without creating its repository
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;
}
