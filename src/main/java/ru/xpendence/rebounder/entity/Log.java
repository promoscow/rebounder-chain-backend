package ru.xpendence.rebounder.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 14.04.19
 * Time: 21:20
 * e-mail: 2262288@gmail.com
 */
@Entity
@Table(name = "request_logs")
public class Log implements Serializable {

    private Long id;
    private LocalDateTime created;

    public Log() {
    }

    public Log(Long id, LocalDateTime created) {
        this.id = id;
        this.created = created;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    public LocalDateTime getCreated() {
        return created;
    }

    @PrePersist
    public void prePersist() {
        this.created = LocalDateTime.now();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", created=" + created +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(id, log.id) &&
                Objects.equals(created, log.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created);
    }
}
