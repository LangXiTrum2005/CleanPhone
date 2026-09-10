package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jy extends ph implements ly {
    @Override // com.google.android.gms.internal.ads.ly
    public final void d0(fy fyVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, fyVar);
        m0(parcelQ, 3);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void e(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 4);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void i0(zze zzeVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zze() {
        m0(q(), 1);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzf() {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzj() {
        m0(q(), 6);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void zzk() {
        m0(q(), 7);
    }
}
