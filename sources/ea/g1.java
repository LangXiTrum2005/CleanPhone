package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f39420b;

    public g1(j1 j1Var, String str) {
        this.f39420b = j1Var;
        this.f39419a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        s0 s0Var = ((m1) this.f39420b.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39753f.c(th2, this.f39419a);
    }
}
