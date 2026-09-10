package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hx extends ph implements jx {
    public hx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void G0(zzba zzbaVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzbaVar);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void f1(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelQ = q();
        rh.c(parcelQ, parcelFileDescriptor);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void q0(ParcelFileDescriptor parcelFileDescriptor, mx mxVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, parcelFileDescriptor);
        rh.c(parcelQ, mxVar);
        m0(parcelQ, 3);
    }
}
