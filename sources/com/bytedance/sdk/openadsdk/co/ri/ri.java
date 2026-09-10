package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.sdk.component.ri.ik<JSONObject, JSONObject> {
    private final WeakReference<dzy> ri;

    public ri(dzy dzyVar) {
        this.ri = new WeakReference<>(dzyVar);
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, final dzy dzyVar) {
        vrVar.ri("getNetworkData", new com.bytedance.sdk.component.ri.ik.lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.ri.1
            @Override // com.bytedance.sdk.component.ri.ik.lr
            public com.bytedance.sdk.component.ri.ik ri() {
                return new ri(dzyVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.ri.ik
    public void ri(JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        dzy dzyVar = this.ri.get();
        if (dzyVar == null) {
            ik();
        } else {
            dzyVar.ri(jSONObject, new com.bytedance.sdk.openadsdk.aw.ka() { // from class: com.bytedance.sdk.openadsdk.co.ri.ri.2
                @Override // com.bytedance.sdk.openadsdk.aw.ka
                public void ri(boolean z, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z) {
                            ri.this.ri(jSONObject2);
                        } else {
                            jSONObject2.put("creatives", dzy.ri(riVar));
                            ri.this.ri(jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
