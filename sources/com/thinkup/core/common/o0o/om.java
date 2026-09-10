package com.thinkup.core.common.o0o;

/* JADX INFO: loaded from: classes6.dex */
public final class om implements Runnable {
    private final m0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f42168n;
    private final int o = 16;

    public om(m0 m0Var, o oVar) {
        this.m = m0Var;
        this.f42168n = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f42168n;
        if (oVar != null) {
            oVar.o(this.o, this.m);
        }
    }
}
