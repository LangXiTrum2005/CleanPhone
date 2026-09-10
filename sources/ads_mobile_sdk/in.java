package ads_mobile_sdk;

import java.util.Arrays;
import saneness.autoboat;
import saneness.polder;

/* JADX INFO: loaded from: classes.dex */
public final class in extends hn {
    public final byte[] d;

    public in(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // ads_mobile_sdk.kn
    public final void a(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.d, i, bArr, i2, i3);
    }

    @Override // ads_mobile_sdk.kn
    public final boolean b(kn knVar) {
        if (knVar instanceof in) {
            return Arrays.equals(this.d, ((in) knVar).d);
        }
        return knVar instanceof en ? a(knVar, 0, this.d.length) : knVar.b(this);
    }

    public final hr e() {
        byte[] bArr = this.d;
        int length = bArr.length;
        autoboat autoboatVar = new autoboat(bArr, 0, length, true);
        try {
            autoboatVar.d(length);
            return autoboatVar;
        } catch (x81 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // ads_mobile_sdk.kn
    public final int size() {
        return this.d.length;
    }

    @Override // ads_mobile_sdk.hn
    public final boolean a(kn knVar, int i, int i2) {
        if (i2 > knVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i2 + this.d.length);
        }
        int i3 = i + i2;
        if (i3 <= knVar.size()) {
            if (knVar instanceof in) {
                return kn.a(this.d, 0, ((in) knVar).d, i, i2);
            }
            if (!(knVar instanceof en)) {
                return knVar.b(i, i3).equals(b(0, i2));
            }
            en enVar = (en) knVar;
            return kn.a(this.d, 0, enVar.d, enVar.e + i, i2);
        }
        throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + knVar.size());
    }

    @Override // ads_mobile_sdk.kn
    public final byte b(int i) {
        return this.d[i];
    }

    @Override // ads_mobile_sdk.kn
    public final int b(int i, int i2, int i3) {
        byte[] bArr = this.d;
        byte[] bArr2 = r21.a;
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // ads_mobile_sdk.kn
    public final kn b(int i, int i2) {
        int iA = kn.a(i, i2, this.d.length);
        if (iA == 0) {
            return kn.b;
        }
        return new en(this.d, i, iA);
    }

    @Override // ads_mobile_sdk.kn
    public final kn a(int i, int i2) {
        int iA = kn.a(i, i2, this.d.length);
        if (iA == 0) {
            return kn.b;
        }
        return new en(this.d, i, iA);
    }

    @Override // ads_mobile_sdk.kn
    public final void a(polder polderVar) {
        byte[] bArr = this.d;
        polderVar.a(bArr, 0, bArr.length);
    }
}
