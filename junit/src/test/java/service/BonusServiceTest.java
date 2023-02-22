package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {
    
    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto(){
        BonusService service = new BonusService();
        //assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(25000))));
    
        try {
            service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(25000)));
            fail("Não deu exception");
        } catch (Exception e) {
            assertEquals("Funcionario com salário maior que 10 mil não pode receber bônus.", e.getMessage());
        }
        //assertEquals(new BigDecimal("0.00"), calcularBonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal calcularBonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(2500)));
    
        assertEquals(new BigDecimal("250.00"), calcularBonus);
        
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeDezMil(){
        BonusService service = new BonusService();
        BigDecimal calcularBonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(10000)));
    
        assertEquals(new BigDecimal("1000.00"), calcularBonus);
    }
}
