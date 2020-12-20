/*
PRII_U2_01_PEDIDOSPIZZA
contruir una app para llevar el conteo y registro de pedidos de pizzas
el usuario podra escoger tipo, tamaño e ingredientes extras de una pizza, 
del mismo modo se debe determinar automaticamente el costo a partir de los 
eventos de seleccion del usuario.

se empleara un componente que permita llevar paginas de trabajo, por ejemplo,
componentes de seleccion estaran en una pagina y en otra se llevara un listado 
de pedidos y caracteristicas de los mismos.

la imagen asocida al tipo de pizza cambiara dinamicamente en funcion de la seleccion 
del usuario.

se debe generar nota por cada pedido. en la pagina de listado de pedidos debe ser
posible para generar la nota de algun pedido anterior.
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ventana v = new ventana();
        v.setLocationRelativeTo(null);
        v.setTitle("Pizzeria 'Juanita' ");
        v.setVisible(true);
    }
    
}
