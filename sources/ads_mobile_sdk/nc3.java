package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.Optional;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class nc3 {
    public final ArrayDeque a;

    public nc3() {
        int[] iArr = {114723506, 151129280, 1368781114, 134385090, 816173334, -1981646764, 34563124, 1737518944, 282828202};
        int i = iArr[7] % iArr[8];
        this.a = new ArrayDeque();
    }

    public final void a(long j, long j2, long j3) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        kc3 kc3Var = new kc3(j, j2, j3);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() >= iAttabal) {
            throw new lc3();
        }
        arrayDeque.push(kc3Var);
    }

    public final kc3 a() {
        return (kc3) Optional.ofNullable((kc3) this.a.peek()).orElseThrow(jc3.b);
    }
}
