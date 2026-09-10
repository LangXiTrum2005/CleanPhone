package cn;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f6751a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f6751a = scheduledFuture;
    }

    @Override // cn.p0
    public final void dispose() {
        this.f6751a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f6751a + ']';
    }
}
