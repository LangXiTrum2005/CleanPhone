package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cs0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13247b;

    public cs0(int i10, int i11) {
        this.f13246a = i10;
        this.f13247b = i11;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        int i10;
        Bundle bundle = (Bundle) obj;
        int i11 = this.f13246a;
        if (i11 == -1 || (i10 = this.f13247b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i11);
        bundle.putInt("crashes_without_flags", i10);
        zzay zzayVar = zzay.f10775g;
        if (zzba.zzc().f22299j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
