package com.thinkup.core.common.ooo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {
    private final com.thinkup.core.common.o0n.o m = com.thinkup.core.common.o0n.o0.o();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.o0n.m f42325n = new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.core.common.ooo.m.1
        @Override // java.lang.Runnable
        public final void run() {
            if (m.this.o) {
                return;
            }
            m.m(m.this);
            m.this.m();
        }
    };
    private boolean o;

    public static /* synthetic */ boolean m(m mVar) {
        mVar.o = true;
        return true;
    }

    private boolean n() {
        return this.o;
    }

    public abstract void m();

    public final synchronized void o(long j) {
        this.m.o(this.f42325n, j, false);
    }

    public final synchronized void o() {
        this.m.o(this.f42325n);
    }
}
