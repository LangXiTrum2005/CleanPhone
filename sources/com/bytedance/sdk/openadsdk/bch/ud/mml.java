package com.bytedance.sdk.openadsdk.bch.ud;

import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    public static void qdl(final ljh ljhVar, final qdl qdlVar, final mzz.qdl qdlVar2) {
        ljhVar.cuk();
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("mrc_report") { // from class: com.bytedance.sdk.openadsdk.bch.ud.mml.1
            @Override // java.lang.Runnable
            public void run() {
                if (ljhVar.yk()) {
                    if (ljhVar.au()) {
                        com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(ljhVar.eta(), new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.ud("show_urls", ljhVar));
                    } else {
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar);
                    }
                }
                String strQdl = gy.qdl(ljhVar);
                final JSONObject jSONObject = new JSONObject();
                qdl qdlVar3 = qdlVar;
                JSONObject jSONObjectQdl = null;
                if (qdlVar3 != null) {
                    try {
                        jSONObject.put("root_view", qdl.qdl(qdlVar3));
                        mzz.qdl qdlVar4 = qdlVar2;
                        if (qdlVar4 != null) {
                            int i2 = qdlVar4.qdl;
                            if (i2 != -1) {
                                jSONObject.put("dynamic_show_type", i2);
                            }
                            int i3 = qdlVar2.ud;
                            if (i3 != -1) {
                                jSONObjectQdl = com.bytedance.sdk.openadsdk.mml.lnr.qdl(i3 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject2 = jSONObjectQdl;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, strQdl, "mrc_show", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.bch.ud.mml.1.1
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject lnr() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        return jSONObject2;
                    }
                });
            }
        });
    }
}
