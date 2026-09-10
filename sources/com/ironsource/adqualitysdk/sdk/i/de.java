package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class de extends cw {
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m1903(List<Object> list) {
        return kn.m2914((String) cw.m1805(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m1904(List<Object> list) {
        return id.m2382().m2383().m2495(cw.m1805(list, 0, Object.class), (List<String>) cw.m1805(list, 1, List.class), ((Integer) cw.m1805(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static int m1905(List<Object> list) {
        return kn.m2912((String) cw.m1805(list, 0, String.class), (String) cw.m1805(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m1906(List<Object> list) {
        String str = (String) cw.m1805(list, 0, String.class);
        return list.get(1) instanceof String ? kn.m2916(str, (String) cw.m1805(list, 1, String.class)) : kn.m2923(str, new JSONArray((Collection) cw.m1805(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m1907(List<Object> list) {
        String str = (String) cw.m1805(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) cw.m1805(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? kn.m2915(str, (String) cw.m1805(list, 1, String.class), zBooleanValue) : kn.m2922(str, new JSONArray((Collection) cw.m1805(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m1908(List<Object> list) {
        return kn.m2918((String) cw.m1805(list, 0, String.class));
    }
}
