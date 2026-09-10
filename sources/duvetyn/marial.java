package duvetyn;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0010H&¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0000H&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0000H&¢\u0006\u0004\b*\u0010)J\u000f\u0010,\u001a\u00020+H&¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0001\u0002.2ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, d2 = {"Lduvetyn/marial;", "Lduvetyn/sealless;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/ByteString;", "byteString", "sensatory", "(Lokio/ByteString;)Lduvetyn/marial;", "", "source", "write", "([B)Lduvetyn/marial;", "", "offset", "byteCount", "([BII)Lduvetyn/marial;", "Lduvetyn/supplicat;", "", "impromptu", "(Lduvetyn/supplicat;)J", "", "string", "writeUtf8", "(Ljava/lang/String;)Lduvetyn/marial;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lduvetyn/marial;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "writeByte", "(I)Lduvetyn/marial;", "s", "writeShort", "i", "writeInt", "v", "writeDecimalLong", "(J)Lduvetyn/marial;", "writeHexadecimalUnsignedLong", "", "flush", "()V", "emit", "()Lduvetyn/marial;", "emitCompleteSegments", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "Lduvetyn/wireman;", "getBuffer", "()Lduvetyn/wireman;", "buffer", "Lduvetyn/stratoscope;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface marial extends sealless, WritableByteChannel {
    marial emit() throws IOException;

    marial emitCompleteSegments() throws IOException;

    @Override // duvetyn.sealless, java.io.Flushable
    void flush() throws IOException;

    wireman getBuffer();

    long impromptu(supplicat source) throws IOException;

    OutputStream outputStream();

    marial sensatory(ByteString byteString) throws IOException;

    marial write(byte[] source) throws IOException;

    marial write(byte[] source, int offset, int byteCount) throws IOException;

    marial writeByte(int b) throws IOException;

    marial writeDecimalLong(long v) throws IOException;

    marial writeHexadecimalUnsignedLong(long v) throws IOException;

    marial writeInt(int i) throws IOException;

    marial writeShort(int s) throws IOException;

    marial writeUtf8(String string) throws IOException;

    marial writeUtf8(String string, int beginIndex, int endIndex) throws IOException;
}
