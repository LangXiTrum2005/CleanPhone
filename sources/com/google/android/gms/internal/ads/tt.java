package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tt extends ph implements ut {
    @Override // com.google.android.gms.internal.ads.ut
    public final void G(s9.a aVar, zzm zzmVar, String str, xt xtVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, xtVar);
        m0(parcelQ, 38);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void I0(s9.a aVar, zzm zzmVar, String str, xt xtVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, xtVar);
        m0(parcelQ, 28);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void J(s9.a aVar, zzr zzrVar, zzm zzmVar, String str, String str2, xt xtVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzrVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        parcelQ.writeString(str2);
        rh.e(parcelQ, xtVar);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void M0(s9.a aVar, zzm zzmVar, cy cyVar, String str) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(null);
        rh.e(parcelQ, cyVar);
        parcelQ.writeString(str);
        m0(parcelQ, 10);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void O(boolean z10) {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 25);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void T(s9.a aVar, zzr zzrVar, zzm zzmVar, String str, String str2, xt xtVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzrVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        parcelQ.writeString(str2);
        rh.e(parcelQ, xtVar);
        m0(parcelQ, 35);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void V(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 30);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void Y0(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 39);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void a0(s9.a aVar, cy cyVar, List list) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, cyVar);
        parcelQ.writeStringList(list);
        m0(parcelQ, 23);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void c1(s9.a aVar, zzm zzmVar, String str, xt xtVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, xtVar);
        m0(parcelQ, 32);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final zt d() {
        zt ytVar;
        Parcel parcelR = r(q(), 36);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            ytVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            ytVar = iInterfaceQueryLocalInterface instanceof zt ? (zt) iInterfaceQueryLocalInterface : new yt(strongBinder);
        }
        parcelR.recycle();
        return ytVar;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void j0(s9.a aVar, vr vrVar, ArrayList arrayList) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, vrVar);
        parcelQ.writeTypedList(arrayList);
        m0(parcelQ, 31);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void k(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 21);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void l1(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 37);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final fv m() {
        Parcel parcelR = r(q(), 34);
        fv fvVar = (fv) rh.b(parcelR, fv.CREATOR);
        parcelR.recycle();
        return fvVar;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final au n() {
        au auVar;
        Parcel parcelR = r(q(), 15);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            auVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            auVar = iInterfaceQueryLocalInterface instanceof au ? (au) iInterfaceQueryLocalInterface : new au(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }
        parcelR.recycle();
        return auVar;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void p0(s9.a aVar, zzm zzmVar, String str, String str2, xt xtVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        parcelQ.writeString(str2);
        rh.e(parcelQ, xtVar);
        m0(parcelQ, 7);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void y(s9.a aVar, zzm zzmVar, String str, String str2, xt xtVar, eo eoVar, ArrayList arrayList) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        parcelQ.writeString(str2);
        rh.e(parcelQ, xtVar);
        rh.c(parcelQ, eoVar);
        parcelQ.writeStringList(arrayList);
        m0(parcelQ, 14);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void z0(zzm zzmVar, String str) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzmVar);
        parcelQ.writeString(str);
        m0(parcelQ, 11);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final zzea zzB() {
        Parcel parcelR = r(q(), 26);
        zzea zzeaVarZzb = zzdz.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final eu zzC() {
        eu cuVar;
        Parcel parcelR = r(q(), 27);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            cuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            cuVar = iInterfaceQueryLocalInterface instanceof eu ? (eu) iInterfaceQueryLocalInterface : new cu(strongBinder);
        }
        parcelR.recycle();
        return cuVar;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final fv zzH() {
        Parcel parcelR = r(q(), 33);
        fv fvVar = (fv) rh.b(parcelR, fv.CREATOR);
        parcelR.recycle();
        return fvVar;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final bu zzP() {
        bu buVar;
        Parcel parcelR = r(q(), 16);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            buVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            buVar = iInterfaceQueryLocalInterface instanceof bu ? (bu) iInterfaceQueryLocalInterface : new bu(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }
        parcelR.recycle();
        return buVar;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final s9.a zzf() {
        return com.applovin.impl.ca.o(r(q(), 2));
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzh() {
        m0(q(), 4);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzi() {
        m0(q(), 5);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzl() {
        m0(q(), 8);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzm() {
        m0(q(), 9);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzp() {
        m0(q(), 12);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final boolean zzq() {
        Parcel parcelR = r(q(), 13);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final boolean zzx() {
        Parcel parcelR = r(q(), 22);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }
}
