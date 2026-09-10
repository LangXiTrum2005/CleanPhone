package com.thinkup.core.common.on;

/* JADX INFO: loaded from: classes6.dex */
public final class on {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42246n;
    private String o;

    public on(String str, String str2, int i2) {
        this.o = str;
        this.m = str2;
        this.f42246n = i2;
    }

    private String m() {
        return this.o;
    }

    private int n() {
        return this.f42246n;
    }

    public final String o() {
        return this.m;
    }

    public final boolean o(o0mm o0mmVar) {
        if (o0mmVar != null) {
            int i2 = o0mmVar.o;
            if (i2 != 2) {
                return i2 == 3 && o0mmVar.nm() == this.f42246n;
            }
            return o0mmVar.m0o().equals(this.o);
        }
        return false;
    }
}
