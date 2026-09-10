package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o2 extends p2 {
    @Override // com.google.protobuf.p2
    public final void a(long j10, Object obj) {
        ((Internal.ProtobufList) x4.f25021c.m(j10, obj)).makeImmutable();
    }

    @Override // com.google.protobuf.p2
    public final void b(Object obj, long j10, Object obj2) {
        w4 w4Var = x4.f25021c;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) w4Var.m(j10, obj);
        Internal.ProtobufList protobufList = (Internal.ProtobufList) w4Var.m(j10, obj2);
        int size = protobufListMutableCopyWithCapacity2.size();
        int size2 = protobufList.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size2 + size);
            }
            protobufListMutableCopyWithCapacity2.addAll(protobufList);
        }
        if (size > 0) {
            protobufList = protobufListMutableCopyWithCapacity2;
        }
        x4.s(obj, j10, protobufList);
    }

    @Override // com.google.protobuf.p2
    public final List c(long j10, Object obj) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) x4.f25021c.m(j10, obj);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        x4.s(obj, j10, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }
}
