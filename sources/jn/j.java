package jn;

import cn.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f44024c;

    public j(long j10, Runnable runnable, boolean z10) {
        super(j10, z10);
        this.f44024c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44024c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f44024c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(d0.q(runnable));
        sb2.append(", ");
        sb2.append(this.f44022a);
        sb2.append(", ");
        return wi.d.k(sb2, this.f44023b ? "Blocking" : "Non-blocking", ']');
    }
}
