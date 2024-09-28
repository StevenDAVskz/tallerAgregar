import java.util.ArrayList;

class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        System.out.println("Jugador " + jugador.getNombre() + " agregado al equipo " + nombre + ".");
    }

    public Jugador buscarJugador(String nombre) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                return jugador;
            }
        }
        return null;
    }

    public void eliminarJugador(String nombre) {
        Jugador jugador = buscarJugador(nombre);
        if (jugador != null) {
            jugadores.remove(jugador);
            System.out.println("Jugador " + nombre + " eliminado del equipo " + this.nombre + ".");
        } else {
            System.out.println("Jugador " + nombre + " no encontrado.");
        }
    }

    public void eliminarTodosJugadores() {
        jugadores.clear();
        System.out.println("Todos los jugadores han sido eliminados del equipo " + nombre + ".");
    }

    public void listarJugadores() {
        if (!jugadores.isEmpty()) {
            System.out.println("Jugadores en el equipo " + nombre + ":");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        } else {
            System.out.println("No hay jugadores en el equipo " + nombre + ".");
        }
    }
}
