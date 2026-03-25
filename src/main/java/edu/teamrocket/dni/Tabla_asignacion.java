package edu.teamrocket.dni;

public class Tabla_asignacion {

    private final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    public Tabla_asignacion() {};

    private int get_modulo() {
        return this.tabla.length;
    }

    public char calcular_letra(String DNI) {
        int dni = Integer.parseInt(DNI);
        int posicion = dni % get_modulo();
        return get_letra(posicion);
    }

    public char get_letra(int posicion) throws ArrayIndexOutOfBoundsException {

        try {
            return this.tabla[posicion];
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            throw new ArrayIndexOutOfBoundsException(
                    "Posición fuera de los límites de la tabla de asignación"
            );
        }

    }

    public boolean is_letra_permitida (char letra) {
        String tabla_string = String.valueOf(tabla);
        return tabla_string.contains(Character.toString(letra));
    }

}
