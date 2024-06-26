package service;

import dao.IContratoDAO;

public class ContratoService implements IContratoService {

    IContratoDAO dao;

    public ContratoService(IContratoDAO dao){
        this.dao = dao;
    }


    @Override
    public String salvar() {
        dao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        dao.buscar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        dao.excluir();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        dao.atualizar();
        return "Sucesso";
    }
}
