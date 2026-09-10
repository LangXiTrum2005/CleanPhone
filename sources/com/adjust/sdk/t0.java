package com.adjust.sdk;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.consent_sdk.m7;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.mbridge.msdk.MBridgeConstans;
import ea.a3;
import ea.b3;
import ea.e4;
import ea.g4;
import ea.h3;
import ea.h4;
import ea.l4;
import ea.m1;
import ea.n4;
import ea.p2;
import ea.s1;
import ea.w3;
import ea.x3;
import ea.y3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7040e;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f7036a = i10;
        this.f7040e = obj;
        this.f7037b = obj2;
        this.f7038c = obj3;
        this.f7039d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jElapsedRealtime;
        switch (this.f7036a) {
            case 0:
                InstallReferrer installReferrer = (InstallReferrer) this.f7040e;
                try {
                    installReferrer.invokeI(this.f7037b, (Method) this.f7038c, (Object[]) this.f7039d);
                    return;
                } catch (Throwable th2) {
                    installReferrer.referrerCallback.onFail(Util.formatString("invoke error (%s) thrown by (%s)", th2.getMessage(), th2.getClass().getCanonicalName()));
                    return;
                }
            case 1:
                s1 s1Var = (s1) this.f7037b;
                String str = (String) this.f7038c;
                x3 x3Var = (x3) this.f7039d;
                ea.k0 k0Var = (ea.k0) this.f7040e;
                e4 e4Var = s1Var.f39761a;
                e4Var.V();
                e4Var.P().G0();
                e4Var.m0();
                ea.m mVar = e4Var.f39373c;
                e4.T(mVar);
                List<g4> listL0 = mVar.L0(str, x3Var, ((Integer) ea.d0.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (g4 g4Var : listL0) {
                    String str2 = g4Var.f39432c;
                    long j10 = g4Var.f39437h;
                    long j11 = g4Var.f39430a;
                    if (e4Var.n(str, str2)) {
                        int i10 = g4Var.f39438i;
                        if (i10 > 0) {
                            if (i10 <= ((Integer) ea.d0.f39342z.a(null)).intValue()) {
                                long jMin = Math.min(((Long) ea.d0.f39338x.a(null)).longValue() * (1 << (i10 - 1)), ((Long) ea.d0.f39340y.a(null)).longValue());
                                ((p9.b) e4Var.i0()).getClass();
                                if (System.currentTimeMillis() >= jMin + j10) {
                                }
                            }
                            e4Var.t().f39760n.e("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j11), Long.valueOf(j10));
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : g4Var.f39433d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j12 = g4Var.f39430a;
                        ba baVar = g4Var.f39431b;
                        w3 w3Var = new w3(j12, baVar.a(), g4Var.f39432c, bundle, g4Var.f39434e.f39806a, g4Var.f39436g, "");
                        try {
                            aa aaVar = (aa) h4.r1(ba.B(), w3Var.f39870b);
                            for (int i11 = 0; i11 < ((ba) aaVar.f23489b).v(); i11++) {
                                ca caVar = (ca) ((ba) aaVar.f23489b).w(i11).l();
                                ((p9.b) e4Var.i0()).getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                caVar.b();
                                ((da) caVar.f23489b).k0(jCurrentTimeMillis);
                                aaVar.b();
                                ((ba) aaVar.f23489b).D(i11, (da) caVar.f());
                            }
                            w3Var.f39870b = ((ba) aaVar.f()).a();
                            if (Log.isLoggable(e4Var.t().Q0(), 2)) {
                                h4 h4Var = e4Var.f39377g;
                                e4.T(h4Var);
                                w3Var.f39875g = h4Var.h1((ba) aaVar.f());
                            }
                            arrayList.add(w3Var);
                        } catch (u1 unused) {
                            e4Var.t().f39756i.c(str, "Failed to parse queued batch. appId");
                        }
                    } else {
                        e4Var.t().f39760n.e("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j11), g4Var.f39432c);
                    }
                }
                try {
                    k0Var.L(new y3(arrayList));
                    e4Var.t().f39760n.d("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(arrayList.size()));
                    return;
                } catch (RemoteException e10) {
                    e4Var.t().f39753f.d("[sgtm] Failed to return upload batches for app", str, e10);
                    return;
                }
            case 2:
                h3 h3VarK = ((AppMeasurementDynamiteService) this.f7040e).f24515a.k();
                a7 a7Var = (a7) this.f7037b;
                ea.u uVar = (ea.u) this.f7038c;
                String str3 = (String) this.f7039d;
                h3VarK.G0();
                h3VarK.H0();
                m1 m1Var = (m1) h3VarK.f3623a;
                l4 l4Var = m1Var.f39590i;
                m1.f(l4Var);
                if (i9.e.f42929b.c(((m1) l4Var.f3623a).f39582a, 12451000) == 0) {
                    h3VarK.U0(new t0(h3VarK, uVar, str3, a7Var, 6));
                    return;
                }
                ea.s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39756i.b("Not bundling data. Service unavailable or out of date");
                l4 l4Var2 = m1Var.f39590i;
                m1.f(l4Var2);
                l4Var2.v1(a7Var, new byte[0]);
                return;
            case 3:
                s1 s1Var2 = (s1) this.f7037b;
                Bundle bundle2 = (Bundle) this.f7038c;
                String str4 = (String) this.f7039d;
                n4 n4Var = (n4) this.f7040e;
                e4 e4Var2 = s1Var2.f39761a;
                if (bundle2.isEmpty()) {
                    ea.m mVar2 = e4Var2.f39373c;
                    e4.T(mVar2);
                    mVar2.G0();
                    mVar2.H0();
                    try {
                        mVar2.x1().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e11) {
                        ea.s0 s0Var2 = ((m1) mVar2.f3623a).f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39753f.c(e11, "Error clearing default event params");
                        return;
                    }
                }
                ea.m mVar3 = e4Var2.f39373c;
                e4.T(mVar3);
                m1 m1Var2 = (m1) mVar3.f3623a;
                mVar3.G0();
                mVar3.H0();
                ea.q qVar = new ea.q((m1) mVar3.f3623a, "", str4, "dep", 0L, 0L, 0L, bundle2);
                h4 h4Var2 = mVar3.f39807b.f39377g;
                e4.T(h4Var2);
                byte[] bArrA = h4Var2.g1(qVar).a();
                ea.s0 s0Var3 = m1Var2.f39587f;
                m1.h(s0Var3);
                s0Var3.f39760n.d("Saving default event parameters, appId, data size", str4, Integer.valueOf(bArrA.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put(MBridgeConstans.APP_ID, str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (mVar3.x1().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        m1.h(s0Var3);
                        s0Var3.f39753f.c(ea.s0.O0(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e12) {
                    m1.h(s0Var3);
                    s0Var3.f39753f.d("Error storing default event parameters. appId", ea.s0.O0(str4), e12);
                }
                ea.m mVar4 = e4Var2.f39373c;
                e4.T(mVar4);
                long j13 = n4Var.D;
                try {
                    if (mVar4.d1("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j13)}, 0L) <= 0 && mVar4.d1("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j13)}, 0L) > 0) {
                        ea.m mVar5 = e4Var2.f39373c;
                        e4.T(mVar5);
                        mVar5.Z0(str4, Long.valueOf(j13), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e13) {
                    ea.s0 s0Var4 = ((m1) mVar4.f3623a).f39587f;
                    m1.h(s0Var4);
                    s0Var4.f39753f.c(e13, "Error checking backfill conditions");
                    return;
                }
            case 4:
                String str5 = (String) this.f7038c;
                String str6 = (String) this.f7039d;
                h3 h3VarK2 = ((m1) ((p2) this.f7040e).f3623a).k();
                AtomicReference atomicReference = (AtomicReference) this.f7037b;
                h3VarK2.G0();
                h3VarK2.H0();
                h3VarK2.U0(new m7(h3VarK2, atomicReference, str5, str6, h3VarK2.W0(false), 2, false));
                return;
            case 5:
                h3 h3VarK3 = ((AppMeasurementDynamiteService) this.f7040e).f24515a.k();
                a7 a7Var2 = (a7) this.f7037b;
                String str7 = (String) this.f7038c;
                String str8 = (String) this.f7039d;
                h3VarK3.G0();
                h3VarK3.H0();
                h3VarK3.U0(new m7(h3VarK3, str7, str8, h3VarK3.W0(false), a7Var2, 3, false));
                return;
            case 6:
                a7 a7Var3 = (a7) this.f7039d;
                h3 h3Var = (h3) this.f7040e;
                byte[] bArrA0 = null;
                try {
                    try {
                        ea.g0 g0Var = h3Var.f39458d;
                        if (g0Var != null) {
                            bArrA0 = g0Var.A0((ea.u) this.f7037b, (String) this.f7038c);
                            h3Var.T0();
                            l4 l4Var3 = ((m1) h3Var.f3623a).f39590i;
                            m1.f(l4Var3);
                            l4Var3.v1(a7Var3, bArrA0);
                            return;
                        }
                        m1 m1Var3 = (m1) h3Var.f3623a;
                        ea.s0 s0Var5 = m1Var3.f39587f;
                        m1.h(s0Var5);
                        s0Var5.f39753f.b("Discarding data. Failed to send event to service to bundle");
                        l4 l4Var4 = m1Var3.f39590i;
                        m1.f(l4Var4);
                        l4Var4.v1(a7Var3, null);
                        return;
                    } catch (RemoteException e14) {
                        ea.s0 s0Var6 = ((m1) h3Var.f3623a).f39587f;
                        m1.h(s0Var6);
                        s0Var6.f39753f.c(e14, "Failed to send event to the service to bundle");
                    }
                } catch (Throwable th3) {
                    l4 l4Var5 = ((m1) h3Var.f3623a).f39590i;
                    m1.f(l4Var5);
                    l4Var5.v1(a7Var3, null);
                    throw th3;
                }
                break;
            case 7:
                h3 h3Var2 = (h3) this.f7037b;
                AtomicReference atomicReference2 = (AtomicReference) this.f7038c;
                n4 n4Var2 = (n4) this.f7039d;
                Bundle bundle3 = (Bundle) this.f7040e;
                synchronized (atomicReference2) {
                    try {
                        ea.g0 g0Var2 = h3Var2.f39458d;
                        if (g0Var2 != null) {
                            g0Var2.g0(n4Var2, bundle3, new a3(h3Var2, atomicReference2));
                            h3Var2.T0();
                            return;
                        } else {
                            ea.s0 s0Var7 = ((m1) h3Var2.f3623a).f39587f;
                            m1.h(s0Var7);
                            s0Var7.f39753f.b("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e15) {
                        ea.s0 s0Var8 = ((m1) h3Var2.f3623a).f39587f;
                        m1.h(s0Var8);
                        s0Var8.f39753f.c(e15, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 8:
                h3 h3Var3 = (h3) this.f7037b;
                AtomicReference atomicReference3 = (AtomicReference) this.f7038c;
                n4 n4Var3 = (n4) this.f7039d;
                x3 x3Var2 = (x3) this.f7040e;
                synchronized (atomicReference3) {
                    try {
                        ea.g0 g0Var3 = h3Var3.f39458d;
                        if (g0Var3 != null) {
                            g0Var3.I(n4Var3, x3Var2, new b3(h3Var3, atomicReference3));
                            h3Var3.T0();
                            return;
                        } else {
                            ea.s0 s0Var9 = ((m1) h3Var3.f3623a).f39587f;
                            m1.h(s0Var9);
                            s0Var9.f39753f.b("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e16) {
                        ea.s0 s0Var10 = ((m1) h3Var3.f3623a).f39587f;
                        m1.h(s0Var10);
                        s0Var10.f39753f.c(e16, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            case 9:
                e4 e4Var3 = (e4) ((od.c) this.f7040e).f47386b;
                l4 l4VarL0 = e4Var3.l0();
                ((p9.b) e4Var3.i0()).getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (e4Var3.e0().R0(null, ea.d0.f39301e1)) {
                    ((p9.b) e4Var3.i0()).getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                long j14 = jElapsedRealtime;
                Bundle bundle4 = (Bundle) this.f7039d;
                String str9 = (String) this.f7038c;
                String str10 = (String) this.f7037b;
                ea.u uVarM1 = l4VarL0.m1(str9, bundle4, "auto", jCurrentTimeMillis2, j14, false);
                k9.c0.h(uVarM1);
                e4Var3.c(uVarM1, str10);
                return;
            case 10:
                o5.j jVar = (o5.j) this.f7039d;
                UUID uuid = (UUID) this.f7037b;
                String string = uuid.toString();
                d5.o oVarG = d5.o.g();
                String str11 = n5.p.f46552c;
                d5.f fVar = (d5.f) this.f7038c;
                oVarG.e(str11, "Updating progress for " + uuid + " (" + fVar + ")", new Throwable[0]);
                n5.p pVar = (n5.p) this.f7040e;
                WorkDatabase workDatabase = pVar.f46553a;
                WorkDatabase workDatabase2 = pVar.f46553a;
                workDatabase.c();
                try {
                    m5.i iVarL = workDatabase2.n().l(string);
                    if (iVarL == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (iVarL.f45883b == 2) {
                        m5.g gVar = new m5.g(string, fVar);
                        zc.u uVarM = workDatabase2.m();
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) uVarM.f54879b;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                        try {
                            ((m5.b) uVarM.f54880c).e(gVar);
                            workDatabase_Impl.h();
                            workDatabase_Impl.f();
                        } catch (Throwable th4) {
                            workDatabase_Impl.f();
                            throw th4;
                        }
                    } else {
                        d5.o.g().k(str11, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                    }
                    jVar.h(null);
                    workDatabase2.h();
                } catch (Throwable th5) {
                    try {
                        d5.o.g().f(n5.p.f46552c, "Error updating Worker progress", th5);
                        jVar.i(th5);
                    } finally {
                        workDatabase2.f();
                    }
                    break;
                }
                return;
            default:
                o.g gVar2 = (o.g) ((am.e) this.f7040e).f3698b;
                o.o oVar = (o.o) this.f7038c;
                o.f fVar2 = (o.f) this.f7037b;
                if (fVar2 != null) {
                    gVar2.f46943z = true;
                    fVar2.f46918b.c(false);
                    gVar2.f46943z = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((o.m) this.f7039d).q(oVar, null, 4);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, int i10, boolean z10) {
        this.f7036a = i10;
        this.f7037b = obj;
        this.f7038c = obj2;
        this.f7039d = obj3;
        this.f7040e = obj4;
    }

    public t0(p2 p2Var, AtomicReference atomicReference, String str, String str2) {
        this.f7036a = 4;
        this.f7037b = atomicReference;
        this.f7038c = str;
        this.f7039d = str2;
        Objects.requireNonNull(p2Var);
        this.f7040e = p2Var;
    }
}
