package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3 f24952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteString.ByteIterator f24953b = a();

    public t3(w3 w3Var) {
        this.f24952a = new u3(w3Var);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator a() {
        u3 u3Var = this.f24952a;
        if (u3Var.hasNext()) {
            return u3Var.a().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24953b != null;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        ByteString.ByteIterator byteIterator = this.f24953b;
        if (byteIterator == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = byteIterator.nextByte();
        if (!this.f24953b.hasNext()) {
            this.f24953b = a();
        }
        return bNextByte;
    }
}
