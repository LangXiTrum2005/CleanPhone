package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static Boolean qdl;

    public static boolean lnr() {
        Boolean bool = qdl;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!rdp.mzz()) {
            return false;
        }
        if (qdl == null) {
            qdl = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_info", "is_support_multi_process", false));
        }
        return qdl.booleanValue();
    }

    public static void qdl() {
        Boolean bool = Boolean.TRUE;
        qdl = bool;
        com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_info", "is_support_multi_process", bool);
    }

    public static void ud() {
        qdl = Boolean.FALSE;
        BinderPoolService.qdl = true;
    }
}
