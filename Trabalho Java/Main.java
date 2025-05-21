import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Anderson Brilhante Varela", 20, "709.501.464-71", "202402395831", "Ciência da Computação");
        Professor professor = new Professor("Fausto Jóse Feitosa Barbosa Gominho", 35, "867.234.576-78", "8976235", "Programação Orientada a Objetos em Java", true);
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Bruno Fárias Pinto", 40, "345.987.474-57", "Logística", "Analista de Logística");
        int soma = 0;
        for (char c : aluno.getMatricula().toCharArray()) {
            if (Character.isDigit(c)) {
                soma += Character.getNumericValue(c);
            }
        }
        int modulo = soma % 3;

        System.out.println("Soma dos dígitos da matrícula: " + soma);
        System.out.println("Resultado do módulo 3: " + modulo);

        switch (modulo) {
            case 0 -> {
                List<Pessoa> lista = new ArrayList<>();
                lista.add(aluno);
                lista.add(professor);
                lista.add(tecnico);
                for (Pessoa p : lista) {
                    p.exibirDados();
                    System.out.println("toString: " + p.toString());
                    System.out.println("hashCode: " + p.hashCode());
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }
    }
}