package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g20 extends e20 {
    @Override // com.google.android.gms.internal.ads.e20
    public final boolean h(String str) {
        String strZzg = zzf.zzg(str);
        b30 b30Var = (b30) this.f13808c.get();
        if (b30Var != null && strZzg != null) {
            b30Var.e0(strZzg, this);
        }
        int i10 = zze.zza;
        zzo.zzi("VideoStreamNoopCache is doing nothing.");
        q(str, strZzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void p() {
    }
}
