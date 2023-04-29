package Question_39;

import java.util.ArrayList;

interface CRUD<T> {
        void create(T obj);
        T read(int index);
        void update(int index, T obj);
        void delete(int index);
        ArrayList<T> getAll();
    }

    public class TestaCRUD {
        public static void main(String[] args) {
            CRUD<Integer> crudInt = new CRUDInteger();
            crudInt.create(1);
            crudInt.create(2);
            crudInt.create(3);

            System.out.println("Valores iniciais: " + crudInt.getAll());
            crudInt.update(1, 4);
            System.out.println("Depois do update: " + crudInt.getAll());
            crudInt.delete(0);
            System.out.println("Depois do delete: " + crudInt.getAll());

            CRUD<Pessoa> crudPessoa = new CRUDPessoa();
            crudPessoa.create(new Pessoa("Ana", 25, "F"));
            crudPessoa.create(new Pessoa("João", 30, "M"));
            crudPessoa.create(new Pessoa("Maria", 40, "F"));

            System.out.println("Pessoas iniciais: " + crudPessoa.getAll());
            crudPessoa.update(1, new Pessoa("Pedro", 35, "M"));
            System.out.println("Depois do update: " + crudPessoa.getAll());
            crudPessoa.delete(0);
            System.out.println("Depois do delete: " + crudPessoa.getAll());
        }
    }

