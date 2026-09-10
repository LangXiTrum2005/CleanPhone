package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co extends com.bytedance.sdk.component.ri.nr<JSONObject, JSONObject> {
    private static final HashSet<String> ri = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));
    private final dzy lr;

    public co(dzy dzyVar) {
        this.lr = dzyVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri(ri, new co(dzyVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.lr.slm();
                return null;
            case "popupShow":
                this.lr.vr();
                return null;
            case "getCurrentCountdownStatus":
                return this.lr.bu();
            case "popupRenderDidFinish":
                this.lr.nr();
                return null;
            case "changeCountdownStatus":
                this.lr.sf(jSONObject);
                return null;
            default:
                return null;
        }
    }
}
