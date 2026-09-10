package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.sdk.component.ri.ik<JSONObject, JSONObject> {
    private final WeakReference<dzy> ri;

    public ik(dzy dzyVar) {
        this.ri = new WeakReference<>(dzyVar);
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, final dzy dzyVar) {
        vrVar.ri("newClickEvent", new com.bytedance.sdk.component.ri.ik.lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.ik.1
            @Override // com.bytedance.sdk.component.ri.ik.lr
            public com.bytedance.sdk.component.ri.ik ri() {
                return new ik(dzyVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.ri.ik
    public void ri(JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        dzy dzyVar = this.ri.get();
        if (dzyVar == null) {
            ik();
        } else {
            dzyVar.fi(jSONObject);
        }
    }
}
