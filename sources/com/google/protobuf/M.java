package com.google.protobuf;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Comparator {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ByteString byteString = (ByteString) obj;
        ByteString byteString2 = (ByteString) obj2;
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
