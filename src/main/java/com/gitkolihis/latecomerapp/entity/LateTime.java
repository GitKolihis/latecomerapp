package com.gitkolihis.latecomerapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@Entity(name = "latetime")
public class LateTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Time maxtime;

    @CreationTimestamp
    private Timestamp created_at;

    @UpdateTimestamp
    private Timestamp updated_at;
}
