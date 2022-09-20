package exemploci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacoesTest {
    

    @Test
    public void check_can_sum_numbers(){
        int x1 = 10;
        int x2 = 10;
        int resp = x1+x2-1;

        Operacoes op = new Operacoes();

        int res = op.soma(x1, x2);

        assertEquals(resp, res);
    }
}
