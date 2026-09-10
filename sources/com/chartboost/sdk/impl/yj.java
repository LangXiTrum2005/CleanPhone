package com.chartboost.sdk.impl;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yj {

    public interface a {
        void a(JSONObject jSONObject);
    }

    public final void a(String str, a aVar) {
        if (a(str)) {
            za.b("CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource", (Throwable) null, 2, (Object) null);
            if (aVar != null) {
                aVar.a(new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"));
            }
        }
    }

    public final boolean a(String str) {
        return (str == null || !StringsKt.l(str, "Access-Control-Allow-Origin", false) || !StringsKt.l(str, "'null'", false) || StringsKt.l(str, "http://", false) || StringsKt.l(str, "https://", false)) ? false : true;
    }
}
