package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 extends zzb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f00 f13323b;

    public d00(f00 f00Var) {
        Objects.requireNonNull(f00Var);
        this.f13323b = f00Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        f00 f00Var = this.f13323b;
        uw uwVar = new uw(f00Var.f14133e, f00Var.f14134f.afmaVersion);
        synchronized (f00Var.f14129a) {
            try {
                zzt.zzm();
                cm.a(f00Var.f14136h, uwVar);
            } catch (IllegalArgumentException e10) {
                int i10 = zze.zza;
                zzo.zzj("Cannot config CSI reporter.", e10);
            }
        }
    }
}
