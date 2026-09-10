package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeip implements zzecw {
    private final Context zza;
    private final zzcpq zzb;

    @Nullable
    private final zzbdg zzc;
    private final zzgcs zzd;
    private final zzfgn zze;

    public zzeip(Context context, zzcpq zzcpqVar, zzfgn zzfgnVar, zzgcs zzgcsVar, @Nullable zzbdg zzbdgVar) {
        this.zza = context;
        this.zzb = zzcpqVar;
        this.zze = zzfgnVar;
        this.zzd = zzgcsVar;
        this.zzc = zzbdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final AI zza(zzfca zzfcaVar, zzfbo zzfboVar) {
        zzein zzeinVar = new zzein(this, new View(this.zza), null, new zzcqx() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzcqx
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return null;
            }
        }, (zzfbp) zzfboVar.zzu.get(0));
        zzcon zzconVarZza = this.zzb.zza(new zzcrp(zzfcaVar, zzfboVar, null), zzeinVar);
        zzeio zzeioVarZzl = zzconVarZza.zzl();
        zzfbt zzfbtVar = zzfboVar.zzs;
        final zzbdb zzbdbVar = new zzbdb(zzeioVarZzl, zzfbtVar.zzb, zzfbtVar.zza);
        zzfgh zzfghVar = zzfgh.CUSTOM_RENDER_SYN;
        return zzffx.zzd(new zzffs() { // from class: com.google.android.gms.internal.ads.zzeim
            @Override // com.google.android.gms.internal.ads.zzffs
            public final void zza() throws Exception {
                this.zza.zzc(zzbdbVar);
            }
        }, this.zzd, zzfghVar, this.zze).zzb(zzfgh.CUSTOM_RENDER_ACK).zzd(zzgch.zzh(zzconVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        zzfbt zzfbtVar;
        return (this.zzc == null || (zzfbtVar = zzfboVar.zzs) == null || zzfbtVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbdb zzbdbVar) throws Exception {
        this.zzc.zze(zzbdbVar);
    }
}
