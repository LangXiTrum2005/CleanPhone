package formularism;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\nJ\u001d\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u000eJ%\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.J%\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J-\u0010:\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010\nJ+\u0010>\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010!\u001a\u000204H\u0002¢\u0006\u0004\b@\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010CR\u0014\u0010E\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010DR\u0016\u0010H\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010CR\u0017\u0010P\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lformularism/impromptu;", "Ljava/io/Closeable;", "Lduvetyn/marial;", "sink", "", "client", "<init>", "(Lduvetyn/marial;Z)V", "", "saneness", "()V", "Lformularism/apical;", "peerSettings", "attabal", "(Lformularism/apical;)V", "", "streamId", "promisedStreamId", "", "Lformularism/attabal;", "requestHeaders", "rotuma", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "cuirassed", "(ILokhttp3/internal/http2/ErrorCode;)V", "monoploid", "()I", "outFinished", "Lduvetyn/wireman;", "source", "byteCount", "dern", "(ZILduvetyn/wireman;I)V", "flags", "buffer", "marial", "(IILduvetyn/wireman;I)V", "settings", "kattegat", "ack", "payload1", "payload2", "dovishness", "(ZII)V", "lastGoodStreamId", "", "debugData", "formularize", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "", "windowSizeIncrement", "restrictive", "(IJ)V", "length", "type", "cutely", "(IIII)V", "close", "headerBlock", "arytenoidectomy", "(ZILjava/util/List;)V", "merc", "kowloon", "Lduvetyn/marial;", "Z", "Lduvetyn/wireman;", "hpackBuffer", "polloi", "I", "maxFrameSize", "molybdenite", "closed", "Lformularism/saneness$saneness;", "graveside", "Lformularism/saneness$saneness;", "getHpackWriter", "()Lformularism/saneness$saneness;", "hpackWriter", "adultoid", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class impromptu implements Closeable {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final Logger f26362dovishness = Logger.getLogger(dern.class.getName());

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final saneness.C0610saneness hpackWriter;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final duvetyn.marial sink;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final duvetyn.wireman hpackBuffer;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int maxFrameSize;

    public impromptu(duvetyn.marial sink, boolean z) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.client = z;
        duvetyn.wireman wiremanVar = new duvetyn.wireman();
        this.hpackBuffer = wiremanVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new saneness.C0610saneness(0, false, wiremanVar, 3, null);
    }

    public final synchronized void arytenoidectomy(boolean outFinished, int streamId, List<attabal> headerBlock) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.competently(headerBlock);
        long size = this.hpackBuffer.getSize();
        long jMin = Math.min(this.maxFrameSize, size);
        int i = size == jMin ? 4 : 0;
        if (outFinished) {
            i |= 1;
        }
        cutely(streamId, (int) jMin, 1, i);
        this.sink.supplicat(this.hpackBuffer, jMin);
        if (size > jMin) {
            merc(streamId, size - jMin);
        }
    }

    public final synchronized void attabal(apical peerSettings) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.marial(this.maxFrameSize);
            if (peerSettings.saneness() != -1) {
                this.hpackWriter.marial(peerSettings.saneness());
            }
            cutely(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void cuirassed(int streamId, ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        cutely(streamId, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final void cutely(int streamId, int length, int type, int flags) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Logger logger = f26362dovishness;
        if (logger.isLoggable(Level.FINE)) {
            i = streamId;
            i2 = length;
            i3 = type;
            i4 = flags;
            logger.fine(dern.f26356attabal.dern(false, i, i2, i3, i4));
        } else {
            i = streamId;
            i2 = length;
            i3 = type;
            i4 = flags;
        }
        if (i2 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(Intrinsics.arytenoidectomy("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        hereditist.wireman.cultivated(this.sink, i2);
        this.sink.writeByte(i3 & 255);
        this.sink.writeByte(i4 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i);
    }

    public final synchronized void dern(boolean outFinished, int streamId, duvetyn.wireman source, int byteCount) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        marial(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final synchronized void dovishness(boolean ack, int payload1, int payload2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        cutely(0, 8, 6, ack ? 1 : 0);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final synchronized void formularize(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            cutely(0, debugData.length + 8, 7, 0);
            this.sink.writeInt(lastGoodStreamId);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.sink.write(debugData);
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void kattegat(apical settings) throws IOException {
        int i;
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i2 = 0;
            cutely(0, settings.taiyuan() * 6, 4, 0);
            while (i2 < 10) {
                int i3 = i2 + 1;
                if (settings.beachfront(i2)) {
                    if (i2 != 4) {
                        i = i2 != 7 ? i2 : 4;
                    } else {
                        i = 3;
                    }
                    this.sink.writeShort(i);
                    this.sink.writeInt(settings.attabal(i2));
                }
                i2 = i3;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void marial(int streamId, int flags, duvetyn.wireman buffer, int byteCount) throws IOException {
        cutely(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            duvetyn.marial marialVar = this.sink;
            Intrinsics.beachfront(buffer);
            marialVar.supplicat(buffer, byteCount);
        }
    }

    public final void merc(int streamId, long byteCount) throws IOException {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            cutely(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.supplicat(this.hpackBuffer, jMin);
        }
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void restrictive(int streamId, long windowSizeIncrement) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.arytenoidectomy("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(windowSizeIncrement)).toString());
        }
        cutely(streamId, 4, 8, 0);
        this.sink.writeInt((int) windowSizeIncrement);
        this.sink.flush();
    }

    public final synchronized void rotuma(int streamId, int promisedStreamId, List<attabal> requestHeaders) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.competently(requestHeaders);
        long size = this.hpackBuffer.getSize();
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
        long j = iMin;
        cutely(streamId, iMin + 4, 5, size == j ? 4 : 0);
        this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.sink.supplicat(this.hpackBuffer, j);
        if (size > j) {
            merc(streamId, size - j);
        }
    }

    public final synchronized void saneness() throws IOException {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger = f26362dovishness;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(hereditist.wireman.graveside(Intrinsics.arytenoidectomy(">> CONNECTION ", dern.CONNECTION_PREFACE.hex()), new Object[0]));
                }
                this.sink.sensatory(dern.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
