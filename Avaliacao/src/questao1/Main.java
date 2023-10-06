package questao1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        AchadoPerdido achado = new AchadoPerdido("Chave perdida", "Chave encontrada no parque", "Objeto", "Encontrado");
        achado.completaDados("foto_chave.jpg", "Parque Central", "2023-10-05 14:30:00");

        String tituloBusca = JOptionPane.showInputDialog("Digite um título para busca:");

        String resultadoBusca = achado.buscarTitulo(tituloBusca);
        if (!resultadoBusca.equals("Não encontrado")) {
            JOptionPane.showMessageDialog(null, resultadoBusca);
            achado.visualizarDetalhes();
        } else {
            JOptionPane.showMessageDialog(null, resultadoBusca);
        }
    }
}
