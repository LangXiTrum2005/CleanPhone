package com.p004ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cx extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m1734(List<Object> list) {
        hv hvVar = (hv) cz.m1785(list, 1, hv.class);
        return list.get(0) instanceof Class ? hs.m2248((Class) cz.m1785(list, 0, Class.class), hvVar) : hs.m2248(cz.m1785(list, 0, Object.class).getClass(), hvVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Method m1735(List<Object> list) {
        hv hvVar = (hv) cz.m1785(list, 1, hv.class);
        return list.get(0) instanceof Class ? hs.m2250((Class) cz.m1785(list, 0, Class.class), hvVar) : hs.m2250(cz.m1785(list, 0, Object.class).getClass(), hvVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static hv.a m1736() {
        return new hv.a();
    }
}
