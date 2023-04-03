package com.example;

public class Lexico {


    public Lexico(Object arquivo){
        System.out.println("");
        return;
    }

    public Token GetToken(int l, int c){
        return new Token();
    }

    public Token Lexema(String entrada)
    {
        char c;
        int e;
        String lexema;
        Token token = new Token();

        for(int i = 0; i < entrada.length(); i++)
        {
            e = 0;
            lexema = "";
            c = entrada.charAt(i);
            switch(e){
                case 0:
                {
                    if(!Character.isDigit(c)){
                        lexema += c;
                        e = 1;
                    }
                    else{
                        if(Character.isDigit(c))
                        {
                            lexema += c;
                            e = 2;
                        }
                        else{
                            System.out.println("Erro :" + c);
                        }
                    }
                }
                case 1:
                {
                    if(!Character.isDigit(c) || Character.isDigit(c)){
                        lexema += c;
                        e = 1;
                    }
                    else{
                        Token.setClasse(cId);
                        Token.setValor(InsTabSim(lexema));
                        e = 3;
                    }
                }
                case 2:
                {
                    if(Character.isDigit(c)){
                        lexema += c;
                        e = 2;
                    }
                    else{
                        Token.setClasse(cNum);
                        Token.setValor(Integer.parseInt(lexema));
                        e = 3;
                    }
                }
                case 3:
                {
                    return(token);
                }
            }
        }
        return(token);
    }
}
