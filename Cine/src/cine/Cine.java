
package cine;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;

public class Cine {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        /*
//RECOMENDACION:

        Recomendacion ejecutar = new Recomendacion();
        
        System.out.println("Porfa vor ingrese su edad");
        int EDAD=sc.nextInt();
        
        String Pel = ejecutar.RecomendarPel(EDAD);
        System.out.println(Pel);
        
//CAMPEONATO:
        Campeonato clasificacion = new Campeonato();

        while (true) {
            System.out.println("Ingrese el resultado del partido:");
            System.out.println("1. Equipo 1 gana");
            System.out.println("2. Equipo 2 gana");
            System.out.println("3. Empate");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1-4): ");
            
            int opcion = sc.nextInt();

            if (opcion == 4) {
                System.out.println("Gracias por usar el sistema de clasificación. ¡Adiós!");
                break;
            } else {
                clasificacion.procesarResultado(opcion); 
                clasificacion.mostrarClasificacion();

            }
        }
        
//MENU RESTAURANTE:
        double totalPlatos = 0.0;
        double totalBebidas = 0.0;
        double totalGeneral;
        
        System.out.println("Menú de Platos:");
        System.out.println("1. Plato 1 - $20000");
        System.out.println("2. Plato 2 - $10000");
        System.out.println("3. Plato 3 - $15000");
        System.out.print("Seleccione un plato (1-3): ");
        int opcionPlato = sc.nextInt();
        totalPlatos += MenuRestaurante.obtenerPrecioPlato(opcionPlato);
        
        
        System.out.println("Menú de Bebidas:");
        System.out.println("1. Bebida 1 - $2500");
        System.out.println("2. Bebida 2 - $3000");
        System.out.println("3. Bebida 3 - $1700");
        System.out.print("Seleccione una bebida (1-3): ");
        int opcionBebida = sc.nextInt();
        totalBebidas += MenuRestaurante.obtenerPrecioBebida(opcionBebida);
        
        totalGeneral = totalPlatos + totalBebidas;
        
        System.out.println("Total antes de descuento: $" + totalGeneral);
        
        System.out.println("Método de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de crédito");
        System.out.println("3. Cheque");
        System.out.print("Seleccione un método de pago (1-3): ");
        int metodoPago = sc.nextInt();
        
        double descuento = MenuRestaurante.calcularDescuento(totalGeneral, metodoPago);
        totalGeneral -= descuento;
        
        System.out.println("Resumen de la factura:");
        System.out.println("Total de platos: $" + totalPlatos);
        System.out.println("Total de bebidas: $" + totalBebidas);
        System.out.println("Descuento aplicado: -$" + descuento);
        System.out.println("Total a pagar: $" + totalGeneral);
        
//CAJERO AUTOMATICO:
        CajeroAutomatico cajero = new CajeroAutomatico(100000);
        
        while (true){
            
            System.out.println("Saldo disponible: "+cajero.ObtenerSaldo());
            System.out.println("Ingrese el monto a retirar");
            double montoRetirar=sc.nextDouble();
            String resultado = cajero.retirar(montoRetirar);
            System.out.println(resultado);
            System.out.println("Desea realizar otro retiro? (S/N):");
            char opcion = sc.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por usar el cajero automatico... Hasta pronto!");
                break;
            }
        }
        
//CARRITO DE COMPRAS:
        CarritoCompras carrito = new CarritoCompras();
        
        while(true){
        System.out.println("Ingrese el precio del producto");
        double PRECIO=sc.nextDouble();
        System.out.println("Ingrese la cantidad que va a llevar del producto");
        int CANTIDAD=sc.nextInt();    
        
        carrito.AgregarProducto(CANTIDAD, PRECIO);
        System.out.println("El costo total hasta el momento es de: "+carrito.ObtenerTotal());
        System.out.println("Desea agregar otro producto a la compra? (S/N): ");
            char opcion = sc.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("El costo total de la compra es: "+carrito.ObtenerTotal());
                System.out.println("Gracias por su compra, Hasta luego!");
            break;
        }
    }
        
//IMPRESORA:

        Impresora Imp=new Impresora();
        while (true){
            System.out.println("Ingrese la cantidad de hojas que desea imprimir");
            int Hojas=sc.nextInt();
            Imp.imprimir(Hojas);
            System.out.println("Hasta el momento imprimiste: "+Imp.ObtenerTotalImp()+" "+"hojas");
            System.out.println("Tienes disponibles " +Imp.ObtenerPagDisp()+" "+"hojas para imprimir.");
            System.out.println("Desea imprimir mas hojas? (S/N): ");
            char opcion =sc.next().charAt(0);
            
            if (opcion =='N'){
                System.out.println("Quedaron disponibles esta cantidad de hojas: "+Imp.ObtenerPagDisp());
                System.out.println("Imprimiste "+Imp.ObtenerTotalImp()+" "+"Hojas");
                System.out.println("Gracias por usar la impresora, hasta luego!");
                break;
            }
        }
       
//VIAJE:

        Viaje time=new Viaje();
        
        while (true){
            System.out.println("Digite la distancia a recorrer en Km");
            double Dist=sc.nextDouble();
            System.out.println("Digite la velocidad promedio a la que quiere ir en Km/H");
            double Vpro=sc.nextDouble();
            time.Calcular(Dist, Vpro);
            System.out.println("Este es el resultado de tiempo para este viaje: "+time.MostrarResultadoViaje()+" "+"Km/H");
            System.out.println("Desea calcular otro recorrido? (S/N): ");
            char opcion =sc.next().charAt(0);
            
            if (opcion =='N'){
                System.out.println("Ok, hasta luego!");
                break;
        }
}
         
//CUENTA REGRESIVA:
        
        System.out.println("Digite el numero desde donde quiere que se de la cuenta regresiva");
        int numero = sc.nextInt();
        
        if (numero>0){
            CuentaRegresiva cue = new CuentaRegresiva(numero);
            System.out.println("La cuenta regresiva comienza ahora: ");
            cue.Calcular();
        }
        else {
            System.out.println("Numero invalido, ingrese un numero positivo");
        }
        
//ADIVINANZA:

        Adivinanza juego = new Adivinanza();
        juego.jugar();
        
//LIBRO: 

        String AcumularLibros="";
        boolean continuar = true;
        
        do{
            System.out.println("Ingrese el titulo del libro");
            String Tit=sc.nextLine();
            
            System.out.println("Ingrese el nombre del autor del libro");
            String Au=sc.nextLine();
            
            System.out.println("Ingrese el numero de paginas que contiene el libro");
            int Pag=sc.nextInt();
            sc.nextLine();
            
            Libro Lib = new Libro(Tit, Au, Pag);
            AcumularLibros += Lib.mostrarInfo()+"\n";
            System.out.println("¿Desea registrar otro libro? (S/N): ");
            char opcion = sc.nextLine().charAt(0);

            if (opcion == 'N') {
                continuar = false;
            }

        } while (continuar);
        System.out.println("Lista de libros registrados:");
        System.out.println(AcumularLibros);
        
//COMIDAS RAPIDAS
        Menu comida=new Menu();
        double CostoTotal=0;
        int opcion;
        
        do{
            opcion=comida.mostrarMenu();
            if (opcion >= 1 && opcion <=4){
                double precio = comida.obtenerPrecio(opcion);
                CostoTotal += precio;
                System.out.println("Has añadido un item. Costo: $" +precio);
            }
        } while (opcion != 5);
        System.out.println("El costo total de tu pedido es: $" + CostoTotal);
        System.out.println("¡Gracias por tu compra!");
        
//TEMPERATURA CON DO WHILE:
        
        TemperaturaDoWhile rango = new TemperaturaDoWhile();
        int Grados = 0;
        do {
            System.out.println("Ingrese la temperatura: ");
            int grados = sc.nextInt();
            rango.Temp(grados);
        } while (rango.esGradoValido(Grados));  
        
//EXAMENES ESTUDIANTE:

        Examenes estudiante = new Examenes();
        String respuesta;
        System.out.println("Ten en cuenta que: Apruebas con 6 como minimo");
        do {
            System.out.println("Ingrese la calificación del examen: ");
            int calificacion = sc.nextInt();  
            estudiante.agregarCalificacion(calificacion);  

            System.out.println("¿Desea ingresar otra calificación? (si/no): ");
            respuesta = sc.next(); 

        } while (respuesta.equalsIgnoreCase("si"));

        double Promedio = estudiante.calcularPromedio();
        System.out.println("El Promedio de calificaciones del estudiante es: " + Promedio);
        System.out.println("Resultado final: " + estudiante.determinarResultado());

//GESTION DE TAREAS:
        
        String acumuladorTareas = "";
        String respuesta;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Ingrese la descripción de la tarea:");
            String descripcion = sc.nextLine();


            System.out.println("Ingrese la fecha de vencimiento (formato DD/MM/AAAA):");
            String fechaVencimiento = sc.nextLine();

            Tarea tar = new Tarea(descripcion, fechaVencimiento);

            acumuladorTareas += tar.mostrarTarea() + "\n";

            System.out.println("¿Desea agregar otra tarea? (si/no):");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        System.out.println("Lista de todas las tareas:");
        System.out.println(acumuladorTareas);
        
//REGISTRO VENTAS:
   
        Ventas venta=new Ventas();
        double Precio;
        String Continuar;
        
        do{
            System.out.print("Ingrese el precio del producto: ");
            Precio = sc.nextDouble();
            sc.nextLine(); 

            venta.AgregarVenta(Precio);

            System.out.print("¿Desea registrar otra venta? (si/no): ");
            Continuar = sc.nextLine();
        } while (Continuar.equalsIgnoreCase("si"));

        venta.mostrarResumen();
        
//PARQUEADERO:
        
        System.out.print("Ingrese el número de vehículos que ingresarán al parqueadero: ");
        int cantidadVehiculos = sc.nextInt();
        sc.nextLine();
        
        Parqueadero[] vehiculo = new Parqueadero[cantidadVehiculos];
        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.println("Registro del vehículo " + (i + 1));
            
            System.out.print("Ingrese la placa del vehículo: ");
            String PLACA = sc.nextLine();
            LocalTime horaIngreso = LocalTime.now();
            vehiculo[i] = new Parqueadero(PLACA, horaIngreso); 
        }
    System.out.println("Resumen de vehículos registrados:");
        for (int i = 0; i < cantidadVehiculos; i++) {
            vehiculo[i].mostrarInformacion();
        }
        
//TIENDA VIRTUAL:
        
        System.out.print("¿Cuántos productos desea agregar a la compra? ");
        int cantidadProductos = sc.nextInt();
        sc.nextLine();
        
        double TotalCompra=0;
        
           for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Producto " + (i + 1));
            
               System.out.println("Ingrese el nombre del producto");
               String nombre=sc.nextLine();
               System.out.println("Ingrese el precio del producto");
               double precio=sc.nextDouble();
               sc.nextLine();
               
               Producto prod = new Producto(nombre, precio);
               
            TotalCompra += prod.getPre();
            System.out.println("Ok");
        }
            System.out.println("El total de la compra fue: "+TotalCompra);
            
//AGENDA DE CONTACTOS:

        System.out.println("Cuantos contactos desea guardar?");
        int contactos = sc.nextInt();
        sc.nextLine();

        int totalContactos = 0;

        for (int i = 0; i < contactos; i++) {
            System.out.println("Contacto " + (i + 1));

            System.out.println("Ingrese el nombre de su contacto:");
            String nom = sc.nextLine();
            System.out.println("Ingrese el numero de telefono:");
            long num = sc.nextLong();
            sc.nextLine();  

            Agenda contac = new Agenda(nom, num);
            contac.MostrarContacto();  
            totalContactos++;  

            System.out.println("Contacto registrado correctamente.");
        }
        System.out.println("Total de contactos registrados: " + totalContactos);
        
        
//LISTA NUMEROS:

        System.out.println("Cuantos numeros deseas sumar?");
        int numero = sc.nextInt();
        sc.nextLine(); 

        int sumarResultado = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println("Numero: " + (i + 1));

            System.out.println("Digite el numero a sumar:");
            int NUM = sc.nextInt();
            sc.nextLine(); 

            Lista number = new Lista(NUM);

            number.MostrarResultados();

            sumarResultado += NUM;  
        }
        System.out.println("La suma total es: " + sumarResultado);
       */ 
       
//TIENDA FOR:

        System.out.println("Cuantos productos quieres registrar? ");
        double Productos=sc.nextDouble();
        sc.nextLine();
        
        double TotalVentas=0;
        
        for (int i=0; i<Productos; i++){
            System.out.println("Producto: "+(i+1));
            
            System.out.println("Ingrese el nombre del producto: ");
            String name=sc.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            double pre=sc.nextDouble();
            System.out.println("Cantidad a vender: ");
            double cantidad=sc.nextDouble();
            sc.nextLine();
            
            TiendaFor tienda=new TiendaFor(name, pre, cantidad);
            tienda.MostrarResumen();
            TotalVentas += tienda.ObtenerTotal();
        }
        System.out.println("El Total de ventas es: "+TotalVentas);
    }
}

    

    
