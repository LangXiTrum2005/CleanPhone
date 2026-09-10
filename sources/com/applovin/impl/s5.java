package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class s5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f9239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f9240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f6.b f9241i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            s5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (s5.this.f9240h != null) {
                s5.this.f9240h.onPostbackSuccess(s5.this.f9239g.f());
            }
        }
    }

    public s5(com.applovin.impl.sdk.network.e eVar, f6.b bVar, com.applovin.impl.sdk.l lVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", lVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f9239g = eVar;
        this.f9240h = appLovinPostbackListener;
        this.f9241i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f9239g, b());
        bVar.a(this.f9241i);
        b().s0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f9239g.f())) {
            if (this.f9239g.u()) {
                b().z0().a(this.f9239g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.d(this.f8298b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f9240h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f9239g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends o6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f9243n;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
            this.f9243n = s5.this.f9239g.f();
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f8297a.c(z4.f10164i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                s0.c(jSONObject, this.f8297a);
                                s0.b(jSONObject, this.f8297a);
                                s0.a(jSONObject, this.f8297a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (s5.this.f9240h != null) {
                s5.this.f9240h.onPostbackSuccess(this.f9243n);
            }
            if (s5.this.f9239g.t()) {
                this.f8297a.u().a(s5.this.f9239g.s(), this.f9243n, i10, obj, null, true);
            }
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f8299c;
                String str3 = this.f8298b;
                StringBuilder sbU = defpackage.e.u(i10, "Failed to dispatch postback. Error code: ", " URL: ");
                sbU.append(this.f9243n);
                pVar.b(str3, sbU.toString());
            }
            if (s5.this.f9240h != null) {
                s5.this.f9240h.onPostbackFailure(this.f9243n, i10);
            }
            if (s5.this.f9239g.t()) {
                this.f8297a.u().a(s5.this.f9239g.s(), this.f9243n, i10, obj, str2, false);
            }
        }
    }
}
