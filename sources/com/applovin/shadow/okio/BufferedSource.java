package com.applovin.shadow.okio;

import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010$J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020)2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b*\u0010,J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020)H&¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020)H&¢\u0006\u0004\b0\u00101J'\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020)2\u0006\u00102\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\b.\u00103J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b0\u00104J\u0017\u00106\u001a\u00020\t2\u0006\u0010-\u001a\u000205H&¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H&¢\u0006\u0004\b9\u0010:J\u0017\u00109\u001a\u0002082\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b9\u0010;J\u0011\u0010<\u001a\u0004\u0018\u000108H&¢\u0006\u0004\b<\u0010:J\u000f\u0010=\u001a\u000208H&¢\u0006\u0004\b=\u0010:J\u0017\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020\tH&¢\u0006\u0004\b=\u0010;J\u000f\u0010?\u001a\u00020\u0017H&¢\u0006\u0004\b?\u0010\u0019J\u0017\u0010B\u001a\u0002082\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\bB\u0010CJ\u001f\u0010B\u001a\u0002082\u0006\u0010\n\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\bB\u0010DJ\u0017\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0010H&¢\u0006\u0004\bF\u0010GJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\tH&¢\u0006\u0004\bF\u0010IJ'\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\t2\u0006\u0010J\u001a\u00020\tH&¢\u0006\u0004\bF\u0010KJ\u0017\u0010F\u001a\u00020\t2\u0006\u0010L\u001a\u00020!H&¢\u0006\u0004\bF\u0010MJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010L\u001a\u00020!2\u0006\u0010H\u001a\u00020\tH&¢\u0006\u0004\bF\u0010NJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020!H&¢\u0006\u0004\bP\u0010MJ\u001f\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020!2\u0006\u0010H\u001a\u00020\tH&¢\u0006\u0004\bP\u0010NJ\u001f\u0010Q\u001a\u00020\u00062\u0006\u00102\u001a\u00020\t2\u0006\u0010L\u001a\u00020!H&¢\u0006\u0004\bQ\u0010RJ/\u0010Q\u001a\u00020\u00062\u0006\u00102\u001a\u00020\t2\u0006\u0010L\u001a\u00020!2\u0006\u0010S\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\bQ\u0010TJ\u000f\u0010U\u001a\u00020\u0000H&¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH&¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0001\u0002\u0003\\ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006]À\u0006\u0001"}, d2 = {"Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "()Lcom/applovin/shadow/okio/Buffer;", "", "exhausted", "()Z", "", "byteCount", "Lwj/r;", "require", "(J)V", "request", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "readShortLe", "", "readInt", "()I", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "Lcom/applovin/shadow/okio/ByteString;", "readByteString", "()Lcom/applovin/shadow/okio/ByteString;", "(J)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Options;", "options", "select", "(Lcom/applovin/shadow/okio/Options;)I", "", "readByteArray", "()[B", "(J)[B", "sink", "read", "([B)I", "readFully", "([B)V", "offset", "([BII)I", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "readAll", "(Lcom/applovin/shadow/okio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "Ljava/nio/charset/Charset;", B5.N, "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lcom/applovin/shadow/okio/ByteString;)J", "(Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLcom/applovin/shadow/okio/ByteString;)Z", "bytesOffset", "(JLcom/applovin/shadow/okio/ByteString;II)Z", "peek", "()Lcom/applovin/shadow/okio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "getBuffer", "()Llo/e;", "Lcom/applovin/shadow/okio/RealBufferedSource;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface BufferedSource extends Source, ReadableByteChannel {
    Buffer buffer();

    boolean exhausted() throws IOException;

    Buffer getBuffer();

    long indexOf(byte b10) throws IOException;

    long indexOf(byte b10, long fromIndex) throws IOException;

    long indexOf(byte b10, long fromIndex, long toIndex) throws IOException;

    long indexOf(ByteString bytes) throws IOException;

    long indexOf(ByteString bytes, long fromIndex) throws IOException;

    long indexOfElement(ByteString targetBytes) throws IOException;

    long indexOfElement(ByteString targetBytes, long fromIndex) throws IOException;

    InputStream inputStream();

    BufferedSource peek();

    boolean rangeEquals(long offset, ByteString bytes) throws IOException;

    boolean rangeEquals(long offset, ByteString bytes, int bytesOffset, int byteCount) throws IOException;

    int read(byte[] sink) throws IOException;

    int read(byte[] sink, int offset, int byteCount) throws IOException;

    long readAll(Sink sink) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long byteCount) throws IOException;

    ByteString readByteString() throws IOException;

    ByteString readByteString(long byteCount) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(Buffer sink, long byteCount) throws IOException;

    void readFully(byte[] sink) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readString(long byteCount, Charset charset) throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8() throws IOException;

    String readUtf8(long byteCount) throws IOException;

    int readUtf8CodePoint() throws IOException;

    String readUtf8Line() throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long limit) throws IOException;

    boolean request(long byteCount) throws IOException;

    void require(long byteCount) throws IOException;

    int select(Options options) throws IOException;

    void skip(long byteCount) throws IOException;
}
