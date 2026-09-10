package zb;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f54732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f54733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54734c;

    public /* synthetic */ p(r rVar, long j10, String str) {
        this.f54732a = rVar;
        this.f54733b = j10;
        this.f54734c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r rVar = this.f54732a;
        return rVar.f54750p.f3463b.a(new cj.l(rVar, this.f54733b, this.f54734c, 6));
    }
}
