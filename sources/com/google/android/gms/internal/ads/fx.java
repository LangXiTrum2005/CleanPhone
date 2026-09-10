package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fx extends ph implements gx {
    @Override // com.google.android.gms.internal.ads.gx
    public final void B0(mx mxVar, jx jxVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, mxVar);
        rh.e(parcelQ, jxVar);
        m0(parcelQ, 4);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void N0(mx mxVar, jx jxVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, mxVar);
        rh.e(parcelQ, jxVar);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void V0(mx mxVar, jx jxVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, mxVar);
        rh.e(parcelQ, jxVar);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void e0(String str, jx jxVar) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        rh.e(parcelQ, jxVar);
        m0(parcelQ, 7);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void zzi(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        m0(parcelQ, 9);
    }
}
