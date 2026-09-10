package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class UsingToStringOrdering extends Ordering<Object> implements Serializable {
    public static final UsingToStringOrdering X = new UsingToStringOrdering();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return X;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public final String toString() {
        return "Ordering.usingToString()";
    }
}
