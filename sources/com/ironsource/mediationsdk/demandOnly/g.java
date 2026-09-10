package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C0310e1;
import com.ironsource.C0347g2;
import com.ironsource.C0350g5;
import com.ironsource.C0400j2;
import com.ironsource.C0439l5;
import com.ironsource.C0474n4;
import com.ironsource.C0526q2;
import com.ironsource.C0654x5;
import com.ironsource.EnumC0672y5;
import com.ironsource.G9;
import com.ironsource.InterfaceC0311e2;
import com.ironsource.Kb;
import com.ironsource.M8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends m implements n.a, InterstitialSmashListener, InterfaceC0311e2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0350g5 f29438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0350g5 f29439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ISDemandOnlyInterstitialListener f29440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C0347g2 f29441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f29442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p f29443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final M8 f29444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final M8.a f29445u;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C0310e1(networkSettings, networkSettings.getInterstitialSettings(), IronSource.a.INTERSTITIAL), abstractAdapter);
        this.f29443s = new p.b();
        this.f29444t = Kb.Y().s();
        this.f29445u = Kb.Q().i();
        this.f29440p = iSDemandOnlyInterstitialListener;
        this.f29490f = j10;
        this.f29442r = eVar;
        this.f29485a.initInterstitial(str, str2, this.f29487c, this);
    }

    private void c(o oVar) {
        this.f29438n = new C0350g5();
        a(new a());
        if (!n()) {
            a(new IronSourceError(e.a.f29434k, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar = (com.ironsource.mediationsdk.d.a) oVar.a(new C0439l5());
            C0526q2 c0526q2A = new com.ironsource.mediationsdk.demandOnly.a.C0080a(aVar.h()).a(h());
            if (c0526q2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(EnumC0672y5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strK = c0526q2A.k();
            if (strK == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(e.a.f29432i, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f29441q.a(c0526q2A.b());
            this.f29439o = new C0350g5();
            this.f29485a.loadInterstitialForBidding(this.f29487c, null, strK, this);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e10.getMessage()));
        }
    }

    private com.ironsource.mediationsdk.h q() {
        String str = i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.f29496m);
        hVar.b(IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.e(str);
        hVar.c(l());
        hVar.a(this.f29444t.a(this.f29496m));
        C0400j2 c0400j2 = new C0400j2(h(), false);
        c0400j2.a(this.f29443s.value());
        Map<String, Object> interstitialBiddingData = this.f29485a.getInterstitialBiddingData(this.f29487c, new JSONObject());
        if (interstitialBiddingData != null) {
            c0400j2.b(interstitialBiddingData);
        }
        hVar.a(c0400j2);
        return hVar;
    }

    private void r() {
        this.f29439o = new C0350g5();
        this.f29485a.loadInterstitial(this.f29487c, null, this);
    }

    private void s() {
        if (!this.f29442r.a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.h hVarQ = q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + hVarQ.s());
        a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, hVarQ.s()}});
        this.f29442r.a(ContextProvider.getInstance().getApplicationContext(), hVarQ, this);
    }

    private void t() {
        this.f29491g = null;
        this.f29492h = null;
        this.f29494j = null;
        this.f29441q = new C0347g2();
    }

    private void u() {
        this.f29438n = new C0350g5();
        a(new b());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(EnumC0672y5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(EnumC0672y5.IS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.f29440p.onInterstitialAdLoadFailed(l(), new IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(EnumC0672y5.IS_INSTANCE_LOAD, (Object[][]) null);
        u();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void e() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(EnumC0672y5.IS_INSTANCE_SHOW, (Object[][]) null);
        m.a aVar = m.a.LOADED;
        m.a aVar2 = m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f29485a.showInterstitial(this.f29487c, this);
            return;
        }
        if (a(aVar2)) {
            ironSourceError = new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing");
        } else {
            ironSourceError = a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show");
        }
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.IS_INSTANCE_CLICKED, new Object[0][]);
        this.f29440p.onInterstitialAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f29444t.a(this.f29496m))}});
        this.f29445u.b(this.f29496m);
        this.f29440p.onInterstitialAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29439o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.IS_INSTANCE_OPENED, new Object[0][]);
        a(this.f29441q.a(), IronSourceUtils.a());
        this.f29440p.onInterstitialAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29439o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(EnumC0672y5.IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29438n))}});
            a(this.f29441q.c(), IronSourceUtils.a());
            this.f29440p.onInterstitialAdReady(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(EnumC0672y5.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f29440p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        EnumC0672y5 enumC0672y5;
        boolean zIsInterstitialReady = false;
        if (!a(m.a.LOADED)) {
            a(EnumC0672y5.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsInterstitialReady = this.f29485a.isInterstitialReady(this.f29487c);
            if (zIsInterstitialReady) {
                enumC0672y5 = EnumC0672y5.IS_INSTANCE_READY_TRUE;
            } else {
                enumC0672y5 = EnumC0672y5.IS_INSTANCE_READY_FALSE;
            }
            a(enumC0672y5, (Object[][]) null);
            return zIsInterstitialReady;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception=" + e10.getMessage());
            return zIsInterstitialReady;
        }
    }

    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C0350g5.a(this.f29438n));
            a(this.f29441q.b(), IronSourceUtils.a());
            this.f29440p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    private void a(EnumC0672y5 enumC0672y5, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapJ.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e10));
            }
        }
        G9.i().a(new C0654x5(enumC0672y5, new JSONObject(mapJ)));
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(e.a.f29432i, "No available ad to load"));
            } else {
                a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f29485a.loadInterstitialForBidding(this.f29487c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(EnumC0672y5.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(EnumC0672y5.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f29494j, str);
    }

    @Override // com.ironsource.InterfaceC0311e2
    public void a(com.ironsource.mediationsdk.d.a aVar, int i10, long j10, int i11, String str) {
        String strK;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f29491g = aVar.a();
        this.f29492h = aVar.f();
        this.f29443s = aVar.a(l());
        com.ironsource.mediationsdk.demandOnly.a.C0080a c0080a = new com.ironsource.mediationsdk.demandOnly.a.C0080a(aVar.h());
        if (!c0080a.isEmpty()) {
            C0526q2 c0526q2 = c0080a.get(0);
            this.f29441q.a(c0526q2.b());
            this.f29441q.c(c0526q2.h());
            this.f29441q.b(c0526q2.g());
            strK = c0526q2.k();
            b(strK);
        } else {
            strK = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a(EnumC0672y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0080a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0080a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
                ironLog.error("interstitial - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(strK);
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C0526q2> list, String str, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.U1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("error " + i10 + " - " + str);
        this.f29491g = null;
        this.f29492h = null;
        a(EnumC0672y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(e.a.f29433j, "No available ad to load"));
        }
    }
}
