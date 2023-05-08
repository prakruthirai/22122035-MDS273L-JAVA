import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.xml.transform.Source;

public class LAB7 {

    public static void main(String[] args) {

        ArrayList<String> Dataa = new ArrayList<String>();

        float SepalLengthCount = 0.0f, SepalWidthCount = 0.0f, PetalLengthCount = 0.0f, PetalWidthCount = 0.0f;

        int IrisSetosa = 0, IrisVersicolor = 0, IrisVirginica = 0;

        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        try {
            File file = new File("C:\\Users\\ashish\\Downloads\\iris.csv");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String Line = sc.nextLine();

                Dataa.add(Line);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Id,SepalLengthCm,SepalWidthCm,PetalLengthCm,PetalWidthCm,Species

        int n = 0;
        ArrayList<Integer> SepalLength = new ArrayList<>();
        ArrayList<Integer> SepalWidth = new ArrayList<>();
        ArrayList<Integer> PetalLength = new ArrayList<>();
        ArrayList<Integer> PetalWidth = new ArrayList<>();

        for (String s : Dataa) {

            SepalLengthCount = SepalLengthCount + Integer.parseInt(s.split(",")[1]);
            SepalLength.add(Integer.parseInt(s.split(",")[1]));

            SepalWidthCount = SepalLengthCount + Integer.parseInt(s.split(",")[2]);
            SepalWidth.add(Integer.parseInt(s.split(",")[2]));

            PetalLengthCount = SepalLengthCount + Integer.parseInt(s.split(",")[3]);
            PetalLength.add(Integer.parseInt(s.split(",")[3]));

            PetalWidthCount = SepalLengthCount + Integer.parseInt(s.split(",")[4]);
            PetalWidth.add(Integer.parseInt(s.split(",")[4]));

            if (s.split(",")[5].equals("Iris-setosa")) {
                IrisSetosa++;
            } else if (s.split(",")[5].equals("Iris-versicolor")) {
                IrisVersicolor++;
            } else if (s.split(",")[5].equals("Iris-virginica")) {
                IrisVirginica++;
            }

            n++;

        }

        // ---------------------mean--------------------
        float mean_SepalLengthCm = SepalLengthCount / n;
        float mean_SepalWidthCm = SepalWidthCount / n;
        float mean_PetalLengthCm = PetalLengthCount / n;
        float mean_PetalWidthCm = PetalWidthCount / n;
        float mean_IrisSetosa = IrisSetosa / n;
        float mean_IrisVersicolor = IrisVersicolor / n;
        float mean_IrisVirginica = IrisVirginica / n;

        ArrayList<Float> mean = new ArrayList<>();
        mean.add(mean_SepalLengthCm);
        mean.add(mean_SepalWidthCm);
        mean.add(mean_PetalLengthCm);
        mean.add(mean_PetalWidthCm);
        mean.add(mean_IrisSetosa);
        mean.add(mean_IrisVersicolor);
        mean.add(mean_IrisVirginica);

        // --------------------min----------------------
        ArrayList<Integer> min = new ArrayList<>();
        min.add(Collections.max(SepalLength));
        min.add(Collections.max(SepalWidth));
        min.add(Collections.max(PetalLength));
        min.add(Collections.max(PetalWidth));

        // --------------------max------------------------
        ArrayList<Integer> max = new ArrayList<>();
        min.add(Collections.min(SepalLength));
        min.add(Collections.min(SepalWidth));
        min.add(Collections.min(PetalLength));
        min.add(Collections.min(PetalWidth));

        // ------------------------mode-------------------

        int mode1 = mode(SepalLength);
        System.out.println(mode1);

    }

    public static int mode(ArrayList<Integer> array) {
        int mode = array.get(0);
        int maxCount = 0;
        for (int i = 0; i < array.size(); i++) {
            int value = array.get(i);
            int count = 0;
            for (int j = 0; j < array.size(); j++) {
                if (array.get(j) == value)
                    count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        if (maxCount > 1) {
            return mode;
        }
        return 0;
    }

}