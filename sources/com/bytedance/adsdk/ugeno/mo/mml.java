package com.bytedance.adsdk.ugeno.mo;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    public static int qdl(boolean z2, int i2, int i3) {
        if (i3 == 0 || !z2) {
            return i2;
        }
        int i4 = i2 - 512;
        int iAbs = Math.abs(i4) % i3;
        return (i4 >= 0 || iAbs == 0) ? iAbs : i3 - iAbs;
    }

    public static boolean qdl(int i2, Collection<?> collection) {
        return i2 >= 0 && i2 < collection.size();
    }
}
