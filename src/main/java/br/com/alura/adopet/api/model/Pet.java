package br.com.alura.adopet.api.model;

import br.com.alura.adopet.api.dto.CadastroAbrigoDto;
import br.com.alura.adopet.api.dto.CadastroPetDto;
import br.com.alura.adopet.api.dto.PetDto;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

;

@Entity
@Table(name = "pets")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoPet tipo;
    
    private String nome;
    
    private String raca;

    private Integer idade;
    
    private String cor;

    private Float peso;

    private Boolean adotado;

    @ManyToOne
    private Abrigo abrigo;

    @OneToOne(mappedBy = "pet")
    private Adocao adocao;

    public Pet(CadastroPetDto petDto, Abrigo abrigo) {
        this.tipo = petDto.tipo();
        this.nome = petDto.nome();
        this.raca = petDto.raca();
        this.idade = petDto.idade();
        this.cor = petDto.cor();
        this.peso = petDto.peso();
        this.abrigo = abrigo;
        this.adotado = false;
    }

}
