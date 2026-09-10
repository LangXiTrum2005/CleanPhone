package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yv extends ph implements aw {
    public yv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void Y(String[] strArr, int[] iArr, s9.a aVar) {
        Parcel parcelQ = q();
        parcelQ.writeStringArray(strArr);
        parcelQ.writeIntArray(iArr);
        rh.e(parcelQ, aVar);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void i(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 4);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void s(Intent intent) {
        Parcel parcelQ = q();
        rh.c(parcelQ, intent);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void u(s9.a aVar, zza zzaVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzaVar);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void zzg() {
        m0(q(), 3);
    }
}
