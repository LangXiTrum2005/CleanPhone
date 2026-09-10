package com.bytedance.sdk.openadsdk.JVA.Lxb;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.openadsdk.core.Ivz;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends com.bytedance.sdk.component.Lxb.ZU<JSONObject, JSONObject> {
    private final WeakReference<Ivz> Lxb;

    public lk(Ivz ivz) {
        this.Lxb = new WeakReference<>(ivz);
    }

    public static void Lxb(kqm kqmVar, final Ivz ivz) {
        kqmVar.Lxb("newClickEvent", new com.bytedance.sdk.component.Lxb.ZU.LD() { // from class: com.bytedance.sdk.openadsdk.JVA.Lxb.lk.1
            @Override // com.bytedance.sdk.component.Lxb.ZU.LD
            public com.bytedance.sdk.component.Lxb.ZU Lxb() {
                return new lk(ivz);
            }
        });
    }

    @Override // com.bytedance.sdk.component.Lxb.ZU
    public void Lxb(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        Ivz ivz = this.Lxb.get();
        if (ivz == null) {
            lk();
        } else {
            ivz.JXs(jSONObject);
        }
    }
}
