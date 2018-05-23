/**
 * @author zhangbin
 * @date 2018/5/17 16:58
 */
public class Main {

  public static void main(String[] args) {
    Main main = new Main();
    main.noFacade();
    System.out.println("======");
    main.facadeCdPlay();
  }

  private void noFacade() {
    Amplifier amplifier = new AmplifierImpl();
    amplifier.open();
    amplifier.work();

    CdPlayer cdPlayer = new CdPlayerImpl();
    cdPlayer.open();
    cdPlayer.start();
    cdPlayer.play();
  }

  private void facadeCdPlay(){
    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new AmplifierImpl(), new CdPlayerImpl(), new DvdPlayerImpl());
    homeTheaterFacade.playCd();
  }
}
