package duvetyn;

import java.io.IOException;
import java.io.OutputStream;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: duvetyn.preprohormone, reason: from toString */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lduvetyn/preprohormone;", "Lduvetyn/sealless;", "Ljava/io/OutputStream;", "out", "Lduvetyn/restrictive;", "timeout", "<init>", "(Ljava/io/OutputStream;Lduvetyn/restrictive;)V", "Lduvetyn/wireman;", "source", "", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "close", "()Lduvetyn/restrictive;", "", "toString", "()Ljava/lang/String;", "kowloon", "Ljava/io/OutputStream;", "arytenoidectomy", "Lduvetyn/restrictive;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class sink implements sealless {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final restrictive timeout;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final OutputStream out;

    public sink(OutputStream out, restrictive timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // duvetyn.sealless, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // duvetyn.sealless
    public void supplicat(wireman source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        attabal.saneness(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.beachfront();
            oilcan oilcanVar = source.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String;
            Intrinsics.beachfront(oilcanVar);
            int iMin = (int) Math.min(byteCount, oilcanVar.limit - oilcanVar.pos);
            this.out.write(oilcanVar.data, oilcanVar.pos, iMin);
            oilcanVar.pos += iMin;
            long j = iMin;
            byteCount -= j;
            source.starveling(source.getSize() - j);
            if (oilcanVar.pos == oilcanVar.limit) {
                source.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String = oilcanVar.saneness();
                yemenite.saneness(oilcanVar);
            }
        }
    }

    @Override // duvetyn.sealless
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public restrictive getF25464kowloon() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }
}
