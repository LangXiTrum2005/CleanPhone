package cn;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f6741a;

    public m0(w wVar) {
        this.f6741a = wVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws j0 {
        w wVar = this.f6741a;
        ak.l lVar = ak.l.f3620a;
        if (hn.b.j(wVar, lVar)) {
            hn.b.i(wVar, lVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f6741a.toString();
    }
}
