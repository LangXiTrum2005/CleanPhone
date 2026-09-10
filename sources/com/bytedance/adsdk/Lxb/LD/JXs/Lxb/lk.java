package com.bytedance.adsdk.Lxb.LD.JXs.Lxb;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class lk {
    private static Object Lxb(int i, Number number) {
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
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    private static Object Lxb(long j, Number number) {
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
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    private static Object Lxb(float f, Number number) {
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
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    private static Object Lxb(double d, Number number) {
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
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    public static Object Lxb(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return Lxb(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return Lxb(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return Lxb(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return Lxb(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return Lxb(((Number) obj).intValue(), number);
    }
}
