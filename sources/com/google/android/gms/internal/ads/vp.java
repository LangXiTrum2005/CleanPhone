package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vp extends ph implements wp {
    @Override // com.google.android.gms.internal.ads.wp
    public final void F0(zzdc zzdcVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdcVar);
        m0(parcelQ, 26);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void H0(long j10) {
        Parcel parcelQ = q();
        parcelQ.writeLong(j10);
        m0(parcelQ, 35);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void U(Bundle bundle) {
        Parcel parcelQ = q();
        rh.c(parcelQ, bundle);
        m0(parcelQ, 33);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void X(zzdq zzdqVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdqVar);
        m0(parcelQ, 32);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void X0(Bundle bundle) {
        Parcel parcelQ = q();
        rh.c(parcelQ, bundle);
        m0(parcelQ, 17);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void Z(zzdg zzdgVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdgVar);
        m0(parcelQ, 25);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void c() {
        m0(q(), 22);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final long d() {
        Parcel parcelR = r(q(), 34);
        long j10 = parcelR.readLong();
        parcelR.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final boolean d1(Bundle bundle) {
        Parcel parcelQ = q();
        rh.c(parcelQ, bundle);
        Parcel parcelR = r(parcelQ, 16);
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final boolean h() {
        Parcel parcelR = r(q(), 30);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void k1(Bundle bundle) {
        Parcel parcelQ = q();
        rh.c(parcelQ, bundle);
        m0(parcelQ, 15);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void n1(up upVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, upVar);
        m0(parcelQ, 21);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final boolean zzA() {
        Parcel parcelR = r(q(), 24);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void zzD() {
        m0(q(), 27);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void zzE() {
        m0(q(), 28);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final ko zzF() {
        ko joVar;
        Parcel parcelR = r(q(), 29);
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

    @Override // com.google.android.gms.internal.ads.wp
    public final zzdx zzH() {
        Parcel parcelR = r(q(), 31);
        zzdx zzdxVarZzb = zzdw.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zze() {
        Parcel parcelR = r(q(), 2);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final List zzf() {
        Parcel parcelR = r(q(), 3);
        ArrayList arrayList = parcelR.readArrayList(rh.f19590a);
        parcelR.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzg() {
        Parcel parcelR = r(q(), 4);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final mo zzh() {
        mo loVar;
        Parcel parcelR = r(q(), 5);
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

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzi() {
        Parcel parcelR = r(q(), 6);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzj() {
        Parcel parcelR = r(q(), 7);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final double zzk() {
        Parcel parcelR = r(q(), 8);
        double d10 = parcelR.readDouble();
        parcelR.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzl() {
        Parcel parcelR = r(q(), 9);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final String zzm() {
        Parcel parcelR = r(q(), 10);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final zzea zzn() {
        Parcel parcelR = r(q(), 11);
        zzea zzeaVarZzb = zzdz.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void zzp() {
        m0(q(), 13);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final ho zzq() {
        ho foVar;
        Parcel parcelR = r(q(), 14);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            foVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            foVar = iInterfaceQueryLocalInterface instanceof ho ? (ho) iInterfaceQueryLocalInterface : new fo(strongBinder);
        }
        parcelR.recycle();
        return foVar;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final s9.a zzu() {
        return com.applovin.impl.ca.o(r(q(), 18));
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final s9.a zzv() {
        return com.applovin.impl.ca.o(r(q(), 19));
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final Bundle zzw() {
        Parcel parcelR = r(q(), 20);
        Bundle bundle = (Bundle) rh.b(parcelR, Bundle.CREATOR);
        parcelR.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final List zzz() {
        Parcel parcelR = r(q(), 23);
        ArrayList arrayList = parcelR.readArrayList(rh.f19590a);
        parcelR.recycle();
        return arrayList;
    }
}
