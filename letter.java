public class letter {
    public static void main(String[] args) {
        String letter="Dear <|name|>, Thanks a lot !";
        letter=letter.replace("<|name|>", "Gauri");
        System.out.println(letter);
    }
}
    

