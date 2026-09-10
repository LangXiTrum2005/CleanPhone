package duvetyn;

import java.io.IOException;
import java.util.zip.Deflater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: duvetyn.competently, reason: from toString */
/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lduvetyn/competently;", "Lduvetyn/sealless;", "Lduvetyn/marial;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lduvetyn/marial;Ljava/util/zip/Deflater;)V", "Lduvetyn/wireman;", "source", "", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "saneness", "close", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", "toString", "()Ljava/lang/String;", "", "syncFlush", "attabal", "(Z)V", "kowloon", "Lduvetyn/marial;", "arytenoidectomy", "Ljava/util/zip/Deflater;", "monoploid", "Z", "closed", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeflaterSink implements sealless {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Deflater deflater;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final marial sink;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public DeflaterSink(marial sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    public final void attabal(boolean syncFlush) throws IOException {
        oilcan oilcanVarMilliradian;
        int iDeflate;
        wireman buffer = this.sink.getBuffer();
        while (true) {
            oilcanVarMilliradian = buffer.milliradian(1);
            if (syncFlush) {
                try {
                    Deflater deflater = this.deflater;
                    byte[] bArr = oilcanVarMilliradian.data;
                    int i = oilcanVarMilliradian.limit;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = oilcanVarMilliradian.data;
                int i2 = oilcanVarMilliradian.limit;
                iDeflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                oilcanVarMilliradian.limit += iDeflate;
                buffer.starveling(buffer.getSize() + ((long) iDeflate));
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (oilcanVarMilliradian.pos == oilcanVarMilliradian.limit) {
            buffer.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String = oilcanVarMilliradian.saneness();
            yemenite.saneness(oilcanVarMilliradian);
        }
    }

    @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
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
        attabal(true);
        this.sink.flush();
    }

    public final void saneness() throws IOException {
        this.deflater.finish();
        attabal(false);
    }

    @Override // duvetyn.sealless
    public void supplicat(wireman source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        attabal.saneness(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            oilcan oilcanVar = source.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String;
            Intrinsics.beachfront(oilcanVar);
            int iMin = (int) Math.min(byteCount, oilcanVar.limit - oilcanVar.pos);
            this.deflater.setInput(oilcanVar.data, oilcanVar.pos, iMin);
            attabal(false);
            long j = iMin;
            source.starveling(source.getSize() - j);
            int i = oilcanVar.pos + iMin;
            oilcanVar.pos = i;
            if (i == oilcanVar.limit) {
                source.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String = oilcanVar.saneness();
                yemenite.saneness(oilcanVar);
            }
            byteCount -= j;
        }
    }

    @Override // duvetyn.sealless
    /* JADX INFO: renamed from: timeout */
    public restrictive getF25464kowloon() {
        return this.sink.getF25464kowloon();
    }

    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }
}
