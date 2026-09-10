package com.google.common.collect;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void b(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.m(str, " cannot be negative but was: ", i2));
        }
    }

    public static void c(int i2, String str) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.m(str, " must be positive but was: ", i2));
        }
    }

    public static void d(boolean z2) {
        Preconditions.o("no calls to next() since the last call to remove()", z2);
    }
}
