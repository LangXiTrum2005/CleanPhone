package com.bytedance.sdk.component.tvp.qdl;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private static volatile qdl ud;
    private volatile ud qdl;

    private qdl() {
    }

    public static qdl qdl() {
        if (ud == null) {
            synchronized (qdl.class) {
                try {
                    if (ud == null) {
                        ud = new qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ud;
    }

    public ud ud() {
        return this.qdl;
    }

    public void qdl(ud udVar) {
        this.qdl = udVar;
    }
}
