package com.bytedance.adsdk.qdl.ud.mzz.qdl;

import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private static Object qdl(int i2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i2 < number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i2) < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i2) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i2) < number.doubleValue());
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    private static Object qdl(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j < ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j) < number.doubleValue());
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    private static Object qdl(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f < ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f < ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f) < number.doubleValue());
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    private static Object qdl(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d < ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d < ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d < ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d < number.doubleValue());
        }
        throw new UnsupportedOperationException(a.k(number, "This type of addition operation is not supported"));
    }

    public static Object qdl(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return qdl(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return qdl(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return qdl(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return qdl(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return qdl(((Number) obj).intValue(), number);
    }
}
