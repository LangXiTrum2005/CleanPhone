package pd;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m0.s1;
import m5.k;
import qd.m;
import qd.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements sd.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Random f48338j = new Random();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f48339k = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f48341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f48342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.g f48343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uc.d f48344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nb.c f48345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tc.b f48346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48347h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f48340a = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f48348i = new HashMap();

    public j(Context context, ScheduledExecutorService scheduledExecutorService, mb.g gVar, uc.d dVar, nb.c cVar, tc.b bVar) {
        this.f48341b = context;
        this.f48342c = scheduledExecutorService;
        this.f48343d = gVar;
        this.f48344e = dVar;
        this.f48345f = cVar;
        this.f48346g = bVar;
        gVar.a();
        this.f48347h = gVar.f45930c.f45944b;
        AtomicReference atomicReference = i.f48337a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = i.f48337a;
        if (atomicReference2.get() == null) {
            i iVar = new i();
            while (!atomicReference2.compareAndSet(null, iVar)) {
                if (atomicReference2.get() != null) {
                }
            }
            com.google.android.gms.common.api.internal.c.b(application);
            com.google.android.gms.common.api.internal.c.f11675e.a(iVar);
        }
        Tasks.call(scheduledExecutorService, new hc.c(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    public final synchronized b a(String str) throws Throwable {
        Throwable th2;
        s1 s1Var;
        try {
            try {
                qd.b bVarC = c(str, "fetch");
                qd.b bVarC2 = c(str, "activate");
                qd.b bVarC3 = c(str, "defaults");
                try {
                    m mVar = new m(this.f48341b.getSharedPreferences("frc_" + this.f48347h + "_" + str + "_settings", 0));
                    qd.h hVar = new qd.h(this.f48342c, bVarC2, bVarC3);
                    mb.g gVar = this.f48343d;
                    tc.b bVar = this.f48346g;
                    gVar.a();
                    if (gVar.f45929b.equals("[DEFAULT]")) {
                        try {
                            if (str.equals("firebase")) {
                                s1Var = new s1(bVar);
                            } else {
                                s1Var = null;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        s1Var = null;
                    }
                    if (s1Var != null) {
                        h hVar2 = new h(s1Var);
                        synchronized (hVar.f48975a) {
                            hVar.f48975a.add(hVar2);
                        }
                    }
                    k kVar = new k(14, false);
                    kVar.f45902b = bVarC2;
                    kVar.f45903c = bVarC3;
                    ScheduledExecutorService scheduledExecutorService = this.f48342c;
                    k5.g gVar2 = new k5.g();
                    gVar2.f44328d = Collections.newSetFromMap(new ConcurrentHashMap());
                    gVar2.f44325a = bVarC2;
                    gVar2.f44326b = kVar;
                    gVar2.f44327c = scheduledExecutorService;
                    return b(this.f48343d, str, this.f48344e, this.f48345f, this.f48342c, bVarC, bVarC2, bVarC3, d(str, bVarC, mVar), hVar, mVar, gVar2);
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th6) {
            th = th6;
            th2 = th;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public final synchronized b b(mb.g gVar, String str, uc.d dVar, nb.c cVar, Executor executor, qd.b bVar, qd.b bVar2, qd.b bVar3, qd.g gVar2, qd.h hVar, m mVar, k5.g gVar3) {
        nb.c cVar2;
        if (!this.f48340a.containsKey(str)) {
            if (str.equals("firebase")) {
                gVar.a();
                if (gVar.f45929b.equals("[DEFAULT]")) {
                    cVar2 = cVar;
                } else {
                    cVar2 = null;
                }
            } else {
                cVar2 = null;
            }
            Context context = this.f48341b;
            synchronized (this) {
                b bVar4 = new b(cVar2, executor, bVar, bVar2, bVar3, gVar2, hVar, mVar, new qd.i(gVar, dVar, gVar2, bVar2, context, str, mVar, this.f48342c), gVar3);
                bVar2.b();
                bVar3.b();
                bVar.b();
                this.f48340a.put(str, bVar4);
                f48339k.put(str, bVar4);
            }
        }
        return (b) this.f48340a.get(str);
    }

    public final qd.b c(String str, String str2) {
        n nVar;
        qd.b bVar;
        String strQ = defpackage.e.q(str2, ".json", defpackage.e.v("frc_", this.f48347h, "_", str, "_"));
        ScheduledExecutorService scheduledExecutorService = this.f48342c;
        Context context = this.f48341b;
        HashMap map = n.f49011c;
        synchronized (n.class) {
            try {
                HashMap map2 = n.f49011c;
                if (!map2.containsKey(strQ)) {
                    map2.put(strQ, new n(context, strQ));
                }
                nVar = (n) map2.get(strQ);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HashMap map3 = qd.b.f48939d;
        synchronized (qd.b.class) {
            try {
                String str3 = nVar.f49013b;
                HashMap map4 = qd.b.f48939d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new qd.b(scheduledExecutorService, nVar));
                }
                bVar = (qd.b) map4.get(str3);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    public final synchronized qd.g d(String str, qd.b bVar, m mVar) {
        uc.d dVar;
        tc.b dVar2;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        mb.g gVar;
        try {
            dVar = this.f48344e;
            mb.g gVar2 = this.f48343d;
            gVar2.a();
            dVar2 = gVar2.f45929b.equals("[DEFAULT]") ? this.f48346g : new kd.d(3);
            scheduledExecutorService = this.f48342c;
            random = f48338j;
            mb.g gVar3 = this.f48343d;
            gVar3.a();
            str2 = gVar3.f45930c.f45943a;
            gVar = this.f48343d;
            gVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new qd.g(dVar, dVar2, scheduledExecutorService, random, bVar, new ConfigFetchHttpClient(this.f48341b, gVar.f45930c.f45944b, str2, str, mVar.f49007a.getLong("fetch_timeout_in_seconds", 60L), mVar.f49007a.getLong("fetch_timeout_in_seconds", 60L)), mVar, this.f48348i);
    }
}
