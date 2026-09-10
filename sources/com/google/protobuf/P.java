package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends t {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24913c;

    public p(byte[] bArr, int i10, int i11) {
        super(bArr);
        ByteString.checkRange(i10, i10 + i11, bArr.length);
        this.f24912b = i10;
        this.f24913c = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.t, com.google.protobuf.ByteString
    public final byte byteAt(int i10) {
        ByteString.checkIndex(i10, this.f24913c);
        return this.f24949a[this.f24912b + i10];
    }

    @Override // com.google.protobuf.t, com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f24949a, this.f24912b + i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.t
    public final int h() {
        return this.f24912b;
    }

    @Override // com.google.protobuf.t, com.google.protobuf.s, com.google.protobuf.ByteString
    public final byte internalByteAt(int i10) {
        return this.f24949a[this.f24912b + i10];
    }

    @Override // com.google.protobuf.t, com.google.protobuf.ByteString
    public final int size() {
        return this.f24913c;
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }
}
