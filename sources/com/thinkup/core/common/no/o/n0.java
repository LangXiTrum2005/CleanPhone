package com.thinkup.core.common.no.o;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 {
    public static final int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42101n = 1;
    public static final int o = 60;
    public static final int o0 = 28;
    public static final int om = 16;
    public static final int oo = 5;
    public final int m0;
    public final long mm;
    public final int mn;
    public final int mo;
    public final String n0;
    public final String on;

    public static class o {
        public static final int m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f42102n = 2;
        public static final int o = 0;
        public static final int o0 = 3;
        public static final int om = 5;
        public static final int oo = 4;
    }

    public n0(String str, int i2, int i3, long j, int i4, String str2) {
        this.on = str;
        this.m0 = i2;
        this.mo = i3 <= 0 ? i3 == -1 ? -1 : 60 : i3;
        this.mm = j;
        this.mn = i4;
        this.n0 = str2;
    }

    private boolean n() {
        return this.m0 == 5;
    }

    private boolean o0() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int i2 = this.mo;
        return i2 != -1 && this.mm + ((long) i2) <= jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n0)) {
            n0 n0Var = (n0) obj;
            if (this.on.equals(n0Var.on) && this.m0 == n0Var.m0 && this.mo == n0Var.mo && this.mm == n0Var.mm) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        return this.m0 == 28;
    }

    public final boolean o() {
        return this.m0 == 1;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{type:%s, value:%s, source:%s, server:%s, timestamp:%d, ttl:%d}", Integer.valueOf(this.m0), this.on, Integer.valueOf(this.mn), this.n0, Long.valueOf(this.mm), Integer.valueOf(this.mo));
    }

    private boolean o(long j) {
        int i2 = this.mo;
        return i2 != -1 && this.mm + ((long) i2) <= j;
    }
}
