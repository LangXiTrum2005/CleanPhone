package com.p004ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.NetworkStateReceiver;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.h;
import com.p004ironsource.mediationsdk.i;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.n;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.s7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p7<Smash extends s7<?>, Listener extends AdapterAdListener> implements p2, r4, b2, hn, fp, InterfaceC3374o, lx, z7, vq {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AdInfo f26453A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private xk f26454B;
    final ii C;
    final ii.a D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final jg f26455E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final jg.a f26456F;
    private boolean G;
    private jv H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private AtomicBoolean f26457I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private gk f26458J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected kx<Smash> f26459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<String, h.a> f26460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.p004ironsource.mediationsdk.e f26461c;
    protected h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f26462e;
    protected String f;
    protected JSONObject g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected m5 f26463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Placement f26464i;
    protected boolean j;
    private NetworkStateReceiver k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected vt f26465l;
    protected ib m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ib f26466n;
    protected t0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected f f26467p;
    protected o2 q;
    protected oc r;
    protected c2 s;
    protected j2 t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected r f26468u;
    protected IronSourceSegment v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected UUID f26469w;
    protected final Object x;
    private long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f26470z;

    public class a extends ks {
        public a() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            p7.this.B();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f26472a;

        public b(NetworkSettings networkSettings) {
            this.f26472a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            p7.this.c(this.f26472a);
        }
    }

    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            p7.this.D();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p7.this.g = new JSONObject();
            p7.this.s.f24487h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            p7.this.b(map, arrayList, sb, arrayList2);
            p7.this.a(map, arrayList, sb, arrayList2);
        }
    }

    public class e implements b8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f26476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f26477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f26478c;

        public e(Map map, StringBuilder sb, List list) {
            this.f26476a = map;
            this.f26477b = sb;
            this.f26478c = list;
        }

        @Override // com.ironsource.b8.b
        public void a(List<c8> list, long j, List<String> list2) {
            p7.this.s.g.a(j);
            for (c8 c8Var : list) {
                NetworkSettings networkSettingsA = p7.this.o.a(c8Var.c());
                Map<String, Object> mapB = p7.this.b(networkSettingsA, com.p004ironsource.mediationsdk.c.b().b(networkSettingsA, p7.this.o.getAdUnit(), p7.this.k()));
                if (c8Var.a() != null) {
                    this.f26476a.put(c8Var.c(), c8Var.a());
                    StringBuilder sb = this.f26477b;
                    sb.append(c8Var.d());
                    sb.append(c8Var.c());
                    sb.append(",");
                    p7.this.s.g.a(mapB, c8Var.e());
                } else {
                    p7.this.s.g.a(mapB, c8Var.e(), c8Var.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = p7.this.o.a(it.next());
                p7.this.s.g.b(p7.this.b(networkSettingsA2, com.p004ironsource.mediationsdk.c.b().b(networkSettingsA2, p7.this.o.getAdUnit(), p7.this.k())), j);
            }
            p7.this.a((Map<String, Object>) this.f26476a, (List<String>) this.f26478c, this.f26477b.toString());
        }

        @Override // com.ironsource.b8.b
        public void onFailure(String str) {
            p7.this.s.g.a(str);
            p7.this.a((Map<String, Object>) this.f26476a, (List<String>) this.f26478c, this.f26477b.toString());
        }
    }

    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public p7(fg fgVar, eg egVar, t0 t0Var, xk xkVar, IronSourceSegment ironSourceSegment) {
        this.f = "";
        this.j = false;
        this.x = new Object();
        this.y = 0L;
        this.f26457I = new AtomicBoolean(false);
        this.f26469w = UUID.randomUUID();
        this.C = fgVar.k();
        this.D = egVar.e();
        this.f26455E = fgVar.C();
        this.f26456F = egVar.m();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + t0Var.getAdUnit() + ", loading mode = " + t0Var.getLoadingData().a());
        StringBuilder sb = new StringBuilder();
        sb.append(t0Var.getAdUnit());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.sendAutomationLog(sb.toString());
        ib ibVar = new ib();
        this.f26458J = a(t0Var);
        this.v = ironSourceSegment;
        this.o = t0Var;
        this.s = new c2(t0Var.getAdUnit(), c2.b.MEDIATION, this);
        this.t = g();
        this.q = h();
        a(f.NONE);
        this.f26454B = xkVar;
        this.f26459a = new kx<>(this.o.getAuctionSettings().f(), this.o.getAuctionSettings().i(), this);
        this.s.f24486e.a(o(), this.o.getLoadingData().a().toString());
        this.f26460b = new ConcurrentHashMap<>();
        this.f26464i = null;
        G();
        this.g = new JSONObject();
        if (this.o.q()) {
            this.f26461c = new com.p004ironsource.mediationsdk.e(new com.p004ironsource.mediationsdk.f(this.o.getAuctionSettings(), IronSourceUtils.getSessionId()));
        }
        this.d = new h(this.o.j(), this.o.getAuctionSettings().c());
        s();
        r();
        this.m = new ib();
        a(f.READY_TO_LOAD);
        this.r = new oc(t0Var.getAdExpirationInMinutes(), this);
        this.f26468u = new r();
        this.s.f24486e.a(ib.a(ibVar));
        if (this.o.getLoadingData().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.x) {
            try {
                if (this.o.getLoadingData().e() && this.f26465l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(y1.a(this.o.getAdUnit()), "all smashes are capped", false);
                } else if (!t() && this.f26467p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(y1.d(this.o.getAdUnit()), "load cannot be invoked while showing an ad"));
                } else {
                    if (this.o.getLoadingData().a() == m2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.o.getLoadingData().a() == m2.a.MANUAL_WITH_LOAD_ON_SHOW || (((fVar = this.f26467p) == f.READY_TO_LOAD || fVar == f.READY_TO_SHOW) && !n.a().b(this.o.getAdUnit()))) {
                        this.g = new JSONObject();
                        F();
                        if (v()) {
                            this.s.f.a();
                        } else {
                            this.s.f.a(q());
                        }
                        this.f26466n = new ib();
                        if (this.o.q()) {
                            if (!this.f26460b.isEmpty()) {
                                this.d.a(this.f26460b);
                                this.f26460b.clear();
                            }
                            K();
                        } else {
                            a(f.LOADING);
                        }
                        if (this.o.q()) {
                            return;
                        }
                        ironLog.verbose(b("auction disabled"));
                        L();
                        C();
                        return;
                    }
                    IronLog.API.error(b("load is already in progress"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void C() {
        qx<Smash> qxVarE = E();
        if (qxVarE.c()) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = qxVarE.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private qx<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new px(this.o).d(this.f26459a.b());
    }

    private void F() {
        this.f26468u.a(this.o.getAdUnit(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.x) {
            try {
                f fVar = this.f26467p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.f26457I.set(false);
                long jK = this.o.getAuctionSettings().k() - ib.a(this.m);
                if (jK > 0) {
                    new Timer().schedule(new c(), jK);
                } else {
                    D();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void L() {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    private gk a(t0 t0Var) {
        if (t0Var.getSharedManagersThread()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
        AdData adDataA = a(networkSettings, this.o.getUserId());
        AdapterBaseInterface adapterBaseInterfaceB = com.p004ironsource.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                q9.d().a(e2);
                this.s.j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(b("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.p004ironsource.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.f26459a.a(this.o.getLoadingData().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.o.getAdUnit());
        }
        return false;
    }

    private List<m5> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.getAdUnit()) && d(networkSettings)) {
                ut utVar = new ut(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit()));
                if (!this.f26465l.b(utVar)) {
                    copyOnWriteArrayList.add(new m5(utVar.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.p004ironsource.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.o.getProvidersParallelInit(), this.o.getWaitUntilAllProvidersFinishInit(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new ut(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit())));
        }
        vt vtVar = new vt();
        this.f26465l = vtVar;
        vtVar.a(arrayList);
    }

    public void A() {
        if (c()) {
            a(new a());
        } else {
            B();
        }
    }

    public void G() {
        n.a().a(this.o.getAdUnit(), this.o.getDelayLoadFailure());
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return true;
    }

    public void J() {
        Iterator<NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.p004ironsource.mediationsdk.c.b().b(it.next(), this.o.getAdUnit(), k());
        }
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i2, String str, m5 m5Var);

    public String b(String str) {
        String str2 = this.o.getAdUnit().name() + " state:" + this.f26467p;
        return TextUtils.isEmpty(str) ? str2 : android.support.v4.media.a.D(str2, " - ", str);
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    /* JADX WARN: Code duplicated, block: B:16:0x009c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0090, B:13:0x0096, B:19:0x00a9, B:16:0x009c, B:18:0x00a2), top: B:37:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a2 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0090, B:13:0x0096, B:19:0x00a9, B:16:0x009c, B:18:0x00a2), top: B:37:0x0090 }] */
    @Override // com.p004ironsource.p2
    public void e(s7<?> s7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(s7Var.k()));
        if (!s7Var.h().equals(this.f26459a.c())) {
            ironLog.error(b("invoked from " + s7Var.c() + " with state = " + this.f26467p + " auctionId: " + s7Var.h() + " and the current id is " + this.f26459a.c()));
            lw lwVar = this.s.j;
            StringBuilder sb = new StringBuilder("onAdLoadSuccess invoked with state = ");
            sb.append(this.f26467p);
            lwVar.p(sb.toString());
            return;
        }
        if (this.o.getCom.ironsource.mediationsdk.d.z java.lang.String()) {
            List<Smash> listB = this.f26459a.b();
            px pxVar = new px(this.o);
            boolean zA = pxVar.a(s7Var, listB);
            synchronized (this.x) {
                if (zA) {
                    try {
                        if (w()) {
                            i(s7Var);
                        } else if (pxVar.a(listB)) {
                            i(pxVar.c(listB));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (pxVar.a(listB)) {
                    i(pxVar.c(listB));
                }
            }
        }
        this.f26460b.put(s7Var.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long jA = ib.a(this.f26466n);
            if (v()) {
                this.s.f.a(jA);
            } else {
                this.s.f.a(jA, q());
            }
            if (this.o.getLoadingData().e()) {
                this.r.a(0L);
            }
            if (!this.o.getCom.ironsource.mediationsdk.d.z java.lang.String()) {
                i(s7Var);
            }
            h(s7Var);
        }
    }

    @Override // com.p004ironsource.p2
    public void f(s7<?> s7Var) {
        IronLog.INTERNAL.verbose(b(s7Var.k()));
        this.s.f24488i.a(n());
        this.t.a(this.f26464i, s7Var.f());
    }

    public abstract j2 g();

    public void g(s7<?> s7Var) {
        this.t.d(s7Var.f());
    }

    public o2 h() {
        return new o2(this.o.getLoadingData(), this);
    }

    public String i() {
        return b((String) null);
    }

    public UUID k() {
        return this.f26469w;
    }

    public abstract String l();

    public String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    public String n() {
        Placement placement = this.f26464i;
        return placement == null ? "" : placement.getPlacementName();
    }

    public abstract String o();

    public boolean q() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public abstract boolean v();

    public boolean w() {
        boolean z2;
        synchronized (this.x) {
            try {
                f fVar = this.f26467p;
                z2 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public boolean x() {
        boolean z2;
        synchronized (this.x) {
            z2 = this.f26467p == f.READY_TO_SHOW;
        }
        return z2;
    }

    public boolean y() {
        boolean z2;
        synchronized (this.x) {
            z2 = this.f26467p == f.AUCTION;
        }
        return z2;
    }

    public boolean z() {
        boolean z2;
        synchronized (this.x) {
            z2 = this.f26467p == f.LOADING;
        }
        return z2;
    }

    public p7(t0 t0Var, xk xkVar, IronSourceSegment ironSourceSegment) {
        this(on.U(), on.O(), t0Var, xkVar, ironSourceSegment);
    }

    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    @Override // com.p004ironsource.vq
    public boolean c() {
        gk gkVar = this.f26458J;
        if (gkVar == null || gkVar == Thread.currentThread()) {
            return false;
        }
        return this.o.getSharedManagersThread();
    }

    public void h(s7<?> s7Var) {
        if (this.o.getLoadingData().f()) {
            a(s7Var, s7Var.f());
        } else {
            a(true, false, s7Var);
        }
    }

    public void i(s7<?> s7Var) {
        if (this.o.q() && this.f26457I.compareAndSet(false, true)) {
            m5 m5VarI = s7Var.i();
            this.f26461c.a(m5VarI, s7Var.l(), this.f26463h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, m5> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f26459a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f26461c.a(arrayList, concurrentHashMap, s7Var.l(), this.f26463h, m5VarI);
        }
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f26459a.a(adapterBaseInterface, this.o.getAdUnit(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.o.getAdUnit());
    }

    public BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.p004ironsource.mediationsdk.c.b().a(networkSettings, ad_unit, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    private boolean c(z1 z1Var) {
        return new ArrayList(Arrays.asList(z1.LOAD_AD_SUCCESS, z1.LOAD_AD_FAILED, z1.LOAD_AD_FAILED_WITH_REASON, z1.AUCTION_SUCCESS, z1.AUCTION_FAILED, z1.AUCTION_FAILED_NO_CANDIDATES, z1.AD_FORMAT_CAPPED, z1.AD_OPENED, z1.SHOW_AD, z1.SHOW_AD_FAILED, z1.AD_CLICKED, z1.RELOAD_AD_FAILED_WITH_REASON, z1.RELOAD_AD_SUCCESS, z1.AD_LEFT_APPLICATION)).contains(z1Var);
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.getAdUnit(), str);
    }

    private Smash a(m5 m5Var, String str) {
        NetworkSettings networkSettingsA = this.o.a(m5Var.c());
        if (networkSettingsA == null) {
            String str2 = "could not find matching provider settings for auction response item - item = " + m5Var.c() + " state = " + this.f26467p;
            IronLog.INTERNAL.error(b(str2));
            this.s.j.i(str2);
            return null;
        }
        com.p004ironsource.mediationsdk.c.b().b(networkSettingsA, this.o.getAdUnit(), k());
        BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.o.getAdUnit());
        if (baseAdAdapterA != null) {
            Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.o.getAdUnit()), str, m5Var);
            this.f26460b.put(m5Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
            return smash;
        }
        IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
        return null;
    }

    private boolean c(boolean z2) {
        Boolean bool = this.f26470z;
        if (bool == null) {
            return false;
        }
        if (z2 && !bool.booleanValue() && u()) {
            return true;
        }
        return !z2 && this.f26470z.booleanValue();
    }

    public String a(m5 m5Var, int i2) {
        return androidx.datastore.preferences.protobuf.a.f(i2, m5Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.getAdUnit())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
            return map;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
            return map;
        }
    }

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    public void b(m5 m5Var, String str) {
        if (m5Var == null) {
            IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
            c2 c2Var = this.s;
            if (c2Var != null) {
                c2Var.j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
                return;
            }
            return;
        }
        ImpressionData impressionDataA = m5Var.a(str);
        if (impressionDataA != null) {
            for (ImpressionDataListener impressionDataListener : new HashSet(this.f26454B.a())) {
                IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataA));
                impressionDataListener.onImpressionSuccess(impressionDataA);
            }
        }
    }

    private String a(List<m5> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f26460b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            m5 m5Var = list.get(i2);
            s7 s7VarA = a(m5Var, str);
            if (s7VarA != null) {
                copyOnWriteArrayList.add(s7VarA);
                sb.append(a(m5Var, s7VarA.l()));
            }
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f26459a.a(this.o.getLoadingData().a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    @Override // com.p004ironsource.p2
    public void b(s7<?> s7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(s7Var.k()));
        this.s.f24488i.g(n());
        this.f26459a.a(s7Var);
        this.f26459a.b(s7Var);
        this.f26465l.a(s7Var);
        if (this.f26465l.b(s7Var)) {
            ironLog.verbose(b(s7Var.c() + " was session capped"));
            s7Var.N();
            IronSourceUtils.sendAutomationLog(s7Var.c() + " was session capped");
        }
        this.f26456F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.o.getAdUnit());
        if (this.f26455E.b(ContextProvider.getInstance().getApplicationContext(), this.f26464i, this.o.getAdUnit())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.s.f24488i.b(n(), null);
        }
        this.D.b(this.o.getAdUnit());
        if (this.o.q()) {
            m5 m5VarI = s7Var.i();
            this.f26461c.a(m5VarI, s7Var.l(), this.f26463h, n());
            this.f26460b.put(s7Var.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(m5VarI, n());
            }
        }
        g(s7Var);
        if (this.o.getLoadingData().e()) {
            b(false);
        }
        this.q.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<y7> list2) {
        StringBuilder sb2;
        String providerName;
        for (NetworkSettings networkSettings : this.o.j()) {
            jv jvVar = this.H;
            if (jvVar == null || jvVar.a(networkSettings, this.o.getAdUnit())) {
                if (!this.f26465l.b(new ut(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.o.getAdUnit())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.p004ironsource.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
                        if (adapterBaseInterfaceB instanceof a8) {
                            list2.add(new y7(networkSettings.getInstanceType(this.o.getAdUnit()), networkSettings.getProviderInstanceName(), adDataA, (a8) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            if (adapterBaseInterfaceB == null) {
                                sb2 = new StringBuilder("prepareAuctionCandidates - could not load network adapter ");
                                providerName = networkSettings.getProviderName();
                            } else {
                                sb2 = new StringBuilder("network adapter ");
                                sb2.append(networkSettings.getProviderName());
                                providerName = " does not implementing BiddingDataInterface";
                            }
                            sb2.append(providerName);
                            this.s.j.g(sb2.toString());
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.getAdUnit()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(",");
                    }
                }
            }
        }
    }

    public Map<String, Object> a(z1 z1Var) {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapS.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapS.put("genericParams", this.g);
        }
        mapS.put("sessionDepth", Integer.valueOf(this.C.a(this.o.getAdUnit())));
        if (c(z1Var)) {
            mapS.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f26462e));
            if (!TextUtils.isEmpty(this.f)) {
                mapS.put(IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(z1Var) && !TextUtils.isEmpty(this.f26459a.c())) {
            mapS.put("auctionId", this.f26459a.c());
        }
        return mapS;
    }

    private void b(JSONObject jSONObject) {
        IronLog ironLog;
        String strR;
        int i2;
        try {
            if (jSONObject == null) {
                this.o.b(false);
                ironLog = IronLog.INTERNAL;
                strR = "loading configuration from auction response is null, using the following: " + this.o.r();
            } else {
                try {
                    if (jSONObject.has(com.p004ironsource.mediationsdk.d.x) && (i2 = jSONObject.getInt(com.p004ironsource.mediationsdk.d.x)) > 0) {
                        this.o.a(i2);
                    }
                    if (jSONObject.has(com.p004ironsource.mediationsdk.d.y)) {
                        this.o.a(jSONObject.getBoolean(com.p004ironsource.mediationsdk.d.y));
                    }
                    this.o.b(jSONObject.optBoolean(com.p004ironsource.mediationsdk.d.f25777z, false));
                    ironLog = IronLog.INTERNAL;
                    strR = this.o.r();
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("failed to update loading configuration for" + this.o.getAdUnit() + " Error: " + e2.getMessage());
                    ironLog2.verbose(b(this.o.r()));
                    return;
                }
            }
            ironLog.verbose(b(strR));
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(b(this.o.r()));
            throw th;
        }
    }

    public void b(boolean z2) {
        a(false, z2, (s7<?>) null);
    }

    private boolean b(z1 z1Var) {
        return !new ArrayList(Arrays.asList(z1.INIT_STARTED, z1.LOAD_AD, z1.AUCTION_REQUEST, z1.AUCTION_REQUEST_WATERFALL, z1.AUCTION_FAILED_NO_CANDIDATES, z1.COLLECT_TOKEN, z1.COLLECT_TOKENS_COMPLETED, z1.COLLECT_TOKENS_FAILED, z1.INSTANCE_COLLECT_TOKEN, z1.INSTANCE_COLLECT_TOKEN_SUCCESS, z1.INSTANCE_COLLECT_TOKEN_FAILED, z1.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(z1Var);
    }

    @Override // com.p004ironsource.InterfaceC3374o
    public void a() {
        if (this.o.getLoadingData().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    @Override // com.p004ironsource.lx
    public void a(int i2) {
        this.s.j.v("waterfalls hold too many with size = " + i2);
    }

    @Override // com.p004ironsource.r4
    public void a(int i2, String str, int i3, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            String str3 = "unexpected auction fail - error = " + i2 + ", " + str + " state = " + this.f26467p;
            ironLog.error(b(str3));
            this.s.j.j(str3);
            return;
        }
        String str4 = "Auction failed (error " + i2 + " - " + str + ")";
        ironLog.verbose(b(str4));
        IronSourceUtils.sendAutomationLog(l() + ": " + str4);
        this.f26462e = i3;
        this.f = str2;
        this.g = new JSONObject();
        if (this.o.getAuctionSettings().n()) {
            ironLog.verbose(b("Moving to fallback waterfall"));
            L();
        }
        this.s.f24487h.a(j, i2, str);
        a(f.LOADING);
        C();
    }

    public void a(int i2, String str, boolean z2) {
        int i3;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i2 + ", errorReason = " + str));
        if (this.o.getLoadingData().f()) {
            if (z2) {
                i3 = i2;
                str2 = str;
            } else {
                i3 = i2;
                str2 = str;
                this.s.f.a(ib.a(this.f26466n), i3, str2, q());
            }
            a(new IronSourceError(i3, str2));
        } else {
            if (!z2) {
                this.s.j.b(i2, str);
            }
            b(false);
        }
        this.q.e();
    }

    public void a(Context context, i iVar, r4 r4Var) {
        com.p004ironsource.mediationsdk.e eVar = this.f26461c;
        if (eVar != null) {
            eVar.a(context, iVar, r4Var);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    public void a(Context context, boolean z2) {
        IronLog.INTERNAL.verbose(b("track = " + z2));
        try {
            this.j = z2;
            if (z2) {
                if (this.k == null) {
                    this.k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    public void a(j2 j2Var) {
        this.t = j2Var;
    }

    public void a(jv jvVar) {
        this.H = jvVar;
        this.G = jvVar != null;
        this.f26470z = null;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.v = ironSourceSegment;
    }

    public void a(IronSourceError ironSourceError) {
        n.a().b(this.o.getAdUnit(), ironSourceError);
    }

    @Override // com.p004ironsource.p2
    public void a(IronSourceError ironSourceError, s7<?> s7Var) {
        qx<Smash> qxVarE;
        s7<?> s7VarC;
        synchronized (this.x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(s7Var.k() + " - error = " + ironSourceError));
                if (s7Var.h().equals(this.f26459a.c()) && this.f26467p != f.AUCTION) {
                    this.f26460b.put(s7Var.c(), h.a.ISAuctionPerformanceFailedToLoad);
                    if (z() || x()) {
                        qxVarE = E();
                        if (qxVarE.c()) {
                            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                        }
                    } else {
                        qxVarE = null;
                    }
                    if (qxVarE == null) {
                        return;
                    }
                    if (this.o.getCom.ironsource.mediationsdk.d.z java.lang.String()) {
                        synchronized (this.x) {
                            try {
                                if (qxVarE.b() && w() && (s7VarC = new px(this.o).c(this.f26459a.b())) != null) {
                                    i(s7VarC);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Iterator<Smash> it = qxVarE.a().iterator();
                    while (it.hasNext()) {
                        it.next().E();
                    }
                    return;
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + s7Var.c() + " with state =" + this.f26467p + " auctionId: " + s7Var.h() + " and the current id is " + this.f26459a.c()));
                lw lwVar = this.s.j;
                StringBuilder sb = new StringBuilder("onAdLoadFailed was invoked with state =");
                sb.append(this.f26467p);
                lwVar.o(sb.toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.p004ironsource.z7
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.p004ironsource.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
        if (adapterBaseInterfaceB != null) {
            this.s.g.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    public void a(f fVar) {
        synchronized (this.x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f26467p = fVar;
        }
    }

    public void a(s7<?> s7Var, AdInfo adInfo) {
        this.t.c(adInfo);
    }

    @Override // com.p004ironsource.vq
    public void a(Runnable runnable) {
        gk gkVar = this.f26458J;
        if (gkVar != null) {
            gkVar.a(runnable);
        }
    }

    @Override // com.p004ironsource.z7
    public void a(String str) {
        this.s.j.g(str);
    }

    @Override // com.p004ironsource.r4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i2, long j, int i3, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            StringBuilder sbY = android.support.v4.media.a.y("unexpected auction success for auctionId - ", str, " state = ");
            sbY.append(this.f26467p);
            ironLog.error(b(sbY.toString()));
            this.s.j.k("unexpected auction success, state = " + this.f26467p);
            return;
        }
        this.f = "";
        this.f26462e = i2;
        this.f26463h = m5Var;
        this.g = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.s.j.a(i3, str2);
        }
        a(jSONObject2);
        if (this.f26468u.a(this.o.getAdUnit())) {
            this.s.f24487h.a(str);
            a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
            return;
        }
        String strA = a(list, str);
        this.s.f24487h.a(j, this.o.r() + ";wtf=" + list.size());
        this.s.f24487h.c(strA);
        a(f.LOADING);
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z2 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.f24487h.a(1005, "No candidates available for auctioning");
            a(y1.e(this.o.getAdUnit()), "no available ad to load", false);
            return;
        }
        this.s.f24487h.b(str);
        if (this.f26461c == null) {
            ironLog.error(b("mAuctionHandler is null"));
            return;
        }
        int iA = this.C.a(this.o.getAdUnit());
        i iVar = new i(this.o.getAdUnit());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(map);
        iVar.a(list);
        iVar.a(this.d);
        iVar.a(iA);
        iVar.a(this.v);
        iVar.d(this.G);
        jv jvVar = this.H;
        if (jvVar != null && jvVar.b()) {
            z2 = true;
        }
        iVar.e(z2);
        a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<y7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        b8 b8Var = new b8();
        e eVar = new e(map, sb, list);
        this.s.g.a();
        b8Var.a(list2, eVar, this.o.getCollectBiddingDataTimeout(), TimeUnit.MILLISECONDS);
    }

    private void a(JSONObject jSONObject) {
        this.f26468u.a(this.o.getAdUnit(), jSONObject != null ? jSONObject.optBoolean(com.p004ironsource.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    @Override // com.p004ironsource.fp
    public void a(boolean z2) {
        if (!this.j || this.o.getLoadingData().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z2);
        if (c(z2)) {
            a(z2, false, (s7<?>) null);
        }
    }

    public void a(boolean z2, boolean z3, s7<?> s7Var) {
        synchronized (this.x) {
            try {
                Boolean bool = this.f26470z;
                if (bool == null || bool.booleanValue() != z2) {
                    this.f26470z = Boolean.valueOf(z2);
                    long time = 0;
                    if (this.y != 0) {
                        time = new Date().getTime() - this.y;
                    }
                    this.y = new Date().getTime();
                    this.s.f.a(z2, time, z3);
                    AdInfo adInfoF = s7Var != null ? s7Var.f() : this.f26453A;
                    this.f26453A = adInfoF;
                    j2 j2Var = this.t;
                    if (!z2) {
                        adInfoF = null;
                    }
                    j2Var.a(z2, adInfoF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(f fVar, f fVar2) {
        boolean z2;
        synchronized (this.x) {
            try {
                if (this.f26467p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.f26467p = fVar2;
                    z2 = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.f26467p + ", expected state = " + fVar);
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
