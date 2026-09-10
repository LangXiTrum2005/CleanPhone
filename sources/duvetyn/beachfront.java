package duvetyn;

import com.ironsource.A5;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: BufferedSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b!\u0010#J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b)\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H&¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u000100H&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000200H&¢\u0006\u0004\b5\u00104J\u0017\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\tH&¢\u0006\u0004\b5\u00102J\u0017\u00109\u001a\u0002002\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020 H&¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020 H&¢\u0006\u0004\b?\u0010=J\u001f\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\t2\u0006\u0010;\u001a\u00020 H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0000H&¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH&¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0005\u0082\u0001\u0002\u0003Iø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006JÀ\u0006\u0001"}, d2 = {"Lduvetyn/beachfront;", "Lduvetyn/supplicat;", "Ljava/nio/channels/ReadableByteChannel;", "Lduvetyn/wireman;", "buffer", "()Lduvetyn/wireman;", "", "exhausted", "()Z", "", "byteCount", "", "require", "(J)V", AdActivity.REQUEST_KEY_EXTRA, "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "readShortLe", "", "readInt", "()I", "readIntLe", "readLongLe", "()J", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lduvetyn/rotuma;", "options", "splinterproof", "(Lduvetyn/rotuma;)I", "", "readByteArray", "()[B", "(J)[B", "Lduvetyn/sealless;", "sink", "clubfoot", "(Lduvetyn/sealless;)J", "", "readUtf8", "(J)Ljava/lang/String;", "readUtf8Line", "()Ljava/lang/String;", "readUtf8LineStrict", "limit", "Ljava/nio/charset/Charset;", A5.N, "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "bytes", "molybdenite", "(Lokio/ByteString;)J", "targetBytes", "gintrap", "offset", "trm", "(JLokio/ByteString;)Z", "peek", "()Lduvetyn/beachfront;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "getBuffer", "Lduvetyn/trm;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface beachfront extends supplicat, ReadableByteChannel {
    @patroclinal.wireman
    wireman buffer();

    long clubfoot(sealless sink) throws IOException;

    boolean exhausted() throws IOException;

    wireman getBuffer();

    long gintrap(ByteString targetBytes) throws IOException;

    InputStream inputStream();

    long molybdenite(ByteString bytes) throws IOException;

    beachfront peek();

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long byteCount) throws IOException;

    ByteString readByteString() throws IOException;

    ByteString readByteString(long byteCount) throws IOException;

    long readDecimalLong() throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8(long byteCount) throws IOException;

    String readUtf8Line() throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long limit) throws IOException;

    boolean request(long byteCount) throws IOException;

    void require(long byteCount) throws IOException;

    void skip(long byteCount) throws IOException;

    int splinterproof(rotuma options) throws IOException;

    boolean trm(long offset, ByteString bytes) throws IOException;
}
