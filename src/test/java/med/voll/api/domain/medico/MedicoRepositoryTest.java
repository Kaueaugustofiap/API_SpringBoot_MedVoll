package med.voll.api.domain.medico;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest //anotação para testar uma interface Repository
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //Dizer para o spring utliziar o mesmo
// banco de dados da aplicação que é MySQL, mas vamos falar para utilizar outro banco para não interferir nos registros.
@ActiveProfiles("test")//Dizer para utilizar o o application-test
class MedicoRepositoryTest {

    @Test
    void escolherMedicoAleatorioLivreNaData() {
    }
}