package com.thinkup.core.oo;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class on {
    private static final String o = "on";
    private long m = System.currentTimeMillis();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42473n = 86400000;
    private List<com.thinkup.core.common.m0.m> o0 = new ArrayList();
    private int oo = 1;
    private long om = 28800000;

    private on() {
    }

    private boolean m() {
        return System.currentTimeMillis() >= this.m + this.f42473n;
    }

    private long n() {
        return this.m;
    }

    private List<com.thinkup.core.common.m0.m> o() {
        return this.o0;
    }

    private int o0() {
        return this.oo;
    }

    private long oo() {
        return this.om;
    }

    private void o(long j) {
        this.m = j;
    }
}
