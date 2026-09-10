package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn0 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15337f;

    public /* synthetic */ hn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15332a = i10;
        this.f15333b = obj;
        this.f15334c = obj2;
        this.f15335d = obj3;
        this.f15336e = obj4;
        this.f15337f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        ty0 ty0Var;
        kc1 kc1Var;
        gv0 gv0Var;
        Object obj2 = null;
        boolean z10 = false;
        switch (this.f15332a) {
            case 0:
                in0 in0Var = (in0) this.f15333b;
                Uri uri = (Uri) this.f15334c;
                ju0 ju0Var = (ju0) this.f15335d;
                du0 du0Var = (du0) this.f15336e;
                fu0 fu0Var = (fu0) this.f15337f;
                try {
                    Intent intent = new u.h().a().f51639a;
                    intent.setData(uri);
                    zzc zzcVar = new zzc(intent, null);
                    m00 m00Var = new m00();
                    i50 i50Var = (i50) ((ed0) in0Var.f15805c);
                    h50 h50Var = new h50(i50Var.f15577b, i50Var.f15578c, new vu0(ju0Var, du0Var, (String) null), new lj1(new vu0(in0Var, m00Var, du0Var, false, 23), z10, obj2, 17));
                    m00Var.zzc(new AdOverlayInfoParcel(zzcVar, null, (bb0) h50Var.f15160k0.zzb(), null, new VersionInfoParcel(0, 0, false), null, null, fu0Var.f14546b));
                    ((cu0) in0Var.f15807e).c(2, 3);
                    return zw1.d(h50Var.W());
                } catch (Throwable th2) {
                    int i10 = zze.zza;
                    zzo.zzg("Error in CustomTabsAdRenderer", th2);
                    throw th2;
                }
            default:
                v90 v90Var = (v90) this.f15333b;
                lj1 lj1Var = (lj1) this.f15334c;
                bt0 bt0Var = (bt0) this.f15335d;
                kt0 kt0Var = (kt0) this.f15336e;
                u90 u90Var = (u90) this.f15337f;
                dt0 dt0Var = (dt0) obj;
                if (dt0Var != null) {
                    kt0 kt0Var2 = bt0Var.f12881a;
                    lj1 lj1Var2 = bt0Var.f12882b;
                    zzm zzmVar = bt0Var.f12883c;
                    String str = bt0Var.f12884d;
                    Executor executor = bt0Var.f12885e;
                    zzx zzxVar = bt0Var.f12886f;
                    gv0 gv0Var2 = dt0Var.f13672a;
                    bt0 bt0Var2 = new bt0(kt0Var2, lj1Var2, zzmVar, str, executor, zzxVar, gv0Var2);
                    fv0 fv0Var = dt0Var.f13674c;
                    if (fv0Var != null) {
                        v90Var.f21139e = null;
                        s sVar = (s) v90Var.f21137c;
                        synchronized (sVar) {
                            ((ArrayDeque) sVar.f19745d).add(bt0Var2);
                        }
                        return v90Var.k(fv0Var, lj1Var);
                    }
                    s sVar2 = (s) v90Var.f21137c;
                    synchronized (sVar2) {
                        sVar2.f19742a = 2;
                        synchronized (sVar2) {
                            try {
                                ty0Var = (ty0) sVar2.f19746e;
                                if (ty0Var == null) {
                                    z10 = true;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        if (kc1Var != null) {
                            v90Var.f21139e = null;
                            return zw1.x(kc1Var, new rr(v90Var, 11), (Executor) v90Var.f21140f);
                        }
                        synchronized (sVar2) {
                            ((ArrayDeque) sVar2.f19745d).add(bt0Var2);
                        }
                        lj1Var = new lj1(28, (jt0) lj1Var.f17037c, dt0Var.f13673b);
                    }
                    if (z10) {
                        kc1Var = null;
                    } else {
                        synchronized (ty0Var) {
                            try {
                                if (ty0Var.f20529b || ty0Var.f20528a || (gv0Var = ((bt0) ty0Var.f20530c).f12887g) == null || !gv0Var.equals(gv0Var2)) {
                                    kc1Var = null;
                                } else {
                                    ty0Var.f20528a = true;
                                    kc1Var = (kc1) ty0Var.f20531d;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    if (kc1Var != null) {
                        v90Var.f21139e = null;
                        return zw1.x(kc1Var, new rr(v90Var, 11), (Executor) v90Var.f21140f);
                    }
                    synchronized (sVar2) {
                        ((ArrayDeque) sVar2.f19745d).add(bt0Var2);
                        lj1Var = new lj1(28, (jt0) lj1Var.f17037c, dt0Var.f13673b);
                    }
                }
                ListenableFuture listenableFutureD = ((md0) v90Var.f21135a).d(lj1Var, kt0Var, u90Var);
                v90Var.f21139e = u90Var;
                return listenableFutureD;
        }
    }
}
