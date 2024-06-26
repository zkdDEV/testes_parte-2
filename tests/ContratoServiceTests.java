import dao.ContratoDAO;
import dao.IContratoDAO;
import dao.mocks.ContratoDAOMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTests {

    // Testes de Salvar
    @Test
    public void salvarTest(){
        IContratoDAO daoMock = new ContratoDAOMock();
        IContratoService service = new ContratoService(daoMock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    // Testes de Buscar
    @Test
    public void buscarTest(){
        IContratoDAO daoMock = new ContratoDAOMock();
        IContratoService service = new ContratoService(daoMock);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest(){
        IContratoDAO daoMock = new ContratoDAO();
        IContratoService service = new ContratoService(daoMock);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    // Testes de Excluir
    @Test
    public void excluirTest(){
        IContratoDAO daoMock = new ContratoDAOMock();
        IContratoService service = new ContratoService(daoMock);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest(){
        IContratoDAO daoMock = new ContratoDAO();
        IContratoService service = new ContratoService(daoMock);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    // Testes de Atualizar
    @Test
    public void atualizarTest(){
        IContratoDAO daoMock = new ContratoDAOMock();
        IContratoService service = new ContratoService(daoMock);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest(){
        IContratoDAO daoMock = new ContratoDAO();
        IContratoService service = new ContratoService(daoMock);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
