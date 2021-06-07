package consoleti.gustavo.t2.controller;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import consoleti.gustavo.t2.models.Membros;


public class FileService {

    public void  modificarCSV(ArrayList<Membros> membros ) throws IOException {
        Writer writer = Files.newBufferedWriter(Paths.get("arquivo_super_Secreto_nao_abrir.csv"));
        // StatefulBeanToCsv<Membros> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

        // beanToCsv.write(membros);

        writer.flush();
        writer.close();

    }
}
