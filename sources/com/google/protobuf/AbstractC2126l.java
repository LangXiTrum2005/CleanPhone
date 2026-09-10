package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2126l extends ByteString {
    public abstract boolean equalsRange(ByteString byteString, int i, int i2);

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return super.iterator2();
    }

    @Override // com.google.protobuf.ByteString
    public void writeToReverse(ByteOutput byteOutput) throws IOException {
        writeTo(byteOutput);
    }
}
