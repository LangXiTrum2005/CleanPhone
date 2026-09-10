package sg.bigo.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.adcolony.sdk.AdColonyAppOptions;
import com.chartboost.sdk.privacy.model.LGPD;
import com.p004ironsource.f9;
import com.p004ironsource.x4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.j;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.common.m;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.n.e;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.controller.e.f;

/* JADX INFO: loaded from: classes7.dex */
public class BigoAdSdk {
    private static sg.bigo.ads.controller.e.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f45329e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f45326a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f45327b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f45328c = new AtomicBoolean(false);
    private static final CopyOnWriteArrayList<InitListener> f = new CopyOnWriteArrayList<>();
    private static final List<Pair<String, String>> g = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.BigoAdSdk$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45336a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f45336a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45336a[ConsentOptions.GDPR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45336a[ConsentOptions.CCPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45336a[ConsentOptions.COPPA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface InitListener {
        void onInitialized();
    }

    public static void addExtraHost(final String str, final String str2) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.3
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.d == null || !BigoAdSdk.f45326a.get()) {
                    BigoAdSdk.g.add(Pair.create(str, str2));
                } else {
                    BigoAdSdk.d.a(str, str2);
                }
            }
        });
    }

    public static String getBidderToken() {
        String str;
        String str2;
        if (!f45326a.get()) {
            str = "BigoAdSdk";
            str2 = "Please initialize SDK before get bidder token.";
        } else {
            if (d != null) {
                if (f45328c.compareAndSet(true, false)) {
                    sg.bigo.ads.controller.e.a aVar = d;
                    f fVar = aVar.g;
                    if (fVar == null) {
                        fVar = new f();
                        aVar.g = fVar;
                    }
                    if (fVar.f48121a != null) {
                        synchronized (f.class) {
                            fVar.f48121a = null;
                        }
                    }
                }
                sg.bigo.ads.controller.e.a aVar2 = d;
                if (aVar2.f48052e == null) {
                    return null;
                }
                f fVar2 = aVar2.g;
                if (fVar2 == null) {
                    fVar2 = new f();
                    aVar2.g = fVar2;
                }
                sg.bigo.ads.controller.e.d dVar = aVar2.f48052e;
                f.f48120b = true;
                h hVar = i.f46986a;
                int iW = hVar != null ? hVar.w() : 0;
                if (iW == 1) {
                    return fVar2.b(dVar);
                }
                if (iW != 2) {
                    return fVar2.a(dVar);
                }
                return (fVar2.f48121a == null || fVar2.f48122c == 0 || System.currentTimeMillis() - fVar2.f48122c > 300000) ? fVar2.b(dVar) : fVar2.a(dVar);
            }
            str = "BigoAdSdk";
            str2 = "Error to get bidder token with empty controller.";
        }
        sg.bigo.ads.common.t.a.a(0, str, str2);
        return null;
    }

    public static String getHashId() {
        return "ad68540";
    }

    public static String getSDKVersion() {
        return "50501";
    }

    public static String getSDKVersionName() {
        return "5.5.1";
    }

    public static void initialize(Context context, AdConfig adConfig, InitListener initListener) {
        boolean z2 = f45326a.get();
        boolean z3 = !z2;
        if (z2) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK init had been invoked.");
        }
        if (sg.bigo.ads.controller.e.c.a().f48091b.get() == -1) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK wait to initing due to empty config.");
            z3 = true;
        }
        if (!z3) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Avoid initializing Bigo Ads SDK repeatedly.");
            if (initListener != null) {
                initListener.onInitialized();
                return;
            }
            return;
        }
        if (initListener != null) {
            f.add(initListener);
        }
        m.a(context);
        m.a(adConfig);
        Context applicationContext = context.getApplicationContext();
        m.a(applicationContext);
        if (f45327b.getAndSet(true)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsDebug = adConfig.isDebug();
        sg.bigo.ads.common.y.a.a((int) (System.currentTimeMillis() / 1000));
        sg.bigo.ads.common.x.b.f47740a = applicationContext;
        sg.bigo.ads.common.m.b.a(applicationContext);
        sg.bigo.ads.common.d.a.a().a(applicationContext);
        b(context);
        t.a(zIsDebug);
        final String extra = adConfig.getExtra(AdConfig.EXTRA_KEY_HOST_RULES);
        final sg.bigo.ads.controller.e.a aVar = new sg.bigo.ads.controller.e.a(applicationContext, adConfig);
        d = aVar;
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.1
            @Override // java.lang.Runnable
            public final void run() {
                BigoAdSdk.f45326a.set(true);
                BigoAdSdk.f45327b.set(false);
                BigoAdSdk.a(extra);
                sg.bigo.ads.common.t.a.a(2, 4, "", "Initialized Bigo Ads SDK successfully.");
                for (InitListener initListener2 : BigoAdSdk.f) {
                    if (initListener2 != null) {
                        initListener2.onInitialized();
                    }
                }
                BigoAdSdk.f.clear();
                if (c.a.a().isEmpty()) {
                    return;
                }
                d.a(3, new Runnable() { // from class: sg.bigo.ads.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.core.d.b.c(a.c());
                        a.b();
                    }
                });
            }
        };
        aVar.j = jElapsedRealtime;
        aVar.f48052e.f48092a = adConfig;
        aVar.g = new f();
        d.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.4
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th) {
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th));
            }
        });
        d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.5
            /* JADX WARN: Code duplicated, block: B:24:0x0225  */
            /* JADX WARN: Code duplicated, block: B:25:0x022b  */
            /* JADX WARN: Code duplicated, block: B:28:0x0253  */
            /* JADX WARN: Code duplicated, block: B:29:0x0259  */
            /* JADX WARN: Code duplicated, block: B:32:0x02a1  */
            /* JADX WARN: Code duplicated, block: B:33:0x02a6  */
            /* JADX WARN: Code duplicated, block: B:36:0x02f2  */
            /* JADX WARN: Code duplicated, block: B:39:0x0390  */
            /* JADX WARN: Code duplicated, block: B:42:0x03a5  */
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                sg.bigo.ads.core.d.c cVarA;
                Context context2;
                sg.bigo.ads.core.d.a.a aVar2;
                sg.bigo.ads.controller.d.f fVar;
                d dVar;
                sg.bigo.ads.core.b.b bVarA;
                Context context3;
                sg.bigo.ads.core.b.a.a aVar3;
                sg.bigo.ads.controller.d.b bVar;
                d dVar2;
                sg.bigo.ads.common.h.a.a aVar4;
                j jVarN;
                sg.bigo.ads.core.player.b bVarA2;
                Context context4;
                boolean zA;
                Runnable runnable2;
                final a aVar5 = a.this;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                HashMap map = new HashMap();
                d dVar3 = aVar5.f48052e;
                dVar3.d = dVar3.f48093b.getPackageName();
                dVar3.f48095e = sg.bigo.ads.common.utils.c.a(dVar3.f48093b);
                dVar3.f = sg.bigo.ads.common.utils.c.b(dVar3.f48093b);
                dVar3.g = sg.bigo.ads.common.aa.b.b(dVar3.f48093b);
                dVar3.f48096h = q.d(Build.MANUFACTURER);
                dVar3.f48097i = q.d(Build.MODEL);
                dVar3.j = sg.bigo.ads.common.aa.b.d(dVar3.f48093b);
                Point pointD = sg.bigo.ads.common.utils.e.d(dVar3.f48093b);
                dVar3.k = pointD.x + "x" + pointD.y;
                float fA = sg.bigo.ads.common.utils.e.a(dVar3.f48093b);
                dVar3.f48098l = (int) (10.0f * fA);
                if (fA > 0.0f) {
                    dVar3.m = Math.round(pointD.x / fA) + "x" + Math.round(pointD.y / fA);
                }
                PackageInfo packageInfoE = sg.bigo.ads.common.utils.c.e(dVar3.f48093b, "com.google.android.gms");
                if (packageInfoE != null) {
                    dVar3.f48099n = packageInfoE.versionName;
                }
                dVar3.o = sg.bigo.ads.common.aa.b.f(dVar3.f48093b);
                dVar3.f48100p = sg.bigo.ads.common.aa.a.a();
                dVar3.q = sg.bigo.ads.common.aa.a.b();
                dVar3.r = p.b(dVar3.f48093b);
                dVar3.t = sg.bigo.ads.common.utils.c.f(dVar3.f48093b, dVar3.d);
                dVar3.s = sg.bigo.ads.common.z.a.a();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                map.put("1", String.valueOf(jElapsedRealtime4));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 1 cost: " + String.valueOf(jElapsedRealtime4));
                sg.bigo.ads.a aVarA = BigoAdSdk.a(aVar5.f48049a);
                if (q.a((CharSequence) aVarA.f45338a)) {
                    aVarA.f45338a = aVar5.f48052e.f48092a.getAppKey();
                }
                long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                long jElapsedRealtime6 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                map.put("2", String.valueOf(jElapsedRealtime6));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 2 cost: " + String.valueOf(jElapsedRealtime6));
                if (TextUtils.equals(aVar5.f48052e.f48092a.getAppKey(), aVarA.f45338a)) {
                    aVar5.d.f47798a.b(aVar5.f48049a);
                    aVar5.f48050b.b(aVar5.f48049a);
                    aVar5.f48051c.b(aVar5.f48049a);
                }
                long jElapsedRealtime7 = SystemClock.elapsedRealtime();
                long jElapsedRealtime8 = SystemClock.elapsedRealtime() - jElapsedRealtime5;
                map.put("3", String.valueOf(jElapsedRealtime8));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 3 cost: " + String.valueOf(jElapsedRealtime8));
                aVar5.f48050b.B();
                h.a().a(aVar5.f48050b.J());
                sg.bigo.ads.common.g.a.a.a(aVar5.f48049a, new sg.bigo.ads.common.g.a.a.InterfaceC0840a() { // from class: sg.bigo.ads.controller.e.a.7
                    @Override // sg.bigo.ads.common.g.a.a.InterfaceC0840a
                    public final void a() {
                        sg.bigo.ads.common.g.a.a.b("tb_addata", "end_time < " + System.currentTimeMillis(), null);
                        t.a();
                    }

                    @Override // sg.bigo.ads.common.g.a.a.InterfaceC0840a
                    public final void a(String str2) {
                        sg.bigo.ads.core.d.b.a(3000, 10101, str2);
                    }
                });
                long jElapsedRealtime9 = SystemClock.elapsedRealtime();
                long jElapsedRealtime10 = SystemClock.elapsedRealtime() - jElapsedRealtime7;
                map.put("4", String.valueOf(jElapsedRealtime10));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 4 cost: " + String.valueOf(jElapsedRealtime10));
                sg.bigo.ads.core.e.a.d dVarA = sg.bigo.ads.core.e.a.d.a();
                Context context5 = aVar5.f48049a;
                r rVar = aVar5.f48050b.f47898a;
                sg.bigo.ads.controller.d.d dVar4 = new sg.bigo.ads.controller.d.d(aVar5.d);
                dVarA.f48432e = context5;
                if (!dVarA.f48430b.getAndSet(true)) {
                    dVarA.f48431c = rVar;
                    dVarA.d = dVar4;
                    if (rVar.f47062a) {
                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.d.3
                            public AnonymousClass3() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "init retry tracker");
                                Set set = d.this.f48429a;
                                g gVar = g.a.f48453a;
                                set.addAll(g.a(0L, d.this.f48431c));
                                d.this.d();
                            }
                        });
                    } else {
                        str = "config invalid";
                    }
                    cVarA = sg.bigo.ads.core.d.c.a();
                    context2 = aVar5.f48049a;
                    aVar2 = aVar5.f48050b.f;
                    fVar = new sg.bigo.ads.controller.d.f(aVar5.f48052e, aVar5.d);
                    dVar = aVar5.f48052e;
                    if (cVarA.f48377c.getAndSet(true)) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Stats", "already init.");
                    } else {
                        cVarA.f48375a = aVar2;
                        cVarA.d = dVar;
                        cVarA.f48376b = new sg.bigo.ads.core.d.b.b(context2, aVar2, fVar, dVar);
                    }
                    bVarA = sg.bigo.ads.core.b.b.a();
                    context3 = aVar5.f48049a;
                    aVar3 = aVar5.f48050b.g;
                    bVar = new sg.bigo.ads.controller.d.b(aVar5.f48052e, aVar5.d);
                    dVar2 = aVar5.f48052e;
                    if (bVarA.f48296b.getAndSet(true)) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Callback", "already init.");
                    } else {
                        bVarA.f48295a = new sg.bigo.ads.core.b.b.a(context3, aVar3, bVar, dVar2);
                    }
                    sg.bigo.ads.common.form.b bVarA3 = sg.bigo.ads.common.form.b.a();
                    sg.bigo.ads.controller.d.c cVar = new sg.bigo.ads.controller.d.c(aVar5.f48052e, aVar5.d);
                    bVarA3.f47167a.set(true);
                    bVarA3.f47168b = cVar;
                    sg.bigo.ads.core.d.a.a().f48345a = new sg.bigo.ads.controller.d.e(aVar5.f48052e, aVar5.d);
                    sg.bigo.ads.controller.b.d dVar5 = aVar5.f48050b;
                    aVar4 = dVar5.f47899e;
                    jVarN = dVar5.n();
                    bVarA2 = sg.bigo.ads.core.player.b.a();
                    context4 = aVar5.f48049a;
                    zA = jVarN.a(12);
                    bVarA2.f48776c = context4;
                    if (bVarA2.f48775b.getAndSet(true)) {
                        sg.bigo.ads.common.h.b.a("already init.", (sg.bigo.ads.common.h.a) null);
                    } else {
                        bVarA2.f48779i = aVar4;
                        bVarA2.g = new sg.bigo.ads.common.h.b(context4, aVar4, zA, bVarA2);
                        bVarA2.f48778h = new sg.bigo.ads.core.player.a(bVarA2);
                        bVarA2.d = new ArrayList();
                        bVarA2.f48777e = new ArrayList();
                        bVarA2.f = new Hashtable();
                        bVarA2.c();
                        sg.bigo.ads.common.p.h.a.f47427a.a(aVar4);
                        sg.bigo.ads.common.p.d.a.f47419a.a(aVar4);
                        sg.bigo.ads.common.p.h.a.f47427a.d(context4);
                        sg.bigo.ads.common.p.d.a.f47419a.d(context4);
                    }
                    if (jVarN.a(15)) {
                        sg.bigo.ads.common.aa.b.i(aVar5.f48049a);
                    }
                    long jElapsedRealtime11 = SystemClock.elapsedRealtime();
                    long jElapsedRealtime12 = SystemClock.elapsedRealtime() - jElapsedRealtime9;
                    map.put("5", String.valueOf(jElapsedRealtime12));
                    sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 5 cost: " + String.valueOf(jElapsedRealtime12));
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.e.a.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            sg.bigo.ads.core.c.c cVar2 = sg.bigo.ads.core.c.c.a.f48343a;
                            a aVar6 = a.this;
                            cVar2.a(aVar6.f48049a, aVar6.f48050b.I());
                        }
                    });
                    long jElapsedRealtime13 = SystemClock.elapsedRealtime();
                    long jElapsedRealtime14 = SystemClock.elapsedRealtime() - jElapsedRealtime11;
                    map.put("6", String.valueOf(jElapsedRealtime14));
                    sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 6 cost: " + String.valueOf(jElapsedRealtime14));
                    sg.bigo.ads.controller.f.a.a(aVar5.f48049a, aVar5);
                    sg.bigo.ads.common.aa.b.g(aVar5.f48049a);
                    aVar5.f48055l.a();
                    aVar5.d.a(8000L, "[sdk init]");
                    long jElapsedRealtime15 = SystemClock.elapsedRealtime() - jElapsedRealtime13;
                    map.put("7", String.valueOf(jElapsedRealtime15));
                    sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 7 cost: " + String.valueOf(jElapsedRealtime15));
                    if (i.f46986a.x()) {
                        sg.bigo.ads.controller.a.b.d.a.f47847a.a(aVar5.d, aVar5.f48052e, aVar5.f48050b, aVar5.f48051c, aVar5.f);
                    }
                    runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    a.a(a.this, 0, map);
                }
                str = "already init";
                sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", str);
                cVarA = sg.bigo.ads.core.d.c.a();
                context2 = aVar5.f48049a;
                aVar2 = aVar5.f48050b.f;
                fVar = new sg.bigo.ads.controller.d.f(aVar5.f48052e, aVar5.d);
                dVar = aVar5.f48052e;
                if (cVarA.f48377c.getAndSet(true)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Stats", "already init.");
                } else {
                    cVarA.f48375a = aVar2;
                    cVarA.d = dVar;
                    cVarA.f48376b = new sg.bigo.ads.core.d.b.b(context2, aVar2, fVar, dVar);
                }
                bVarA = sg.bigo.ads.core.b.b.a();
                context3 = aVar5.f48049a;
                aVar3 = aVar5.f48050b.g;
                bVar = new sg.bigo.ads.controller.d.b(aVar5.f48052e, aVar5.d);
                dVar2 = aVar5.f48052e;
                if (bVarA.f48296b.getAndSet(true)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "already init.");
                } else {
                    bVarA.f48295a = new sg.bigo.ads.core.b.b.a(context3, aVar3, bVar, dVar2);
                }
                sg.bigo.ads.common.form.b bVarA4 = sg.bigo.ads.common.form.b.a();
                sg.bigo.ads.controller.d.c cVar2 = new sg.bigo.ads.controller.d.c(aVar5.f48052e, aVar5.d);
                bVarA4.f47167a.set(true);
                bVarA4.f47168b = cVar2;
                sg.bigo.ads.core.d.a.a().f48345a = new sg.bigo.ads.controller.d.e(aVar5.f48052e, aVar5.d);
                sg.bigo.ads.controller.b.d dVar6 = aVar5.f48050b;
                aVar4 = dVar6.f47899e;
                jVarN = dVar6.n();
                bVarA2 = sg.bigo.ads.core.player.b.a();
                context4 = aVar5.f48049a;
                zA = jVarN.a(12);
                bVarA2.f48776c = context4;
                if (bVarA2.f48775b.getAndSet(true)) {
                    sg.bigo.ads.common.h.b.a("already init.", (sg.bigo.ads.common.h.a) null);
                } else {
                    bVarA2.f48779i = aVar4;
                    bVarA2.g = new sg.bigo.ads.common.h.b(context4, aVar4, zA, bVarA2);
                    bVarA2.f48778h = new sg.bigo.ads.core.player.a(bVarA2);
                    bVarA2.d = new ArrayList();
                    bVarA2.f48777e = new ArrayList();
                    bVarA2.f = new Hashtable();
                    bVarA2.c();
                    sg.bigo.ads.common.p.h.a.f47427a.a(aVar4);
                    sg.bigo.ads.common.p.d.a.f47419a.a(aVar4);
                    sg.bigo.ads.common.p.h.a.f47427a.d(context4);
                    sg.bigo.ads.common.p.d.a.f47419a.d(context4);
                }
                if (jVarN.a(15)) {
                    sg.bigo.ads.common.aa.b.i(aVar5.f48049a);
                }
                long jElapsedRealtime16 = SystemClock.elapsedRealtime();
                long jElapsedRealtime17 = SystemClock.elapsedRealtime() - jElapsedRealtime9;
                map.put("5", String.valueOf(jElapsedRealtime17));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 5 cost: " + String.valueOf(jElapsedRealtime17));
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.e.a.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.core.c.c cVar3 = sg.bigo.ads.core.c.c.a.f48343a;
                        a aVar6 = a.this;
                        cVar3.a(aVar6.f48049a, aVar6.f48050b.I());
                    }
                });
                long jElapsedRealtime18 = SystemClock.elapsedRealtime();
                long jElapsedRealtime19 = SystemClock.elapsedRealtime() - jElapsedRealtime16;
                map.put("6", String.valueOf(jElapsedRealtime19));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 6 cost: " + String.valueOf(jElapsedRealtime19));
                sg.bigo.ads.controller.f.a.a(aVar5.f48049a, aVar5);
                sg.bigo.ads.common.aa.b.g(aVar5.f48049a);
                aVar5.f48055l.a();
                aVar5.d.a(8000L, "[sdk init]");
                long jElapsedRealtime110 = SystemClock.elapsedRealtime() - jElapsedRealtime18;
                map.put("7", String.valueOf(jElapsedRealtime110));
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "The init step 7 cost: " + String.valueOf(jElapsedRealtime110));
                if (i.f46986a.x()) {
                    sg.bigo.ads.controller.a.b.d.a.f47847a.a(aVar5.d, aVar5.f48052e, aVar5.f48050b, aVar5.f48051c, aVar5.f);
                }
                runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                a.a(a.this, 0, map);
            }
        });
        e.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.6
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th) {
                String name = Thread.currentThread().getName();
                if (name.contains("ReportNet") || name.contains("Stat-Worker")) {
                    return;
                }
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th));
            }
        });
    }

    public static boolean isInitialized() {
        return f45326a.get();
    }

    public static boolean isOffice() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    public static void setUserConsent(final Context context, final ConsentOptions consentOptions, final boolean z2) {
        String str;
        if (!sg.bigo.ads.common.x.b.a()) {
            sg.bigo.ads.common.x.b.f47740a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.common.m.b.a()) {
            sg.bigo.ads.common.m.b.a(context.getApplicationContext());
        }
        d.a(3, new Runnable() { // from class: sg.bigo.ads.c.1
            /* JADX WARN: Code duplicated, block: B:18:0x0051  */
            /* JADX WARN: Code duplicated, block: B:19:0x0053  */
            /* JADX WARN: Code duplicated, block: B:23:0x005c  */
            /* JADX WARN: Code duplicated, block: B:26:0x0065  */
            /* JADX WARN: Code duplicated, block: B:28:0x006f  */
            /* JADX WARN: Code duplicated, block: B:31:0x0085  */
            /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
            @Override // java.lang.Runnable
            public final void run() {
                String strValueOf;
                String str2;
                String str3;
                String str4;
                String str5;
                String strValueOf2;
                a aVar;
                Context context2 = context;
                ConsentOptions consentOptions2 = consentOptions;
                boolean z3 = z2;
                int i2 = AnonymousClass3.f47081a[consentOptions2.ordinal()];
                if (i2 == 1) {
                    strValueOf = String.valueOf(sg.bigo.ads.common.x.a.o());
                    str2 = LGPD.LGPD_STANDARD;
                } else if (i2 == 2) {
                    strValueOf = String.valueOf(sg.bigo.ads.common.x.a.n());
                    str2 = com.smartdigimkt.w7.a.r0;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            str4 = "";
                            str3 = str4;
                        } else {
                            strValueOf = String.valueOf(sg.bigo.ads.common.x.a.m());
                            str2 = "gdpr";
                        }
                        if (z3) {
                            str5 = "1";
                        } else {
                            str5 = "2";
                        }
                        String str6 = f.f48120b ? "1" : "0";
                        if (sg.bigo.ads.common.m.b.e(context2)) {
                            strValueOf2 = String.valueOf(sg.bigo.ads.common.m.b.c(context2));
                        } else {
                            strValueOf2 = x4.DISABLED_AUCTION_FALLBACK_ID;
                        }
                        aVar = new a(str4, str3, str5, str6, strValueOf2, sg.bigo.ads.common.m.b.b(context2), sg.bigo.ads.common.m.b.d(context2));
                        if (BigoAdSdk.isInitialized()) {
                            a.a(aVar);
                            return;
                        }
                        HashMap map = new HashMap();
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(a.b(aVar));
                        map.put("user_consent_event", jSONArray.toString());
                        map.put("uuid", sg.bigo.ads.common.x.a.r());
                        sg.bigo.ads.core.d.b.c(map);
                    }
                    strValueOf = String.valueOf(sg.bigo.ads.common.x.a.p());
                    str2 = "coppa";
                }
                str3 = strValueOf;
                str4 = str2;
                if (z3) {
                    str5 = "1";
                } else {
                    str5 = "2";
                }
                String str7 = f.f48120b ? "1" : "0";
                if (sg.bigo.ads.common.m.b.e(context2)) {
                    strValueOf2 = String.valueOf(sg.bigo.ads.common.m.b.c(context2));
                } else {
                    strValueOf2 = x4.DISABLED_AUCTION_FALLBACK_ID;
                }
                aVar = new a(str4, str3, str5, str7, strValueOf2, sg.bigo.ads.common.m.b.b(context2), sg.bigo.ads.common.m.b.d(context2));
                if (BigoAdSdk.isInitialized()) {
                    a.a(aVar);
                    return;
                }
                HashMap map2 = new HashMap();
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(a.b(aVar));
                map2.put("user_consent_event", jSONArray2.toString());
                map2.put("uuid", sg.bigo.ads.common.x.a.r());
                sg.bigo.ads.core.d.b.c(map2);
            }
        });
        if (consentOptions == ConsentOptions.GDPR) {
            sg.bigo.ads.common.x.a.a(z2);
            if (sg.bigo.ads.common.m.b.e(context)) {
                str = "Filter the consent status from user: ";
            } else {
                a(context, consentOptions, z2);
                str = "Update the consent status from user: ";
            }
        } else {
            a(context, consentOptions, z2);
            str = "Update the consent status from user: ";
        }
        sg.bigo.ads.common.t.a.a(2, 4, "", str.concat(String.valueOf(z2)));
    }

    public static a a(Context context) {
        if (f45329e == null) {
            f45329e = new a(context);
        }
        if (!f45329e.f47132c) {
            f45329e.b(context);
        }
        return f45329e;
    }

    private static void b(Context context) {
        if (!sg.bigo.ads.common.m.b.f()) {
            sg.bigo.ads.common.t.a.a(0, 3, AdColonyAppOptions.GDPR, "GDPRContent is not changed, so return");
            return;
        }
        sg.bigo.ads.common.m.b.g();
        f45328c.set(true);
        if (!sg.bigo.ads.common.x.b.a()) {
            sg.bigo.ads.common.x.b.f47740a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.common.m.b.a()) {
            sg.bigo.ads.common.m.b.a(context.getApplicationContext());
        }
        if (!sg.bigo.ads.common.m.b.e(context)) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.x.a.l() != 2);
            sg.bigo.ads.common.t.a.a(0, 3, AdColonyAppOptions.GDPR, "GDPR applies is null, so return");
        } else if (sg.bigo.ads.common.m.a.b()) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.m.a.a());
        } else {
            a(context, ConsentOptions.GDPR, true);
        }
    }

    public static sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> a(final sg.bigo.ads.api.b bVar, sg.bigo.ads.controller.c cVar) {
        String str;
        bVar.g.f = System.currentTimeMillis();
        sg.bigo.ads.controller.a aVar = new sg.bigo.ads.controller.a(cVar);
        if (!f45326a.get()) {
            aVar.a(0, 1000, 0, "Please initialize SDK before request ads.", new Pair<>(bVar, null));
            return null;
        }
        b(d.f48049a);
        final sg.bigo.ads.controller.e.a aVar2 = d;
        if (q.a((CharSequence) aVar2.f48052e.f48092a.getAppKey())) {
            aVar.a(0, f9.f24992i, 10000, "App id cannot be empty, please pass the id when initializing bigo sdk.", new Pair(bVar, null));
            return null;
        }
        sg.bigo.ads.api.core.d dVarB = bVar.b();
        if (dVarB != null) {
            aVar.a(0, dVarB.f47019a, dVarB.f47020b, dVarB.f47021c, new Pair(bVar, null));
            return null;
        }
        int i2 = 0;
        byte b2 = 0;
        if (!sg.bigo.ads.common.x.a.q()) {
            final sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = new sg.bigo.ads.controller.e.a.C0859a<>(bVar, aVar, b2 == true ? 1 : 0);
            d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    if (bVar.f()) {
                        ((sg.bigo.ads.api.b) c0859a.f48081a).b(0);
                        a.a(a.this, c0859a);
                    } else {
                        a.this.f48055l.b();
                        a.this.f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.9.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i3) {
                                a.a(a.this, 1, (Map) null);
                                ((sg.bigo.ads.api.b) c0859a.f48081a).b(i3);
                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                a.a(a.this, c0859a);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i3, int i4, String str2) {
                                ((sg.bigo.ads.api.b) c0859a.f48081a).b(i3);
                                if (a.this.f48050b.N()) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    a.a(a.this, c0859a);
                                } else {
                                    AnonymousClass9 anonymousClass10 = AnonymousClass9.this;
                                    a.this.a(c0859a, 1008, i4, str2);
                                }
                            }
                        }, 1);
                    }
                }
            });
            return c0859a;
        }
        String str2 = "Missing CCPA consent";
        if (sg.bigo.ads.common.x.a.m() == 2) {
            str = "Missing GDPR consent";
            i2 = 1;
        } else {
            str = "Missing CCPA consent";
        }
        if (sg.bigo.ads.common.x.a.o() == 2) {
            i2++;
            str = "Missing LGPD consent";
        }
        if (sg.bigo.ads.common.x.a.n() == 2) {
            i2++;
        } else {
            str2 = str;
        }
        if (sg.bigo.ads.common.x.a.p() == 2) {
            i2++;
            str2 = "Missing COPPA consent";
        }
        if (i2 > 1) {
            str2 = "Missing user consent";
        }
        aVar.a(0, 1001, 800, str2, new Pair(bVar, null));
        return null;
    }

    private static void a(final Context context, final ConsentOptions consentOptions, boolean z2) {
        boolean zA = a(consentOptions, z2);
        if (z2 || !zA) {
            return;
        }
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.2
            @Override // java.lang.Runnable
            public final void run() {
                HashMap map = new HashMap();
                map.put(ConsentOptions.GDPR, Integer.valueOf(sg.bigo.ads.common.x.a.m()));
                map.put(ConsentOptions.LGPD, Integer.valueOf(sg.bigo.ads.common.x.a.o()));
                map.put(ConsentOptions.CCPA, Integer.valueOf(sg.bigo.ads.common.x.a.n()));
                map.put(ConsentOptions.COPPA, Integer.valueOf(sg.bigo.ads.common.x.a.p()));
                map.remove(consentOptions);
                int iL = sg.bigo.ads.common.x.a.l();
                sg.bigo.ads.common.t.a.a(2, 5, "", "Revoking user consent...The cached data of user will be deleted now.");
                sg.bigo.ads.core.d.b.b bVar = sg.bigo.ads.core.d.c.a().f48376b;
                if (bVar != null) {
                    bVar.f48358c.f();
                }
                sg.bigo.ads.core.b.b.a aVar = sg.bigo.ads.core.b.b.a().f48295a;
                if (aVar != null) {
                    aVar.f48298b.g();
                }
                sg.bigo.ads.core.e.a.d dVarA = sg.bigo.ads.core.e.a.d.a();
                dVarA.f48432e = context.getApplicationContext();
                dVarA.b();
                dVarA.f48429a.clear();
                sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
                Context context2 = context;
                sg.bigo.ads.common.h.b bVar2 = bVarA.g;
                if (bVar2 != null) {
                    sg.bigo.ads.common.h.b.b.a();
                    bVar2.f47265a.clear();
                    bVar2.f47267c.clear();
                    bVar2.f47266b.clear();
                    bVar2.d.clear();
                }
                List<o> list = bVarA.d;
                if (list != null) {
                    list.clear();
                }
                List<o> list2 = bVarA.f48777e;
                if (list2 != null) {
                    list2.clear();
                }
                Map<String, sg.bigo.ads.core.player.b.a> map2 = bVarA.f;
                if (map2 != null) {
                    map2.clear();
                }
                sg.bigo.ads.common.p.h.a.f47427a.e(context2);
                sg.bigo.ads.common.utils.f.b(new File(sg.bigo.ads.common.o.a(context)));
                sg.bigo.ads.common.g.a.a.a();
                sg.bigo.ads.common.x.a.s();
                BigoAdSdk.a(consentOptions);
                for (Map.Entry entry : map.entrySet()) {
                    int i2 = AnonymousClass5.f45336a[((ConsentOptions) entry.getKey()).ordinal()];
                    if (i2 == 1) {
                        sg.bigo.ads.common.x.a.e(((Integer) entry.getValue()).intValue());
                    } else if (i2 == 2) {
                        sg.bigo.ads.common.x.a.c(((Integer) entry.getValue()).intValue());
                    } else if (i2 == 3) {
                        sg.bigo.ads.common.x.a.d(((Integer) entry.getValue()).intValue());
                    } else if (i2 == 4) {
                        sg.bigo.ads.common.x.a.f(((Integer) entry.getValue()).intValue());
                    }
                }
                sg.bigo.ads.common.x.a.b(iL);
            }
        });
    }

    public static /* synthetic */ void a(final String str) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.4
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.d != null) {
                    for (Pair pair : BigoAdSdk.g) {
                        BigoAdSdk.d.a((String) pair.first, (String) pair.second);
                    }
                    Map<String, String> mapB = sg.bigo.ads.controller.a.d.b(str);
                    if (!k.a(mapB)) {
                        for (Map.Entry<String, String> entry : mapB.entrySet()) {
                            BigoAdSdk.d.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                BigoAdSdk.g.clear();
            }
        });
    }

    public static /* synthetic */ boolean a(ConsentOptions consentOptions) {
        return a(consentOptions, false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    private static boolean a(ConsentOptions consentOptions, boolean z2) {
        boolean z3;
        int i2 = z2 ? 1 : 2;
        int i3 = AnonymousClass5.f45336a[consentOptions.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4 && i2 != sg.bigo.ads.common.x.a.p()) {
                        sg.bigo.ads.common.x.a.f(i2);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else if (i2 != sg.bigo.ads.common.x.a.n()) {
                    sg.bigo.ads.common.x.a.d(i2);
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else if (i2 != sg.bigo.ads.common.x.a.m()) {
                sg.bigo.ads.common.x.a.c(i2);
                z3 = true;
            } else {
                z3 = false;
            }
        } else if (i2 != sg.bigo.ads.common.x.a.o()) {
            sg.bigo.ads.common.x.a.e(i2);
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f45328c.set(true);
        }
        return z3;
    }
}
