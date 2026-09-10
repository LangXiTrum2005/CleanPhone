package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends h {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24563f;

    public f(byte[] bArr, int i10, int i11) {
        super(bArr);
        i.h(i10, i10 + i11, bArr.length);
        this.f24562e = i10;
        this.f24563f = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h, com.google.crypto.tink.shaded.protobuf.i
    public final byte b(int i10) {
        int i11 = this.f24563f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f24565d[this.f24562e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(l1.d.e(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(defpackage.e.g(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h, com.google.crypto.tink.shaded.protobuf.i
    public final void n(int i10, byte[] bArr) {
        System.arraycopy(this.f24565d, this.f24562e, bArr, 0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h, com.google.crypto.tink.shaded.protobuf.i
    public final byte p(int i10) {
        return this.f24565d[this.f24562e + i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h
    public final int r() {
        return this.f24562e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h, com.google.crypto.tink.shaded.protobuf.i
    public final int size() {
        return this.f24563f;
    }

    public Object writeReplace() {
        return new h(q());
    }
}
