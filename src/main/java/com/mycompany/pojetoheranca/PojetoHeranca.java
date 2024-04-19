package com.mycompany.pojetoheranca;


public class PojetoHeranca {

    public static void main(String[] args) {
        
        
        Pessoa p1 = new Pessoa();
          Aluno p2 = new Aluno ();
            Professor p3 = new Professor ();
               Funcionario p4 = new Funcionario ();
        
        //Nome das Pessoas
        p1.setNome("Jean");
        p2.setNome("Nata");
        p3.setNome("Sara");
        p4.setNome("Alex");
        
        //Sexo das Pessoas
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("M");
        
        //Idade das Pessoas
        p1.setIdade (17);
        p2.setIdade (19);
        p3.setIdade (30);
        p4.setIdade (21);
        
        
        p2.setCurso("Informática");
        p3.setEspecialidade("Java");
        p4.setSetor("Segurança");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
        
    }
}
