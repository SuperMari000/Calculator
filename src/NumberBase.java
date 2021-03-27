
/**
 *
 * @author Mostafa Mounir Shehab
 * 
 * User Name : Super Mari000
 * 
 */

public class NumberBase {

    private String dec, bin, oct, hex;
    
    public NumberBase() {
	dec= "";
        bin= "";
        oct= "";
        hex= "";
    }
    
    public void set_dec(String str) {
        dec= str;
        dec_to_bin();
        dec_to_oct();
        dec_to_hex();
    }

    public void set_bin(String str) {
        bin= str;
        bin_to_dec();
        dec_to_oct();
        dec_to_hex();
    }

    public void set_oct(String str) {
        oct= str;
        oct_to_dec();
        dec_to_bin();
        dec_to_hex();
    }

    public void set_hex(String str) {
        hex= str;
        hex_to_dec();
        dec_to_bin();
        dec_to_oct();
    }

    public String get_dec() {
        return dec;
    }

    public String get_bin() {
        return bin;
    }

    public String get_oct() {
        return oct;
    }

    public String get_hex() {
        return hex;
    }


    public void bin_to_dec() {
        int dec_res= 0;
        for(int i=0; i<bin.length(); i++) {
            char cur_char= bin.charAt(bin.length()-i-1);
            dec_res+= (int)(Double.parseDouble(cur_char + "") * Math.pow(2, i));
        }
        dec= dec_res+ "";
    }

    public void oct_to_dec() {
        int dec_res= 0;
        for(int i=0; i<oct.length(); i++) {
            char cur_char= oct.charAt(oct.length()-i-1);
            dec_res+= (int)(Double.parseDouble(cur_char+ "") * Math.pow(8, i));
        }
        dec= dec_res+ "";
    }

    public void hex_to_dec() {
        int dec_res= 0;
        for(int i=0; i<hex.length(); i++) {
            String cur_char= hex.charAt(hex.length()-i-1)+ "";

            if(cur_char.equals("A") || cur_char.equals("a")) 
                cur_char= "10";
            else if(cur_char.equals("B") || cur_char.equals("b"))
                cur_char= "11";
            else if(cur_char.equals("C") || cur_char.equals("c"))
                cur_char= "12";
            else if(cur_char.equals("D") || cur_char.equals("d"))
                cur_char= "13";
            else if(cur_char.equals("E") || cur_char.equals("e")) 
                cur_char= "14";
            else if(cur_char.equals("F") || cur_char.equals("f")) 
                cur_char= "15";

            dec_res+= (int)(Double.parseDouble(cur_char) * Math.pow(16, i));
        }
        dec= dec_res+ "";
    }

    public void dec_to_bin() {
        int cur_dec= (int) Double.parseDouble(dec);
        String cur_bin= "";
        while(cur_dec>0) {
            cur_bin+= cur_dec%2;
            cur_dec= (int)cur_dec/2;
        }
        StringBuilder tmp_bin= new StringBuilder();
        tmp_bin.append(cur_bin);
        tmp_bin.reverse();
        bin= tmp_bin.toString()+ "";
    }

    public void dec_to_oct() {
        int cur_dec= (int) Double.parseDouble(dec);
        String cur_oct= "";
        while(cur_dec>0) {
            cur_oct+= cur_dec%8;
            cur_dec= (int)cur_dec/8;
        }
        StringBuilder tmp_oct= new StringBuilder();
        tmp_oct.append(cur_oct);
        tmp_oct.reverse();
        oct= tmp_oct.toString()+ "";
    }

    public void dec_to_hex() {
        int cur_dec= (int) Double.parseDouble(dec);
        String cur_hex= "";
        while(cur_dec>0) {
            int tmp_hex= cur_dec%16;
            if(tmp_hex<10)
                cur_hex+= tmp_hex;
            else if(tmp_hex== 10)
                cur_hex+= 'A';
            else if(tmp_hex== 11)
                cur_hex+= 'B';
            else if(tmp_hex== 12)
                cur_hex+= 'C';
            else if(tmp_hex== 13)
                cur_hex+= 'D';
            else if(tmp_hex== 14)
                cur_hex+= 'E';
            else if(tmp_hex== 15)
                cur_hex+= 'F';
            cur_dec= (int) cur_dec/16;
        }
        StringBuilder tmp_hex_= new StringBuilder();
        tmp_hex_.append(cur_hex);
        tmp_hex_.reverse();
        hex= tmp_hex_.toString()+ "";
    }
    
    
}
