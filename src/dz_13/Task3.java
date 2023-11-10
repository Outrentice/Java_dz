package dz_13;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Task3 {
    public static void main(String[] args) {
        Address address1 = Address.CommaSplit("Russia, Moscow, Moscow, varshavskoye highway, 52, 1, 127");
        Address address2 = Address.Split("Russia. Moscow. Moscow. varshavskoye highway, 52, 1, 127");
    }
}


class Address {
    String Country;
    String Region;
    String City;
    String Street;
    String HouseNumber;
    String HouseBody;
    String Flat;

    static Address CommaSplit(String address) {
        Address obj = new Address();
        String[] prom = address.split(",");
        obj.FillFields(prom);
        return obj;
    }

    static Address Split(String address) {
        Address obj = new Address();
        String[] prom = new String[7];

        StringTokenizer st = new StringTokenizer(address);
        int len = st.countTokens();

        for (int i=0; i < len - 1; i++) {
            String word = st.nextToken();
            char sym = word.charAt(word.length() - 1);
            prom[i] = word.strip();

            if (sym != '.' & sym != ',' & sym != ';' & st.hasMoreTokens()) {
                while (true) {
                    word = st.nextToken();
                    sym = word.charAt(word.length() - 1);

                    if (sym != '.' & sym != ',' & sym != ';' & st.hasMoreTokens())
                        prom[i] += " " + word;
                    else {
                        prom[i] += " " + word.substring(0, word.length() - 1);
                        break;
                    }
                }
            }
            else
                prom[i] = prom[i].substring(0, word.length() - 1);
        }

        obj.FillFields(prom);
        return obj;
    }

    private void FillFields(String[] fill) {
        this.Country = fill[0].strip();
        this.Region = fill[1].strip();
        this.City = fill[2].strip();
        this.Street = fill[3].strip();
        this.HouseNumber = fill[4].strip();
        this.HouseBody = fill[5].strip();
        this.Flat = fill[6].strip();
    }
}