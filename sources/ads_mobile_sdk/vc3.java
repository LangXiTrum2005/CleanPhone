package ads_mobile_sdk;

import com.google.common.collect.coi;
import java.util.Comparator;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class vc3 implements Comparator {
    public final boolean a;

    public vc3(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int iAttabal = sanitaria.attabal((i3 & (~i2)) | iArr[2], (i2 & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        zc3 zc3Var = (zc3) obj;
        zc3 zc3Var2 = (zc3) obj2;
        int i4 = zc3Var.g;
        if (i4 != zc3Var2.g) {
            throw new IllegalArgumentException();
        }
        int i5 = iAttabal + i4;
        try {
            if (i4 == 0) {
                throw null;
            }
            switch (i5) {
                case 0:
                    return 0;
                case 1:
                    if (this.a) {
                        return zc3Var.b() != zc3Var2.b() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zc3Var.c(), zc3Var2.c());
                case 3:
                    dc3 dc3VarD = zc3Var.d();
                    dc3 dc3VarD2 = zc3Var2.d();
                    int i6 = 0;
                    while (true) {
                        bArr = dc3VarD.a;
                        if (i < bArr.length && i6 < dc3VarD2.a.length) {
                            int iCompare = Integer.compare(dc3.a(dc3VarD.a(i)), dc3.a(dc3VarD2.a(i6)));
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            i++;
                            i6++;
                        }
                    }
                    return Integer.compare(bArr.length, dc3VarD2.a.length);
                case 4:
                    return coi.attabal(this).compare(zc3Var.e(), zc3Var2.e());
                case 5:
                    if (!this.a) {
                        throw new IllegalArgumentException();
                    }
                    if (zc3Var.f() == zc3Var2.f()) {
                        return 0;
                    }
                case 6:
                    return Double.compare(zc3Var.g(), zc3Var2.g());
                default:
                    return 0;
            }
        } catch (wc3 e) {
            throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e);
        }
    }
}
