package saneness;

import ads_mobile_sdk.dc3;

/* JADX INFO: loaded from: classes.dex */
public final class jaunt implements girt {
    @Override // saneness.girt
    public final byte a(dc3 dc3Var, int i) {
        return dc3Var.a(i);
    }

    @Override // saneness.girt
    public final dc3 a(dc3 dc3Var, int i, int i2) {
        byte[] bArr;
        if (i >= 0 && i <= i2) {
            byte[] bArr2 = dc3Var.a;
            if (i2 <= bArr2.length) {
                if (i > i2 || i2 > bArr2.length) {
                    throw new IndexOutOfBoundsException();
                }
                int i3 = i2 - i;
                if (i3 == 0) {
                    bArr = new byte[0];
                } else {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, i, bArr3, 0, i3);
                    bArr = bArr3;
                }
                return new dc3(bArr);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // saneness.girt
    public final girt a() {
        return new jaunt();
    }
}
