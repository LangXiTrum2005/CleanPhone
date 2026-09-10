package com.bytedance.sdk.openadsdk.ZU.Lxb;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.kqm;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static AtomicInteger Lxb = new AtomicInteger(0);
    public static final AtomicBoolean LD = new AtomicBoolean(false);

    public static void LD() {
        com.bytedance.sdk.component.lc.Lxb.LD.lk();
    }

    public static void Lxb(Context context, boolean z) {
        if (LD.compareAndSet(false, true)) {
            com.bytedance.sdk.component.lc.Lxb.LD.Lxb(new com.bytedance.sdk.component.lc.Lxb.Lxb.C0064Lxb().Lxb(new nBu()).LD(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb.lk()).lk(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb.JXs()).Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb.ZU()).Lxb(z).Lxb(new JVA()).Lxb(OY.Lxb).LD(kqm.ZU().STP()).Lxb(kqm.ZU().IeN()).Lxb(kqm.ZU().MGT()).Lxb(), context);
            LD();
        }
    }

    public static void lk() {
        try {
            com.bytedance.sdk.component.lc.Lxb.LD.ZU();
            com.bytedance.sdk.component.lc.Lxb.LD.JXs();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.ZU.Lxb lxb) {
        com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb lxb2 = new com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb(lxb.ZU(), lxb);
        lxb2.LD(lxb.JXs() ? (byte) 1 : (byte) 2);
        lxb2.Lxb((byte) 0);
        if (com.bytedance.sdk.component.lc.Lxb.LD.LD()) {
            Lxb(kqm.Lxb(), com.bytedance.sdk.openadsdk.multipro.LD.lk());
        }
        com.bytedance.sdk.component.lc.Lxb.LD.Lxb(lxb2);
    }

    public static com.bytedance.sdk.openadsdk.STP.lk.LD Lxb() {
        return sLN.Lxb;
    }

    public static void Lxb(final List<String> list, final int i, final String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new com.bytedance.sdk.component.OY.OY("track") { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.lc.Lxb.LD.LD()) {
                    ZU.Lxb(kqm.Lxb(), com.bytedance.sdk.openadsdk.multipro.LD.lk());
                }
                com.bytedance.sdk.component.lc.Lxb.LD.Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb(kqm.Lxb()), list, true, i, str);
            }
        });
    }

    public static void Lxb(String str) {
        Lxb(str, false);
    }

    public static void Lxb(String str, boolean z) {
        if (com.bytedance.sdk.component.lc.Lxb.LD.LD()) {
            Lxb(kqm.Lxb(), com.bytedance.sdk.openadsdk.multipro.LD.lk());
        }
        com.bytedance.sdk.component.lc.Lxb.LD.Lxb(str, z);
    }
}
