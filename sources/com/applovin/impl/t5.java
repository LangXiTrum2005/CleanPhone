package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C0375hc;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final u f9799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9800h;

    public t5(u uVar, String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
        this.f9799g = uVar;
        this.f9800h = lVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f9799g.e());
        if (this.f9799g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f9799g.f().getLabel());
        }
        if (this.f9799g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f9799g.g().getLabel());
        }
        return map;
    }

    public abstract k5 a(JSONObject jSONObject);

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Unable to fetch " + this.f9799g + " ad: server returned " + i10);
        }
        this.f8297a.g().a(f2.A, this.f9799g, new AppLovinError(i10, str));
    }

    public void b(JSONObject jSONObject) {
        s0.c(jSONObject, this.f8297a);
        s0.b(jSONObject, this.f8297a);
        s0.a(jSONObject, this.f8297a);
        u.a(jSONObject);
        this.f8297a.s0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f9799g.e());
        if (this.f9799g.f() != null) {
            map.put("size", this.f9799g.f().getLabel());
        }
        if (this.f9799g.g() != null) {
            map.put("require", this.f9799g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        w4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Fetching next ad of zone: " + this.f9799g);
        }
        if (((Boolean) this.f8297a.a(z4.Z3)).booleanValue() && q7.k() && com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "User is connected to a VPN");
        }
        q7.a(this.f8297a, this.f8298b);
        this.f8297a.g().a(f2.f7889y, this.f9799g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f8297a.l().getAndResetCustomPostBody();
            boolean zBooleanValue = ((Boolean) this.f8297a.a(z4.f10202m3)).booleanValue();
            String str = C0375hc.f28789b;
            if (zBooleanValue) {
                aVarA = w4.a.a(((Integer) this.f8297a.a(z4.f10284x5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f8297a.B().a(h(), false, true));
                HashMap map2 = new HashMap();
                if (!((Boolean) this.f8297a.a(z4.I5)).booleanValue() && !((Boolean) this.f8297a.a(z4.E5)).booleanValue()) {
                    map2.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f8297a.a(z4.f10227p5)).booleanValue()) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8297a.k0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = map2;
            } else {
                w4.a aVarA2 = w4.a.a(((Integer) this.f8297a.a(z4.f10292y5)).intValue());
                Map mapA = q7.a(this.f8297a.B().a(h(), false, false));
                if (!((Boolean) this.f8297a.a(z4.Q6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = C0375hc.f28788a;
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (q7.h(a()) || q7.j(a())) {
                map.putAll(this.f8297a.l().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f9800h)) {
                map.put("sts", this.f9800h);
            }
            com.applovin.impl.sdk.network.a.C0018a c0018aF = com.applovin.impl.sdk.network.a.a(this.f8297a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f8297a.a(z4.f10109b3)).intValue()).c(((Boolean) this.f8297a.a(z4.f10118c3)).booleanValue()).d(((Boolean) this.f8297a.a(z4.f10125d3)).booleanValue()).c(((Integer) this.f8297a.a(z4.f10101a3)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0018aF.a(andResetCustomPostBody);
                c0018aF.b(((Boolean) this.f8297a.a(z4.T5)).booleanValue());
            }
            a aVar = new a(c0018aF.a(), this.f8297a);
            aVar.c(z4.f10190l0);
            aVar.b(z4.f10199m0);
            this.f8297a.s0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Unable to fetch ad for zone id: " + this.f9799g, th2);
            }
            a(0, th2.getMessage());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f8907m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f8907m.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
                CollectionUtils.putStringIfValid("ad_zone_id", t5.this.f9799g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f8907m.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f8907m.b()), map);
                this.f8297a.g().d(f2.f7891z, map);
                t5.this.b(jSONObject);
                return;
            }
            t5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            t5.this.a(i10, str2);
            this.f8297a.E().a("fetchAd", str, i10, str2);
        }
    }
}
