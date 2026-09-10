package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t1 extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39766b;

    public t1(m1 m1Var) {
        super(m1Var);
        ((m1) this.f3623a).A++;
    }

    public abstract boolean H0();

    public final void I0() {
        if (!this.f39766b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void J0() {
        if (this.f39766b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (H0()) {
            return;
        }
        ((m1) this.f3623a).C.incrementAndGet();
        this.f39766b = true;
    }
}
