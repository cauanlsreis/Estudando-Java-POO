public class Gafanhoto extends Pessoa{
    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia()+1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                "\nlogin='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
