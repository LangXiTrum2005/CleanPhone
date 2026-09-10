package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2123j0 extends AbstractC2127l0 {
    private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C2123j0() {
        super();
    }

    public static <E> List<E> getList(Object obj, long j) {
        return (List) U0.getObject(obj, j);
    }

    @Override // com.google.protobuf.AbstractC2127l0
    public void makeImmutableListAt(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) U0.getObject(obj, j);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof EV) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        U0.putObject(obj, j, objUnmodifiableList);
    }

    @Override // com.google.protobuf.AbstractC2127l0
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        List list = getList(obj2, j);
        List listMutableListAt = mutableListAt(obj, j, list.size());
        int size = listMutableListAt.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listMutableListAt.addAll(list);
        }
        if (size > 0) {
            list = listMutableListAt;
        }
        U0.putObject(obj, j, list);
    }

    @Override // com.google.protobuf.AbstractC2127l0
    public <L> List<L> mutableListAt(Object obj, long j) {
        return mutableListAt(obj, j, 10);
    }

    private static <L> List<L> mutableListAt(Object obj, long j, int i) {
        Object obj2;
        List<L> listMutableCopyWithCapacity;
        List<L> list = getList(obj, j);
        if (list.isEmpty()) {
            if (list instanceof LazyStringList) {
                listMutableCopyWithCapacity = new LazyStringArrayList(i);
            } else {
                listMutableCopyWithCapacity = ((list instanceof EV) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity(i) : new ArrayList<>(i);
            }
            U0.putObject(obj, j, listMutableCopyWithCapacity);
            return listMutableCopyWithCapacity;
        }
        if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            U0.putObject(obj, j, arrayList);
            obj2 = arrayList;
        } else {
            if (!(list instanceof UnmodifiableLazyStringList)) {
                if (!(list instanceof EV) || !(list instanceof Internal.ProtobufList)) {
                    return list;
                }
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    return list;
                }
                Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list.size() + i);
                U0.putObject(obj, j, protobufListMutableCopyWithCapacity);
                return protobufListMutableCopyWithCapacity;
            }
            LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i);
            lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
            U0.putObject(obj, j, lazyStringArrayList);
            obj2 = lazyStringArrayList;
        }
        return (List<L>) obj2;
    }
}
