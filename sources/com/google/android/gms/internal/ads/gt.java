package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gt implements o00, yd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m00 f14952a;

    public /* synthetic */ gt(m00 m00Var) {
        this.f14952a = m00Var;
    }

    @Override // com.google.android.gms.internal.ads.o00, com.google.android.gms.internal.ads.z30
    /* JADX INFO: renamed from: zza */
    public void mo163zza() {
        this.f14952a.zzd(new zs("Cannot get Javascript Engine", 0));
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        b30 b30Var = (b30) obj;
        m00 m00Var = this.f14952a;
        if (b30Var == null) {
            m00Var.zzd(new eo0(1, "Missing webview from video view future."));
        } else {
            b30Var.D("/video", new eq(new sr(m00Var), 6));
            b30Var.m();
        }
    }

    public gt(tf0 tf0Var, m00 m00Var) {
        this.f14952a = m00Var;
        Objects.requireNonNull(tf0Var);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        int i10 = zze.zza;
        zzo.zzf("Failed to load media data due to video view load failure.");
        this.f14952a.zzd(th2);
    }
}
