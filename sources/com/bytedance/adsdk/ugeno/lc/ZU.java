package com.bytedance.adsdk.ugeno.lc;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class ZU {
    public static int Lxb(boolean z, int i, int i2) {
        if (i2 == 0 || !z) {
            return i;
        }
        int i3 = i - 1073741823;
        int iAbs = Math.abs(i3) % i2;
        return (i3 >= 0 || iAbs == 0) ? iAbs : i2 - iAbs;
    }

    public static boolean Lxb(int i, Collection<?> collection) {
        return i >= 0 && i < collection.size();
    }
}
