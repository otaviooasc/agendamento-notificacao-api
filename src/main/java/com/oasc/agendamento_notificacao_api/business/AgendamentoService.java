package com.oasc.agendamento_notificacao_api.business;

import com.oasc.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.oasc.agendamento_notificacao_api.controller.dto.in.AgendamentoRecordIn;
import com.oasc.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.oasc.agendamento_notificacao_api.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository repository;

    private final IAgendamentoMapper mapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecordIn agendamentoRecordIn) {
        return mapper.paraOut(
                repository.save(
                        mapper.paraEntity(agendamentoRecordIn)
                )
        );
    }
}
