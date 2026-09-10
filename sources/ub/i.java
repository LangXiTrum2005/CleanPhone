package ub;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends z.h implements ScheduledFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f51967h;

    public i(h hVar) {
        this.f51967h = hVar.a(new rb.c(this, 10));
    }

    @Override // z.h
    public final void b() {
        ScheduledFuture scheduledFuture = this.f51967h;
        Object obj = this.f54587a;
        scheduledFuture.cancel((obj instanceof z.a) && ((z.a) obj).f54568a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f51967h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f51967h.getDelay(timeUnit);
    }
}
