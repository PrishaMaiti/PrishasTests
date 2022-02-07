public class Invitation {
        private String hostName;
        private String address;

        public Invitation(String n, String a) {
            hostName = n;
            address = a;
        }
        public String getHostName() {
            return hostName;
        }

        public String changeAddress(String a) {
            address = a;
            return address;
        }

        public String sendInvite(String name) {
            String invite = "Dear " + name + "," + " please attend my event at " + address + "." + " See you then, " + hostName + ".";
            return invite;
        }
        public Invitation(String a) {
            address = a;
            hostName = "Host";
        }
        // public static void main (String[] args) {
        //   Invitation inv1 = new Invitation("1234 Walnut Street");
        //   System.out.println(inv1.sendInvite("Cheryl"));
        // }
    }