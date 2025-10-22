package com.mycompany.arrays;

public class Arrays {

    public static void main(String[] args) {
        String [] nomes = {"Professor", "Gilmar"};
        
        System.out.printf("Os dois valores são %s, %s\n",nomes[0],nomes[1]);
       
        //Este metodo faz a contagem de caracteres
        System.out.printf("O nome %s tem %s letras\n",nomes[0],nomes[0].length());
       
        //Este metodo transforma tudo em maiusculo
        System.out.printf("O nome %s em maiusculo é %s.\n",nomes[0],nomes[0].toUpperCase());
       
        //Este metodo transforma tudo em minuscula
        System.out.printf("O nome %s em minuscula é %s.\n",nomes[0],nomes[0].toLowerCase());
        
        //Este metodo traz a letra em uma posicao especifica
        System.out.printf("A segunda letra de %s é %s.\n",nomes[0],nomes[0].charAt(1));
        
        //Este metodo traz uma parte da String
        System.out.printf("As 3 primeiras letras de %s é %s.\n",nomes[0],nomes[0].substring(0,3));
        System.out.printf("Retirando as 3 primeiras letras de %s fica %s.\n",nomes[0],nomes[0].substring(3));
        //Esse metodo tambem traz a String a partir do indice selecionado
        
        //Este metodo faz comparacoes
        System.out.printf("O nome %s é igaul a 'Prof'? %s.\n",nomes[0],nomes[0].equals("Prof"));
        
        //Este metodo faz comparacoes sem levar em conta Case
         System.out.printf("O nome %s é igaul a 'professor'? %s.\n",nomes[0],nomes[0].equalsIgnoreCase("professor"));
         
        //Este metodo verifica se contem alguma parte do texto
        System.out.printf("O nome %s contem 'Pro'? %s.\n",nomes[0],nomes[0].contains("Pro"));
          
        //Este metodo verifica se começa com determinada silaba
        System.out.printf("O nome %s começa com 'Prof'? %s.\n",nomes[0],nomes[0].startsWith("Prof"));
           
        //Este metodo verifica se termina com determinada silaba
        System.out.printf("O nome %s termina com 'ssor'? %s.\n",nomes[0],nomes[0].endsWith("ssor"));
        
        //Este metodo faz a substituição de uma parte ou toda da String
        System.out.printf("Troque %s por 'Instrutor'. Agora eu sou %s.\n", nomes[0], nomes[0].replace("Professor", "Instrutor"));
    }   
}
