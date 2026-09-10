package n5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f46555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46556b;

    public r(s sVar, String str) {
        this.f46555a = sVar;
        this.f46556b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f46555a.f46561d) {
            try {
                if (((r) this.f46555a.f46559b.remove(this.f46556b)) != null) {
                    q qVar = (q) this.f46555a.f46560c.remove(this.f46556b);
                    if (qVar != null) {
                        String str = this.f46556b;
                        d5.o.g().e(g5.e.f41527j, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((g5.e) qVar).d();
                    }
                } else {
                    d5.o.g().e("WrkTimerRunnable", "Timer with " + this.f46556b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
