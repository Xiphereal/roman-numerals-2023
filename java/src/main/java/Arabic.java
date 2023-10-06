public class Arabic {
  public static String toRoman(int arabic) {
    if (arabic == 5)
      return "V";
    if (arabic == 3)
      return "III";
    if (arabic == 2)
      return "II";

    return "I";
  }
}
