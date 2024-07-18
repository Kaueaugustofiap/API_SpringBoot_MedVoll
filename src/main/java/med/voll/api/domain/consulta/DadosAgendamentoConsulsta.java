package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulsta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future //Para dizer que deve ser uma data futura
        LocalDateTime data,

        Especialidade especialidade) {
}
