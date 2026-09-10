package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4080f;

    public g(byte[] bArr, int i10, int i11) {
        super(bArr);
        j.h(i10, i10 + i11, bArr.length);
        this.f4079e = i10;
        this.f4080f = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.i, androidx.datastore.preferences.protobuf.j
    public final byte b(int i10) {
        int i11 = this.f4080f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f4101d[this.f4079e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(l1.d.e(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(defpackage.e.g(i10, i11, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.i, androidx.datastore.preferences.protobuf.j
    public final void n(int i10, byte[] bArr) {
        System.arraycopy(this.f4101d, this.f4079e, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.i, androidx.datastore.preferences.protobuf.j
    public final byte p(int i10) {
        return this.f4101d[this.f4079e + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int q() {
        return this.f4079e;
    }

    @Override // androidx.datastore.preferences.protobuf.i, androidx.datastore.preferences.protobuf.j
    public final int size() {
        return this.f4080f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = e0.f4068b;
        } else {
            byte[] bArr2 = new byte[size];
            n(size, bArr2);
            bArr = bArr2;
        }
        return new i(bArr);
    }
}
