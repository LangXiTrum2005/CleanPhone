package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\u00020\u0001:\u0001LB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b+\u0010\u0014J%\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b/\u00100J%\u00104\u001a\u00020\f2\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00106\u001a\u00020\n¢\u0006\u0004\b7\u0010\u000eJ-\u0010:\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010\u0010J+\u0010>\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010B\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okio/BufferedSink;", "sink", "", "client", "<init>", "(Llo/f;Z)V", "", "streamId", "", "byteCount", "Lwj/r;", "writeContinuationFrames", "(IJ)V", "connectionPreface", "()V", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lcom/applovin/shadow/okhttp3/internal/http2/Settings;)V", "promisedStreamId", "", "Lcom/applovin/shadow/okhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "rstStream", "(ILcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Lcom/applovin/shadow/okio/Buffer;", "source", "data", "(ZILcom/applovin/shadow/okio/Buffer;I)V", "flags", "buffer", "dataFrame", "(IILcom/applovin/shadow/okio/Buffer;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", "(IIII)V", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "headerBlock", "headers", "(ZILjava/util/List;)V", "Lcom/applovin/shadow/okio/BufferedSink;", "Z", "hpackBuffer", "Lcom/applovin/shadow/okio/Buffer;", "maxFrameSize", "I", "closed", "Lcom/applovin/shadow/okhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lcom/applovin/shadow/okhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lfo/d;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    public Http2Writer(BufferedSink sink, boolean z10) {
        n.f(sink, "sink");
        this.sink = sink;
        this.client = z10;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    private final void writeContinuationFrames(int streamId, long byteCount) throws IOException {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            frameHeader(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) throws IOException {
        try {
            n.f(peerSettings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
                }
                this.sink.write(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void data(boolean outFinished, int streamId, Buffer source, int byteCount) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final void dataFrame(int streamId, int flags, Buffer buffer, int byteCount) throws IOException {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            BufferedSink bufferedSink = this.sink;
            n.c(buffer);
            bufferedSink.write(buffer, byteCount);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int streamId, int length, int type, int flags) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i10 = streamId;
            i11 = length;
            i12 = type;
            i13 = flags;
            logger2.fine(Http2.INSTANCE.frameLog(false, i10, i11, i12, i13));
        } else {
            i10 = streamId;
            i11 = length;
            i12 = type;
            i13 = flags;
        }
        if (i11 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(d.e(i10, "reserved bit set: ").toString());
        }
        Util.writeMedium(this.sink, i11);
        this.sink.writeByte(i12 & 255);
        this.sink.writeByte(i13 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i10);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) throws IOException {
        try {
            n.f(errorCode, "errorCode");
            n.f(debugData, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, debugData.length + 8, 7, 0);
            this.sink.writeInt(lastGoodStreamId);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.sink.write(debugData);
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void headers(boolean outFinished, int streamId, List<Header> headerBlock) throws IOException {
        n.f(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.hpackBuffer.size();
        long jMin = Math.min(this.maxFrameSize, size);
        int i10 = size == jMin ? 4 : 0;
        if (outFinished) {
            i10 |= 1;
        }
        frameHeader(streamId, (int) jMin, 1, i10);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(streamId, size - jMin);
        }
    }

    /* JADX INFO: renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean ack, int payload1, int payload2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, ack ? 1 : 0);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) throws IOException {
        n.f(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.hpackBuffer.size();
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
        long j10 = iMin;
        frameHeader(streamId, iMin + 4, 5, size == j10 ? 4 : 0);
        this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j10);
        if (size > j10) {
            writeContinuationFrames(streamId, size - j10);
        }
    }

    public final synchronized void rstStream(int streamId, ErrorCode errorCode) throws IOException {
        n.f(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        frameHeader(streamId, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) throws IOException {
        int i10;
        try {
            n.f(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i11 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i11 < 10) {
                if (settings.isSet(i11)) {
                    if (i11 != 4) {
                        i10 = i11 != 7 ? i11 : 4;
                    } else {
                        i10 = 3;
                    }
                    this.sink.writeShort(i10);
                    this.sink.writeInt(settings.get(i11));
                }
                i11++;
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        frameHeader(streamId, 4, 8, 0);
        this.sink.writeInt((int) windowSizeIncrement);
        this.sink.flush();
    }
}
