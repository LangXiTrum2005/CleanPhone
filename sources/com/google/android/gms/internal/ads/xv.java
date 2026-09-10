package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xv extends tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAd.UnconfirmedClickListener f22008a;

    public xv(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
        this.f22008a = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.up
    public final void zze(String str) {
        this.f22008a.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.up
    public final void zzf() {
        this.f22008a.onUnconfirmedClickCancelled();
    }
}
