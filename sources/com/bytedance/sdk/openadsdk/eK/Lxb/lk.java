package com.bytedance.sdk.openadsdk.eK.Lxb;

import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    public static int LD = 6;
    public static boolean Lxb = false;
    public static String lk = "engaged_view";

    public static void LD(tD tDVar) {
        LD ldLk = lk(tDVar);
        if (ldLk == null) {
            return;
        }
        ldLk.LD();
    }

    public static void Lxb(tD tDVar) {
        LD ldLk = lk(tDVar);
        if (ldLk == null) {
            return;
        }
        ldLk.Lxb();
    }

    private static LD lk(tD tDVar) {
        if (tDVar == null || !tDVar.eq()) {
            return null;
        }
        return tDVar.Rp();
    }

    public static void Lxb(tD tDVar, int i) {
        LD ldLk = lk(tDVar);
        if (ldLk == null || ldLk.lk()) {
            return;
        }
        ldLk.Lxb(i);
    }

    public static void Lxb(tD tDVar, boolean z) {
        LD ldLk = lk(tDVar);
        if (ldLk == null || ldLk.lk()) {
            return;
        }
        ldLk.Lxb(z);
        ldLk.Lxb(z ? 4 : 8);
    }
}
