package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000b\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001a\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001f\u001a\u001c\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010 \u001a\u00020\fH\u0080\b¢\u0006\u0004\b!\u0010\u0018\u001a\u001c\u0010#\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b#\u0010\u0018\u001a\u001c\u0010$\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b$\u0010\u0018\u001a\u001c\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b&\u0010\u0018\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b'\u0010\u0018\u001a\u001c\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b+\u0010*\u001a\u001c\u0010,\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b,\u0010*\u001a\u001c\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00100\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b0\u0010/\u001a\u0014\u00101\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00105\u001a\u000204*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0014\u00107\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/applovin/shadow/okio/RealBufferedSink;", "Lcom/applovin/shadow/okio/Buffer;", "source", "", "byteCount", "Lwj/r;", "commonWrite", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/ByteString;", "byteString", "Lcom/applovin/shadow/okio/BufferedSink;", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/BufferedSink;", "", "offset", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/BufferedSink;", "", "string", "commonWriteUtf8", "(Lcom/applovin/shadow/okio/RealBufferedSink;Ljava/lang/String;)Lcom/applovin/shadow/okio/BufferedSink;", "beginIndex", "endIndex", "(Lcom/applovin/shadow/okio/RealBufferedSink;Ljava/lang/String;II)Lcom/applovin/shadow/okio/BufferedSink;", "codePoint", "commonWriteUtf8CodePoint", "(Lcom/applovin/shadow/okio/RealBufferedSink;I)Lcom/applovin/shadow/okio/BufferedSink;", "", "(Lcom/applovin/shadow/okio/RealBufferedSink;[B)Lcom/applovin/shadow/okio/BufferedSink;", "(Lcom/applovin/shadow/okio/RealBufferedSink;[BII)Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/Source;", "commonWriteAll", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/BufferedSink;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "commonWriteByte", "s", "commonWriteShort", "commonWriteShortLe", "i", "commonWriteInt", "commonWriteIntLe", "v", "commonWriteLong", "(Lcom/applovin/shadow/okio/RealBufferedSink;J)Lcom/applovin/shadow/okio/BufferedSink;", "commonWriteLongLe", "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "commonEmitCompleteSegments", "(Lcom/applovin/shadow/okio/RealBufferedSink;)Lcom/applovin/shadow/okio/BufferedSink;", "commonEmit", "commonFlush", "(Lcom/applovin/shadow/okio/RealBufferedSink;)V", "commonClose", "Lcom/applovin/shadow/okio/Timeout;", "commonTimeout", "(Lcom/applovin/shadow/okio/RealBufferedSink;)Lcom/applovin/shadow/okio/Timeout;", "commonToString", "(Lcom/applovin/shadow/okio/RealBufferedSink;)Ljava/lang/String;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RealBufferedSink {
    public static final void commonClose(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws Throwable {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        th = null;
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final BufferedSink commonEmit(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final BufferedSink commonEmitCompleteSegments(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final Timeout commonTimeout(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        n.f(realBufferedSink, "<this>");
        return realBufferedSink.sink.getTimeout();
    }

    public static final String commonToString(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        n.f(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final void commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Buffer source, long j10) throws IOException {
        n.f(realBufferedSink, "<this>");
        n.f(source, "source");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.write(source, j10);
        realBufferedSink.emitCompleteSegments();
    }

    public static final long commonWriteAll(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Source source) throws IOException {
        n.f(realBufferedSink, "<this>");
        n.f(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(realBufferedSink.bufferField, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeByte(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteDecimalLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeDecimalLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteInt(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeInt(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteIntLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeIntLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLongLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLongLe(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShort(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShort(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShortLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShortLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, String string) {
        n.f(realBufferedSink, "<this>");
        n.f(string, "string");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8(string);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8CodePoint(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        n.f(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, ByteString byteString) {
        n.f(realBufferedSink, "<this>");
        n.f(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWriteUtf8(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, String string, int i10, int i11) {
        n.f(realBufferedSink, "<this>");
        n.f(string, "string");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(string, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, ByteString byteString, int i10, int i11) {
        n.f(realBufferedSink, "<this>");
        n.f(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, byte[] source) {
        n.f(realBufferedSink, "<this>");
        n.f(source, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(source);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, byte[] source, int i10, int i11) {
        n.f(realBufferedSink, "<this>");
        n.f(source, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(source, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Source source, long j10) throws IOException {
        n.f(realBufferedSink, "<this>");
        n.f(source, "source");
        while (j10 > 0) {
            long j11 = source.read(realBufferedSink.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}
