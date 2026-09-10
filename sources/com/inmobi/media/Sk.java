package com.inmobi.media;

import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Sk {
    public static void a(boolean z) {
        Ji.d.set(z);
        if (z) {
            ((C3349xc) Ji.e.getValue()).b(new I2(101, 6, (String) null));
        } else {
            ((C3349xc) Ji.e.getValue()).b(new I2(102, 6, (String) null));
        }
        Rk runnable = new Rk(z, null);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        cutely.wireman(Ji.h, null, null, new Ii(runnable, null), 3, null);
    }
}
