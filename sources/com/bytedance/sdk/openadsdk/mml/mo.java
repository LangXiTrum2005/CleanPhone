package com.bytedance.sdk.openadsdk.mml;

import com.smartdigimkt.n8.g;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo extends qdl {
    public static final SimpleDateFormat lnr = new SimpleDateFormat(g.f37185a, Locale.US);

    public mo(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.mml.qdl
    public JSONObject lnr() {
        return this.ud;
    }
}
