package com.bytedance.sdk.component.jpc.lnr;

/* JADX INFO: loaded from: classes.dex */
public abstract class ud implements Comparable<ud>, Runnable {
    private Runnable lnr;
    private long mml;
    private long mo;
    private long mzz;
    private int qdl;
    private String ud;

    public ud(String str) {
        this.qdl = 5;
        this.ud = str;
    }

    public long lnr() {
        return this.mml;
    }

    public long mml() {
        return this.mzz;
    }

    public Runnable mo() {
        return this.lnr;
    }

    public long mzz() {
        return this.mo;
    }

    public void qdl(int i2) {
        this.qdl = i2;
    }

    public String ud() {
        return this.ud;
    }

    public void lnr(long j) {
        this.mo = j;
    }

    public int qdl() {
        return this.qdl;
    }

    public void ud(long j) {
        this.mzz = j;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(ud udVar) {
        if (qdl() < udVar.qdl()) {
            return 1;
        }
        return qdl() >= udVar.qdl() ? -1 : 0;
    }

    public ud(int i2, String str) {
        this.qdl = i2;
        this.ud = str;
    }

    public void qdl(long j) {
        this.mml = j;
    }

    public ud(String str, Runnable runnable) {
        this.qdl = 5;
        this.ud = str;
        this.lnr = runnable;
    }
}
