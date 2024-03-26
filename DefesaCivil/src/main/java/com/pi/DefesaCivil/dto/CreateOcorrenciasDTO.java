package com.pi.DefesaCivil.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOcorrenciasDTO {
    
    @NotBlank(message = "A descrição é obrigatória!")
    private String descricao;

    @NotBlank(message = "O nome do solicitante é obrigatório!")
    private String nomeSolicitante;
    
    @NotBlank(message = "O número de contato é obrigatório!")
    private String contato;

    // Outros campos necessários para criar uma ocorrência, se houver

}