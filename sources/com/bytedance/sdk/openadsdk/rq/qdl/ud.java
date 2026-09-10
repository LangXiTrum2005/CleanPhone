package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends com.bytedance.sdk.component.qdl.lnr<JSONObject, JSONObject> {
    private final WeakReference<hkc> qdl;

    public ud(hkc hkcVar) {
        this.qdl = new WeakReference<>(hkcVar);
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, final hkc hkcVar) {
        bjyVar.qdl("interstitial_webview_close", new com.bytedance.sdk.component.qdl.lnr.ud() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.ud.1
            @Override // com.bytedance.sdk.component.qdl.lnr.ud
            public com.bytedance.sdk.component.qdl.lnr qdl() {
                return new ud(hkcVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.qdl.lnr
    public void qdl(JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        com.bytedance.sdk.openadsdk.core.tvp.ud().yt();
        hkc hkcVar = this.qdl.get();
        if (hkcVar == null) {
            lnr();
        } else {
            hkcVar.jpc();
        }
    }
}
