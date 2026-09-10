package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2120i extends AbstractC2124k {
    private final int limit;
    private int position = 0;
    final /* synthetic */ ByteString this$0;

    public C2120i(ByteString byteString) {
        this.this$0 = byteString;
        this.limit = byteString.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.this$0.internalByteAt(i);
    }
}
