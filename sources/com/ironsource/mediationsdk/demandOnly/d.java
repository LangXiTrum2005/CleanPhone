package com.ironsource.mediationsdk.demandOnly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C0310e1;
import com.ironsource.C0347g2;
import com.ironsource.C0350g5;
import com.ironsource.C0439l5;
import com.ironsource.C0474n4;
import com.ironsource.C0526q2;
import com.ironsource.C0654x5;
import com.ironsource.G9;
import com.ironsource.InterfaceC0311e2;
import com.ironsource.Kb;
import com.ironsource.M8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends m implements BannerSmashListener, InterfaceC0311e2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0350g5 f29412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0350g5 f29413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C0347g2 f29416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f29417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ISDemandOnlyBannerLayout f29418t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final M8 f29419u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final M8.a f29420v;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.h f29421a;

        public a(com.ironsource.mediationsdk.h hVar) {
            this.f29421a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f29421a.s());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f29421a.s()}});
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            d dVar = d.this;
            dVar.f29417s.a(applicationContext, this.f29421a, dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C0310e1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f29419u = Kb.Y().s();
        this.f29420v = Kb.Q().i();
        this.f29490f = j10;
        this.f29414p = str;
        this.f29415q = str2;
        this.f29416r = new C0347g2();
        this.f29485a.initBannerForBidding(str, str2, this.f29487c, this);
        this.f29417s = eVar;
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f29418t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.f29491g = null;
        this.f29492h = null;
        this.f29416r = new C0347g2();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29403e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(com.ironsource.mediationsdk.demandOnly.b.c.f29403e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            } else {
                String str = "banner layout in blocking state | state: " + k();
                iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
                a(com.ironsource.mediationsdk.demandOnly.b.c.f29403e, new Object[][]{new Object[]{"reason", str}});
                return;
            }
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f29418t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar2 = (com.ironsource.mediationsdk.d.a) oVar.a(new C0439l5());
            C0526q2 c0526q2A = new com.ironsource.mediationsdk.demandOnly.a.C0080a(aVar2.h()).a(h());
            if (c0526q2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError2);
                return;
            }
            String strK = c0526q2A.k();
            if (strK == null) {
                ironLog.error("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (Object[][]) null);
            this.f29416r.a(c0526q2A.b());
            this.f29412n = new C0350g5();
            w();
            this.f29485a.initBannerForBidding(this.f29414p, this.f29415q, this.f29487c, this);
            this.f29485a.loadBannerForDemandOnlyForBidding(this.f29487c, strK, iSDemandOnlyBannerLayout, this);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            if (t()) {
                map.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.j.a(map, this.f29418t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f29485a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f29485a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f29486b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f29486b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.f29486b.d()));
            if (!TextUtils.isEmpty(this.f29491g)) {
                map.put("auctionId", this.f29491g);
            }
            JSONObject jSONObject = this.f29492h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f29492h);
            }
            if (!TextUtils.isEmpty(this.f29494j)) {
                map.put("dynamicDemandSource", this.f29494j);
            }
            return map;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("Instance: " + h() + " " + e10.getMessage());
            return map;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f29418t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(com.ironsource.mediationsdk.demandOnly.b.C0081b.f29396g, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f29418t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29413o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        M8 m10 = this.f29419u;
        IronSource.a aVar = IronSource.a.BANNER;
        int iA = m10.a(aVar);
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29402d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29413o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.f29418t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29412n))}});
            this.f29420v.b(aVar);
            a(this.f29416r.c(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f29418t.getListener().c(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.f29416r.a(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f29418t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    public com.ironsource.mediationsdk.h q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(IronSource.a.BANNER);
        hVar.a(arrayList);
        hVar.e(str);
        hVar.c(l());
        hVar.b(IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.a(this.f29418t.getSize());
        return hVar;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f29418t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.f29418t = null;
        AbstractAdapter abstractAdapter = this.f29485a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f29487c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.f29486b.h().isMultipleInstances() ? this.f29486b.h().getProviderTypeForReflection() : this.f29486b.h().getProviderName();
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (Object[][]) null);
                this.f29413o = new C0350g5();
                this.f29485a.initBannerForBidding(this.f29414p, this.f29415q, this.f29487c, this);
                this.f29485a.loadBannerForDemandOnlyForBidding(this.f29487c, str, this.f29418t, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29403e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA != aVar && aVarA != m.a.SHOW_IN_PROGRESS) {
            v();
            a(3002, (Object[][]) null);
            if (!o()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                a(new IronSourceError(1063, "Missing configuration settings"));
                return;
            }
            this.f29418t = iSDemandOnlyBannerLayout;
            this.f29412n = new C0350g5();
            w();
            if (this.f29417s.a()) {
                u();
                return;
            } else {
                ironLog.verbose("can't load the banner the auction isn't enabled");
                a(new IronSourceError(1063, "Missing server configuration"));
                return;
            }
        }
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29403e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
        } else {
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(com.ironsource.mediationsdk.demandOnly.b.c.f29403e, new Object[][]{new Object[]{"reason", str}});
        }
    }

    @Override // com.ironsource.U1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f29491g = null;
        this.f29492h = null;
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29405g, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C0526q2> list, String str, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, C0350g5.a(this.f29412n));
            a(this.f29416r.b(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f29418t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 606) {
            a(3306, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        } else {
            a(3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapJ.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        G9.i().a(new C0654x5(i10, new JSONObject(mapJ)));
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f29494j, str);
    }

    @Override // com.ironsource.InterfaceC0311e2
    public void a(com.ironsource.mediationsdk.d.a aVar, int i10, long j10, int i11, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f29491g = aVar.a();
        this.f29492h = aVar.f();
        com.ironsource.mediationsdk.demandOnly.a.C0080a c0080a = new com.ironsource.mediationsdk.demandOnly.a.C0080a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29406h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(com.ironsource.mediationsdk.demandOnly.b.c.f29408j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0080a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0080a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            C0526q2 c0526q2 = c0080a.get(0);
            this.f29416r.a(c0526q2.b());
            this.f29416r.c(c0526q2.h());
            this.f29416r.b(c0526q2.g());
            String strK = c0526q2.k();
            b(strK);
            c(strK);
        }
    }
}
