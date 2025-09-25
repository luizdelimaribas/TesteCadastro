package br.loginCadastro.loginCadastro.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Getter
 private long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, max = 10, message = "A senha deve ter entre 6 e 10 caracteres")
    private String senha;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Formato inválido")
    private String email;


}
