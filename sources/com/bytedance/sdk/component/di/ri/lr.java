package com.bytedance.sdk.component.di.ri;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static volatile List<Object> ri = new ArrayList();

    public static void fi() {
        ka kaVar = ka.ri;
    }

    public static void ik() {
        ri(false);
        ka.ri.ri();
    }

    public static void ka() {
        ka.ri.lr();
    }

    public static boolean lr() {
        return xha.di().vr() == null || xha.di().fi() == null;
    }

    public static void ri(ri riVar, Context context) {
        ka.ri.ri(riVar, context);
    }

    public static void ri(boolean z) {
        ka.ri.ri(z);
    }

    public static List<Object> ri() {
        return ri;
    }

    public static void ri(String str, boolean z) {
        ka.ri.ri(str, z);
    }

    public static void ri(String str, List<String> list, boolean z, int i, String str2) {
        ri(str, list, z, null, i, str2);
    }

    public static void ri(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        ka.ri.ri(str, list, z, map, i, str2);
    }

    public static void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        ka.ri.ri(riVar);
    }
}
