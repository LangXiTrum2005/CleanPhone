package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcig extends zzceq {
    private final zzcfl zzc;
    private zzcih zzd;
    private Uri zze;
    private zzcep zzf;
    private boolean zzg;
    private int zzh;

    public zzcig(Context context, zzcfl zzcflVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcflVar;
        zzcflVar.zza(this);
    }

    @EnsuresNonNullIf
    private final boolean zzu() {
        int i2 = this.zzh;
        return (i2 == 1 || i2 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i2) {
        if (i2 == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i2;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcig.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return android.support.v4.media.a.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzb(zzcep zzcepVar) {
        this.zzf = zzcepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzc(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzcih(uri.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcif
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcih zzcihVar = this.zzd;
        if (zzcihVar != null) {
            zzcihVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzi(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzj(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzceq, com.google.android.gms.internal.ads.zzcfn
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    public final /* synthetic */ void zzr() {
        zzcep zzcepVar = this.zzf;
        if (zzcepVar != null) {
            zzcepVar.zzb();
        }
    }

    public final /* synthetic */ void zzs() {
        zzcep zzcepVar = this.zzf;
        if (zzcepVar != null) {
            if (!this.zzg) {
                zzcepVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    public final /* synthetic */ void zzt() {
        zzcep zzcepVar = this.zzf;
        if (zzcepVar != null) {
            zzcepVar.zzd();
        }
    }
}
