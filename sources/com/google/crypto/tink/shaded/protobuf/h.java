package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends g {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f24565d;

    public h(byte[] bArr) {
        this.f24571a = 0;
        bArr.getClass();
        this.f24565d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public byte b(int i10) {
        return this.f24565d[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || size() != ((i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h)) {
            return obj.equals(this);
        }
        h hVar = (h) obj;
        int i10 = this.f24571a;
        int i11 = hVar.f24571a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder sbU = defpackage.e.u(size, "Ran off end of other: 0, ", ", ");
            sbU.append(hVar.size());
            throw new IllegalArgumentException(sbU.toString());
        }
        byte[] bArr = hVar.f24565d;
        int iR = r() + size;
        int iR2 = r();
        int iR3 = hVar.r();
        while (iR2 < iR) {
            if (this.f24565d[iR2] != bArr[iR3]) {
                return false;
            }
            iR2++;
            iR3++;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public void n(int i10, byte[] bArr) {
        System.arraycopy(this.f24565d, 0, bArr, 0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public byte p(int i10) {
        return this.f24565d[i10];
    }

    public int r() {
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public int size() {
        return this.f24565d.length;
    }
}
