package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i40 implements of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final so0 f15570b;

    public i40(Context context, VersionInfoParcel versionInfoParcel) {
        int i10;
        so0 so0Var;
        this.f15569a = context;
        int iIntValue = ((Integer) zzba.zzc().a(am.I3)).intValue();
        if (iIntValue != 1) {
            i10 = 3;
            if (iIntValue != 2 && iIntValue == 3) {
                i10 = 4;
            }
        } else {
            i10 = 2;
        }
        k21 k21VarD = l21.D();
        float fFloatValue = ((Float) zzba.zzc().a(am.O3)).floatValue();
        k21VarD.b();
        ((l21) k21VarD.f19193b).F(fFloatValue);
        l21 l21Var = (l21) k21VarD.e();
        m21 m21VarG = n21.G();
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.P3)).booleanValue();
        m21VarG.b();
        ((n21) m21VarG.f19193b).I(zBooleanValue);
        long jLongValue = ((Long) zzba.zzc().a(am.R3)).longValue();
        m21VarG.b();
        ((n21) m21VarG.f19193b).J(jLongValue);
        n21 n21Var = (n21) m21VarG.e();
        g21 g21VarJ0 = h21.j0();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).L(i10);
        String str = versionInfoParcel.afmaVersion;
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).A(str);
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).M();
        boolean zBooleanValue2 = ((Boolean) zzba.zzc().a(am.f12296p3)).booleanValue();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).k0(zBooleanValue2);
        boolean zBooleanValue3 = ((Boolean) zzba.zzc().a(am.S3)).booleanValue();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).l0(zBooleanValue3);
        boolean zBooleanValue4 = ((Boolean) zzba.zzc().a(am.T3)).booleanValue();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).z(zBooleanValue4);
        boolean z10 = ((Integer) zzba.zzc().a(am.F3)).intValue() == -1;
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).G(z10);
        long jIntValue = ((Integer) zzba.zzc().a(am.H3)).intValue();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).F(jIntValue);
        long jLongValue2 = ((Long) zzba.zzc().a(am.Q3)).longValue();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).D(jLongValue2);
        long jIntValue2 = ((Integer) zzba.zzc().a(am.G3)).intValue();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).C(jIntValue2);
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).B(l21Var);
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).E(n21Var);
        boolean zBooleanValue5 = ((Boolean) zzba.zzc().a(am.w4)).booleanValue();
        g21VarJ0.b();
        ((h21) g21VarJ0.f19193b).H(zBooleanValue5);
        h21 h21Var = (h21) g21VarJ0.e();
        k00 k00Var = l00.f16608a;
        synchronized (so0.f20010c) {
            try {
                if (so0.f20011d == null) {
                    so0.f20011d = new so0(context, k00Var, h21Var);
                }
                so0Var = so0.f20011d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15570b = so0Var;
        c31 c31Var = ((f21) so0Var.f20013b).f14179a;
        synchronized (c31Var) {
            try {
                if (c31Var.f13011e != null) {
                    return;
                }
                Set set = (Set) c31Var.f13008b.zzb();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b31) it.next()).zza());
                }
                a71 a71Var = (a71) c31Var.f13010d.zzb();
                gd1 gd1VarZ = zw1.z(new pd1(ca1.y(arrayList), true), i6.f15619t, c31Var.f13009c);
                a71Var.e(2, gd1VarZ);
                c31Var.f13011e = gd1VarZ;
                Iterator it2 = ((Set) c31Var.f13007a.zzb()).iterator();
                while (it2.hasNext()) {
                    ((b31) it2.next()).zza();
                }
                if (c31Var.f13011e != null) {
                } else {
                    throw null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f15570b.m(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zze(int i10, int i11, int i12) {
        zzay.zza();
        Context context = this.f15569a;
        float fZzE = zzf.zzE(context, i10);
        zzay.zza();
        long j10 = i12;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j10, 0, fZzE, zzf.zzE(context, i11), 0);
        so0 so0Var = this.f15570b;
        so0Var.m(motionEventObtain);
        motionEventObtain.recycle();
        zzay.zza();
        float fZzE2 = zzf.zzE(context, i10);
        zzay.zza();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j10, 2, fZzE2, zzf.zzE(context, i11), 0);
        so0Var.m(motionEventObtain2);
        motionEventObtain2.recycle();
        zzay.zza();
        float fZzE3 = zzf.zzE(context, i10);
        zzay.zza();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j10, 1, fZzE3, zzf.zzE(context, i11), 0);
        so0Var.m(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.f15570b.l(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzg(Context context, String str, View view) {
        return this.f15570b.l(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        so0 so0Var = this.f15570b;
        List listAsList = Arrays.asList(stackTraceElementArr);
        u61 u61Var = ((f21) so0Var.f20013b).f14181c.f18179b;
        synchronized (u61Var) {
            ArrayList arrayList = u61Var.f20666a;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzj(Context context, View view, Activity activity) {
        String string;
        gd1 gd1Var;
        f21 f21Var = (f21) this.f15570b.f20013b;
        t21 t21Var = f21Var.f14183e;
        a71 a71Var = f21Var.f14182d;
        y61 y61VarA = a71Var.a(4);
        try {
            try {
                try {
                    y61VarA.a();
                    c31 c31Var = f21Var.f14179a;
                    synchronized (c31Var) {
                        gd1Var = c31Var.f13011e;
                        if (gd1Var == null) {
                            throw null;
                        }
                    }
                    string = (String) zw1.x(gd1Var, new ft(f21Var, context, view, activity, 6), td1.f20333a).get(f21Var.f14184f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    y61VarA.b(e10);
                    string = "";
                } catch (ExecutionException e11) {
                    Throwable th2 = e11;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    y61VarA.b(th2);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                a71Var.b(57);
                string = Integer.toString(17);
            } catch (Throwable th3) {
                y61VarA.b(th3);
                throw th3;
            }
            y61VarA.c();
            t21Var.zzb();
            return string;
        } catch (Throwable th4) {
            y61VarA.c();
            t21Var.zzb();
            throw th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzk(Context context) {
        return this.f15570b.j(context);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final String zzl(Context context) {
        return this.f15570b.j(context);
    }

    @Override // com.google.android.gms.internal.ads.of
    public final void zzh(View view) {
    }
}
