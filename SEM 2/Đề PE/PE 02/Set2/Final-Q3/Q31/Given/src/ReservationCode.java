
public class ReservationCode {

    String code;
    String customerName;

    public ReservationCode(String code, String customerName) {
        this.code = code;
        this.customerName = customerName;
    }

    String getCode() {
        String result = "";
        for (int i = 0; i < code.length(); i += 3) {
            result += code.substring(i, i + 3);
            result += "-";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    @Override
    public String toString() {
        return customerName + "\t" + code;
    }

}
