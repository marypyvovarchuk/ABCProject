package com.ABCProject;

@Entity
@Table(name = "role")
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", nullable = false)
    var id: Long,
    var name: String;
    @OneToMany(targetEntity = User.class)
    var users: List<User>;
}