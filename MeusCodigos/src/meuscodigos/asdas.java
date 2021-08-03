package meuscodigos;
public class asdas {
    
    public static void main(String[] args) {
        //declaramos el vector con los 20 numeros
        Integer [] E={8,7,3,45,0,12,1,17,9,11,1,23,105,15,13,18,6,21,32,5};
        
        //ordenamos los datos de la matriz unidimensional utilizando el metodo
        //de la burbuja,usamos dos bucles para recorres 20x20veces la matriz
            for (int i = 0 ; i < E.length - 1 ; i++) {
                        int min = i;//declaramos la variable donde guardaremos
                        //el valor minimo e iniciamos el bucle
                            for (int j = i + 1 ; j < E.length ; j++) {
                            if (E[j] < E[min]) {
                                min = j;    //encontramos el menor número
                                }
                             }
                            if (i != min) {
                            //permutamos los valores
                                Integer aux = E[i];
                                E[i] = E[min];
                                E[min] = aux;
                               }

                }
            //mostramos la matriz ahora ya ordenada
            for (int i = 0; i < E.length; i++) {
            System.out.print("("+E[i]+"),");      
            }               
    }
}
