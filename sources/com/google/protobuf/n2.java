package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f24905c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i10, long j10, Object obj) {
        List listMutableCopyWithCapacity2;
        List list = (List) x4.f25021c.m(j10, obj);
        if (list.isEmpty()) {
            if (list instanceof LazyStringList) {
                listMutableCopyWithCapacity2 = new LazyStringArrayList(i10);
            } else {
                listMutableCopyWithCapacity2 = ((list instanceof o3) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i10) : new ArrayList(i10);
            }
            x4.s(obj, j10, listMutableCopyWithCapacity2);
            return listMutableCopyWithCapacity2;
        }
        if (f24905c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            x4.s(obj, j10, arrayList);
            return arrayList;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i10);
            lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
            x4.s(obj, j10, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if ((list instanceof o3) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i10);
                x4.s(obj, j10, protobufListMutableCopyWithCapacity2);
                return protobufListMutableCopyWithCapacity2;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.p2
    public final void a(long j10, Object obj) {
        Object objUnmodifiableList;
        List list = (List) x4.f25021c.m(j10, obj);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (f24905c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof o3) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        x4.s(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.protobuf.p2
    public final void b(Object obj, long j10, Object obj2) {
        List list = (List) x4.f25021c.m(j10, obj2);
        List listD = d(list.size(), j10, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        x4.s(obj, j10, list);
    }

    @Override // com.google.protobuf.p2
    public final List c(long j10, Object obj) {
        return d(10, j10, obj);
    }
}
