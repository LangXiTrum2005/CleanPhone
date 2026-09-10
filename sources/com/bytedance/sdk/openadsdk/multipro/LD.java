package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static Boolean Lxb;

    public static void LD() {
        Lxb = Boolean.FALSE;
        BinderPoolService.Lxb = true;
    }

    public static void Lxb() {
        Boolean bool = Boolean.TRUE;
        Lxb = bool;
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_info", "is_support_multi_process", bool);
    }

    public static boolean lk() {
        Boolean bool = Lxb;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!STP.JXs()) {
            return false;
        }
        if (Lxb == null) {
            Lxb = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_info", "is_support_multi_process", false));
        }
        return Lxb.booleanValue();
    }
}
