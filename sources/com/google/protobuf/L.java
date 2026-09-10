package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24890a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteString f24892c;

    public l(ByteString byteString) {
        this.f24892c = byteString;
        this.f24891b = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24890a < this.f24891b;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        int i10 = this.f24890a;
        if (i10 >= this.f24891b) {
            throw new NoSuchElementException();
        }
        this.f24890a = i10 + 1;
        return this.f24892c.internalByteAt(i10);
    }
}
