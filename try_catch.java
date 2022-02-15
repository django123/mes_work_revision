import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumber {
    private List<Integer> list;

    private static final int SIZE = 10;

    public ListOfNumber() {
        list = new ArrayList<>(SIZE);

        for (i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void writerList() {
        PrintWriter out = null;
        // The FileWriter constructor throws IOException, which must be caught.
        out = new PrintWriter(new FileWriter("outFile.txt"));

        for (int i = 0; i < SIZE; i++) {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();

    }

}
