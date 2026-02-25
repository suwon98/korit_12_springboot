package com.todolist.todolist.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RequiredArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long todoId;

    @Column(nullable = false)
    @Getter @Setter
    @NonNull
    private String content;

    @NonNull
    private boolean isCompleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @Getter @Setter
    @NonNull
    @JsonIgnore
    private User user;

}
