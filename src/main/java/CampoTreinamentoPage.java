import org.openqa.selenium.WebDriver;

public class CampoTreinamentoPage {

    private DSL dsl;

    public CampoTreinamentoPage(WebDriver driver) {
        dsl = new DSL(driver);
    }

    public void setNome(String name){
        dsl.escrever("elementosForm:nome", name);
    }

    public void setSobreNome(String sobreNome){
        dsl.escrever("elementosForm:sobrenome", sobreNome);
    }

    public void setSexoMasculino(){
        dsl.clicarRadio("elementosForm:sexo:0");
    }

    public void setSexoFeminino(){
        dsl.clicarRadio("elementosForm:sexo:1");
    }

    public void setComidaPizza(){
        dsl.clicarRadio("elementosForm:comidaFavorita:2");
    }

    public void setComidaCarne(){
        dsl.clicarRadio("elementosForm:comidaFavorita:0");
    }

    public void setComidaPVegetariano(){
        dsl.clicarRadio("elementosForm:comidaFavorita:3");
    }

    public void setEscolaridade(String valor){
        dsl.selecionarCombo("elementosForm:escolaridade", valor);
    }

    public void setEsporte(String... valores){
        for(String valor: valores){
            dsl.selecionarCombo("elementosForm:esportes", valor);
        }
    }

    public void cadastrar(){
        dsl.clicarBotao("elementosForm:cadastrar");
    }

    public String obterResultadoCadastro(){
        return dsl.obterTexto("resultado");
    }

    public String obterNomeCadastro(){
        return dsl.obterTexto("descNome");
    }

    public String obterSobreNomeCadastro(){
        return dsl.obterTexto("descSobrenome");
    }

    public String obterSexoCadastro(){
        return dsl.obterTexto("descSexo");
    }

    public String obterComidaCadastro(){
        return dsl.obterTexto("descComida");
    }

    public String obterEscolaridadeCadastro(){
        return dsl.obterTexto("descEscolaridade");
    }

    public String obterEsporteCadastro(){
        return dsl.obterTexto("descEsportes");
    }
}
