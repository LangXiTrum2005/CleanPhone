package com.bytedance.adsdk.qdl.ud.mzz.qdl;

import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private static boolean qdl(int i2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i2 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i2) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i2) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i2) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    private static boolean qdl(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    private static boolean qdl(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    private static boolean qdl(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    public static boolean qdl(Number number, Number number2) {
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
