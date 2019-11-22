/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String vaca = "Vaca";
        final String oveja = "Oveja";
        final String burro = "Burro";
        final String gallina = "Gallina";
        final int cantidadV = 3;
        final int cantidadO = 14;
        final int cantidadB = 2;
        final int cantidadG = 18;
        final int patas2 = 2;
        final int patas4 = 4;
        final int vacaTP;
        final int ovejaTP;
        final int burroTP;
        final int gallinaTP;
        final int totalPatas;
        final int totalPares;
        
        // Operaciones   
        vacaTP = patas4 * cantidadV;
        ovejaTP = patas4 * cantidadO;
        burroTP = patas4 * cantidadB;
        gallinaTP = patas2 * cantidadG;
        
        totalPatas = vacaTP + ovejaTP + burroTP + gallinaTP;
        totalPares = totalPatas / 2;     
                
        // Cabecera
        System.out.println("Secuencia de Patas");
        System.out.println("==================");
               
        // Salida consola
        System.out.printf("Animal....: %s%n", vaca);
        System.out.printf("Cantidad..: %d%n", cantidadV);
        System.out.printf("Patas.....: %d%n", vacaTP);
        System.out.println("---");
        System.out.printf("Animal....: %s%n", oveja);
        System.out.printf("Cantidad..: %d%n", cantidadO);
        System.out.printf("Patas.....: %d%n", ovejaTP);
        System.out.println("---");
        System.out.printf("Animal....: %s%n", burro);
        System.out.printf("Cantidad..: %d%n", cantidadB);
        System.out.printf("Patas.....: %d%n", burroTP);       
        System.out.println("---");
        System.out.printf("Animal....: %s%n", gallina);
        System.out.printf("Cantidad..: %d%n", cantidadG);
        System.out.printf("Patas.....: %d%n", gallinaTP);   
        System.out.println("---");
        System.out.printf("Total de Patas...: %d%n", totalPatas);   
        System.out.printf("Total de Pares...: %d%n", totalPares);   
    }
    
}
