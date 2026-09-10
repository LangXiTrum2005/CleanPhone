package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fd implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14362a;

    public fd(boolean z10) {
        this.f14362a = z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7 A[RETURN] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i10 = 0;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int iG = com.applovin.impl.ca.g((i12 & (~i11)) | i13, (i11 & i14) | i15, i16, i17);
        int i19 = i18 % 496612959;
        id idVar = (id) obj;
        id idVar2 = (id) obj2;
        int i20 = idVar.f15715g;
        if (i20 != idVar2.f15715g) {
            throw new IllegalArgumentException();
        }
        int i21 = i19 ^ iG;
        try {
            if (i20 == 0) {
                throw null;
            }
            int i22 = i20 + i21;
            boolean z10 = this.f14362a;
            switch (i22) {
                case 1:
                    if (!z10) {
                        throw new IllegalArgumentException();
                    }
                    if (idVar.l() != idVar2.l()) {
                        return 1;
                    }
                    return 0;
                case 2:
                    return Long.compare(idVar.m(), idVar2.m());
                case 3:
                    qc qcVarN = idVar.n();
                    qc qcVarN2 = idVar2.n();
                    int i23 = 0;
                    while (true) {
                        length = qcVarN.f19023a.length;
                        if (i10 < length && i23 < qcVarN2.f19023a.length) {
                            int iCompare = Integer.compare(qc.f(qcVarN.b(i10)), qc.f(qcVarN2.b(i23)));
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            i10++;
                            i23++;
                        }
                    }
                    return Integer.compare(length, qcVarN2.f19023a.length);
                case 4:
                    List listO = idVar.o();
                    List listO2 = idVar2.o();
                    Iterator it = listO.iterator();
                    Iterator it2 = listO2.iterator();
                    while (it.hasNext()) {
                        if (!it2.hasNext()) {
                            return 1;
                        }
                        int iCompare2 = compare(it.next(), it2.next());
                        if (iCompare2 != 0) {
                            return iCompare2;
                        }
                    }
                    if (it2.hasNext()) {
                        return -1;
                    }
                    return 0;
                case 5:
                    if (!z10) {
                        throw new IllegalArgumentException();
                    }
                    if (idVar.p() != idVar2.p()) {
                        return 1;
                    }
                    return 0;
                case 6:
                    return Double.compare(idVar.q(), idVar2.q());
                default:
                    return 0;
            }
        } catch (gd e10) {
            throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e10);
        }
    }
}
