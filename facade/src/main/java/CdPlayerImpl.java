/**
 * @author zhangbin
 * @date 2018/5/17 16:56
 */
public class CdPlayerImpl implements CdPlayer {
  @Override
  public void open() {
    System.out.println("打开cd");
  }

  @Override
  public void play() {
    System.out.println("cd 播放中");
  }

  @Override
  public void start() {
    System.out.println("开始cd播放");
  }

  @Override
  public void stop() {
    System.out.println("停止cd播放");
  }

  @Override
  public void pause() {
    System.out.println("暂停cd播放");
  }

  @Override
  public void close() {
    System.out.println("关闭cd");
  }
}
