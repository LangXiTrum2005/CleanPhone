package com.p004ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class dc extends cz {
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static String m1803(List<Object> list) {
        return kd.m2774((String) cz.m1785(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m1804(List<Object> list) {
        String str = (String) cz.m1785(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) cz.m1785(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? kd.m2783(str, (String) cz.m1785(list, 1, String.class), zBooleanValue) : kd.m2784(str, new JSONArray((Collection) cz.m1785(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m1805(List<Object> list) {
        return kd.m2780((String) cz.m1785(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m1806(List<Object> list) {
        String str = (String) cz.m1785(list, 0, String.class);
        return list.get(1) instanceof String ? kd.m2775(str, (String) cz.m1785(list, 1, String.class)) : kd.m2785(str, new JSONArray((Collection) cz.m1785(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m1807(List<Object> list) {
        return hr.m2242().m2245().m2316(cz.m1785(list, 0, Object.class), (List<String>) cz.m1785(list, 1, List.class), ((Integer) cz.m1785(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int m1808(List<Object> list) {
        return kd.m2781((String) cz.m1785(list, 0, String.class), (String) cz.m1785(list, 1, String.class));
    }
}
