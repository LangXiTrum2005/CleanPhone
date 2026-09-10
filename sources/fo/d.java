package fo;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo.e f41220a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41222c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41227h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41221b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41223d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f41224e = new b[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41225f = 7;

    public d(lo.e eVar) {
        this.f41220a = eVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f41224e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f41225f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                b bVar = this.f41224e[length];
                kotlin.jvm.internal.n.c(bVar);
                i10 -= bVar.f41212c;
                int i13 = this.f41227h;
                b bVar2 = this.f41224e[length];
                kotlin.jvm.internal.n.c(bVar2);
                this.f41227h = i13 - bVar2.f41212c;
                this.f41226g--;
                i12++;
                length--;
            }
            b[] bVarArr = this.f41224e;
            int i14 = i11 + 1;
            System.arraycopy(bVarArr, i14, bVarArr, i14 + i12, this.f41226g);
            b[] bVarArr2 = this.f41224e;
            int i15 = this.f41225f + 1;
            Arrays.fill(bVarArr2, i15, i15 + i12, (Object) null);
            this.f41225f += i12;
        }
    }

    public final void b(b bVar) {
        int i10 = bVar.f41212c;
        int i11 = this.f41223d;
        if (i10 > i11) {
            b[] bVarArr = this.f41224e;
            xj.k.k0(bVarArr, null, 0, bVarArr.length);
            this.f41225f = this.f41224e.length - 1;
            this.f41226g = 0;
            this.f41227h = 0;
            return;
        }
        a((this.f41227h + i10) - i11);
        int i12 = this.f41226g + 1;
        b[] bVarArr2 = this.f41224e;
        if (i12 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f41225f = this.f41224e.length - 1;
            this.f41224e = bVarArr3;
        }
        int i13 = this.f41225f;
        this.f41225f = i13 - 1;
        this.f41224e[i13] = bVar;
        this.f41226g++;
        this.f41227h += i10;
    }

    public final void c(lo.h data) throws EOFException {
        kotlin.jvm.internal.n.f(data, "data");
        int[] iArr = x.f41326a;
        int iD = data.d();
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = data.i(i10);
            byte[] bArr = yn.a.f54560a;
            j11 += (long) x.f41327b[bI & 255];
        }
        int i11 = (int) ((j11 + ((long) 7)) >> 3);
        int iD2 = data.d();
        lo.e eVar = this.f41220a;
        if (i11 >= iD2) {
            e(data.d(), 127, 0);
            eVar.o(data);
            return;
        }
        lo.e eVar2 = new lo.e();
        int[] iArr2 = x.f41326a;
        int iD3 = data.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD3; i13++) {
            byte bI2 = data.i(i13);
            byte[] bArr2 = yn.a.f54560a;
            int i14 = bI2 & 255;
            int i15 = x.f41326a[i14];
            byte b10 = x.f41327b[i14];
            j10 = (j10 << b10) | ((long) i15);
            i12 += b10;
            while (i12 >= 8) {
                i12 -= 8;
                eVar2.q((int) (j10 >> i12));
            }
        }
        if (i12 > 0) {
            eVar2.q((int) ((j10 << (8 - i12)) | (255 >>> i12)));
        }
        lo.h byteString = eVar2.readByteString(eVar2.f45637b);
        e(byteString.d(), 127, 128);
        eVar.o(byteString);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f41222c) {
            int i10 = this.f41221b;
            if (i10 < this.f41223d) {
                e(i10, 31, 32);
            }
            this.f41222c = false;
            this.f41221b = Integer.MAX_VALUE;
            e(this.f41223d, 31, 32);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            lo.h hVarL = bVar.f41210a.l();
            lo.h hVar = bVar.f41211b;
            Integer num = (Integer) e.f41229b.get(hVarL);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    b[] bVarArr = e.f41228a;
                    if (kotlin.jvm.internal.n.a(bVarArr[iIntValue].f41211b, hVar)) {
                        length = length2;
                    } else if (kotlin.jvm.internal.n.a(bVarArr[length2].f41211b, hVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f41224e.length;
                for (int i12 = this.f41225f + 1; i12 < length3; i12++) {
                    b bVar2 = this.f41224e[i12];
                    kotlin.jvm.internal.n.c(bVar2);
                    if (kotlin.jvm.internal.n.a(bVar2.f41210a, hVarL)) {
                        b bVar3 = this.f41224e[i12];
                        kotlin.jvm.internal.n.c(bVar3);
                        if (kotlin.jvm.internal.n.a(bVar3.f41211b, hVar)) {
                            length2 = e.f41228a.length + (i12 - this.f41225f);
                            break;
                        } else if (length == -1) {
                            length = (i12 - this.f41225f) + e.f41228a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.f41220a.q(64);
                c(hVarL);
                c(hVar);
                b(bVar);
            } else {
                lo.h prefix = b.f41204d;
                hVarL.getClass();
                kotlin.jvm.internal.n.f(prefix, "prefix");
                if (!hVarL.k(prefix, prefix.d()) || kotlin.jvm.internal.n.a(b.f41209i, hVarL)) {
                    e(length, 63, 64);
                    c(hVar);
                    b(bVar);
                } else {
                    e(length, 15, 0);
                    c(hVar);
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        lo.e eVar = this.f41220a;
        if (i10 < i11) {
            eVar.q(i10 | i12);
            return;
        }
        eVar.q(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            eVar.q(128 | (i13 & 127));
            i13 >>>= 7;
        }
        eVar.q(i13);
    }
}
