package com.thinkup.core.common.no.m.o.oo;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class no {
    static final int m = 1;
    static final int m0 = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f42055n = 2;
    static final int o = 65535;
    static final int o0 = 4;
    static final int om = 6;
    static final int on = 7;
    static final int oo = 5;
    private final int[] mm = new int[10];
    private int mo;

    public final int m(int i2) {
        return this.mm[i2];
    }

    public final int n() {
        if ((this.mo & 2) != 0) {
            return this.mm[1];
        }
        return -1;
    }

    public final void o() {
        this.mo = 0;
        Arrays.fill(this.mm, 0);
    }

    public final int o0() {
        if ((this.mo & 16) != 0) {
            return this.mm[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int oo() {
        if ((this.mo & 128) != 0) {
            return this.mm[7];
        }
        return 65535;
    }

    private int o0(int i2) {
        return (this.mo & 64) != 0 ? this.mm[6] : i2;
    }

    public final int m() {
        return Integer.bitCount(this.mo);
    }

    public final int n(int i2) {
        return (this.mo & 32) != 0 ? this.mm[5] : i2;
    }

    public final no o(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.mm;
            if (i2 < iArr.length) {
                this.mo = (1 << i2) | this.mo;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public final boolean o(int i2) {
        return ((1 << i2) & this.mo) != 0;
    }

    private boolean o(boolean z2) {
        int i2;
        if ((this.mo & 4) != 0) {
            i2 = this.mm[2];
        } else {
            i2 = z2 ? 1 : 0;
        }
        return i2 == 1;
    }

    public final void o(no noVar) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (noVar.o(i2)) {
                o(i2, noVar.mm[i2]);
            }
        }
    }
}
