package foxandhounds.service.map.parser;

import java.util.List;
import java.util.regex.Pattern;

import foxandhounds.model.MapVO;
import foxandhounds.service.exception.MapParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapParser {
    private static final Logger LOGGER = LoggerFactory.getLogger(MapParser.class);

    private static final String valid_row_regex = "[0-7]+";

    private final int numberofrows;
    private final int numberofcolumns;
    private final int[] foxpos;
    private final int[][] houndpos;

    public MapParser(int numberofrows, int numberofcolumns, int[] foxpos, int[][] houndpos) {
        this.numberofrows = numberofrows;
        this.numberofcolumns = numberofcolumns;
        this.foxpos = foxpos;
        this.houndpos = houndpos;
    }

    public MapVO parse(List<String> rawMap) throws MapParseException {
        LOGGER.info("Parsing the map = {}", rawMap);

        checkNumberofrows(rawMap);
        checkNumberofcolumns(rawMap);
        checkValues(rawMap);

        int[][] values = getValues(rawMap);
        boolean[][] endrow = getEndrow(values);


        return new MapVO(numberofrows, numberofcolumns, values, endrow, foxpos, houndpos);
    }

    private int[][] getValues(List<String> rawMap) {
        int[][] result = new int[numberofrows][numberofcolumns];
        for (int i = 0; i < numberofrows; i++) {
            String row = rawMap.get(i);
            String[] numbers = row.split("");
            for (int j = 0; j < numberofcolumns; j++) {
                int n = Integer.parseInt(numbers[j]);
                result[i][j] = n;
            }
        }

        return result;
    }

    private boolean[][] getEndrow(int[][] map) {
        boolean[][] endrow = new boolean[numberofrows][numberofcolumns];

        for (int i = 0; i < numberofrows; i++) {
            for (int j = 0; j < numberofcolumns; j++) {
                endrow[i][j] = i == 0;
            }
        }
        return endrow;
    }

    private void checkNumberofrows(List<String> rawMap) throws MapParseException {
        if (rawMap.size() != numberofrows) {
            throw new MapParseException("Board format error: Number of rows supposed to be: " + numberofrows);
        }
    }

    private void checkNumberofcolumns(List<String> rawMap) throws MapParseException {
        for (String row : rawMap) {
            if (row.length() != numberofcolumns) {
                throw new MapParseException(
                        "Board format error: Number of columns supposed to be: " + numberofcolumns);
            }
        }
    }

    private void checkValues(List<String> rawMap) throws MapParseException {
        for (String row : rawMap) {
            if (!Pattern.matches(valid_row_regex, row)) {
                throw new MapParseException("Row contains invalid characters!");
            }
        }
    }


}
