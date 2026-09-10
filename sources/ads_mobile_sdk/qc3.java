package ads_mobile_sdk;

import java.util.ArrayList;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class qc3 {
    public final ArrayList a;
    public int b;

    public qc3() {
        int[] iArr = {1516266761, 1142957872, 446044582, 1147282962, 861635011, -1643766350, 500618996, 1941690360, 410409117};
        int i = iArr[7] % iArr[8];
        this.a = new ArrayList();
        this.b = 0;
    }

    public final int a(long j) throws oc3 {
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i2 = iArr[1];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | iArr[2], (i & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = j >= 0 ? ((long) (this.b + iAttabal)) - j : (((((((~j2) & j3) | j4) + ((j2 & j5) | jArr[4])) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8])) + (-j);
        if (j6 < 0 || j6 >= this.b) {
            throw new oc3();
        }
        return (int) j6;
    }

    public final void a(zc3 zc3Var) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i5 = this.b;
        if (i5 >= iAttabal) {
            throw new pc3();
        }
        ArrayList arrayList = this.a;
        if (i5 == arrayList.size()) {
            arrayList.add(zc3Var);
        } else {
            arrayList.set(this.b, zc3Var);
        }
        this.b++;
    }

    public final zc3 a() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i5 = this.b;
        if (i5 <= 0) {
            throw new oc3();
        }
        ArrayList arrayList = this.a;
        zc3 zc3Var = (zc3) arrayList.get(i5 + iAttabal);
        arrayList.set(this.b + iAttabal, null);
        this.b += iAttabal;
        return zc3Var;
    }
}
