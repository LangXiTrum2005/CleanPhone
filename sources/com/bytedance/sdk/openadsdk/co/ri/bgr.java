package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bgr extends com.bytedance.sdk.component.ri.ik<JSONObject, JSONObject> {
    private long ik;
    private HashSet<Integer> ka = new HashSet<>();
    private wjv lr;
    private WeakReference<dzy> ri;

    public bgr(dzy dzyVar, wjv wjvVar) {
        this.ri = new WeakReference<>(dzyVar);
        this.lr = wjvVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, final dzy dzyVar, final wjv wjvVar) {
        vrVar.ri("requestDelayCallback", new com.bytedance.sdk.component.ri.ik.lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.bgr.1
            @Override // com.bytedance.sdk.component.ri.ik.lr
            public com.bytedance.sdk.component.ri.ik ri() {
                return new bgr(dzyVar, wjvVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.ri.ik
    public void ri(JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        dzy dzyVar = this.ri.get();
        if (dzyVar != null && jSONObject != null) {
            dzyVar.ri(new com.bytedance.sdk.openadsdk.aw.lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.bgr.2
                @Override // com.bytedance.sdk.openadsdk.aw.lr
                public void ri(int i) {
                    bgr.this.ka.add(Integer.valueOf(i));
                    if (bgr.this.ka.size() >= bgr.this.ik) {
                        try {
                            bgr.this.ri(new JSONObject());
                            bgr.this.ka.clear();
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                }
            });
            int iOptInt = jSONObject.optInt("delay", -1);
            if (iOptInt < 0) {
                return;
            }
            this.ik = iOptInt / 1000;
            return;
        }
        ik();
    }
}
