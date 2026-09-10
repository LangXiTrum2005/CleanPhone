package com.google.android.gms.ads.h5;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.vu0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class H5AdsRequestHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu0 f10707a;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.f10707a = new vu0(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        vu0 vu0Var = this.f10707a;
        vu0Var.getClass();
        if (((Boolean) zzba.zzc().a(am.Bb)).booleanValue()) {
            if (((hr) vu0Var.f21276d) == null) {
                vu0Var.f21276d = zzay.zzb().zzk((Context) vu0Var.f21274b, new qt(), (OnH5AdsEventListener) vu0Var.f21275c);
            }
            hr hrVar = (hr) vu0Var.f21276d;
            if (hrVar != null) {
                try {
                    hrVar.zzf();
                } catch (RemoteException e10) {
                    zzo.zzl("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        vu0 vu0Var = this.f10707a;
        vu0Var.getClass();
        if (!vu0.p(str)) {
            return false;
        }
        if (((hr) vu0Var.f21276d) == null) {
            vu0Var.f21276d = zzay.zzb().zzk((Context) vu0Var.f21274b, new qt(), (OnH5AdsEventListener) vu0Var.f21275c);
        }
        hr hrVar = (hr) vu0Var.f21276d;
        if (hrVar == null) {
            return false;
        }
        try {
            hrVar.zze(str);
            return true;
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return true;
        }
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return vu0.p(str);
    }
}
