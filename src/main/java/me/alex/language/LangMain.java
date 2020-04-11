package me.alex.language;

public class LangMain {
  public static void main(String... args) {
    System.out.println("Hello Word");

    final SyllableStructure syllableStructure = new SyllableStructure("CCCVCCCCC", 3, 1,5);
    final Word word = new Word(syllableStructure);
    System.out.println(word.generateMonosyllable());
  }
}