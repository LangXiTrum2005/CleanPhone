package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f4536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4538c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f4539d;

    public d0(e0 e0Var, g0 g0Var) {
        this.f4539d = e0Var;
        this.f4536a = g0Var;
    }

    public final void b(boolean z10) {
        if (z10 == this.f4537b) {
            return;
        }
        this.f4537b = z10;
        int i10 = z10 ? 1 : -1;
        e0 e0Var = this.f4539d;
        int i11 = e0Var.f4544c;
        e0Var.f4544c = i10 + i11;
        if (!e0Var.f4545d) {
            e0Var.f4545d = true;
            while (true) {
                try {
                    int i12 = e0Var.f4544c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z11 = i11 == 0 && i12 > 0;
                    boolean z12 = i11 > 0 && i12 == 0;
                    if (z11) {
                        e0Var.f();
                    } else if (z12) {
                        e0Var.g();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    e0Var.f4545d = false;
                    throw th2;
                }
            }
            e0Var.f4545d = false;
        }
        if (this.f4537b) {
            e0Var.c(this);
        }
    }

    public boolean e(v vVar) {
        return false;
    }

    public abstract boolean f();

    public void c() {
    }
}
