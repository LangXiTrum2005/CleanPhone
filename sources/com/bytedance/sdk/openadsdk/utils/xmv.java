package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class xmv {
    public static boolean qdl = qdl();

    private static boolean qdl() {
        SharedPreferences sharedPreferences;
        try {
            return com.bytedance.sdk.openadsdk.core.yt.qdl() == null || (sharedPreferences = com.bytedance.sdk.openadsdk.core.yt.qdl().getSharedPreferences("pag_sp_prop_switch", 0)) == null || sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr(th.getMessage(), new Object[0]);
        }
        return true;
    }

    public static void qdl(int i2) {
        try {
            SharedPreferences.Editor editorEdit = com.bytedance.sdk.openadsdk.core.yt.qdl().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            editorEdit.putInt("perf_con_use_prop", i2);
            editorEdit.apply();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr(th.getMessage(), new Object[0]);
        }
    }
}
