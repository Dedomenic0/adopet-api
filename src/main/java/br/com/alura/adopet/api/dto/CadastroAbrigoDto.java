package br.com.alura.adopet.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadastroAbrigoDto(
        @NotNull
        Long id,
        @NotBlank
        String nome,
        @NotBlank
        String telefone,
        @Email
        String email
) {
}
