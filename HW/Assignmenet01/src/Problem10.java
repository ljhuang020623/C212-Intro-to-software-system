public class Problem10 {
    public static boolean isValidIpv4(String ip) {
        String[] octets = ip.split("\\.");

        if (octets.length != 4) {
            return false; // IP should have 4 octets
        }

        int[] values = new int[4]; // Array to store octet values

        for (int i = 0; i < 4; i++) {
            String octet = octets[i];

            if (!octet.matches("\\d+")) {
                return false; // Octet should be numeric
            }

            values[i] = Integer.parseInt(octet);

            if (values[i] < 0 || values[i] > 255) {
                return false; // Octet value should be between 0 and 255
            }
        }

        return true;
    }
}
