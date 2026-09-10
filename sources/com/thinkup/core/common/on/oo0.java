package com.thinkup.core.common.on;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class oo0 {
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42250n;
    private final String o;
    private Map<String, String> o0;
    private boolean oo;

    public oo0(String str, String str2) {
        this.o = str;
        this.m = str2;
    }

    public final String m() {
        return this.m;
    }

    public final String n() {
        return this.f42250n;
    }

    public final String o() {
        return this.o;
    }

    public final Map<String, String> o0() {
        return this.o0;
    }

    public final void om() {
        this.oo = true;
    }

    public final boolean oo() {
        return this.oo;
    }

    public final void o(String str) {
        this.f42250n = str;
    }

    public final void o(Map<String, String> map) {
        this.o0 = map;
    }
}
