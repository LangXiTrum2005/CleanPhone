package com.p004ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cs extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Field m1713(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1785 = cz.m1785(list, 0, Object.class);
            return hr.m2242().m2244().m2215(objM1785.getClass(), (Class) cz.m1785(list, 1, Class.class));
        }
        Class cls = (Class) cz.m1785(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return hr.m2242().m2244().m2215(cls, (Class) cz.m1785(list, 1, Class.class));
        }
        return hr.m2242().m2244().m2216(cls, (hp) cz.m1785(list, 1, hp.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<Field> m1714(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM1785 = cz.m1785(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) cz.m1785(list, 1, Boolean.class)).booleanValue() : false;
            hr.m2242().m2244();
            Field[] fieldArrM2214 = ho.m2214(objM1785.getClass(), zBooleanValue, -1, null);
            if (fieldArrM2214 != null) {
                return Arrays.asList(fieldArrM2214);
            }
        } else if (list.size() > 1) {
            return hr.m2242().m2244().m2218((Class) cz.m1785(list, 0, Class.class), (hp) cz.m1785(list, 1, hp.class));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field m1715(List<Object> list) {
        return hr.m2242().m2244().m2216((Class) cz.m1785(list, 0, Class.class), (hp) cz.m1785(list, 1, hp.class));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field m1716(List<Object> list) {
        return hr.m2242().m2244().m2217((Class) cz.m1785(list, 0, Class.class), (String) cz.m1785(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static hp.e m1712() {
        hr.m2242().m2244();
        return ho.m2212();
    }
}
