package Question_39;

import java.util.ArrayList;

class CRUDInteger implements CRUD<Integer> {
    private ArrayList<Integer> lista = new ArrayList<Integer>();

    public void create(Integer obj) {
        lista.add(obj);
    }

    public Integer read(int index) {
        return lista.get(index);
    }

    public void update(int index, Integer obj) {
        lista.set(index, obj);
    }

    public void delete(int index) {
        lista.remove(index);
    }

    public ArrayList<Integer> getAll() {
        return lista;
    }
}
