package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z3 extends v3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39958c;

    public z3(e4 e4Var) {
        super(e4Var);
        this.f39807b.f39387r++;
    }

    public final void H0() {
        if (!this.f39958c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void I0() {
        if (this.f39958c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        J0();
        this.f39807b.f39388s++;
        this.f39958c = true;
    }

    public abstract void J0();
}
