/*
package foxandhounds.xmlsave;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Arrays;
import java.util.Objects;

@XmlRootElement (name = "game_state")
public class PersistableMapVO {
    private int numberofrows;
    private int numberofcolumns;
    private int[][] values;
    private boolean[][] endrow;
    private int[] foxposition;
    private int[][] houndposition;

    public PersistableMapVO() {
    }

    public PersistableMapVO(int numberofrows, int numberofcolumns, int[][] values, boolean[][] endrow, int[] foxposition, int[][] houndposition) {
        this.numberofrows = numberofrows;
        this.numberofcolumns = numberofcolumns;
        this.values = values;
        this.endrow = endrow;
        this.foxposition = foxposition;
        this.houndposition = houndposition;
    }

    public int getNumberofrows() {
        return numberofrows;
    }

    public void setNumberofrows(int numberofrows) {
        this.numberofrows = numberofrows;
    }

    public int getNumberofcolumns() {
        return numberofcolumns;
    }

    public void setNumberofcolumns(int numberofcolumns) {
        this.numberofcolumns = numberofcolumns;
    }

    public int[][] getValues() {
        return values;
    }

    public void setValues(int[][] values) {
        this.values = values;
    }

    public boolean[][] getEndrow() {
        return endrow;
    }

    public void setEndrow(boolean[][] endrow) {
        this.endrow = endrow;
    }

    public int[] getFoxposition() {
        return foxposition;
    }

    public void setFoxposition(int[] foxposition) {
        this.foxposition = foxposition;
    }

    public int[][] getHoundposition() {
        return houndposition;
    }

    public void setHoundposition(int[][] houndposition) {
        this.houndposition = houndposition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersistableMapVO that = (PersistableMapVO) o;
        return numberofrows == that.numberofrows && numberofcolumns == that.numberofcolumns && Arrays.equals(values, that.values) && Arrays.equals(endrow, that.endrow) && Arrays.equals(foxposition, that.foxposition) && Arrays.equals(houndposition, that.houndposition);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numberofrows, numberofcolumns);
        result = 31 * result + Arrays.hashCode(values);
        result = 31 * result + Arrays.hashCode(endrow);
        result = 31 * result + Arrays.hashCode(foxposition);
        result = 31 * result + Arrays.hashCode(houndposition);
        return result;
    }
}

 */
