public class fifaCard {

  public static void main(String[] args) {
    String getRP = getRandomPosition();
    String getC = getClub();
    int getRPa = getRandomPace();
    int getRD = getRandomDribbling();
    int getRS = getRandomShoot();
    int getRpas = getRandomPass();
    int getRDe = getRandomDef();
    int getPhy = getRandomPhy();
    String getNat = getNation();
    int overall = (getRpas + getRDe + getRPa + getRD + getRS + getPhy) / 5;

    System.out.println("  //---------------\\\\ ");
    System.out.println(" ||" + "        ///|\\\\\\  ||");
    System.out.println(" || " + overall + "     | O O |" + "  ||");
    System.out.println(" || " + getRP + "     |  ^  |" + "  ||");
    System.out.println(" ||" + "         \\___/   ||");
    System.out.println(" || " + getC.toUpperCase() + "       " + "      ||");
    System.out.println(" || " + getNat.toUpperCase() + "       " + "      ||");
    System.out.println(" ||-----------------||");
    System.out.println(" || " + getRPa +  " PAC   "+ getRD +" DRI"+ " ||");
    System.out.println(" || " + getRS +  " SHO   "+ getRDe +" DEF"+ " ||");
    System.out.println(" || " + getRpas +  " PAS   "+ getPhy +" PHY"+ " ||");
    System.out.println("  \\\\---------------//");
  }

  public static String getRandomPosition() {
    String[] position = { "LW", "CF", "SS", "RW" };
    int randomPosition = (int) (Math.random() * position.length);
    String acakPosisi = position[randomPosition];
    return acakPosisi;
  }

  public static int getRandomPace() {
    int paceStriker = 65 + (int) (Math.random() * 35);
    return paceStriker;
  }

  public static int getRandomDribbling() {
    int dribblingStriker = 65 + (int) (Math.random() * 35);
    return dribblingStriker;
  }

  public static int getRandomShoot() {
    int shootStriker = 65 + (int) (Math.random() * 35);
    return shootStriker;
  }

  public static int getRandomPass() {
    int passStriker = 65 + (int) (Math.random() * 35);
    return passStriker;
  }

  public static int getRandomDef() {
    int DefStriker = 10 + (int) (Math.random() * 50);
    return DefStriker;
  }

  public static int getRandomPhy() {
    int phyStriker = 65 + (int) (Math.random() * 35);
    return phyStriker;
  }

  public static String getClub() {
    String[] tim = {
      "MNC",
      "MNU",
      "CHE",
      "RMA",
      "BAR",
      "ATM",
      "PSG",
      "LIV",
      "ARS",
      "VAL",
      "SEV",
      "ACM",
      "JUV",
      "BAY",
      "DOR",
      "NAP",
      "MON",
      "INT",
    };
    int namaTim = (int) (Math.random() * tim.length);
    String randomTim = tim[namaTim];
    return randomTim;
  }

  public static int getHeight() {
    int heightStriker = 160 + (int) (Math.random() * 40);
    return heightStriker;
  }

  public static int getWeight() {
    int weightStriker = 50 + (int) (Math.random() * 40);
    return weightStriker;
  }

  public static String getFoot() {
    String[] kaki = { "R", "L" };
    int namaKaki = (int) (Math.random() * kaki.length);
    String randomKaki = kaki[namaKaki];
    return randomKaki;
  }

  public static String getNation() {
    String[] nation = {
      "ARG",
      "FRA",
      "CRO",
      "MAR",
      "POR",
      "NTH",
      "BRA",
      "ENG",
      "SPA",
      "GER",
      "IDN",
      "URU",
      "ITA",
      "BLG",
    };
    int namaNegara = (int) (Math.random() * nation.length);
    String randomNegara = nation[namaNegara];
    return randomNegara;
  }
}
