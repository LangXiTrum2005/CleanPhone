package com.thinkup.core.common.n0.o0;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    private static oo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f41973n = new Object();
    private final String o = getClass().getSimpleName();
    private volatile com.thinkup.core.common.n0.o0.o.n o0;
    private volatile com.thinkup.core.common.n0.o0.o.n oo;

    private oo() {
    }

    public static oo o() {
        if (m == null) {
            synchronized (oo.class) {
                try {
                    if (m == null) {
                        m = new oo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final void o(o0 o0Var, o0.o oVar) {
        com.thinkup.core.common.n0.o0.o.n nVar;
        int iN = o0Var.n();
        synchronized (f41973n) {
            try {
                if (iN == 6) {
                    if (this.oo == null) {
                        this.oo = new com.thinkup.core.common.n0.o0.o.m();
                    }
                    nVar = this.oo;
                } else {
                    if (this.o0 == null) {
                        this.o0 = new com.thinkup.core.common.n0.o0.o.o();
                    }
                    nVar = this.o0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nVar != null) {
            nVar.m(o0Var, oVar);
        } else if (oVar != null) {
            oVar.o((Throwable) new Exception("socketUploadData is null."));
        }
    }
}
