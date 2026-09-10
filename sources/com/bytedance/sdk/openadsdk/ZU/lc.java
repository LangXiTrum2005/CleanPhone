package com.bytedance.sdk.openadsdk.ZU;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends Lxb {
    public static final SimpleDateFormat lk = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public lc(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.Lxb
    public JSONObject lk() {
        return this.LD;
    }
}
