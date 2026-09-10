package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ee0 f12742b;

    public /* synthetic */ be0(ee0 ee0Var, int i10) {
        this.f12741a = i10;
        this.f12742b = ee0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12741a;
        lp lpVar = null;
        ee0 ee0Var = this.f12742b;
        switch (i10) {
            case 0:
                ee0Var.f13938n.zzA();
                je0 je0Var = ee0Var.f13937m;
                synchronized (je0Var) {
                    try {
                        b30 b30Var = je0Var.f16058i;
                        if (b30Var != null) {
                            b30Var.destroy();
                            je0Var.f16058i = null;
                        }
                        b30 b30Var2 = je0Var.f16059j;
                        if (b30Var2 != null) {
                            b30Var2.destroy();
                            je0Var.f16059j = null;
                        }
                        b30 b30Var3 = je0Var.f16060k;
                        if (b30Var3 != null) {
                            b30Var3.destroy();
                            je0Var.f16060k = null;
                        }
                        ListenableFuture listenableFuture = je0Var.f16061m;
                        if (listenableFuture != null) {
                            listenableFuture.cancel(false);
                            je0Var.f16061m = null;
                        }
                        m00 m00Var = je0Var.f16062n;
                        if (m00Var != null) {
                            m00Var.cancel(false);
                            je0Var.f16062n = null;
                        }
                        je0Var.l = null;
                        je0Var.f16070v.clear();
                        je0Var.f16071w.clear();
                        je0Var.f16051b = null;
                        je0Var.f16052c = null;
                        je0Var.f16053d = null;
                        je0Var.f16054e = null;
                        je0Var.f16057h = null;
                        je0Var.f16063o = null;
                        je0Var.f16064p = null;
                        je0Var.f16065q = null;
                        je0Var.f16067s = null;
                        je0Var.f16068t = null;
                        je0Var.f16069u = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ne0 ne0Var = ee0Var.f13941q;
                try {
                    je0 je0Var2 = ee0Var.f13937m;
                    int iQ = je0Var2.q();
                    if (iQ == 1) {
                        fp fpVar = ne0Var.f17781a;
                        if (fpVar != null) {
                            ee0Var.l();
                            xo xoVar = (xo) ee0Var.f13942r.zzb();
                            ep epVar = (ep) fpVar;
                            Parcel parcelQ = epVar.q();
                            rh.e(parcelQ, xoVar);
                            epVar.m0(parcelQ, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 2) {
                        dp dpVar = ne0Var.f17782b;
                        if (dpVar != null) {
                            ee0Var.l();
                            wo woVar = (wo) ee0Var.f13943s.zzb();
                            cp cpVar = (cp) dpVar;
                            Parcel parcelQ2 = cpVar.q();
                            rh.e(parcelQ2, woVar);
                            cpVar.m0(parcelQ2, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 3) {
                        String strG = je0Var2.g();
                        if (strG != null) {
                            lpVar = (lp) ne0Var.f17786f.get(strG);
                        }
                        if (lpVar != null) {
                            if (je0Var2.h() != null) {
                                ee0Var.e("Google", true);
                            }
                            lpVar.o0((ap) ee0Var.f13946v.zzb());
                            return;
                        }
                        return;
                    }
                    if (iQ == 6) {
                        rp rpVar = ne0Var.f17783c;
                        if (rpVar != null) {
                            ee0Var.l();
                            rpVar.C0((wp) ee0Var.f13944t.zzb());
                            return;
                        }
                        return;
                    }
                    if (iQ != 7) {
                        int i11 = zze.zza;
                        zzo.zzf("Wrong native template id!");
                        return;
                    }
                    gs gsVar = ne0Var.f17785e;
                    if (gsVar != null) {
                        cs csVar = (cs) ee0Var.f13945u.zzb();
                        fs fsVar = (fs) gsVar;
                        Parcel parcelQ3 = fsVar.q();
                        rh.e(parcelQ3, csVar);
                        fsVar.m0(parcelQ3, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e10) {
                    int i12 = zze.zza;
                    zzo.zzg("RemoteException when notifyAdLoad is called", e10);
                    return;
                }
        }
    }
}
