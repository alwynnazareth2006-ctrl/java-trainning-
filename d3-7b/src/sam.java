interface camera_app{
    void click_picture();

}
interface music_app {
    void play();
}
class mobile implements camera_app,music_app{
    @Override
    public void click_picture() {
        System.out.println("picture clicked");
    }

    @Override
    public void play() {
        System.out.println("song play");
    }
}
public class sam {
    public static void main(String[] args){
        mobile d=new mobile();
        d.click_picture();
        d.play();
    }
}
