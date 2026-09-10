package com.p004ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p004ironsource.a3;
import com.p004ironsource.a5;
import com.p004ironsource.c5;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.ib;
import com.p004ironsource.ii;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.e;
import com.p004ironsource.mediationsdk.i;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.nb;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.wj;
import com.p004ironsource.zb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d extends m implements BannerSmashListener, a5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ib f25818n;
    private ib o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f25819p;
    private String q;
    private c5 r;
    private e s;
    private ISDemandOnlyBannerLayout t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ii f25820u;
    private final ii.a v;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f25821a;

        public a(i iVar) {
            this.f25821a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f25821a.getWaterfallString());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f25821a.getWaterfallString()}});
            d.this.s.a(ContextProvider.getInstance().getApplicationContext(), this.f25821a, d.this);
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j, AbstractAdapter abstractAdapter, e eVar) {
        super(new a3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f25820u = on.U().k();
        this.v = on.O().e();
        this.f = j;
        this.f25819p = str;
        this.q = str2;
        this.r = new c5();
        this.f25860a.initBannerForBidding(str, str2, this.f25862c, this);
        this.s = eVar;
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
                this.o = new ib();
                this.f25860a.initBannerForBidding(this.f25819p, this.q, this.f25862c, this);
                this.f25860a.loadBannerForDemandOnlyForBidding(this.f25862c, str, this.t, this);
            }
        }
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.g = null;
        this.f25864h = null;
        this.r = new c5();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            if (t()) {
                map.put("reason", "banner is destroyed");
            } else {
                l.a(map, this.t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f25860a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f25860a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f25861b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f25861b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.f25861b.d()));
            if (!TextUtils.isEmpty(this.g)) {
                map.put("auctionId", this.g);
            }
            JSONObject jSONObject = this.f25864h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f25864h);
            }
            if (!TextUtils.isEmpty(this.j)) {
                map.put("dynamicDemandSource", this.j);
                return map;
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("Instance: " + h() + " " + e2.getMessage());
        }
        return map;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().a(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(com.p004ironsource.mediationsdk.demandOnly.b.C0288b.INSTANCE_LEAVE_APP, (Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().b(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(ib.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        ii iiVar = this.f25820u;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        int iA = iiVar.a(ad_unit);
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(ib.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{"duration", Long.valueOf(ib.a(this.f25818n))}});
            this.v.b(ad_unit);
            a(this.r.c(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().c(l());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.r.a(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().d(l());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    public i q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        i iVar = new i(IronSource.AD_UNIT.BANNER);
        iVar.a(arrayList);
        iVar.d(str);
        iVar.c(l());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.a(this.t.getSize());
        return iVar;
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
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.t = null;
        AbstractAdapter abstractAdapter = this.f25860a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f25862c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.f25861b.h().isMultipleInstances() ? this.f25861b.h().getProviderTypeForReflection() : this.f25861b.h().getProviderName();
    }

    @Override // com.p004ironsource.r4
    public void a(int i2, String str, int i3, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i2 + " - " + str);
        this.g = null;
        this.f25864h = null;
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapJ.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
        wj.i().a(new zb(i2, new JSONObject(mapJ)));
    }

    @Override // com.p004ironsource.a5
    public void a(com.ironsource.mediationsdk.d.a aVar, int i2, long j, int i3, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.f25864h = aVar.f();
        com.p004ironsource.mediationsdk.demandOnly.a.C0287a c0287a = new com.p004ironsource.mediationsdk.demandOnly.a.C0287a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i3)}, new Object[]{"reason", str}});
        }
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0287a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0287a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(com.p004ironsource.mediationsdk.demandOnly.b.C0288b.INSTANCE_LOAD_NO_FILL, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            m5 m5Var = c0287a.get(0);
            this.r.a(m5Var.b());
            this.r.c(m5Var.h());
            this.r.b(m5Var.g());
            String strK = m5Var.k();
            b(strK);
            c(strK);
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            } else {
                String str = "banner layout in blocking state | state: " + k();
                iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
                a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", str}});
                return;
            }
        }
        v();
        a(3002, (Object[][]) null);
        if (!o()) {
            ironLog.verbose("can't load banner when isOneFlow = false");
            a(new IronSourceError(1063, "Missing configuration settings"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        this.f25818n = new ib();
        w();
        if (this.s.a()) {
            u();
        } else {
            ironLog.verbose("can't load the banner the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            } else {
                String str = "banner layout in blocking state | state: " + k();
                iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
                a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new Object[][]{new Object[]{"reason", str}});
                return;
            }
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar2 = (com.ironsource.mediationsdk.d.a) oVar.a(new nb());
            m5 m5VarA = new com.p004ironsource.mediationsdk.demandOnly.a.C0287a(aVar2.h()).a(h());
            if (m5VarA == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
            } else {
                String strK = m5VarA.k();
                if (strK != null) {
                    b(strK);
                    a(aVar2.a());
                    a(aVar2.f());
                    a(83302, (Object[][]) null);
                    this.r.a(m5VarA.b());
                    this.f25818n = new ib();
                    w();
                    this.f25860a.initBannerForBidding(this.f25819p, this.q, this.f25862c, this);
                    this.f25860a.loadBannerForDemandOnlyForBidding(this.f25862c, strK, iSDemandOnlyBannerLayout, this);
                    return;
                }
                ironLog.error("serverData is null");
                ironSourceError = new IronSourceError(618, "No available ad to load");
            }
            a(ironSourceError);
        } catch (Exception e2) {
            StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "loadBannerForBidder: Exception= ");
            sbO.append(e2.getMessage());
            a(ErrorBuilder.buildLoadFailedError(sbO.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, ib.a(this.f25818n));
            a(this.r.b(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            a(com.p004ironsource.mediationsdk.demandOnly.b.C0288b.INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            a(3300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.j, str);
    }

    @Override // com.p004ironsource.r4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }
}
