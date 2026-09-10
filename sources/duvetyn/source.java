package duvetyn;

import java.io.IOException;
import java.io.InputStream;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: duvetyn.monoploid, reason: from toString */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lduvetyn/monoploid;", "Lduvetyn/supplicat;", "Ljava/io/InputStream;", "input", "Lduvetyn/restrictive;", "timeout", "<init>", "(Ljava/io/InputStream;Lduvetyn/restrictive;)V", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "close", "()V", "()Lduvetyn/restrictive;", "", "toString", "()Ljava/lang/String;", "kowloon", "Ljava/io/InputStream;", "arytenoidectomy", "Lduvetyn/restrictive;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class source implements supplicat {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final restrictive timeout;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final InputStream input;

    public source(InputStream input, restrictive timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // duvetyn.supplicat
    public long read(wireman sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.beachfront();
            oilcan oilcanVarMilliradian = sink.milliradian(1);
            int i = this.input.read(oilcanVarMilliradian.data, oilcanVarMilliradian.limit, (int) Math.min(byteCount, 8192 - oilcanVarMilliradian.limit));
            if (i != -1) {
                oilcanVarMilliradian.limit += i;
                long j = i;
                sink.starveling(sink.getSize() + j);
                return j;
            }
            if (oilcanVarMilliradian.pos != oilcanVarMilliradian.limit) {
                return -1L;
            }
            sink.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String = oilcanVarMilliradian.saneness();
            yemenite.saneness(oilcanVarMilliradian);
            return -1L;
        } catch (AssertionError e) {
            if (adultoid.marial(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // duvetyn.supplicat
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public restrictive getF25466kowloon() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
