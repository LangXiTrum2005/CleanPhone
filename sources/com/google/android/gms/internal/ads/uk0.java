package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 extends sk0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20811h;

    @Override // k9.b
    public final void d(Bundle bundle) {
        synchronized (this.f19987b) {
            try {
                if (!this.f19989d) {
                    this.f19989d = true;
                    try {
                        try {
                            int i10 = this.f20811h;
                            if (i10 == 2) {
                                ((gx) this.f19991f.getService()).N0(this.f19990e, ((Boolean) zzba.zzc().a(am.Ge)).booleanValue() ? new rk0(this.f19986a, this.f19990e) : new qk0(this));
                            } else if (i10 == 3) {
                                ((gx) this.f19991f.getService()).e0(this.f20810g, ((Boolean) zzba.zzc().a(am.Ge)).booleanValue() ? new rk0(this.f19986a, this.f19990e) : new qk0(this));
                            } else {
                                this.f19986a.zzd(new yk0(1));
                            }
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f19986a.zzd(new yk0(1));
                        }
                    } catch (Throwable th2) {
                        zzt.zzh().d("RemoteUrlAndCacheKeyClientTask.onConnected", th2);
                        this.f19986a.zzd(new yk0(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sk0, k9.c
    public final void r(ConnectionResult connectionResult) {
        int i10 = zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.f19986a.zzd(new yk0(1));
    }
}
