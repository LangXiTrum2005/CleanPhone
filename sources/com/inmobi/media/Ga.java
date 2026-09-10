package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ga {
    public static final boolean a(Da da) {
        Intrinsics.f(da, "<this>");
        int i2 = da.f22780b;
        if ((400 <= i2 && i2 < 600) || i2 <= 0) {
            return false;
        }
        String str = da.f22781c;
        return str == null || str.length() == 0;
    }
}
