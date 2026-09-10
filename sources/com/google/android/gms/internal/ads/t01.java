package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t01 extends qh implements s01 {
    public t01() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                s9.b.x1(parcel.readStrongBinder());
                parcel.readString();
                rh.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                rh.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                rh.f(parcel);
                break;
            case 6:
                parcel.readInt();
                rh.f(parcel);
                break;
            case 7:
                parcel.readInt();
                rh.f(parcel);
                break;
            case 8:
                s9.b.x1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                rh.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void h0() {
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void R(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void e(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void j(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.s01
    public final void S0(s9.b bVar, String str) {
    }
}
