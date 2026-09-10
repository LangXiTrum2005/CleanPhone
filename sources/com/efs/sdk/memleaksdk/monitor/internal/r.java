package com.efs.sdk.memleaksdk.monitor.internal;

/* JADX INFO: loaded from: classes2.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f693a;
    int b;
    int c;
    boolean d;
    boolean e;
    r f;
    r g;

    public r() {
        this.f693a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public r a() {
        this.d = true;
        return new r(this.f693a, this.b, this.c, true, false);
    }

    public r b() {
        r rVar = this.f;
        r rVar2 = rVar != this ? rVar : null;
        r rVar3 = this.g;
        rVar3.f = rVar;
        this.f.g = rVar3;
        this.f = null;
        this.g = null;
        return rVar2;
    }

    public void c() {
        r rVar = this.g;
        if (rVar == this) {
            throw new IllegalStateException();
        }
        if (rVar.e) {
            int i = this.c - this.b;
            if (i > (8192 - rVar.c) + (rVar.d ? 0 : rVar.b)) {
                return;
            }
            a(rVar, i);
            b();
            s.a(this);
        }
    }

    public r a(r rVar) {
        rVar.g = this;
        rVar.f = this.f;
        this.f.g = rVar;
        this.f = rVar;
        return rVar;
    }

    public r(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f693a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public r a(int i) {
        r rVarA;
        if (i > 0 && i <= this.c - this.b) {
            if (i >= 1024) {
                rVarA = a();
            } else {
                rVarA = s.a();
                System.arraycopy(this.f693a, this.b, rVarA.f693a, 0, i);
            }
            rVarA.c = rVarA.b + i;
            this.b += i;
            this.g.a(rVarA);
            return rVarA;
        }
        throw new IllegalArgumentException();
    }

    public void a(r rVar, int i) {
        if (rVar.e) {
            int i2 = rVar.c;
            if (i2 + i > 8192) {
                if (!rVar.d) {
                    int i3 = rVar.b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = rVar.f693a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        rVar.c -= rVar.b;
                        rVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f693a, this.b, rVar.f693a, rVar.c, i);
            rVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
