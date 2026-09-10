package ld;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import dd.j;
import dd.v;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import nd.c0;
import nd.e0;
import nd.f0;
import nd.g0;
import nd.h;
import nd.l;
import nd.r0;
import nd.u;
import r1.q;
import r8.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements cd.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fd.a f45300r = fd.a.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f45301s = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f45302a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mb.g f45305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bd.c f45306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public uc.d f45307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tc.b f45308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f45309h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f45311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public dd.a f45312k;
    public d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public cd.c f45313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f45314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f45315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f45316p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f45303b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f45304c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45317q = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f45310i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public g() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f45302a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(g0 g0Var) {
        if (g0Var.e()) {
            r0 r0VarF = g0Var.f();
            long jV = r0VarF.v();
            Locale locale = Locale.ENGLISH;
            return l1.d.h("trace metric: ", r0VarF.getName(), " (duration: ", new DecimalFormat("#.####").format(jV / 1000.0d), "ms)");
        }
        if (g0Var.b()) {
            c0 c0VarC = g0Var.c();
            long jD = c0VarC.L() ? c0VarC.D() : 0L;
            String strValueOf = c0VarC.H() ? String.valueOf(c0VarC.y()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return defpackage.e.q(new DecimalFormat("#.####").format(jD / 1000.0d), "ms)", defpackage.e.v("network request trace: ", c0VarC.getUrl(), " (responseCode: ", strValueOf, ", responseTime: "));
        }
        if (!g0Var.a()) {
            return "log";
        }
        u uVarG = g0Var.g();
        Locale locale3 = Locale.ENGLISH;
        boolean zP = uVarG.p();
        int iM = uVarG.m();
        int iL = uVarG.l();
        StringBuilder sb2 = new StringBuilder("gauges (hasMetadata: ");
        sb2.append(zP);
        sb2.append(", cpuGaugeCount: ");
        sb2.append(iM);
        sb2.append(", memoryGaugeCount: ");
        return l1.d.i(sb2, iL, ")");
    }

    public final void b(f0 f0Var) {
        if (f0Var.e()) {
            this.f45313m.b("_fstec");
        } else if (f0Var.b()) {
            this.f45313m.b("_fsntc");
        }
    }

    public final void c(r0 r0Var, l lVar) {
        this.f45310i.execute(new f(this, r0Var, lVar, 1));
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:138:0x0308  */
    /* JADX WARN: Code duplicated, block: B:143:0x0342  */
    /* JADX WARN: Code duplicated, block: B:145:0x034c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0367  */
    /* JADX WARN: Code duplicated, block: B:157:0x0382  */
    /* JADX WARN: Code duplicated, block: B:159:0x0388  */
    /* JADX WARN: Code duplicated, block: B:163:0x0394 A[Catch: all -> 0x039c, TryCatch #3 {all -> 0x039c, blocks: (B:161:0x0390, B:163:0x0394, B:166:0x039f), top: B:236:0x0390 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:173:0x03df  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:178:0x0404  */
    /* JADX WARN: Code duplicated, block: B:180:0x040c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0414  */
    /* JADX WARN: Code duplicated, block: B:186:0x0422  */
    /* JADX WARN: Code duplicated, block: B:191:0x0443  */
    /* JADX WARN: Code duplicated, block: B:198:0x046e  */
    /* JADX WARN: Code duplicated, block: B:203:0x047c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0484  */
    /* JADX WARN: Code duplicated, block: B:207:0x048a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0491  */
    /* JADX WARN: Code duplicated, block: B:210:0x0494  */
    /* JADX WARN: Code duplicated, block: B:212:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:216:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:222:0x0504  */
    /* JADX WARN: Code duplicated, block: B:224:0x050e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0527  */
    /* JADX WARN: Code duplicated, block: B:228:0x0530  */
    /* JADX WARN: Code duplicated, block: B:229:0x0541  */
    /* JADX WARN: Code duplicated, block: B:236:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    public final void d(e0 e0Var, l lVar) {
        d dVar;
        boolean z10;
        boolean zB;
        dd.a aVar;
        j jVar;
        md.d dVar2;
        md.d dVarB;
        dd.e eVar;
        md.d dVar3;
        md.d dVarB2;
        double dDoubleValue;
        v vVar;
        double dDoubleValue2;
        fd.a aVar2;
        a aVar3;
        fd.a aVar4;
        nf nfVar;
        o8.f fVar;
        String name;
        String strI;
        String str;
        boolean z11 = true;
        if (!this.f45304c.get()) {
            ConcurrentHashMap concurrentHashMap = this.f45302a;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int iIntValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int iIntValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int iIntValue3 = num3.intValue();
            if (e0Var.e() && iIntValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            } else if (e0Var.b() && iIntValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            } else {
                if (!e0Var.a() || iIntValue3 <= 0) {
                    f45300r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", a(e0Var), num, num2, num3);
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            }
            f45300r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", a(e0Var));
            this.f45303b.add(new b(e0Var, lVar));
            return;
        }
        fd.a aVar5 = f45300r;
        if (this.f45312k.o() && (!this.f45314n.i() || this.f45317q)) {
            try {
                str = (String) Tasks.await(((uc.c) this.f45307f).c(), ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                aVar5.c("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                str = null;
            } catch (ExecutionException e11) {
                aVar5.c("Unable to retrieve Installation Id: %s", e11.getMessage());
                str = null;
            } catch (TimeoutException e12) {
                aVar5.c("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                aVar5.f("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            } else {
                this.f45314n.l(str);
            }
        }
        h hVar = this.f45314n;
        hVar.m(lVar);
        if (e0Var.e() || e0Var.b()) {
            hVar = (h) hVar.mo171clone();
            if (this.f45306e == null && this.f45304c.get()) {
                this.f45306e = bd.c.a();
            }
            bd.c cVar = this.f45306e;
            hVar.j(cVar != null ? new HashMap(cVar.f5587a) : Collections.EMPTY_MAP);
        }
        e0Var.d(hVar);
        f0 f0Var = (f0) e0Var.build();
        if (!this.f45312k.o()) {
            f45300r.e("Performance collection is not enabled, dropping %s", a(f0Var));
        } else if (f0Var.l().p()) {
            Context context = this.f45311j;
            Pattern pattern = hd.e.f42322a;
            ArrayList arrayList = new ArrayList();
            if (f0Var.e()) {
                arrayList.add(new hd.d(f0Var.f()));
            }
            if (f0Var.b()) {
                arrayList.add(new hd.c(f0Var.c(), context));
            }
            if (f0Var.m()) {
                arrayList.add(new hd.a(f0Var.l()));
            }
            if (f0Var.a()) {
                arrayList.add(new hd.b(f0Var.g()));
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        d dVar4 = this.l;
                        dVar4.getClass();
                        double dDoubleValue3 = 1.0d;
                        if (f0Var.e()) {
                            dd.a aVar6 = dVar4.f45289a;
                            aVar6.getClass();
                            synchronized (v.class) {
                                try {
                                    if (v.f38829a == null) {
                                        v.f38829a = new v();
                                    }
                                    vVar = v.f38829a;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            RemoteConfigManager remoteConfigManager = aVar6.f38806a;
                            vVar.getClass();
                            md.d dVar5 = remoteConfigManager.getDouble("fpr_vc_trace_sampling_rate");
                            if (dVar5.b() && dd.a.p(((Double) dVar5.a()).doubleValue())) {
                                aVar6.f38808c.e("com.google.firebase.perf.TraceSamplingRate", ((Double) dVar5.a()).doubleValue());
                                dDoubleValue2 = ((Double) dVar5.a()).doubleValue();
                            } else {
                                md.d dVarB3 = aVar6.b(vVar);
                                if (dVarB3.b() && dd.a.p(((Double) dVarB3.a()).doubleValue())) {
                                    dDoubleValue2 = ((Double) dVarB3.a()).doubleValue();
                                } else {
                                    dDoubleValue2 = aVar6.f38806a.isLastFetchFailed() ? 0.001d : 1.0d;
                                }
                            }
                            if (dVar4.f45290b >= dDoubleValue2 && !d.a(f0Var.f().w())) {
                                b(f0Var);
                                f45300r.e("Event dropped due to device sampling - %s", a(f0Var));
                            } else if (!f0Var.e() && f0Var.f().getName().startsWith("_st_") && f0Var.f().q()) {
                                dd.a aVar7 = dVar4.f45289a;
                                aVar7.getClass();
                                synchronized (dd.e.class) {
                                    try {
                                        if (dd.e.f38812a == null) {
                                            dd.e.f38812a = new dd.e();
                                        }
                                        eVar = dd.e.f38812a;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                md.d dVarI = aVar7.i(eVar);
                                if (dVarI.b()) {
                                    dDoubleValue = ((Double) dVarI.a()).doubleValue() / 100.0d;
                                    if (!dd.a.p(dDoubleValue)) {
                                        dVar3 = aVar7.f38806a.getDouble("fpr_vc_fragment_sampling_rate");
                                        if (dVar3.b() || !dd.a.p(((Double) dVar3.a()).doubleValue())) {
                                            dVarB2 = aVar7.b(eVar);
                                            if (dVarB2.b() || !dd.a.p(((Double) dVarB2.a()).doubleValue())) {
                                                dDoubleValue = 0.0d;
                                            } else {
                                                dDoubleValue = ((Double) dVarB2.a()).doubleValue();
                                            }
                                        } else {
                                            aVar7.f38808c.e("com.google.firebase.perf.FragmentSamplingRate", ((Double) dVar3.a()).doubleValue());
                                            dDoubleValue = ((Double) dVar3.a()).doubleValue();
                                        }
                                    }
                                } else {
                                    dVar3 = aVar7.f38806a.getDouble("fpr_vc_fragment_sampling_rate");
                                    if (dVar3.b()) {
                                        dVarB2 = aVar7.b(eVar);
                                        if (dVarB2.b()) {
                                            dDoubleValue = 0.0d;
                                        } else {
                                            dDoubleValue = 0.0d;
                                        }
                                    } else {
                                        dVarB2 = aVar7.b(eVar);
                                        if (dVarB2.b()) {
                                            dDoubleValue = 0.0d;
                                        } else {
                                            dDoubleValue = 0.0d;
                                        }
                                    }
                                }
                                if (dVar4.f45291c >= dDoubleValue && !d.a(f0Var.f().w())) {
                                    b(f0Var);
                                    f45300r.e("Event dropped due to device sampling - %s", a(f0Var));
                                } else {
                                    if (f0Var.b()) {
                                        aVar = dVar4.f45289a;
                                        aVar.getClass();
                                        synchronized (j.class) {
                                            if (j.f38817a == null) {
                                                j.f38817a = new j();
                                            }
                                            jVar = j.f38817a;
                                            RemoteConfigManager remoteConfigManager2 = aVar.f38806a;
                                            jVar.getClass();
                                            dVar2 = remoteConfigManager2.getDouble("fpr_vc_network_request_sampling_rate");
                                            if (dVar2.b()) {
                                                dVarB = aVar.b(jVar);
                                                if (!dVarB.b()) {
                                                    if (aVar.f38806a.isLastFetchFailed()) {
                                                        dDoubleValue3 = 0.001d;
                                                    }
                                                } else if (aVar.f38806a.isLastFetchFailed()) {
                                                    dDoubleValue3 = 0.001d;
                                                }
                                            } else {
                                                dVarB = aVar.b(jVar);
                                                if (!dVarB.b()) {
                                                    if (aVar.f38806a.isLastFetchFailed()) {
                                                        dDoubleValue3 = 0.001d;
                                                    }
                                                } else if (aVar.f38806a.isLastFetchFailed()) {
                                                    dDoubleValue3 = 0.001d;
                                                }
                                            }
                                            if (dVar4.f45290b >= dDoubleValue3) {
                                                b(f0Var);
                                                f45300r.e("Event dropped due to device sampling - %s", a(f0Var));
                                            }
                                        }
                                    }
                                    dVar = this.l;
                                    dVar.getClass();
                                    if (f0Var.e()) {
                                        if (f0Var.b()) {
                                            zB = dVar.f45293e.b();
                                        } else if (f0Var.e()) {
                                            zB = dVar.f45292d.b();
                                        } else {
                                            z10 = true;
                                        }
                                        z10 = !zB;
                                    } else {
                                        if (f0Var.b()) {
                                            zB = dVar.f45293e.b();
                                        } else if (f0Var.e()) {
                                            zB = dVar.f45292d.b();
                                        } else {
                                            z10 = true;
                                        }
                                        z10 = !zB;
                                    }
                                    if (z10) {
                                        b(f0Var);
                                        f45300r.e("Rate limited (per device) - %s", a(f0Var));
                                    }
                                }
                            } else {
                                if (f0Var.b()) {
                                    aVar = dVar4.f45289a;
                                    aVar.getClass();
                                    synchronized (j.class) {
                                        try {
                                            if (j.f38817a == null) {
                                                j.f38817a = new j();
                                            }
                                            jVar = j.f38817a;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    RemoteConfigManager remoteConfigManager3 = aVar.f38806a;
                                    jVar.getClass();
                                    dVar2 = remoteConfigManager3.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (dVar2.b() || !dd.a.p(((Double) dVar2.a()).doubleValue())) {
                                        dVarB = aVar.b(jVar);
                                        if (!dVarB.b() && dd.a.p(((Double) dVarB.a()).doubleValue())) {
                                            dDoubleValue3 = ((Double) dVarB.a()).doubleValue();
                                        } else if (aVar.f38806a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    } else {
                                        aVar.f38808c.e("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) dVar2.a()).doubleValue());
                                        dDoubleValue3 = ((Double) dVar2.a()).doubleValue();
                                    }
                                    if (dVar4.f45290b >= dDoubleValue3 && !d.a(f0Var.c().z())) {
                                        b(f0Var);
                                        f45300r.e("Event dropped due to device sampling - %s", a(f0Var));
                                    }
                                }
                                dVar = this.l;
                                dVar.getClass();
                                if ((f0Var.e() || (!(f0Var.f().getName().equals("_fs") || f0Var.f().getName().equals("_bs")) || f0Var.f().r() <= 0)) && !f0Var.a()) {
                                    if (f0Var.b()) {
                                        zB = dVar.f45293e.b();
                                    } else if (f0Var.e()) {
                                        zB = dVar.f45292d.b();
                                    } else {
                                        z10 = true;
                                    }
                                    z10 = !zB;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    b(f0Var);
                                    f45300r.e("Rate limited (per device) - %s", a(f0Var));
                                }
                            }
                        } else if (!f0Var.e()) {
                            if (f0Var.b()) {
                                aVar = dVar4.f45289a;
                                aVar.getClass();
                                synchronized (j.class) {
                                    if (j.f38817a == null) {
                                        j.f38817a = new j();
                                    }
                                    jVar = j.f38817a;
                                    RemoteConfigManager remoteConfigManager4 = aVar.f38806a;
                                    jVar.getClass();
                                    dVar2 = remoteConfigManager4.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (dVar2.b()) {
                                        dVarB = aVar.b(jVar);
                                        if (!dVarB.b()) {
                                            if (aVar.f38806a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (aVar.f38806a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    } else {
                                        dVarB = aVar.b(jVar);
                                        if (!dVarB.b()) {
                                            if (aVar.f38806a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (aVar.f38806a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    }
                                    if (dVar4.f45290b >= dDoubleValue3) {
                                        b(f0Var);
                                        f45300r.e("Event dropped due to device sampling - %s", a(f0Var));
                                    }
                                }
                            }
                            dVar = this.l;
                            dVar.getClass();
                            if (f0Var.e()) {
                                if (f0Var.b()) {
                                    zB = dVar.f45293e.b();
                                } else if (f0Var.e()) {
                                    zB = dVar.f45292d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            } else {
                                if (f0Var.b()) {
                                    zB = dVar.f45293e.b();
                                } else if (f0Var.e()) {
                                    zB = dVar.f45292d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            }
                            if (z10) {
                                b(f0Var);
                                f45300r.e("Rate limited (per device) - %s", a(f0Var));
                            }
                        } else {
                            if (f0Var.b()) {
                                aVar = dVar4.f45289a;
                                aVar.getClass();
                                synchronized (j.class) {
                                    if (j.f38817a == null) {
                                        j.f38817a = new j();
                                    }
                                    jVar = j.f38817a;
                                    RemoteConfigManager remoteConfigManager5 = aVar.f38806a;
                                    jVar.getClass();
                                    dVar2 = remoteConfigManager5.getDouble("fpr_vc_network_request_sampling_rate");
                                    if (dVar2.b()) {
                                        dVarB = aVar.b(jVar);
                                        if (!dVarB.b()) {
                                            if (aVar.f38806a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (aVar.f38806a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    } else {
                                        dVarB = aVar.b(jVar);
                                        if (!dVarB.b()) {
                                            if (aVar.f38806a.isLastFetchFailed()) {
                                                dDoubleValue3 = 0.001d;
                                            }
                                        } else if (aVar.f38806a.isLastFetchFailed()) {
                                            dDoubleValue3 = 0.001d;
                                        }
                                    }
                                    if (dVar4.f45290b >= dDoubleValue3) {
                                        b(f0Var);
                                        f45300r.e("Event dropped due to device sampling - %s", a(f0Var));
                                    }
                                }
                            }
                            dVar = this.l;
                            dVar.getClass();
                            if (f0Var.e()) {
                                if (f0Var.b()) {
                                    zB = dVar.f45293e.b();
                                } else if (f0Var.e()) {
                                    zB = dVar.f45292d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            } else {
                                if (f0Var.b()) {
                                    zB = dVar.f45293e.b();
                                } else if (f0Var.e()) {
                                    zB = dVar.f45292d.b();
                                } else {
                                    z10 = true;
                                }
                                z10 = !zB;
                            }
                            if (z10) {
                                b(f0Var);
                                f45300r.e("Rate limited (per device) - %s", a(f0Var));
                            }
                        }
                    } else if (!((hd.e) it.next()).a()) {
                    }
                    if (z11) {
                        aVar2 = f45300r;
                        if (f0Var.e()) {
                            String strA = a(f0Var);
                            name = f0Var.f().getName();
                            if (name.startsWith("_st_")) {
                                strI = q4.a.i(com.bumptech.glide.c.u(this.f45316p, this.f45315o), "/troubleshooting/trace/SCREEN_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            } else {
                                strI = q4.a.i(com.bumptech.glide.c.u(this.f45316p, this.f45315o), "/troubleshooting/trace/DURATION_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                            }
                            aVar2.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA, strI);
                        } else {
                            aVar2.e("Logging %s", a(f0Var));
                        }
                        aVar3 = this.f45309h;
                        aVar4 = a.f45274d;
                        if (aVar3.f45277c == null) {
                            fVar = (o8.f) aVar3.f45276b.get();
                            if (fVar != null) {
                                aVar3.f45277c = ((o) fVar).a(aVar3.f45275a, new o8.c("proto"), new i0.a(17));
                            } else {
                                aVar4.f("Flg TransportFactory is not available at the moment");
                            }
                        }
                        nfVar = aVar3.f45277c;
                        if (nfVar != null) {
                            nfVar.y(new o8.a(f0Var, o8.d.f47211a, null), new q(4));
                        } else {
                            aVar4.f("Unable to dispatch event because Flg Transport is not available");
                        }
                        SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                    }
                }
            }
            fd.a.d().a("No validators found for PerfMetric.");
            f45300r.g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", a(f0Var));
        } else {
            f45300r.g("App Instance ID is null or empty, dropping %s", a(f0Var));
        }
        z11 = false;
        if (z11) {
            aVar2 = f45300r;
            if (f0Var.e()) {
                String strA2 = a(f0Var);
                name = f0Var.f().getName();
                if (name.startsWith("_st_")) {
                    strI = q4.a.i(com.bumptech.glide.c.u(this.f45316p, this.f45315o), "/troubleshooting/trace/SCREEN_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                } else {
                    strI = q4.a.i(com.bumptech.glide.c.u(this.f45316p, this.f45315o), "/troubleshooting/trace/DURATION_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide");
                }
                aVar2.e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strA2, strI);
            } else {
                aVar2.e("Logging %s", a(f0Var));
            }
            aVar3 = this.f45309h;
            aVar4 = a.f45274d;
            if (aVar3.f45277c == null) {
                fVar = (o8.f) aVar3.f45276b.get();
                if (fVar != null) {
                    aVar3.f45277c = ((o) fVar).a(aVar3.f45275a, new o8.c("proto"), new i0.a(17));
                } else {
                    aVar4.f("Flg TransportFactory is not available at the moment");
                }
            }
            nfVar = aVar3.f45277c;
            if (nfVar != null) {
                nfVar.y(new o8.a(f0Var, o8.d.f47211a, null), new q(4));
            } else {
                aVar4.f("Unable to dispatch event because Flg Transport is not available");
            }
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    @Override // cd.b
    public final void onUpdateAppState(l lVar) {
        this.f45317q = lVar == l.FOREGROUND;
        if (this.f45304c.get()) {
            this.f45310i.execute(new e(this, 0));
        }
    }
}
