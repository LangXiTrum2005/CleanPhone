package duvetyn;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00188G¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lduvetyn/triweekly;", "Lduvetyn/sealless;", "sink", "<init>", "(Lduvetyn/sealless;)V", "Lduvetyn/wireman;", "source", "", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "close", "saneness", "buffer", "attabal", "Lduvetyn/stratoscope;", "kowloon", "Lduvetyn/stratoscope;", "Ljava/util/zip/Deflater;", "arytenoidectomy", "Ljava/util/zip/Deflater;", "deflater", "()Ljava/util/zip/Deflater;", "Lduvetyn/competently;", "monoploid", "Lduvetyn/competently;", "deflaterSink", "", "polloi", "Z", "closed", "Ljava/util/zip/CRC32;", "molybdenite", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class triweekly implements sealless {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Deflater deflater;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final buffer sink;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final CRC32 crc;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final DeflaterSink deflaterSink;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public triweekly(sealless sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        buffer bufferVar = new buffer(sink);
        this.sink = bufferVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink(bufferVar, deflater);
        this.crc = new CRC32();
        wireman wiremanVar = bufferVar.bufferField;
        wiremanVar.writeShort(8075);
        wiremanVar.writeByte(8);
        wiremanVar.writeByte(0);
        wiremanVar.writeInt(0);
        wiremanVar.writeByte(0);
        wiremanVar.writeByte(0);
    }

    public final void attabal(wireman buffer, long byteCount) {
        oilcan oilcanVar = buffer.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String;
        Intrinsics.beachfront(oilcanVar);
        while (byteCount > 0) {
            int iMin = (int) Math.min(byteCount, oilcanVar.limit - oilcanVar.pos);
            this.crc.update(oilcanVar.data, oilcanVar.pos, iMin);
            byteCount -= (long) iMin;
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
        }
    }

    @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.deflaterSink.saneness();
        saneness();
        th = null;
        try {
            this.deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
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

    @Override // duvetyn.sealless, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    public final void saneness() {
        this.sink.attabal((int) this.crc.getValue());
        this.sink.attabal((int) this.deflater.getBytesRead());
    }

    @Override // duvetyn.sealless
    public void supplicat(wireman source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return;
        }
        attabal(source, byteCount);
        this.deflaterSink.supplicat(source, byteCount);
    }

    @Override // duvetyn.sealless
    /* JADX INFO: renamed from: timeout */
    public restrictive getF25464kowloon() {
        return this.sink.getF25464kowloon();
    }
}
