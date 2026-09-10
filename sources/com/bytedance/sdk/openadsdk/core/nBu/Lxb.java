package com.bytedance.sdk.openadsdk.core.nBu;

import android.content.Context;
import com.bytedance.sdk.component.ebl.lk.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.lc;
import com.bytedance.sdk.openadsdk.kqm.LD;
import com.bytedance.sdk.openadsdk.kqm.lk;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static boolean Lxb = false;
    private static final int LD = Integer.parseInt("1371");
    private static long lk = System.currentTimeMillis();

    public static void LD() {
        if (Lxb) {
            lc lcVarZU = kqm.ZU();
            if (lcVarZU.QAg()) {
                long jFGm = lcVarZU.FGm();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - lk >= jFGm) {
                    lk = jCurrentTimeMillis;
                    Context contextLxb = kqm.Lxb();
                    if (contextLxb == null) {
                        return;
                    }
                    OY.Lxb().Lxb(LD, contextLxb).lk();
                }
            }
        }
    }

    public static void Lxb() {
        Context contextLxb;
        if (!kqm.ZU().QAg() || Lxb || (contextLxb = kqm.Lxb()) == null) {
            return;
        }
        try {
            lk.Lxb().LD().Lxb(contextLxb, true, new LD(contextLxb));
            lk.Lxb().LD().Lxb(contextLxb, com.bytedance.sdk.openadsdk.multipro.LD.lk());
            lk = System.currentTimeMillis();
            Lxb = true;
        } catch (Exception e) {
            sLN.Lxb("TncHelper", "initTTAdNet: ", e.getMessage());
        }
    }
}
