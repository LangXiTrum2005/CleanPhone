package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.af1;
import com.google.android.gms.internal.ads.b21;
import com.google.android.gms.internal.ads.wc0;
import com.google.android.gms.internal.ads.yd1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzar implements yd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wc0 f11432a;

    public zzar(wc0 wc0Var) {
        this.f11432a = wc0Var;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public final void zza(Throwable th2) {
        wc0 wc0Var = this.f11432a;
        String message = th2.getMessage();
        synchronized (wc0Var) {
            wc0Var.S0(new af1(message, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public final void mo164zzb(@Nullable Object obj) {
        wc0 wc0Var = this.f11432a;
        zzbc zzbcVar = (zzbc) obj;
        synchronized (wc0Var) {
            wc0Var.S0(new b21(zzbcVar, 18));
        }
    }
}
