package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h6 extends k5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f8073o = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f8074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f8075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f8076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0010a f8077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f8078k;
    private final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f8079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f8080n;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends k5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f8081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f8082h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final a3 f8083i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f8084j;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a extends k3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f8086b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f8087c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0010a);
                this.f8086b = maxAdFormat;
                this.f8087c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8081g;
                com.applovin.impl.sdk.p unused = b.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVar = b.this.f8299c;
                    String str2 = b.this.f8298b;
                    StringBuilder sbL = wi.d.l(jElapsedRealtime, "Ad failed to load in ", " ms for ");
                    sbL.append(this.f8086b.getLabel());
                    sbL.append(" ad unit ");
                    sbL.append(str);
                    sbL.append(" with error: ");
                    sbL.append(maxError);
                    pVar.a(str2, sbL.toString());
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f8083i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f8082h >= b.this.f8084j.size() - 1) {
                    h6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f8297a.s0().a((k5) new b(bVar2.f8082h + 1, b.this.f8084j), f6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8081g;
                com.applovin.impl.sdk.p unused = b.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVar = b.this.f8299c;
                    String str = b.this.f8298b;
                    StringBuilder sbL = wi.d.l(jElapsedRealtime, "Ad loaded in ", "ms for ");
                    sbL.append(this.f8086b.getLabel());
                    sbL.append(" ad unit ");
                    defpackage.e.C(sbL, this.f8087c, pVar, str);
                }
                a3 a3Var = (a3) maxAd;
                b.this.a(a3Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f8082h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f8084j.size()) {
                        h6.this.b(a3Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((a3) bVar.f8084j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = h6.this.f8074g.b();
            MaxAdFormat maxAdFormatA = h6.this.f8074g.a();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f8299c;
                String str = this.f8298b;
                StringBuilder sb2 = new StringBuilder("Loading ad ");
                sb2.append(this.f8082h + 1);
                sb2.append(" of ");
                sb2.append(this.f8084j.size());
                sb2.append(" from ");
                sb2.append(this.f8083i.c());
                sb2.append(" for ");
                sb2.append(maxAdFormatA.getLabel());
                sb2.append(" ad unit ");
                defpackage.e.C(sb2, strB, pVar, str);
            }
            b("started to load ad");
            Context context = (Context) h6.this.f8078k.get();
            Activity activityW0 = context instanceof Activity ? (Activity) context : this.f8297a.w0();
            this.f8297a.c0().b(this.f8083i);
            this.f8297a.Z().loadThirdPartyMediatedAd(strB, this.f8083i, activityW0, new a(h6.this.f8077j, maxAdFormatA, strB));
        }

        private b(int i10, List list) {
            super(h6.this.f8298b, h6.this.f8297a, h6.this.f8074g.b());
            this.f8081g = SystemClock.elapsedRealtime();
            this.f8082h = i10;
            this.f8083i = (a3) list.get(i10);
            this.f8084j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a3 a3Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            h6.this.f8080n.add(new MaxNetworkResponseInfoImpl(adLoadState, y3.a(a3Var.b()), a3Var.F(), a3Var.Z(), j10, a3Var.C(), maxError));
        }
    }

    public h6(c3 c3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.l lVar, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        super("TaskProcessMediationWaterfall", lVar, c3Var.b());
        this.f8074g = c3Var;
        this.f8075h = jSONObject;
        this.f8077j = interfaceC0010a;
        this.f8078k = new WeakReference(context);
        this.l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArrayX = defpackage.e.x(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONObject);
        this.f8076i = new ArrayList(jSONArrayX.length());
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            this.f8076i.add(a3.a(c3Var, JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null), jSONObject, lVar));
        }
        this.f8080n = new ArrayList(this.f8076i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f8079m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f8075h.optBoolean("is_testing", false) && !this.f8297a.u0().c() && f8073o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new u9(this, 9));
        }
        String strB = this.f8074g.b();
        MaxAdFormat maxAdFormatA = this.f8074g.a();
        if (this.f8076i.size() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f8076i.size() + " ad(s)...");
            }
            this.f8297a.s0().a(new b(i10, this.f8076i));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.k(this.f8298b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        q7.a(strB, maxAdFormatA, this.f8075h, this.f8297a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8075h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (y3.a(this.f8075h, strB, this.f8297a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, defpackage.e.o("Ad Unit ID ", strB, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (q7.c(this.f8297a) && ((Boolean) this.f8297a.a(z4.E6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        x8 x8Var = new x8(6, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            i0.a(millis, this.f8297a, x8Var);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(x8Var, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a3 a3Var) {
        this.f8297a.c0().c(a3Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8079m;
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVar = this.f8299c;
            String str = this.f8298b;
            StringBuilder sbL = wi.d.l(jElapsedRealtime, "Waterfall loaded in ", "ms from ");
            sbL.append(a3Var.c());
            sbL.append(" for ");
            sbL.append(this.f8074g.a().getLabel());
            sbL.append(" ad unit ");
            sbL.append(this.f8074g.b());
            pVar.d(str, sbL.toString());
        }
        a3Var.a(new MaxAdWaterfallInfoImpl(a3Var, jElapsedRealtime, this.f8080n, this.l));
        v2.f(this.f8077j, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        q7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f8297a.w0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f8080n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f8080n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.f8074g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8079m;
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVar = this.f8299c;
            String str = this.f8298b;
            StringBuilder sbL = wi.d.l(jElapsedRealtime, "Waterfall failed in ", "ms for ");
            sbL.append(this.f8074g.a().getLabel());
            sbL.append(" ad unit ");
            sbL.append(strB);
            sbL.append(" with error: ");
            sbL.append(maxError);
            pVar.d(str, sbL.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f8075h, "waterfall_name", ""), JsonUtils.getString(this.f8075h, "waterfall_test_name", ""), jElapsedRealtime, this.f8080n, this.f8074g, JsonUtils.optList(JsonUtils.getJSONArray(this.f8075h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.l, JsonUtils.getString(this.f8075h, "event_id", "")));
        v2.a(this.f8077j, strB, maxError);
    }
}
