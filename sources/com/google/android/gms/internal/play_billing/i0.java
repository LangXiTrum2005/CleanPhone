package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a.a {
    @Override // a.a
    public final f0 I(u0 u0Var) {
        f0 f0Var;
        f0 f0Var2 = f0.f24264d;
        synchronized (u0Var) {
            try {
                f0Var = u0Var.f24402b;
                if (f0Var != f0Var2) {
                    u0Var.f24402b = f0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f0Var;
    }

    @Override // a.a
    public final k0 J(u0 u0Var) {
        k0 k0Var;
        k0 k0Var2 = k0.f24392c;
        synchronized (u0Var) {
            try {
                k0Var = u0Var.f24403c;
                if (k0Var != k0Var2) {
                    u0Var.f24403c = k0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k0Var;
    }

    @Override // a.a
    public final void K(k0 k0Var, k0 k0Var2) {
        k0Var.f24394b = k0Var2;
    }

    @Override // a.a
    public final void L(k0 k0Var, Thread thread) {
        k0Var.f24393a = thread;
    }

    @Override // a.a
    public final boolean M(u0 u0Var, f0 f0Var, f0 f0Var2) {
        synchronized (u0Var) {
            try {
                if (u0Var.f24402b != f0Var) {
                    return false;
                }
                u0Var.f24402b = f0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    public final boolean N(l0 l0Var, Object obj, Object obj2) {
        synchronized (l0Var) {
            try {
                if (l0Var.f24401a != obj) {
                    return false;
                }
                l0Var.f24401a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    public final boolean O(l0 l0Var, k0 k0Var, k0 k0Var2) {
        synchronized (l0Var) {
            try {
                if (l0Var.f24403c != k0Var) {
                    return false;
                }
                l0Var.f24403c = k0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
