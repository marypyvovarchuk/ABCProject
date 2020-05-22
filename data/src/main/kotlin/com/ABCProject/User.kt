package com.ABCProject;

@Entity
@Table(name = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", nullable = false)
    var id: Long,
    var email: String;
    var username: String;
    var password: String;
    var role: Role;
    var image: String;
}