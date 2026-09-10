package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class aH {
    public static boolean Lxb = Lxb();

    private static boolean Lxb() {
        SharedPreferences sharedPreferences;
        try {
            return com.bytedance.sdk.openadsdk.core.kqm.Lxb() == null || (sharedPreferences = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSharedPreferences("pag_sp_prop_switch", 0)) == null || sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
        }
        return true;
    }

    public static void Lxb(int i) {
        try {
            SharedPreferences.Editor editorEdit = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            editorEdit.putInt("perf_con_use_prop", i);
            editorEdit.apply();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
        }
    }
}
