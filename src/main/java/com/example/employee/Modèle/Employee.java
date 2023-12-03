package com.example.employee.Modèle;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate

@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="emp_id") private Long id;
    @Column(name="firstname") private String firstName;
    @Column(name="lastname") private String lastName;
    @Column(name="email_id") private String emailId;
}
