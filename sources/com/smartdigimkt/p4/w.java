package com.smartdigimkt.p4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37625a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37626b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37627c = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private w() {
    }

    public static int a(int i2, int i3) {
        for (int i4 = 1; i4 <= 2; i4++) {
            int i5 = (i2 + i4) % 3;
            if (b(i5, i3)) {
                return i5;
            }
        }
        return i2;
    }

    public static boolean b(int i2, int i3) {
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1) {
            return i2 == 2 && (i3 & 2) != 0;
        }
        return (i3 & 1) != 0;
    }
}
