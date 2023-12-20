package Interfaces;

import Personas.Cliente;

public interface DAOCliente {
    void registrar(Cliente cliente);
    void modificar(Cliente cliente);
    void eliminar(Cliente cliente);
    void buscar(Cliente cliente);
}

