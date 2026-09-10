package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ds extends ph implements es {
    @Override // com.google.android.gms.internal.ads.es
    public final void zze() {
        m0(q(), 1);
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void zzf(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 2);
    }
}
