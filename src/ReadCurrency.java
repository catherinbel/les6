import java.io.*;

public class ReadCurrency {

    private String filePath;

    private double dollar;
    private double rub;
    private double euro;

    ReadCurrency(String filePath) {
        this.filePath = filePath;
    }

    public void readCurrency() throws IOException {
        FileReader file = null;
        BufferedReader buffered = null;
        try {
            file = new FileReader(this.filePath);
            buffered = new BufferedReader(file);

            String[] line = buffered.readLine().trim().split(",");
            this.dollar = Integer.parseInt(line[0]);
            this.rub = Double.parseDouble(line[1]);
            this.euro = Double.parseDouble(line[2]);

        } finally {

            if (buffered != null) {
                buffered.close();
            }

        }
    }

    public double getDollar() {
        return dollar;
    }

    public double getRub() {
        return rub;
    }

    public double getEuro() {
        return euro;
    }


}