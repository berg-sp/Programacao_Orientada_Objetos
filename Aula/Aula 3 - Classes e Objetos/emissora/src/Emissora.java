public class Emissora {
    String nome;
    ArrayList<Programa> programas = new ArrayList<>();

    public Programa getProgramaMaiorAudiencia(){
        int maiorAudiencia = 0;
        int index = 0;
        for (int i = 0; i < programas.size(); i++){
            if(programas.get(i).pontosDeAudiencia > maiorAudiencia){
                maiorAudiencia = programas.get(i).pontosDeAudiencia;
                index = i;
            }
        }
        return programas.get(index);
    }
}
