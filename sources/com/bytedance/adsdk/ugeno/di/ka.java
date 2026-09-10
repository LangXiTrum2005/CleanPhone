package com.bytedance.adsdk.ugeno.di;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static int ri(boolean z, int i, int i2) {
        if (i2 == 0 || !z) {
            return i;
        }
        int i3 = i - 512;
        int iAbs = Math.abs(i3) % i2;
        return (i3 >= 0 || iAbs == 0) ? iAbs : i2 - iAbs;
    }

    public static boolean ri(int i, Collection<?> collection2) {
        return i >= 0 && i < collection2.size();
    }
}
