package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final class zzacm {
    private final zzacl zza;
    private final zzact zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdn zzk = zzdn.zza;

    public zzacm(Context context, zzacl zzaclVar, long j) {
        this.zza = zzaclVar;
        this.zzb = new zzact(context);
    }

    private final void zzo(int i2) {
        this.zzd = Math.min(this.zzd, i2);
    }

    public final void zza(int i2) {
        if (i2 == 0) {
            this.zzd = 1;
        } else if (i2 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f) {
        this.zzb.zzf(f);
    }

    public final boolean zzf() {
        int i2 = this.zzd;
        this.zzd = 3;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        return i2 != 3;
    }

    public final void zzg(zzdn zzdnVar) {
        this.zzk = zzdnVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z2) {
        if (z2 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzj(boolean z2) {
        this.zzi = z2;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        if (r17 > 100000) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
    
        if (r24 >= r28) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r21.zzc != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzk(long r22, long r24, long r26, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.zzack r32) throws com.google.android.gms.internal.ads.zzit {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacm.zzk(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.zzack):int");
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzm(int i2) {
        this.zzb.zza(i2);
    }

    public final void zzn(float f) {
        zzgqa.zza(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }
}
