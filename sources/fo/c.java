package fo;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lo.n f41215c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41219g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41213a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41214b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f41216d = new b[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41217e = 7;

    public c(q qVar) {
        this.f41215c = new lo.n(qVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f41216d.length;
            while (true) {
                length--;
                i11 = this.f41217e;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                b bVar = this.f41216d[length];
                kotlin.jvm.internal.n.c(bVar);
                int i13 = bVar.f41212c;
                i10 -= i13;
                this.f41219g -= i13;
                this.f41218f--;
                i12++;
            }
            b[] bVarArr = this.f41216d;
            System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f41218f);
            this.f41217e += i12;
        }
        return i12;
    }

    public final lo.h b(int i10) throws IOException {
        if (i10 >= 0) {
            b[] bVarArr = e.f41228a;
            if (i10 <= bVarArr.length - 1) {
                return bVarArr[i10].f41210a;
            }
        }
        int length = this.f41217e + 1 + (i10 - e.f41228a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f41216d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                kotlin.jvm.internal.n.c(bVar);
                return bVar.f41210a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(b bVar) {
        this.f41214b.add(bVar);
        int i10 = bVar.f41212c;
        int i11 = this.f41213a;
        if (i10 > i11) {
            b[] bVarArr = this.f41216d;
            xj.k.k0(bVarArr, null, 0, bVarArr.length);
            this.f41217e = this.f41216d.length - 1;
            this.f41218f = 0;
            this.f41219g = 0;
            return;
        }
        a((this.f41219g + i10) - i11);
        int i12 = this.f41218f + 1;
        b[] bVarArr2 = this.f41216d;
        if (i12 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f41217e = this.f41216d.length - 1;
            this.f41216d = bVarArr3;
        }
        int i13 = this.f41217e;
        this.f41217e = i13 - 1;
        this.f41216d[i13] = bVar;
        this.f41218f++;
        this.f41219g += i10;
    }

    public final lo.h d() {
        lo.n source = this.f41215c;
        byte b10 = source.readByte();
        byte[] bArr = yn.a.f54560a;
        int i10 = b10 & 255;
        int i11 = 0;
        boolean z10 = (b10 & 128) == 128;
        long jE = e(i10, 127);
        if (!z10) {
            return source.readByteString(jE);
        }
        lo.e eVar = new lo.e();
        int[] iArr = x.f41326a;
        kotlin.jvm.internal.n.f(source, "source");
        a7.b bVar = x.f41328c;
        a7.b bVar2 = bVar;
        int i12 = 0;
        for (long j10 = 0; j10 < jE; j10++) {
            byte b11 = source.readByte();
            byte[] bArr2 = yn.a.f54560a;
            i11 = (i11 << 8) | (b11 & 255);
            i12 += 8;
            while (i12 >= 8) {
                a7.b[] bVarArr = (a7.b[]) bVar2.f3417d;
                kotlin.jvm.internal.n.c(bVarArr);
                bVar2 = bVarArr[(i11 >>> (i12 - 8)) & 255];
                kotlin.jvm.internal.n.c(bVar2);
                if (((a7.b[]) bVar2.f3417d) == null) {
                    eVar.q(bVar2.f3415b);
                    i12 -= bVar2.f3416c;
                    bVar2 = bVar;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            a7.b[] bVarArr2 = (a7.b[]) bVar2.f3417d;
            kotlin.jvm.internal.n.c(bVarArr2);
            a7.b bVar3 = bVarArr2[(i11 << (8 - i12)) & 255];
            kotlin.jvm.internal.n.c(bVar3);
            int i13 = bVar3.f3416c;
            if (((a7.b[]) bVar3.f3417d) != null || i13 > i12) {
                break;
            }
            eVar.q(bVar3.f3415b);
            i12 -= i13;
            bVar2 = bVar;
        }
        return eVar.readByteString(eVar.f45637b);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b10 = this.f41215c.readByte();
            byte[] bArr = yn.a.f54560a;
            int i14 = b10 & 255;
            if ((b10 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b10 & 127) << i13;
            i13 += 7;
        }
    }
}
