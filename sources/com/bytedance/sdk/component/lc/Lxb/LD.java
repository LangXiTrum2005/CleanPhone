package com.bytedance.sdk.component.lc.Lxb;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static volatile List<Object> Lxb = new ArrayList();

    public static void JXs() {
        ZU zu = ZU.Lxb;
    }

    public static boolean LD() {
        return OY.ebl().VVE() == null || OY.ebl().lc() == null;
    }

    public static void Lxb(Lxb lxb, Context context) {
        ZU.Lxb.Lxb(lxb, context);
    }

    public static void ZU() {
        ZU.Lxb.LD();
    }

    public static void lk() {
        Lxb(false);
        ZU.Lxb.Lxb();
    }

    public static void Lxb(boolean z) {
        ZU.Lxb.Lxb(z);
    }

    public static List<Object> Lxb() {
        return Lxb;
    }

    public static void Lxb(String str, boolean z) {
        ZU.Lxb.Lxb(str, z);
    }

    public static void Lxb(String str, List<String> list, boolean z, int i, String str2) {
        Lxb(str, list, z, null, i, str2);
    }

    public static void Lxb(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        ZU.Lxb.Lxb(str, list, z, map, i, str2);
    }

    public static void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        ZU.Lxb.Lxb(lxb);
    }
}
