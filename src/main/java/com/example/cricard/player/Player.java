package com.example.cricard.player;


import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private long id;
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private String mobile;

}
