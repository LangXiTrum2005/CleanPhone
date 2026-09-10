package com.google.protobuf;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2122j implements Comparator {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
    @Override // java.util.Comparator
    public int compare(ByteString byteString, ByteString byteString2) {
        ?? Iterator2 = byteString.iterator2();
        ?? Iterator3 = byteString2.iterator2();
        while (Iterator2.hasNext() && Iterator3.hasNext()) {
            int iCompareTo = Integer.valueOf(ByteString.toInt(Iterator2.nextByte())).compareTo(Integer.valueOf(ByteString.toInt(Iterator3.nextByte())));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
    }
}
