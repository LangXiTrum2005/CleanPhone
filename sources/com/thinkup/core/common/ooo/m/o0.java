package com.thinkup.core.common.ooo.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 implements Runnable {
    public static final int o0 = 1;
    public static final int om = 3;
    public static final int oo = 2;
    protected oo m0;
    protected boolean on = true;
    protected int mo = 1;
    private long o = 0;
    private String m = "thinkup_default_thread";

    private String n() {
        return this.m;
    }

    public final long m() {
        return this.o;
    }

    public abstract void o();

    public final void o(long j) {
        this.o = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.m);
        o();
    }

    private void o(oo ooVar) {
        this.m0 = ooVar;
    }

    public final void o(String str) {
        this.m = str;
    }
}
