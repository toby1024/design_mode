/**
 * @author zhangbin
 * @date 2018/5/17 17:01
 */
public class HomeTheaterFacade {
  Amplifier amplifier;
  CdPlayer cdPlayer;
  DvdPlayer dvdPlayer;

  public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer) {
    this.amplifier = amplifier;
    this.cdPlayer = cdPlayer;
    this.dvdPlayer = dvdPlayer;
  }

  public void playCd(){
    amplifier.open();
    amplifier.work();

    cdPlayer.open();
    cdPlayer.start();
    cdPlayer.play();
  }
}
