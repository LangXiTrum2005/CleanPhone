package com.thinkup.core.common.on;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m0n {
    private long m = 1800000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<String> f42193n;
    private int o;
    private Map<String, List<String>> o0;

    private int o0() {
        return this.o;
    }

    public final long m() {
        return this.m;
    }

    public final Map<String, List<String>> n() {
        return this.o0;
    }

    public final void o(int i2) {
        this.o = i2;
    }

    public final void o(long j) {
        this.m = j;
    }

    public final void o(List<String> list) {
        this.f42193n = list;
    }

    public final List<String> o() {
        return this.f42193n;
    }

    public final void o(Map<String, List<String>> map) {
        this.o0 = map;
    }
}
