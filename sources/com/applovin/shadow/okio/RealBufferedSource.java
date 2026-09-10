package com.applovin.shadow.okio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\"H\u0016¢\u0006\u0004\b\f\u0010&J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010(J'\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\f\u0010*J\u0017\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020+H\u0016¢\u0006\u0004\b\f\u0010,J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00104J\u0017\u00107\u001a\u0002012\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00107\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00109J\u0011\u0010:\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b:\u00103J\u000f\u0010;\u001a\u000201H\u0016¢\u0006\u0004\b;\u00103J\u0017\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u00104J\u000f\u0010=\u001a\u00020\u001fH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020?H\u0016¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\u001fH\u0016¢\u0006\u0004\bC\u0010>J\u000f\u0010D\u001a\u00020\u001fH\u0016¢\u0006\u0004\bD\u0010>J\u000f\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010FJ\u000f\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010FJ\u0017\u0010J\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bJ\u0010\u0013J\u0017\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u0016H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010OJ'\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010QJ\u0017\u0010L\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\bL\u0010SJ\u001f\u0010L\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010TJ\u0017\u0010V\u001a\u00020\n2\u0006\u0010U\u001a\u00020\u0019H\u0016¢\u0006\u0004\bV\u0010SJ\u001f\u0010V\u001a\u00020\n2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010TJ\u001f\u0010W\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\bW\u0010XJ/\u0010W\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\bW\u0010ZJ\u000f\u0010[\u001a\u00020\u0001H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u000eH\u0016¢\u0006\u0004\b`\u0010\u0010J\u000f\u0010a\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u000201H\u0016¢\u0006\u0004\bf\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010gR\u0014\u0010h\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010\u0007\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bn\u0010b\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/applovin/shadow/okio/RealBufferedSource;", "Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/Source;", "source", "<init>", "(Llo/t;)V", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "()Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "", "exhausted", "()Z", "Lwj/r;", "require", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lcom/applovin/shadow/okio/ByteString;", "readByteString", "()Lcom/applovin/shadow/okio/ByteString;", "(J)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Options;", "options", "", "select", "(Lcom/applovin/shadow/okio/Options;)I", "", "readByteArray", "()[B", "(J)[B", "([B)I", "readFully", "([B)V", "offset", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "readAll", "(Lcom/applovin/shadow/okio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", B5.N, "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "()I", "", "readShort", "()S", "readShortLe", "readInt", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lcom/applovin/shadow/okio/ByteString;)J", "(Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLcom/applovin/shadow/okio/ByteString;)Z", "bytesOffset", "(JLcom/applovin/shadow/okio/ByteString;II)Z", "peek", "()Lcom/applovin/shadow/okio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "isOpen", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", InAppPurchaseConstants.METHOD_TO_STRING, "Lcom/applovin/shadow/okio/Source;", "bufferField", "Lcom/applovin/shadow/okio/Buffer;", "closed", "Z", "getBuffer", "()Llo/e;", "getBuffer$annotations", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RealBufferedSource implements BufferedSource {
    public final Buffer bufferField;
    public boolean closed;
    public final Source source;

    public RealBufferedSource(Source source) {
        n.f(source, "source");
        this.source = source;
        this.bufferField = new Buffer();
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    /* JADX INFO: renamed from: buffer, reason: from getter */
    public Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean exhausted() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString targetBytes) {
        n.f(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.applovin.shadow.okio.RealBufferedSource.inputStream.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(realBufferedSource.bufferField.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                if (realBufferedSource.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                    if (realBufferedSource2.source.read(realBufferedSource2.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.readByte() & 255;
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] data, int offset, int byteCount) throws IOException {
                n.f(data, "data");
                if (!RealBufferedSource.this.closed) {
                    SegmentedByteString.checkOffsetAndCount(data.length, offset, byteCount);
                    if (RealBufferedSource.this.bufferField.size() == 0) {
                        RealBufferedSource realBufferedSource = RealBufferedSource.this;
                        if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                            return -1;
                        }
                    }
                    return RealBufferedSource.this.bufferField.read(data, offset, byteCount);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long offset, ByteString bytes) {
        n.f(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] sink) {
        n.f(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        n.f(sink, "sink");
        long j10 = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(this.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j10;
        }
        long size = this.bufferField.size() + j10;
        Buffer buffer = this.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte readByte() throws EOFException {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte b10 = this.bufferField.getByte(j10);
            if ((b10 < 48 || b10 > 57) && !(j10 == 0 && b10 == 45)) {
                if (j10 != 0) {
                    break;
                }
                c.b(16);
                c.b(16);
                String string = Integer.toString(b10, 16);
                n.e(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            j10 = j11;
        }
        return this.bufferField.readDecimalLong();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(byte[] sink) throws EOFException {
        n.f(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int i11 = buffer.read(sink, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte b10 = this.bufferField.getByte(i10);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                if (i10 != 0) {
                    break;
                }
                c.b(16);
                c.b(16);
                String string = Integer.toString(b10, 16);
                n.e(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i10 = i11;
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readInt() throws EOFException {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readIntLe() throws EOFException {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLong() throws EOFException {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLongLe() throws EOFException {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShort() throws EOFException {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShortLe() throws EOFException {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(long byteCount, Charset charset) throws EOFException {
        n.f(charset, "charset");
        require(byteCount);
        return this.bufferField.readString(byteCount, charset);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        require(1L);
        byte b10 = this.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            require(2L);
        } else if ((b10 & 240) == 224) {
            require(3L);
        } else if ((b10 & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.size() < byteCount) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int select(Options options) throws EOFException {
        n.f(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = com.applovin.shadow.okio.internal.Buffer.selectPrefix(this.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void skip(long byteCount) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.size());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // com.applovin.shadow.okio.Source
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.source.getTimeout();
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long fromIndex) {
        return indexOf(b10, fromIndex, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString targetBytes, long fromIndex) {
        n.f(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = this.bufferField.indexOfElement(targetBytes, fromIndex);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long byteCount) {
        n.f(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1L;
        }
        return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.size()));
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(e.i(limit, "limit < 0: ").toString());
        }
        long j10 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j10);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && this.bufferField.getByte(j10 - 1) == 13 && request(j10 + 1) && this.bufferField.getByte(j10) == 10) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this.bufferField, j10);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), limit) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString bytes) {
        n.f(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long offset, ByteString bytes, int bytesOffset, int byteCount) {
        n.f(bytes, "bytes");
        if (!this.closed) {
            if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.size() - bytesOffset < byteCount) {
                return false;
            }
            for (int i10 = 0; i10 < byteCount; i10++) {
                long j10 = ((long) i10) + offset;
                if (!request(1 + j10) || this.bufferField.getByte(j10) != bytes.getByte(bytesOffset + i10)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            StringBuilder sbL = d.l(fromIndex, "fromIndex=", " toIndex=");
            sbL.append(toIndex);
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        long jMax = fromIndex;
        while (jMax < toIndex) {
            byte b11 = b10;
            long j10 = toIndex;
            long jIndexOf = this.bufferField.indexOf(b11, jMax, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (size >= j10 || this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            toIndex = j10;
        }
        return -1L;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(Charset charset) throws IOException {
        n.f(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteArray(byteCount);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteString(byteCount);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readUtf8(byteCount);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(Buffer sink, long byteCount) throws IOException {
        n.f(sink, "sink");
        try {
            require(byteCount);
            this.bufferField.readFully(sink, byteCount);
        } catch (EOFException e10) {
            sink.writeAll(this.bufferField);
            throw e10;
        }
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] sink, int offset, int byteCount) {
        n.f(sink, "sink");
        long j10 = byteCount;
        SegmentedByteString.checkOffsetAndCount(sink.length, offset, j10);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, offset, (int) Math.min(j10, this.bufferField.size()));
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString bytes, long fromIndex) throws IOException {
        n.f(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = this.bufferField.indexOf(bytes, fromIndex);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - ((long) bytes.size())) + 1);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        n.f(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
