package com.thinkup.core.common.on;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o00m {
    n0 m;
    int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    List<o0mm> f42225n;
    com.thinkup.core.oo.n0 o;
    List<o0mm> o0;
    List<o0mm> om;
    List<o0mm> on;
    List<o0mm> oo;

    public o00m(com.thinkup.core.oo.n0 n0Var, n0 n0Var2, int i2) {
        this.o = n0Var;
        this.m = n0Var2;
        this.m0 = i2;
    }

    public final int m() {
        return this.m0;
    }

    public final List<o0mm> m0() {
        return this.oo;
    }

    public final boolean mm() {
        List<o0mm> list = this.om;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<o0mm> list2 = this.on;
        return list2 != null && list2.size() > 0;
    }

    public final boolean mn() {
        List<o0mm> list = this.f42225n;
        if (list != null && list.size() > 0) {
            return false;
        }
        List<o0mm> list2 = this.oo;
        return list2 == null || list2.size() <= 0;
    }

    public final boolean mo() {
        List<o0mm> list = this.f42225n;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<o0mm> list2 = this.o0;
        if (list2 != null && list2.size() > 0) {
            return true;
        }
        List<o0mm> list3 = this.oo;
        if (list3 != null && list3.size() > 0) {
            return true;
        }
        List<o0mm> list4 = this.om;
        if (list4 != null && list4.size() > 0) {
            return true;
        }
        List<o0mm> list5 = this.on;
        return list5 != null && list5.size() > 0;
    }

    public final n0 n() {
        return this.m;
    }

    public final com.thinkup.core.oo.n0 o() {
        return this.o;
    }

    public final List<o0mm> o0() {
        return this.f42225n;
    }

    public final List<o0mm> om() {
        return this.om;
    }

    public final List<o0mm> on() {
        return this.on;
    }

    public final List<o0mm> oo() {
        return this.o0;
    }

    public final void m(List<o0mm> list) {
        this.o0 = list;
    }

    public final void n(List<o0mm> list) {
        this.om = list;
    }

    public final void o(List<o0mm> list) {
        this.f42225n = list;
    }

    public final void o0(List<o0mm> list) {
        this.on = list;
    }

    public final void oo(List<o0mm> list) {
        this.oo = list;
    }
}
