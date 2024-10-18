package modelo;
/**
 * Interfaz que define las operaciones que se pueden realizar sobre un pedido.
 */
public interface OperacionesReserva {
    void reservarAsiento(String asiento, Cliente cliente);
    void cancelarReserva();

}
