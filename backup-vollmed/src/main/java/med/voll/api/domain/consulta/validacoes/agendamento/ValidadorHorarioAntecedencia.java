package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.consulta.validacoes.cancelamento.ValidadorCancelamentoDeConsulta;
import med.voll.api.infra.DadosCancelamentoConsulta;
import org.springframework.stereotype.Component;

@Component("ValidadorHorarioAntecedenciaCancelamento")
public class ValidadorHorarioAntecedencia implements ValidadorCancelamentoDeConsulta {
    @Override
    public void validar(DadosCancelamentoConsulta dados) {

    }
}
