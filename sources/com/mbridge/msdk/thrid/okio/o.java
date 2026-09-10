package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import com.applovin.shadow.okio.Segment;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f36811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f36812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f36813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f36814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f36815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    o f36816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o f36817g;

    public o() {
        this.f36811a = new byte[Segment.SIZE];
        this.f36815e = true;
        this.f36814d = false;
    }

    public final o a(o oVar) {
        oVar.f36817g = this;
        oVar.f36816f = this.f36816f;
        this.f36816f.f36817g = oVar;
        this.f36816f = oVar;
        return oVar;
    }

    @Nullable
    public final o b() {
        o oVar = this.f36816f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f36817g;
        oVar3.f36816f = oVar;
        this.f36816f.f36817g = oVar3;
        this.f36816f = null;
        this.f36817g = null;
        return oVar2;
    }

    public final o c() {
        this.f36814d = true;
        return new o(this.f36811a, this.f36812b, this.f36813c, true, false);
    }

    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f36811a = bArr;
        this.f36812b = i10;
        this.f36813c = i11;
        this.f36814d = z10;
        this.f36815e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f36813c - this.f36812b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f36811a, this.f36812b, oVarA.f36811a, 0, i10);
            }
            oVarA.f36813c = oVarA.f36812b + i10;
            this.f36812b += i10;
            this.f36817g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f36817g;
        if (oVar != this) {
            if (oVar.f36815e) {
                int i10 = this.f36813c - this.f36812b;
                if (i10 > (8192 - oVar.f36813c) + (oVar.f36814d ? 0 : oVar.f36812b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f36815e) {
            int i11 = oVar.f36813c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f36814d) {
                    int i13 = oVar.f36812b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f36811a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f36813c -= oVar.f36812b;
                        oVar.f36812b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f36811a, this.f36812b, oVar.f36811a, oVar.f36813c, i10);
            oVar.f36813c += i10;
            this.f36812b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
