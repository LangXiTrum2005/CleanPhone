package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC3576j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
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

/* JADX INFO: renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3559i3<Smash extends AbstractC3576j3<?>, Listener extends AdapterAdListener> implements R0, U1, E0, Bb, InterfaceC3828xc, InterfaceC3662o, yg, InterfaceC3717r3, InterfaceC3640md {
    private AdInfo A;
    private C3583ja B;
    final K8 C;
    final K8.a D;
    protected final K7 E;
    private final K7.a F;
    private boolean G;
    private Df H;
    private AtomicBoolean I;
    private P9 J;
    protected xg<Smash> a;
    protected ConcurrentHashMap<String, C3432b2.a> b;
    protected com.ironsource.mediationsdk.e c;
    protected C3432b2 d;
    protected int e;
    protected String f;
    protected JSONObject g;
    protected C3700q2 h;
    protected C3461cd i;
    protected boolean j;
    private NetworkStateReceiver k;
    protected Oe l;
    protected C3507f5 m;
    protected C3507f5 n;
    protected W o;
    protected f p;
    protected Q0 q;
    protected L5 r;
    protected F0 s;
    protected L0 t;
    protected C3730s u;
    protected Y9 v;
    protected UUID w;
    protected final Object x;
    private long y;
    private Boolean z;

    /* JADX INFO: renamed from: com.ironsource.i3$a */
    public class a extends Xd {
        public a() {
        }

        @Override // com.ironsource.Xd
        public void a() {
            AbstractC3559i3.this.y();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$b */
    public class b implements Runnable {
        final /* synthetic */ NetworkSettings a;

        public b(NetworkSettings networkSettings) {
            this.a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3559i3.this.c(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$c */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3559i3.this.A();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3559i3.this.g = new JSONObject();
            AbstractC3559i3.this.s.h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC3559i3.this.b(map, arrayList, sb, arrayList2);
            AbstractC3559i3.this.a(map, arrayList, sb, arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$e */
    public class e implements C3751t3.b {
        final /* synthetic */ Map a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        public e(Map map, StringBuilder sb, List list) {
            this.a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.C3751t3.b
        public void a(List<C3768u3> list, long j, List<String> list2) {
            AbstractC3559i3.this.s.g.a(j);
            for (C3768u3 c3768u3 : list) {
                NetworkSettings networkSettingsA = AbstractC3559i3.this.o.a(c3768u3.c());
                Map<String, Object> mapB = AbstractC3559i3.this.b(networkSettingsA, com.ironsource.mediationsdk.c.b().b(networkSettingsA, AbstractC3559i3.this.o.b(), AbstractC3559i3.this.h()));
                if (c3768u3.a() != null) {
                    this.a.put(c3768u3.c(), c3768u3.a());
                    StringBuilder sb = this.b;
                    sb.append(c3768u3.d());
                    sb.append(c3768u3.c());
                    sb.append(",");
                    AbstractC3559i3.this.s.g.a(mapB, c3768u3.e());
                } else {
                    AbstractC3559i3.this.s.g.a(mapB, c3768u3.e(), c3768u3.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = AbstractC3559i3.this.o.a(it.next());
                AbstractC3559i3.this.s.g.b(AbstractC3559i3.this.b(networkSettingsA2, com.ironsource.mediationsdk.c.b().b(networkSettingsA2, AbstractC3559i3.this.o.b(), AbstractC3559i3.this.h())), j);
            }
            AbstractC3559i3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.C3751t3.b
        public void onFailure(String str) {
            AbstractC3559i3.this.s.g.a(str);
            AbstractC3559i3.this.a((Map<String, Object>) this.a, (List<String>) this.c, this.b.toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$f */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC3559i3(W w, C3583ja c3583ja, Y9 y9) {
        this(Gb.U(), Gb.O(), w, c3583ja, y9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        IronLog.INTERNAL.verbose(f());
        AsyncTask.execute(new d());
    }

    private Eg<Smash> B() {
        IronLog.INTERNAL.verbose();
        return new Dg(this.o).d(this.a.b());
    }

    private void C() {
        this.u.a(this.o.b(), false);
    }

    private void H() {
        IronLog.INTERNAL.verbose(f());
        synchronized (this.x) {
            try {
                f fVar = this.p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.I.set(false);
                long jK = this.o.d().k() - C3507f5.a(this.m);
                if (jK > 0) {
                    new Timer().schedule(new c(), jK);
                } else {
                    A();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void I() {
        IronLog.INTERNAL.verbose(f());
        a(g(), j());
    }

    private boolean c(boolean z) {
        Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        if (z && !bool.booleanValue() && r()) {
            return true;
        }
        return !z && this.z.booleanValue();
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.a.a(this.o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.o.b());
        }
        return false;
    }

    private List<C3700q2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.b()) && d(networkSettings)) {
                Ne ne = new Ne(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()));
                if (!this.l.b(ne)) {
                    copyOnWriteArrayList.add(new C3700q2(ne.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int m() {
        return 1;
    }

    private void o() {
        IronLog.INTERNAL.verbose(f());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.o.k(), this.o.p(), arrayList);
    }

    private void p() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new Ne(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b())));
        }
        Oe oe = new Oe();
        this.l = oe;
        oe.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        synchronized (this.x) {
            try {
                if (this.o.h().e() && this.l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(B0.a(this.o.b()), "all smashes are capped", false);
                    return;
                }
                if (!q() && this.p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(B0.d(this.o.b()), "load cannot be invoked while showing an ad"));
                    return;
                }
                if (this.o.h().a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.o.h().a() != O0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.l.a().b(this.o.b()))) {
                    IronLog.API.error(b("load is already in progress"));
                    return;
                }
                this.g = new JSONObject();
                C();
                if (s()) {
                    this.s.f.a();
                } else {
                    this.s.f.a(n());
                }
                this.n = new C3507f5();
                if (this.o.q()) {
                    if (!this.b.isEmpty()) {
                        this.d.a(this.b);
                        this.b.clear();
                    }
                    H();
                } else {
                    a(f.LOADING);
                }
                if (this.o.q()) {
                    return;
                }
                ironLog.verbose(b("auction disabled"));
                I();
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void z() {
        Eg<Smash> egB = B();
        if (egB.c()) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = egB.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    public void D() {
        com.ironsource.mediationsdk.l.a().a(this.o.b(), this.o.f());
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return true;
    }

    public void G() {
        Iterator<NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.o.b(), h());
        }
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, C3700q2 c3700q2);

    public void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            if (z) {
                if (this.k == null) {
                    this.k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (Exception e2) {
            C3631m4.d().a(e2);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public void b(boolean z) {
        a(false, z, (AbstractC3576j3<?>) null);
    }

    public abstract L0 d();

    public Q0 e() {
        return new Q0(this.o.h(), this);
    }

    public String f() {
        return b((String) null);
    }

    public void h(AbstractC3576j3<?> abstractC3576j3) {
        if (this.o.h().f()) {
            a(abstractC3576j3, abstractC3576j3.f());
        } else {
            a(true, false, abstractC3576j3);
        }
    }

    public abstract String i();

    public void i(AbstractC3576j3<?> abstractC3576j3) {
        if (this.o.q() && this.I.compareAndSet(false, true)) {
            C3700q2 c3700q2I = abstractC3576j3.i();
            this.c.a(c3700q2I, abstractC3576j3.l(), this.h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C3700q2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, abstractC3576j3.l(), this.h, c3700q2I);
        }
    }

    public String j() {
        return "fallback_" + System.currentTimeMillis();
    }

    public String k() {
        C3461cd c3461cd = this.i;
        return c3461cd == null ? "" : c3461cd.c();
    }

    public abstract String l();

    public boolean n() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract boolean s();

    public boolean t() {
        boolean z;
        synchronized (this.x) {
            try {
                f fVar = this.p;
                z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean u() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.READY_TO_SHOW;
        }
        return z;
    }

    public boolean v() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.AUCTION;
        }
        return z;
    }

    public boolean w() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.LOADING;
        }
        return z;
    }

    public void x() {
        if (c()) {
            a(new a());
        } else {
            y();
        }
    }

    @Override // com.ironsource.Bb
    public void b() {
        IronLog.INTERNAL.verbose(f());
        x();
    }

    @Override // com.ironsource.R0
    public void e(AbstractC3576j3<?> abstractC3576j3) {
        IronLog.INTERNAL.verbose(b(abstractC3576j3.k()));
        this.s.i.a(k());
        this.t.a(this.i, abstractC3576j3.f());
    }

    public AbstractC3559i3(G7 g7, F7 f7, W w, C3583ja c3583ja, Y9 y9) {
        this.f = "";
        this.j = false;
        this.x = new Object();
        this.y = 0L;
        this.I = new AtomicBoolean(false);
        this.w = UUID.randomUUID();
        this.C = g7.s();
        this.D = f7.i();
        this.E = g7.w();
        this.F = f7.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + w.b() + ", loading mode = " + w.h().a());
        StringBuilder sb = new StringBuilder();
        sb.append(w.b());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb.toString());
        C3507f5 c3507f5 = new C3507f5();
        this.J = a(w);
        this.v = y9;
        this.o = w;
        this.s = new F0(w.b(), F0.b.MEDIATION, this);
        this.t = d();
        this.q = e();
        a(f.NONE);
        this.B = c3583ja;
        this.a = new xg<>(this.o.d().f(), this.o.d().i(), this);
        this.s.e.a(l(), this.o.h().a().toString());
        this.b = new ConcurrentHashMap<>();
        this.i = null;
        D();
        this.g = new JSONObject();
        if (this.o.q()) {
            this.c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.o.d(), IronSourceUtils.d()));
        }
        this.d = new C3432b2(this.o.j(), this.o.d().c());
        p();
        o();
        this.m = new C3507f5();
        a(f.READY_TO_LOAD);
        this.r = new L5(w.a(), this);
        this.u = new C3730s();
        this.s.e.a(C3507f5.a(c3507f5));
        if (this.o.h().e()) {
            ironLog.verbose("first automatic load");
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3701q3> list2) {
        for (NetworkSettings networkSettings : this.o.j()) {
            Df df = this.H;
            if (df == null || df.a(networkSettings, this.o.b())) {
                if (!this.l.b(new Ne(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.b()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.o.b())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
                        if (adapterBaseInterfaceB instanceof InterfaceC3734s3) {
                            list2.add(new CallableC3701q3(networkSettings.getInstanceType(this.o.b()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC3734s3) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            this.s.j.g(adapterBaseInterfaceB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(",");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData adDataA = a(networkSettings, this.o.o());
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                C3631m4.d().a(e2);
                this.s.j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    public UUID h() {
        return this.w;
    }

    public void g(AbstractC3576j3<?> abstractC3576j3) {
        this.t.d(abstractC3576j3.f());
    }

    public void a(f fVar) {
        synchronized (this.x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.p = fVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a2 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0096, B:13:0x009c, B:19:0x00af, B:16:0x00a2, B:18:0x00a8), top: B:37:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a8 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0096, B:13:0x009c, B:19:0x00af, B:16:0x00a2, B:18:0x00a8), top: B:37:0x0096 }] */
    @Override // com.ironsource.R0
    public void d(AbstractC3576j3<?> abstractC3576j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC3576j3.k()));
        if (!abstractC3576j3.h().equals(this.a.c())) {
            ironLog.error(b("invoked from " + abstractC3576j3.c() + " with state = " + this.p + " auctionId: " + abstractC3576j3.h() + " and the current id is " + this.a.c()));
            Xf xf = this.s.j;
            StringBuilder sb = new StringBuilder();
            sb.append("onAdLoadSuccess invoked with state = ");
            sb.append(this.p);
            xf.p(sb.toString());
            return;
        }
        if (this.o.m()) {
            List<Smash> listB = this.a.b();
            Dg dg = new Dg(this.o);
            boolean zA = dg.a(abstractC3576j3, listB);
            synchronized (this.x) {
                if (zA) {
                    try {
                        if (t()) {
                            i(abstractC3576j3);
                        } else if (dg.a(listB)) {
                            i(dg.c(listB));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (dg.a(listB)) {
                    i(dg.c(listB));
                }
            }
        }
        this.b.put(abstractC3576j3.c(), C3432b2.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long jA = C3507f5.a(this.n);
            if (s()) {
                this.s.f.a(jA);
            } else {
                this.s.f.a(jA, n());
            }
            if (this.o.h().e()) {
                this.r.a(0L);
            }
            if (!this.o.m()) {
                i(abstractC3576j3);
            }
            h(abstractC3576j3);
        }
    }

    public boolean a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.x) {
            try {
                if (this.p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.p = fVar2;
                    z = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.p + ", expected state = " + fVar);
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    private P9 a(W w) {
        if (w.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.a.a(adapterBaseInterface, this.o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.o.b()));
    }

    public void a(L0 l0) {
        this.t = l0;
    }

    public BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    private boolean c(C0 c0) {
        return new ArrayList(Arrays.asList(C0.LOAD_AD_SUCCESS, C0.LOAD_AD_FAILED, C0.LOAD_AD_FAILED_WITH_REASON, C0.AUCTION_SUCCESS, C0.AUCTION_FAILED, C0.AUCTION_FAILED_NO_CANDIDATES, C0.AD_FORMAT_CAPPED, C0.AD_OPENED, C0.SHOW_AD, C0.SHOW_AD_FAILED, C0.AD_CLICKED, C0.RELOAD_AD_FAILED_WITH_REASON, C0.RELOAD_AD_SUCCESS, C0.AD_LEFT_APPLICATION)).contains(c0);
    }

    public void a(boolean z, boolean z2, AbstractC3576j3<?> abstractC3576j3) {
        synchronized (this.x) {
            try {
                Boolean bool = this.z;
                if (bool == null || bool.booleanValue() != z) {
                    this.z = Boolean.valueOf(z);
                    long time = 0;
                    if (this.y != 0) {
                        time = new Date().getTime() - this.y;
                    }
                    this.y = new Date().getTime();
                    this.s.f.a(z, time, z2);
                    AdInfo adInfoF = abstractC3576j3 != null ? abstractC3576j3.f() : this.A;
                    this.A = adInfoF;
                    L0 l0 = this.t;
                    if (!z) {
                        adInfoF = null;
                    }
                    l0.a(z, adInfoF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.InterfaceC3640md
    public boolean c() {
        P9 p9 = this.J;
        if (p9 == null || p9 == Thread.currentThread()) {
            return false;
        }
        return this.o.l();
    }

    private boolean b(C0 c0) {
        return !new ArrayList(Arrays.asList(C0.INIT_STARTED, C0.LOAD_AD, C0.AUCTION_REQUEST, C0.AUCTION_REQUEST_WATERFALL, C0.AUCTION_FAILED_NO_CANDIDATES, C0.COLLECT_TOKEN, C0.COLLECT_TOKENS_COMPLETED, C0.COLLECT_TOKENS_FAILED, C0.INSTANCE_COLLECT_TOKEN, C0.INSTANCE_COLLECT_TOKEN_SUCCESS, C0.INSTANCE_COLLECT_TOKEN_FAILED, C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(c0);
    }

    public void b(C3700q2 c3700q2, String str) {
        if (c3700q2 != null) {
            U8 u8A = c3700q2.a(str);
            if (u8A != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + u8A));
                    impressionDataListener.onImpressionSuccess(u8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        F0 f0 = this.s;
        if (f0 != null) {
            f0.j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.InterfaceC3662o
    public void a() {
        if (this.o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            x();
        }
    }

    @Override // com.ironsource.InterfaceC3828xc
    public void a(boolean z) {
        if (!this.j || this.o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (AbstractC3576j3<?>) null);
        }
    }

    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C3700q2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C3700q2 c3700q2 = list.get(i);
            AbstractC3576j3 abstractC3576j3A = a(c3700q2, str);
            if (abstractC3576j3A != null) {
                copyOnWriteArrayList.add(abstractC3576j3A);
                sb.append(a(c3700q2, abstractC3576j3A.l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.a.a(this.o.h().a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    private void b(JSONObject jSONObject) {
        int i;
        if (jSONObject == null) {
            this.o.b(false);
            IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.r()));
            return;
        }
        try {
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                }
                this.o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(b(this.o.r()));
            } catch (JSONException e2) {
                C3631m4.d().a(e2);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.b() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.r()));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(b(this.o.r()));
            throw th;
        }
    }

    @Override // com.ironsource.yg
    public void a(int i) {
        this.s.j.v("waterfalls hold too many with size = " + i);
    }

    private Smash a(C3700q2 c3700q2, String str) {
        NetworkSettings networkSettingsA = this.o.a(c3700q2.c());
        if (networkSettingsA != null) {
            com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.o.b(), h());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.o.b());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.o.b()), str, c3700q2);
                this.b.put(c3700q2.c(), C3432b2.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
            return null;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + c3700q2.c() + " state = " + this.p;
        IronLog.INTERNAL.error(b(str2));
        this.s.j.i(str2);
        return null;
    }

    public String b(String str) {
        String str2 = this.o.b().name() + " state:" + this.p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m()));
            return map;
        } catch (Exception e2) {
            C3631m4.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
            return map;
        }
    }

    public void a(int i, String str, boolean z) {
        int i2;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.h().f()) {
            if (z) {
                i2 = i;
                str2 = str;
            } else {
                i2 = i;
                str2 = str;
                this.s.f.a(C3507f5.a(this.n), i2, str2, n());
            }
            a(new IronSourceError(i2, str2));
        } else {
            if (!z) {
                this.s.j.b(i, str);
            }
            b(false);
        }
        this.q.e();
    }

    public void a(AbstractC3576j3<?> abstractC3576j3, AdInfo adInfo) {
        this.t.c(adInfo);
    }

    public void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.l.a().b(this.o.b(), ironSourceError);
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<CallableC3701q3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        C3751t3 c3751t3 = new C3751t3();
        e eVar = new e(map, sb, list);
        this.s.g.a();
        c3751t3.a(list2, eVar, this.o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.h.a(1005, "No candidates available for auctioning");
            a(B0.e(this.o.b()), "no available ad to load", false);
            return;
        }
        this.s.h.b(str);
        if (this.c != null) {
            int iA = this.C.a(this.o.b());
            com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.o.b());
            hVar.b(IronSourceUtils.g());
            hVar.a(map);
            hVar.a(list);
            hVar.a(this.d);
            hVar.a(iA);
            hVar.a(this.v);
            hVar.d(this.G);
            Df df = this.H;
            if (df != null && df.b()) {
                z = true;
            }
            hVar.e(z);
            a(ContextProvider.getInstance().getApplicationContext(), hVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    public void a(Context context, com.ironsource.mediationsdk.h hVar, U1 u1) {
        com.ironsource.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, hVar, u1);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C3700q2> list, String str, C3700q2 c3700q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            this.f = "";
            this.e = i;
            this.h = c3700q2;
            this.g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.s.j.a(i2, str2);
            }
            a(jSONObject2);
            if (this.u.a(this.o.b())) {
                this.s.h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String strA = a(list, str);
            this.s.h.a(j, this.o.r() + ";wtf=" + list.size());
            this.s.h.c(strA);
            a(f.LOADING);
            z();
            return;
        }
        ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.p));
        Xf xf = this.s.j;
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected auction success, state = ");
        sb.append(this.p);
        xf.k(sb.toString());
    }

    @Override // com.ironsource.U1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            String str3 = "Auction failed (error " + i + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.i(i() + ": " + str3);
            this.e = i2;
            this.f = str2;
            this.g = new JSONObject();
            if (this.o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                I();
            }
            this.s.h.a(j, i, str);
            a(f.LOADING);
            z();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.p;
        ironLog.error(b(str4));
        this.s.j.j(str4);
    }

    @Override // com.ironsource.R0
    public void a(IronSourceError ironSourceError, AbstractC3576j3<?> abstractC3576j3) {
        Eg<Smash> egB;
        AbstractC3576j3<?> abstractC3576j3C;
        synchronized (this.x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(abstractC3576j3.k() + " - error = " + ironSourceError));
                if (abstractC3576j3.h().equals(this.a.c()) && this.p != f.AUCTION) {
                    this.b.put(abstractC3576j3.c(), C3432b2.a.ISAuctionPerformanceFailedToLoad);
                    if (w() || u()) {
                        egB = B();
                        if (egB.c()) {
                            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                            return;
                        }
                    } else {
                        egB = null;
                    }
                    if (egB == null) {
                        return;
                    }
                    if (this.o.m()) {
                        synchronized (this.x) {
                            try {
                                if (egB.b() && t() && (abstractC3576j3C = new Dg(this.o).c(this.a.b())) != null) {
                                    i(abstractC3576j3C);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Iterator<Smash> it = egB.a().iterator();
                    while (it.hasNext()) {
                        it.next().E();
                    }
                    return;
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + abstractC3576j3.c() + " with state =" + this.p + " auctionId: " + abstractC3576j3.h() + " and the current id is " + this.a.c()));
                Xf xf = this.s.j;
                StringBuilder sb = new StringBuilder();
                sb.append("onAdLoadFailed was invoked with state =");
                sb.append(this.p);
                xf.o(sb.toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.R0
    public void a(AbstractC3576j3<?> abstractC3576j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC3576j3.k()));
        this.s.i.g(k());
        this.a.a(abstractC3576j3);
        this.a.b(abstractC3576j3);
        this.l.a(abstractC3576j3);
        if (this.l.b(abstractC3576j3)) {
            ironLog.verbose(b(abstractC3576j3.c() + " was session capped"));
            abstractC3576j3.N();
            IronSourceUtils.i(abstractC3576j3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), k(), this.o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.i, this.o.b())) {
            ironLog.verbose(b("placement " + k() + " is capped"));
            this.s.i.b(k(), null);
        }
        this.D.b(this.o.b());
        if (this.o.q()) {
            C3700q2 c3700q2I = abstractC3576j3.i();
            this.c.a(c3700q2I, abstractC3576j3.l(), this.h, k());
            this.b.put(abstractC3576j3.c(), C3432b2.a.ISAuctionPerformanceShowedSuccessfully);
            if (E()) {
                b(c3700q2I, k());
            }
        }
        g(abstractC3576j3);
        if (this.o.h().e()) {
            b(false);
        }
        this.q.h();
    }

    public Map<String, Object> a(C0 c0) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.g);
        }
        map.put("sessionDepth", Integer.valueOf(this.C.a(this.o.b())));
        if (c(c0)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f)) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(c0) && !TextUtils.isEmpty(this.a.c())) {
            map.put("auctionId", this.a.c());
        }
        return map;
    }

    public void a(Y9 y9) {
        this.v = y9;
    }

    private void a(JSONObject jSONObject) {
        this.u.a(this.o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    public String a(C3700q2 c3700q2, int i) {
        return String.format("%s%s", Integer.valueOf(i), c3700q2.c());
    }

    public void a(Df df) {
        this.H = df;
        if (df != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.z = null;
    }

    @Override // com.ironsource.InterfaceC3717r3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.o.b(), h());
        if (adapterBaseInterfaceB != null) {
            this.s.g.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    @Override // com.ironsource.InterfaceC3717r3
    public void a(String str) {
        this.s.j.g(str);
    }

    @Override // com.ironsource.InterfaceC3640md
    public void a(Runnable runnable) {
        P9 p9 = this.J;
        if (p9 != null) {
            p9.a(runnable);
        }
    }
}
