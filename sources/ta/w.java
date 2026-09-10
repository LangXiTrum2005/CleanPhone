package ta;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends r9.b {
    @Override // r9.b
    public final void c(b0 b0Var, Set set) {
        synchronized (b0Var) {
            try {
                if (b0Var.f50670h == null) {
                    b0Var.f50670h = set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r9.b
    public final int g(b0 b0Var) {
        int i10;
        synchronized (b0Var) {
            i10 = b0Var.f50671i - 1;
            b0Var.f50671i = i10;
        }
        return i10;
    }
}
