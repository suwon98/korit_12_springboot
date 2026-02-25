package com.todolist.todolist.domain;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter
    @NonNull
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    @NonNull
    @Getter @Setter
    private String password;

    @Column(nullable = false)
    @NonNull
    @Getter @Setter
    private String role;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @Getter @Setter
    private List<Todo> todos;

}
