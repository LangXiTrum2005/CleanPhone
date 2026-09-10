package com.thinkup.core.common.no.n;

/* JADX INFO: loaded from: classes6.dex */
final class o0n {
    static final int m = 1024;
    static final int o = 8192;
    o0n m0;
    o0n mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final byte[] f42090n;
    int o0;
    boolean om;
    boolean on;
    int oo;

    public o0n() {
        this.f42090n = new byte[8192];
        this.on = true;
        this.om = false;
    }

    public final o0n m() {
        return new o0n((byte[]) this.f42090n.clone(), this.o0, this.oo, false, true);
    }

    public final o0n n() {
        o0n o0nVar = this.m0;
        o0n o0nVar2 = o0nVar != this ? o0nVar : null;
        o0n o0nVar3 = this.mo;
        o0nVar3.m0 = o0nVar;
        this.m0.mo = o0nVar3;
        this.m0 = null;
        this.mo = null;
        return o0nVar2;
    }

    public final o0n o() {
        this.om = true;
        return new o0n(this.f42090n, this.o0, this.oo, true, false);
    }

    public final void o0() {
        o0n o0nVar = this.mo;
        if (o0nVar == this) {
            throw new IllegalStateException();
        }
        if (o0nVar.on) {
            int i2 = this.oo - this.o0;
            if (i2 > (8192 - o0nVar.oo) + (o0nVar.om ? 0 : o0nVar.o0)) {
                return;
            }
            o(o0nVar, i2);
            n();
            oo0.o(this);
        }
    }

    public final o0n o(o0n o0nVar) {
        o0nVar.mo = this;
        o0nVar.m0 = this.m0;
        this.m0.mo = o0nVar;
        this.m0 = o0nVar;
        return o0nVar;
    }

    public o0n(byte[] bArr, int i2, int i3, boolean z2, boolean z3) {
        this.f42090n = bArr;
        this.o0 = i2;
        this.oo = i3;
        this.om = z2;
        this.on = z3;
    }

    public final o0n o(int i2) {
        o0n o0nVarO;
        if (i2 > 0 && i2 <= this.oo - this.o0) {
            if (i2 >= 1024) {
                o0nVarO = o();
            } else {
                o0nVarO = oo0.o();
                System.arraycopy(this.f42090n, this.o0, o0nVarO.f42090n, 0, i2);
            }
            o0nVarO.oo = o0nVarO.o0 + i2;
            this.o0 += i2;
            this.mo.o(o0nVarO);
            return o0nVarO;
        }
        throw new IllegalArgumentException();
    }

    public final void o(o0n o0nVar, int i2) {
        if (o0nVar.on) {
            int i3 = o0nVar.oo;
            if (i3 + i2 > 8192) {
                if (!o0nVar.om) {
                    int i4 = o0nVar.o0;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = o0nVar.f42090n;
                        System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
                        o0nVar.oo -= o0nVar.o0;
                        o0nVar.o0 = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f42090n, this.o0, o0nVar.f42090n, o0nVar.oo, i2);
            o0nVar.oo += i2;
            this.o0 += i2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
