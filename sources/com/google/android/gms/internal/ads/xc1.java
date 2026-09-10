package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xc1 extends vc1 {
    @Override // com.google.android.gms.internal.ads.vc1
    public final void d(cd1 cd1Var, Thread thread) {
        cd1Var.f13139a = thread;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final void g(cd1 cd1Var, cd1 cd1Var2) {
        cd1Var.f13140b = cd1Var2;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean i(dd1 dd1Var, cd1 cd1Var, cd1 cd1Var2) {
        synchronized (dd1Var) {
            try {
                if (dd1Var.f13505c != cd1Var) {
                    return false;
                }
                dd1Var.f13505c = cd1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean k(uc1 uc1Var, rc1 rc1Var, rc1 rc1Var2) {
        synchronized (uc1Var) {
            try {
                if (uc1Var.f13504b != rc1Var) {
                    return false;
                }
                uc1Var.f13504b = rc1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final cd1 l(uc1 uc1Var) {
        cd1 cd1Var;
        cd1 cd1Var2 = cd1.f13138c;
        synchronized (uc1Var) {
            try {
                cd1Var = uc1Var.f13505c;
                if (cd1Var != cd1Var2) {
                    uc1Var.f13505c = cd1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cd1Var;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final rc1 n(uc1 uc1Var) {
        rc1 rc1Var;
        rc1 rc1Var2 = rc1.f19557d;
        synchronized (uc1Var) {
            try {
                rc1Var = uc1Var.f13504b;
                if (rc1Var != rc1Var2) {
                    uc1Var.f13504b = rc1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rc1Var;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean o(dd1 dd1Var, Object obj, Object obj2) {
        synchronized (dd1Var) {
            try {
                if (dd1Var.f13503a != obj) {
                    return false;
                }
                dd1Var.f13503a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
