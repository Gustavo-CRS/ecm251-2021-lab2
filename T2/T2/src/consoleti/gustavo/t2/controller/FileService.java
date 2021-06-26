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

    public static void modificarCSV(ArrayList<Membros> membros, FileWriter file) throws IOException {
        // deletarCSV(file);
        for (Membros membro : membros) {
            String escrita = tratarString(membro.toString());
            
            try {
                file.write(escrita + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
            

        }
    }

    public static void deletarCSV(File file) {
        try {
            file.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void salvarEmCSV(ArrayList<Membros> membros) {
        File file = new File("nome_super_vergonhoso.csv");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("nome;funcao;email\n");
            
            for (Membros membro : membros) {
                String escrita = tratarString(membro.toString());
                try {
                    fileWriter.write(escrita + "\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    public static FileWriter criarCSV(String nomeArquivo) {
        File file = new File(nomeArquivo);
        try {
            FileWriter fw = new FileWriter(file);
            // FileWriter file = new FileWriter(nomeArquivo);
            fw.write("nome;funcao;email\n");
            return fw;
        } catch (IOException e) {
            System.out.println("Deu merda");
            e.printStackTrace();
        }
        return arquivo;
    }

    public static String tratarString(String membro) {
        // Membro [Nome = darth, Função = HeavyLifters, E-mail = darth@gmail.com]
        membro.split("=");
        return membro;
    }

    

}
