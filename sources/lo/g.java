package lo;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface g extends t, ReadableByteChannel {
    InputStream inputStream();

    byte readByte();

    byte[] readByteArray();

    h readByteString(long j10);

    long readHexadecimalUnsignedLong();

    int readInt();

    short readShort();

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j10);

    void require(long j10);

    void skip(long j10);
}
