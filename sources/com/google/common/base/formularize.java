package com.google.common.base;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class formularize {
    public static void adultoid(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void apical(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(kowloon.dern(str, obj, obj2));
        }
    }

    public static <T> T arytenoidectomy(@CheckForNull T t, String str, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(kowloon.dern(str, obj));
    }

    public static String attabal(int i, int i2, String str) {
        if (i < 0) {
            return kowloon.dern("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return kowloon.dern("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    public static void beachfront(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(kowloon.dern(str, Character.valueOf(c)));
        }
    }

    public static void competently(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(kowloon.dern(str, Integer.valueOf(i)));
        }
    }

    public static void cutely(boolean z, String str, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(kowloon.dern(str, obj));
        }
    }

    public static String dern(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return saneness(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? saneness(i2, i3, "end index") : kowloon.dern("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void dovishness(boolean z, String str, char c, char c2) {
        if (!z) {
            throw new IllegalStateException(kowloon.dern(str, Character.valueOf(c), Character.valueOf(c2)));
        }
    }

    public static int formularize(int i, int i2) {
        return impassible(i, i2, "index");
    }

    public static void gintrap(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(kowloon.dern(str, Integer.valueOf(i)));
        }
    }

    public static void graveside(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static int impassible(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(attabal(i, i2, str));
        }
        return i;
    }

    public static void impromptu(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(kowloon.dern(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static <T> T kowloon(@CheckForNull T t, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void marial(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void molybdenite(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(dern(i, i2, i3));
        }
    }

    public static int monoploid(int i, int i2) {
        return polloi(i, i2, "index");
    }

    public static int polloi(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(saneness(i, i2, str));
        }
        return i;
    }

    public static void rotuma(boolean z, String str, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException(kowloon.dern(str, obj));
        }
    }

    public static String saneness(int i, int i2, String str) {
        if (i < 0) {
            return kowloon.dern("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return kowloon.dern("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    public static void taiyuan(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(kowloon.dern(str, Long.valueOf(j)));
        }
    }

    public static <T> T triweekly(@CheckForNull T t) {
        t.getClass();
        return t;
    }

    public static void wireman(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
