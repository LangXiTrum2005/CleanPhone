package zl;

import com.google.protobuf.a4;
import com.google.protobuf.u3;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f55081h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f55083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f55084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55087g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f55081h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f55081h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public w(d dVar, d dVar2) {
        this.f55083c = dVar;
        this.f55084d = dVar2;
        int size = dVar.size();
        this.f55085e = size;
        this.f55082b = dVar2.size() + size;
        this.f55086f = Math.max(dVar.p(), dVar2.p()) + 1;
    }

    public final boolean equals(Object obj) {
        int iV;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            int size = dVar.size();
            int i10 = this.f55082b;
            if (i10 == size) {
                if (i10 == 0) {
                    return true;
                }
                if (this.f55087g == 0 || (iV = dVar.v()) == 0 || this.f55087g == iV) {
                    u3 u3Var = new u3(this);
                    t tVarB = u3Var.b();
                    u3 u3Var2 = new u3(dVar);
                    t tVarB2 = u3Var2.b();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int length = tVarB.f55079b.length - i11;
                        int length2 = tVarB2.f55079b.length - i12;
                        int iMin = Math.min(length, length2);
                        if (!(i11 == 0 ? tVarB.z(tVarB2, i12, iMin) : tVarB2.z(tVarB, i11, iMin))) {
                            break;
                        }
                        i13 += iMin;
                        if (i13 >= i10) {
                            if (i13 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            tVarB = u3Var.b();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                        if (iMin == length2) {
                            tVarB2 = u3Var2.b();
                            i12 = 0;
                        } else {
                            i12 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iT = this.f55087g;
        if (iT == 0) {
            int i10 = this.f55082b;
            iT = t(i10, 0, i10);
            if (iT == 0) {
                iT = 1;
            }
            this.f55087g = iT;
        }
        return iT;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a4(this);
    }

    @Override // zl.d
    public final void n(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        d dVar = this.f55083c;
        int i14 = this.f55085e;
        if (i13 <= i14) {
            dVar.n(bArr, i10, i11, i12);
            return;
        }
        d dVar2 = this.f55084d;
        if (i10 >= i14) {
            dVar2.n(bArr, i10 - i14, i11, i12);
            return;
        }
        int i15 = i14 - i10;
        dVar.n(bArr, i10, i11, i15);
        dVar2.n(bArr, 0, i11 + i15, i12 - i15);
    }

    @Override // zl.d
    public final int p() {
        return this.f55086f;
    }

    @Override // zl.d
    public final boolean q() {
        return this.f55082b >= f55081h[this.f55086f];
    }

    @Override // zl.d
    public final boolean r() {
        int iU = this.f55083c.u(0, 0, this.f55085e);
        d dVar = this.f55084d;
        return dVar.u(iU, 0, dVar.size()) == 0;
    }

    @Override // zl.d
    public final int size() {
        return this.f55082b;
    }

    @Override // zl.d
    public final int t(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        d dVar = this.f55083c;
        int i14 = this.f55085e;
        if (i13 <= i14) {
            return dVar.t(i10, i11, i12);
        }
        d dVar2 = this.f55084d;
        if (i11 >= i14) {
            return dVar2.t(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return dVar2.t(dVar.t(i10, i11, i15), 0, i12 - i15);
    }

    @Override // zl.d
    public final int u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        d dVar = this.f55083c;
        int i14 = this.f55085e;
        if (i13 <= i14) {
            return dVar.u(i10, i11, i12);
        }
        d dVar2 = this.f55084d;
        if (i11 >= i14) {
            return dVar2.u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return dVar2.u(dVar.u(i10, i11, i15), 0, i12 - i15);
    }

    @Override // zl.d
    public final int v() {
        return this.f55087g;
    }

    @Override // zl.d
    public final String w() {
        byte[] bArr;
        int i10 = this.f55082b;
        if (i10 == 0) {
            bArr = p.f55075a;
        } else {
            byte[] bArr2 = new byte[i10];
            n(bArr2, 0, 0, i10);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // zl.d
    public final void y(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        d dVar = this.f55083c;
        int i13 = this.f55085e;
        if (i12 <= i13) {
            dVar.y(outputStream, i10, i11);
            return;
        }
        d dVar2 = this.f55084d;
        if (i10 >= i13) {
            dVar2.y(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        dVar.y(outputStream, i10, i14);
        dVar2.y(outputStream, 0, i11 - i14);
    }
}
