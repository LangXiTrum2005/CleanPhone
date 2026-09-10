package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends cc.a2 {
    @Override // cc.a2
    public final void Q(h4 h4Var, h4 h4Var2) {
        h4Var.f24283b = h4Var2;
    }

    @Override // cc.a2
    public final void R(h4 h4Var, Thread thread) {
        h4Var.f24282a = thread;
    }

    @Override // cc.a2
    public final boolean S(i4 i4Var, u2 u2Var, u2 u2Var2) {
        synchronized (i4Var) {
            try {
                if (i4Var.f24295b != u2Var) {
                    return false;
                }
                i4Var.f24295b = u2Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cc.a2
    public final boolean T(i4 i4Var, Object obj, Object obj2) {
        synchronized (i4Var) {
            try {
                if (i4Var.f24294a != obj) {
                    return false;
                }
                i4Var.f24294a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cc.a2
    public final boolean U(i4 i4Var, h4 h4Var, h4 h4Var2) {
        synchronized (i4Var) {
            try {
                if (i4Var.f24296c != h4Var) {
                    return false;
                }
                i4Var.f24296c = h4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
