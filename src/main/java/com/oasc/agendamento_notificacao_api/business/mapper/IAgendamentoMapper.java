package com.oasc.agendamento_notificacao_api.business.mapper;

import com.oasc.agendamento_notificacao_api.controller.dto.in.AgendamentoRecordIn;
import com.oasc.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.oasc.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecordIn agendamentoRecordIn);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
