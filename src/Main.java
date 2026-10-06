//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   DiscoDuro miDisco =  new DiscoDuro(50,100);
   MemoriaUSB miUSB = new MemoriaUSB(100,350);
   UnidadSSD miSSD = new UnidadSSD(10, 20);

   System.out.println("====================================================");
   System.out.println("Prueba----Escritura y Lectura exitos en disco duro");
   miDisco.escribirDatos("Hola Mundo");
   System.out.println("Contenido leido: "+ miDisco.leerDatos());
   System.out.println("====================================================");

    System.out.println("===============================================");
    System.out.println("Prueba----Desbordamiento de memoria USB");
    miUSB.escribirDatos("Este texto es demaciado largo.");
    System.out.println("===============================================");

    System.out.println("===============================================");
    System.out.println("Prueba----Escritura exitosa en memoria SSD");
    miSSD.escribirDatos("Datos para SSD");
    System.out.println("Contenido leido " + miSSD.leerDatos());
    System.out.println("===============================================");
}
