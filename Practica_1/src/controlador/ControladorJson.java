package controlador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import modelo.Agencia;
import modelo.Mirasol;

/**
 * @author K.G
 */
public class ControladorJson {

    Gson json_gson = new GsonBuilder().setPrettyPrinting().create();
    String nombreDocumento="datos.json";

    /**
     * Metodo que permite pasar de un string con informacion json a un areglo de objetos de la clase Agencia
     * @return Mirasol
     */
    public Mirasol listar() {
        Agencia[] deserializar = (Agencia[]) json_gson.fromJson(JsonToString(), Agencia[].class);
        Mirasol em = new Mirasol(deserializar);
        return em;
    }
    
    /**
     * Metodo que permite obtener un string de un archivo json  
     * @return String
     */
    public String JsonToString() {
        String stringJson;
        try {
            Reader reader = new InputStreamReader(new FileInputStream(nombreDocumento), "Utf-8");
            int ch = 0;
            StringBuilder sbBuffer = new StringBuilder();
                while ((ch = reader.read()) != -1) {
                    sbBuffer.append((char) ch);
                }
            reader.close();
            stringJson = sbBuffer.toString();
            return stringJson;
        } catch (IOException e) {
            return null;
        }
    }
    
    /**
     * Metodo que permite guardar un areglo del Objeto Agencia  en un archivo json 
     * @param dato   El objeto Mirasol para obtener las agencias
     * @throws java.lang.Exception  
     */
    public void guardar(Mirasol dato) throws Exception {
        String stringJson = json_gson.toJson(dato.getAgencias());
        FileWriter archivoJson = new FileWriter(nombreDocumento);
        archivoJson.write(stringJson);
        archivoJson.flush();
    }
}
