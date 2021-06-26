package consoleti.gustavo.t2.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import consoleti.gustavo.t2.models.Membros;


public class FileService {
    static FileWriter arquivo;

    
    

    public FileService(FileWriter arquivo) {
        FileService.arquivo = arquivo;
    }

    /** 
     * @param membros
     * @throws IOException
     */
    public static void modificarCSV(ArrayList<Membros> membros,FileWriter file) throws IOException {
       
    for (Membros membro : membros) {
        String escrita = tratarString(membro.toString());
        file.write(escrita);
        
    }
      

    }

    public void deletarCSV(File file){
        try {
            file.delete();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static FileWriter criarCSV(String nomeArquivo){
        try {
            FileWriter file = new FileWriter(nomeArquivo);
            // if (file.createNewFile()) {
            //   System.out.println("Arquivo criado: " + file.getName());
              
            // }
            // FileWriter fw = new FileWriter(file);
              file.write("nome;funcao;email\n");
              file.close();
              return file;
          } catch (IOException e) {
            System.out.println("Deu merda");
            e.printStackTrace();
           
            
          }
        return arquivo;
          
          
        }

    public static String tratarString(String membro){
        // Membro [nome= darth, funcao= HeavyLifters, email= darth@gmail.com]
        membro.split("=");
        System.out.println(membro);
        return membro;
    }
        
}
