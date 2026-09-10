package je;

import ea.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f43821a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(ke.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.b(i14, i13);
                    bVar.b(i14, i15);
                    bVar.b(i13, i14);
                    bVar.b(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.b(i16, i16);
        int i17 = i16 + 1;
        bVar.b(i17, i16);
        bVar.b(i16, i17);
        int i18 = i10 + i11;
        bVar.b(i18, i16);
        bVar.b(i18, i17);
        bVar.b(i18, i18 - 1);
    }

    public static ke.a b(ke.a aVar, int i10, int i11) {
        le.a aVar2;
        int i12 = aVar.f44613b / i11;
        if (i11 == 4) {
            aVar2 = le.a.f45321j;
        } else if (i11 == 6) {
            aVar2 = le.a.f45320i;
        } else if (i11 == 8) {
            aVar2 = le.a.l;
        } else if (i11 == 10) {
            aVar2 = le.a.f45319h;
        } else {
            if (i11 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
            }
            aVar2 = le.a.f45318g;
        }
        f2 f2Var = new f2(aVar2);
        int i13 = i10 / i11;
        int[] iArr = new int[i13];
        int i14 = aVar.f44613b / i11;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                i16 |= aVar.d((i15 * i11) + i17) ? 1 << ((i11 - i17) - 1) : 0;
            }
            iArr[i15] = i16;
        }
        f2Var.i(i13 - i12, iArr);
        ke.a aVar3 = new ke.a();
        aVar3.b(0, i10 % i11);
        for (int i18 = 0; i18 < i13; i18++) {
            aVar3.b(iArr[i18], i11);
        }
        return aVar3;
    }

    public static ke.a c(ke.a aVar, int i10) {
        ke.a aVar2 = new ke.a();
        int i11 = aVar.f44613b;
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || aVar.d(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                aVar2.b(i17, i10);
            } else {
                if (i17 == 0) {
                    aVar2.b(i14 | 1, i10);
                } else {
                    aVar2.b(i14, i10);
                }
                i13 += i10;
            }
            i13--;
            i13 += i10;
        }
        return aVar2;
    }
}
