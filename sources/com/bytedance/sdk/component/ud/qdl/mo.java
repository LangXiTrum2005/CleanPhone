package com.bytedance.sdk.component.ud.qdl;

/* JADX INFO: loaded from: classes.dex */
public final class mo {
    private final String[] qdl;

    public mo(String[] strArr) {
        this.qdl = strArr;
    }

    public int qdl() {
        return this.qdl.length / 2;
    }

    public String ud(int i2) {
        return this.qdl[(i2 * 2) + 1];
    }

    public String qdl(int i2) {
        return this.qdl[i2 * 2];
    }
}
