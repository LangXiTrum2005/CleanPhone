package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r01 extends ph implements s01 {
    @Override // com.google.android.gms.internal.ads.s01
    public final void R(byte[] bArr) {
        Parcel parcelQ = q();
        parcelQ.writeByteArray(bArr);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void S0(s9.b bVar, String str) {
        Parcel parcelQ = q();
        rh.e(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeString(null);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void e(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void h0() {
        Parcel parcelQ = q();
        parcelQ.writeIntArray(null);
        m0(parcelQ, 4);
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void j(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 7);
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void zze() {
        m0(q(), 3);
    }
}
