package e5;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.j60;
import com.google.common.util.concurrent.ListenableFuture;
import d5.n;
import d5.o;
import d5.w;
import ea.e2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import m0.s1;
import n5.p;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f39118t = o.i("WorkerWrapper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f39119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f39121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v9.e f39122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m5.i f39123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListenableWorker f39124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g9.k f39125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f39126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j60 f39127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f39128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorkDatabase f39129k;
    public com.google.android.gms.internal.consent_sdk.d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s1 f39130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m5.k f39131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f39132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f39133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o5.j f39134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ListenableFuture f39135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f39136s;

    public final void a(n nVar) {
        boolean z10 = nVar instanceof d5.m;
        String str = f39118t;
        if (!z10) {
            if (nVar instanceof d5.l) {
                o.g().h(str, defpackage.e.n("Worker result RETRY for ", this.f39133p), new Throwable[0]);
                c();
                return;
            }
            o.g().h(str, defpackage.e.n("Worker result FAILURE for ", this.f39133p), new Throwable[0]);
            if (this.f39123e.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        o.g().h(str, defpackage.e.n("Worker result SUCCESS for ", this.f39133p), new Throwable[0]);
        if (this.f39123e.c()) {
            d();
            return;
        }
        s1 s1Var = this.f39130m;
        String str2 = this.f39120b;
        com.google.android.gms.internal.consent_sdk.d dVar = this.l;
        WorkDatabase workDatabase = this.f39129k;
        workDatabase.c();
        try {
            dVar.t(3, str2);
            dVar.r(str2, ((d5.m) this.f39126h).f38700a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : s1Var.l(str2)) {
                if (dVar.i(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s1Var.f45751b;
                    g4.h hVarB = g4.h.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        hVarB.h(1);
                    } else {
                        hVarB.j(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorG = workDatabase_Impl.g(hVarB);
                    try {
                        boolean z11 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                        cursorG.close();
                        hVarB.k();
                        if (z11) {
                            o.g().h(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            dVar.t(1, str3);
                            dVar.s(jCurrentTimeMillis, str3);
                        }
                    } catch (Throwable th2) {
                        cursorG.close();
                        hVarB.k();
                        throw th2;
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th3) {
            workDatabase.f();
            e(false);
            throw th3;
        }
    }

    public final void b() {
        List list = this.f39121c;
        String str = this.f39120b;
        WorkDatabase workDatabase = this.f39129k;
        if (!h()) {
            workDatabase.c();
            try {
                int i10 = this.l.i(str);
                u uVarM = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) uVarM.f54879b;
                workDatabase_Impl.b();
                m5.e eVar = (m5.e) uVarM.f54881d;
                l4.f fVarA = eVar.a();
                if (str == null) {
                    fVarA.k(1);
                } else {
                    fVarA.n(1, str);
                }
                workDatabase_Impl.c();
                try {
                    fVarA.t();
                    workDatabase_Impl.h();
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                    if (i10 == 0) {
                        e(false);
                    } else if (i10 == 2) {
                        a(this.f39126h);
                    } else if (!d5.u.a(i10)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th2) {
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase.f();
                throw th3;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(str);
            }
            d.a(this.f39127i, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f39120b;
        com.google.android.gms.internal.consent_sdk.d dVar = this.l;
        WorkDatabase workDatabase = this.f39129k;
        workDatabase.c();
        try {
            dVar.t(1, str);
            dVar.s(System.currentTimeMillis(), str);
            dVar.p(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.f39120b;
        com.google.android.gms.internal.consent_sdk.d dVar = this.l;
        WorkDatabase workDatabase = this.f39129k;
        workDatabase.c();
        try {
            dVar.s(System.currentTimeMillis(), str);
            dVar.t(1, str);
            dVar.q(str);
            dVar.p(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final void e(boolean z10) {
        ListenableWorker listenableWorker;
        this.f39129k.c();
        try {
            com.google.android.gms.internal.consent_sdk.d dVarN = this.f39129k.n();
            dVarN.getClass();
            g4.h hVarB = g4.h.b(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) dVarN.f22981a;
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(hVarB);
            try {
                boolean z11 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                cursorG.close();
                hVarB.k();
                if (!z11) {
                    n5.g.a(this.f39119a, RescheduleReceiver.class, false);
                }
                if (z10) {
                    this.l.t(1, this.f39120b);
                    this.l.p(-1L, this.f39120b);
                }
                if (this.f39123e != null && (listenableWorker = this.f39124f) != null && listenableWorker.isRunInForeground()) {
                    b bVar = this.f39128j;
                    String str = this.f39120b;
                    synchronized (bVar.f39085k) {
                        bVar.f39080f.remove(str);
                        bVar.h();
                    }
                }
                this.f39129k.h();
                this.f39129k.f();
                this.f39134q.h(Boolean.valueOf(z10));
            } catch (Throwable th2) {
                cursorG.close();
                hVarB.k();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f39129k.f();
            throw th3;
        }
    }

    public final void f() {
        com.google.android.gms.internal.consent_sdk.d dVar = this.l;
        String str = this.f39120b;
        int i10 = dVar.i(str);
        String str2 = f39118t;
        if (i10 == 2) {
            o.g().e(str2, defpackage.e.o("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        o oVarG = o.g();
        StringBuilder sbK = d5.u.k("Status for ", str, " is ");
        sbK.append(d5.u.w(i10));
        sbK.append("; not doing any work");
        oVarG.e(str2, sbK.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        com.google.android.gms.internal.consent_sdk.d dVar = this.l;
        String str = this.f39120b;
        WorkDatabase workDatabase = this.f39129k;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (dVar.i(str2) != 6) {
                    dVar.t(4, str2);
                }
                linkedList.addAll(this.f39130m.l(str2));
            }
            dVar.r(str, ((d5.k) this.f39126h).f38699a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f39136s) {
            return false;
        }
        o.g().e(f39118t, defpackage.e.n("Work interrupted for ", this.f39133p), new Throwable[0]);
        int i10 = this.l.i(this.f39120b);
        if (i10 == 0) {
            e(false);
            return true;
        }
        e(!d5.u.a(i10));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c3 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:14:0x0056, B:17:0x0060, B:22:0x0082, B:24:0x0086, B:27:0x00ae, B:29:0x00b4, B:31:0x00ba, B:44:0x0102, B:36:0x00c3, B:39:0x00d2, B:41:0x00da), top: B:105:0x0056 }] */
    @Override // java.lang.Runnable
    public final void run() {
        m5.i iVar;
        d5.i iVar2;
        d5.f fVarA;
        m5.k kVar = this.f39131n;
        String str = this.f39120b;
        ArrayList<String> arrayListA = kVar.A(str);
        this.f39132o = arrayListA;
        StringBuilder sbK = d5.u.k("Work [ id=", str, ", tags={ ");
        boolean z10 = true;
        for (String str2 : arrayListA) {
            if (z10) {
                z10 = false;
            } else {
                sbK.append(", ");
            }
            sbK.append(str2);
        }
        sbK.append(" } ]");
        this.f39133p = sbK.toString();
        j60 j60Var = this.f39127i;
        com.google.android.gms.internal.consent_sdk.d dVar = this.l;
        g9.k kVar2 = this.f39125g;
        WorkDatabase workDatabase = this.f39129k;
        if (h()) {
            return;
        }
        workDatabase.c();
        try {
            m5.i iVarL = dVar.l(str);
            this.f39123e = iVarL;
            String str3 = f39118t;
            if (iVarL == null) {
                o.g().f(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                e(false);
                workDatabase.h();
                workDatabase.f();
                return;
            }
            if (iVarL.f45883b != 1) {
                f();
                workDatabase.h();
                o.g().e(str3, this.f39123e.f45884c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                workDatabase.f();
                return;
            }
            if (iVarL.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                iVar = this.f39123e;
                if (iVar.f45894n != 0) {
                    o.g().e(str3, "Delaying execution for " + this.f39123e.f45884c + " because it is being executed before schedule.", new Throwable[0]);
                    e(true);
                    workDatabase.h();
                    workDatabase.f();
                    return;
                }
            } else {
                m5.i iVar3 = this.f39123e;
                if (iVar3.f45883b == 1 && iVar3.f45892k > 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    iVar = this.f39123e;
                    if (iVar.f45894n != 0 && jCurrentTimeMillis2 < iVar.a()) {
                        o.g().e(str3, "Delaying execution for " + this.f39123e.f45884c + " because it is being executed before schedule.", new Throwable[0]);
                        e(true);
                        workDatabase.h();
                        workDatabase.f();
                        return;
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f39123e.c()) {
                fVarA = this.f39123e.f45886e;
            } else {
                fd.b bVar = (fd.b) j60Var.f15999g;
                String str4 = this.f39123e.f45885d;
                bVar.getClass();
                String str5 = d5.i.f38697a;
                try {
                    iVar2 = (d5.i) Class.forName(str4).newInstance();
                } catch (Exception e10) {
                    o.g().f(d5.i.f38697a, defpackage.e.n("Trouble instantiating + ", str4), e10);
                    iVar2 = null;
                }
                if (iVar2 == null) {
                    o.g().f(str3, defpackage.e.n("Could not create Input Merger ", this.f39123e.f45885d), new Throwable[0]);
                    g();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f39123e.f45886e);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) dVar.f22981a;
                g4.h hVarB = g4.h.b(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    hVarB.h(1);
                } else {
                    hVarB.j(1, str);
                }
                workDatabase_Impl.b();
                Cursor cursorG = workDatabase_Impl.g(hVarB);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        arrayList2.add(d5.f.a(cursorG.getBlob(0)));
                    }
                    cursorG.close();
                    hVarB.k();
                    arrayList.addAll(arrayList2);
                    fVarA = iVar2.a(arrayList);
                } catch (Throwable th2) {
                    cursorG.close();
                    hVarB.k();
                    throw th2;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ArrayList arrayList3 = this.f39132o;
            v9.e eVar = this.f39122d;
            int i10 = this.f39123e.f45892k;
            ExecutorService executorService = (ExecutorService) j60Var.f15996d;
            w wVar = (w) j60Var.f15998f;
            p pVar = new p(workDatabase, kVar2);
            n5.o oVar = new n5.o(workDatabase, this.f39128j, kVar2);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f5010a = uuidFromString;
            workerParameters.f5011b = fVarA;
            workerParameters.f5012c = new HashSet(arrayList3);
            workerParameters.f5013d = eVar;
            workerParameters.f5014e = i10;
            workerParameters.f5015f = executorService;
            workerParameters.f5016g = kVar2;
            workerParameters.f5017h = wVar;
            workerParameters.f5018i = pVar;
            workerParameters.f5019j = oVar;
            if (this.f39124f == null) {
                this.f39124f = wVar.a(this.f39119a, this.f39123e.f45884c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f39124f;
            if (listenableWorker == null) {
                o.g().f(str3, defpackage.e.n("Could not create Worker ", this.f39123e.f45884c), new Throwable[0]);
                g();
                return;
            }
            if (listenableWorker.isUsed()) {
                o.g().f(str3, defpackage.e.o("Received an already-used Worker ", this.f39123e.f45884c, "; WorkerFactory should return new instances"), new Throwable[0]);
                g();
                return;
            }
            this.f39124f.setUsed();
            workDatabase.c();
            try {
                boolean z11 = true;
                if (dVar.i(str) == 1) {
                    dVar.t(2, str);
                    dVar.m(str);
                } else {
                    z11 = false;
                }
                workDatabase.h();
                workDatabase.f();
                if (!z11) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                o5.j jVar = new o5.j();
                n5.n nVar = new n5.n(this.f39119a, this.f39123e, this.f39124f, oVar, this.f39125g);
                ((e2) kVar2.f41772d).execute(nVar);
                o5.j jVar2 = nVar.f46543a;
                jVar2.addListener(new m0(this, jVar2, jVar, 6), (e2) kVar2.f41772d);
                jVar.addListener(new m0(this, jVar, this.f39133p, 7), (n5.j) kVar2.f41770b);
            } catch (Throwable th3) {
                workDatabase.f();
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.f();
            throw th4;
        }
    }
}
