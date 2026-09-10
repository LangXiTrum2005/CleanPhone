package com.thinkup.core.common.inner.m;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    protected String m;
    protected String o;

    public o(String str, String str2) {
        this.o = str;
        this.m = str2;
    }

    private String n() {
        StringBuilder sb = new StringBuilder("code[ ");
        sb.append(this.o);
        sb.append(" ],desc[ ");
        return a.r(sb, this.m, " ]");
    }

    public final String m() {
        return this.m;
    }

    public final String o() {
        return this.o;
    }
}
