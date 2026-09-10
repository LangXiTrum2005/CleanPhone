package com.p004ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.a3;
import com.p004ironsource.a5;
import com.p004ironsource.ac;
import com.p004ironsource.c5;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.f5;
import com.p004ironsource.ib;
import com.p004ironsource.ii;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.e;
import com.p004ironsource.mediationsdk.i;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.nb;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.wj;
import com.p004ironsource.zb;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g extends m implements n.a, InterstitialSmashListener, a5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ib f25833n;
    private ib o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ISDemandOnlyInterstitialListener f25834p;
    private c5 q;
    private e r;
    private p s;
    private final ii t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ii.a f25835u;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j, AbstractAdapter abstractAdapter, e eVar) {
        super(new a3(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.s = new p.b();
        this.t = on.U().k();
        this.f25835u = on.O().e();
        this.f25834p = iSDemandOnlyInterstitialListener;
        this.f = j;
        this.r = eVar;
        this.f25860a.initInterstitial(str, str2, this.f25862c, this);
    }

    private i q() {
        String str = i() + h();
        i iVar = new i(this.m);
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.t.a(this.m));
        f5 f5Var = new f5(h(), false);
        f5Var.a(this.s.getPlumbus());
        Map<String, Object> interstitialBiddingData = this.f25860a.getInterstitialBiddingData(this.f25862c, new JSONObject());
        if (interstitialBiddingData != null) {
            f5Var.b(interstitialBiddingData);
        }
        iVar.a(f5Var);
        return iVar;
    }

    private void r() {
        this.o = new ib();
        this.f25860a.loadInterstitial(this.f25862c, null, this);
    }

    private void s() {
        if (!this.r.a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        i iVarQ = q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + iVarQ.getWaterfallString());
        a(ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, iVarQ.getWaterfallString()}});
        this.r.a(ContextProvider.getInstance().getApplicationContext(), iVarQ, this);
    }

    private void t() {
        this.g = null;
        this.f25864h = null;
        this.j = null;
        this.q = new c5();
    }

    private void u() {
        this.f25833n = new ib();
        a(new b());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(ac.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.p004ironsource.r4
    public void a(int i2, String str, int i3, String str2, long j) {
        IronLog.INTERNAL.verbose("error " + i2 + " - " + str);
        this.g = null;
        this.f25864h = null;
        a(ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(e.a.ERROR_INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(ac.IS_INSTANCE_SHOW, (Object[][]) null);
        m.a aVar = m.a.LOADED;
        m.a aVar2 = m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f25860a.showInterstitial(this.f25862c, this);
            return;
        }
        if (a(aVar2)) {
            ironSourceError = new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing");
        } else {
            ironSourceError = a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show");
        }
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void c() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.f25834p.onInterstitialAdLoadFailed(l(), new IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(ac.IS_INSTANCE_LOAD, (Object[][]) null);
        u();
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.IS_INSTANCE_CLICKED, new Object[0][]);
        this.f25834p.onInterstitialAdClicked(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.t.a(this.m))}});
        this.f25835u.b(this.m);
        this.f25834p.onInterstitialAdClosed(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(ib.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.IS_INSTANCE_OPENED, new Object[0][]);
        a(this.q.a(), IronSourceUtils.getCurrentMethodName());
        this.f25834p.onInterstitialAdOpened(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(ac.IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.f25833n))}});
            a(this.q.c(), IronSourceUtils.getCurrentMethodName());
            this.f25834p.onInterstitialAdReady(l());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(ac.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f25834p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    private void a(ac acVar, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapJ.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e2));
            }
        }
        wj.i().a(new zb(acVar, new JSONObject(mapJ)));
    }

    private void c(o oVar) {
        IronSourceError ironSourceError;
        this.f25833n = new ib();
        a(new a());
        if (!n()) {
            a(new IronSourceError(e.a.INSTANCE_LOAD_ERROR, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new nb());
            m5 m5VarA = new com.p004ironsource.mediationsdk.demandOnly.a.C0287a(aVar.h()).a(h());
            if (m5VarA == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(ac.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            } else {
                String strK = m5VarA.k();
                if (strK != null) {
                    b(strK);
                    a(aVar.a());
                    a(aVar.f());
                    a(ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                    this.q.a(m5VarA.b());
                    this.o = new ib();
                    this.f25860a.loadInterstitialForBidding(this.f25862c, null, strK, this);
                    return;
                }
                IronLog.INTERNAL.error("serverData is null");
                ironSourceError = new IronSourceError(e.a.ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load");
            }
            a(ironSourceError);
        } catch (Exception e2) {
            StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "loadInterstitialWithAdm: Exception= ");
            sbO.append(e2.getMessage());
            a(ErrorBuilder.buildLoadFailedError(sbO.toString()));
        }
    }

    @Override // com.p004ironsource.a5
    public void a(d.a aVar, int i2, long j, int i3, String str) {
        String strK;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.f25864h = aVar.f();
        this.s = aVar.a(l());
        com.p004ironsource.mediationsdk.demandOnly.a.C0287a c0287a = new com.p004ironsource.mediationsdk.demandOnly.a.C0287a(aVar.h());
        if (c0287a.isEmpty()) {
            strK = "";
        } else {
            m5 m5Var = c0287a.get(0);
            this.q.a(m5Var.b());
            this.q.c(m5Var.h());
            this.q.b(m5Var.g());
            strK = m5Var.k();
            b(strK);
        }
        if (!TextUtils.isEmpty(str)) {
            a(ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i3)}, new Object[]{"reason", str}});
        }
        a(ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        a(ac.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0287a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (!c0287a.isEmpty()) {
                c(strK);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
            ironLog.error("interstitial - empty waterfall");
            a(ironSourceError);
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
        a(ac.IS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, ib.a(this.f25833n));
            a(this.q.b(), IronSourceUtils.getCurrentMethodName());
            this.f25834p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(ac.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(ac.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.j, str);
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(e.a.ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load"));
            } else {
                a(ac.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f25860a.loadInterstitialForBidding(this.f25862c, null, str, this);
            }
        }
    }

    @Override // com.p004ironsource.r4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        boolean zIsInterstitialReady = false;
        if (!a(m.a.LOADED)) {
            a(ac.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsInterstitialReady = this.f25860a.isInterstitialReady(this.f25862c);
            a(zIsInterstitialReady ? ac.IS_INSTANCE_READY_TRUE : ac.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsInterstitialReady;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("exception=" + e2.getMessage());
            return zIsInterstitialReady;
        }
    }
}
