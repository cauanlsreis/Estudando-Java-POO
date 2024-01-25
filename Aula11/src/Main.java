public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();

        v1.setNome("Cauan");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Professor p2 = new Professor();
        p2.setNome("André");
        p2.setIdade(42);
        p2.setSexo("M");
        p2.setEspecialidade("Algoritmos");
        p2.setSalario(3500f);
        System.out.println(p2.toString());
        p2.mostrarEspecialidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Artur");
        t1.setSexo("M");
        t1.setIdade(23);
        t1.setCurso("Sistemas");
        t1.setMatricula(1113);
        t1.setRegistroProfissional(44444);
        t1.fazerAniversario();
        System.out.println(t1.toString());
        t1.praticar();

    }
}