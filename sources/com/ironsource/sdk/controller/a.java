package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C0395ie;
import com.ironsource.C0460m8;
import com.ironsource.C0474n4;
import com.ironsource.InterfaceC0371h8;
import com.ironsource.InterfaceC0480na;
import com.ironsource.Jg;
import com.ironsource.gh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements InterfaceC0371h8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30270d = "loadWithUrl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30271e = "sendMessage";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30272f = "removeAdView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f30273g = "webviewAction";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f30274h = "handleGetViewVisibility";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30275i = "functionName";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30276j = "functionParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30277k = "success";
    private static final String l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f30278m = "errMsg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f30279n = "%s | unsupported AdViews API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gh f30280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0460m8 f30281b = C0460m8.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f30282c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f30284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f30286d;

        public /* synthetic */ C0082a(int i10) {
            this();
        }

        private C0082a() {
        }
    }

    public a(Context context) {
        this.f30282c = context;
    }

    public void a(gh ghVar) {
        this.f30280a = ghVar;
    }

    @Override // com.ironsource.InterfaceC0371h8
    public void a(String str, JSONObject jSONObject) {
        if (this.f30280a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f30280a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC0371h8
    public void a(String str, String str2, String str3) {
        a(str, Jg.a(str2, str3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(String str, InterfaceC0480na interfaceC0480na) throws Exception {
        a aVar;
        C0082a c0082aA = a(str);
        C0395ie c0395ie = new C0395ie();
        try {
            String str2 = c0082aA.f30283a;
            try {
                switch (str2.hashCode()) {
                    case -1384357108:
                        aVar = this;
                        if (str2.equals(f30272f)) {
                            aVar.f30281b.c(c0082aA.f30284b, c0082aA.f30285c, c0082aA.f30286d);
                            return;
                        }
                        try {
                            try {
                                throw new IllegalArgumentException(c0082aA.f30283a + " | unsupported AdViews API");
                            } catch (Exception e10) {
                                e = e10;
                                C0474n4.d().a(e);
                                c0395ie.b("errMsg", e.getMessage());
                                String strC = aVar.f30281b.c(c0082aA.f30284b);
                                if (!TextUtils.isEmpty(strC)) {
                                    c0395ie.b("adViewId", strC);
                                }
                                interfaceC0480na.a(false, c0082aA.f30286d, c0395ie);
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        break;
                    case 691453791:
                        aVar = this;
                        if (str2.equals("sendMessage")) {
                            aVar.f30281b.d(c0082aA.f30284b, c0082aA.f30285c, c0082aA.f30286d);
                            return;
                        }
                        throw new IllegalArgumentException(c0082aA.f30283a + " | unsupported AdViews API");
                    case 842351363:
                        if (str2.equals("loadWithUrl")) {
                            this.f30281b.a(this, c0082aA.f30284b, this.f30282c, c0082aA.f30285c, c0082aA.f30286d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(c0082aA.f30283a + " | unsupported AdViews API");
                    case 1182065477:
                        if (str2.equals("handleGetViewVisibility")) {
                            this.f30281b.a(c0082aA.f30284b, c0082aA.f30285c, c0082aA.f30286d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(c0082aA.f30283a + " | unsupported AdViews API");
                    case 1491535759:
                        if (str2.equals(f30273g)) {
                            this.f30281b.b(c0082aA.f30284b, c0082aA.f30285c, c0082aA.f30286d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(c0082aA.f30283a + " | unsupported AdViews API");
                    default:
                        aVar = this;
                        throw new IllegalArgumentException(c0082aA.f30283a + " | unsupported AdViews API");
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            aVar = this;
        }
    }

    private C0082a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C0082a c0082a = new C0082a(0);
        c0082a.f30283a = jSONObject.optString("functionName");
        c0082a.f30284b = jSONObject.optJSONObject("functionParams");
        c0082a.f30285c = jSONObject.optString("success");
        c0082a.f30286d = jSONObject.optString("fail");
        return c0082a;
    }
}
