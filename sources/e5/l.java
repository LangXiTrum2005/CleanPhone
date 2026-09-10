package e5;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.applovin.impl.da;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.j60;
import com.google.android.gms.internal.ads.mk0;
import com.storage.androidcleaner.R;
import d5.o;
import d5.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static l f39107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static l f39108k;
    public static final Object l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j60 f39110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f39111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g9.k f39112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f39114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s4.i f39115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f39117i;

    static {
        o.i("WorkManagerImpl");
        f39107j = null;
        f39108k = null;
        l = new Object();
    }

    public l(Context context, j60 j60Var, g9.k kVar) {
        g4.e eVar;
        Executor executor;
        String str;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        n5.j jVar = (n5.j) kVar.f41770b;
        int i10 = WorkDatabase.f5021k;
        int i11 = 0;
        if (z10) {
            eVar = new g4.e(applicationContext, null);
            eVar.f41490g = true;
        } else {
            String str2 = k.f39105a;
            g4.e eVar2 = new g4.e(applicationContext, "androidx.work.workdb");
            eVar2.f41489f = new f(applicationContext, i11);
            eVar = eVar2;
        }
        eVar.f41487d = jVar;
        g gVar = new g();
        if (eVar.f41486c == null) {
            eVar.f41486c = new ArrayList();
        }
        eVar.f41486c.add(gVar);
        eVar.a(j.f39098a);
        eVar.a(new i(applicationContext, 2, 3));
        eVar.a(j.f39099b);
        eVar.a(j.f39100c);
        eVar.a(new i(applicationContext, 5, 6));
        eVar.a(j.f39101d);
        eVar.a(j.f39102e);
        eVar.a(j.f39103f);
        eVar.a(new i(applicationContext));
        int i12 = 11;
        eVar.a(new i(applicationContext, 10, 11));
        eVar.a(j.f39104g);
        eVar.f41491h = false;
        eVar.f41492i = true;
        Context context2 = eVar.f41485b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = eVar.f41487d;
        if (executor2 == null && eVar.f41488e == null) {
            da daVar = q.a.f48508d;
            eVar.f41488e = daVar;
            eVar.f41487d = daVar;
        } else if (executor2 != null && eVar.f41488e == null) {
            eVar.f41488e = executor2;
        } else if (executor2 == null && (executor = eVar.f41488e) != null) {
            eVar.f41487d = executor;
        }
        if (eVar.f41489f == null) {
            eVar.f41489f = new jj.d(i12);
        }
        String str3 = eVar.f41484a;
        k4.a aVar = eVar.f41489f;
        d5.e eVar3 = eVar.f41493j;
        ArrayList arrayList = eVar.f41486c;
        boolean z11 = eVar.f41490g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i13 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = eVar.f41487d;
        mk0 mk0Var = new mk0(context2, str3, aVar, eVar3, arrayList, z11, i13, executor3, eVar.f41488e, eVar.f41491h, eVar.f41492i);
        int i14 = i13;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            g4.f fVar = (g4.f) Class.forName(str).newInstance();
            k4.b bVarE = fVar.e(mk0Var);
            fVar.f41497c = bVarE;
            boolean z12 = i14 == 3;
            bVarE.setWriteAheadLoggingEnabled(z12);
            fVar.f41501g = arrayList;
            fVar.f41496b = executor3;
            new ArrayDeque();
            fVar.f41499e = z11;
            fVar.f41500f = z12;
            WorkDatabase workDatabase = (WorkDatabase) fVar;
            Context applicationContext2 = context.getApplicationContext();
            o oVar = new o(j60Var.f15993a, 0);
            synchronized (o.class) {
                o.f38701c = oVar;
            }
            String str5 = d.f39086a;
            h5.b bVar = new h5.b(applicationContext2, this);
            n5.g.a(applicationContext2, SystemJobService.class, true);
            o.g().e(d.f39086a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List listAsList = Arrays.asList(bVar, new f5.b(applicationContext2, j60Var, kVar, this));
            b bVar2 = new b(context, j60Var, kVar, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.f39109a = applicationContext3;
            this.f39110b = j60Var;
            this.f39112d = kVar;
            this.f39111c = workDatabase;
            this.f39113e = listAsList;
            this.f39114f = bVar2;
            this.f39115g = new s4.i(workDatabase);
            this.f39116h = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f39112d.k(new n5.e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static l b(Context context) {
        l lVar;
        Object obj = l;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        lVar = f39107j;
                        if (lVar == null) {
                            lVar = f39108k;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return lVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (lVar != null) {
            return lVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void c(Context context, j60 j60Var) {
        synchronized (l) {
            try {
                l lVar = f39107j;
                if (lVar != null && f39108k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (lVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f39108k == null) {
                        f39108k = new l(applicationContext, j60Var, new g9.k((ExecutorService) j60Var.f15997e));
                    }
                    f39107j = f39108k;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (l) {
            try {
                this.f39116h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f39117i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f39117i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        ArrayList arrayListE;
        String str = h5.b.f42211e;
        Context context = this.f39109a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = h5.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                h5.b.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f39111c;
        com.google.android.gms.internal.consent_sdk.d dVarN = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) dVarN.f22981a;
        workDatabase_Impl.b();
        m5.e eVar = (m5.e) dVarN.f22989i;
        l4.f fVarA = eVar.a();
        workDatabase_Impl.c();
        try {
            fVarA.f45036d.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(fVarA);
            d.a(this.f39110b, workDatabase, this.f39113e);
        } catch (Throwable th2) {
            workDatabase_Impl.f();
            eVar.c(fVarA);
            throw th2;
        }
    }

    public final void f(String str, v9.e eVar) {
        m0 m0Var = new m0(22);
        m0Var.f11735c = this;
        m0Var.f11734b = str;
        m0Var.f11736d = eVar;
        this.f39112d.k(m0Var);
    }

    public final void g(String str) {
        this.f39112d.k(new n5.k(this, str, false));
    }
}
