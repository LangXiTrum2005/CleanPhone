package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdh implements MuteThisAdReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzdg f10793b;

    public zzdh(zzdg zzdgVar) {
        String strZze;
        this.f10793b = zzdgVar;
        try {
            strZze = zzdgVar.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            strZze = null;
        }
        this.f10792a = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.f10792a;
    }

    public final String toString() {
        return this.f10792a;
    }

    public final zzdg zza() {
        return this.f10793b;
    }
}
