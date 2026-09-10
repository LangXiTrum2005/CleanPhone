package com.bytedance.sdk.openadsdk.JVA.Lxb;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.component.Lxb.ZU<JSONObject, JSONObject> {
    private final WeakReference<Ivz> Lxb;

    public Lxb(Ivz ivz) {
        this.Lxb = new WeakReference<>(ivz);
    }

    public static void Lxb(kqm kqmVar, final Ivz ivz) {
        kqmVar.Lxb("getNetworkData", new com.bytedance.sdk.component.Lxb.ZU.LD() { // from class: com.bytedance.sdk.openadsdk.JVA.Lxb.Lxb.1
            @Override // com.bytedance.sdk.component.Lxb.ZU.LD
            public com.bytedance.sdk.component.Lxb.ZU Lxb() {
                return new Lxb(ivz);
            }
        });
    }

    @Override // com.bytedance.sdk.component.Lxb.ZU
    public void Lxb(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        Ivz ivz = this.Lxb.get();
        if (ivz == null) {
            lk();
        } else {
            ivz.Lxb(jSONObject, new com.bytedance.sdk.openadsdk.sLN.lk() { // from class: com.bytedance.sdk.openadsdk.JVA.Lxb.Lxb.2
                @Override // com.bytedance.sdk.openadsdk.sLN.lk
                public void Lxb(boolean z, List<tD> list) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z) {
                            Lxb.this.Lxb(jSONObject2);
                        } else {
                            jSONObject2.put("creatives", Ivz.LD(list));
                            Lxb.this.Lxb(jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
