package dz_7;



public class Task5 {
    public static void main(String[] args) {
        ProcessStrings string = new ProcessStrings("Hello");
        System.out.println(string.len());
        System.out.println(string.invert());
        System.out.println(string.odd_position());
    }
}


interface MyString {
    int len();
    String odd_position();
    String invert();
}


class ProcessStrings implements MyString {

    String str;

    ProcessStrings(String str) {
        this.str = str;
    }

    @Override
    public int len() {
        return str.length();
    }

    @Override
    public String odd_position() {
        String new_str = "";
        for (int i = 1; i < len(); i += 2)
            new_str += this.str.charAt(i);

        return new_str;
    }

    @Override
    public String invert() {
        return new StringBuilder(str).reverse().toString();
    }
}

