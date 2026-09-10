package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaci implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadl zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzacn zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzaci(zzaca zzacaVar, byte[] bArr) {
        this.zza = zzacaVar.zze();
        zzbs zzbsVarZzg = zzacaVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgtd.zzi();
        this.zzd = zzacaVar.zzh();
        zzdn zzdnVarZzi = zzacaVar.zzi();
        this.zzf = zzdnVarZzi;
        this.zzh = zzacaVar.zzj() != -9223372036854775807L ? -zzacaVar.zzj() : -9223372036854775807L;
        zzacn zzacnVarZzk = zzacaVar.zzk();
        this.zzi = zzacnVarZzk;
        this.zze = new zzabn(zzacaVar.zzf(), zzacnVarZzk, zzdnVarZzi);
        new zzabz(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i2) {
        this.zzr = 1;
    }

    public final zzadl zzb(int i2) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadl) sparseArray.get(0);
        }
        zzacc zzaccVar = new zzacc(this, this.zza, 0);
        this.zzg.add(zzaccVar);
        sparseArray.put(0, zzaccVar);
        return zzaccVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[Catch: zzdu -> 0x0033, TRY_LEAVE, TryCatch #1 {zzdu -> 0x0033, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0025, B:18:0x0036, B:20:0x003c, B:23:0x0043, B:28:0x0067), top: B:40:0x0012 }] */
    public final /* synthetic */ boolean zzi(zzv zzvVar, int i2) throws zzadk {
        zzgqa.zzi(this.zzo == 0);
        zzi zziVarZzC = zzC(zzvVar.zzE);
        try {
            int i3 = zziVarZzC.zzd;
            if (i3 != 7) {
                if (zzdv.zzc(i3) && Build.VERSION.SDK_INT >= 29) {
                    String str = zzfj.zza;
                    Locale locale = Locale.US;
                    zzee.zzc("PlaybackVidGraphWrapper", "Color transfer " + i3 + " is not supported. Falling back to OpenGl tone mapping.");
                    zziVarZzC = zzi.zza;
                } else if (i3 != 2 || i3 == 10) {
                    zziVarZzC = zzi.zza;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !zzdv.zzd()) {
                i3 = 7;
                if (zzdv.zzc(i3)) {
                    if (i3 != 2) {
                        zziVarZzC = zzi.zza;
                    } else {
                        zziVarZzC = zzi.zza;
                    }
                } else if (i3 != 2) {
                    zziVarZzC = zzi.zza;
                } else {
                    zziVarZzC = zzi.zza;
                }
            } else {
                zzh zzhVarZzd = zziVarZzC.zzd();
                zzhVarZzd.zzc(6);
                zziVarZzC = zzhVarZzd.zzg();
            }
            zzi zziVar = zziVarZzC;
            zzdn zzdnVar = this.zzf;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final zzdx zzdxVarZzd = zzdnVar.zzd(looperMyLooper, null);
            this.zzl = zzdxVarZzd;
            try {
                zzbs zzbsVar = this.zzb;
                Context context = this.zza;
                zzl zzlVar = zzl.zzb;
                Objects.requireNonNull(zzdxVarZzd);
                zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzacb
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdxVarZzd.zzn(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e2) {
                throw new zzadk(e2, zzvVar);
            }
        } catch (zzdu e3) {
            throw new zzadk(e3, zzvVar);
        }
    }

    public final /* synthetic */ boolean zzj(boolean z2) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j, long j2) throws zzadk {
        this.zze.zzv(j, j2);
    }

    public final /* synthetic */ void zzm(boolean z2) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadl zzadlVar = this.zze;
            zzadlVar.zzg(z2);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzach zzachVar = (zzach) this.zzj.zzd();
                zzachVar.getClass();
                zzadlVar.zzs(1, this.zzk, zzachVar.zza, zzachVar.zzb, zzgtd.zzi());
            }
            this.zzp = -9223372036854775807L;
            this.zzq = -9223372036854775807L;
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z2) {
        this.zze.zzw(z2);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzacj zzacjVar) {
        this.zze.zzl(zzacjVar);
    }

    public final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    public final /* synthetic */ void zzr(int i2) {
        this.zze.zzr(i2);
    }

    public final /* synthetic */ boolean zzs() {
        int i2 = this.zzr;
        return i2 != -1 && i2 == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzacn zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
