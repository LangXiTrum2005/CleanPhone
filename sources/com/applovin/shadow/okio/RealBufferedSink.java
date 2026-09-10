package com.applovin.shadow.okio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011J'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010!\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020$H\u0016¢\u0006\u0004\b\r\u0010%J'\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\r\u0010&J\u0017\u0010\r\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020'H\u0016¢\u0006\u0004\b\r\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010,J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010\u001eJ\u0017\u00100\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u001eJ\u0017\u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b1\u0010\u001eJ\u0017\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00104\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u001eJ\u0017\u00106\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00107J\u0017\u00109\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u00107J\u0017\u0010:\u001a\u00020\u00012\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u00107J\u000f\u0010;\u001a\u00020\u0001H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0001H\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\fH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0016¢\u0006\u0004\bF\u0010BJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0015H\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010M\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020C8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010\u0007\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bS\u0010B\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/applovin/shadow/okio/RealBufferedSink;", "Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/Sink;", "sink", "<init>", "(Llo/r;)V", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "()Lcom/applovin/shadow/okio/Buffer;", "source", "", "byteCount", "Lwj/r;", "write", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/ByteString;", "byteString", "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/BufferedSink;", "", "offset", "(Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/BufferedSink;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lcom/applovin/shadow/okio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "(I)Lcom/applovin/shadow/okio/BufferedSink;", "Ljava/nio/charset/Charset;", B5.N, "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/applovin/shadow/okio/BufferedSink;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lcom/applovin/shadow/okio/BufferedSink;", "", "([B)Lcom/applovin/shadow/okio/BufferedSink;", "([BII)Lcom/applovin/shadow/okio/BufferedSink;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Lcom/applovin/shadow/okio/Source;", "writeAll", "(Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/BufferedSink;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lcom/applovin/shadow/okio/BufferedSink;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "emitCompleteSegments", "()Lcom/applovin/shadow/okio/BufferedSink;", "emit", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "flush", "()V", "", "isOpen", "()Z", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "Lcom/applovin/shadow/okio/Sink;", "bufferField", "Lcom/applovin/shadow/okio/Buffer;", "closed", "Z", "getBuffer", "()Llo/e;", "getBuffer$annotations", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink) {
        n.f(sink, "sink");
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    /* JADX INFO: renamed from: buffer, reason: from getter */
    public Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        th = null;
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink emit() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink emitCompleteSegments() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.bufferField, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.applovin.shadow.okio.RealBufferedSink.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    return;
                }
                realBufferedSink.flush();
            }

            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int b10) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    throw new IOException("closed");
                }
                realBufferedSink.bufferField.writeByte((int) ((byte) b10));
                RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) throws IOException {
                n.f(data, "data");
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.write(data, offset, byteCount);
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.applovin.shadow.okio.Sink
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.sink.getTimeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        n.f(source, "source");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.bufferField.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        n.f(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.bufferField, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            emitCompleteSegments();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeByte(int b10) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeByte(b10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeDecimalLong(long v4) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeDecimalLong(v4);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long v4) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeHexadecimalUnsignedLong(v4);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeInt(int i10) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeInt(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeIntLe(int i10) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeIntLe(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeLong(long v4) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeLong(v4);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeLongLe(long v4) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeLongLe(v4);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeShort(int s10) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeShort(s10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeShortLe(int s10) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeShortLe(s10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeString(String string, Charset charset) {
        n.f(string, "string");
        n.f(charset, "charset");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8(String string) {
        n.f(string, "string");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int codePoint) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeUtf8CodePoint(codePoint);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long byteCount) throws IOException {
        n.f(source, "source");
        if (!this.closed) {
            this.bufferField.write(source, byteCount);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeString(String string, int beginIndex, int endIndex, Charset charset) {
        n.f(string, "string");
        n.f(charset, "charset");
        if (!this.closed) {
            this.bufferField.writeString(string, beginIndex, endIndex, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8(String string, int beginIndex, int endIndex) {
        n.f(string, "string");
        if (!this.closed) {
            this.bufferField.writeUtf8(string, beginIndex, endIndex);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(ByteString byteString) {
        n.f(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(ByteString byteString, int offset, int byteCount) {
        n.f(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString, offset, byteCount);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(byte[] source) {
        n.f(source, "source");
        if (!this.closed) {
            this.bufferField.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(byte[] source, int offset, int byteCount) {
        n.f(source, "source");
        if (!this.closed) {
            this.bufferField.write(source, offset, byteCount);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(Source source, long byteCount) throws IOException {
        n.f(source, "source");
        while (byteCount > 0) {
            long j10 = source.read(this.bufferField, byteCount);
            if (j10 != -1) {
                byteCount -= j10;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
