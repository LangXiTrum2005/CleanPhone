package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.sdk.component.qdl.lnr<JSONObject, JSONObject> {
    private final WeakReference<hkc> qdl;

    public qdl(hkc hkcVar) {
        this.qdl = new WeakReference<>(hkcVar);
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, final hkc hkcVar) {
        bjyVar.qdl("getNetworkData", new com.bytedance.sdk.component.qdl.lnr.ud() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.qdl.1
            @Override // com.bytedance.sdk.component.qdl.lnr.ud
            public com.bytedance.sdk.component.qdl.lnr qdl() {
                return new qdl(hkcVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.qdl.lnr
    public void qdl(JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        hkc hkcVar = this.qdl.get();
        if (hkcVar == null) {
            lnr();
        } else {
            hkcVar.qdl(jSONObject, new com.bytedance.sdk.openadsdk.fs.mml() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.qdl.2
                @Override // com.bytedance.sdk.openadsdk.fs.mml
                public void qdl(boolean z2, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z2) {
                            qdl.this.qdl(jSONObject2);
                        } else {
                            jSONObject2.put("creatives", hkc.qdl(qdlVar));
                            qdl.this.qdl(jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
