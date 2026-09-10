package com.bytedance.sdk.openadsdk.JVA.Lxb;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.Ivz;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends com.bytedance.sdk.component.Lxb.ZU<JSONObject, JSONObject> {
    private final WeakReference<Ivz> Lxb;

    public LD(Ivz ivz) {
        this.Lxb = new WeakReference<>(ivz);
    }

    public static void Lxb(kqm kqmVar, final Ivz ivz) {
        kqmVar.Lxb("interstitial_webview_close", new com.bytedance.sdk.component.Lxb.ZU.LD() { // from class: com.bytedance.sdk.openadsdk.JVA.Lxb.LD.1
            @Override // com.bytedance.sdk.component.Lxb.ZU.LD
            public com.bytedance.sdk.component.Lxb.ZU Lxb() {
                return new LD(ivz);
            }
        });
    }

    @Override // com.bytedance.sdk.component.Lxb.ZU
    public void Lxb(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        com.bytedance.sdk.openadsdk.core.QAg.LD().kqm();
        Ivz ivz = this.Lxb.get();
        if (ivz == null) {
            sLN.Lxb("DoInterstitialWebViewCloseMethod", "invoke error");
            lk();
        } else {
            ivz.ebl();
        }
    }
}
