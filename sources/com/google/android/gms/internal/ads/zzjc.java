package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjc {
    final Context zza;
    zzdn zzb;
    zzgqs zzc;
    zzgqs zzd;
    zzgqs zze;
    zzgqs zzf;
    zzgqs zzg;
    zzgpr zzh;
    Looper zzi;
    int zzj;
    zzd zzk;
    int zzl;
    boolean zzm;
    zzmq zzn;
    zzmp zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    String zzx;
    zzim zzy;

    public zzjc(final Context context, final zzmn zzmnVar) {
        zzgqs zzgqsVar = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return zzmnVar;
            }
        };
        zzgqs zzgqsVar2 = new zzgqs() { // from class: com.google.android.gms.internal.ads.zziw
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return new zzvt(context, new zzaek());
            }
        };
        zzgqs zzgqsVar3 = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzix
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return new zzzu(context);
            }
        };
        zziv zzivVar = zziv.zza;
        zzgqs zzgqsVar4 = new zzgqs() { // from class: com.google.android.gms.internal.ads.zziy
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return zzaap.zzh(context);
            }
        };
        zziu zziuVar = zziu.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzgqsVar;
        this.zzd = zzgqsVar2;
        this.zze = zzgqsVar3;
        this.zzf = zzivVar;
        this.zzg = zzgqsVar4;
        this.zzh = zziuVar;
        this.zzi = zzfj.zze();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzmq.zzc;
        this.zzo = zzmp.zza;
        this.zzy = new zzim(0.97f, 1.03f, 1000L, 1.0E-7f, zzfj.zzq(20L), zzfj.zzq(500L), 0.999f, null);
        this.zzb = zzdn.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i2 = zzis.zza;
        }
    }
}
