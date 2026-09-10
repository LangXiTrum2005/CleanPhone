package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSource;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BufferedSource extends Source, ReadableByteChannel {
    int S0(Options options);

    void e(Buffer buffer, long j);

    boolean exhausted();

    boolean f(long j, ByteString byteString);

    /* JADX INFO: renamed from: getBuffer */
    Buffer getF45155Y();

    InputStream inputStream();

    long o0(Buffer buffer);

    RealBufferedSource peek();

    byte readByte();

    byte[] readByteArray();

    ByteString readByteString();

    ByteString readByteString(long j);

    long readDecimalLong();

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    long readLong();

    short readShort();

    String readString(Charset charset);

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j);

    boolean request(long j);

    void require(long j);

    void skip(long j);
}
