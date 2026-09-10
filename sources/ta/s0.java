package ta;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends k implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f50651h;

    public s0(Runnable runnable) {
        runnable.getClass();
        this.f50651h = runnable;
    }

    @Override // ta.r
    public final String j() {
        return "task=[" + this.f50651h + X3.j.f27836e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f50651h.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
