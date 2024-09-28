public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Los Guerreros");
        equipo.agregarJugador(new Jugador("Juan", "Delantero"));
        equipo.agregarJugador(new Jugador("Pedro", "Defensa"));
        
        equipo.listarJugadores();

        equipo.eliminarJugador("Juan");
        equipo.listarJugadores();

        equipo.eliminarTodosJugadores();
        equipo.listarJugadores();
    }
}