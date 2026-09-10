package com.bytedance.sdk.openadsdk.ay.lr;

import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static void ri(final wjv wjvVar, final ri riVar, final fi.ri riVar2) {
        wjvVar.ar();
        dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("mrc_report") { // from class: com.bytedance.sdk.openadsdk.ay.lr.ka.1
            @Override // java.lang.Runnable
            public void run() {
                if (wjvVar.udw()) {
                    if (wjvVar.vgs()) {
                        com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(wjvVar.amj(), new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("show_urls", wjvVar));
                    } else {
                        com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar);
                    }
                }
                String strRi = ig.ri(wjvVar);
                final JSONObject jSONObject = new JSONObject();
                ri riVar3 = riVar;
                JSONObject jSONObjectRi = null;
                if (riVar3 != null) {
                    try {
                        jSONObject.put("root_view", ri.ri(riVar3));
                        fi.ri riVar4 = riVar2;
                        if (riVar4 != null) {
                            int i = riVar4.ri;
                            if (i != -1) {
                                jSONObject.put("dynamic_show_type", i);
                            }
                            int i2 = riVar2.lr;
                            if (i2 != -1) {
                                jSONObjectRi = com.bytedance.sdk.openadsdk.ka.ik.ri(i2 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject2 = jSONObjectRi;
                com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, strRi, "mrc_show", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ay.lr.ka.1.1
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ik() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ri() {
                        return jSONObject2;
                    }
                });
            }
        });
    }
}
