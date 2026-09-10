package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final Internal.ProtobufList a(long j, Object obj) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.f4938c.m(obj, j);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        UnsafeUtil.r(obj, j, protobufListMutableCopyWithCapacity);
        return protobufListMutableCopyWithCapacity;
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void b(Object obj, long j) {
        ((Internal.ProtobufList) UnsafeUtil.f4938c.m(obj, j)).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void c(Object obj, Object obj2, long j) {
        UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
        Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) memoryAccessor.m(obj, j);
        Internal.ProtobufList protobufList = (Internal.ProtobufList) memoryAccessor.m(obj2, j);
        int size = protobufListMutableCopyWithCapacity.size();
        int size2 = protobufList.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListMutableCopyWithCapacity.isModifiable()) {
                protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            protobufListMutableCopyWithCapacity.addAll(protobufList);
        }
        if (size > 0) {
            protobufList = protobufListMutableCopyWithCapacity;
        }
        UnsafeUtil.r(obj, j, protobufList);
    }
}
