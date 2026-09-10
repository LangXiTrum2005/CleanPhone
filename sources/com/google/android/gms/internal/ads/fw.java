package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fw extends ph implements hw {
    public fw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzH(int i10, String[] strArr, int[] iArr) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeStringArray(strArr);
        parcelQ.writeIntArray(iArr);
        m0(parcelQ, 15);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zze() {
        m0(q(), 10);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzf() {
        m0(q(), 14);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final boolean zzg() {
        Parcel parcelR = r(q(), 11);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzh(Bundle bundle) {
        Parcel parcelQ = q();
        rh.c(parcelQ, bundle);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzi() {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzj() {
        m0(q(), 3);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzk() {
        m0(q(), 4);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzl() {
        m0(q(), 5);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzm(int i10, int i11, Intent intent) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeInt(i11);
        rh.c(parcelQ, intent);
        m0(parcelQ, 12);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzn(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 13);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzo(Bundle bundle) {
        Parcel parcelQ = q();
        rh.c(parcelQ, bundle);
        Parcel parcelR = r(parcelQ, 6);
        if (parcelR.readInt() != 0) {
            bundle.readFromParcel(parcelR);
        }
        parcelR.recycle();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzp() {
        m0(q(), 7);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzq() {
        m0(q(), 8);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzs() {
        m0(q(), 9);
    }
}
