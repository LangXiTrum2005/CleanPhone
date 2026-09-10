package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dy0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ux0 f13757b;

    public /* synthetic */ dy0(ux0 ux0Var, int i10) {
        this.f13756a = i10;
        this.f13757b = ux0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13756a;
        ux0 ux0Var = this.f13757b;
        switch (i10) {
            case 0:
                ux0Var.v();
                break;
            case 1:
                zzcb zzcbVar = ux0Var.f20929h;
                if (zzcbVar != null) {
                    try {
                        zzcbVar.zzf((zzfp) ux0Var.f20926e.get());
                    } catch (RemoteException unused) {
                        int i11 = zze.zza;
                        zzo.zzi("Failed to call onAdsExhausted");
                    }
                }
                zzce zzceVar = ux0Var.f20930i;
                if (zzceVar != null) {
                    try {
                        zzceVar.zzf(ux0Var.l);
                    } catch (RemoteException unused2) {
                        int i12 = zze.zza;
                        zzo.zzi("Failed to call onAdsExhausted");
                        return;
                    }
                }
                break;
            case 2:
                if (ux0Var.f20937q != null) {
                    ((p9.b) ux0Var.f20938r).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iS = ux0Var.s();
                    String strG = ux0Var.g();
                    ux0Var.f20937q.r("pae", "paeo_ts", jCurrentTimeMillis, iS, 0, null, ux0Var.f20939s, strG);
                }
                break;
            case 3:
                ux0Var.e();
                break;
            case 4:
                ux0Var.e();
                break;
            default:
                ux0Var.w();
                break;
        }
    }

    public dy0(ux0 ux0Var) {
        this.f13756a = 0;
        Objects.requireNonNull(ux0Var);
        this.f13757b = ux0Var;
    }
}
