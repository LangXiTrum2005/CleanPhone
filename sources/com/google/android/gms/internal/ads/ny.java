package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ny extends ph implements py {
    public ny(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void a(zze zzeVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 3);
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zze() {
        m0(q(), 1);
    }

    @Override // com.google.android.gms.internal.ads.py
    public final void zzf(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 2);
    }
}
