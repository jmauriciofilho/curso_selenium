package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.TesteCadastro;
import test.TesteCampoTreinamento;
import test.TesteRegrasCadastro;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TesteCadastro.class,
        TesteRegrasCadastro.class,
        TesteCampoTreinamento.class
})
public class SuiteTeste {}
