package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ur extends ph implements vr {
    @Override // com.google.android.gms.internal.ads.vr
    public final void zze() {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final void zzf(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        m0(parcelQ, 3);
    }
}
