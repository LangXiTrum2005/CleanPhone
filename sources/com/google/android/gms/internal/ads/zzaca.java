package com.google.android.gms.internal.ads;

import android.content.Context;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaca {
    private final Context zza;
    private final zzacm zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = MBInterstitialActivity.WEB_LOAD_TIME;
    private final zzacn zzh = new zzacn(1.0f);
    private zzdn zze = zzdn.zza;

    public zzaca(Context context, zzacm zzacmVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzacmVar;
    }

    public final zzaca zza(boolean z2) {
        this.zzd = true;
        return this;
    }

    public final zzaca zzb(zzdn zzdnVar) {
        this.zze = zzdnVar;
        return this;
    }

    public final zzaca zzc(long j) {
        this.zzg = j;
        return this;
    }

    public final zzaci zzd() {
        zzgqa.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzacg(false);
        }
        zzaci zzaciVar = new zzaci(this, null);
        this.zzf = true;
        return zzaciVar;
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzacm zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    public final /* synthetic */ zzdn zzi() {
        return this.zze;
    }

    public final /* synthetic */ long zzj() {
        return this.zzg;
    }

    public final /* synthetic */ zzacn zzk() {
        return this.zzh;
    }
}
