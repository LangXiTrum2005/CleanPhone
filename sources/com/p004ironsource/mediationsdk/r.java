package com.p004ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.Z;
import com.p004ironsource.a3;
import com.p004ironsource.a8;
import com.p004ironsource.ac;
import com.p004ironsource.ds;
import com.p004ironsource.gl;
import com.p004ironsource.ii;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.config.ConfigFile;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.tk;
import com.p004ironsource.zb;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class r extends y implements RewardedVideoSmashListener, a8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f26045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private gl f26046i;
    private Timer j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f26047l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Placement f26048n;
    private long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f26049p;
    private JSONObject q;
    private int r;
    private String s;
    private final Object t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f26050u;
    private long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ii.a f26051w;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i2;
            boolean z2;
            b bVar = r.this.f26045h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || r.this.f26045h == b.INIT_IN_PROGRESS) {
                if (r.this.f26045h == bVar2) {
                    i2 = 1025;
                } else {
                    str = "Rewarded Video - init instance time out";
                    i2 = 1032;
                }
                r.this.a(b.NOT_LOADED);
                z2 = true;
            } else {
                z2 = false;
                i2 = 510;
            }
            r.this.a(str);
            if (!z2) {
                r.this.a(ac.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(r.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, r.this.f26045h.name()}});
                return;
            }
            r.this.a(ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"duration", Long.valueOf(r.this.v())}});
            r.this.a(ac.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(r.this.v())}});
            r.this.f26046i.c(r.this);
        }
    }

    public enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public r(r rVar, gl glVar, AbstractAdapter abstractAdapter, int i2, String str, JSONObject jSONObject, int i3, String str2) {
        this(rVar.f26047l, rVar.m, rVar.f26150b.h(), glVar, rVar.k, abstractAdapter, i2);
        this.f26049p = str;
        this.q = jSONObject;
        this.r = i3;
        this.s = str2;
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f26149a.setPluginData(pluginType);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("setCustomParams() ", th);
            sbP.append(th.getMessage());
            a(sbP.toString());
        }
    }

    private void D() {
        synchronized (this.f26050u) {
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new a(), this.k * 1000);
        }
    }

    private void E() {
        synchronized (this.f26050u) {
            try {
                Timer timer = this.j;
                if (timer != null) {
                    timer.cancel();
                    this.j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f26149a.initRewardedVideoWithCallback(this.f26047l, this.m, this.d, this);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("initForBidding exception: ", th);
            sbP.append(th.getLocalizedMessage());
            b(sbP.toString());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return Z.f() - this.o;
    }

    public boolean A() {
        if (this.f26045h != b.LOADED) {
            return false;
        }
        try {
            return this.f26149a.isRewardedVideoAvailable(this.d);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("isReadyToShow exception: ", th);
            sbP.append(th.getLocalizedMessage());
            b(sbP.toString());
            a(ac.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(ac.RV_CAP_SESSION);
    }

    @Override // com.p004ironsource.a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(ac.RV_INSTANCE_COLLECT_TOKEN);
        try {
            this.f26149a.collectRewardedVideoBiddingData(this.d, adData != null ? tk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("collectBiddingData exception: ", th);
            sbP.append(th.getLocalizedMessage());
            b(sbP.toString());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.p004ironsource.mediationsdk.y
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.p004ironsource.mediationsdk.y
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.p004ironsource.mediationsdk.y
    public int l() {
        return 2;
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f26046i.b(this, this.f26048n);
        b(ac.RV_BUSINESS_INSTANCE_CLICKED);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.t) {
            try {
                if (this.f26045h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.v = Z.f();
                    this.f26046i.b(this);
                } else {
                    b(ac.RV_INSTANCE_CLOSED);
                    a(ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f26045h}});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f26046i.f(this);
        b(ac.RV_INSTANCE_ENDED);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f26046i.d(this);
        b(ac.RV_BUSINESS_INSTANCE_OPENED);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f26046i.a(this, this.f26048n);
        Map<String, Object> mapM = m();
        Placement placement = this.f26048n;
        if (placement != null) {
            mapM.put("placement", placement.getPlacementName());
            mapM.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f26048n.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            mapM.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f26048n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(p.j().i())) {
            mapM.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, p.j().i());
        }
        if (p.j().p() != null) {
            for (String str : p.j().p().keySet()) {
                mapM.put(android.support.v4.media.a.C("custom_", str), p.j().p().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f26049p)) {
            mapM.put("auctionId", this.f26049p);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.q);
        }
        ac acVar = ac.RV_BUSINESS_INSTANCE_REWARDED;
        if (c(acVar)) {
            ds.i().a(mapM, this.r, this.s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f));
        zb zbVar = new zb(acVar, new JSONObject(mapM));
        zbVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(zbVar.d(), c()));
        long j = this.v;
        if (j != 0) {
            long j2 = time - j;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            zbVar.a("duration", Long.valueOf(j2));
        }
        ds.i().a(zbVar);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(ac.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.t) {
            try {
                if (this.f26045h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.f26046i.a(ironSourceError, this);
                    return;
                }
                a(ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f26045h}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f26046i.a(this);
        b(ac.RV_INSTANCE_STARTED);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(ac.RV_INSTANCE_VISIBLE);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z2) {
        boolean z3;
        a("onRewardedVideoAvailabilityChanged available=" + z2 + " state=" + this.f26045h.name());
        synchronized (this.t) {
            try {
                if (this.f26045h == b.LOAD_IN_PROGRESS) {
                    a(z2 ? b.LOADED : b.NOT_LOADED);
                    z3 = false;
                } else {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            if (z2) {
                a(ac.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f26045h.name()}});
                return;
            } else {
                a(ac.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f26045h.name()}});
                return;
            }
        }
        E();
        a(z2 ? ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS : ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(v())}});
        if (z2) {
            this.f26046i.e(this);
        } else {
            this.f26046i.c(this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(ac.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(v())}});
        a(ac.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
        synchronized (this.t) {
            try {
                if (this.f26045h == b.INIT_IN_PROGRESS) {
                    a(b.NO_INIT);
                    this.f26046i.c(this);
                    return;
                }
                a(ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f26045h}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.t) {
            try {
                if (this.f26045h != b.INIT_IN_PROGRESS) {
                    a(ac.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f26045h}});
                } else {
                    a(b.NOT_LOADED);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(ac.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.g = Long.valueOf(System.currentTimeMillis());
        }
        a(ac.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public String u() {
        return this.f26049p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f26149a.getLoadWhileShowSupportState(this.d);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("Exception while calling adapter.getLoadWhileShowSupportState() - ", th);
            sbP.append(th.getLocalizedMessage());
            b(sbP.toString());
            return LoadWhileShowSupportState.NONE;
        }
    }

    public Placement x() {
        return this.f26048n;
    }

    public boolean y() {
        return this.f26045h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.f26045h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    public r(String str, String str2, NetworkSettings networkSettings, gl glVar, int i2, AbstractAdapter abstractAdapter, int i3) {
        super(new a3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.t = new Object();
        this.f26050u = new Object();
        this.f26051w = on.O().e();
        this.f26047l = str;
        this.m = str2;
        this.f26046i = glVar;
        this.j = null;
        this.k = i2;
        this.f = i3;
        this.f26045h = b.NO_INIT;
        this.v = 0L;
        if (r()) {
            t();
        }
    }

    private void b(ac acVar) {
        b(acVar, null);
    }

    private boolean c(ac acVar) {
        return acVar == ac.RV_BUSINESS_INSTANCE_LOAD || acVar == ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS || acVar == ac.RV_INSTANCE_LOAD_FAILED || acVar == ac.RV_INSTANCE_LOAD_FAILED_REASON || acVar == ac.RV_INSTANCE_LOAD_NO_FILL || acVar == ac.RV_BUSINESS_INSTANCE_OPENED || acVar == ac.RV_INSTANCE_CLOSED || acVar == ac.RV_INSTANCE_SHOW || acVar == ac.RV_INSTANCE_SHOW_FAILED || acVar == ac.RV_BUSINESS_INSTANCE_CLICKED || acVar == ac.RV_BUSINESS_INSTANCE_REWARDED;
    }

    public void a(ac acVar) {
        a(acVar, null, false);
    }

    public void a(ac acVar, Object[][] objArr) {
        a(acVar, objArr, false);
    }

    public void b(ac acVar, Object[][] objArr) {
        a(acVar, objArr, true);
    }

    private void a(ac acVar, Object[][] objArr, boolean z2) {
        Placement placement;
        Map<String, Object> mapM = m();
        if (!TextUtils.isEmpty(this.f26049p)) {
            mapM.put("auctionId", this.f26049p);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.q);
        }
        if (z2 && (placement = this.f26048n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            mapM.put("placement", this.f26048n.getPlacementName());
        }
        if (c(acVar)) {
            ds.i().a(mapM, this.r, this.s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        ds.i().a(new zb(acVar, new JSONObject(mapM)));
        if (acVar == ac.RV_INSTANCE_CLOSED) {
            this.f26051w.b(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    public void b(boolean z2) {
        b(ac.RV_INSTANCE_SHOW_CHANCE, new Object[][]{new Object[]{"status", z2 ? com.p004ironsource.mediationsdk.metadata.a.g : "false"}});
    }

    public void a(Placement placement) {
        E();
        a("showVideo()");
        this.f26048n = placement;
        a(b.SHOW_IN_PROGRESS);
        b(ac.RV_INSTANCE_SHOW);
        try {
            this.f26149a.showRewardedVideo(this.d, this);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("showVideo exception: ", th);
            sbP.append(th.getLocalizedMessage());
            b(sbP.toString());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.f26045h + ", new state=" + bVar);
        synchronized (this.t) {
            this.f26045h = bVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:46:0x00f6
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.mediationsdk.r.a(java.lang.String, org.json.JSONObject):void");
    }
}
