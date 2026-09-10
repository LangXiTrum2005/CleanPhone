package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes4.dex */
final class zzxk implements zzwe, zzaer, zzaar, zzaaw, zzxu {
    private static final Map zzb;
    private static final zzv zzc;
    private zzxj zzA;
    private zzafr zzB;
    private long zzC;
    private boolean zzD;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private int zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private final Uri zzd;
    private final zzhb zze;
    private final zztk zzf;
    private final zzwq zzg;
    private final zztf zzh;
    private final zzxc zzi;
    private final zzaah zzj;
    private final long zzk;
    private final long zzl;
    private final zzwz zzn;
    private zzwd zzs;
    private zzahv zzt;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzaaz zzm = new zzaaz("ProgressiveMediaPeriod");
    private final zzdq zzo = new zzdq(zzdn.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxg
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxd
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfj.zzc(null);
    private zzxi[] zzv = new zzxi[0];
    private zzxv[] zzu = new zzxv[0];
    private long zzL = -9223372036854775807L;
    private int zzE = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzm("application/x-icy");
        zzc = zztVar.zzM();
    }

    public zzxk(Uri uri, zzhb zzhbVar, zzwz zzwzVar, zztk zztkVar, zztf zztfVar, zzaaq zzaaqVar, zzwq zzwqVar, zzxc zzxcVar, zzaah zzaahVar, String str, int i2, int i3, zzv zzvVar, long j, zzabf zzabfVar) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zztkVar;
        this.zzh = zztfVar;
        this.zzg = zzwqVar;
        this.zzi = zzxcVar;
        this.zzj = zzaahVar;
        this.zzk = i2;
        this.zzn = zzwzVar;
        this.zzl = j;
    }

    private final void zzR(int i2) {
        zzaa();
        zzxj zzxjVar = this.zzA;
        boolean[] zArr = zzxjVar.zzd;
        if (zArr[i2]) {
            return;
        }
        zzv zzvVarZza = zzxjVar.zza.zza(i2).zza(0);
        this.zzg.zzh(new zzwc(1, zzas.zzf(zzvVarZza.zzo), zzvVarZza, 0, null, zzfj.zzp(this.zzK), -9223372036854775807L));
        zArr[i2] = true;
    }

    private final void zzS(int i2) {
        zzaa();
        if (this.zzM) {
            if ((!this.zzy || this.zzA.zzb[i2]) && !this.zzu[i2].zzl(false)) {
                this.zzL = 0L;
                this.zzM = false;
                this.zzG = true;
                this.zzK = 0L;
                this.zzN = 0;
                for (zzxv zzxvVar : this.zzu) {
                    zzxvVar.zzb(false);
                }
                zzwd zzwdVar = this.zzs;
                zzwdVar.getClass();
                zzwdVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzG || zzZ();
    }

    private final zzaga zzU(zzxi zzxiVar) {
        int length = this.zzu.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zzxiVar.equals(this.zzv[i2])) {
                return this.zzu[i2];
            }
        }
        if (this.zzw) {
            int i3 = zzxiVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i3);
            sb.append(") after finishing tracks.");
            zzee.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzael();
        }
        zzxv zzxvVar = new zzxv(this.zzj, this.zzf, this.zzh);
        zzxvVar.zzt(this);
        int i4 = length + 1;
        zzxi[] zzxiVarArr = (zzxi[]) Arrays.copyOf(this.zzv, i4);
        zzxiVarArr[length] = zzxiVar;
        String str = zzfj.zza;
        this.zzv = zzxiVarArr;
        zzxv[] zzxvVarArr = (zzxv[]) Arrays.copyOf(this.zzu, i4);
        zzxvVarArr[length] = zzxvVar;
        this.zzu = zzxvVarArr;
        return zzxvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i2;
        if (this.zzP || this.zzx || !this.zzw || this.zzB == null) {
            return;
        }
        for (zzxv zzxvVar : this.zzu) {
            if (zzxvVar.zzi() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzu.length;
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzv zzvVarZzi = this.zzu[i3].zzi();
            zzvVarZzi.getClass();
            String str = zzvVarZzi.zzo;
            boolean zZza = zzas.zza(str);
            boolean z2 = zZza || zzas.zzb(str);
            zArr[i3] = z2;
            this.zzy = z2 | this.zzy;
            this.zzz = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzahv zzahvVar = this.zzt;
            if (zzahvVar != null) {
                if (zZza || this.zzv[i3].zzb) {
                    zzap zzapVar = zzvVarZzi.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzahvVar) : zzapVar.zzg(zzahvVar);
                    zzt zztVarZza = zzvVarZzi.zza();
                    zztVarZza.zzk(zzapVar2);
                    zzvVarZzi = zztVarZza.zzM();
                }
                if (zZza && zzvVarZzi.zzh == -1 && zzvVarZzi.zzi == -1 && (i2 = zzahvVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzi.zza();
                    zztVarZza2.zzh(i2);
                    zzvVarZzi = zztVarZza2.zzM();
                }
            }
            zzv zzvVarZzb = zzvVarZzi.zzb(this.zzf.zzb(zzvVarZzi));
            zzbgVarArr[i3] = new zzbg(Integer.toString(i3), zzvVarZzb);
            this.zzH = zzvVarZzb.zzu | this.zzH;
        }
        this.zzA = new zzxj(new zzyh(zzbgVarArr), zArr);
        if (this.zzz && this.zzC == -9223372036854775807L) {
            this.zzC = this.zzl;
            this.zzB = new zzxa(this, this.zzB);
        }
        this.zzi.zzb(this.zzC, this.zzB, this.zzD);
        this.zzx = true;
        zzwd zzwdVar = this.zzs;
        zzwdVar.getClass();
        zzwdVar.zzp(this);
    }

    private final void zzW() {
        zzxb zzxbVar = new zzxb(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzx) {
            zzgqa.zzi(zzZ());
            long j = this.zzC;
            if (j != -9223372036854775807L && this.zzL > j) {
                this.zzO = true;
                this.zzL = -9223372036854775807L;
                return;
            }
            zzafr zzafrVar = this.zzB;
            zzafrVar.getClass();
            zzxbVar.zzd(zzafrVar.zzc(this.zzL).zza.zzc, this.zzL);
            for (zzxv zzxvVar : this.zzu) {
                zzxvVar.zzc(this.zzL);
            }
            this.zzL = -9223372036854775807L;
        }
        this.zzN = zzX();
        this.zzm.zzd(zzxbVar, this, zzaaq.zza(this.zzE));
    }

    private final int zzX() {
        int iZzd = 0;
        for (zzxv zzxvVar : this.zzu) {
            iZzd += zzxvVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzY(boolean z2) {
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzxv[] zzxvVarArr = this.zzu;
            if (i2 >= zzxvVarArr.length) {
                return jMax;
            }
            if (z2) {
                jMax = Math.max(jMax, zzxvVarArr[i2].zzj());
            } else {
                zzxj zzxjVar = this.zzA;
                zzxjVar.getClass();
                if (zzxjVar.zzc[i2]) {
                    jMax = Math.max(jMax, zzxvVarArr[i2].zzj());
                }
            }
            i2++;
        }
    }

    private final boolean zzZ() {
        return this.zzL != -9223372036854775807L;
    }

    @EnsuresNonNull
    private final void zzaa() {
        zzgqa.zzi(this.zzx);
        this.zzA.getClass();
        this.zzB.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ void zzA(zzaav zzaavVar, long j, long j2, boolean z2) {
        zzxb zzxbVar = (zzxb) zzaavVar;
        zzhy zzhyVarZzf = zzxbVar.zzf();
        zzvx zzvxVar = new zzvx(zzxbVar.zze(), zzxbVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j, j2, zzhyVarZzf.zzf());
        zzxbVar.zze();
        this.zzg.zzf(zzvxVar, new zzwc(1, -1, null, 0, null, zzfj.zzp(zzxbVar.zzg()), zzfj.zzp(this.zzC)));
        if (z2) {
            return;
        }
        for (zzxv zzxvVar : this.zzu) {
            zzxvVar.zzb(false);
        }
        if (this.zzI > 0) {
            zzwd zzwdVar = this.zzs;
            zzwdVar.getClass();
            zzwdVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ void zzB(zzaav zzaavVar, long j, long j2) {
        zzxb zzxbVar = (zzxb) zzaavVar;
        if (this.zzC == -9223372036854775807L && this.zzB != null) {
            long jZzY = zzY(true);
            long j3 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzC = j3;
            this.zzi.zzb(j3, this.zzB, this.zzD);
        }
        zzhy zzhyVarZzf = zzxbVar.zzf();
        zzvx zzvxVar = new zzvx(zzxbVar.zze(), zzxbVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j, j2, zzhyVarZzf.zzf());
        zzxbVar.zze();
        this.zzg.zze(zzvxVar, new zzwc(1, -1, null, 0, null, zzfj.zzp(zzxbVar.zzg()), zzfj.zzp(this.zzC)));
        this.zzO = true;
        zzwd zzwdVar = this.zzs;
        zzwdVar.getClass();
        zzwdVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ void zzC(zzaav zzaavVar, long j, long j2, int i2) {
        zzvx zzvxVar;
        zzxb zzxbVar = (zzxb) zzaavVar;
        zzhy zzhyVarZzf = zzxbVar.zzf();
        if (i2 == 0) {
            long jZze = zzxbVar.zze();
            zzhf zzhfVarZzh = zzxbVar.zzh();
            zzvxVar = new zzvx(jZze, zzhfVarZzh, zzhfVarZzh.zza, Collections.EMPTY_MAP, j, 0L, 0L);
        } else {
            zzvxVar = new zzvx(zzxbVar.zze(), zzxbVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j, j2, zzhyVarZzf.zzf());
        }
        this.zzg.zzd(zzvxVar, new zzwc(1, -1, null, 0, null, zzfj.zzp(zzxbVar.zzg()), zzfj.zzp(this.zzC)), i2);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzP) {
            return;
        }
        zzwd zzwdVar = this.zzs;
        zzwdVar.getClass();
        zzwdVar.zzs(this);
    }

    public final /* synthetic */ void zzF(zzafr zzafrVar) {
        this.zzB = this.zzt == null ? zzafrVar : new zzafq(-9223372036854775807L, 0L);
        this.zzC = zzafrVar.zza();
        boolean z2 = false;
        if (!this.zzJ && zzafrVar.zza() == -9223372036854775807L) {
            z2 = true;
        }
        this.zzD = z2;
        this.zzE = true == z2 ? 7 : 1;
        if (this.zzx) {
            this.zzi.zzb(this.zzC, zzafrVar, z2);
        } else {
            zzD();
        }
    }

    public final /* synthetic */ void zzG() {
        this.zzJ = true;
    }

    public final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    public final /* synthetic */ long zzI(boolean z2) {
        return zzY(true);
    }

    public final /* synthetic */ long zzL() {
        return this.zzk;
    }

    public final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    public final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    public final /* synthetic */ zzahv zzO() {
        return this.zzt;
    }

    public final /* synthetic */ void zzP(zzahv zzahvVar) {
        this.zzt = zzahvVar;
    }

    public final /* synthetic */ long zzQ() {
        return this.zzC;
    }

    public final void zza() {
        if (this.zzx) {
            for (zzxv zzxvVar : this.zzu) {
                zzxvVar.zze();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzb(zzwd zzwdVar, long j) {
        this.zzs = zzwdVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzc() throws IOException {
        zzr();
        if (this.zzO && !this.zzx) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final zzyh zzd() {
        zzaa();
        return this.zzA.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zze(zzzw[] zzzwVarArr, boolean[] zArr, zzxw[] zzxwVarArr, boolean[] zArr2, long j) {
        zzzw zzzwVar;
        zzaa();
        zzxj zzxjVar = this.zzA;
        zzyh zzyhVar = zzxjVar.zza;
        boolean[] zArr3 = zzxjVar.zzc;
        int i2 = this.zzI;
        int i3 = 0;
        for (int i4 = 0; i4 < zzzwVarArr.length; i4++) {
            zzxw zzxwVar = zzxwVarArr[i4];
            if (zzxwVar != null && (zzzwVarArr[i4] == null || !zArr[i4])) {
                int iZza = ((zzxh) zzxwVar).zza();
                zzgqa.zzi(zArr3[iZza]);
                this.zzI--;
                zArr3[iZza] = false;
                zzxwVarArr[i4] = null;
            }
        }
        boolean z2 = !this.zzF ? j == 0 || this.zzz : i2 != 0;
        for (int i5 = 0; i5 < zzzwVarArr.length; i5++) {
            if (zzxwVarArr[i5] == null && (zzzwVar = zzzwVarArr[i5]) != null) {
                zzgqa.zzi(zzzwVar.zze() == 1);
                zzgqa.zzi(zzzwVar.zzf(0) == 0);
                int iZzb = zzyhVar.zzb(zzzwVar.zza());
                zzgqa.zzi(!zArr3[iZzb]);
                this.zzI++;
                zArr3[iZzb] = true;
                this.zzH = zzzwVar.zzc().zzu | this.zzH;
                zzxwVarArr[i5] = new zzxh(this, iZzb);
                zArr2[i5] = true;
                if (!z2) {
                    zzxv zzxvVar = this.zzu[iZzb];
                    z2 = (zzxvVar.zzh() == 0 || zzxvVar.zzo(j, true)) ? false : true;
                }
            }
        }
        if (this.zzI == 0) {
            this.zzM = false;
            this.zzG = false;
            this.zzH = false;
            zzaaz zzaazVar = this.zzm;
            if (zzaazVar.zze()) {
                zzxv[] zzxvVarArr = this.zzu;
                int length = zzxvVarArr.length;
                while (i3 < length) {
                    zzxvVarArr[i3].zzs();
                    i3++;
                }
                zzaazVar.zzf();
            } else {
                this.zzO = false;
                for (zzxv zzxvVar2 : this.zzu) {
                    zzxvVar2.zzb(false);
                }
            }
        } else if (z2) {
            j = zzj(j);
            while (i3 < zzxwVarArr.length) {
                if (zzxwVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzF = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzf(long j, boolean z2) {
        if (this.zzz) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzA.zzc;
        int length = this.zzu.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.zzu[i2].zzr(j, false, zArr[i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final void zzg(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzh() {
        if (this.zzH) {
            this.zzH = false;
        } else {
            if (!this.zzG) {
                return -9223372036854775807L;
            }
            if (!this.zzO && zzX() <= this.zzN) {
                return -9223372036854775807L;
            }
            this.zzG = false;
        }
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzO || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzL;
        }
        if (this.zzy) {
            int length = this.zzu.length;
            jZzY = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                zzxj zzxjVar = this.zzA;
                if (zzxjVar.zzb[i2] && zzxjVar.zzc[i2] && !this.zzu[i2].zzk()) {
                    jZzY = Math.min(jZzY, this.zzu[i2].zzj());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzK : jZzY;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e A[LOOP:1: B:36:0x007c->B:37:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093 A[LOOP:2: B:41:0x0091->B:42:0x0093, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0079, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x008a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzj(long j) {
        zzaaz zzaazVar;
        int i2;
        zzaa();
        boolean[] zArr = this.zzA.zzb;
        if (true != this.zzB.zzb()) {
            j = 0;
        }
        this.zzG = false;
        long j2 = this.zzK;
        this.zzK = j;
        if (zzZ()) {
            this.zzL = j;
            return j;
        }
        if (this.zzE == 7 || !(this.zzO || this.zzm.zze())) {
            this.zzM = false;
            this.zzL = j;
            this.zzO = false;
            this.zzH = false;
            zzaazVar = this.zzm;
            if (zzaazVar.zze()) {
                zzaazVar.zzc();
                for (zzxv zzxvVar : this.zzu) {
                    zzxvVar.zzb(false);
                }
                break;
            }
            for (zzxv zzxvVar2 : this.zzu) {
                zzxvVar2.zzs();
            }
            zzaazVar.zzf();
            return j;
        }
        int length = this.zzu.length;
        for (int i3 = 0; i3 < length; i3++) {
            zzxv zzxvVar3 = this.zzu[i3];
            if (zzxvVar3.zzh() != 0 || j2 != j) {
                if (!(this.zzz ? zzxvVar3.zzn(zzxvVar3.zzg()) : zzxvVar3.zzo(j, this.zzO)) && (zArr[i3] || !this.zzy)) {
                    this.zzM = false;
                    this.zzL = j;
                    this.zzO = false;
                    this.zzH = false;
                    zzaazVar = this.zzm;
                    if (zzaazVar.zze()) {
                        zzaazVar.zzc();
                        while (i2 < r2) {
                            zzxvVar.zzb(false);
                        }
                        break;
                        break;
                    }
                    while (i < r3) {
                        zzxvVar2.zzs();
                    }
                    zzaazVar.zzf();
                    return j;
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x00db A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzk(long j, zzmq zzmqVar) {
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        zzaa();
        if (!this.zzB.zzb()) {
            return 0L;
        }
        zzafp zzafpVarZzc = this.zzB.zzc(j);
        zzafs zzafsVar = zzafpVarZzc.zza;
        zzafs zzafsVar2 = zzafpVarZzc.zzb;
        long j4 = zzmqVar.zzd;
        if (j4 == 0) {
            if (zzmqVar.zze == 0) {
                return j;
            }
            j4 = 0;
        }
        String str = zzfj.zza;
        long j5 = j - j4;
        long j6 = Long.MAX_VALUE;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j5) > 0L ? 1 : ((j ^ j5) == 0L ? 0 : -1)) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j8 = Long.MIN_VALUE;
        if (j7 != Long.MIN_VALUE) {
            if (j7 == Long.MAX_VALUE) {
                if (j5 != Long.MAX_VALUE) {
                    j7 = Long.MIN_VALUE;
                } else {
                    j7 = Long.MAX_VALUE;
                }
            }
        } else if (j5 == Long.MIN_VALUE) {
            j5 = Long.MIN_VALUE;
            if (j7 == Long.MAX_VALUE) {
                if (j5 != Long.MAX_VALUE) {
                    j7 = Long.MIN_VALUE;
                } else {
                    j7 = Long.MAX_VALUE;
                }
            }
        } else {
            j7 = Long.MIN_VALUE;
        }
        long j9 = zzmqVar.zze;
        long j10 = j + j9;
        long j11 = (((j ^ j10) > 0L ? 1 : ((j ^ j10) == 0L ? 0 : -1)) >= 0) | (((j9 ^ j) > 0L ? 1 : ((j9 ^ j) == 0L ? 0 : -1)) < 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
        if (j11 == Long.MIN_VALUE) {
            if (j10 == Long.MIN_VALUE) {
            }
            j2 = zzafsVar.zzb;
            if (j7 <= j2 || j2 > j6) {
                z2 = false;
            } else {
                z2 = true;
            }
            j3 = zzafsVar2.zzb;
            z3 = j7 > j3 && j3 <= j6;
            if (!z2 && z3) {
                if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                    return j2;
                }
                return j3;
            }
            if (!z2) {
                if (z3) {
                    return j3;
                }
                return j7;
            }
            return j2;
        }
        j8 = j10;
        if (j11 == Long.MAX_VALUE) {
            int i2 = (j8 > Long.MAX_VALUE ? 1 : (j8 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j6 = j11;
        }
        j2 = zzafsVar.zzb;
        if (j7 <= j2) {
            z2 = false;
        } else {
            z2 = false;
        }
        j3 = zzafsVar2.zzb;
        if (j7 > j3) {
        }
        if (!z2) {
        }
        if (!z2) {
            if (z3) {
                return j3;
            }
            return j7;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzm(zzli zzliVar) {
        if (this.zzO) {
            return false;
        }
        zzaaz zzaazVar = this.zzm;
        if (zzaazVar.zzb() || this.zzM) {
            return false;
        }
        if (this.zzx && this.zzI == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzaazVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzn() {
        return this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzo() {
        for (zzxv zzxvVar : this.zzu) {
            zzxvVar.zza();
        }
        this.zzn.zzb();
    }

    public final boolean zzp(int i2) {
        return !zzT() && this.zzu[i2].zzl(this.zzO);
    }

    public final void zzq(int i2) throws IOException {
        this.zzu[i2].zzf();
        zzr();
    }

    public final void zzr() throws IOException {
        this.zzm.zzh(zzaaq.zza(this.zzE));
    }

    public final int zzs(int i2, zzle zzleVar, zzih zzihVar, int i3) {
        if (zzT()) {
            return -3;
        }
        zzR(i2);
        int iZzm = this.zzu[i2].zzm(zzleVar, zzihVar, i3, this.zzO);
        if (iZzm == -3) {
            zzS(i2);
        }
        return iZzm;
    }

    public final int zzt(int i2, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i2);
        zzxv zzxvVar = this.zzu[i2];
        int iZzp = zzxvVar.zzp(j, this.zzO);
        zzxvVar.zzq(iZzp);
        if (iZzp != 0) {
            return iZzp;
        }
        zzS(i2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final zzaga zzu(int i2, int i3) {
        return zzU(new zzxi(i2, false));
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzv() {
        this.zzw = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzw(final zzafr zzafrVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzafrVar);
            }
        });
    }

    public final zzaga zzx() {
        return zzU(new zzxi(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzxu
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ zzaat zzz(zzaav zzaavVar, long j, long j2, IOException iOException, int i2) {
        long jMin;
        zzaat zzaatVarZza;
        zzafr zzafrVar;
        zzxb zzxbVar = (zzxb) zzaavVar;
        zzhy zzhyVarZzf = zzxbVar.zzf();
        zzvx zzvxVar = new zzvx(zzxbVar.zze(), zzxbVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j, j2, zzhyVarZzf.zzf());
        zzxbVar.zzg();
        String str = zzfj.zza;
        if ((iOException instanceof zzat) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzhp) || (iOException instanceof zzaay)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i2 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof zzhc) && ((zzhc) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzaatVarZza = zzaaz.zzb;
        } else {
            int iZzX = zzX();
            boolean z2 = iZzX > this.zzN;
            if (this.zzJ || !((zzafrVar = this.zzB) == null || zzafrVar.zza() == -9223372036854775807L)) {
                this.zzN = iZzX;
            } else {
                boolean z3 = this.zzx;
                if (!z3 || zzT()) {
                    this.zzG = z3;
                    this.zzK = 0L;
                    this.zzN = 0;
                    for (zzxv zzxvVar : this.zzu) {
                        zzxvVar.zzb(false);
                    }
                    zzxbVar.zzd(0L, 0L);
                } else {
                    this.zzM = true;
                    zzaatVarZza = zzaaz.zza;
                }
            }
            zzaatVarZza = zzaaz.zza(z2, jMin);
        }
        boolean zZza = zzaatVarZza.zza();
        this.zzg.zzg(zzvxVar, new zzwc(1, -1, null, 0, null, zzfj.zzp(zzxbVar.zzg()), zzfj.zzp(this.zzC)), iOException, true ^ zZza);
        if (!zZza) {
            zzxbVar.zze();
        }
        return zzaatVarZza;
    }
}
