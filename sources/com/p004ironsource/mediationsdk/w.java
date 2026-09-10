package com.p004ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.Z;
import com.p004ironsource.ac;
import com.p004ironsource.b8;
import com.p004ironsource.c8;
import com.p004ironsource.d8;
import com.p004ironsource.eg;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.ew;
import com.p004ironsource.fg;
import com.p004ironsource.h7;
import com.p004ironsource.ib;
import com.p004ironsource.ii;
import com.p004ironsource.jg;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.r4;
import com.p004ironsource.t5;
import com.p004ironsource.wj;
import com.p004ironsource.xq;
import com.p004ironsource.y7;
import com.p004ironsource.ym;
import com.p004ironsource.zb;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class w extends m implements xq, r4 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.h.a> f26104A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f26105B;
    private final Object C;
    private ib D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f26106E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final long f26107F;
    private final Runnable G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ii f26108e;
    private final ii.a f;
    private final jg g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jg.a f26109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f26110i;
    private i j;
    private ym k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IronSourceBannerLayout f26111l;
    private h7 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26112n;
    private x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26113p;
    private final ConcurrentHashMap<String, x> q;
    private CopyOnWriteArrayList<x> r;
    private String s;
    private JSONObject t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f26114u;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.p004ironsource.mediationsdk.e f26115w;
    private m5 x;
    private com.p004ironsource.mediationsdk.h y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ConcurrentHashMap<String, m5> f26116z;

    public class a implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h7 f26117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceBannerLayout f26118b;

        public a(h7 h7Var, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f26117a = h7Var;
            this.f26118b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f26117a.getPlacementName());
            l.b(this.f26118b);
            w.this.f26111l = this.f26118b;
            w.this.m = this.f26117a;
            jg jgVar = w.this.g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            h7 h7Var = this.f26117a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!jgVar.b(applicationContext, h7Var, ad_unit)) {
                w.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().b(ad_unit, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + this.f26117a.getPlacementName() + " is capped"));
            w.this.a(ac.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
            w.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    public class b implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceBannerLayout f26120a;

        public b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f26120a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog.INTERNAL.verbose("destroying banner");
            w.this.k.b();
            w.this.a(ac.BN_DESTROY, (Object[][]) null, w.this.o != null ? w.this.o.n() : w.this.f26113p);
            w.this.h();
            this.f26120a.a();
            w.this.f26111l = null;
            w.this.m = null;
            w.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (w.this.f26111l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    w.this.a(ac.BN_SKIP_RELOAD, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (w.this.o()) {
                        w.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    w.this.a(ac.BN_SKIP_RELOAD, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE)}});
                    w.this.k.a(TimeUnit.SECONDS.toMillis(w.this.f26110i.f()));
                }
            } catch (Throwable th) {
                q9.d().a(th);
                w.this.a(ac.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th.getMessage()}});
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.w();
            if (w.this.y()) {
                return;
            }
            w.this.a(ac.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            w.this.b(map, arrayList, sb, arrayList2);
            w.this.a(map, arrayList, sb, arrayList2);
        }
    }

    public class e implements b8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f26124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f26125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26126c;

        public e(Map map, StringBuilder sb, List list) {
            this.f26124a = map;
            this.f26125b = sb;
            this.f26126c = list;
        }

        @Override // com.ironsource.b8.b
        public void a(List<c8> list, long j, List<String> list2) {
            w.this.a(ac.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            for (c8 c8Var : list) {
                if (c8Var.a() != null) {
                    this.f26124a.put(c8Var.c(), c8Var.a());
                    StringBuilder sb = this.f26125b;
                    sb.append(c8Var.d());
                    sb.append(c8Var.c());
                    sb.append(",");
                    ((x) w.this.q.get(c8Var.c())).a(ac.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(c8Var.e())}});
                } else {
                    ((x) w.this.q.get(c8Var.c())).a(ac.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(c8Var.e())}, new Object[]{"reason", c8Var.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((x) w.this.q.get(it.next())).a(ac.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            }
            w.this.a((Map<String, Object>) this.f26124a, (List<String>) this.f26126c, this.f26125b);
        }

        @Override // com.ironsource.b8.b
        public void onFailure(String str) {
            w.this.a(ac.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{"duration", str}});
            w.this.a((Map<String, Object>) this.f26124a, (List<String>) this.f26126c, this.f26125b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f26127a;

        public f(NetworkSettings networkSettings) {
            this.f26127a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a(this.f26127a);
        }
    }

    public class g implements d8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f26129a;

        public g(x xVar) {
            this.f26129a = xVar;
        }

        @Override // com.p004ironsource.d8
        public void a() {
            this.f26129a.D();
        }
    }

    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            w.this.u();
        }
    }

    public enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public w(fg fgVar, eg egVar, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.j = i.NONE;
        this.f26114u = "";
        this.C = new Object();
        this.f26106E = false;
        c cVar = new c();
        this.G = cVar;
        ii iiVarK = fgVar.k();
        this.f26108e = iiVarK;
        this.f = egVar.e();
        this.g = fgVar.C();
        this.f26109h = egVar.m();
        long jF = Z.f();
        a(ac.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.f26110i = kVar;
        this.q = new ConcurrentHashMap<>();
        this.r = new CopyOnWriteArrayList<>();
        this.f26116z = new ConcurrentHashMap<>();
        this.f26104A = new ConcurrentHashMap<>();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f26113p = iiVarK.a(ad_unit);
        n.a().a(ad_unit, this.f26110i.d());
        if (this.f26110i.j()) {
            this.f26115w = new com.p004ironsource.mediationsdk.e(ad_unit, this.f26110i.b(), this);
        }
        this.y = new com.p004ironsource.mediationsdk.h(list, this.f26110i.b().c());
        a(list, kVar);
        this.f26105B = Z.f();
        a(i.READY_TO_LOAD);
        this.f26107F = kVar.g();
        this.k = new ym(cVar, com.p004ironsource.lifecycle.b.d(), new ew());
        a(ac.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - jF)}});
    }

    private String b(m5 m5Var) {
        x xVar = this.q.get(m5Var.c());
        StringBuilder sbW = android.support.v4.media.a.w((xVar == null ? !TextUtils.isEmpty(m5Var.k()) : xVar.p()) ? "2" : "1");
        sbW.append(m5Var.c());
        return sbW.toString();
    }

    private void f(x xVar) {
        String strK;
        IronSourceBannerLayout ironSourceBannerLayout = this.f26111l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayoutB = null;
        if (xVar.p()) {
            strK = this.f26116z.get(xVar.c()).k();
            xVar.c(strK);
        } else {
            strK = null;
        }
        JSONObject jSONObjectA = this.f26116z.get(xVar.c()).a();
        try {
            ironSourceBannerLayoutB = this.f26111l.b();
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e2.getMessage());
        }
        xVar.a(ironSourceBannerLayoutB, this.m, strK, jSONObjectA);
    }

    private List<m5> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (x xVar : this.q.values()) {
            if (!xVar.p() && !this.g.b(ContextProvider.getInstance().getApplicationContext(), this.m, IronSource.AD_UNIT.BANNER)) {
                copyOnWriteArrayList.add(new m5(xVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f26111l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        if (this.f26111l.getSize().isSmart()) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f25708e : ISBannerSize.BANNER;
        }
        return this.f26111l.getSize();
    }

    private ISBannerSize k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f26111l;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private void m() {
        String str = this.r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = ".concat(str));
        g((x) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(ac.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", 606}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(ib.a(this.D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
        } else if (a(i.RELOADING, i.LOADED)) {
            a(ac.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
            this.k.a(TimeUnit.SECONDS.toMillis(this.f26110i.f()));
        } else {
            a(iVar2);
            ironLog.error("wrong state = " + this.j);
        }
    }

    private void n() {
        String strL = l();
        jg.a aVar = this.f26109h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        aVar.a(applicationContext, strL, ad_unit);
        if (this.g.b(ContextProvider.getInstance().getApplicationContext(), this.m, ad_unit)) {
            a(ac.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z2;
        synchronized (this.C) {
            z2 = this.j == i.LOADED;
        }
        return z2;
    }

    private boolean r() {
        boolean z2;
        synchronized (this.C) {
            try {
                i iVar = this.j;
                z2 = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    private boolean s() {
        boolean z2;
        synchronized (this.C) {
            try {
                i iVar = this.j;
                z2 = iVar == i.LOADING || iVar == i.RELOADING;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    private void t() {
        try {
            for (int i2 = this.f26112n; i2 < this.r.size(); i2++) {
                x xVar = this.r.get(i2);
                if (xVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + xVar.f());
                    this.f26112n = i2 + 1;
                    f(xVar);
                    return;
                }
            }
            m();
        } catch (Exception e2) {
            q9.d().a(e2);
            a(ac.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e2)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.f26104A.isEmpty()) {
            return;
        }
        this.y.a(this.f26104A);
        this.f26104A.clear();
    }

    private void x() {
        List<m5> listI = i();
        this.s = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = l.a(this.f26105B, this.f26110i.h());
        if (jA <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new Timer().schedule(new h(), jA);
        return true;
    }

    public boolean o() {
        IronLog ironLog;
        String str;
        if (!this.f26111l.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.f26111l.hasWindowFocus()) {
                boolean globalVisibleRect = this.f26111l.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.o.f());
            this.o.t();
            this.o = null;
        }
    }

    private String l() {
        h7 h7Var = this.m;
        return h7Var != null ? h7Var.getPlacementName() : "";
    }

    @Override // com.p004ironsource.xq
    public void c(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().c(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(ac.BN_CALLBACK_LEAVE_APP, objArr, xVar.n());
    }

    @Override // com.p004ironsource.xq
    public void d(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().f(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(ac.BN_CALLBACK_PRESENT_SCREEN, objArr, xVar.n());
    }

    @Override // com.p004ironsource.xq
    public void e(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().e(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(ac.BN_CALLBACK_DISMISS_SCREEN, objArr, xVar.n());
    }

    public void g(x xVar) {
        for (x xVar2 : this.r) {
            if (!xVar2.equals(xVar)) {
                xVar2.q();
            }
        }
    }

    private boolean g() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f26111l;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private String a(List<m5> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.r.clear();
        this.f26116z.clear();
        this.f26104A.clear();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            m5 m5Var = list.get(i2);
            a(m5Var);
            sb.append(b(m5Var));
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    @Override // com.p004ironsource.r4
    public void a(int i2, String str, int i3, String str2, long j) {
        String str3 = "Auction failed (error " + i2 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
            return;
        }
        this.f26114u = str2;
        this.v = i3;
        this.t = null;
        if (this.f26110i.b().n()) {
            ironLog.verbose("Moving to fallback waterfall");
            x();
        }
        a(ac.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}});
        a(this.j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ac acVar) {
        a(acVar, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ac acVar, Object[][] objArr) {
        a(acVar, objArr, this.f26113p);
    }

    public w(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this(on.U(), on.O(), list, kVar, hashSet, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ac acVar, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(mediationAdditionalData, iSBannerSizeK);
            }
            if (this.m != null) {
                mediationAdditionalData.put("placement", l());
            }
            mediationAdditionalData.put("sessionDepth", i2);
            if (!TextUtils.isEmpty(this.s)) {
                mediationAdditionalData.put("auctionId", this.s);
            }
            JSONObject jSONObject = this.t;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put("genericParams", this.t);
            }
            if (b(acVar)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.v);
                if (!TextUtils.isEmpty(this.f26114u)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f26114u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
        wj.i().a(new zb(acVar, mediationAdditionalData));
    }

    @Override // com.p004ironsource.xq
    public void b(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().b(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(ac.BN_CALLBACK_CLICK, objArr, xVar.n());
    }

    private void a(m5 m5Var) {
        x xVar = this.q.get(m5Var.c());
        if (xVar == null) {
            IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + m5Var.c());
            return;
        }
        AbstractAdapter abstractAdapterA = com.p004ironsource.mediationsdk.c.b().a(xVar.f26150b.h());
        if (abstractAdapterA != null) {
            x xVar2 = new x(this.f26110i, this, xVar.f26150b.h(), abstractAdapterA, this.f26113p, this.s, this.t, this.v, this.f26114u, p());
            xVar2.a(true);
            this.r.add(xVar2);
            this.f26116z.put(xVar2.c(), m5Var);
            this.f26104A.put(m5Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
        }
    }

    private void b(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f26111l != null) {
            xVar.E();
            l.a(this.f26111l, view, layoutParams, new g(xVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<y7> list2) {
        if (this.g.b(ContextProvider.getInstance().getApplicationContext(), this.m, IronSource.AD_UNIT.BANNER)) {
            return;
        }
        for (x xVar : this.q.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(xVar.d, IronSource.AD_UNIT.BANNER, null, this.f26111l);
            if (xVar.p()) {
                list2.add(new y7(xVar.g(), xVar.c(), adDataCreateAdDataForNetworkAdapter, xVar, null, null));
            } else if (!xVar.p()) {
                list.add(xVar.c());
                sb.append(xVar.g() + xVar.c() + ",");
            }
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronLog.INTERNAL.verbose();
        l.a(ironSourceBannerLayout, new b(ironSourceBannerLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z2) {
        i iVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.j);
        if (this.f26110i.j()) {
            iVar = z2 ? i.AUCTION : i.FIRST_AUCTION;
        } else {
            iVar = z2 ? i.RELOADING : i.LOADING;
        }
        if (!a(i.STARTED_LOADING, iVar)) {
            ironLog.error("wrong state - " + this.j);
            return;
        }
        this.D = new ib();
        this.s = "";
        this.t = null;
        this.f26112n = 0;
        this.f26113p = this.f26108e.a(IronSource.AD_UNIT.BANNER);
        a(z2 ? ac.BN_RELOAD : ac.BN_LOAD);
        if (this.f26110i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(ad_unit);
        f();
        if (!a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (n.a().b(ad_unit)) {
            ironLog.verbose("can't load banner - already has pending invocation");
        } else {
            l.a(ironSourceBannerLayout, h7Var, new a(h7Var, ironSourceBannerLayout));
        }
    }

    private boolean b(ac acVar) {
        return acVar == ac.BN_CALLBACK_RELOAD_ERROR || acVar == ac.BN_CALLBACK_LOAD_SUCCESS || acVar == ac.BN_CALLBACK_LOAD_ERROR || acVar == ac.BN_CALLBACK_RELOAD_SUCCESS || acVar == ac.BN_CALLBACK_SHOW || acVar == ac.BN_CALLBACK_CLICK || acVar == ac.BN_CALLBACK_LEAVE_APP || acVar == ac.BN_AUCTION_FAILED || acVar == ac.BN_AUCTION_SUCCESS || acVar == ac.BN_AD_UNIT_CAPPED;
    }

    @Override // com.p004ironsource.xq
    public void a(IronSourceError ironSourceError, x xVar, boolean z2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (xVar.x() == this.s) {
            if (s()) {
                this.f26104A.put(xVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
                t();
                return;
            } else {
                ironLog.warning("wrong state - mCurrentState = " + this.j);
                return;
            }
        }
        ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.s);
        xVar.a(ac.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 3}, new Object[]{"reason", "Wrong auction " + xVar.x() + " State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        NetworkSettings networkSettings2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
        AbstractAdapter abstractAdapterA = com.p004ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            networkSettings2 = networkSettings;
            x xVar = new x(this.f26110i, this, networkSettings2, abstractAdapterA, this.f26113p, p());
            this.q.put(xVar.c(), xVar);
        } else {
            networkSettings2 = networkSettings;
            ironLog.verbose(networkSettings2.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose("Done initializing provider " + networkSettings2.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.j = iVar;
        }
    }

    @Override // com.p004ironsource.xq
    public void a(x xVar) {
        m5 m5Var;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(xVar.f());
        if (q()) {
            if (this.f26110i.j() && this.f26110i.b().r() && (m5Var = this.f26116z.get(xVar.c())) != null) {
                a(xVar, m5Var);
            }
            a(ac.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.j);
        String strC = xVar.c();
        a(ac.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
    }

    @Override // com.p004ironsource.xq
    public void a(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + xVar.f());
        if (xVar.x() != this.s) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.s);
            xVar.a(ac.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 2}, new Object[]{"reason", "Wrong auction id " + xVar.x() + " State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
            return;
        }
        if (!s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
            return;
        }
        x xVar2 = this.o;
        if (xVar2 != null) {
            xVar2.q();
        }
        g(xVar);
        this.o = xVar;
        b(xVar, view, layoutParams);
        this.f26104A.put(xVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
        if (this.f26110i.j()) {
            m5 m5Var = this.f26116z.get(xVar.c());
            if (m5Var != null) {
                a(m5Var.a(l()), m5Var.d());
                this.f26115w.a(m5Var, xVar.g(), this.x);
                this.f26115w.a(this.r, this.f26116z, xVar.g(), this.x, m5Var);
                if (!this.f26110i.b().r()) {
                    a(xVar, m5Var);
                }
            } else {
                String strC = xVar.c();
                StringBuilder sbY = android.support.v4.media.a.y("onLoadSuccess winner instance ", strC, " missing from waterfall. auctionId = ");
                sbY.append(this.s);
                ironLog.error(sbY.toString());
                a(ac.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{"errorCode", 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
            }
        }
        if (this.j == i.LOADING) {
            if (g()) {
                t5.a().d(this.d);
                objArr = new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.D))}};
            } else {
                objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{"duration", Long.valueOf(ib.a(this.D))}};
            }
            a(ac.BN_CALLBACK_LOAD_SUCCESS, objArr);
        } else {
            if (g()) {
                t5.a().d(this.d);
            }
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            a(ac.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(ib.a(this.D))}});
        }
        n();
        this.f.b(IronSource.AD_UNIT.BANNER);
        a(i.LOADED);
        this.k.a(TimeUnit.SECONDS.toMillis(this.f26110i.f()));
    }

    private void a(x xVar, m5 m5Var) {
        this.f26115w.a(m5Var, xVar.g(), this.x, l());
        a(this.f26116z.get(xVar.c()), l());
    }

    private void a(List<NetworkSettings> list, k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    @Override // com.p004ironsource.r4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
            return;
        }
        this.f26114u = "";
        this.s = str;
        this.v = i2;
        this.x = m5Var;
        this.t = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            a(ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i3)}, new Object[]{"reason", str2}});
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(jSONObject2, ad_unit);
        if (!this.f25952b.a(ad_unit)) {
            a(ac.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            a(this.j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
            a(ac.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        a(ac.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
        i iVar = this.j;
        a(i.READY_TO_LOAD);
        if (iVar == i.FIRST_AUCTION) {
            n.a().b(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb));
        if (map.size() == 0 && list.size() == 0) {
            a(ac.BN_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", 1005}, new Object[]{"duration", 0}});
            if (a(i.AUCTION, i.LOADED)) {
                this.k.a(TimeUnit.SECONDS.toMillis(this.f26110i.f()));
                return;
            }
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
            a(ac.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", 1005}});
            a(i.READY_TO_LOAD);
            return;
        }
        a(ac.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
        com.p004ironsource.mediationsdk.e eVar = this.f26115w;
        if (eVar != null) {
            eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.y, this.f26113p, this.f25953c, j());
        } else {
            ironLog.error("mAuctionHandler is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<y7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb);
            return;
        }
        b8 b8Var = new b8();
        e eVar = new e(map, sb, list);
        a(ac.BN_COLLECT_TOKENS);
        b8Var.a(list2, eVar, this.f26107F, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        byte b2;
        try {
            String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (!description.equals(l.f25926c)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 72205083:
                    if (!description.equals(l.f25925b)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 79011241:
                    if (!description.equals(l.f25927e)) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1951953708:
                    if (!description.equals("BANNER")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1999208305:
                    if (!description.equals(l.f)) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                jSONObject.put(l.f25928h, 1);
            } else if (b2 == 1) {
                jSONObject.put(l.f25928h, 2);
            } else if (b2 == 2) {
                jSONObject.put(l.f25928h, 3);
            } else if (b2 == 3) {
                jSONObject.put(l.f25928h, 5);
            } else if (b2 == 4) {
                jSONObject.put(l.f25928h, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                String str = l.q;
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
    }

    private boolean a(i iVar, i iVar2) {
        boolean z2;
        synchronized (this.C) {
            try {
                if (this.j == iVar) {
                    IronLog.INTERNAL.verbose("set state from '" + this.j + "' to '" + iVar2 + "'");
                    this.j = iVar2;
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
