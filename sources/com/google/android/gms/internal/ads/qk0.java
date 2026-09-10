package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qk0 extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sk0 f19114a;

    public qk0(sk0 sk0Var) {
        this.f19114a = sk0Var;
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void G0(zzba zzbaVar) {
        this.f19114a.f19986a.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void f1(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        sk0 sk0Var = this.f19114a;
        sk0Var.f19986a.zzc(new zk0(autoCloseInputStream, sk0Var.f19990e));
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void q0(ParcelFileDescriptor parcelFileDescriptor, mx mxVar) {
        this.f19114a.f19986a.zzc(new zk0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), mxVar));
    }
}
