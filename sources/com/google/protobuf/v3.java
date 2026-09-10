package com.google.protobuf;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u3 f24969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f24970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w3 f24975g;

    public v3(w3 w3Var) {
        this.f24975g = w3Var;
        u3 u3Var = new u3(w3Var);
        this.f24969a = u3Var;
        s sVarA = u3Var.a();
        this.f24970b = sVarA;
        this.f24971c = sVarA.size();
        this.f24972d = 0;
        this.f24973e = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f24975g.f24993a - (this.f24973e + this.f24972d);
    }

    public final void d() {
        if (this.f24970b != null) {
            int i10 = this.f24972d;
            int i11 = this.f24971c;
            if (i10 == i11) {
                this.f24973e += i11;
                this.f24972d = 0;
                if (!this.f24969a.hasNext()) {
                    this.f24970b = null;
                    this.f24971c = 0;
                } else {
                    s sVarA = this.f24969a.a();
                    this.f24970b = sVarA;
                    this.f24971c = sVarA.size();
                }
            }
        }
    }

    public final int h(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            d();
            if (this.f24970b == null) {
                break;
            }
            int iMin = Math.min(this.f24971c - this.f24972d, i12);
            if (bArr != null) {
                this.f24970b.copyTo(bArr, this.f24972d, i10, iMin);
                i10 += iMin;
            }
            this.f24972d += iMin;
            i12 -= iMin;
        }
        return i11 - i12;
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f24974f = this.f24973e + this.f24972d;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        int iH = h(bArr, i10, i11);
        if (iH == 0) {
            if (i11 > 0) {
                return -1;
            }
            if (this.f24975g.f24993a - (this.f24973e + this.f24972d) == 0) {
                return -1;
            }
        }
        return iH;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        u3 u3Var = new u3(this.f24975g);
        this.f24969a = u3Var;
        s sVarA = u3Var.a();
        this.f24970b = sVarA;
        this.f24971c = sVarA.size();
        this.f24972d = 0;
        this.f24973e = 0;
        h(null, 0, this.f24974f);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j10 > 2147483647L) {
            j10 = 2147483647L;
        }
        return h(null, 0, (int) j10);
    }

    @Override // java.io.InputStream
    public final int read() {
        d();
        s sVar = this.f24970b;
        if (sVar == null) {
            return -1;
        }
        int i10 = this.f24972d;
        this.f24972d = i10 + 1;
        return sVar.byteAt(i10) & 255;
    }
}
