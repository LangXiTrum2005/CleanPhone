package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xu extends ph implements yu {
    public xu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void a(zze zzeVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 4);
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void zze() {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void zzf(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString("Adapter returned null.");
        m0(parcelQ, 3);
    }
}
