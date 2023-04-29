package Question_39;

import java.util.ArrayList;

class CRUDPessoa implements CRUD<Pessoa> {
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public void create(Pessoa obj) {
        lista.add(obj);
    }

    public Pessoa read(int index) {
        return lista.get(index);
    }

    public void update(int index, Pessoa obj) {
        lista.set(index, obj);
    }

    public void delete(int index) {
        lista.remove(index);
    }

    public ArrayList<Pessoa> getAll() {
        return lista;
    }
}

