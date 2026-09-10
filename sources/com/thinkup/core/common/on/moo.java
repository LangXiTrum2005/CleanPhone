package com.thinkup.core.common.on;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class moo {
    private Map<String, List<o>> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Integer> f42207n;
    private final String o;

    public static class o {
        private final int m;
        private final String o;

        public o(String str, int i2) {
            this.o = str;
            this.m = i2;
        }

        public final int m() {
            return this.m;
        }

        public final String o() {
            return this.o;
        }
    }

    public moo(String str) {
        this.o = str;
    }

    private String n() {
        return this.o;
    }

    public final Map<String, Integer> m() {
        return this.f42207n;
    }

    public final Map<String, List<o>> o() {
        return this.m;
    }

    public final void m(Map<String, Integer> map) {
        this.f42207n = map;
    }

    public final void o(Map<String, List<o>> map) {
        this.m = map;
    }
}
