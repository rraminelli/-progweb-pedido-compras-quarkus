package br.rraminelli.dto.pedido;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ItemPedidoDto {

    @NotNull
    private Long produtoId;

    @NotNull
    private Integer quantidade;

}
