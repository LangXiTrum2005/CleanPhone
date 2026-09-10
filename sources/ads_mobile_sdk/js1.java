package ads_mobile_sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.base.triweekly;
import formularization.beachfront;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.laky;
import saneness.loun;
import saneness.monopodial;
import saneness.nonexistence;
import saneness.sustenance;

/* JADX INFO: loaded from: classes.dex */
public final class js1 implements monopodial {
    public final Context a;
    public final saran b;
    public final amphitheatre c;
    public final loun d;
    public final Set e;
    public ConnectivityManager f;
    public ds1 g;
    public final formularization.attabal h;
    public boolean i;
    public long j;
    public ww2 k;
    public final AtomicBoolean l;
    public final AtomicInteger m;
    public final AtomicInteger n;

    public js1(Context context, saran backgroundScope, amphitheatre clock, loun traceLogger, Set networkChangeListeners) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(networkChangeListeners, "networkChangeListeners");
        this.a = context;
        this.b = backgroundScope;
        this.c = clock;
        this.d = traceLogger;
        this.e = networkChangeListeners;
        this.h = beachfront.saneness(false, 1, null);
        this.i = true;
        this.j = p002kotlin.time.saneness.merc(p002kotlin.time.saneness.INSTANCE.dern(), p002kotlin.time.dern.molybdenite(1, DurationUnit.SECONDS));
        this.l = new AtomicBoolean(true);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(-1);
    }

    public final int a() {
        return this.m.get();
    }

    public final int b() {
        return this.n.get();
    }

    public final boolean c() {
        return this.l.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        vr1 vr1Var;
        js1 js1Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof vr1) {
            vr1Var = (vr1) dernVar;
            int i = vr1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vr1Var.e = i - Integer.MIN_VALUE;
            } else {
                vr1Var = new vr1(this, dernVar);
            }
        } else {
            vr1Var = new vr1(this, dernVar);
        }
        Object obj = vr1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vr1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.h;
            vr1Var.a = this;
            vr1Var.b = attabalVar2;
            vr1Var.e = 1;
            if (attabalVar2.attabal(null, vr1Var) == objBeachfront) {
                return objBeachfront;
            }
            js1Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = vr1Var.b;
            js1Var = vr1Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            ww2 ww2Var = js1Var.k;
            attabalVar.wireman(null);
            return ww2Var == null ? new ww2(nonexistence.wireman(js1Var.a), nonexistence.saneness(js1Var.a, null), nonexistence.marial(js1Var.a), nonexistence.beachfront(js1Var.a), nonexistence.competently(js1Var.a), nonexistence.attabal(js1Var.a)) : ww2Var;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(wretchedly.dern dernVar) {
        wr1 wr1Var;
        js1 js1Var;
        if (dernVar instanceof wr1) {
            wr1Var = (wr1) dernVar;
            int i = wr1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wr1Var.d = i - Integer.MIN_VALUE;
            } else {
                wr1Var = new wr1(this, dernVar);
            }
        } else {
            wr1Var = new wr1(this, dernVar);
        }
        wr1 wr1Var2 = wr1Var;
        Object obj = wr1Var2.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = wr1Var2.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.c.getClass();
            long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
            Object systemService = this.a.getSystemService((Class<Object>) ConnectivityManager.class);
            Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
            this.f = (ConnectivityManager) systemService;
            laky lakyVar = ip0.f;
            if (laky.competently(this.a, "android.permission.ACCESS_NETWORK_STATE")) {
                this.g = new ds1(this);
                try {
                    ds1 ds1Var = null;
                    if (Build.VERSION.SDK_INT < 31) {
                        ConnectivityManager connectivityManager = this.f;
                        if (connectivityManager == null) {
                            Intrinsics.preprohormone("connectivityManager");
                            connectivityManager = null;
                        }
                        ds1 ds1Var2 = this.g;
                        if (ds1Var2 == null) {
                            Intrinsics.preprohormone("callback");
                        } else {
                            ds1Var = ds1Var2;
                        }
                        connectivityManager.registerDefaultNetworkCallback(ds1Var);
                    } else {
                        ConnectivityManager connectivityManager2 = this.f;
                        if (connectivityManager2 == null) {
                            Intrinsics.preprohormone("connectivityManager");
                            connectivityManager2 = null;
                        }
                        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).addTransportType(0).addTransportType(3).build();
                        ds1 ds1Var3 = this.g;
                        if (ds1Var3 == null) {
                            Intrinsics.preprohormone("callback");
                        } else {
                            ds1Var = ds1Var3;
                        }
                        connectivityManager2.registerBestMatchingNetworkCallback(networkRequestBuild, ds1Var, new Handler(Looper.getMainLooper()));
                    }
                } catch (Exception e) {
                    ((d13) this.d).a("Failed to register network callbacks.", e);
                }
            }
            wr1Var2.a = this;
            wr1Var2.d = 1;
            if (a(jGraveside, null, null, true, wr1Var2) == objBeachfront) {
                return objBeachfront;
            }
            js1Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            js1Var = wr1Var2.a;
            p002kotlin.dern.saneness(obj);
        }
        vs1.a = js1Var;
        return new tn0(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x015e A[Catch: all -> 0x0164, TRY_LEAVE, TryCatch #1 {all -> 0x0164, blocks: (B:61:0x0156, B:63:0x015e, B:68:0x0166, B:70:0x018a, B:76:0x0197), top: B:107:0x0156 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0166 A[Catch: all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:61:0x0156, B:63:0x015e, B:68:0x0166, B:70:0x018a, B:76:0x0197), top: B:107:0x0156 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018a A[Catch: all -> 0x0164, TRY_LEAVE, TryCatch #1 {all -> 0x0164, blocks: (B:61:0x0156, B:63:0x015e, B:68:0x0166, B:70:0x018a, B:76:0x0197), top: B:107:0x0156 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:75:0x0195  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3 A[Catch: all -> 0x01e8, TryCatch #2 {all -> 0x01e8, blocks: (B:84:0x01d4, B:86:0x01e3, B:90:0x01eb, B:92:0x01f4, B:94:0x01fa), top: B:108:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f4 A[Catch: all -> 0x01e8, TryCatch #2 {all -> 0x01e8, blocks: (B:84:0x01d4, B:86:0x01e3, B:90:0x01eb, B:92:0x01f4, B:94:0x01fa), top: B:108:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x020f A[LOOP:0: B:97:0x0209->B:99:0x020f, LOOP_END] */
    public final Object a(long j, Network network, NetworkCapabilities networkCapabilities, boolean z, wretchedly.dern dernVar) {
        es1 es1Var;
        formularization.attabal attabalVar;
        long j2;
        NetworkCapabilities networkCapabilities2;
        boolean z2;
        Network network2;
        js1 js1Var;
        formularization.attabal attabalVar2;
        long j3;
        js1 js1Var2;
        formularization.attabal attabalVar3;
        ww2 ww2Var;
        long j4;
        String str;
        Iterator it;
        ww2 ww2Var2;
        int iA;
        ww2 ww2Var3;
        int iB;
        if (dernVar instanceof es1) {
            es1Var = (es1) dernVar;
            int i = es1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                es1Var.i = i - Integer.MIN_VALUE;
            } else {
                es1Var = new es1(this, dernVar);
            }
        } else {
            es1Var = new es1(this, dernVar);
        }
        Object obj = es1Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = es1Var.i;
        boolean z3 = true;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.h;
                es1Var.a = this;
                es1Var.b = network;
                es1Var.c = networkCapabilities;
                es1Var.d = attabalVar;
                j2 = j;
                es1Var.e = j2;
                es1Var.f = z;
                es1Var.i = 1;
                if (attabalVar.attabal(null, es1Var) != objBeachfront) {
                    networkCapabilities2 = networkCapabilities;
                    z2 = z;
                    network2 = network;
                    js1Var = this;
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = es1Var.e;
                    attabalVar2 = (formularization.attabal) es1Var.b;
                    js1Var2 = es1Var.a;
                    p002kotlin.dern.saneness(obj);
                    try {
                        js1Var2.j = j3;
                        js1Var2.i = true;
                        js1Var2.l.set(true);
                        AtomicInteger atomicInteger = js1Var2.m;
                        ww2Var2 = js1Var2.k;
                        if (ww2Var2 != null) {
                            iA = ww2Var2.a();
                        } else {
                            iA = 0;
                        }
                        atomicInteger.set(iA);
                        AtomicInteger atomicInteger2 = js1Var2.n;
                        ww2Var3 = js1Var2.k;
                        if (ww2Var3 != null) {
                            iB = ww2Var3.b();
                        } else {
                            iB = -1;
                        }
                        atomicInteger2.set(iB);
                        Unit unit = Unit.f29295attabal;
                        attabalVar2.wireman(null);
                        j4 = j3;
                        it = js1Var2.e.iterator();
                        while (it.hasNext()) {
                            long j5 = j4;
                            y13.a(js1Var2.b, new gs1(z3, (sustenance) it.next(), j5, null));
                            j4 = j5;
                        }
                        return Unit.f29295attabal;
                    } catch (Throwable th) {
                        attabalVar2.wireman(null);
                        throw th;
                    }
                }
                boolean z4 = es1Var.f;
                j4 = es1Var.e;
                attabalVar3 = (formularization.attabal) es1Var.c;
                ww2Var = (ww2) es1Var.b;
                js1Var2 = es1Var.a;
                p002kotlin.dern.saneness(obj);
                z3 = z4;
                try {
                    if (p002kotlin.time.saneness.formularize(j4, js1Var2.j) <= 0) {
                        Unit unit2 = Unit.f29295attabal;
                        attabalVar3.wireman(null);
                        return unit2;
                    }
                    js1Var2.j = j4;
                    js1Var2.k = ww2Var;
                    triweekly triweeklyVar = kn0.a;
                    kn0.a(new is1(j4));
                    js1Var2.m.set(ww2Var.a());
                    js1Var2.n.set(ww2Var.b());
                    if (z3 == js1Var2.i) {
                        if (z3) {
                            str = arytenoidectomy.dern.ONLINE_EXTRAS_KEY;
                        } else {
                            str = "offline";
                        }
                        kn0.b("Device is now " + str, null);
                        js1Var2.i = z3;
                        js1Var2.l.set(z3);
                        Unit unit3 = Unit.f29295attabal;
                        attabalVar3.wireman(null);
                        it = js1Var2.e.iterator();
                        while (it.hasNext()) {
                            long j6 = j4;
                            y13.a(js1Var2.b, new gs1(z3, (sustenance) it.next(), j6, null));
                            j4 = j6;
                        }
                        return Unit.f29295attabal;
                    }
                    Unit unit4 = Unit.f29295attabal;
                    attabalVar3.wireman(null);
                    return unit4;
                } catch (Throwable th2) {
                    attabalVar3.wireman(null);
                    throw th2;
                }
            }
            z2 = es1Var.f;
            j2 = es1Var.e;
            attabalVar = es1Var.d;
            networkCapabilities2 = (NetworkCapabilities) es1Var.c;
            network2 = (Network) es1Var.b;
            js1Var = es1Var.a;
            p002kotlin.dern.saneness(obj);
            if (p002kotlin.time.saneness.formularize(j2, js1Var.j) <= 0) {
                Unit unit5 = Unit.f29295attabal;
                attabalVar.wireman(null);
                return unit5;
            }
            boolean z5 = js1Var.i;
            attabalVar.wireman(null);
            triweekly triweeklyVar2 = kn0.a;
            kn0.a(new fs1(j2, z5));
            laky lakyVar = ip0.f;
            if (laky.competently(js1Var.a, "android.permission.ACCESS_NETWORK_STATE")) {
                if (networkCapabilities2 == null) {
                    if (network2 != null) {
                        ConnectivityManager connectivityManager = js1Var.f;
                        if (connectivityManager == null) {
                            Intrinsics.preprohormone("connectivityManager");
                            connectivityManager = null;
                        }
                        networkCapabilities2 = connectivityManager.getNetworkCapabilities(network2);
                    } else if (z2) {
                        ConnectivityManager connectivityManager2 = js1Var.f;
                        if (connectivityManager2 == null) {
                            Intrinsics.preprohormone("connectivityManager");
                            connectivityManager2 = null;
                        }
                        ConnectivityManager connectivityManager3 = js1Var.f;
                        if (connectivityManager3 == null) {
                            Intrinsics.preprohormone("connectivityManager");
                            connectivityManager3 = null;
                        }
                        networkCapabilities2 = connectivityManager2.getNetworkCapabilities(connectivityManager3.getActiveNetwork());
                    } else {
                        networkCapabilities2 = null;
                    }
                }
                boolean z6 = networkCapabilities2 != null && networkCapabilities2.hasCapability(12) && networkCapabilities2.hasCapability(16);
                kn0.a(new hs1(j2, z6));
                ww2 ww2Var4 = new ww2(nonexistence.wireman(js1Var.a), nonexistence.saneness(js1Var.a, networkCapabilities2), nonexistence.marial(js1Var.a), nonexistence.beachfront(js1Var.a), nonexistence.competently(js1Var.a), nonexistence.attabal(js1Var.a));
                attabalVar3 = js1Var.h;
                es1Var.a = js1Var;
                es1Var.b = ww2Var4;
                es1Var.c = attabalVar3;
                es1Var.d = null;
                es1Var.e = j2;
                es1Var.f = z6;
                es1Var.i = 2;
                if (attabalVar3.attabal(null, es1Var) != objBeachfront) {
                    ww2Var = ww2Var4;
                    z3 = z6;
                    j4 = j2;
                    js1Var2 = js1Var;
                    if (p002kotlin.time.saneness.formularize(j4, js1Var2.j) <= 0) {
                        Unit unit6 = Unit.f29295attabal;
                        attabalVar3.wireman(null);
                        return unit6;
                    }
                    js1Var2.j = j4;
                    js1Var2.k = ww2Var;
                    triweekly triweeklyVar3 = kn0.a;
                    kn0.a(new is1(j4));
                    js1Var2.m.set(ww2Var.a());
                    js1Var2.n.set(ww2Var.b());
                    if (z3 == js1Var2.i) {
                        if (z3) {
                            str = arytenoidectomy.dern.ONLINE_EXTRAS_KEY;
                        } else {
                            str = "offline";
                        }
                        kn0.b("Device is now " + str, null);
                        js1Var2.i = z3;
                        js1Var2.l.set(z3);
                        Unit unit7 = Unit.f29295attabal;
                        attabalVar3.wireman(null);
                        it = js1Var2.e.iterator();
                        while (it.hasNext()) {
                            long j7 = j4;
                            y13.a(js1Var2.b, new gs1(z3, (sustenance) it.next(), j7, null));
                            j4 = j7;
                        }
                        return Unit.f29295attabal;
                    }
                    Unit unit8 = Unit.f29295attabal;
                    attabalVar3.wireman(null);
                    return unit8;
                }
            } else {
                attabalVar2 = js1Var.h;
                es1Var.a = js1Var;
                es1Var.b = attabalVar2;
                es1Var.c = null;
                es1Var.d = null;
                es1Var.e = j2;
                es1Var.i = 3;
                if (attabalVar2.attabal(null, es1Var) != objBeachfront) {
                    j3 = j2;
                    js1Var2 = js1Var;
                    js1Var2.j = j3;
                    js1Var2.i = true;
                    js1Var2.l.set(true);
                    AtomicInteger atomicInteger3 = js1Var2.m;
                    ww2Var2 = js1Var2.k;
                    if (ww2Var2 != null) {
                        iA = ww2Var2.a();
                    } else {
                        iA = 0;
                    }
                    atomicInteger3.set(iA);
                    AtomicInteger atomicInteger4 = js1Var2.n;
                    ww2Var3 = js1Var2.k;
                    if (ww2Var3 != null) {
                        iB = ww2Var3.b();
                    } else {
                        iB = -1;
                    }
                    atomicInteger4.set(iB);
                    Unit unit9 = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    j4 = j3;
                    it = js1Var2.e.iterator();
                    while (it.hasNext()) {
                        long j8 = j4;
                        y13.a(js1Var2.b, new gs1(z3, (sustenance) it.next(), j8, null));
                        j4 = j8;
                    }
                    return Unit.f29295attabal;
                }
            }
            return objBeachfront;
        } catch (Throwable th3) {
            attabalVar.wireman(null);
            throw th3;
        }
    }
}
