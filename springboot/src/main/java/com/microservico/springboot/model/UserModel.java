package com.microservico.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserModel {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO) //vou utilisar uma estrategia para o banco de dados Javax gerar um ID
    private Long id;
    @NotEmpty (message = "Name is required")
    private String name;
    @NotEmpty (message = "Email is required")
    @Email(message = "Email is invalid")
    //se colocar o email em formato invalido, ja vai fazer essa validacao aqui
    private String email;

}
