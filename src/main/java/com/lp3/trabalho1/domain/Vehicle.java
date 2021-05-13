package com.lp3.trabalho1.domain;

import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "id_company")
    @ManyToOne
    private Company companyId;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private String plate;

    @Column
    private Date createdDate;

    @Column
    private Date updatedDate;

    @Column
    private String customFields;

    @Column
    private Integer status;
}
