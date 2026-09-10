package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23105f;

    public /* synthetic */ m7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f23100a = i10;
        this.f23101b = obj;
        this.f23102c = obj2;
        this.f23103d = obj3;
        this.f23104e = obj4;
        this.f23105f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        ea.l4 l4Var;
        switch (this.f23100a) {
            case 0:
                n7 n7Var = (n7) this.f23101b;
                Handler handler = n7Var.f23118b;
                c0 c0Var = n7Var.f23125i;
                Activity activity = (Activity) this.f23102c;
                ConsentRequestParameters consentRequestParameters = (ConsentRequestParameters) this.f23103d;
                ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener = (ConsentInformation.OnConsentInfoUpdateSuccessListener) this.f23104e;
                final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener = (ConsentInformation.OnConsentInfoUpdateFailureListener) this.f23105f;
                try {
                    ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
                    if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                        Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + d0.a(n7Var.f23117a) + "\") to set this as a debug device.");
                    }
                    a aVarG = n7Var.f23123g.G(n7Var.a(n7Var.f23122f.a(activity, consentRequestParameters)));
                    h hVar = n7Var.f23120d;
                    hVar.f23032b.edit().putInt("consent_status", aVarG.f22932a).commit();
                    hVar.f23032b.edit().putString("privacy_options_requirement_status", aVarG.f22933b.name()).commit();
                    n7Var.f23121e.f23167c.set(aVarG.f22934c);
                    c0Var.a((Queue) c0Var.f22970f.get(), 8, 9, null);
                    n7Var.f23124h.f23201a.execute(new com.google.android.gms.common.api.internal.m0(n7Var, onConsentInfoUpdateSuccessListener, aVarG, false, 2));
                    return;
                } catch (p1 e10) {
                    c0Var.a((Queue) c0Var.f22970f.get(), 8, 9, l1.d.g("RequestConsentUpdate exception. Error: ", e10.getMessage(), ", cause: ", String.valueOf(e10.getCause())));
                    final int i10 = 0;
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(e10.d());
                                    break;
                                default:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(e10.d());
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e11) {
                    c0Var.a((Queue) c0Var.f22970f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e11.getMessage())));
                    final int i11 = 1;
                    final p1 p1Var = new p1(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e11))));
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(p1Var.d());
                                    break;
                                default:
                                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(p1Var.d());
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 1:
                ea.s1 s1Var = (ea.s1) this.f23101b;
                ea.n4 n4Var = (ea.n4) this.f23102c;
                Bundle bundle = (Bundle) this.f23103d;
                ea.i0 i0Var = (ea.i0) this.f23104e;
                String str = (String) this.f23105f;
                ea.e4 e4Var = s1Var.f39761a;
                e4Var.V();
                try {
                    i0Var.l0(e4Var.d0(bundle, n4Var));
                    return;
                } catch (RemoteException e12) {
                    e4Var.t().f39753f.d("Failed to return trigger URIs for app", str, e12);
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f23101b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            ea.h3 h3Var = (ea.h3) this.f23105f;
                            ea.g0 g0Var = h3Var.f39458d;
                            if (g0Var == null) {
                                ea.s0 s0Var = ((ea.m1) h3Var.f3623a).f39587f;
                                ea.m1.h(s0Var);
                                s0Var.f39753f.e("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f23102c, (String) this.f23103d);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(g0Var.P0((String) this.f23102c, (String) this.f23103d, (ea.n4) this.f23104e));
                            } else {
                                atomicReference2.set(g0Var.F(null, (String) this.f23102c, (String) this.f23103d));
                            }
                            h3Var.T0();
                            atomicReference = (AtomicReference) this.f23101b;
                            atomicReference.notify();
                            return;
                        } catch (Throwable th2) {
                            ((AtomicReference) this.f23101b).notify();
                            throw th2;
                        }
                    } catch (RemoteException e13) {
                        ea.s0 s0Var2 = ((ea.m1) ((ea.h3) this.f23105f).f3623a).f39587f;
                        ea.m1.h(s0Var2);
                        s0Var2.f39753f.e("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f23102c, e13);
                        ((AtomicReference) this.f23101b).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.f23101b;
                    }
                }
                break;
            case 3:
                com.google.android.gms.internal.measurement.a7 a7Var = (com.google.android.gms.internal.measurement.a7) this.f23104e;
                String str2 = (String) this.f23102c;
                String str3 = (String) this.f23101b;
                ea.h3 h3Var2 = (ea.h3) this.f23105f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        ea.g0 g0Var2 = h3Var2.f39458d;
                        if (g0Var2 == null) {
                            ea.m1 m1Var = (ea.m1) h3Var2.f3623a;
                            ea.s0 s0Var3 = m1Var.f39587f;
                            ea.m1.h(s0Var3);
                            s0Var3.f39753f.d("Failed to get conditional properties; not connected to service", str3, str2);
                            l4Var = m1Var.f39590i;
                        } else {
                            arrayList = ea.l4.z1(g0Var2.P0(str3, str2, (ea.n4) this.f23103d));
                            h3Var2.T0();
                            l4Var = ((ea.m1) h3Var2.f3623a).f39590i;
                        }
                    } catch (RemoteException e14) {
                        ea.s0 s0Var4 = ((ea.m1) h3Var2.f3623a).f39587f;
                        ea.m1.h(s0Var4);
                        s0Var4.f39753f.e("Failed to get conditional properties; remote exception", str3, str2, e14);
                    }
                    ea.m1.f(l4Var);
                    l4Var.y1(a7Var, arrayList);
                    return;
                } catch (Throwable th3) {
                    ea.l4 l4Var2 = ((ea.m1) h3Var2.f3623a).f39590i;
                    ea.m1.f(l4Var2);
                    l4Var2.y1(a7Var, arrayList);
                    throw th3;
                }
            default:
                try {
                    if (!(((o5.j) this.f23101b).f47201a instanceof o5.a)) {
                        String string = ((UUID) this.f23102c).toString();
                        int i12 = ((n5.o) this.f23105f).f46551c.i(string);
                        if (i12 == 0 || d5.u.a(i12)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((e5.b) ((n5.o) this.f23105f).f46550b).f(string, (d5.h) this.f23103d);
                        ((Context) this.f23104e).startService(l5.b.a((Context) this.f23104e, string, (d5.h) this.f23103d));
                    }
                    ((o5.j) this.f23101b).h(null);
                    return;
                } catch (Throwable th4) {
                    ((o5.j) this.f23101b).i(th4);
                    return;
                }
        }
    }

    public /* synthetic */ m7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, boolean z10) {
        this.f23100a = i10;
        this.f23101b = obj2;
        this.f23102c = obj3;
        this.f23103d = obj4;
        this.f23104e = obj5;
        this.f23105f = obj;
    }
}
