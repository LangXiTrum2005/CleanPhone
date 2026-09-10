package com.bytedance.sdk.component.wd.lnr;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private qdl qdl;
    private ud ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.wd.lnr.lnr$lnr, reason: collision with other inner class name */
    public static class C0096lnr {
        private static final lnr qdl = new lnr();
    }

    public enum qdl {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public interface ud {
    }

    public static void qdl(qdl qdlVar) {
        synchronized (lnr.class) {
            C0096lnr.qdl.qdl = qdlVar;
        }
    }

    private lnr() {
        this.qdl = qdl.OFF;
        this.ud = new com.bytedance.sdk.component.wd.lnr.ud();
    }
}
