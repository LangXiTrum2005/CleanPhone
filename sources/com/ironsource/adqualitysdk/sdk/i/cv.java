package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cv extends cw {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Field m1797(List<Object> list) {
        return id.m2382().m2384().m2315((Class) cw.m1805(list, 0, Class.class), (hz) cw.m1805(list, 1, hz.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hz.d m1798() {
        id.m2382().m2384();
        return hw.m2307();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field m1799(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1805 = cw.m1805(list, 0, Object.class);
            return id.m2382().m2384().m2312(objM1805.getClass(), (Class) cw.m1805(list, 1, Class.class));
        }
        Class cls = (Class) cw.m1805(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return id.m2382().m2384().m2312(cls, (Class) cw.m1805(list, 1, Class.class));
        }
        return id.m2382().m2384().m2315(cls, (hz) cw.m1805(list, 1, hz.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Field> m1800(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1805 = cw.m1805(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) cw.m1805(list, 1, Boolean.class)).booleanValue() : false;
            id.m2382().m2384();
            Field[] fieldArrM2310 = hw.m2310(objM1805.getClass(), zBooleanValue, -1, null);
            if (fieldArrM2310 != null) {
                return Arrays.asList(fieldArrM2310);
            }
        } else if (list.size() > 1) {
            return id.m2382().m2384().m2314((Class) cw.m1805(list, 0, Class.class), (hz) cw.m1805(list, 1, hz.class));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field m1801(List<Object> list) {
        return id.m2382().m2384().m2313((Class) cw.m1805(list, 0, Class.class), (String) cw.m1805(list, 1, String.class));
    }
}
