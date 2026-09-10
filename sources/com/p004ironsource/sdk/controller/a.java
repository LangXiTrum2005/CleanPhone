package com.p004ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.eh;
import com.p004ironsource.ex;
import com.p004ironsource.is;
import com.p004ironsource.jh;
import com.p004ironsource.q9;
import com.p004ironsource.tx;
import com.p004ironsource.yk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a implements eh {
    private static final String d = "loadWithUrl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26833e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f26834h = "handleGetViewVisibility";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f26835i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f26836l = "fail";
    public static final String m = "errMsg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f26837n = "%s | unsupported AdViews API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tx f26838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jh f26839b = jh.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26840c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f26841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f26842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f26843c;
        String d;

        private b() {
        }
    }

    public a(Context context) {
        this.f26840c = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f26841a = jSONObject.optString("functionName");
        bVar.f26842b = jSONObject.optJSONObject("functionParams");
        bVar.f26843c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    public void a(tx txVar) {
        this.f26838a = txVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, yk ykVar) throws Exception {
        a aVar;
        byte b2;
        b bVarA = a(str);
        is isVar = new is();
        try {
            String str2 = bVarA.f26841a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (!str2.equals(f)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 691453791:
                    if (!str2.equals("sendMessage")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 842351363:
                    if (!str2.equals("loadWithUrl")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1182065477:
                    if (!str2.equals("handleGetViewVisibility")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1491535759:
                    if (!str2.equals(g)) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                aVar = this;
                try {
                    this.f26839b.a(aVar, bVarA.f26842b, this.f26840c, bVarA.f26843c, bVarA.d);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    q9.d().a(e);
                    isVar.b("errMsg", e.getMessage());
                    String strC = aVar.f26839b.c(bVarA.f26842b);
                    if (!TextUtils.isEmpty(strC)) {
                        isVar.b("adViewId", strC);
                    }
                    ykVar.a(false, bVarA.d, isVar);
                    return;
                }
            }
            if (b2 == 1) {
                this.f26839b.d(bVarA.f26842b, bVarA.f26843c, bVarA.d);
                return;
            }
            if (b2 == 2) {
                this.f26839b.c(bVarA.f26842b, bVarA.f26843c, bVarA.d);
                return;
            }
            if (b2 == 3) {
                this.f26839b.a(bVarA.f26842b, bVarA.f26843c, bVarA.d);
                return;
            }
            if (b2 == 4) {
                this.f26839b.b(bVarA.f26842b, bVarA.f26843c, bVarA.d);
                return;
            }
            throw new IllegalArgumentException(bVarA.f26841a + " | unsupported AdViews API");
        } catch (Exception e3) {
            e = e3;
            aVar = this;
        }
    }

    @Override // com.p004ironsource.eh
    public void a(String str, String str2, String str3) {
        a(str, ex.a(str2, str3));
    }

    @Override // com.p004ironsource.eh
    public void a(String str, JSONObject jSONObject) {
        if (this.f26838a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f26838a.a(str, jSONObject);
    }
}
