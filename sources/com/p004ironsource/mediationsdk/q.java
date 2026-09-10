package com.p004ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.Z;
import com.p004ironsource.InterfaceC3374o;
import com.p004ironsource.ac;
import com.p004ironsource.b8;
import com.p004ironsource.bs;
import com.p004ironsource.c8;
import com.p004ironsource.ds;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.NetworkStateReceiver;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.fp;
import com.p004ironsource.fr;
import com.p004ironsource.fs;
import com.p004ironsource.gl;
import com.p004ironsource.gs;
import com.p004ironsource.hl;
import com.p004ironsource.jg;
import com.p004ironsource.lg;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.o5;
import com.p004ironsource.oc;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.r4;
import com.p004ironsource.vt;
import com.p004ironsource.wk;
import com.p004ironsource.y7;
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
class q extends m implements gl, gs, r4, lg, fp, InterfaceC3374o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private e f26019A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f26020B;
    private Boolean C;
    private final Object D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private oc f26021E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final long f26022F;
    private final jg.a G;
    private final jg H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private hl f26023e;
    private ConcurrentHashMap<String, m5> f;
    private ConcurrentHashMap<String, h.a> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m5 f26024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f26025i;
    private com.p004ironsource.mediationsdk.e j;
    private JSONObject k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private fs f26026l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f26027n;
    private long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f26028p;
    private int q;
    private NetworkStateReceiver r;
    private boolean s;
    private final ConcurrentHashMap<String, r> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private vt f26029u;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f26030w;
    private int x;
    private boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f26031z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f26032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bs f26033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26034c;
        final /* synthetic */ String d;

        public a(NetworkSettings networkSettings, bs bsVar, String str, String str2) {
            this.f26032a = networkSettings;
            this.f26033b = bsVar;
            this.f26034c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.a(this.f26032a, this.f26033b, this.f26034c, this.d);
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            q.this.j();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.d("makeAuction()");
            q.this.o = Z.f();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            q.this.b(map, arrayList, sb, arrayList2);
            q.this.a(map, arrayList, sb, arrayList2);
        }
    }

    public class d implements b8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f26038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f26039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26040c;

        public d(Map map, StringBuilder sb, List list) {
            this.f26038a = map;
            this.f26039b = sb;
            this.f26040c = list;
        }

        @Override // com.ironsource.b8.b
        public void a(List<c8> list, long j, List<String> list2) {
            q.this.c(ac.RV_COLLECT_TOKENS_COMPLETED, wk.a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
            for (c8 c8Var : list) {
                r rVar = (r) q.this.t.get(c8Var.c());
                if (c8Var.a() != null) {
                    this.f26038a.put(c8Var.c(), c8Var.a());
                    StringBuilder sb = this.f26039b;
                    sb.append(c8Var.d());
                    sb.append(c8Var.c());
                    sb.append(",");
                    if (rVar != null) {
                        rVar.a(ac.RV_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(c8Var.e())}});
                    }
                } else if (rVar != null) {
                    rVar.a(ac.RV_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(c8Var.e())}, new Object[]{"reason", c8Var.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) q.this.t.get(it.next());
                if (rVar2 != null) {
                    rVar2.a(ac.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
                }
            }
            q.this.a((Map<String, Object>) this.f26038a, (List<String>) this.f26040c, this.f26039b.toString());
        }

        @Override // com.ironsource.b8.b
        public void onFailure(String str) {
            q.this.c(ac.RV_COLLECT_TOKENS_FAILED, wk.a(new Object[][]{new Object[]{"reason", str}}));
            q.this.a((Map<String, Object>) this.f26038a, (List<String>) this.f26040c, this.f26039b.toString());
        }
    }

    public enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public q(List<NetworkSettings> list, bs bsVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) throws Throwable {
        super(hashSet, ironSourceSegment);
        this.f26028p = "";
        this.s = false;
        this.v = 1;
        this.D = new Object();
        this.G = on.O().m();
        this.H = on.U().C();
        long jF = Z.f();
        c(ac.RV_MANAGER_INIT_STARTED, wk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.C = null;
        this.x = bsVar.g();
        this.y = bsVar.j();
        this.f26030w = "";
        this.k = null;
        o5 o5VarK = bsVar.k();
        this.f26031z = false;
        this.f26023e = new hl(bsVar.k().f(), bsVar.k().i());
        this.f = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
        this.f26020B = Z.f();
        this.m = o5VarK.g() > 0;
        this.f26027n = o5VarK.n();
        if (this.m) {
            this.j = new com.p004ironsource.mediationsdk.e(IronSource.AD_UNIT.REWARDED_VIDEO, o5VarK, this);
        }
        this.f26026l = new fs(o5VarK, this);
        ConcurrentHashMap<String, r> concurrentHashMap = new ConcurrentHashMap<>();
        this.t = concurrentHashMap;
        a(list, bsVar, str, str2);
        this.f26025i = new h(list, o5VarK.c());
        vt vtVar = new vt();
        this.f26029u = vtVar;
        vtVar.a(new ArrayList(concurrentHashMap.values()));
        this.f26021E = new oc(bsVar.c(), this);
        this.f26022F = bsVar.l();
        c(ac.RV_MANAGER_INIT_ENDED, wk.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - jF)}}));
        a(o5VarK.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ac acVar, Map<String, Object> map) {
        a(acVar, map, false, false);
    }

    private List<m5> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (r rVar : this.t.values()) {
            if (!rVar.p() && !this.f26029u.b(rVar) && this.f26023e.b(rVar)) {
                copyOnWriteArrayList.add(new m5(rVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.f26031z) {
            b(false);
        }
        this.f26026l.a();
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void i() throws java.lang.Throwable {
        /*
            r4 = this;
            com.ironsource.hl r0 = r4.f26023e
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.c()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L37
            java.lang.String r0 = "loadSmashes -  waterfall is empty"
            r4.d(r0)
            com.ironsource.ac r0 = com.p004ironsource.ac.TROUBLESHOOTING_RV_LOAD_FAILED
            r1 = 80004(0x13884, float:1.1211E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "errorCode"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "reason"
            java.lang.String r3 = "waterfall is empty"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.Object[][] r1 = new java.lang.Object[][]{r1, r2}
            java.util.Map r1 = com.p004ironsource.wk.a(r1)
            r4.a(r0, r1)
            r4.h()
            return
        L37:
            com.ironsource.mediationsdk.q$e r0 = com.ironsource.mediationsdk.q.e.RV_STATE_LOADING_SMASHES
            r4.a(r0)
            r0 = 0
            r1 = r0
        L3e:
            com.ironsource.hl r2 = r4.f26023e
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.c()
            int r2 = r2.size()
            if (r0 >= r2) goto Lb1
            int r2 = r4.x
            if (r1 >= r2) goto Lb1
            com.ironsource.hl r2 = r4.f26023e
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.c()
            java.lang.Object r2 = r2.get(r0)
            com.ironsource.mediationsdk.r r2 = (com.p004ironsource.mediationsdk.r) r2
            boolean r3 = r2.h()
            if (r3 == 0) goto Lae
            boolean r3 = r4.y
            if (r3 == 0) goto La9
            boolean r3 = r2.p()
            if (r3 == 0) goto La9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 != 0) goto L8d
            java.lang.String r1 = "Advanced Loading: Starting to load bidder "
            r0.<init>(r1)
            java.lang.String r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = ". No other instances will be loaded at the same time."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.d(r0)
            com.p004ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
            r4.g(r2)
            return
        L8d:
            java.lang.String r1 = "Advanced Loading: Won't start loading bidder "
            r0.<init>(r1)
            java.lang.String r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = " as a non bidder is being loaded"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.d(r0)
            com.p004ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
            return
        La9:
            r4.g(r2)
            int r1 = r1 + 1
        Lae:
            int r0 = r0 + 1
            goto L3e
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.mediationsdk.q.i():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.D) {
            try {
                e eVar = this.f26019A;
                e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
                if (eVar != eVar2) {
                    a(eVar2);
                    AsyncTask.execute(new c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.k);
    }

    @Override // com.p004ironsource.gl
    public void d(r rVar) {
        this.f26023e.a(rVar);
        this.v++;
        a(rVar, "onRewardedVideoAdOpened");
        if (this.m) {
            m5 m5Var = this.f.get(rVar.c());
            if (m5Var != null) {
                hl hlVar = this.f26023e;
                hlVar.a(hlVar.d(), m5Var.a(this.f26030w), m5Var.d());
                this.j.a(m5Var, rVar.g(), this.f26024h, this.f26030w);
                this.g.put(rVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(m5Var, this.f26030w);
            } else {
                String strC = rVar.c();
                c(android.support.v4.media.a.n("onRewardedVideoAdOpened showing instance ", strC, " missing from waterfall"));
                a(ac.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, wk.a(new Object[][]{new Object[]{"errorCode", 1011}, new Object[]{"reason", "Showing missing " + this.f26019A}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        fr.a().c(this.f26023e.a(rVar.u()));
        b(false);
        this.f26026l.c();
    }

    @Override // com.p004ironsource.gl
    public void e(r rVar) {
        synchronized (this.D) {
            try {
                a(rVar, "onLoadSuccess mState=" + this.f26019A);
                if (rVar.u() != this.f26023e.d() || this.f26019A == e.RV_STATE_AUCTION_IN_PROGRESS) {
                    d("onLoadSuccess was invoked with auctionId: " + rVar.u() + " and the current id is " + this.f26023e.d());
                    ac acVar = ac.RV_MANAGER_UNEXPECTED_STATE;
                    StringBuilder sb = new StringBuilder("onLoadSuccess wrong auction ID ");
                    sb.append(this.f26019A);
                    rVar.a(acVar, new Object[][]{new Object[]{"errorCode", 2}, new Object[]{"reason", sb.toString()}});
                } else {
                    this.g.put(rVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                    e eVar = this.f26019A;
                    e eVar2 = e.RV_STATE_LOADING_SMASHES;
                    if (eVar == eVar2) {
                        a(e.RV_STATE_READY_TO_SHOW);
                        a(ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, wk.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.o)}}));
                        this.f26021E.a(0L);
                        if (this.m) {
                            m5 m5Var = this.f.get(rVar.c());
                            if (m5Var != null) {
                                hl hlVar = this.f26023e;
                                hlVar.a(hlVar.d(), m5Var.a(""), m5Var.d());
                                this.j.a(m5Var, rVar.g(), this.f26024h);
                                this.j.a(this.f26023e.c(), this.f, rVar.g(), this.f26024h, m5Var);
                            } else {
                                String strC = rVar.c();
                                c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + rVar.u() + " and the current id is " + this.f26023e.d());
                                ac acVar2 = ac.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR;
                                StringBuilder sb2 = new StringBuilder("Loaded missing ");
                                sb2.append(eVar2);
                                a(acVar2, wk.a(new Object[][]{new Object[]{"errorCode", 1010}, new Object[]{"reason", sb2.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
                            }
                        }
                        b(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p004ironsource.gl
    public void f(r rVar) {
        a(rVar, "onRewardedVideoAdEnded");
        fr.a().b();
    }

    @Override // com.p004ironsource.lg
    public void shouldTrackNetworkState(Context context, boolean z2) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z2, 0);
        try {
            this.s = z2;
            if (z2) {
                if (this.r == null) {
                    this.r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.r != null) {
                context.getApplicationContext().unregisterReceiver(this.r);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    private String a(m5 m5Var) {
        String string;
        r rVar = this.t.get(m5Var.c());
        if (rVar != null) {
            string = Integer.toString(rVar.g());
        } else {
            string = TextUtils.isEmpty(m5Var.k()) ? "1" : "2";
        }
        StringBuilder sbW = android.support.v4.media.a.w(string);
        sbW.append(m5Var.c());
        return sbW.toString();
    }

    private void g(r rVar) throws Throwable {
        String strK = this.f.get(rVar.c()).k();
        JSONObject jSONObjectA = this.f.get(rVar.c()).a();
        rVar.c(strK);
        rVar.a(strK, jSONObjectA);
    }

    @Override // com.p004ironsource.gs
    public void b() throws Throwable {
        d("onLoadTriggered: RV load was triggered in " + this.f26019A + " state");
        a(0L);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x005a A[SYNTHETIC] */
    @Override // com.p004ironsource.gl
    public void c(r rVar) throws Throwable {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (this.D) {
            try {
                a(rVar, "onLoadError mState=" + this.f26019A);
                if (rVar.u() != this.f26023e.d() || this.f26019A == e.RV_STATE_AUCTION_IN_PROGRESS) {
                    d("onLoadError was invoked with auctionId:" + rVar.u() + " and the current id is " + this.f26023e.d());
                    ac acVar = ac.RV_MANAGER_UNEXPECTED_STATE;
                    StringBuilder sb = new StringBuilder("loadError wrong auction ID ");
                    sb.append(this.f26019A);
                    rVar.a(acVar, new Object[][]{new Object[]{"errorCode", 4}, new Object[]{"reason", sb.toString()}});
                } else {
                    this.g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                    e eVar = this.f26019A;
                    if (eVar == e.RV_STATE_LOADING_SMASHES || eVar == e.RV_STATE_READY_TO_SHOW) {
                        boolean z2 = false;
                        boolean z3 = false;
                        for (r rVar2 : this.f26023e.c()) {
                            if (rVar2.h()) {
                                if (this.y && rVar2.p()) {
                                    if (z2 || z3) {
                                        String str = "Advanced Loading: Won't start loading bidder " + rVar2.c() + " as " + (z2 ? "a non bidder is being loaded" : "a non bidder was already loaded successfully");
                                        d(str);
                                        IronSourceUtils.sendAutomationLog(str);
                                        break;
                                    }
                                    String str2 = "Advanced Loading: Starting to load bidder " + rVar2.c() + ". No other instances will be loaded at the same time.";
                                    d(str2);
                                    IronSourceUtils.sendAutomationLog(str2);
                                    if (this.f.get(rVar2.c()) != null) {
                                        copyOnWriteArrayList.add(rVar2);
                                        if (this.y) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                    continue;
                                } else if (this.f.get(rVar2.c()) != null) {
                                    copyOnWriteArrayList.add(rVar2);
                                    if (this.y || !rVar.p() || rVar2.p() || copyOnWriteArrayList.size() >= this.x) {
                                        break;
                                    } else {
                                        z2 = true;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (rVar2.z()) {
                                z2 = true;
                            } else if (rVar2.A()) {
                                z3 = true;
                            }
                        }
                        if (copyOnWriteArrayList.size() == 0 && !z3 && !z2) {
                            d("onLoadError(): No other available smashes");
                            if (!this.f26031z) {
                                b(false);
                            }
                            a(ac.TROUBLESHOOTING_RV_LOAD_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{"reason", "Mediation No fill"}}));
                            a(e.RV_STATE_NOT_LOADED);
                            this.f26026l.a();
                        }
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            g((r) it.next());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(ac acVar) {
        a(acVar, (Map<String, Object>) null, false, false);
    }

    private void c(r rVar, Placement placement) {
        d("showVideo()");
        this.f26029u.a(rVar);
        if (this.f26029u.b(rVar)) {
            rVar.B();
            IronSourceUtils.sendAutomationLog(rVar.c() + " rewarded video is now session capped");
        }
        jg.a aVar = this.G;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String placementName = placement.getPlacementName();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        aVar.a(applicationContext, placementName, ad_unit);
        if (this.H.b(ContextProvider.getInstance().getApplicationContext(), placement, ad_unit)) {
            a(ac.RV_CAP_PLACEMENT);
        }
        this.f26021E.a();
        rVar.a(placement);
    }

    private void b(ac acVar, Map<String, Object> map) {
        a(acVar, map, true, true);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    private boolean c(ac acVar) {
        return acVar == ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS || acVar == ac.RV_AUCTION_SUCCESS || acVar == ac.RV_AUCTION_FAILED || acVar == ac.RV_AD_UNIT_CAPPED;
    }

    private boolean c(boolean z2) {
        Boolean bool = this.C;
        if (bool == null) {
            return false;
        }
        if (z2 && !bool.booleanValue() && d()) {
            return true;
        }
        return !z2 && this.C.booleanValue();
    }

    @Override // com.p004ironsource.gl
    public void b(r rVar) {
        String strM;
        a(rVar, "onRewardedVideoAdClosed, mediation state: " + this.f26019A.name());
        fr.a().b(this.f26023e.a(rVar.u()));
        this.f26031z = false;
        boolean z2 = this.f26019A == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            for (r rVar2 : this.f26023e.c()) {
                if (rVar2.y()) {
                    sb.append(rVar2.c() + ";");
                }
            }
        }
        ac acVar = ac.RV_INSTANCE_CLOSED;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            strM = com.google.firebase.crashlytics.internal.model.a.m(sb, "true|");
        } else {
            strM = "false";
        }
        sb2.append(strM);
        rVar.b(acVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
        if (rVar.equals(this.f26023e.f())) {
            this.f26023e.a((r) null);
            if (this.f26019A != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.p004ironsource.InterfaceC3374o
    public void a() throws Throwable {
        a(e.RV_STATE_NOT_LOADED);
        a(false, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    @Override // com.p004ironsource.r4
    public void a(int i2, String str, int i3, String str2, long j) throws Throwable {
        String str3 = "Auction failed (error " + i2 + " - " + str + ")";
        d(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.q = i3;
        this.f26028p = str2;
        this.k = null;
        if (this.f26027n) {
            d("Moving to fallback waterfall");
            k();
        }
        if (TextUtils.isEmpty(str)) {
            a(ac.RV_AUCTION_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"duration", Long.valueOf(j)}}));
        } else {
            a(ac.RV_AUCTION_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(i2)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}}));
        }
        i();
    }

    private void a(long j) throws Throwable {
        if (this.f26029u.a()) {
            d("all smashes are capped");
            a(ac.TROUBLESHOOTING_RV_LOAD_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", 80001}, new Object[]{"reason", "all smashes are capped"}}));
            h();
            return;
        }
        a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.m) {
            if (!this.g.isEmpty()) {
                this.f26025i.a(this.g);
                this.g.clear();
            }
            new Timer().schedule(new b(), j);
            return;
        }
        d("auction fallback flow starting");
        k();
        if (!this.f26023e.c().isEmpty()) {
            b(ac.RV_BUSINESS_MEDIATION_LOAD);
            i();
        } else {
            d("loadSmashes -  waterfall is empty");
            a(ac.TROUBLESHOOTING_RV_LOAD_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
        }
    }

    @Override // com.p004ironsource.lg
    public boolean d() {
        if ((!this.s || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f26019A == e.RV_STATE_READY_TO_SHOW && !this.f26031z) {
            Iterator<r> it = this.f26023e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p004ironsource.lg
    public void a(Activity activity, Placement placement) {
        synchronized (this.D) {
            try {
                if (placement == null) {
                    a("showRewardedVideo error: empty default placement");
                    IronSourceError ironSourceError = new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement");
                    fr frVarA = fr.a();
                    hl hlVar = this.f26023e;
                    frVarA.a(ironSourceError, hlVar.a(hlVar.d()));
                    a(ac.RV_CALLBACK_SHOW_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT)}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                } else {
                    this.f26030w = placement.getPlacementName();
                    b("showRewardedVideo(" + placement + ")");
                    r rVar = null;
                    b(ac.RV_API_SHOW_CALLED, activity != null ? wk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                    if (this.f26031z) {
                        a("showRewardedVideo error: can't show ad while an ad is already showing");
                        IronSourceError ironSourceError2 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing");
                        fr frVarA2 = fr.a();
                        hl hlVar2 = this.f26023e;
                        frVarA2.a(ironSourceError2, hlVar2.a(hlVar2.d()));
                        b(ac.RV_CALLBACK_SHOW_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    } else if (this.f26019A != e.RV_STATE_READY_TO_SHOW) {
                        a("showRewardedVideo error: show called while no ads are available");
                        IronSourceError ironSourceError3 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available");
                        fr frVarA3 = fr.a();
                        hl hlVar3 = this.f26023e;
                        frVarA3.a(ironSourceError3, hlVar3.a(hlVar3.d()));
                        b(ac.RV_CALLBACK_SHOW_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    } else if (this.H.b(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        String str = "showRewardedVideo error: placement " + this.f26030w + " is capped";
                        a(str);
                        IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                        fr frVarA4 = fr.a();
                        hl hlVar4 = this.f26023e;
                        frVarA4.a(ironSourceError4, hlVar4.a(hlVar4.d()));
                        b(ac.RV_CALLBACK_SHOW_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        for (r rVar2 : this.f26023e.c()) {
                            if (rVar2.A()) {
                                this.f26031z = true;
                                rVar2.b(true);
                                a(e.RV_STATE_NOT_LOADED);
                                rVar = rVar2;
                                break;
                            }
                            if (rVar2.e() != null) {
                                stringBuffer.append(rVar2.c() + ":" + rVar2.e() + ",");
                            }
                            rVar2.b(false);
                        }
                        if (rVar != null) {
                            c(rVar, placement);
                            return;
                        }
                        d("showRewardedVideo(): No ads to show");
                        fr frVarA5 = fr.a();
                        IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                        hl hlVar5 = this.f26023e;
                        frVarA5.a(ironSourceErrorBuildNoAdsToShowError, hlVar5.a(hlVar5.d()));
                        HashMap map = new HashMap();
                        map.put("errorCode", Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                        map.put("reason", "showRewardedVideo(): No ads to show");
                        if (stringBuffer.length() != 0) {
                            map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                        }
                        b(ac.RV_CALLBACK_SHOW_FAILED, map);
                        this.f26026l.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(ac acVar) {
        a(acVar, (Map<String, Object>) null, true, true);
    }

    private void a(ac acVar, Map<String, Object> map) {
        a(acVar, map, false, true);
    }

    @Override // com.p004ironsource.gl
    public void b(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdClicked");
        fr.a().a(placement, this.f26023e.a(rVar.u()));
    }

    private void a(ac acVar, Map<String, Object> map, boolean z2, boolean z3) {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapS.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z3 && !TextUtils.isEmpty(this.f26023e.d())) {
            mapS.put("auctionId", this.f26023e.d());
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapS.put("genericParams", this.k);
        }
        if (z2 && !TextUtils.isEmpty(this.f26030w)) {
            mapS.put("placement", this.f26030w);
        }
        if (c(acVar)) {
            ds.i().a(mapS, this.q, this.f26028p);
        }
        mapS.put("sessionDepth", Integer.valueOf(this.v));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    mapS.putAll(map);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        ds.i().a(new zb(acVar, new JSONObject(mapS)));
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<y7> list2) {
        for (r rVar : this.t.values()) {
            if (!this.f26029u.b(rVar) && this.f26023e.b(rVar)) {
                if (rVar.p()) {
                    list2.add(new y7(rVar.g(), rVar.c(), null, rVar, null, null));
                } else {
                    list.add(rVar.c());
                    sb.append(rVar.g() + rVar.c() + ",");
                }
            }
        }
    }

    private void b(boolean z2) {
        a(z2, (Map<String, Object>) null);
    }

    @Override // com.p004ironsource.gl
    public void a(IronSourceError ironSourceError, r rVar) {
        m5 m5Var;
        if (this.m && (m5Var = this.f.get(rVar.c())) != null) {
            hl hlVar = this.f26023e;
            hlVar.a(hlVar.d(), m5Var.a(this.f26030w), m5Var.d());
        }
        a(rVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f26031z = false;
        b(ac.RV_CALLBACK_SHOW_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        fr.a().a(ironSourceError, this.f26023e.a(rVar.u()));
        this.g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.f26019A != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.f26026l.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, bs bsVar, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
        AbstractAdapter abstractAdapterA = com.p004ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            r rVar = new r(str, str2, networkSettings, this, bsVar.h(), abstractAdapterA, this.v);
            this.t.put(rVar.c(), rVar);
        }
        ironLog.verbose("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName());
    }

    private void a(e eVar) {
        d("current state=" + this.f26019A + ", new state=" + eVar);
        this.f26019A = eVar;
    }

    @Override // com.p004ironsource.gl
    public void a(r rVar) {
        a(rVar, "onRewardedVideoAdStarted");
        fr.a().c();
    }

    @Override // com.p004ironsource.gl
    public void a(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdRewarded");
        fr.a().b(placement, this.f26023e.a(rVar.u()));
    }

    private void a(r rVar, String str) {
        String str2 = rVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(List<NetworkSettings> list, bs bsVar, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), bsVar, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(bsVar.f(), bsVar.o(), arrayList);
    }

    @Override // com.p004ironsource.r4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) throws Throwable {
        d("makeAuction(): success");
        this.f26024h = m5Var;
        this.q = i2;
        this.k = jSONObject;
        this.f26028p = "";
        if (!TextUtils.isEmpty(str2)) {
            a(ac.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, wk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(i3)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.f25952b.a(ad_unit)) {
            a(ac.RV_AD_UNIT_CAPPED, wk.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.k);
            a(ac.RV_AUCTION_SUCCESS, wk.a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
            i();
        }
    }

    private void a(List<m5> list, String str, JSONObject jSONObject) {
        this.f.clear();
        this.g.clear();
        CopyOnWriteArrayList<r> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (m5 m5Var : list) {
            sb.append(a(m5Var) + ",");
            r rVar = this.t.get(m5Var.c());
            if (rVar != null) {
                AbstractAdapter abstractAdapterA = com.p004ironsource.mediationsdk.c.b().a(rVar.f26150b.h());
                if (abstractAdapterA != null) {
                    r rVar2 = new r(rVar, this, abstractAdapterA, this.v, str, jSONObject, this.q, this.f26028p);
                    rVar2.a(true);
                    copyOnWriteArrayList.add(rVar2);
                    this.f.put(rVar2.c(), m5Var);
                    this.g.put(m5Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + m5Var.c());
            }
        }
        this.f26023e.a(copyOnWriteArrayList, str);
        if (this.f26023e.a()) {
            a(ac.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, wk.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f26023e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(ac.RV_AUCTION_RESPONSE_WATERFALL, wk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(ac.RV_AUCTION_FAILED, wk.a(new Object[][]{new Object[]{"errorCode", 1005}, new Object[]{"duration", 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
        } else {
            d(android.support.v4.media.a.C("makeAuction() - request waterfall is: ", str));
            b(ac.RV_BUSINESS_MEDIATION_LOAD);
            b(ac.RV_AUCTION_REQUEST);
            c(ac.RV_AUCTION_REQUEST_WATERFALL, wk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
            this.j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f26025i, this.v, this.f25953c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<y7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        b8 b8Var = new b8();
        d dVar = new d(map, sb, list);
        b(ac.RV_COLLECT_TOKENS);
        b8Var.a(list2, dVar, this.f26022F, TimeUnit.MILLISECONDS);
    }

    @Override // com.p004ironsource.fp
    public void a(boolean z2) {
        if (this.s) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z2, 0);
            if (c(z2)) {
                b(z2);
            }
        }
    }

    private void a(boolean z2, Map<String, Object> map) {
        synchronized (this.D) {
            try {
                Boolean bool = this.C;
                if (bool == null || bool.booleanValue() != z2) {
                    this.C = Boolean.valueOf(z2);
                    long time = new Date().getTime() - this.f26020B;
                    this.f26020B = new Date().getTime();
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put("duration", Long.valueOf(time));
                    a(z2 ? ac.RV_CALLBACK_AVAILABILITY_TRUE : ac.RV_CALLBACK_AVAILABILITY_FALSE, map);
                    fr frVarA = fr.a();
                    hl hlVar = this.f26023e;
                    frVarA.a(z2, hlVar.a(hlVar.d()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
