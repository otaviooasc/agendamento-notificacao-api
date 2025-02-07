package com.oasc.agendamento_notificacao_api.controller.dto;

import com.oasc.agendamento_notificacao_api.business.AgendamentoService;
import com.oasc.agendamento_notificacao_api.controller.dto.in.AgendamentoRecordIn;
import com.oasc.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService service;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecordIn request) {
        return ResponseEntity.ok(service.gravarAgendamento(request));
    }
}
