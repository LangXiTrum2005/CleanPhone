package b2;

import android.os.Handler;
import java.io.Closeable;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f5333a = l1.y.q(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f5336d;

    public n(q qVar, long j10) {
        this.f5336d = qVar;
        this.f5334b = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5335c = false;
        this.f5333a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f5336d;
        p pVar = qVar.f5376g;
        pVar.o(pVar.k(4, qVar.f5380k, s1.f47307g, qVar.f5377h));
        this.f5333a.postDelayed(this, this.f5334b);
    }
}
