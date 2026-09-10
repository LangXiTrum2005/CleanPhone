package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rk0 extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f19602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx f19603b;

    public rk0(m00 m00Var, mx mxVar) {
        this.f19602a = m00Var;
        this.f19603b = mxVar;
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void G0(zzba zzbaVar) {
        this.f19602a.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void f1(ParcelFileDescriptor parcelFileDescriptor) {
        this.f19602a.zzc(new zk0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f19603b));
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void q0(ParcelFileDescriptor parcelFileDescriptor, mx mxVar) {
        this.f19602a.zzc(new zk0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), mxVar));
    }
}
