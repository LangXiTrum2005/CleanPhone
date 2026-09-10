package com.bytedance.sdk.openadsdk.eK.LD;

import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static void Lxb(final tD tDVar, final Lxb lxb, final JXs.Lxb lxb2) {
        tDVar.FtP();
        hg.lk(new com.bytedance.sdk.component.OY.OY("mrc_report") { // from class: com.bytedance.sdk.openadsdk.eK.LD.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                if (tDVar.Bj()) {
                    if (tDVar.JP()) {
                        com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(tDVar.SS(), new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD("show_urls", tDVar));
                    } else {
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar);
                    }
                }
                String strLxb = nJ.Lxb(tDVar);
                JSONObject jSONObject = new JSONObject();
                Lxb lxb3 = lxb;
                if (lxb3 != null) {
                    try {
                        jSONObject.put("root_view", Lxb.Lxb(lxb3));
                        JXs.Lxb lxb4 = lxb2;
                        if (lxb4 != null) {
                            int i = lxb4.Lxb;
                            if (i != -1) {
                                jSONObject.put("dynamic_show_type", i);
                            }
                            int i2 = lxb2.LD;
                            if (i2 != -1) {
                                jSONObject.put("ad_show_order", i2 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, strLxb, "mrc_show", jSONObject);
            }
        });
    }
}
