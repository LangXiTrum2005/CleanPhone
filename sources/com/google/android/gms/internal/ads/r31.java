package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r31 implements m31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f19352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx1 f19353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx1 f19354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o61 f19355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dx1 f19356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i21 f19357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h21 f19358g;

    public r31(ExecutorService executorService, dx1 dx1Var, dx1 dx1Var2, o61 o61Var, dx1 dx1Var3, i21 i21Var, h21 h21Var) {
        this.f19352a = executorService;
        this.f19353b = dx1Var;
        this.f19354c = dx1Var2;
        this.f19355d = o61Var;
        this.f19356e = dx1Var3;
        this.f19357f = i21Var;
        this.f19358g = h21Var;
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture a(Context context) {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f19357f.zzb();
        dVar.f22983c = context;
        dVar.f22987g = this.f19355d.a();
        xd xdVarA0 = je.A0();
        xdVarA0.getClass();
        dVar.f22988h = xdVarA0;
        dVar.f22989i = p21.f18448a;
        return ((x31) dVar.u().f15984a.zzb()).a();
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture b(Context context, View view, Activity activity) {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f19357f.zzb();
        context.getClass();
        dVar.f22983c = context;
        dVar.f22984d = view;
        dVar.f22985e = activity;
        dVar.f22986f = true != this.f19358g.T() ? "" : null;
        dVar.f22987g = this.f19355d.b(context, view);
        xd xdVarA0 = je.A0();
        xdVarA0.getClass();
        dVar.f22988h = xdVarA0;
        dVar.f22989i = p21.f18449b;
        return ((x31) dVar.u().f15984a.zzb()).a();
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture c(Context context, String str, View view) {
        dx1 dx1Var = this.f19356e;
        HashMap mapC = this.f19355d.c();
        v31 v31Var = (v31) dx1Var.zzb();
        synchronized (v31Var) {
            try {
                MotionEvent motionEvent = v31Var.f21015b;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", v31Var.f21016c);
                ArrayDeque arrayDeque = v31Var.f21014a;
                mapC.put("ro", arrayDeque.toArray(new t31[arrayDeque.size()]));
                v31Var.f21016c = new s31();
                arrayDeque.clear();
                MotionEvent motionEvent2 = v31Var.f21015b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    v31Var.f21015b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f19357f.zzb();
        context.getClass();
        dVar.f22983c = context;
        dVar.f22984d = view;
        dVar.f22985e = null;
        dVar.f22986f = str;
        dVar.f22987g = mapC;
        dVar.f22989i = p21.f18450c;
        xd xdVarA0 = je.A0();
        xdVarA0.getClass();
        dVar.f22988h = xdVarA0;
        return ((x31) dVar.u().f15984a.zzb()).a();
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final void d(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            v31 v31Var = (v31) this.f19356e.zzb();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (v31Var) {
                try {
                    if (motionEvent.getAction() == 1) {
                        v31Var.f21015b = MotionEvent.obtain(motionEvent);
                    }
                    v31Var.f21016c.a(motionEvent);
                    ArrayDeque arrayDeque = v31Var.f21014a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new t31(motionEvent));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final String zza() {
        return "1.893135394";
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture zzb() {
        return zw1.o(this.f19352a, new ns0(this, 5));
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final int zzg() {
        return 2;
    }
}
