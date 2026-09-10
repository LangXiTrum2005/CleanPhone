package com.applovin.shadow.okio;

import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\b\u0010\u0010J'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H&¢\u0006\u0004\b\b\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J/\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\nH&¢\u0006\u0004\b'\u0010 J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b)\u0010 J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b,\u0010 J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b-\u0010 J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0000H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0000H&¢\u0006\u0004\b9\u00108J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0001\u0002\u0003?ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, d2 = {"Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "()Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/ByteString;", "byteString", "write", "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/BufferedSink;", "", "offset", "byteCount", "(Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/BufferedSink;", "", "source", "([B)Lcom/applovin/shadow/okio/BufferedSink;", "([BII)Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/Source;", "", "writeAll", "(Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/BufferedSink;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lcom/applovin/shadow/okio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "(I)Lcom/applovin/shadow/okio/BufferedSink;", "Ljava/nio/charset/Charset;", B5.N, "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/applovin/shadow/okio/BufferedSink;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lcom/applovin/shadow/okio/BufferedSink;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lcom/applovin/shadow/okio/BufferedSink;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "Lwj/r;", "flush", "()V", "emit", "()Lcom/applovin/shadow/okio/BufferedSink;", "emitCompleteSegments", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "getBuffer", "()Llo/e;", "Lcom/applovin/shadow/okio/RealBufferedSink;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface BufferedSink extends Sink, WritableByteChannel {
    /* JADX INFO: renamed from: buffer */
    Buffer getBufferField();

    BufferedSink emit() throws IOException;

    BufferedSink emitCompleteSegments() throws IOException;

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    void flush() throws IOException;

    Buffer getBuffer();

    OutputStream outputStream();

    BufferedSink write(ByteString byteString) throws IOException;

    BufferedSink write(ByteString byteString, int offset, int byteCount) throws IOException;

    BufferedSink write(Source source, long byteCount) throws IOException;

    BufferedSink write(byte[] source) throws IOException;

    BufferedSink write(byte[] source, int offset, int byteCount) throws IOException;

    long writeAll(Source source) throws IOException;

    BufferedSink writeByte(int b10) throws IOException;

    BufferedSink writeDecimalLong(long v4) throws IOException;

    BufferedSink writeHexadecimalUnsignedLong(long v4) throws IOException;

    BufferedSink writeInt(int i10) throws IOException;

    BufferedSink writeIntLe(int i10) throws IOException;

    BufferedSink writeLong(long v4) throws IOException;

    BufferedSink writeLongLe(long v4) throws IOException;

    BufferedSink writeShort(int s10) throws IOException;

    BufferedSink writeShortLe(int s10) throws IOException;

    BufferedSink writeString(String string, int beginIndex, int endIndex, Charset charset) throws IOException;

    BufferedSink writeString(String string, Charset charset) throws IOException;

    BufferedSink writeUtf8(String string) throws IOException;

    BufferedSink writeUtf8(String string, int beginIndex, int endIndex) throws IOException;

    BufferedSink writeUtf8CodePoint(int codePoint) throws IOException;
}
