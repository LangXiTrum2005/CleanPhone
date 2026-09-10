package ea;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f39929b;

    public y2(z2 z2Var, int i10) {
        this.f39928a = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(z2Var);
                this.f39929b = z2Var;
                break;
            default:
                Objects.requireNonNull(z2Var);
                this.f39929b = z2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39928a) {
            case 0:
                z2 z2Var = this.f39929b;
                z2Var.f39951e = z2Var.f39956j;
                break;
            default:
                this.f39929b.f39956j = null;
                break;
        }
    }
}
