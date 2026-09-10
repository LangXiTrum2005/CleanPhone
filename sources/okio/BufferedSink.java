package okio;

import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BufferedSink extends Sink, WritableByteChannel {
    BufferedSink H0(ByteString byteString);

    BufferedSink M0(int i2, int i3, byte[] bArr);

    BufferedSink emit();

    BufferedSink emitCompleteSegments();

    @Override // okio.Sink, java.io.Flushable
    void flush();

    long g(Source source);

    /* JADX INFO: renamed from: getBuffer */
    Buffer getF45155Y();

    BufferedSink write(byte[] bArr);

    BufferedSink writeByte(int i2);

    BufferedSink writeDecimalLong(long j);

    BufferedSink writeHexadecimalUnsignedLong(long j);

    BufferedSink writeInt(int i2);

    BufferedSink writeShort(int i2);

    BufferedSink writeUtf8(String str);
}
