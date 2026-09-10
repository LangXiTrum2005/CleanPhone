package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tv extends kp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uv f20516a;

    @Override // com.google.android.gms.internal.ads.lp
    public final void o0(ap apVar) {
        vv vvVar;
        uv uvVar = this.f20516a;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener = uvVar.f20910a;
        synchronized (uvVar) {
            vvVar = uvVar.f20912c;
            if (vvVar == null) {
                vvVar = new vv(apVar);
                uvVar.f20912c = vvVar;
            }
        }
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(vvVar);
    }
}
