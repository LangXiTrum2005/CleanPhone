package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vt extends ph implements xt {
    public vt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void B(zze zzeVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 24);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void D(ap apVar, String str) {
        Parcel parcelQ = q();
        rh.e(parcelQ, apVar);
        parcelQ.writeString(str);
        m0(parcelQ, 10);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void L0(fy fyVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, fyVar);
        m0(parcelQ, 16);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void g(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 3);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void k0(String str, String str2) {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        parcelQ.writeString(str2);
        m0(parcelQ, 9);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void p() {
        m0(q(), 11);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void t1(int i10, String str) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeString(str);
        m0(parcelQ, 22);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void v(zze zzeVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 23);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void w(dy dyVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zze() {
        m0(q(), 1);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzf() {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzh() {
        m0(q(), 4);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzi() {
        m0(q(), 5);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzj() {
        m0(q(), 6);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzk() {
        m0(q(), 8);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzo() {
        m0(q(), 13);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzq() {
        m0(q(), 15);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzs(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzt() {
        m0(q(), 18);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzu() {
        m0(q(), 20);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzv(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzz() {
        m0(q(), 25);
    }
}
