package com.thinkup.core.common.n0.m;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    private String o = "";
    private String m = "";

    private o0() {
    }

    private static o0 n() {
        return new o0();
    }

    public static o0 o(String str) {
        o0 o0Var = new o0();
        o0Var.o = str;
        return o0Var;
    }

    public final String m() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpReqEntity{urlType='");
        sb.append(this.o);
        sb.append("', interceptKey='");
        return a.r(sb, this.m, "'}");
    }

    private void m(String str) {
        this.m = str;
    }

    public static o0 o(String str, String str2) {
        o0 o0Var = new o0();
        o0Var.o = str;
        o0Var.m = str2;
        return o0Var;
    }

    public final String o() {
        return this.m;
    }
}
