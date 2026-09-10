package com.bytedance.sdk.openadsdk.ka;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ri {
    public static final SimpleDateFormat ik = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public di(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.ka.ri
    public JSONObject ik() {
        return this.lr;
    }
}
