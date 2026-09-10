package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cu extends ph implements eu {
    public cu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void S(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 22);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void f0(s9.a aVar, s9.a aVar2, s9.a aVar3) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, aVar2);
        rh.e(parcelQ, aVar3);
        m0(parcelQ, 21);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void k(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 20);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzA() {
        Parcel parcelR = r(q(), 24);
        float f10 = parcelR.readFloat();
        parcelR.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzB() {
        Parcel parcelR = r(q(), 25);
        float f10 = parcelR.readFloat();
        parcelR.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void zzC() {
        m0(q(), 26);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zze() {
        Parcel parcelR = r(q(), 2);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final List zzf() {
        Parcel parcelR = r(q(), 3);
        ArrayList arrayList = parcelR.readArrayList(rh.f19590a);
        parcelR.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzg() {
        Parcel parcelR = r(q(), 4);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final mo zzh() {
        Parcel parcelR = r(q(), 5);
        mo moVarX1 = yn.x1(parcelR.readStrongBinder());
        parcelR.recycle();
        return moVarX1;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzi() {
        Parcel parcelR = r(q(), 6);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzj() {
        Parcel parcelR = r(q(), 7);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final double zzk() {
        Parcel parcelR = r(q(), 8);
        double d10 = parcelR.readDouble();
        parcelR.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzl() {
        Parcel parcelR = r(q(), 9);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzm() {
        Parcel parcelR = r(q(), 10);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final zzea zzn() {
        Parcel parcelR = r(q(), 11);
        zzea zzeaVarZzb = zzdz.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final ho zzo() {
        Parcel parcelR = r(q(), 12);
        ho hoVarX1 = go.x1(parcelR.readStrongBinder());
        parcelR.recycle();
        return hoVarX1;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzp() {
        return com.applovin.impl.ca.o(r(q(), 13));
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzq() {
        return com.applovin.impl.ca.o(r(q(), 14));
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzr() {
        return com.applovin.impl.ca.o(r(q(), 15));
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final Bundle zzs() {
        Parcel parcelR = r(q(), 16);
        Bundle bundle = (Bundle) rh.b(parcelR, Bundle.CREATOR);
        parcelR.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final boolean zzt() {
        Parcel parcelR = r(q(), 17);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final boolean zzu() {
        Parcel parcelR = r(q(), 18);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void zzv() {
        m0(q(), 19);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzz() {
        Parcel parcelR = r(q(), 23);
        float f10 = parcelR.readFloat();
        parcelR.recycle();
        return f10;
    }
}
