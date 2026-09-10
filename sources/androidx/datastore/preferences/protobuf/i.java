package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i extends h {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4101d;

    public i(byte[] bArr) {
        this.f4106a = 0;
        bArr.getClass();
        this.f4101d = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public byte b(int i10) {
        return this.f4101d[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j) || size() != ((j) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof i)) {
            return obj.equals(this);
        }
        i iVar = (i) obj;
        int i10 = this.f4106a;
        int i11 = iVar.f4106a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > iVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > iVar.size()) {
            StringBuilder sbU = defpackage.e.u(size, "Ran off end of other: 0, ", ", ");
            sbU.append(iVar.size());
            throw new IllegalArgumentException(sbU.toString());
        }
        byte[] bArr = iVar.f4101d;
        int iQ = q() + size;
        int iQ2 = q();
        int iQ3 = iVar.q();
        while (iQ2 < iQ) {
            if (this.f4101d[iQ2] != bArr[iQ3]) {
                return false;
            }
            iQ2++;
            iQ3++;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public void n(int i10, byte[] bArr) {
        System.arraycopy(this.f4101d, 0, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public byte p(int i10) {
        return this.f4101d[i10];
    }

    public int q() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public int size() {
        return this.f4101d.length;
    }
}
