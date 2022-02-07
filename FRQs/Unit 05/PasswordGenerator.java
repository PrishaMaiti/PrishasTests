import java.util.Random;

public class PasswordGenerator {
        private int _numGenPws = 0;
        private int _digitsCount;
        private String _prefix;

        public PasswordGenerator(int digitsCount, String prefix) {
            _prefix = prefix;
            _digitsCount = digitsCount;
        }

        public PasswordGenerator(int digitsCount) {
            _prefix = "A";
            _digitsCount = digitsCount;
        }

        public int pwCount() {
            System.out.println(_numGenPws);
            return _numGenPws;
        }

        public String pwGen() {
            // we need _digitsCount (how many) of random digits each 0-9
            String randomSequence = "";
            for(int i=1; i<=_digitsCount; i++) {
                int randomDigit = (int)(Math.random() * 10);
                randomSequence += randomDigit;
            }
            String password = _prefix + "." + randomSequence;
            _numGenPws++;
            System.out.println(password);
            return password;
        }
        // public static void main(String[] args){
        //   PasswordGenerator pw1 = new
        //         PasswordGenerator(4, "chs");
        // pw1.pwCount();
        // pw1.pwGen();
        // pw1.pwGen();
        // pw1.pwCount();

        // PasswordGenerator pw2 = new
        //         PasswordGenerator(6);
        // pw2.pwCount();
        // pw2.pwGen();
        // pw2.pwCount();

        // // Check if pw1 has changed
        // pw1.pwCount();
        // pw1.pwGen();
        // pw1.pwCount();
        // }
    }