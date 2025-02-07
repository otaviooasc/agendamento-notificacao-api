package com.oasc.agendamento_notificacao_api.infrastructure.entities;

import com.oasc.agendamento_notificacao_api.infrastructure.enums.StatusNotificacaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "agendamento")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailDestinatario;

    private String telefoneDestinatario;

    private LocalDateTime dataHoraEnvio;

    private LocalDateTime dataHoraAgendamento;

    private LocalDateTime dataHoraModificacao;

    private String mensagem;

    private StatusNotificacaoEnum statusNotificacaoEnum;

    @PrePersist
    private void prePersist(){
        dataHoraAgendamento = LocalDateTime.now();
        statusNotificacaoEnum = StatusNotificacaoEnum.AGENDADO;
    }
}
