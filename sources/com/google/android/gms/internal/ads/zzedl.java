package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedl extends zzedq {
    private final Context zzg;
    private final VersionInfoParcel zzh;
    private final zzedk zzi;

    public zzedl(Context context, VersionInfoParcel versionInfoParcel, zzedk zzedkVar, zzbyd zzbydVar) {
        this.zzg = context;
        this.zzh = versionInfoParcel;
        this.zzi = zzedkVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzi(this.zzh.afmaVersion);
                    this.zzi.zza();
                } catch (RemoteException e2) {
                    this.zzi.zzb(e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedq, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.zzi.zzb(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.getErrorMessage()))));
    }

    @Override // com.google.android.gms.internal.ads.zzedq, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zzi.zzb(new RemoteException(androidx.datastore.preferences.protobuf.a.g(i2, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i2).length() + 33))));
    }

    public final void zza() {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return;
                }
                this.zzc = true;
                zzbyc zzbycVar = new zzbyc(this.zzg, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
                this.zzf = zzbycVar;
                zzbycVar.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
