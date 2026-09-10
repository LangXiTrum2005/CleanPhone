package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xi extends ph implements zi {
    @Override // com.google.android.gms.internal.ads.zi
    public final void r0(wi wiVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, wiVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzc(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzd(zze zzeVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 3);
    }
}
