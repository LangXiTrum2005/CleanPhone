package com.bytedance.adsdk.Lxb.LD.JXs.Lxb;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private static boolean Lxb(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i) == number.doubleValue();
        }
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    private static boolean Lxb(long j, Number number) {
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
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    private static boolean Lxb(float f, Number number) {
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
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    private static boolean Lxb(double d, Number number) {
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
        throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
    }

    public static boolean Lxb(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Lxb(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return Lxb(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return Lxb(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(AbstractC5044xl.e(number, "This type of addition operation is not supported"));
        }
        return Lxb(number.intValue(), number2);
    }
}
