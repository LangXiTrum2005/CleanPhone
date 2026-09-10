package com.google.android.gms.common.api.internal;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.google.android.gms.internal.consent_sdk.n7;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.internal.measurement.dg;
import com.google.android.gms.internal.measurement.fb;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.r6;
import com.google.android.gms.internal.measurement.rg;
import com.google.android.gms.internal.measurement.sg;
import com.google.android.gms.internal.measurement.wf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import ea.a1;
import ea.d4;
import ea.e4;
import ea.f1;
import ea.g4;
import ea.h3;
import ea.h4;
import ea.i4;
import ea.k3;
import ea.l4;
import ea.m1;
import ea.n4;
import ea.p2;
import ea.s0;
import ea.s1;
import ea.x1;
import ea.z1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import ta.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11736d;

    public /* synthetic */ m0(int i10) {
        this.f11733a = i10;
    }

    private final void b() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = (AtomicReference) this.f11735c;
        synchronized (atomicReference2) {
            try {
                try {
                    h3 h3Var = (h3) this.f11736d;
                    m1 m1Var = (m1) h3Var.f3623a;
                    a1 a1Var = m1Var.f39586e;
                    m1.f(a1Var);
                    if (a1Var.N0().i(x1.ANALYTICS_STORAGE)) {
                        ea.g0 g0Var = h3Var.f39458d;
                        if (g0Var != null) {
                            atomicReference2.set(g0Var.b0((n4) this.f11734b));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                p2 p2Var = ((m1) h3Var.f3623a).f39593m;
                                m1.g(p2Var);
                                p2Var.f39689g.set(str);
                                a1 a1Var2 = m1Var.f39586e;
                                m1.f(a1Var2);
                                a1Var2.f39208g.h(str);
                            }
                            h3Var.T0();
                            atomicReference = (AtomicReference) this.f11735c;
                            atomicReference.notify();
                            return;
                        }
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39753f.b("Failed to get app instance id");
                    } else {
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39758k.b("Analytics storage consent denied; will not get app instance id");
                        p2 p2Var2 = ((m1) h3Var.f3623a).f39593m;
                        m1.g(p2Var2);
                        p2Var2.f39689g.set(null);
                        a1 a1Var3 = m1Var.f39586e;
                        m1.f(a1Var3);
                        a1Var3.f39208g.h(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (Throwable th2) {
                    ((AtomicReference) this.f11735c).notify();
                    throw th2;
                }
            } catch (RemoteException e10) {
                s0 s0Var3 = ((m1) ((h3) this.f11736d).f3623a).f39587f;
                m1.h(s0Var3);
                s0Var3.f39753f.c(e10, "Failed to get app instance id");
                atomicReference = (AtomicReference) this.f11735c;
            }
        }
    }

    private final void c() {
        l4 l4Var;
        a7 a7Var = (a7) this.f11734b;
        h3 h3Var = (h3) this.f11736d;
        String strB0 = null;
        try {
            try {
                m1 m1Var = (m1) h3Var.f3623a;
                a1 a1Var = m1Var.f39586e;
                s0 s0Var = m1Var.f39587f;
                m1.f(a1Var);
                if (a1Var.N0().i(x1.ANALYTICS_STORAGE)) {
                    ea.g0 g0Var = h3Var.f39458d;
                    if (g0Var != null) {
                        strB0 = g0Var.b0((n4) this.f11735c);
                        if (strB0 != null) {
                            p2 p2Var = m1Var.f39593m;
                            m1.g(p2Var);
                            p2Var.f39689g.set(strB0);
                            m1.f(a1Var);
                            a1Var.f39208g.h(strB0);
                        }
                        h3Var.T0();
                        l4Var = ((m1) h3Var.f3623a).f39590i;
                        m1.f(l4Var);
                        l4Var.s1(strB0, a7Var);
                    }
                    m1.h(s0Var);
                    s0Var.f39753f.b("Failed to get app instance id");
                } else {
                    m1.h(s0Var);
                    s0Var.f39758k.b("Analytics storage consent denied; will not get app instance id");
                    p2 p2Var2 = m1Var.f39593m;
                    m1.g(p2Var2);
                    p2Var2.f39689g.set(null);
                    m1.f(a1Var);
                    a1Var.f39208g.h(null);
                }
                l4Var = m1Var.f39590i;
            } catch (RemoteException e10) {
                s0 s0Var2 = ((m1) h3Var.f3623a).f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.c(e10, "Failed to get app instance id");
            }
            m1.f(l4Var);
            l4Var.s1(strB0, a7Var);
        } catch (Throwable th2) {
            l4 l4Var2 = ((m1) h3Var.f3623a).f39590i;
            m1.f(l4Var2);
            l4Var2.s1(null, a7Var);
            throw th2;
        }
    }

    private final void d() {
        gc.c cVar = (gc.c) this.f11736d;
        zb.a aVar = (zb.a) this.f11735c;
        cVar.b(aVar, (TaskCompletionSource) this.f11734b);
        ((AtomicInteger) cVar.f41837i.f52488b).set(0);
        double dMin = Math.min(3600000.0d, Math.pow(cVar.f41830b, cVar.a()) * (60000.0d / cVar.f41829a));
        String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + aVar.f54670b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        try {
            Thread.sleep((long) dMin);
        } catch (InterruptedException unused) {
        }
    }

    private final void e() {
        int i10;
        Task taskG;
        h9.a aVar = (h9.a) this.f11734b;
        Intent intent = aVar.f42247a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            taskG = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aVar.f42247a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aVar.f42247a;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            Context context = (Context) this.f11735c;
            bundle.putBoolean("supports_message_handled", true);
            h9.k kVarE = h9.k.e(context);
            synchronized (kVarE) {
                i10 = kVarE.f42286a;
                kVarE.f42286a = i10 + 1;
            }
            taskG = kVarE.g(new h9.j(i10, 2, bundle, 0));
        }
        taskG.addOnCompleteListener(a7.g.f3426c, new s4.i((CountDownLatch) this.f11736d));
    }

    private final void f() {
        m5.i iVarL = ((WorkDatabase) this.f11735c).n().l((String) this.f11734b);
        if (iVarL == null || !iVarL.b()) {
            return;
        }
        synchronized (((l5.b) this.f11736d).f45040c) {
            ((l5.b) this.f11736d).f45043f.put((String) this.f11734b, iVarL);
            ((l5.b) this.f11736d).f45044g.add(iVarL);
            l5.b bVar = (l5.b) this.f11736d;
            bVar.f45045h.b(bVar.f45044g);
        }
    }

    private final void g() {
        ((th.e) this.f11735c).a(new na.g(this, 9));
    }

    private final void h() {
        ((xh.c) this.f11735c).a(new qj.x(this, 15));
    }

    private final void i() {
        ((xh.c) this.f11735c).a(new rb.c(this, 13));
    }

    private final void j() {
        boolean z10 = false;
        ((Handler) this.f11734b).post(new n5.i(this, z10, ((AsyncTaskExecutor) this.f11736d).doInBackground((Object[]) this.f11735c), 6));
    }

    public void a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        ((wi.j) this.f11734b).b("Exception encountered", exc.getMessage() != null ? exc.getMessage() : "Unknown error", stringWriter.toString());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0392  */
    /* JADX WARN: Code duplicated, block: B:94:0x026c  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        Object obj;
        JSONObject jSONObject;
        ea.t tVar;
        Cursor cursor;
        Cursor cursorQuery;
        g4 g4VarJ1;
        Cursor cursor2;
        int i10 = 7;
        int i11 = 3;
        boolean zBooleanValue = true;
        switch (this.f11733a) {
            case 0:
                g gVar = (g) this.f11735c;
                b2.p pVar = (b2.p) this.f11736d;
                if (pVar.f5363b > 0) {
                    Bundle bundle = (Bundle) pVar.f5365d;
                    gVar.onCreate(bundle != null ? bundle.getBundle((String) this.f11734b) : null);
                }
                if (pVar.f5363b >= 2) {
                    gVar.onStart();
                }
                if (pVar.f5363b >= 3) {
                    gVar.onResume();
                }
                if (pVar.f5363b >= 4) {
                    gVar.onStop();
                }
                if (pVar.f5363b >= 5) {
                    gVar.onDestroy();
                    return;
                }
                return;
            case 1:
                String str = (String) this.f11734b;
                if (TextUtils.isEmpty(str)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str2 = (String) this.f11735c;
                String lowerCase = str.toLowerCase();
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                        return;
                    }
                    break;
                } else {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject2 = jSONObject;
                com.google.android.gms.internal.consent_sdk.i0[] i0VarArr = (com.google.android.gms.internal.consent_sdk.i0[]) this.f11736d;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject2.toString());
                for (com.google.android.gms.internal.consent_sdk.i0 i0Var : i0VarArr) {
                    FutureTask futureTask = new FutureTask(new com.google.android.gms.internal.consent_sdk.i(i0Var, lowerCase, jSONObject2));
                    i0Var.zza().execute(futureTask);
                    try {
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    } catch (InterruptedException e10) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e10);
                    } catch (ExecutionException e11) {
                        Log.d("UserMessagingPlatform", defpackage.e.o("Failed to run Action[", lowerCase, "]: "), e11.getCause());
                    }
                }
                return;
            case 2:
                n7 n7Var = (n7) this.f11735c;
                ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener = (ConsentInformation.OnConsentInfoUpdateSuccessListener) this.f11734b;
                com.google.android.gms.internal.consent_sdk.a aVar = (com.google.android.gms.internal.consent_sdk.a) this.f11736d;
                Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
                n7Var.f23118b.post(new com.google.android.gms.internal.consent_sdk.j(onConsentInfoUpdateSuccessListener, i11));
                if (aVar.f22933b != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                    n7Var.f23121e.b();
                    return;
                }
                return;
            case 3:
                com.google.android.gms.internal.consent_sdk.x xVar = (com.google.android.gms.internal.consent_sdk.x) this.f11735c;
                v0 v0Var = (v0) this.f11734b;
                wf wfVar = (wf) this.f11736d;
                try {
                    Object objB = ta.k0.b(v0Var);
                    v0 v0Var2 = (v0) xVar.f23265f;
                    v0Var2.l(objB);
                    wfVar.o(v0Var2);
                    return;
                } catch (Throwable unused2) {
                    wfVar.o(v0Var);
                    return;
                }
            case 4:
                if (((kotlin.jvm.internal.c0) this.f11735c).f44760a != null) {
                    throw new ClassCastException();
                }
                sg sgVar = (sg) this.f11734b;
                fb fbVar = (fb) this.f11736d;
                rg rgVarC = dg.c();
                sg sgVarB = dg.b(rgVarC, sgVar);
                try {
                    fbVar.run();
                    dg.b(rgVarC, sgVarB);
                    return;
                } catch (Throwable th2) {
                    try {
                        cg.a(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        dg.b(rgVarC, sgVarB);
                        throw th3;
                    }
                }
            case 5:
                try {
                    zBooleanValue = ((Boolean) ((o5.j) this.f11736d).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused3) {
                }
                ((e5.b) this.f11735c).e((String) this.f11734b, zBooleanValue);
                return;
            case 6:
                o5.j jVar = (o5.j) this.f11734b;
                e5.m mVar = (e5.m) this.f11736d;
                try {
                    ((ListenableFuture) this.f11735c).get();
                    d5.o.g().e(e5.m.f39118t, "Starting work for " + mVar.f39123e.f45884c, new Throwable[0]);
                    mVar.f39135r = mVar.f39124f.startWork();
                    jVar.j(mVar.f39135r);
                    return;
                } catch (Throwable th4) {
                    jVar.i(th4);
                    return;
                }
            case 7:
                String str3 = (String) this.f11734b;
                e5.m mVar2 = (e5.m) this.f11736d;
                try {
                    d5.n nVar = (d5.n) ((o5.j) this.f11735c).get();
                    if (nVar == null) {
                        d5.o.g().f(e5.m.f39118t, mVar2.f39123e.f45884c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                    } else {
                        d5.o.g().e(e5.m.f39118t, String.format("%s returned a %s result.", mVar2.f39123e.f45884c, nVar), new Throwable[0]);
                        mVar2.f39126h = nVar;
                    }
                    break;
                } catch (InterruptedException | ExecutionException e12) {
                    d5.o.g().f(e5.m.f39118t, str3 + " failed because it threw an exception/error", e12);
                } catch (CancellationException e13) {
                    d5.o.g().h(e5.m.f39118t, str3 + " was cancelled", e13);
                } finally {
                    mVar2.b();
                }
                return;
            case 8:
                n4 n4Var = (n4) this.f11734b;
                e4 e4Var = ((s1) this.f11736d).f39761a;
                e4Var.V();
                ea.e eVar = (ea.e) this.f11735c;
                if (eVar.f39354c.zza() == null) {
                    e4Var.a0(eVar, n4Var);
                    return;
                } else {
                    e4Var.Z(eVar, n4Var);
                    return;
                }
            case 9:
                ea.u uVar = (ea.u) this.f11735c;
                n4 n4Var2 = (n4) this.f11734b;
                s1 s1Var = (s1) this.f11736d;
                s1Var.getClass();
                e4 e4Var2 = s1Var.f39761a;
                if ("_cmp".equals(uVar.f39771a) && (tVar = uVar.f39772b) != null) {
                    Bundle bundle2 = tVar.f39765a;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            e4Var2.t().l.c(uVar.toString(), "Event has been filtered ");
                            uVar = new ea.u("_cmpx", tVar, uVar.f39773c, uVar.f39774d, uVar.f39775e);
                        }
                    }
                }
                String str4 = uVar.f39771a;
                f1 f1Var = e4Var2.f39371a;
                h4 h4Var = e4Var2.f39377g;
                e4.T(f1Var);
                String str5 = n4Var2.f39628a;
                r6 r6Var = TextUtils.isEmpty(str5) ? null : (r6) f1Var.f39404k.g(str5);
                if (r6Var == null) {
                    e4Var2.t().f39760n.c(n4Var2.f39628a, "EES not loaded for");
                    e4Var2.V();
                    e4Var2.e(uVar, n4Var2);
                    return;
                }
                try {
                    v9.e eVar2 = r6Var.f23921c;
                    e4.T(h4Var);
                    HashMap mapU1 = h4.u1(uVar.f39772b.n(), true);
                    String strG = z1.g(str4, z1.f39941f, z1.f39936a);
                    if (strG == null) {
                        strG = str4;
                    }
                    if (r6Var.a(new com.google.android.gms.internal.measurement.b(strG, uVar.f39774d, mapU1))) {
                        if (((com.google.android.gms.internal.measurement.b) eVar2.f52504c).equals((com.google.android.gms.internal.measurement.b) eVar2.f52503b)) {
                            e4Var2.V();
                            e4Var2.e(uVar, n4Var2);
                        } else {
                            e4Var2.t().f39760n.c(str4, "EES edited event");
                            e4.T(h4Var);
                            ea.u uVarK0 = h4.K0((com.google.android.gms.internal.measurement.b) eVar2.f52504c);
                            e4Var2.V();
                            e4Var2.e(uVarK0, n4Var2);
                        }
                        if (((ArrayList) eVar2.f52505d).isEmpty()) {
                            return;
                        }
                        for (com.google.android.gms.internal.measurement.b bVar : (ArrayList) eVar2.f52505d) {
                            e4Var2.t().f39760n.c(bVar.f23305a, "EES logging created event");
                            e4.T(h4Var);
                            ea.u uVarK1 = h4.K0(bVar);
                            e4Var2.V();
                            e4Var2.e(uVarK1, n4Var2);
                        }
                        return;
                    }
                } catch (g7 unused4) {
                    e4Var2.t().f39753f.d("EES error. appId, eventName", n4Var2.f39629b, str4);
                }
                e4Var2.t().f39760n.c(str4, "EES was not applied to event");
                e4Var2.V();
                e4Var2.e(uVar, n4Var2);
                return;
            case 10:
                s1 s1Var2 = (s1) this.f11736d;
                s1Var2.f39761a.V();
                s1Var2.f39761a.c((ea.u) this.f11735c, (String) this.f11734b);
                return;
            case 11:
                n4 n4Var3 = (n4) this.f11734b;
                e4 e4Var3 = ((s1) this.f11736d).f39761a;
                e4Var3.V();
                i4 i4Var = (i4) this.f11735c;
                if (i4Var.zza() == null) {
                    e4Var3.X(i4Var.f39485b, n4Var3);
                    return;
                } else {
                    e4Var3.W(i4Var, n4Var3);
                    return;
                }
            case 12:
                s1 s1Var3 = (s1) this.f11735c;
                n4 n4Var4 = (n4) this.f11734b;
                ea.d dVar = (ea.d) this.f11736d;
                e4 e4Var4 = s1Var3.f39761a;
                e4Var4.V();
                String str6 = n4Var4.f39628a;
                k9.c0.h(str6);
                HashMap map = e4Var4.E;
                e4Var4.P().G0();
                e4Var4.m0();
                ea.m mVar3 = e4Var4.f39373c;
                e4.T(mVar3);
                long j10 = dVar.f39284a;
                long j11 = dVar.f39286c;
                mVar3.G0();
                mVar3.H0();
                try {
                    cursorQuery = mVar3.x1().query("upload_queue", new String[]{"rowId", MBridgeConstans.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string2 = cursorQuery.getString(1);
                            k9.c0.h(string2);
                            cursor2 = cursorQuery;
                            try {
                                g4VarJ1 = mVar3.j1(string2, j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                cursor2.close();
                            } catch (SQLiteException e14) {
                                e = e14;
                                cursorQuery = cursor2;
                                try {
                                    s0 s0Var = ((m1) mVar3.f3623a).f39587f;
                                    m1.h(s0Var);
                                    s0Var.f39753f.d("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    g4VarJ1 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                cursor = cursor2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } else {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            g4VarJ1 = null;
                        }
                    } catch (SQLiteException e15) {
                        e = e15;
                        cursor2 = cursorQuery;
                    } catch (Throwable th7) {
                        th = th7;
                        cursor2 = cursorQuery;
                    }
                } catch (SQLiteException e16) {
                    e = e16;
                    cursorQuery = null;
                } catch (Throwable th8) {
                    th = th8;
                    cursor = null;
                }
                if (g4VarJ1 == null) {
                    e4Var4.t().f39756i.d("[sgtm] Queued batch doesn't exist. appId, rowId", str6, Long.valueOf(j10));
                    return;
                }
                String str7 = g4VarJ1.f39432c;
                int i12 = dVar.f39285b;
                if (i12 != 1) {
                    if (i12 == 3) {
                        d4 d4Var = (d4) map.get(str7);
                        if (d4Var == null) {
                            d4Var = new d4(e4Var4);
                            map.put(str7, d4Var);
                        } else {
                            d4Var.f39350b++;
                            d4Var.f39351c = d4Var.a();
                        }
                        ((p9.b) e4Var4.i0()).getClass();
                        e4Var4.t().f39760n.e("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str6, str7, Long.valueOf((d4Var.f39351c - System.currentTimeMillis()) / 1000));
                    }
                    ea.m mVar4 = e4Var4.f39373c;
                    e4.T(mVar4);
                    Long lValueOf = Long.valueOf(dVar.f39284a);
                    mVar4.S0(lValueOf);
                    e4Var4.t().f39760n.d("[sgtm] increased batch retry count after failed client upload. appId, rowId", str6, lValueOf);
                    return;
                }
                if (map.containsKey(str7)) {
                    map.remove(str7);
                }
                ea.m mVar5 = e4Var4.f39373c;
                e4.T(mVar5);
                Long lValueOf2 = Long.valueOf(j10);
                mVar5.N0(lValueOf2);
                e4Var4.t().f39760n.d("[sgtm] queued batch deleted after successful client upload. appId, rowId", str6, lValueOf2);
                if (j11 > 0) {
                    ea.m mVar6 = e4Var4.f39373c;
                    e4.T(mVar6);
                    m1 m1Var = (m1) mVar6.f3623a;
                    mVar6.G0();
                    mVar6.H0();
                    Long lValueOf3 = Long.valueOf(j11);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    p9.b bVar2 = m1Var.f39592k;
                    s0 s0Var2 = m1Var.f39587f;
                    bVar2.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (mVar6.x1().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str6, String.valueOf(4)}) != 1) {
                            m1.h(s0Var2);
                            s0Var2.f39756i.d("Google Signal pending batch not updated. appId, rowId", str6, lValueOf3);
                            break;
                        }
                        e4Var4.t().f39760n.d("[sgtm] queued Google Signal batch updated. appId, signalRowId", str6, Long.valueOf(j11));
                        e4Var4.p(str6);
                        return;
                    } catch (SQLiteException e17) {
                        m1.h(s0Var2);
                        s0Var2.f39753f.e("Failed to update google Signal pending batch. appid, rowId", str6, Long.valueOf(j11), e17);
                        throw e17;
                    }
                }
                return;
            case 13:
                b();
                return;
            case 14:
                c();
                return;
            case 15:
                h3 h3Var = (h3) this.f11735c;
                n4 n4Var5 = (n4) this.f11734b;
                ea.d dVar2 = (ea.d) this.f11736d;
                m1 m1Var2 = (m1) h3Var.f3623a;
                ea.g0 g0Var = h3Var.f39458d;
                if (g0Var == null) {
                    s0 s0Var3 = m1Var2.f39587f;
                    m1.h(s0Var3);
                    s0Var3.f39753f.b("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    g0Var.W0(n4Var5, dVar2);
                    h3Var.T0();
                    return;
                } catch (RemoteException e18) {
                    s0 s0Var4 = m1Var2.f39587f;
                    m1.h(s0Var4);
                    s0Var4.f39753f.d("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(dVar2.f39284a), e18);
                    return;
                }
            case 16:
                n5.f fVar = (n5.f) this.f11735c;
                s0 s0Var5 = (s0) this.f11734b;
                JobParameters jobParameters = (JobParameters) this.f11736d;
                s0Var5.f39760n.b("AppMeasurementJobService processed last upload request.");
                ((k3) ((Service) fVar.f46523b)).c(jobParameters);
                return;
            case 17:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f11736d;
                Context context = (Context) this.f11734b;
                Intent intent = (Intent) this.f11735c;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    d5.o.g().e(ConstraintProxyUpdateReceiver.f5029a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    n5.g.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    n5.g.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    n5.g.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    n5.g.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 18:
                d();
                return;
            case 19:
                e();
                return;
            case 20:
                try {
                    objCall = ((j0.d) this.f11735c).call();
                    break;
                } catch (Exception unused5) {
                    objCall = null;
                }
                ((Handler) this.f11736d).post(new ta.i0(27, (j0.e) this.f11734b, objCall));
                return;
            case 21:
                f();
                return;
            case 22:
                ((e5.l) this.f11735c).f39114f.g((String) this.f11734b, (v9.e) this.f11736d);
                return;
            case 23:
                ((th.e) this.f11735c).a(new oa.k0(this, i10));
                return;
            case 24:
                g();
                return;
            case 25:
                h();
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                i();
                return;
            case 27:
                j();
                return;
            default:
                try {
                    xi.m mVar7 = (xi.m) this.f11735c;
                    if (mVar7 != null && (obj = mVar7.f53823b) != null) {
                        if (!(obj instanceof Map)) {
                            a(new IllegalArgumentException("Method call arguments must be a Map"));
                            return;
                        }
                        Object obj2 = ((Map) obj).get("options");
                        ye.e eVar3 = new ye.e(obj2 instanceof Map ? (Map) obj2 : new HashMap());
                        ye.d dVarA = ye.f.a((ye.f) this.f11736d, eVar3);
                        dVarA.j(eVar3, new r1.s(this, dVarA, eVar3, false, 14));
                        return;
                    }
                    a(new IllegalArgumentException("Method call arguments are null"));
                    return;
                } catch (Exception e19) {
                    a(e19);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f11733a) {
            case 4:
                fb fbVar = (fb) this.f11736d;
                StringBuilder sb2 = new StringBuilder(fbVar.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(fbVar);
                sb2.append(X3.j.f27836e);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, int i10) {
        this.f11733a = i10;
        this.f11735c = obj2;
        this.f11734b = obj3;
        this.f11736d = obj;
    }

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f11733a = i10;
        this.f11735c = obj;
        this.f11734b = obj2;
        this.f11736d = obj3;
    }

    public /* synthetic */ m0(String str, String str2, com.google.android.gms.internal.consent_sdk.i0[] i0VarArr) {
        this.f11733a = 1;
        this.f11734b = str;
        this.f11735c = str2;
        this.f11736d = i0VarArr;
    }

    public m0(h3 h3Var, AtomicReference atomicReference, n4 n4Var) {
        this.f11733a = 13;
        this.f11735c = atomicReference;
        this.f11734b = n4Var;
        Objects.requireNonNull(h3Var);
        this.f11736d = h3Var;
    }
}
