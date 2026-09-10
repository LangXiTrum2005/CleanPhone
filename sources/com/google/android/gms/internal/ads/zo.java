package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zo extends ph implements ap {
    public zo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void a1(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 14);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean o(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        Parcel parcelR = r(parcelQ, 17);
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean z() {
        Parcel parcelR = r(q(), 12);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final String zze(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 1);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final mo zzf(String str) {
        mo loVar;
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 2);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            loVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            loVar = iInterfaceQueryLocalInterface instanceof mo ? (mo) iInterfaceQueryLocalInterface : new lo(strongBinder);
        }
        parcelR.recycle();
        return loVar;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final List zzg() {
        Parcel parcelR = r(q(), 3);
        ArrayList<String> arrayListCreateStringArrayList = parcelR.createStringArrayList();
        parcelR.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final String zzh() {
        Parcel parcelR = r(q(), 4);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzi(String str) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzj() {
        m0(q(), 6);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzl() {
        m0(q(), 8);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final s9.a zzm() {
        return com.applovin.impl.ca.o(r(q(), 9));
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean zzn(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        Parcel parcelR = r(parcelQ, 10);
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean zzp() {
        Parcel parcelR = r(q(), 13);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzr() {
        m0(q(), 15);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final ko zzs() {
        ko joVar;
        Parcel parcelR = r(q(), 16);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            joVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            joVar = iInterfaceQueryLocalInterface instanceof ko ? (ko) iInterfaceQueryLocalInterface : new jo(strongBinder);
        }
        parcelR.recycle();
        return joVar;
    }
}
