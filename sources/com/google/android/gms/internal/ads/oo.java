package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oo extends ph implements qo {
    public oo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzb(String str, s9.a aVar) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        rh.e(parcelQ, aVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final s9.a zzc(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        return com.applovin.impl.ca.o(r(parcelQ, 2));
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzd(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 3);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzdB(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzdC(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 9);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzdD(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 7);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzdE(ko koVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, koVar);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zze() {
        m0(q(), 4);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void zzf(s9.a aVar, int i10) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        parcelQ.writeInt(i10);
        m0(parcelQ, 5);
    }
}
