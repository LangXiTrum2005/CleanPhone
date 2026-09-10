package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bo.e;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mbridge.msdk.MBridgeConstans;
import ea.a0;
import ea.m2;
import h9.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k9.c0;
import l7.i0;
import mb.g;
import q9.a;
import tb.n;
import tc.b;
import uc.d;
import zc.i;
import zc.j;
import zc.k;
import zc.m;
import zc.t;
import zc.v;
import zc.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static i0 f24672n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f24674p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f24675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f24676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f24677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nf f24678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f24679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f24680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f24681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f24682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Task f24683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aj0 f24684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f24685k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f24671m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static b f24673o = new kd.d(10);

    public FirebaseMessaging(final g gVar, b bVar, b bVar2, final d dVar, b bVar3, qc.d dVar2) {
        gVar.a();
        final aj0 aj0Var = new aj0(gVar.f45928a, 3);
        gVar.a();
        c cVar = new c(gVar.f45928a);
        x xVar = new x();
        xVar.f23260a = gVar;
        xVar.f23261b = aj0Var;
        xVar.f23262c = cVar;
        xVar.f23263d = bVar;
        xVar.f23264e = bVar2;
        xVar.f23265f = dVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Init"));
        final int i11 = 0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-File-Io"));
        this.l = false;
        f24673o = bVar3;
        this.f24675a = gVar;
        e eVar = new e();
        eVar.f5780e = this;
        eVar.f5777b = dVar2;
        this.f24680f = eVar;
        gVar.a();
        final Context context = gVar.f45928a;
        this.f24676b = context;
        m2 m2Var = new m2();
        this.f24684j = aj0Var;
        this.f24677c = xVar;
        this.f24685k = dVar;
        nf nfVar = new nf(context, gVar, dVar, xVar, aj0Var);
        this.f24678d = nfVar;
        this.f24679e = new i(executorServiceNewSingleThreadExecutor);
        this.f24681g = scheduledThreadPoolExecutor;
        this.f24682h = threadPoolExecutor;
        gVar.a();
        Context context2 = gVar.f45928a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(m2Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (nfVar.q()) {
            k kVar = new k(this);
            uc.c cVar2 = (uc.c) dVar;
            synchronized (cVar2) {
                cVar2.f51995k.add(kVar);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: zc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f54844b;

            {
                this.f54844b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f54844b;
                        if (firebaseMessaging.f24680f.c()) {
                            firebaseMessaging.l();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f54844b;
                        Context context3 = firebaseMessaging2.f24676b;
                        go.c.v(context3);
                        go.k.V(context3, firebaseMessaging2.f24677c, firebaseMessaging2.k());
                        if (firebaseMessaging2.k()) {
                            firebaseMessaging2.h();
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a("Firebase-Messaging-Topics-Io"));
        int i12 = z.f54901i;
        Task taskCall = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: zc.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                x xVar2;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                aj0 aj0Var2 = aj0Var;
                mb.g gVar2 = gVar;
                FirebaseMessaging firebaseMessaging = this;
                uc.d dVar3 = dVar;
                synchronized (x.class) {
                    try {
                        WeakReference weakReference = x.f54891c;
                        xVar2 = weakReference != null ? (x) weakReference.get() : null;
                        if (xVar2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            x xVar3 = new x(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (xVar3) {
                                xVar3.f54892a = nf.c(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            x.f54891c = new WeakReference(xVar3);
                            xVar2 = xVar3;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new z(aj0Var2, xVar2, new r1.s(gVar2, firebaseMessaging, dVar3), context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f24683i = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new m(this, i11));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: zc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f54844b;

            {
                this.f54844b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f54844b;
                        if (firebaseMessaging.f24680f.c()) {
                            firebaseMessaging.l();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f54844b;
                        Context context3 = firebaseMessaging2.f24676b;
                        go.c.v(context3);
                        go.k.V(context3, firebaseMessaging2.f24677c, firebaseMessaging2.k());
                        if (firebaseMessaging2.k()) {
                            firebaseMessaging2.h();
                        }
                        break;
                }
            }
        });
    }

    public static void c(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f24674p == null) {
                    f24674p = new ScheduledThreadPoolExecutor(1, new a("TAG"));
                }
                f24674p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized FirebaseMessaging d() {
        return getInstance(g.e());
    }

    public static synchronized i0 e(Context context) {
        try {
            if (f24672n == null) {
                f24672n = new i0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24672n;
    }

    @NonNull
    @Keep
    @Deprecated
    public static synchronized FirebaseMessaging getInstance(@NonNull g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.c(FirebaseMessaging.class);
        c0.i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskContinueWithTask;
        v vVarG = g();
        if (!n(vVarG)) {
            return vVarG.f54884a;
        }
        String strC = aj0.c(this.f24675a);
        i iVar = this.f24679e;
        synchronized (iVar) {
            taskContinueWithTask = (Task) ((x.e) iVar.f54838b).get(strC);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                nf nfVar = this.f24678d;
                taskContinueWithTask = nfVar.t().continueWithTask(Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Task")), new tj.i0(nfVar, 17)).onSuccessTask(this.f24682h, new ac.a(this, strC, vVarG, 17)).continueWithTask((Executor) iVar.f54837a, new n(8, iVar, strC));
                ((x.e) iVar.f54838b).put(strC, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException("FCM Registration failed!", e10);
        }
    }

    public final Task b() {
        if (this.f24678d.q()) {
            return Tasks.forException(new IllegalStateException("API disabled. Please use {@link #unregister()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
        }
        if (g() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io")).execute(new j(this, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    public final String f() {
        g gVar = this.f24675a;
        gVar.a();
        return "[DEFAULT]".equals(gVar.f45929b) ? "" : gVar.g();
    }

    public final v g() {
        v vVarB;
        i0 i0VarE = e(this.f24676b);
        String strF = f();
        String strC = aj0.c(this.f24675a);
        synchronized (i0VarE) {
            vVarB = v.b(i0VarE.f45154a.getString(i0.a(strF, strC), null));
        }
        return vVarB;
    }

    public final void h() {
        Task taskForException;
        int i10;
        c cVar = (c) this.f24677c.f23262c;
        if (cVar.f42260c.f() >= 241100000) {
            h9.k kVarE = h9.k.e(cVar.f42259b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (kVarE) {
                i10 = kVarE.f42286a;
                kVarE.f42286a = i10 + 1;
            }
            taskForException = kVarE.g(new h9.j(i10, 5, bundle, 1)).continueWith(a7.g.f3425b, a0.f39200m);
        } else {
            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskForException.addOnSuccessListener(this.f24681g, new m(this, 1));
    }

    public final void i(t tVar) {
        Bundle bundle = tVar.f54874a;
        if (TextUtils.isEmpty(bundle.getString("google.to"))) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        Context context = this.f24676b;
        intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, PendingIntent.getBroadcast(context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(bundle);
        context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public final void j(boolean z10) {
        e eVar = this.f24680f;
        synchronized (eVar) {
            try {
                eVar.b();
                zc.n nVar = (zc.n) eVar.f5778c;
                if (nVar != null) {
                    ((tb.j) ((qc.d) eVar.f5777b)).c(nVar);
                    eVar.f5778c = null;
                }
                g gVar = ((FirebaseMessaging) eVar.f5780e).f24675a;
                gVar.a();
                SharedPreferences.Editor editorEdit = gVar.f45928a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    ((FirebaseMessaging) eVar.f5780e).l();
                }
                eVar.f5779d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        Context context = this.f24676b;
        go.c.v(context);
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
            }
            if (this.f24675a.c(qb.b.class) != null) {
                return true;
            }
            if (d0.c.e() && f24673o != null) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        if (n(g())) {
            synchronized (this) {
                if (!this.l) {
                    m(0L);
                }
            }
        }
    }

    public final synchronized void m(long j10) {
        c(new com.adjust.sdk.i0(this, Math.min(Math.max(30L, 2 * j10), f24671m)), j10);
        this.l = true;
    }

    public final boolean n(v vVar) {
        String str;
        if (vVar != null) {
            String str2 = vVar.f54884a;
            String strA = this.f24684j.a();
            if (System.currentTimeMillis() <= vVar.f54886c + v.f54883d && strA.equals(vVar.f54885b)) {
                if (!this.f24678d.q()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((uc.c) this.f24685k).c());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
