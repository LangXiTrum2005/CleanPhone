package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.PeekSource;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Timeout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.c;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wi.d;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u001c\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a,\u0010\u0005\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\b\u0005\u0010\"\u001a$\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020$H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010(\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010'*\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010)\u001a\u001c\u0010-\u001a\u00020'*\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00104\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010/\u001a\u0014\u00105\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u0010/\u001a\u0014\u00106\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b8\u00107\u001a\u0014\u00109\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u00107\u001a\u0014\u0010:\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b:\u00107\u001a\u001c\u0010;\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b;\u0010\f\u001a,\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010@\u001a$\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010A\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010B\u001a$\u0010D\u001a\u00020\u0003*\u00020\u00002\u0006\u0010C\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bD\u0010B\u001a4\u0010F\u001a\u00020\u0007*\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\bF\u0010G\u001a\u0014\u0010I\u001a\u00020H*\u00020\u0000H\u0080\b¢\u0006\u0004\bI\u0010J\u001a\u0014\u0010K\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010N\u001a\u00020M*\u00020\u0000H\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\bP\u0010)¨\u0006Q"}, d2 = {"Lcom/applovin/shadow/okio/RealBufferedSource;", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "commonRead", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Buffer;J)J", "", "commonExhausted", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Z", "Lwj/r;", "commonRequire", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)V", "commonRequest", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)Z", "", "commonReadByte", "(Lcom/applovin/shadow/okio/RealBufferedSource;)B", "Lcom/applovin/shadow/okio/ByteString;", "commonReadByteString", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Lcom/applovin/shadow/okio/ByteString;", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Options;", "options", "", "commonSelect", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Options;)I", "", "commonReadByteArray", "(Lcom/applovin/shadow/okio/RealBufferedSource;)[B", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)[B", "commonReadFully", "(Lcom/applovin/shadow/okio/RealBufferedSource;[B)V", "offset", "(Lcom/applovin/shadow/okio/RealBufferedSource;[BII)I", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "commonReadAll", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Sink;)J", "", "commonReadUtf8", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Ljava/lang/String;", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)Ljava/lang/String;", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "(Lcom/applovin/shadow/okio/RealBufferedSource;)I", "", "commonReadShort", "(Lcom/applovin/shadow/okio/RealBufferedSource;)S", "commonReadShortLe", "commonReadInt", "commonReadIntLe", "commonReadLong", "(Lcom/applovin/shadow/okio/RealBufferedSource;)J", "commonReadLongLe", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonSkip", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "fromIndex", "toIndex", "commonIndexOf", "(Lcom/applovin/shadow/okio/RealBufferedSource;BJJ)J", "bytes", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "bytesOffset", "commonRangeEquals", "(Lcom/applovin/shadow/okio/RealBufferedSource;JLcom/applovin/shadow/okio/ByteString;II)Z", "Lcom/applovin/shadow/okio/BufferedSource;", "commonPeek", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Lcom/applovin/shadow/okio/BufferedSource;", "commonClose", "(Lcom/applovin/shadow/okio/RealBufferedSource;)V", "Lcom/applovin/shadow/okio/Timeout;", "commonTimeout", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Lcom/applovin/shadow/okio/Timeout;", "commonToString", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RealBufferedSource {
    public static final void commonClose(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        n.f(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        n.f(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte b10, long j10, long j11) {
        n.f(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            StringBuilder sbL = d.l(j10, "fromIndex=", " toIndex=");
            sbL.append(j11);
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jIndexOf = realBufferedSource.bufferField.indexOf(b11, jMax, j12);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j12 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, ByteString targetBytes, long j10) {
        n.f(realBufferedSource, "<this>");
        n.f(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    public static final BufferedSource commonPeek(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        n.f(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10, ByteString bytes, int i10, int i11) {
        n.f(realBufferedSource, "<this>");
        n.f(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!realBufferedSource.request(1 + j11) || realBufferedSource.bufferField.getByte(j11) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Buffer sink, long j10) {
        n.f(realBufferedSource, "<this>");
        n.f(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(e.i(j10, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j10, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Sink sink) throws IOException {
        n.f(realBufferedSource, "<this>");
        n.f(sink, "sink");
        long j10 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j10;
        }
        long size = realBufferedSource.bufferField.size() + j10;
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteArray(j10);
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteString(j10);
    }

    public static final long commonReadDecimalLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!realBufferedSource.request(j11)) {
                break;
            }
            byte b10 = realBufferedSource.bufferField.getByte(j10);
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
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte[] sink) throws EOFException {
        n.f(realBufferedSource, "<this>");
        n.f(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i11 = buffer.read(sink, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!realBufferedSource.request(i11)) {
                break;
            }
            byte b10 = realBufferedSource.bufferField.getByte(i10);
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
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readUtf8(j10);
    }

    public static final int commonReadUtf8CodePoint(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b10 = realBufferedSource.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b10 & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b10 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        n.f(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        n.f(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(e.i(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && realBufferedSource.request(j11) && realBufferedSource.bufferField.getByte(j11 - 1) == 13 && realBufferedSource.request(j11 + 1) && realBufferedSource.bufferField.getByte(j11) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j11);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j10) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) {
        n.f(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(e.i(j10, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j10) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        n.f(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
        n.f(realBufferedSource, "<this>");
        n.f(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        n.f(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j10 -= jMin;
        }
    }

    public static final Timeout commonTimeout(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        n.f(realBufferedSource, "<this>");
        return realBufferedSource.source.getTimeout();
    }

    public static final String commonToString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        n.f(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        n.f(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Buffer sink, long j10) throws IOException {
        n.f(realBufferedSource, "<this>");
        n.f(sink, "sink");
        try {
            realBufferedSource.require(j10);
            realBufferedSource.bufferField.readFully(sink, j10);
        } catch (EOFException e10) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e10;
        }
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, ByteString bytes, long j10) throws IOException {
        n.f(realBufferedSource, "<this>");
        n.f(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - ((long) bytes.size())) + 1);
        }
    }

    public static final int commonRead(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte[] sink, int i10, int i11) {
        n.f(realBufferedSource, "<this>");
        n.f(sink, "sink");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, j10);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(sink, i10, (int) Math.min(j10, realBufferedSource.bufferField.size()));
    }
}
