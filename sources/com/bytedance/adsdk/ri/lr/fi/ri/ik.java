package com.bytedance.adsdk.ri.lr.fi.ri;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static Object ri(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object ri(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object ri(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object ri(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static Object ri(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return ri(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return ri(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return ri(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return ri(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
        return ri(((Number) obj).intValue(), number);
    }
}
