public class Fila {
    // Atributo para armazenar a única instância da classe Fila
    private static Fila instance;

    // Construtor privado para evitar a criação de instâncias diretamente
    private Fila() {
    }

    // Método para obter a única instância da classe Fila
    public static Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }

    // Método para imprimir documento
    public void ImprimeDocumento() {
        // Código para imprimir documento
    }

    // Método para remover documento
    public void RemoveDocumento() {
        // Código para remover documento
    }

    // Método para remover todos os documentos
    public void RemoveTodosDocumentos() {
        // Código para remover todos os documentos
    }
}
