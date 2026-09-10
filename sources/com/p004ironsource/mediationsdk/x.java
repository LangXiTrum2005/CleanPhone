package com.p004ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.p004ironsource.a3;
import com.p004ironsource.a8;
import com.p004ironsource.ac;
import com.p004ironsource.h7;
import com.p004ironsource.ib;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.config.ConfigFile;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.q9;
import com.p004ironsource.tk;
import com.p004ironsource.uu;
import com.p004ironsource.wj;
import com.p004ironsource.xq;
import com.p004ironsource.zb;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class x extends y implements BannerSmashListener, uu.a, a8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f26138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private uu f26139i;
    private a j;
    private xq k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IronSourceBannerLayout f26140l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f26141n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f26142p;
    private h7 q;
    private final Object r;
    private ib s;
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f26143u;
    private JSONObject v;

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public x(k kVar, xq xqVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i2, String str, JSONObject jSONObject, int i3, String str2, boolean z2) {
        super(new a3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.r = new Object();
        this.j = a.NONE;
        this.f26138h = kVar;
        this.f26139i = new uu(kVar.e());
        this.k = xqVar;
        this.f = i2;
        this.m = str;
        this.o = i3;
        this.f26142p = str2;
        this.f26141n = jSONObject;
        this.t = z2;
        this.v = null;
        if (r()) {
            u();
        }
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f26149a != null) {
                if (p()) {
                    this.f26149a.initBannerForBidding(this.f26138h.a(), this.f26138h.i(), this.d, this);
                } else {
                    this.f26149a.initBanners(this.f26138h.a(), this.f26138h.i(), this.d, this);
                }
            }
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f26149a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
            a(ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z2;
        synchronized (this.r) {
            z2 = this.j == a.DESTROYED;
        }
        return z2;
    }

    private boolean C() {
        boolean z2;
        synchronized (this.r) {
            z2 = this.j == a.LOADED;
        }
        return z2;
    }

    private void F() {
        if (this.f26149a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f26149a.setPluginData(pluginType);
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f26149a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean b(ac acVar) {
        return acVar == ac.BN_INSTANCE_LOAD_SUCCESS || acVar == ac.BN_INSTANCE_LOAD || acVar == ac.BN_INSTANCE_RELOAD || acVar == ac.BN_INSTANCE_RELOAD_SUCCESS || acVar == ac.BN_INSTANCE_CLICK || acVar == ac.BN_INSTANCE_DESTROY || acVar == ac.BN_INSTANCE_LOAD_ERROR || acVar == ac.BN_INSTANCE_LOAD_NO_FILL || acVar == ac.BN_INSTANCE_RELOAD_NO_FILL || acVar == ac.BN_INSTANCE_PRESENT_SCREEN || acVar == ac.BN_INSTANCE_DISMISS_SCREEN || acVar == ac.BN_INSTANCE_LEAVE_APP || acVar == ac.BN_INSTANCE_SHOW;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f26143u = true;
        A();
    }

    public void D() {
        this.f26149a.onBannerViewBound(this.f26150b.h().getBannerSettings());
    }

    public void E() {
        this.f26149a.onBannerViewWillBind(this.f26150b.h().getBannerSettings());
    }

    @Override // com.ironsource.uu.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else {
            if (!a(a.LOADING, aVar2)) {
                ironLog.error("unexpected state - " + this.j);
                return;
            }
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        a(ironSourceError);
    }

    @Override // com.p004ironsource.a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(ac.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f26149a.collectBannerBiddingData(this.d, adData != null ? tk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f26149a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.y
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.p004ironsource.mediationsdk.y
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(ac.BN_INSTANCE_CLICK);
        xq xqVar = this.k;
        if (xqVar != null) {
            xqVar.b(this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(ac.BN_INSTANCE_LEAVE_APP);
        xq xqVar = this.k;
        if (xqVar != null) {
            xqVar.c(this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.f26139i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f26139i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.t ? ac.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : ac.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.t ? ac.BN_INSTANCE_RELOAD_SUCCESS : ac.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.s))}});
        xq xqVar = this.k;
        if (xqVar != null) {
            xqVar.a(this, view, layoutParams);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(ac.BN_INSTANCE_DISMISS_SCREEN);
        xq xqVar = this.k;
        if (xqVar != null) {
            xqVar.e(this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(ac.BN_INSTANCE_PRESENT_SCREEN);
        xq xqVar = this.k;
        if (xqVar != null) {
            xqVar.d(this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(ac.BN_INSTANCE_SHOW);
            xq xqVar = this.k;
            if (xqVar != null) {
                xqVar.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.j);
        a(ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f26139i.e();
        if (!a(a.INIT_IN_PROGRESS, a.NONE)) {
            ironLog.warning("wrong state - mState = " + this.j);
        } else {
            xq xqVar = this.k;
            if (xqVar != null) {
                xqVar.a(ironSourceError, this, false);
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f26143u) {
                this.f26143u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.f26140l)) {
                    a((String) null, this.v);
                } else {
                    this.k.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f26140l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.y
    public void q() {
        this.f26139i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(ac.BN_INSTANCE_DESTROY);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f26149a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f26150b.h().getBannerSettings());
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f26149a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f26150b.h().getAdSourceNameForEvents()) ? this.f26150b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f26149a;
    }

    public String x() {
        return this.m;
    }

    public String y() {
        return android.support.v4.media.a.m(f(), " - ");
    }

    public String z() {
        return this.f26150b.i();
    }

    public x(k kVar, xq xqVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i2, boolean z2) {
        this(kVar, xqVar, networkSettings, abstractAdapter, i2, "", null, 0, "", z2);
    }

    public void a(ac acVar) {
        a(acVar, (Object[][]) null);
    }

    public void a(ac acVar, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.f26140l;
            if (ironSourceBannerLayout != null) {
                l.a(mapM, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.m)) {
            mapM.put("auctionId", this.m);
        }
        JSONObject jSONObject = this.f26141n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f26141n);
        }
        h7 h7Var = this.q;
        if (h7Var != null) {
            mapM.put("placement", h7Var.getPlacementName());
        }
        if (b(acVar)) {
            wj.i().a(mapM, this.o, this.f26142p);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e2));
            }
        }
        wj.i().a(new zb(acVar, new JSONObject(mapM)));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var, String str, JSONObject jSONObject) {
        xq xqVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.q = h7Var;
        this.v = jSONObject;
        if (!l.c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            xqVar = this.k;
            ironSourceError = new IronSourceError(610, str2);
        } else {
            if (this.f26149a != null) {
                this.f26140l = ironSourceBannerLayout;
                this.f26139i.a((uu.a) this);
                try {
                    if (p()) {
                        a(str, this.v);
                        return;
                    } else {
                        A();
                        return;
                    }
                } catch (Throwable th) {
                    q9.d().a(th);
                    IronLog.INTERNAL.error("exception = " + th.getLocalizedMessage());
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                    return;
                }
            }
            ironLog.verbose("mAdapter is null");
            xqVar = this.k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        }
        xqVar.a(ironSourceError, this, false);
    }

    private void a(IronSourceError ironSourceError) {
        boolean z2 = ironSourceError.getErrorCode() == 606;
        boolean z3 = this.t;
        if (z2) {
            a(z3 ? ac.BN_INSTANCE_RELOAD_NO_FILL : ac.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.s))}});
        } else {
            a(z3 ? ac.BN_INSTANCE_RELOAD_ERROR : ac.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(ib.a(this.s))}});
        }
        xq xqVar = this.k;
        if (xqVar != null) {
            xqVar.a(ironSourceError, this, z2);
        }
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.r) {
            this.j = aVar;
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!a(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.j);
            return;
        }
        this.s = new ib();
        a(this.t ? ac.BN_INSTANCE_RELOAD : ac.BN_INSTANCE_LOAD);
        if (this.f26149a != null) {
            try {
                try {
                    if (p()) {
                        this.f26149a.loadBannerForBidding(this.d, this.v, str, this.f26140l, this);
                        return;
                    } else {
                        this.f26149a.loadBanner(this.d, this.v, this.f26140l, this);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            Throwable th3 = th;
            q9.d().a(th3);
            IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f26149a.getProviderName() + ", exception =  " + th3.getLocalizedMessage());
            onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th3.getLocalizedMessage()));
            a(ac.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th3.getLocalizedMessage()}});
        }
    }

    private boolean a(a aVar, a aVar2) {
        boolean z2;
        synchronized (this.r) {
            try {
                if (this.j == aVar) {
                    IronLog.INTERNAL.verbose(y() + "set state from '" + this.j + "' to '" + aVar2 + "'");
                    this.j = aVar2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
