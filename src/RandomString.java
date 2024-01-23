public class RandomString {
  public static void main(String[] args) {
    String randomStr = randomStr(120);
    System.out.println(randomStr);
  }

  static int randomNumber(int max) {
    double random = Math.floor(Math.random() * max);
    return (int) random;
  }

  static String randomStr(int nbChar) {
    StringBuilder str = new StringBuilder();
    String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    for (int i = 0; i < nbChar; i++) {
      int randomIndex = randomNumber(alphaNum.length());
      char randomChar = alphaNum.charAt(randomIndex);
      str.append(randomChar);
    }

    return str.toString();
  }
}
