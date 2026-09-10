package ads_mobile_sdk;

import saneness.polder;

/* JADX INFO: loaded from: classes.dex */
public final class en extends hn {
    public final byte[] d;
    public final int e;
    public final int f;

    public en(byte[] bArr, int i, int i2) {
        kn.a(i, i + i2, bArr.length);
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // ads_mobile_sdk.kn
    public final void a(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.d, this.e + i, bArr, i2, i3);
    }

    @Override // ads_mobile_sdk.kn
    public final boolean b(kn knVar) {
        return ((knVar instanceof in) || (knVar instanceof en)) ? a(knVar, 0, this.f) : knVar.b(this);
    }

    @Override // ads_mobile_sdk.kn
    public final int size() {
        return this.f;
    }

    @Override // ads_mobile_sdk.hn
    public final boolean a(kn knVar, int i, int i2) {
        if (i2 > knVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i2 + this.f);
        }
        int i3 = i + i2;
        if (i3 <= knVar.size()) {
            if (knVar instanceof in) {
                return kn.a(this.d, this.e, ((in) knVar).d, i, i2);
            }
            if (knVar instanceof en) {
                en enVar = (en) knVar;
                return kn.a(this.d, this.e, enVar.d, enVar.e + i, i2);
            }
            kn knVarB = knVar.b(i, i3);
            int i4 = this.e;
            return knVarB.equals(b(i4, i2 + i4));
        }
        throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + knVar.size());
    }

    @Override // ads_mobile_sdk.kn
    public final byte b(int i) {
        return this.d[this.e + i];
    }

    @Override // ads_mobile_sdk.kn
    public final int b(int i, int i2, int i3) {
        byte[] bArr = this.d;
        int i4 = this.e + i2;
        byte[] bArr2 = r21.a;
        for (int i5 = i4; i5 < i4 + i3; i5++) {
            i = (i * 31) + bArr[i5];
        }
        return i;
    }

    @Override // ads_mobile_sdk.kn
    public final kn b(int i, int i2) {
        int iA = kn.a(i, i2, this.f);
        if (iA == 0) {
            return kn.b;
        }
        return new en(this.d, this.e + i, iA);
    }

    @Override // ads_mobile_sdk.kn
    public final kn a(int i, int i2) {
        int iA = kn.a(i, i2, this.f);
        if (iA == 0) {
            return kn.b;
        }
        return new en(this.d, this.e + i, iA);
    }

    @Override // ads_mobile_sdk.kn
    public final void a(polder polderVar) {
        polderVar.a(this.d, this.e, this.f);
    }
}
