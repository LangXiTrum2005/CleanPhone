package ub;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f51953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f51954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f51955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f51956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f51957f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f51952a = i10;
        this.f51953b = gVar;
        this.f51954c = runnable;
        this.f51955d = j10;
        this.f51956e = j11;
        this.f51957f = timeUnit;
    }

    @Override // ub.h
    public final ScheduledFuture a(rb.c cVar) {
        switch (this.f51952a) {
            case 0:
                g gVar = this.f51953b;
                return gVar.f51966b.scheduleAtFixedRate(new e(gVar, this.f51954c, cVar, 0), this.f51955d, this.f51956e, this.f51957f);
            default:
                g gVar2 = this.f51953b;
                return gVar2.f51966b.scheduleWithFixedDelay(new e(gVar2, this.f51954c, cVar, 2), this.f51955d, this.f51956e, this.f51957f);
        }
    }
}
