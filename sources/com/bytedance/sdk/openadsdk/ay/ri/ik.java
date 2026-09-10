package com.bytedance.sdk.openadsdk.ay.ri;

import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    public static String ik = "engaged_view";
    public static int lr = 6;
    public static boolean ri = false;

    private static lr ik(wjv wjvVar) {
        if (wjvVar == null || !wjvVar.ex()) {
            return null;
        }
        return wjvVar.cie();
    }

    public static void lr(wjv wjvVar) {
        lr lrVarIk = ik(wjvVar);
        if (lrVarIk == null) {
            return;
        }
        lrVarIk.lr();
    }

    public static void ri(wjv wjvVar) {
        lr lrVarIk = ik(wjvVar);
        if (lrVarIk == null) {
            return;
        }
        lrVarIk.ri();
    }

    public static void ri(wjv wjvVar, int i) {
        lr lrVarIk = ik(wjvVar);
        if (lrVarIk == null || lrVarIk.ik()) {
            return;
        }
        lrVarIk.ri(i);
    }

    public static void ri(wjv wjvVar, boolean z) {
        lr lrVarIk = ik(wjvVar);
        if (lrVarIk == null || lrVarIk.ik()) {
            return;
        }
        lrVarIk.ri(z);
        lrVarIk.ri(z ? 4 : 8);
    }
}
