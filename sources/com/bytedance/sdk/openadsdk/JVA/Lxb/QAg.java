package com.bytedance.sdk.openadsdk.JVA.Lxb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.openadsdk.core.Ivz;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject> {
    private final Ivz Lxb;

    public QAg(Ivz ivz) {
        this.Lxb = ivz;
    }

    public static void Lxb(kqm kqmVar, Ivz ivz) {
        kqmVar.Lxb("overlayRenderFinish", new QAg(ivz));
    }

    @Override // com.bytedance.sdk.component.Lxb.JXs
    @Nullable
    public JSONObject Lxb(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        this.Lxb.sLN();
        return null;
    }
}
