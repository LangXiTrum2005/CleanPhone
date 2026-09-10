package io.reactivex.internal.functions;

import androidx.datastore.preferences.protobuf.a;
import io.reactivex.functions.BiPredicate;

/* JADX INFO: loaded from: classes7.dex */
public final class ObjectHelper {
    static final BiPredicate<Object, Object> EQUALS = new BiObjectPredicate();

    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.functions.BiPredicate
        public boolean test(Object obj, Object obj2) {
            return ObjectHelper.equals(obj, obj2);
        }
    }

    private ObjectHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static int compare(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> BiPredicate<T, T> equalsPredicate() {
        return (BiPredicate<T, T>) EQUALS;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int verifyPositive(int i2, String str) {
        if (i2 > 0) {
            return i2;
        }
        throw new IllegalArgumentException(a.m(str, " > 0 required but it was ", i2));
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Deprecated
    public static long requireNonNull(long j, String str) {
        throw new InternalError(android.support.v4.media.a.C("Null check on a primitive: ", str));
    }

    public static long verifyPositive(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }
}
