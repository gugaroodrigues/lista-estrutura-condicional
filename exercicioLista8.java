import javax.swing.JOptionPane;
public class exercicioLista8{
   public static void main(String[] args){
      JOptionPane.showMessageDialog(null, "Escolha 3 produtos: ");
      double preco1 = (0);
      double preco2 = (0);
      double preco3 = (0);
      double total = (0);
      
      String cardapio1 =JOptionPane.showInputDialog(null, "Tipo                                            " + " Nome                                           " + "                                             Valor\n" +
      "Bolos                                   " + "       Bolo Brigadeiro                                        " + "                               R$: 29.50\n" +
      "Bolos                                   " + "       Bolo Floresta Negra                                 " + "          " + "                    R$: 2.00\n" + 
      "Bolos                                   " + "       Bolo Leite com Nutella                            " + "          " + "                    R$: 29.23\n" + 
      "Bolos                                   " + "       Bolo Mousse de Chocolate                               " + "                   R$: 7.10\n" + 
      "Bolos                                   " + "       Bolo Nega Maluca                                                " + "                  R$: 19.33\n" +
      "Doces                                  " + "       Bomba de Creme                                        " + "                           R$: 17.71\n" +
      "Doces                                  " + "       Bomba de Morando                                              "  + "                 R$: 4.82\n" + 
      "Sanduíches                             " + "  Filé-Mingnon com fitras e cheddar                          " + "         R$: 21.16\n" + 
      "Sanduíches                       " + "        Hambúrger com queijo, chapingnon e rúcula                " + "R$: 12.70\n" + 
      "Sanduíches                               " + "Provolone com salame                                                        " + "R$: 19.33\n" + 
      "Sanduíches                          " + "     Vegetariano de berinjela                                                     " + "R$: 28.22\n" +
      "Pizzas                                   " + "      Calabresa                                                                                " + "R$: 8.98\n" +
      "Pizzas                                   " + "      Napolitana                                                                                " + "R$: 0.42\n" +
      "Pizzas                                   " + "      Peruana                                                                                   " + "R$: 18.36\n" +
      "Pizzas                                   " + "      Portuguesa                                                                             " + "R$: 27.50\n" );
                                                                        
      if (cardapio1.equalsIgnoreCase("Bolo Brigadeiro")){
        preco1 = 29.50;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Bolo Floresta negra")){
        preco1 += 2.0;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Bolo leite com Nutella")){
        preco1 = 29.23;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Bolo Mousse de chocolate")){
        preco1 = 7.10;
        total = preco1 + total;         
    }if (cardapio1.equalsIgnoreCase("Bolo nega maluca")){
        preco1 = 19.33;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Bomba de creme")){
        preco1 = 17.71;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Bomba de morango")){
        preco1 = 4.82;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("File mignon com fritas e cheddar")){
        preco1 = 21.16;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Hamburguer com quejo champignon e rucula")){
        preco1 = 12.72;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Provolone com salame")){
        preco1 = 19.70;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Vegetariano de berinjela")){
        preco1 = 28.22;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Calabresa")){
        preco1 = 8.98;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Napolitana")){
        preco1 = 0.42;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Peruana")){
        preco1 = 18.36;
        total = preco1 + total;
    }if (cardapio1.equalsIgnoreCase("Portuguesa")){
        preco1 = 27.50;
        total = preco1 + total;
    }


          String cardapio2 =JOptionPane.showInputDialog(null, "Tipo                                            " + " Nome                                           " + "                                             Valor\n" +
      "Bolos                                   " + "       Bolo Brigadeiro                                        " + "                               R$: 29.50\n" +
      "Bolos                                   " + "       Bolo Floresta Negra                                 " + "          " + "                    R$: 2.00\n" + 
      "Bolos                                   " + "       Bolo Leite com Nutella                            " + "          " + "                    R$: 29.23\n" + 
      "Bolos                                   " + "       Bolo Mousse de Chocolate                               " + "                   R$: 7.10\n" + 
      "Bolos                                   " + "       Bolo Nega Maluca                                                " + "                  R$: 19.33\n" +
      "Doces                                  " + "       Bomba de Creme                                        " + "                           R$: 17.71\n" +
      "Doces                                  " + "       Bomba de Morando                                              "  + "                 R$: 4.82\n" + 
      "Sanduíches                             " + "  Filé-Mingnon com fitras e cheddar                          " + "         R$: 21.16\n" + 
      "Sanduíches                       " + "        Hambúrger com queijo, chapingnon e rúcula                " + "R$: 12.70\n" + 
      "Sanduíches                               " + "Provolone com salame                                                        " + "R$: 19.33\n" + 
      "Sanduíches                          " + "     Vegetariano de berinjela                                                     " + "R$: 28.22\n" +
      "Pizzas                                   " + "      Calabresa                                                                                " + "R$: 8.98\n" +
      "Pizzas                                   " + "      Napolitana                                                                                " + "R$: 0.42\n" +
      "Pizzas                                   " + "      Peruana                                                                                   " + "R$: 18.36\n" +
      "Pizzas                                   " + "      Portuguesa                                                                             " + "R$: 27.50\n" );
                                                                        
      if (cardapio2.equalsIgnoreCase("Bolo Brigadeiro")){
        preco2 = 29.50;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Bolo Floresta negra")){
        preco2 += 2.0;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Bolo leite com Nutella")){
        preco2 = 29.23;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Bolo Mousse de chocolate")){
        preco2 = 7.10;
        total = preco2 + total;         
    }if (cardapio2.equalsIgnoreCase("Bolo nega maluca")){
        preco2 = 19.33;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Bomba de creme")){
        preco2 = 17.71;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Bomba de morango")){
        preco2 = 4.82;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("File mignon com fritas e cheddar")){
        preco2 = 21.16;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Hamburguer com quejo champignon e rucula")){
        preco2 = 12.72;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Provolone com salame")){
        preco2 = 19.70;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Vegetariano de berinjela")){
        preco2 = 28.22;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Calabresa")){
        preco2 = 8.98;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Napolitana")){
        preco2 = 0.42;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Peruana")){
        preco2 = 18.36;
        total = preco2 + total;
    }if (cardapio2.equalsIgnoreCase("Portuguesa")){
        preco2 = 27.50;
        total = preco2 + total;
    }
    
        String cardapio3 =JOptionPane.showInputDialog(null, "Tipo                                            " + " Nome                                           " + "                                             Valor\n" +
        "Bolos                                   " + "       Bolo Brigadeiro                                        " + "                               R$: 29.50\n" +
        "Bolos                                   " + "       Bolo Floresta Negra                                 " + "          " + "                    R$: 2.00\n" + 
        "Bolos                                   " + "       Bolo Leite com Nutella                            " + "          " + "                    R$: 29.23\n" + 
        "Bolos                                   " + "       Bolo Mousse de Chocolate                               " + "                   R$: 7.10\n" + 
        "Bolos                                   " + "       Bolo Nega Maluca                                                " + "                  R$: 19.33\n" +
        "Doces                                  " + "       Bomba de Creme                                        " + "                           R$: 17.71\n" +
        "Doces                                  " + "       Bomba de Morando                                              "  + "                 R$: 4.82\n" + 
        "Sanduíches                             " + "  Filé-Mingnon com fitras e cheddar                          " + "         R$: 21.16\n" + 
        "Sanduíches                       " + "        Hambúrger com queijo, chapingnon e rúcula                " + "R$: 12.70\n" + 
        "Sanduíches                               " + "Provolone com salame                                                        " + "R$: 19.33\n" + 
        "Sanduíches                          " + "     Vegetariano de berinjela                                                     " + "R$: 28.22\n" +
        "Pizzas                                   " + "      Calabresa                                                                                " + "R$: 8.98\n" +
        "Pizzas                                   " + "      Napolitana                                                                                " + "R$: 0.42\n" +
        "Pizzas                                   " + "      Peruana                                                                                   " + "R$: 18.36\n" +
        "Pizzas                                   " + "      Portuguesa                                                                             " + "R$: 27.50\n" );
                                                                          
        if (cardapio3.equalsIgnoreCase("Bolo Brigadeiro")){
          preco3 = 29.50;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Bolo Floresta negra")){
          preco3 += 2.0;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Bolo leite com Nutella")){
          preco3 = 29.23;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Bolo Mousse de chocolate")){
          preco3 = 7.10;
          total = preco3 + total;         
      }if (cardapio3.equalsIgnoreCase("Bolo nega maluca")){
          preco3 = 19.33;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Bomba de creme")){
          preco3 = 17.71;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Bomba de morango")){
          preco3 = 4.82;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("File mignon com fritas e cheddar")){
          preco3 = 21.16;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Hamburguer com quejo champignon e rucula")){
          preco3 = 12.72;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Provolone com salame")){
          preco3 = 19.70;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Vegetariano de berinjela")){
          preco3 = 28.22;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Calabresa")){
          preco3 = 8.98;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Napolitana")){
          preco3 = 0.42;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Peruana")){
          preco3 = 18.36;
          total = preco3 + total;
      }if (cardapio3.equalsIgnoreCase("Portuguesa")){
          preco3 = 27.50;
          total = preco3 + total;
      }   

      JOptionPane.showMessageDialog(null, "Pedido 1: " + cardapio1 + " = " + preco1 + "\nPedido 2: " + cardapio2 + " = " + preco2 + "\nPedido 3: " + cardapio3 + " = " + preco3 + "\nTotal: " + total);

     

   }
}