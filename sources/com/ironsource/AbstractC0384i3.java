package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC0401j3;
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
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0384i3<Smash extends AbstractC0401j3<?>, Listener extends AdapterAdListener> implements R0, U1, E0, Fb, Cc, InterfaceC0487o, Rg, InterfaceC0544r3, InterfaceC0537qd {
    private AdInfo A;
    private C0462ma B;
    final M8 C;
    final M8.a D;
    protected final M7 E;
    private final M7.a F;
    private boolean G;
    private Tf H;
    private AtomicBoolean I;
    private S9 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Qg<Smash> f28843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<String, C0257b2.a> f28844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.ironsource.mediationsdk.e f28845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C0257b2 f28846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f28847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f28848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected JSONObject f28849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected C0526q2 f28850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected C0358gd f28851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f28852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private NetworkStateReceiver f28853k;
    protected C0270bf l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected C0350g5 f28854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected C0350g5 f28855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected W f28856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected f f28857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected Q0 f28858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected O5 f28859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected F0 f28860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected L0 f28861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected C0558s f28862u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected C0265ba f28863v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected UUID f28864w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final Object f28865x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f28866y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f28867z;

    /* JADX INFO: renamed from: com.ironsource.i3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends AbstractRunnableC0430ke {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            AbstractC0384i3.this.y();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f28869a;

        public b(NetworkSettings networkSettings) {
            this.f28869a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0384i3.this.c(this.f28869a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC0384i3.this.A();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0384i3.this.f28849g = new JSONObject();
            AbstractC0384i3.this.f28860s.f26033h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC0384i3.this.b(map, arrayList, sb2, arrayList2);
            AbstractC0384i3.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements C0580t3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f28873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f28874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f28875c;

        public e(Map map, StringBuilder sb2, List list) {
            this.f28873a = map;
            this.f28874b = sb2;
            this.f28875c = list;
        }

        @Override // com.ironsource.C0580t3.b
        public void a(List<C0598u3> list, long j10, List<String> list2) {
            AbstractC0384i3.this.f28860s.f26032g.b(j10);
            for (C0598u3 c0598u3 : list) {
                NetworkSettings networkSettingsA = AbstractC0384i3.this.f28856o.a(c0598u3.c());
                Map<String, Object> mapB = AbstractC0384i3.this.b(networkSettingsA, com.ironsource.mediationsdk.c.b().b(networkSettingsA, AbstractC0384i3.this.f28856o.b(), AbstractC0384i3.this.h()));
                if (c0598u3.a() != null) {
                    this.f28873a.put(c0598u3.c(), c0598u3.a());
                    StringBuilder sb2 = this.f28874b;
                    sb2.append(c0598u3.d());
                    sb2.append(c0598u3.c());
                    sb2.append(",");
                    AbstractC0384i3.this.f28860s.f26032g.a(mapB, c0598u3.e());
                } else {
                    AbstractC0384i3.this.f28860s.f26032g.a(mapB, c0598u3.e(), c0598u3.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = AbstractC0384i3.this.f28856o.a(it.next());
                AbstractC0384i3.this.f28860s.f26032g.b(AbstractC0384i3.this.b(networkSettingsA2, com.ironsource.mediationsdk.c.b().b(networkSettingsA2, AbstractC0384i3.this.f28856o.b(), AbstractC0384i3.this.h())), j10);
            }
            AbstractC0384i3.this.a((Map<String, Object>) this.f28873a, (List<String>) this.f28875c, this.f28874b.toString());
        }

        @Override // com.ironsource.C0580t3.b
        public void onFailure(String str) {
            AbstractC0384i3.this.f28860s.f26032g.a(str);
            AbstractC0384i3.this.a((Map<String, Object>) this.f28873a, (List<String>) this.f28875c, this.f28874b.toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$f */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC0384i3(W w3, C0462ma c0462ma, C0265ba c0265ba) {
        this(Kb.Y(), Kb.Q(), w3, c0462ma, c0265ba);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        IronLog.INTERNAL.verbose(f());
        AsyncTask.execute(new d());
    }

    private Xg<Smash> B() {
        IronLog.INTERNAL.verbose();
        return new Wg(this.f28856o).d(this.f28843a.b());
    }

    private void C() {
        this.f28862u.a(this.f28856o.b(), false);
    }

    private void H() {
        IronLog.INTERNAL.verbose(f());
        synchronized (this.f28865x) {
            try {
                f fVar = this.f28857p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.I.set(false);
                long jK = this.f28856o.d().k() - C0350g5.a(this.f28854m);
                if (jK > 0) {
                    new Timer().schedule(new c(), jK);
                } else {
                    A();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void I() {
        IronLog.INTERNAL.verbose(f());
        a(g(), j());
    }

    private int m() {
        return 1;
    }

    private void o() {
        IronLog.INTERNAL.verbose(f());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f28856o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.f28856o.b(), h()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f28856o.k(), this.f28856o.p(), arrayList);
    }

    private void p() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f28856o.j()) {
            arrayList.add(new C0252af(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f28856o.b())));
        }
        C0270bf c0270bf = new C0270bf();
        this.l = c0270bf;
        c0270bf.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        synchronized (this.f28865x) {
            try {
                if (this.f28856o.h().e() && this.l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(B0.a(this.f28856o.b()), "all smashes are capped", false);
                    return;
                }
                if (!q() && this.f28857p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(B0.d(this.f28856o.b()), "load cannot be invoked while showing an ad"));
                    return;
                }
                if (this.f28856o.h().a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.f28856o.h().a() != O0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.f28857p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.l.a().b(this.f28856o.b()))) {
                    IronLog.API.error(b("load is already in progress"));
                    return;
                }
                this.f28849g = new JSONObject();
                C();
                if (s()) {
                    this.f28860s.f26031f.d();
                } else {
                    this.f28860s.f26031f.a(n());
                }
                this.f28855n = new C0350g5();
                if (this.f28856o.q()) {
                    if (!this.f28844b.isEmpty()) {
                        this.f28846d.a(this.f28844b);
                        this.f28844b.clear();
                    }
                    H();
                } else {
                    a(f.LOADING);
                }
                if (this.f28856o.q()) {
                    return;
                }
                ironLog.verbose(b("auction disabled"));
                I();
                z();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z() {
        Xg<Smash> xgB = B();
        if (xgB.c()) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = xgB.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    public void D() {
        com.ironsource.mediationsdk.l.a().a(this.f28856o.b(), this.f28856o.f());
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return true;
    }

    public void G() {
        Iterator<NetworkSettings> it = this.f28856o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.f28856o.b(), h());
        }
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i10, String str, C0526q2 c0526q2);

    public abstract JSONObject b(NetworkSettings networkSettings);

    public abstract L0 d();

    public void h(AbstractC0401j3<?> abstractC0401j3) {
        if (this.f28856o.h().f()) {
            a(abstractC0401j3, abstractC0401j3.f());
        } else {
            a(true, false, abstractC0401j3);
        }
    }

    public abstract String i();

    public void i(AbstractC0401j3<?> abstractC0401j3) {
        if (this.f28856o.q() && this.I.compareAndSet(false, true)) {
            C0526q2 c0526q2I = abstractC0401j3.i();
            this.f28845c.a(c0526q2I, abstractC0401j3.l(), this.f28850h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C0526q2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f28843a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f28845c.a(arrayList, concurrentHashMap, abstractC0401j3.l(), this.f28850h, c0526q2I);
        }
    }

    public String j() {
        return "fallback_" + System.currentTimeMillis();
    }

    public String k() {
        C0358gd c0358gd = this.f28851i;
        return c0358gd == null ? "" : c0358gd.c();
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
        boolean z10;
        synchronized (this.f28865x) {
            try {
                f fVar = this.f28857p;
                z10 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f28865x) {
            z10 = this.f28857p == f.READY_TO_SHOW;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f28865x) {
            z10 = this.f28857p == f.AUCTION;
        }
        return z10;
    }

    public boolean w() {
        boolean z10;
        synchronized (this.f28865x) {
            z10 = this.f28857p == f.LOADING;
        }
        return z10;
    }

    public void x() {
        if (c()) {
            a(new a());
        } else {
            y();
        }
    }

    private S9 a(W w3) {
        return null;
    }

    private boolean c(boolean z10) {
        Boolean bool = this.f28867z;
        if (bool == null) {
            return false;
        }
        if (z10 && !bool.booleanValue() && r()) {
            return true;
        }
        return !z10 && this.f28867z.booleanValue();
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f28856o.b(), h());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.f28843a.a(this.f28856o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.f28856o.b());
        }
        return false;
    }

    private List<C0526q2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f28856o.j()) {
            if (!networkSettings.isBidder(this.f28856o.b()) && d(networkSettings)) {
                C0252af c0252af = new C0252af(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f28856o.b()));
                if (!this.l.b(c0252af)) {
                    copyOnWriteArrayList.add(new C0526q2(c0252af.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public void b(boolean z10) {
        a(false, z10, (AbstractC0401j3<?>) null);
    }

    public Q0 e() {
        return new Q0(this.f28856o.h(), this);
    }

    public String f() {
        return b((String) null);
    }

    public void a(Context context, boolean z10) {
        IronLog.INTERNAL.verbose(b("track = " + z10));
        try {
            this.f28852j = z10;
            if (z10) {
                if (this.f28853k == null) {
                    this.f28853k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f28853k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f28853k != null) {
                context.getApplicationContext().unregisterReceiver(this.f28853k);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.Fb
    public void b() {
        IronLog.INTERNAL.verbose(f());
        x();
    }

    @Override // com.ironsource.R0
    public void e(AbstractC0401j3<?> abstractC0401j3) {
        IronLog.INTERNAL.verbose(b(abstractC0401j3.k()));
        this.f28860s.f26034i.a(k());
        this.f28861t.a(this.f28851i, abstractC0401j3.f());
    }

    public AbstractC0384i3(I7 i10, H7 h7, W w3, C0462ma c0462ma, C0265ba c0265ba) {
        this.f28848f = "";
        this.f28852j = false;
        this.f28865x = new Object();
        this.f28866y = 0L;
        this.I = new AtomicBoolean(false);
        this.f28864w = UUID.randomUUID();
        this.C = i10.s();
        this.D = h7.i();
        this.E = i10.w();
        this.F = h7.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + w3.b() + ", loading mode = " + w3.h().a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w3.b());
        sb2.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb2.toString());
        C0350g5 c0350g5 = new C0350g5();
        this.J = a(w3);
        this.f28863v = c0265ba;
        this.f28856o = w3;
        this.f28860s = new F0(w3.b(), F0.b.MEDIATION, this);
        this.f28861t = d();
        this.f28858q = e();
        a(f.NONE);
        this.B = c0462ma;
        this.f28843a = new Qg<>(this.f28856o.d().f(), this.f28856o.d().i(), this);
        this.f28860s.f26030e.a(l(), this.f28856o.h().a().toString());
        this.f28844b = new ConcurrentHashMap<>();
        this.f28851i = null;
        D();
        this.f28849g = new JSONObject();
        if (this.f28856o.q()) {
            this.f28845c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.f28856o.d(), IronSourceUtils.d()));
        }
        this.f28846d = new C0257b2(this.f28856o.j(), this.f28856o.d().c());
        p();
        o();
        this.f28854m = new C0350g5();
        a(f.READY_TO_LOAD);
        this.f28859r = new O5(w3.a(), this);
        this.f28862u = new C0558s();
        this.f28860s.f26030e.a(C0350g5.a(c0350g5));
        if (this.f28856o.h().e()) {
            ironLog.verbose("first automatic load");
            x();
        }
    }

    public UUID h() {
        return this.f28864w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC0527q3> list2) {
        AbstractC0384i3<Smash, Listener> abstractC0384i3;
        for (NetworkSettings networkSettings : this.f28856o.j()) {
            Tf tf = this.H;
            if (tf == null || tf.a(networkSettings, this.f28856o.b())) {
                if (!this.l.b(new C0252af(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f28856o.b()))) && this.d(networkSettings)) {
                    AdData adDataA = this.a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f28856o.b())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f28856o.b(), this.h());
                        if (adapterBaseInterfaceB instanceof InterfaceC0562s3) {
                            list2.add(new CallableC0527q3(networkSettings.getInstanceType(this.f28856o.b()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC0562s3) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            abstractC0384i3 = this;
                            abstractC0384i3.f28860s.f26035j.g(adapterBaseInterfaceB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        abstractC0384i3 = this;
                        list.add(networkSettings.getProviderInstanceName());
                        sb2.append(networkSettings.getInstanceType(abstractC0384i3.f28856o.b()));
                        sb2.append(networkSettings.getProviderInstanceName());
                        sb2.append(",");
                    }
                    this = abstractC0384i3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b("Start initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
        AdData adDataA = a(networkSettings, this.f28856o.o());
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f28856o.b(), h());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                this.f28860s.f26035j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e10);
            }
        }
        IronLog.INTERNAL.verbose(b("Done initializing provider " + networkSettings.getProviderInstanceName() + " on thread " + Thread.currentThread().getName()));
    }

    public void g(AbstractC0401j3<?> abstractC0401j3) {
        this.f28861t.d(abstractC0401j3.f());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0090, B:13:0x0096, B:19:0x00a9, B:16:0x009c, B:18:0x00a2), top: B:37:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a2 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0090, B:13:0x0096, B:19:0x00a9, B:16:0x009c, B:18:0x00a2), top: B:37:0x0090 }] */
    @Override // com.ironsource.R0
    public void d(AbstractC0401j3<?> abstractC0401j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC0401j3.k()));
        if (!abstractC0401j3.h().equals(this.f28843a.c())) {
            ironLog.error(b("invoked from " + abstractC0401j3.c() + " with state = " + this.f28857p + " auctionId: " + abstractC0401j3.h() + " and the current id is " + this.f28843a.c()));
            C0540qg c0540qg = this.f28860s.f26035j;
            StringBuilder sb2 = new StringBuilder("onAdLoadSuccess invoked with state = ");
            sb2.append(this.f28857p);
            c0540qg.p(sb2.toString());
            return;
        }
        if (this.f28856o.m()) {
            List<Smash> listB = this.f28843a.b();
            Wg wg = new Wg(this.f28856o);
            boolean zA = wg.a(abstractC0401j3, listB);
            synchronized (this.f28865x) {
                if (zA) {
                    try {
                        if (t()) {
                            i(abstractC0401j3);
                        } else if (wg.a(listB)) {
                            i(wg.c(listB));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (wg.a(listB)) {
                    i(wg.c(listB));
                }
            }
        }
        this.f28844b.put(abstractC0401j3.c(), C0257b2.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long jA = C0350g5.a(this.f28855n);
            if (s()) {
                this.f28860s.f26031f.a(jA);
            } else {
                this.f28860s.f26031f.a(jA, n());
            }
            if (this.f28856o.h().e()) {
                this.f28859r.a(0L);
            }
            if (!this.f28856o.m()) {
                i(abstractC0401j3);
            }
            h(abstractC0401j3);
        }
    }

    public void a(f fVar) {
        synchronized (this.f28865x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f28857p = fVar;
        }
    }

    public boolean a(f fVar, f fVar2) {
        boolean z10;
        synchronized (this.f28865x) {
            try {
                if (this.f28857p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.f28857p = fVar2;
                    z10 = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.f28857p + ", expected state = " + fVar);
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f28843a.a(adapterBaseInterface, this.f28856o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.f28856o.b()));
    }

    public void a(L0 l10) {
        this.f28861t = l10;
    }

    public BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    public void a(boolean z10, boolean z11, AbstractC0401j3<?> abstractC0401j3) {
        synchronized (this.f28865x) {
            try {
                Boolean bool = this.f28867z;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f28867z = Boolean.valueOf(z10);
                    long time = 0;
                    if (this.f28866y != 0) {
                        time = new Date().getTime() - this.f28866y;
                    }
                    this.f28866y = new Date().getTime();
                    this.f28860s.f26031f.a(z10, time, z11);
                    AdInfo adInfoF = abstractC0401j3 != null ? abstractC0401j3.f() : this.A;
                    this.A = adInfoF;
                    L0 l10 = this.f28861t;
                    if (!z10) {
                        adInfoF = null;
                    }
                    l10.a(z10, adInfoF);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(C0 c4) {
        return new ArrayList(Arrays.asList(C0.LOAD_AD_SUCCESS, C0.LOAD_AD_FAILED, C0.LOAD_AD_FAILED_WITH_REASON, C0.AUCTION_SUCCESS, C0.AUCTION_FAILED, C0.AUCTION_FAILED_NO_CANDIDATES, C0.AD_FORMAT_CAPPED, C0.AD_OPENED, C0.SHOW_AD, C0.SHOW_AD_FAILED, C0.AD_CLICKED, C0.RELOAD_AD_FAILED_WITH_REASON, C0.RELOAD_AD_SUCCESS, C0.AD_LEFT_APPLICATION)).contains(c4);
    }

    @Override // com.ironsource.InterfaceC0537qd
    public boolean c() {
        S9 s10 = this.J;
        if (s10 == null || s10 == Thread.currentThread()) {
            return false;
        }
        return this.f28856o.l();
    }

    private boolean b(C0 c4) {
        return !new ArrayList(Arrays.asList(C0.INIT_STARTED, C0.LOAD_AD, C0.AUCTION_REQUEST, C0.AUCTION_REQUEST_WATERFALL, C0.AUCTION_FAILED_NO_CANDIDATES, C0.COLLECT_TOKEN, C0.COLLECT_TOKENS_COMPLETED, C0.COLLECT_TOKENS_FAILED, C0.INSTANCE_COLLECT_TOKEN, C0.INSTANCE_COLLECT_TOKEN_SUCCESS, C0.INSTANCE_COLLECT_TOKEN_FAILED, C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(c4);
    }

    @Override // com.ironsource.InterfaceC0487o
    public void a() {
        if (this.f28856o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            x();
        }
    }

    public void b(C0526q2 c0526q2, String str) {
        if (c0526q2 != null) {
            W8 w8A = c0526q2.a(str);
            if (w8A != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + w8A));
                    impressionDataListener.onImpressionSuccess(w8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        F0 f10 = this.f28860s;
        if (f10 != null) {
            f10.f26035j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (!this.f28852j || this.f28856o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z10);
        if (c(z10)) {
            a(z10, false, (AbstractC0401j3<?>) null);
        }
    }

    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C0526q2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f28844b.clear();
        StringBuilder sb2 = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0526q2 c0526q2 = list.get(i10);
            AbstractC0401j3 abstractC0401j3A = a(c0526q2, str);
            if (abstractC0401j3A != null) {
                copyOnWriteArrayList.add(abstractC0401j3A);
                sb2.append(a(c0526q2, abstractC0401j3A.l()));
            }
            if (i10 != list.size() - 1) {
                sb2.append(",");
            }
        }
        this.f28843a.a(this.f28856o.h().a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb2)));
        return sb2.toString();
    }

    private void b(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f28856o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.f28856o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f29352x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f29352x)) > 0) {
                    this.f28856o.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f29353y)) {
                    this.f28856o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f29353y));
                }
                this.f28856o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f29354z, false));
                IronLog.INTERNAL.verbose(b(this.f28856o.r()));
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f28856o.b() + " Error: " + e10.getMessage());
                ironLog.verbose(b(this.f28856o.r()));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(b(this.f28856o.r()));
            throw th2;
        }
    }

    @Override // com.ironsource.Rg
    public void a(int i10) {
        this.f28860s.f26035j.v("waterfalls hold too many with size = " + i10);
    }

    private Smash a(C0526q2 c0526q2, String str) {
        NetworkSettings networkSettingsA = this.f28856o.a(c0526q2.c());
        if (networkSettingsA != null) {
            com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f28856o.b(), h());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.f28856o.b());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.f28856o.b()), str, c0526q2);
                this.f28844b.put(c0526q2.c(), C0257b2.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
            return null;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + c0526q2.c() + " state = " + this.f28857p;
        IronLog.INTERNAL.error(b(str2));
        this.f28860s.f26035j.i(str2);
        return null;
    }

    public String b(String str) {
        String str2 = this.f28856o.b().name() + " state:" + this.f28857p;
        return TextUtils.isEmpty(str) ? str2 : wi.d.i(str2, " - ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f28856o.b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m()));
            return map;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e10);
            return map;
        }
    }

    public void a(int i10, String str, boolean z10) {
        int i11;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f28856o.h().f()) {
            if (z10) {
                i11 = i10;
                str2 = str;
            } else {
                i11 = i10;
                str2 = str;
                this.f28860s.f26031f.a(C0350g5.a(this.f28855n), i11, str2, n());
            }
            a(new IronSourceError(i11, str2));
        } else {
            if (!z10) {
                this.f28860s.f26035j.b(i10, str);
            }
            b(false);
        }
        this.f28858q.e();
    }

    public void a(AbstractC0401j3<?> abstractC0401j3, AdInfo adInfo) {
        this.f28861t.c(adInfo);
    }

    public void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.l.a().b(this.f28856o.b(), ironSourceError);
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f28856o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC0527q3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        C0580t3 c0580t3 = new C0580t3();
        e eVar = new e(map, sb2, list);
        this.f28860s.f26032g.a();
        c0580t3.a(list2, eVar, this.f28856o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z10 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.f28860s.f26033h.a(1005, "No candidates available for auctioning");
            a(B0.e(this.f28856o.b()), "no available ad to load", false);
            return;
        }
        this.f28860s.f26033h.b(str);
        if (this.f28845c != null) {
            int iA = this.C.a(this.f28856o.b());
            com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.f28856o.b());
            hVar.b(IronSourceUtils.g());
            hVar.a(map);
            hVar.a(list);
            hVar.a(this.f28846d);
            hVar.a(iA);
            hVar.a(this.f28863v);
            hVar.d(this.G);
            Tf tf = this.H;
            if (tf != null && tf.c()) {
                z10 = true;
            }
            hVar.e(z10);
            a(ContextProvider.getInstance().getApplicationContext(), hVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    public void a(Context context, com.ironsource.mediationsdk.h hVar, U1 u6) {
        com.ironsource.mediationsdk.e eVar = this.f28845c;
        if (eVar != null) {
            eVar.a(context, hVar, u6);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C0526q2> list, String str, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            this.f28848f = "";
            this.f28847e = i10;
            this.f28850h = c0526q2;
            this.f28849g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f28860s.f26035j.a(i11, str2);
            }
            a(jSONObject2);
            if (this.f28862u.a(this.f28856o.b())) {
                this.f28860s.f26033h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String strA = a(list, str);
            this.f28860s.f26033h.a(j10, this.f28856o.r() + ";wtf=" + list.size());
            this.f28860s.f26033h.c(strA);
            a(f.LOADING);
            z();
            return;
        }
        StringBuilder sbK = d5.u.k("unexpected auction success for auctionId - ", str, " state = ");
        sbK.append(this.f28857p);
        ironLog.error(b(sbK.toString()));
        this.f28860s.f26035j.k("unexpected auction success, state = " + this.f28857p);
    }

    @Override // com.ironsource.U1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (v()) {
            String str3 = "Auction failed (error " + i10 + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.i(i() + ": " + str3);
            this.f28847e = i11;
            this.f28848f = str2;
            this.f28849g = new JSONObject();
            if (this.f28856o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                I();
            }
            this.f28860s.f26033h.a(j10, i10, str);
            a(f.LOADING);
            z();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i10 + ", " + str + " state = " + this.f28857p;
        ironLog.error(b(str4));
        this.f28860s.f26035j.j(str4);
    }

    @Override // com.ironsource.R0
    public void a(IronSourceError ironSourceError, AbstractC0401j3<?> abstractC0401j3) {
        Xg<Smash> xgB;
        AbstractC0401j3<?> abstractC0401j3C;
        synchronized (this.f28865x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(abstractC0401j3.k() + " - error = " + ironSourceError));
                if (abstractC0401j3.h().equals(this.f28843a.c()) && this.f28857p != f.AUCTION) {
                    this.f28844b.put(abstractC0401j3.c(), C0257b2.a.ISAuctionPerformanceFailedToLoad);
                    if (w() || u()) {
                        xgB = B();
                        if (xgB.c()) {
                            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                            return;
                        }
                    } else {
                        xgB = null;
                    }
                    if (xgB == null) {
                        return;
                    }
                    if (this.f28856o.m()) {
                        synchronized (this.f28865x) {
                            try {
                                if (xgB.b() && t() && (abstractC0401j3C = new Wg(this.f28856o).c(this.f28843a.b())) != null) {
                                    i(abstractC0401j3C);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    Iterator<Smash> it = xgB.a().iterator();
                    while (it.hasNext()) {
                        it.next().E();
                    }
                    return;
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + abstractC0401j3.c() + " with state =" + this.f28857p + " auctionId: " + abstractC0401j3.h() + " and the current id is " + this.f28843a.c()));
                C0540qg c0540qg = this.f28860s.f26035j;
                StringBuilder sb2 = new StringBuilder("onAdLoadFailed was invoked with state =");
                sb2.append(this.f28857p);
                c0540qg.o(sb2.toString());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.ironsource.R0
    public void a(AbstractC0401j3<?> abstractC0401j3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC0401j3.k()));
        this.f28860s.f26034i.g(k());
        this.f28843a.a(abstractC0401j3);
        this.f28843a.b(abstractC0401j3);
        this.l.a(abstractC0401j3);
        if (this.l.b(abstractC0401j3)) {
            ironLog.verbose(b(abstractC0401j3.c() + " was session capped"));
            abstractC0401j3.N();
            IronSourceUtils.i(abstractC0401j3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), k(), this.f28856o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.f28851i, this.f28856o.b())) {
            ironLog.verbose(b("placement " + k() + " is capped"));
            this.f28860s.f26034i.b(k(), null);
        }
        this.D.b(this.f28856o.b());
        if (this.f28856o.q()) {
            C0526q2 c0526q2I = abstractC0401j3.i();
            this.f28845c.a(c0526q2I, abstractC0401j3.l(), this.f28850h, k());
            this.f28844b.put(abstractC0401j3.c(), C0257b2.a.ISAuctionPerformanceShowedSuccessfully);
            if (E()) {
                b(c0526q2I, k());
            }
        }
        g(abstractC0401j3);
        if (this.f28856o.h().e()) {
            b(false);
        }
        this.f28858q.h();
    }

    public Map<String, Object> a(C0 c4) {
        HashMap mapN = com.applovin.impl.ca.n(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapN.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f28849g;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapN.put("genericParams", this.f28849g);
        }
        mapN.put("sessionDepth", Integer.valueOf(this.C.a(this.f28856o.b())));
        if (c(c4)) {
            mapN.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f28847e));
            if (!TextUtils.isEmpty(this.f28848f)) {
                mapN.put(IronSourceConstants.AUCTION_FALLBACK, this.f28848f);
            }
        }
        if (b(c4) && !TextUtils.isEmpty(this.f28843a.c())) {
            mapN.put("auctionId", this.f28843a.c());
        }
        return mapN;
    }

    public void a(C0265ba c0265ba) {
        this.f28863v = c0265ba;
    }

    private void a(JSONObject jSONObject) {
        this.f28862u.a(this.f28856o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f29335f, false) : false);
        b(jSONObject);
    }

    public String a(C0526q2 c0526q2, int i10) {
        return d5.u.f(i10, c0526q2.c());
    }

    public void a(Tf tf) {
        this.H = tf;
        if (tf != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.f28867z = null;
    }

    @Override // com.ironsource.InterfaceC0544r3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f28856o.b(), h());
        if (adapterBaseInterfaceB != null) {
            this.f28860s.f26032g.b(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    @Override // com.ironsource.InterfaceC0544r3
    public void a(String str) {
        this.f28860s.f26035j.g(str);
    }

    @Override // com.ironsource.InterfaceC0537qd
    public void a(Runnable runnable) {
        S9 s10 = this.J;
        if (s10 != null) {
            s10.a(runnable);
        }
    }
}
