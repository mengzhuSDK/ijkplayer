package tv.mengzhu.sdk.media.player.misc;

@SimpleCClassName
public interface IMediaDataSource {
    int  readAt(long position, byte[] buffer, int offset, int size);
    long getSize();
    void close();
}
