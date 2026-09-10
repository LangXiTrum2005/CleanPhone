package com.google.common.math;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class MathPreconditions {
    public static void a(int i2, int i3, String str, boolean z2) {
        if (!z2) {
            throw new ArithmeticException(a.i(i3, ")", a.z("overflow: ", str, "(", i2, ", ")));
        }
    }

    public static void b(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }
}
