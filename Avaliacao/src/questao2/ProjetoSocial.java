package questao2;

import javax.swing.JOptionPane;

public class ProjetoSocial {
    public static void main(String[] args) {
        while (true) {
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1- Distribuição de Alimentos\n" +
                            "2- Trabalho Voluntário\n" +
                            "3- Sair"));
            if (escolha == 3) {
                break;
            }
            String nomeProjeto = JOptionPane.showInputDialog("Digite o nome do projeto:");
            String descricao = JOptionPane.showInputDialog("Digite a descrição do projeto:");
            String endereco = JOptionPane.showInputDialog("Digite o endereço do projeto:");
            String dataInicio = JOptionPane.showInputDialog("Digite a data de início do projeto:");
            String dataFim = JOptionPane.showInputDialog("Digite a data de fim do projeto:");

            if (escolha == 1) {
                String descAlimento = JOptionPane.showInputDialog("Digite a descrição do alimento:");
                float qtde = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de alimento:"));
                DistribuicaoAlimento projeto = new DistribuicaoAlimento(nomeProjeto, descricao, endereco,
                        dataInicio, dataFim, descAlimento, qtde);
                if (projeto.validaProjeto(nomeProjeto)) {
                    JOptionPane.showMessageDialog(null, projeto.imprimeProjeto());
                } else {
                    JOptionPane.showMessageDialog(null, "Projeto não válido.");
                }
            } else if (escolha == 2) {
                String tipoTrabalho = JOptionPane.showInputDialog("Digite o tipo de trabalho:");
                int duracaoTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do trabalho (em horas):"));
                TrabalhoVoluntario projeto = new TrabalhoVoluntario(nomeProjeto, descricao, endereco,
                        dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);
                if (projeto.validaProjeto(nomeProjeto)) {
                    JOptionPane.showMessageDialog(null, projeto.imprimeProjeto());
                } else {
                    JOptionPane.showMessageDialog(null, "Projeto não válido.");
                }
            }
        }
    }
}
