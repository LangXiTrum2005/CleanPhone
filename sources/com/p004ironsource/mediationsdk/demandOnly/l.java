package com.p004ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.a3;
import com.p004ironsource.a5;
import com.p004ironsource.ac;
import com.p004ironsource.c5;
import com.p004ironsource.ds;
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
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.nb;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.zb;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, a5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ib f25856n;
    private ib o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ISDemandOnlyRewardedVideoListener f25857p;
    private c5 q;
    private e r;
    private p s;
    private final ii t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ii.a f25858u;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    public l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, AbstractAdapter abstractAdapter, e eVar) {
        super(new a3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.s = new p.b();
        this.t = on.U().k();
        this.f25858u = on.O().e();
        this.f25857p = iSDemandOnlyRewardedVideoListener;
        this.f = j;
        this.r = eVar;
        this.f25860a.initRewardedVideoForDemandOnly(str, str2, this.f25862c, this);
    }

    private void c(o oVar) {
        IronSourceError ironSourceError;
        this.f25856n = new ib();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.LOAD_ERROR, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new nb());
            m5 m5VarA = new com.p004ironsource.mediationsdk.demandOnly.a.C0287a(aVar.h()).a(h());
            if (m5VarA == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(ac.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            } else {
                String strK = m5VarA.k();
                if (strK != null) {
                    b(strK);
                    a(aVar.a());
                    a(aVar.f());
                    a(ac.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                    this.q.a(m5VarA.b());
                    this.o = new ib();
                    this.f25860a.loadRewardedVideoForBidding(this.f25862c, null, strK, this);
                    return;
                }
                IronLog.INTERNAL.error("serverData is null");
                ironSourceError = new IronSourceError(1062, "No available ad to load");
            }
            a(ironSourceError);
        } catch (Exception e2) {
            StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "loadRewardedVideoWithAdm: Exception= ");
            sbO.append(e2.getMessage());
            a(ErrorBuilder.buildLoadFailedError(sbO.toString()));
        }
    }

    private IronSourceError q() {
        if (a(m.a.SHOW_IN_PROGRESS)) {
            return new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing");
        }
        return a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private i r() {
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
        Map<String, Object> rewardedVideoBiddingData = this.f25860a.getRewardedVideoBiddingData(this.f25862c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            f5Var.b(rewardedVideoBiddingData);
        }
        iVar.a(f5Var);
        return iVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.o = new ib();
        this.f25860a.loadRewardedVideo(this.f25862c, null, this);
    }

    private void u() {
        if (!this.r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        i iVarR = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + iVarR.getWaterfallString());
        a(ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, iVarR.getWaterfallString()}});
        this.r.a(ContextProvider.getInstance().getApplicationContext(), iVarR, this);
    }

    private void v() {
        this.g = null;
        this.f25864h = null;
        this.j = null;
        this.q = new c5();
    }

    private void w() {
        this.f25856n = new ib();
        a(s());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(ac.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.p004ironsource.r4
    public void a(int i2, String str, int i3, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i2 + " - " + str);
        this.g = null;
        this.f25864h = null;
        a(ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(ac.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.f25857p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(ac.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        w();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void e() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(ac.RV_INSTANCE_SHOW, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f25860a.showRewardedVideo(this.f25862c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.f25857p.onRewardedVideoAdClicked(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.t.a(this.m))}});
        this.f25858u.b(this.m);
        this.f25857p.onRewardedVideoAdClosed(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        a(this.q.a(), IronSourceUtils.getCurrentMethodName());
        this.f25857p.onRewardedVideoAdOpened(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> mapJ = j();
        if (!TextUtils.isEmpty(p.j().i())) {
            mapJ.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, p.j().i());
        }
        if (p.j().p() != null) {
            for (String str : p.j().p().keySet()) {
                mapJ.put(android.support.v4.media.a.C("custom_", str), p.j().p().get(str));
            }
        }
        Placement placementA = p.j().e().c().getRewardedVideoConfigurations().a();
        if (placementA != null) {
            mapJ.put("placement", placementA.getPlacementName());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_NAME, placementA.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(placementA.getRewardAmount()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        zb zbVar = new zb(ac.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(mapJ));
        zbVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(zbVar.d(), h()));
        ds.i().a(zbVar);
        this.f25857p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(ac.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f25857p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(ac.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z2) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(ac.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(ib.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(ac.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.f25856n))}});
            a(this.q.c(), IronSourceUtils.getCurrentMethodName());
            this.f25857p.onRewardedVideoAdLoadSuccess(l());
        }
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
        ds.i().a(new zb(acVar, new JSONObject(mapJ)));
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
        a(ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        a(ac.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0287a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (!c0287a.isEmpty()) {
                c(strK);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
            ironLog.error("rewardedVideo - empty waterfall");
            a(ironSourceError);
        }
    }

    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, ib.a(this.f25856n));
            a(this.q.b(), IronSourceUtils.getCurrentMethodName());
            this.f25857p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(ac.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
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
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(ac.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f25860a.loadRewardedVideoForBidding(this.f25862c, null, str, this);
            }
        }
    }

    @Override // com.p004ironsource.r4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!a(m.a.LOADED)) {
            a(ac.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f25860a.isRewardedVideoAvailable(this.f25862c);
            a(zIsRewardedVideoAvailable ? ac.RV_INSTANCE_READY_TRUE : ac.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsRewardedVideoAvailable;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("exception=" + e2.getMessage());
            return zIsRewardedVideoAvailable;
        }
    }
}
