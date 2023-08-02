public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate data = new FormDate();
        data.day = 13;
        data.month = 6;
        data.year = 1999;
        post.birthday = data;
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}