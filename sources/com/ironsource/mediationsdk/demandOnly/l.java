package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C0310e1;
import com.ironsource.C0347g2;
import com.ironsource.C0350g5;
import com.ironsource.C0358gd;
import com.ironsource.C0359ge;
import com.ironsource.C0400j2;
import com.ironsource.C0439l5;
import com.ironsource.C0474n4;
import com.ironsource.C0526q2;
import com.ironsource.C0654x5;
import com.ironsource.EnumC0672y5;
import com.ironsource.InterfaceC0311e2;
import com.ironsource.Kb;
import com.ironsource.M8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, InterfaceC0311e2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0350g5 f29476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0350g5 f29477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ISDemandOnlyRewardedVideoListener f29478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C0347g2 f29479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f29480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p f29481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final M8 f29482t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final M8.a f29483u;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    public l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C0310e1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.f29481s = new p.b();
        this.f29482t = Kb.Y().s();
        this.f29483u = Kb.Q().i();
        this.f29478p = iSDemandOnlyRewardedVideoListener;
        this.f29490f = j10;
        this.f29480r = eVar;
        this.f29485a.initRewardedVideoForDemandOnly(str, str2, this.f29487c, this);
    }

    private void c(o oVar) {
        this.f29476n = new C0350g5();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.f29472k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar = (com.ironsource.mediationsdk.d.a) oVar.a(new C0439l5());
            C0526q2 c0526q2A = new com.ironsource.mediationsdk.demandOnly.a.C0080a(aVar.h()).a(h());
            if (c0526q2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(EnumC0672y5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strK = c0526q2A.k();
            if (strK == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f29479q.a(c0526q2A.b());
            this.f29477o = new C0350g5();
            this.f29485a.loadRewardedVideoForBidding(this.f29487c, null, strK, this);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e10.getMessage()));
        }
    }

    private IronSourceError q() {
        if (a(m.a.SHOW_IN_PROGRESS)) {
            return new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing");
        }
        return a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.h r() {
        String str = i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.f29496m);
        hVar.b(IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.e(str);
        hVar.c(l());
        hVar.a(this.f29482t.a(this.f29496m));
        C0400j2 c0400j2 = new C0400j2(h(), false);
        c0400j2.a(this.f29481s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f29485a.getRewardedVideoBiddingData(this.f29487c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c0400j2.b(rewardedVideoBiddingData);
        }
        hVar.a(c0400j2);
        return hVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.f29477o = new C0350g5();
        this.f29485a.loadRewardedVideo(this.f29487c, null, this);
    }

    private void u() {
        if (!this.f29480r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.h hVarR = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + hVarR.s());
        a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, hVarR.s()}});
        this.f29480r.a(ContextProvider.getInstance().getApplicationContext(), hVarR, this);
    }

    private void v() {
        this.f29491g = null;
        this.f29492h = null;
        this.f29494j = null;
        this.f29479q = new C0347g2();
    }

    private void w() {
        this.f29476n = new C0350g5();
        a(s());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(EnumC0672y5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!a(m.a.LOADED)) {
            a(EnumC0672y5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f29485a.isRewardedVideoAvailable(this.f29487c);
            a(zIsRewardedVideoAvailable ? EnumC0672y5.RV_INSTANCE_READY_TRUE : EnumC0672y5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsRewardedVideoAvailable;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception=" + e10.getMessage());
            return zIsRewardedVideoAvailable;
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
        a(EnumC0672y5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(EnumC0672y5.RV_INSTANCE_SHOW, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f29485a.showRewardedVideo(this.f29487c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.f29478p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f29482t.a(this.f29496m))}});
        this.f29483u.b(this.f29496m);
        this.f29478p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        a(this.f29479q.a(), IronSourceUtils.a());
        this.f29478p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> mapJ = j();
        if (!TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().g())) {
            mapJ.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.ironsource.mediationsdk.p.h().g());
        }
        if (com.ironsource.mediationsdk.p.h().m() != null) {
            for (String str : com.ironsource.mediationsdk.p.h().m().keySet()) {
                mapJ.put(defpackage.e.n("custom_", str), com.ironsource.mediationsdk.p.h().m().get(str));
            }
        }
        C0358gd c0358gdA = com.ironsource.mediationsdk.p.h().e().c().f().a();
        if (c0358gdA != null) {
            mapJ.put("placement", c0358gdA.c());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_NAME, c0358gdA.f());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(c0358gdA.e()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C0654x5 c0654x5 = new C0654x5(EnumC0672y5.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(mapJ));
        c0654x5.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c0654x5.d(), h()));
        C0359ge.i().a(c0654x5);
        this.f29478p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(EnumC0672y5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f29478p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC0672y5.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29477o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29477o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(EnumC0672y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C0350g5.a(this.f29476n))}});
            a(this.f29479q.c(), IronSourceUtils.a());
            this.f29478p.onRewardedVideoAdLoadSuccess(l());
        }
    }

    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C0350g5.a(this.f29476n));
            a(this.f29479q.b(), IronSourceUtils.a());
            this.f29478p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
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
        C0359ge.i().a(new C0654x5(enumC0672y5, new JSONObject(mapJ)));
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(EnumC0672y5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(EnumC0672y5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void c() {
        String str;
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            if (aVarA == aVar3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.f29478p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, str));
            return;
        }
        v();
        a(EnumC0672y5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        w();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
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
        this.f29481s = aVar.a(l());
        com.ironsource.mediationsdk.demandOnly.a.C0080a c0080a = new com.ironsource.mediationsdk.demandOnly.a.C0080a(aVar.h());
        if (!c0080a.isEmpty()) {
            C0526q2 c0526q2 = c0080a.get(0);
            this.f29479q.a(c0526q2.b());
            this.f29479q.c(c0526q2.h());
            this.f29479q.b(c0526q2.g());
            strK = c0526q2.k();
            b(strK);
        } else {
            strK = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a(EnumC0672y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0080a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0080a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
                ironLog.error("rewardedVideo - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(strK);
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f29485a.loadRewardedVideoForBidding(this.f29487c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C0526q2> list, String str, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.U1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f29491g = null;
        this.f29492h = null;
        a(EnumC0672y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.f29471j, "No available ad to load"));
        }
    }
}
