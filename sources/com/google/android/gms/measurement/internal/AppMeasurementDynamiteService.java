package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adjust.sdk.f0;
import com.adjust.sdk.t0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.x6;
import com.ironsource.Xa;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import ea.a2;
import ea.d0;
import ea.g2;
import ea.h2;
import ea.j1;
import ea.j2;
import ea.k1;
import ea.k2;
import ea.l0;
import ea.l4;
import ea.m1;
import ea.m2;
import ea.m4;
import ea.p2;
import ea.s0;
import ea.s2;
import ea.t;
import ea.u;
import ea.u0;
import ea.u2;
import ea.w2;
import ea.w3;
import ea.y;
import ea.y3;
import ea.z2;
import g9.k;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k9.c0;
import s9.a;
import s9.b;
import ta.i0;
import x.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m1 f24515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f24516b;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f24515a = null;
        this.f24516b = new e(0);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void beginAdUnitExposure(@NonNull String str, long j10) throws RemoteException {
        r();
        y yVar = this.f24515a.f39594n;
        m1.e(yVar);
        yVar.H0(j10, str);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.U0(str, bundle, str2);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.H0();
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new i0(p2Var, false, null, 10));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void endAdUnitExposure(@NonNull String str, long j10) throws RemoteException {
        r();
        y yVar = this.f24515a.f39594n;
        m1.e(yVar);
        yVar.I0(j10, str);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void generateEventId(a7 a7Var) throws RemoteException {
        r();
        l4 l4Var = this.f24515a.f39590i;
        m1.f(l4Var);
        long jD1 = l4Var.D1();
        r();
        l4 l4Var2 = this.f24515a.f39590i;
        m1.f(l4Var2);
        l4Var2.t1(a7Var, jD1);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getAppInstanceId(a7 a7Var) throws RemoteException {
        r();
        j1 j1Var = this.f24515a.f39588g;
        m1.h(j1Var);
        j1Var.P0(new k1(this, a7Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getCachedAppInstanceId(a7 a7Var) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m0((String) p2Var.f39689g.get(), a7Var);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getConditionalUserProperties(String str, String str2, a7 a7Var) throws RemoteException {
        r();
        j1 j1Var = this.f24515a.f39588g;
        m1.h(j1Var);
        j1Var.P0(new t0(this, a7Var, str, str2, 5));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getCurrentScreenClass(a7 a7Var) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        z2 z2Var = ((m1) p2Var.f3623a).l;
        m1.g(z2Var);
        w2 w2Var = z2Var.f39949c;
        m0(w2Var != null ? w2Var.f39863b : null, a7Var);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getCurrentScreenName(a7 a7Var) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        z2 z2Var = ((m1) p2Var.f3623a).l;
        m1.g(z2Var);
        w2 w2Var = z2Var.f39949c;
        m0(w2Var != null ? w2Var.f39862a : null, a7Var);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getGmpAppId(a7 a7Var) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m0(p2Var.V0(), a7Var);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getMaxUserProperties(String str, a7 a7Var) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        c0.e(str);
        ((m1) p2Var.f3623a).getClass();
        r();
        l4 l4Var = this.f24515a.f39590i;
        m1.f(l4Var);
        l4Var.u1(a7Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getSessionId(a7 a7Var) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new i0(p2Var, a7Var));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getTestFlag(a7 a7Var, int i10) throws RemoteException {
        r();
        if (i10 == 0) {
            l4 l4Var = this.f24515a.f39590i;
            m1.f(l4Var);
            p2 p2Var = this.f24515a.f39593m;
            m1.g(p2Var);
            AtomicReference atomicReference = new AtomicReference();
            j1 j1Var = ((m1) p2Var.f3623a).f39588g;
            m1.h(j1Var);
            l4Var.s1((String) j1Var.Q0(atomicReference, 15000L, "String test flag value", new j2(p2Var, atomicReference, 1)), a7Var);
            return;
        }
        if (i10 == 1) {
            l4 l4Var2 = this.f24515a.f39590i;
            m1.f(l4Var2);
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            j1 j1Var2 = ((m1) p2Var2.f3623a).f39588g;
            m1.h(j1Var2);
            l4Var2.t1(a7Var, ((Long) j1Var2.Q0(atomicReference2, 15000L, "long test flag value", new j2(p2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i10 == 2) {
            l4 l4Var3 = this.f24515a.f39590i;
            m1.f(l4Var3);
            p2 p2Var3 = this.f24515a.f39593m;
            m1.g(p2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            j1 j1Var3 = ((m1) p2Var3.f3623a).f39588g;
            m1.h(j1Var3);
            double dDoubleValue = ((Double) j1Var3.Q0(atomicReference3, 15000L, "double test flag value", new j2(p2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                a7Var.e1(bundle);
                return;
            } catch (RemoteException e10) {
                s0 s0Var = ((m1) l4Var3.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39756i.c(e10, "Error returning double value to wrapper");
                return;
            }
        }
        if (i10 == 3) {
            l4 l4Var4 = this.f24515a.f39590i;
            m1.f(l4Var4);
            p2 p2Var4 = this.f24515a.f39593m;
            m1.g(p2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            j1 j1Var4 = ((m1) p2Var4.f3623a).f39588g;
            m1.h(j1Var4);
            l4Var4.u1(a7Var, ((Integer) j1Var4.Q0(atomicReference4, 15000L, "int test flag value", new j2(p2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        l4 l4Var5 = this.f24515a.f39590i;
        m1.f(l4Var5);
        p2 p2Var5 = this.f24515a.f39593m;
        m1.g(p2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        j1 j1Var5 = ((m1) p2Var5.f3623a).f39588g;
        m1.h(j1Var5);
        l4Var5.w1(a7Var, ((Boolean) j1Var5.Q0(atomicReference5, 15000L, "boolean test flag value", new j2(p2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void getUserProperties(String str, String str2, boolean z10, a7 a7Var) throws RemoteException {
        r();
        j1 j1Var = this.f24515a.f39588g;
        m1.h(j1Var);
        j1Var.P0(new g2(this, a7Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void initForTests(@NonNull Map map) throws RemoteException {
        r();
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void initialize(a aVar, i7 i7Var, long j10) throws RemoteException {
        m1 m1Var = this.f24515a;
        if (m1Var == null) {
            Context context = (Context) b.y1(aVar);
            c0.h(context);
            this.f24515a = m1.n(context, i7Var, Long.valueOf(j10), null);
        } else {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void initializeWithElapsedTime(a aVar, i7 i7Var, long j10, long j11) {
        m1 m1Var = this.f24515a;
        if (m1Var == null) {
            Context context = (Context) b.y1(aVar);
            c0.h(context);
            this.f24515a = m1.n(context, i7Var, Long.valueOf(j10), Long.valueOf(j11));
        } else {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void isDataCollectionEnabled(a7 a7Var) throws RemoteException {
        r();
        j1 j1Var = this.f24515a.f39588g;
        m1.h(j1Var);
        j1Var.P0(new k1(this, a7Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.L0(str, str2, bundle, z10, z11, j10, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void logEventAndBundle(String str, String str2, Bundle bundle, a7 a7Var, long j10) throws RemoteException {
        r();
        c0.e(str2);
        String str3 = true != this.f24515a.f39585d.R0(null, d0.f39304f1) ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        u uVar = new u(str2, new t(bundle), str3, j10, 0L);
        j1 j1Var = this.f24515a.f39588g;
        m1.h(j1Var);
        j1Var.P0(new t0(this, a7Var, uVar, str, 2));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void logEventWithElapsedTime(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10, long j11) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.L0(str, str2, bundle, z10, z11, j10, j11);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void logHealthData(int i10, @NonNull String str, @NonNull a aVar, @NonNull a aVar2, @NonNull a aVar3) throws RemoteException {
        r();
        Object objY1 = aVar == null ? null : b.y1(aVar);
        Object objY2 = aVar2 == null ? null : b.y1(aVar2);
        Object objY3 = aVar3 != null ? b.y1(aVar3) : null;
        s0 s0Var = this.f24515a.f39587f;
        m1.h(s0Var);
        s0Var.P0(i10, true, false, str, objY1, objY2, objY3);
    }

    public final void m0(String str, a7 a7Var) {
        r();
        l4 l4Var = this.f24515a.f39590i;
        m1.f(l4Var);
        l4Var.s1(str, a7Var);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityCreated(@NonNull a aVar, @NonNull Bundle bundle, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        onActivityCreatedByScionActivityInfo(k7.b(activity), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityCreatedByScionActivityInfo(k7 k7Var, Bundle bundle, long j10) {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m2 m2Var = p2Var.f39685c;
        if (m2Var != null) {
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            p2Var2.Z0();
            m2Var.i(k7Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityDestroyed(@NonNull a aVar, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        onActivityDestroyedByScionActivityInfo(k7.b(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityDestroyedByScionActivityInfo(k7 k7Var, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m2 m2Var = p2Var.f39685c;
        if (m2Var != null) {
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            p2Var2.Z0();
            m2Var.j(k7Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityPaused(@NonNull a aVar, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        onActivityPausedByScionActivityInfo(k7.b(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityPausedByScionActivityInfo(k7 k7Var, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m2 m2Var = p2Var.f39685c;
        if (m2Var != null) {
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            p2Var2.Z0();
            m2Var.k(k7Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityResumed(@NonNull a aVar, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        onActivityResumedByScionActivityInfo(k7.b(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityResumedByScionActivityInfo(k7 k7Var, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m2 m2Var = p2Var.f39685c;
        if (m2Var != null) {
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            p2Var2.Z0();
            m2Var.l(k7Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivitySaveInstanceState(a aVar, a7 a7Var, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(k7.b(activity), a7Var, j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivitySaveInstanceStateByScionActivityInfo(k7 k7Var, a7 a7Var, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m2 m2Var = p2Var.f39685c;
        Bundle bundle = new Bundle();
        if (m2Var != null) {
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            p2Var2.Z0();
            m2Var.m(k7Var, bundle);
        }
        try {
            a7Var.e1(bundle);
        } catch (RemoteException e10) {
            s0 s0Var = this.f24515a.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityStarted(@NonNull a aVar, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        onActivityStartedByScionActivityInfo(k7.b(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityStartedByScionActivityInfo(k7 k7Var, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        if (p2Var.f39685c != null) {
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            p2Var2.Z0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityStopped(@NonNull a aVar, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        onActivityStoppedByScionActivityInfo(k7.b(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void onActivityStoppedByScionActivityInfo(k7 k7Var, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        if (p2Var.f39685c != null) {
            p2 p2Var2 = this.f24515a.f39593m;
            m1.g(p2Var2);
            p2Var2.Z0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void performAction(Bundle bundle, a7 a7Var, long j10) throws RemoteException {
        r();
        a7Var.e1(null);
    }

    public final void r() {
        if (this.f24515a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void registerOnMeasurementEventListener(e7 e7Var) throws RemoteException {
        Object m4Var;
        r();
        e eVar = this.f24516b;
        synchronized (eVar) {
            try {
                m4Var = (a2) eVar.get(Integer.valueOf(e7Var.zzf()));
                if (m4Var == null) {
                    m4Var = new m4(this, e7Var);
                    eVar.put(Integer.valueOf(e7Var.zzf()), m4Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.H0();
        if (p2Var.f39687e.add(m4Var)) {
            return;
        }
        s0 s0Var = ((m1) p2Var.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39756i.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.y6
    @Deprecated
    public void resetAnalyticsData(long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.f39689g.set(null);
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new h2(p2Var, j10, 1));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void resetAnalyticsDataWithElapsedTime(long j10, long j11) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.f39689g.set(null);
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new h2(p2Var, j10, 1));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void retrieveAndUploadBatches(c7 c7Var) {
        u2 u2Var;
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.H0();
        m1 m1Var = (m1) p2Var.f3623a;
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        if (j1Var.M0()) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        j1 j1Var2 = m1Var.f39588g;
        m1.h(j1Var2);
        if (Thread.currentThread() == j1Var2.f39500d) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.b("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (fd.b.e()) {
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39753f.b("Cannot retrieve and upload batches from main thread");
            return;
        }
        s0 s0Var4 = m1Var.f39587f;
        m1.h(s0Var4);
        s0Var4.f39760n.b("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            s0 s0Var5 = m1Var.f39587f;
            m1.h(s0Var5);
            s0Var5.f39760n.b("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            j1 j1Var3 = m1Var.f39588g;
            m1.h(j1Var3);
            j1Var3.Q0(atomicReference, Xa.f27908s, "[sgtm] Getting upload batches", new j2(p2Var, atomicReference, 6, false));
            y3 y3Var = (y3) atomicReference.get();
            if (y3Var == null) {
                break;
            }
            List list = y3Var.f39930a;
            if (list.isEmpty()) {
                break;
            }
            s0 s0Var6 = m1Var.f39587f;
            m1.h(s0Var6);
            s0Var6.f39760n.c(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                w3 w3Var = (w3) it.next();
                try {
                    URL url = new URI(w3Var.f39871c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    l0 l0VarM = ((m1) p2Var.f3623a).m();
                    l0VarM.H0();
                    c0.h(l0VarM.f39538g);
                    String str = l0VarM.f39538g;
                    m1 m1Var2 = (m1) p2Var.f3623a;
                    s0 s0Var7 = m1Var2.f39587f;
                    m1.h(s0Var7);
                    bo.b bVar = s0Var7.f39760n;
                    Long lValueOf = Long.valueOf(w3Var.f39869a);
                    bVar.e("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, w3Var.f39871c, Integer.valueOf(w3Var.f39870b.length));
                    if (!TextUtils.isEmpty(w3Var.f39875g)) {
                        s0 s0Var8 = m1Var2.f39587f;
                        m1.h(s0Var8);
                        s0Var8.f39760n.d("[sgtm] Uploading data from app. row_id", lValueOf, w3Var.f39875g);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = w3Var.f39872d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    s2 s2Var = m1Var2.f39595o;
                    m1.h(s2Var);
                    byte[] bArr = w3Var.f39870b;
                    k kVar = new k(p2Var, atomicReference2, w3Var, 11);
                    s2Var.I0();
                    c0.h(url);
                    c0.h(bArr);
                    j1 j1Var4 = ((m1) s2Var.f3623a).f39588g;
                    m1.h(j1Var4);
                    j1Var4.S0(new u0(s2Var, str, url, bArr, map, kVar));
                    try {
                        l4 l4Var = m1Var2.f39590i;
                        m1.f(l4Var);
                        m1 m1Var3 = (m1) l4Var.f3623a;
                        m1Var3.f39592k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j10 = jCurrentTimeMillis + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = j10 - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    m1Var3.f39592k.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        s0 s0Var9 = ((m1) p2Var.f3623a).f39587f;
                        m1.h(s0Var9);
                        s0Var9.f39756i.b("[sgtm] Interrupted waiting for uploading batch");
                    }
                    u2Var = atomicReference2.get() == null ? u2.UNKNOWN : (u2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e10) {
                    s0 s0Var10 = ((m1) p2Var.f3623a).f39587f;
                    m1.h(s0Var10);
                    s0Var10.f39753f.e("[sgtm] Bad upload url for row_id", w3Var.f39871c, Long.valueOf(w3Var.f39869a), e10);
                    u2Var = u2.FAILURE;
                }
                if (u2Var != u2.SUCCESS) {
                    if (u2Var == u2.BACKOFF) {
                        z10 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        s0 s0Var11 = m1Var.f39587f;
        m1.h(s0Var11);
        s0Var11.f39760n.d("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        try {
            c7Var.zze();
        } catch (RemoteException e11) {
            m1 m1Var4 = this.f24515a;
            c0.h(m1Var4);
            s0 s0Var12 = m1Var4.f39587f;
            m1.h(s0Var12);
            s0Var12.f39756i.c(e11, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j10) throws RemoteException {
        r();
        if (bundle == null) {
            s0 s0Var = this.f24515a.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Conditional user property must not be null");
        } else {
            p2 p2Var = this.f24515a.f39593m;
            m1.g(p2Var);
            p2Var.T0(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setConsentThirdParty(@NonNull Bundle bundle, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.a1(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setCurrentScreen(@NonNull a aVar, @NonNull String str, @NonNull String str2, long j10) throws RemoteException {
        r();
        Activity activity = (Activity) b.y1(aVar);
        c0.h(activity);
        setCurrentScreenByScionActivityInfo(k7.b(activity), str, str2, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r2 > 500) goto L34;
     */
    @Override // com.google.android.gms.internal.measurement.y6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.k7 r5, java.lang.String r6, java.lang.String r7, long r8) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.k7, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.H0();
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new f0(p2Var, z10));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new k2(p2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setEventInterceptor(e7 e7Var) throws RemoteException {
        r();
        eb.d0 d0Var = new eb.d0(12, this, e7Var);
        j1 j1Var = this.f24515a.f39588g;
        m1.h(j1Var);
        if (!j1Var.M0()) {
            j1 j1Var2 = this.f24515a.f39588g;
            m1.h(j1Var2);
            j1Var2.P0(new i0(this, false, d0Var, 12));
            return;
        }
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.G0();
        p2Var.H0();
        eb.d0 d0Var2 = p2Var.f39686d;
        if (d0Var != d0Var2) {
            c0.j("EventInterceptor already set.", d0Var2 == null);
        }
        p2Var.f39686d = d0Var;
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setInstanceIdProvider(h7 h7Var) throws RemoteException {
        r();
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        Boolean boolValueOf = Boolean.valueOf(z10);
        p2Var.H0();
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new i0(p2Var, false, boolValueOf, 10));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        r();
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        j1 j1Var = ((m1) p2Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.P0(new h2(p2Var, j10, 0));
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m1 m1Var = (m1) p2Var.f3623a;
        Uri data = intent.getData();
        if (data == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.l.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.l.b("[sgtm] Preview Mode was not enabled.");
            m1Var.f39585d.f39416c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        s0 s0Var3 = m1Var.f39587f;
        m1.h(s0Var3);
        s0Var3.l.c(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        m1Var.f39585d.f39416c = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setUserId(@NonNull String str, long j10) throws RemoteException {
        r();
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        m1 m1Var = (m1) p2Var.f3623a;
        if (str != null && TextUtils.isEmpty(str)) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.b("User ID must be non-empty or null");
        } else {
            j1 j1Var = m1Var.f39588g;
            m1.h(j1Var);
            j1Var.P0(new i0(14, p2Var, str));
            p2Var.Q0(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull a aVar, boolean z10, long j10) throws RemoteException {
        r();
        Object objY1 = b.y1(aVar);
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.Q0(str, str2, objY1, z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void unregisterOnMeasurementEventListener(e7 e7Var) throws RemoteException {
        Object m4Var;
        r();
        e eVar = this.f24516b;
        synchronized (eVar) {
            m4Var = (a2) eVar.remove(Integer.valueOf(e7Var.zzf()));
        }
        if (m4Var == null) {
            m4Var = new m4(this, e7Var);
        }
        p2 p2Var = this.f24515a.f39593m;
        m1.g(p2Var);
        p2Var.H0();
        if (p2Var.f39687e.remove(m4Var)) {
            return;
        }
        s0 s0Var = ((m1) p2Var.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39756i.b("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public void setConsent(@NonNull Bundle bundle, long j10) throws RemoteException {
    }
}
