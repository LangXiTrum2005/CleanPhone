package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rz extends ph implements tz {
    public rz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zze(s9.a aVar, xz xzVar, qz qzVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, xzVar);
        rh.e(parcelQ, qzVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final void zzj(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.internal.ads.tz
    public final s9.a zzm(s9.a aVar, s9.a aVar2, String str, s9.a aVar3) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, aVar2);
        parcelQ.writeString(str);
        rh.e(parcelQ, aVar3);
        return com.applovin.impl.ca.o(r(parcelQ, 11));
    }
}
