package com.bytedance.adsdk.qdl.ud.mzz.qdl;

import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    private static Object qdl(int i2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i2 % number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(((long) i2) % number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i2 % number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) i2) % number.doubleValue());
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    private static Object qdl(long j, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j % number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j % number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j % number.doubleValue());
            }
            throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j % ((long) number.intValue()));
    }

    private static Object qdl(float f, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f % number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f % number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(((double) f) % number.doubleValue());
            }
            throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f % number.intValue());
    }

    private static Object qdl(double d, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d % number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d % ((double) number.floatValue()));
            }
            if (number instanceof Double) {
                return Double.valueOf(d % number.doubleValue());
            }
            throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d % ((double) number.intValue()));
    }

    public static Object qdl(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return qdl(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return qdl(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return qdl(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
        }
        return qdl(number.intValue(), number2);
    }
}
