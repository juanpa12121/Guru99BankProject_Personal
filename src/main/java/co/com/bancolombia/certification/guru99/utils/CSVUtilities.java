package co.com.bancolombia.certification.guru99.utils;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtilities {
    private static final Logger LOGGER = LoggerFactory.getLogger(CSVUtilities.class);

    public static List<String[]> readCSV(List<String[]> listVector) {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader("src/test/resources/files/menuoptions.csv"))
                .withCSVParser(csvParser)
                .build()) {
            listVector = reader.readAll();
        } catch (IOException | CsvException e) {
            LOGGER.error("Error al leer csv", e);
        }
        return listVector;
    }

    public static List<String> getListOptions() {
        List<String[]> listVector = new ArrayList<>();
        List<String> listLeftOptions = new ArrayList<>();
        listVector = CSVUtilities.readCSV(listVector);
        for (int i = 0; i < listVector.size(); i++) {
            String[] dataCustomerFromCSV = listVector.get(i);
            listLeftOptions.add(dataCustomerFromCSV[0]);
        }
        return listLeftOptions;
    }

}
