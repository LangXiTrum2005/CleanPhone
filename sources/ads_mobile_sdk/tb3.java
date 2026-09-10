package ads_mobile_sdk;

import saneness.girt;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class tb3 implements girt {
    public int a = sanitaria.attabal(((~1539942439) & 2070175971) | 1100945533, (1539942439 & (-1166483302)) | (-2145608135), 164110942, 67728125) ^ (1143565421 % 981914693);
    public final byte[] b = new byte[8];
    public final vb3 c;

    public tb3(vb3 vb3Var) {
        this.c = vb3Var;
    }

    @Override // saneness.girt
    public final byte a(dc3 dc3Var, int i) {
        int iAttabal = i >>> (sanitaria.attabal(((~143154913) & 992498304) | 439467622, (143154913 & 1627930754) | 1212551295, -122082883, 1967905751) ^ (2033018190 % 70061690));
        if (iAttabal != this.a) {
            this.c.a(iAttabal, this.b);
            this.a = iAttabal;
        }
        return (byte) (((dc3Var.a(i) ^ this.b[i % 8]) << 24) >> 24);
    }

    @Override // saneness.girt
    public final dc3 a(dc3 dc3Var, int i, int i2) {
        byte[] bArr;
        if (i < 0 || i > i2 || i2 > dc3Var.a.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (i < i2) {
            bArr2[i4] = a(dc3Var, i);
            i++;
            i4++;
        }
        if (i3 == 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[i3];
            System.arraycopy(bArr2, 0, bArr, 0, i3);
        }
        return new dc3(bArr);
    }

    @Override // saneness.girt
    public final /* bridge */ /* synthetic */ girt a() {
        return new tb3(this.c);
    }
}
