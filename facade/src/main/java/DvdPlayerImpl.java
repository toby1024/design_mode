/**
 * @author zhangbin
 * @date 2018/5/17 16:57
 */
public class DvdPlayerImpl implements DvdPlayer {
  @Override
  public void open() {
    System.out.println("打开dvd");
  }

  @Override
  public void play() {
    System.out.println("dvd 播放中");
  }

  @Override
  public void start() {
    System.out.println("开始dvd播放");
  }

  @Override
  public void stop() {
    System.out.println("停止dvd播放");
  }

  @Override
  public void pause() {
    System.out.println("暂停dvd播放");
  }

  @Override
  public void close() {
    System.out.println("关闭dvd");
  }
}
