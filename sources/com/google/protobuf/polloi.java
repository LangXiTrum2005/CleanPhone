package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class polloi {
    private static final polloi FULL_INSTANCE;
    private static final polloi LITE_INSTANCE;

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class dern extends polloi {
        private dern() {
            super();
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j) {
            return (Internal.ProtobufList) walach.getObject(obj, j);
        }

        @Override // com.google.protobuf.polloi
        public void makeImmutableListAt(Object obj, long j) {
            getProtobufList(obj, j).makeImmutable();
        }

        @Override // com.google.protobuf.polloi
        public <E> void mergeListsAt(Object obj, Object obj2, long j) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j);
            Internal.ProtobufList protobufList2 = getProtobufList(obj2, j);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            walach.putObject(obj, j, protobufList2);
        }

        @Override // com.google.protobuf.polloi
        public <L> List<L> mutableListAt(Object obj, long j) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            walach.putObject(obj, j, protobufListMutableCopyWithCapacity2);
            return protobufListMutableCopyWithCapacity2;
        }
    }

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class saneness extends polloi {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private saneness() {
            super();
        }

        public static <E> List<E> getList(Object obj, long j) {
            return (List) walach.getObject(obj, j);
        }

        @Override // com.google.protobuf.polloi
        public void makeImmutableListAt(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) walach.getObject(obj, j);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof kattegat) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            walach.putObject(obj, j, objUnmodifiableList);
        }

        @Override // com.google.protobuf.polloi
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
            walach.putObject(obj, j, list);
        }

        @Override // com.google.protobuf.polloi
        public <L> List<L> mutableListAt(Object obj, long j) {
            return mutableListAt(obj, j, 10);
        }

        private static <L> List<L> mutableListAt(Object obj, long j, int i) {
            List<L> listMutableCopyWithCapacity2;
            List<L> list = getList(obj, j);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    listMutableCopyWithCapacity2 = new LazyStringArrayList(i);
                } else {
                    listMutableCopyWithCapacity2 = ((list instanceof kattegat) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i) : new ArrayList<>(i);
                }
                walach.putObject(obj, j, listMutableCopyWithCapacity2);
                return listMutableCopyWithCapacity2;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                walach.putObject(obj, j, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
                walach.putObject(obj, j, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if ((list instanceof kattegat) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                    walach.putObject(obj, j, protobufListMutableCopyWithCapacity2);
                    return protobufListMutableCopyWithCapacity2;
                }
            }
            return list;
        }
    }

    static {
        FULL_INSTANCE = new saneness();
        LITE_INSTANCE = new dern();
    }

    public static polloi full() {
        return FULL_INSTANCE;
    }

    public static polloi lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j);

    public abstract <L> List<L> mutableListAt(Object obj, long j);

    private polloi() {
    }
}
