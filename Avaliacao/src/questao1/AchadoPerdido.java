package questao1;

import javax.swing.JOptionPane;

public class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String localAchado, String dataHora) {
        this.foto = foto;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
    }

    public String buscarTitulo(String titulo) {
        if (this.titulo.equalsIgnoreCase(titulo)) {
            return "Título: " + this.titulo + "\nDescrição: " + descricao + "\nLocal Achado: " + localAchado;
        } else {
            return "Não encontrado";
        }
    }

    public void visualizarDetalhes() {
        String message = "Título: " + titulo + "\nFoto: " + foto + "\nLocal Achado: " + localAchado
                + "\nTipo: " + tipo + "\nStatus: " + status;
        JOptionPane.showMessageDialog(null, message);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLocalAchado() {
        return localAchado;
    }

    public void setLocalAchado(String localAchado) {
        this.localAchado = localAchado;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
