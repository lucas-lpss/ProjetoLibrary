package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
     static List<Book> book = new ArrayList<>();

     static void logica() {
         messagem();
         User.logue();
         System.out.println("digite 1 para adicionar e salva na lista, 2 para Editar lista,3 para Exclui da lista");
         Scanner opD = new Scanner(System.in);
         int op = opD.nextInt();
         LOL:
         while (true) {
             if (op == 1) {
                 logicaAdc();
             } else if (op == 2) {
                 logicaEdt();
             } else if (op == 3) {
                 logicaRemove();

             } else if (op == 4) {
                 break LOL;
             }
         }
         System.out.println("Programa encerrado");
     }
   static void messagem(){
        System.out.println("####################################");
        System.out.println(" Bem vindo a LibrarySystem!! Sua Livraria Online ");
        System.out.println("######################################");
        System.out.println('\n');
    }
     static void logicaAdc(){

        System.out.println("Quantos livros deseja Salvar??");

        Scanner numeroDigitado = new Scanner(System.in);
        int lv = numeroDigitado.nextInt();
        for (int l = 0; l < lv; l++) {
            Book livro = new Book();
            Scanner id = new Scanner(System.in);
            System.out.println("Digite o isbn: (id) ");
            livro.isbn = id.nextInt();

            System.out.println("Digite o Title do Livro: ");
            livro.title = id.nextLine();

            System.out.println("Digite o autor ou autores: ");
            livro.author = id.nextLine();

            System.out.println(" Digite o ano do Livro: ");
            livro.year = id.nextLine();

            System.out.println("Digite Editora do Livro: ");
            livro.publisher = id.nextLine();
            book.add(livro);

        }
        System.out.println("Seus Livros Adicionado São");
        for (Book b : book) {
            System.out.println("o id é" + b.isbn);
            System.out.println("o title é" + b.title);
            System.out.println("os authores são" + b.author);
            System.out.println("o Ano de Lançamento é" + b.year);
            System.out.println("A Editora da publicaçao se Chama" + b.publisher);
        }
    }

   static void logicaRemove(){
        User.logue();
        System.out.println("Digite o id do livro que deseja modificar");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (int j =0 ; j<= book.size();j++){
            if(book.get(j).equals(id));
            System.out.println("digite um e o id do livro que deseja remover ");
            Scanner opcaoDg = new Scanner(System.in);
            int op = opcaoDg.nextInt();
                if (op == 1){
                    System.out.println("tem certeza");
                    String remove = opcaoDg.nextLine();
                    book.get(j).equals(book.remove(j));
                }

        }
        for (Book j: book){
            System.out.println("item excluido"+j.isbn);
        }

    }

  static  void logicaEdt(){
       Book liv = new Book();
        User.logue();
        System.out.println("Digite o id do livro que deseja modificar");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for(int x=0;x<=book.size();x++){
            if(book.get(x).equals(id));
            System.out.println("se voce deseja modificar o title (1), senao (2) paramodificar arthores,(3) para o  ano de lançamento e (4) para editar a editora");
            Scanner opcaoD = new Scanner(System.in);
            int op = opcaoD.nextInt();
                if(op == 1){
                    System.out.println("qual o title novo?");
                    String titleNovo = opcaoD.nextLine();
                    book.get(x).title = titleNovo;
                }
                else if(op == 2){
                    System.out.println("qual nome dos novos autores?");
                    String novoNome = opcaoD.nextLine();
                    book.get(x).author=novoNome;
                }
                else if(op == 3 ){
                    System.out.println("qual o novo ano de lançamento?");
                    String dateNovo = opcaoD.nextLine();
                    book.get(x).year=dateNovo;
                }
                else if(op == 4){
                    System.out.println("Qual novo nome da editora?");
                    String novaEdit = opcaoD.nextLine();
                    book.get(x).publisher = opcaoD.nextLine();
                }

        }
        for(Book l : book){
            System.out.println("novo nome é"+l.title);
            System.out.println("novos authores é"+l.author);
            System.out.println("nova data é"+l.year);
            System.out.println("nova editora é"+l.publisher);
        }
    }

    }




