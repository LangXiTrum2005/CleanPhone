package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2125k0 extends AbstractC2127l0 {
    private C2125k0() {
        super();
    }

    public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j) {
        return (Internal.ProtobufList) U0.getObject(obj, j);
    }

    @Override // com.google.protobuf.AbstractC2127l0
    public void makeImmutableListAt(Object obj, long j) {
        getProtobufList(obj, j).makeImmutable();
    }

    @Override // com.google.protobuf.AbstractC2127l0
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j);
        Internal.ProtobufList protobufList2 = getProtobufList(obj2, j);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        U0.putObject(obj, j, protobufList2);
    }

    @Override // com.google.protobuf.AbstractC2127l0
    public <L> List<L> mutableListAt(Object obj, long j) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        U0.putObject(obj, j, protobufListMutableCopyWithCapacity);
        return protobufListMutableCopyWithCapacity;
    }
}
