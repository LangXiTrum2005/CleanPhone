package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.core.view.PointerIconCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
final class zzjp extends zzg implements zzim {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private zzlp zzB;
    private zzil zzC;
    private zzbg zzD;
    private zzav zzE;

    @Nullable
    private Object zzF;

    @Nullable
    private Surface zzG;
    private int zzH;
    private zzdz zzI;
    private int zzJ;
    private zze zzK;
    private float zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private zzav zzQ;
    private zzlb zzR;
    private int zzS;
    private long zzT;
    private final zzix zzU;
    private zzwb zzV;
    final zzyc zzb;
    final zzbg zzc;
    private final zzda zze;
    private final Context zzf;
    private final zzbk zzg;
    private final zzlj[] zzh;
    private final zzyb zzi;
    private final zzdh zzj;
    private final zzkc zzk;
    private final zzdn zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzbo zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzlt zzq;
    private final Looper zzr;
    private final zzyj zzs;
    private final zzcx zzt;
    private final zzjl zzu;
    private final zzjm zzv;
    private final zzhq zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzas.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzjp(zzik zzikVar, @Nullable zzbk zzbkVar) {
        zzog zzogVar;
        zzda zzdaVar = new zzda(zzcx.zza);
        this.zze = zzdaVar;
        try {
            zzdo.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + zzei.zze + "]");
            Context applicationContext = zzikVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            zzlt zzltVar = (zzlt) zzikVar.zzh.apply(zzikVar.zzb);
            this.zzq = zzltVar;
            this.zzP = zzikVar.zzj;
            this.zzK = zzikVar.zzk;
            this.zzH = zzikVar.zzl;
            this.zzM = false;
            this.zzx = zzikVar.zzp;
            zzjo zzjoVar = null;
            zzjl zzjlVar = new zzjl(this, zzjoVar);
            this.zzu = zzjlVar;
            zzjm zzjmVar = new zzjm(zzjoVar);
            this.zzv = zzjmVar;
            Handler handler = new Handler(zzikVar.zzi);
            zzlj[] zzljVarArrZza = ((zzid) zzikVar.zzc).zza.zza(handler, zzjlVar, zzjlVar, zzjlVar, zzjlVar);
            this.zzh = zzljVarArrZza;
            int length = zzljVarArrZza.length;
            zzyb zzybVar = (zzyb) zzikVar.zze.zza();
            this.zzi = zzybVar;
            zzik.zza(((zzie) zzikVar.zzd).zza);
            zzyn zzynVarZzh = zzyn.zzh(((zzih) zzikVar.zzg).zza);
            this.zzs = zzynVarZzh;
            this.zzp = zzikVar.zzm;
            this.zzB = zzikVar.zzn;
            Looper looper = zzikVar.zzi;
            this.zzr = looper;
            zzcx zzcxVar = zzikVar.zzb;
            this.zzt = zzcxVar;
            this.zzg = zzbkVar;
            zzdn zzdnVar = new zzdn(looper, zzcxVar, new zzdl(this) { // from class: com.google.android.gms.internal.ads.zziw
                @Override // com.google.android.gms.internal.ads.zzdl
                public final void zza(Object obj, zzx zzxVar) {
                }
            });
            this.zzl = zzdnVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzV = new zzwb(0);
            this.zzC = zzil.zza;
            int length2 = zzljVarArrZza.length;
            zzyc zzycVar = new zzyc(new zzln[2], new zzxv[2], zzby.zza, null);
            this.zzb = zzycVar;
            this.zzn = new zzbo();
            zzbf zzbfVar = new zzbf();
            zzbfVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzybVar.zzn();
            zzbfVar.zzd(29, true);
            zzbfVar.zzd(23, false);
            zzbfVar.zzd(25, false);
            zzbfVar.zzd(33, false);
            zzbfVar.zzd(26, false);
            zzbfVar.zzd(34, false);
            zzbg zzbgVarZze = zzbfVar.zze();
            this.zzc = zzbgVarZze;
            zzbf zzbfVar2 = new zzbf();
            zzbfVar2.zzb(zzbgVarZze);
            zzbfVar2.zza(4);
            zzbfVar2.zza(10);
            this.zzD = zzbfVar2.zze();
            this.zzj = zzcxVar.zzd(looper, null);
            zzix zzixVar = new zzix(this);
            this.zzU = zzixVar;
            this.zzR = zzlb.zzg(zzycVar);
            zzltVar.zzS(zzbkVar, looper);
            if (zzei.zza < 31) {
                zzogVar = new zzog(zzikVar.zzs);
            } else {
                boolean z = zzikVar.zzq;
                String str = zzikVar.zzs;
                zzoc zzocVarZzb = zzoc.zzb(applicationContext);
                if (zzocVarZzb == null) {
                    zzdo.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    zzogVar = new zzog(LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z) {
                        zzy(zzocVarZzb);
                    }
                    zzogVar = new zzog(zzocVarZzb.zza(), str);
                }
            }
            this.zzk = new zzkc(zzljVarArrZza, zzybVar, zzycVar, (zzkg) zzikVar.zzf.zza(), zzynVarZzh, 0, false, zzltVar, this.zzB, zzikVar.zzt, zzikVar.zzo, false, false, looper, zzcxVar, zzixVar, zzogVar, null, this.zzC);
            this.zzL = 1.0f;
            zzav zzavVar = zzav.zza;
            this.zzE = zzavVar;
            this.zzQ = zzavVar;
            this.zzS = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.zzJ = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i = zzcp.zza;
            this.zzN = true;
            zzltVar.getClass();
            zzdnVar.zzb(zzltVar);
            zzynVarZzh.zzf(new Handler(looper), zzltVar);
            copyOnWriteArraySet.add(zzjlVar);
            new zzhl(zzikVar.zza, handler, zzjlVar);
            this.zzw = new zzhq(zzikVar.zza, handler, zzjlVar);
            zzikVar.zza.getApplicationContext();
            zzikVar.zza.getApplicationContext();
            new zzo(0).zza();
            zzcd zzcdVar = zzcd.zza;
            this.zzI = zzdz.zza;
            zzybVar.zzk(this.zzK);
            zzaa(1, 10, Integer.valueOf(this.zzJ));
            zzaa(2, 10, Integer.valueOf(this.zzJ));
            zzaa(1, 3, this.zzK);
            zzaa(2, 4, Integer.valueOf(this.zzH));
            zzaa(2, 5, 0);
            zzaa(1, 9, Boolean.valueOf(this.zzM));
            zzaa(2, 7, zzjmVar);
            zzaa(6, 8, zzjmVar);
            zzaa(-1, 16, Integer.valueOf(this.zzP));
            zzdaVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzK(zzjp zzjpVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjpVar.zzac(surface);
        zzjpVar.zzG = surface;
    }

    private final int zzR(zzlb zzlbVar) {
        return zzlbVar.zza.zzo() ? this.zzS : zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn).zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzS(int i) {
        return i == -1 ? 2 : 1;
    }

    private final long zzT(zzlb zzlbVar) {
        if (!zzlbVar.zzb.zzb()) {
            return zzei.zzv(zzU(zzlbVar));
        }
        zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn);
        long j = zzlbVar.zzc;
        if (j != C.TIME_UNSET) {
            return zzei.zzv(j) + zzei.zzv(0L);
        }
        long j2 = zzlbVar.zza.zze(zzR(zzlbVar), this.zza, 0L).zzl;
        return zzei.zzv(0L);
    }

    private final long zzU(zzlb zzlbVar) {
        if (zzlbVar.zza.zzo()) {
            return zzei.zzs(this.zzT);
        }
        long j = zzlbVar.zzs;
        if (zzlbVar.zzb.zzb()) {
            return j;
        }
        zzW(zzlbVar.zza, zzlbVar.zzb, j);
        return j;
    }

    private static long zzV(zzlb zzlbVar) {
        zzbp zzbpVar = new zzbp();
        zzbo zzboVar = new zzbo();
        zzlbVar.zza.zzn(zzlbVar.zzb.zza, zzboVar);
        long j = zzlbVar.zzc;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j2 = zzlbVar.zza.zze(zzboVar.zzc, zzbpVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(zzbq zzbqVar, zzug zzugVar, long j) {
        zzbqVar.zzn(zzugVar.zza, this.zzn);
        return j;
    }

    @Nullable
    private final Pair zzX(zzbq zzbqVar, int i, long j) {
        if (zzbqVar.zzo()) {
            this.zzS = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.zzT = j;
            return null;
        }
        if (i == -1 || i >= zzbqVar.zzc()) {
            i = zzbqVar.zzg(false);
            long j2 = zzbqVar.zze(i, this.zza, 0L).zzl;
            j = zzei.zzv(0L);
        }
        return zzbqVar.zzl(this.zza, this.zzn, i, zzei.zzs(j));
    }

    private final zzlb zzY(zzlb zzlbVar, zzbq zzbqVar, @Nullable Pair pair) {
        zzcw.zzd(zzbqVar.zzo() || pair != null);
        zzbq zzbqVar2 = zzlbVar.zza;
        long jZzT = zzT(zzlbVar);
        zzlb zzlbVarZzf = zzlbVar.zzf(zzbqVar);
        if (zzbqVar.zzo()) {
            zzug zzugVarZzh = zzlb.zzh();
            long jZzs = zzei.zzs(this.zzT);
            zzlb zzlbVarZza = zzlbVarZzf.zzb(zzugVarZzh, jZzs, jZzs, jZzs, 0L, zzwj.zza, this.zzb, zzfxn.zzn()).zza(zzugVarZzh);
            zzlbVarZza.zzq = zzlbVarZza.zzs;
            return zzlbVarZza;
        }
        Object obj = zzlbVarZzf.zzb.zza;
        int i = zzei.zza;
        boolean z = !obj.equals(pair.first);
        zzug zzugVar = z ? new zzug(pair.first, -1L) : zzlbVarZzf.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzei.zzs(jZzT);
        if (!zzbqVar2.zzo()) {
            zzbqVar2.zzn(obj, this.zzn);
        }
        if (z || jLongValue < jZzs2) {
            zzcw.zzf(!zzugVar.zzb());
            zzlb zzlbVarZza2 = zzlbVarZzf.zzb(zzugVar, jLongValue, jLongValue, jLongValue, 0L, z ? zzwj.zza : zzlbVarZzf.zzh, z ? this.zzb : zzlbVarZzf.zzi, z ? zzfxn.zzn() : zzlbVarZzf.zzj).zza(zzugVar);
            zzlbVarZza2.zzq = jLongValue;
            return zzlbVarZza2;
        }
        if (jLongValue != jZzs2) {
            zzcw.zzf(!zzugVar.zzb());
            long jMax = Math.max(0L, zzlbVarZzf.zzr - (jLongValue - jZzs2));
            long j = zzlbVarZzf.zzq;
            if (zzlbVarZzf.zzk.equals(zzlbVarZzf.zzb)) {
                j = jLongValue + jMax;
            }
            zzlb zzlbVarZzb = zzlbVarZzf.zzb(zzugVar, jLongValue, jLongValue, jLongValue, jMax, zzlbVarZzf.zzh, zzlbVarZzf.zzi, zzlbVarZzf.zzj);
            zzlbVarZzb.zzq = j;
            return zzlbVarZzb;
        }
        int iZza = zzbqVar.zza(zzlbVarZzf.zzk.zza);
        if (iZza != -1 && zzbqVar.zzd(iZza, this.zzn, false).zzc == zzbqVar.zzn(zzugVar.zza, this.zzn).zzc) {
            return zzlbVarZzf;
        }
        zzbqVar.zzn(zzugVar.zza, this.zzn);
        long jZzf = zzugVar.zzb() ? this.zzn.zzf(zzugVar.zzb, zzugVar.zzc) : this.zzn.zzd;
        zzlb zzlbVarZza3 = zzlbVarZzf.zzb(zzugVar, zzlbVarZzf.zzs, zzlbVarZzf.zzs, zzlbVarZzf.zzd, jZzf - zzlbVarZzf.zzs, zzlbVarZzf.zzh, zzlbVarZzf.zzi, zzlbVarZzf.zzj).zza(zzugVar);
        zzlbVarZza3.zzq = jZzf;
        return zzlbVarZza3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzZ(final int i, final int i2) {
        if (i == this.zzI.zzb() && i2 == this.zzI.zza()) {
            return;
        }
        this.zzI = new zzdz(i, i2);
        zzdn zzdnVar = this.zzl;
        zzdnVar.zzd(24, new zzdk() { // from class: com.google.android.gms.internal.ads.zzit
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(Object obj) {
                int i3 = zzjp.zzd;
                ((zzbh) obj).zzo(i, i2);
            }
        });
        zzdnVar.zzc();
        zzaa(2, 14, new zzdz(i, i2));
    }

    private final void zzaa(int i, int i2, @Nullable Object obj) {
        zzlj[] zzljVarArr = this.zzh;
        int length = zzljVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzlj zzljVar = zzljVarArr[i3];
            if (i == -1 || zzljVar.zzb() == i) {
                int iZzR = zzR(this.zzR);
                zzkc zzkcVar = this.zzk;
                zzlf zzlfVar = new zzlf(zzkcVar, zzljVar, this.zzR.zza, iZzR == -1 ? 0 : iZzR, this.zzt, zzkcVar.zzc());
                zzlfVar.zzf(i2);
                zzlfVar.zze(obj);
                zzlfVar.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzaa(1, 2, Float.valueOf(this.zzL * this.zzw.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(@Nullable Object obj) {
        Object obj2 = this.zzF;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zZzq = this.zzk.zzq(obj, z ? this.zzx : C.TIME_UNSET);
        if (z) {
            Object obj3 = this.zzF;
            Surface surface = this.zzG;
            if (obj3 == surface) {
                surface.release();
                this.zzG = null;
            }
        }
        this.zzF = obj;
        if (zZzq) {
            return;
        }
        zzad(zzib.zzd(new zzkd(3), PointerIconCompat.TYPE_HELP));
    }

    private final void zzad(@Nullable zzib zzibVar) {
        zzlb zzlbVar = this.zzR;
        zzlb zzlbVarZza = zzlbVar.zza(zzlbVar.zzb);
        zzlbVarZza.zzq = zzlbVarZza.zzs;
        zzlbVarZza.zzr = 0L;
        zzlb zzlbVarZze = zzlbVarZza.zze(1);
        if (zzibVar != null) {
            zzlbVarZze = zzlbVarZze.zzd(zzibVar);
        }
        this.zzy++;
        this.zzk.zzo();
        zzaf(zzlbVarZze, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        int i3 = i == 0 ? 1 : 0;
        zzlb zzlbVar = this.zzR;
        if (zzlbVar.zzl == z2 && zzlbVar.zzn == i3 && zzlbVar.zzm == i2) {
            return;
        }
        this.zzy++;
        zzlb zzlbVarZzc = zzlbVar.zzc(z2, i2, i3);
        this.zzk.zzn(z2, i2, i3);
        zzaf(zzlbVarZzc, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:101:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:105:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x030e  */
    /* JADX WARN: Code duplicated, block: B:114:0x031e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0332  */
    /* JADX WARN: Code duplicated, block: B:118:0x0342  */
    /* JADX WARN: Code duplicated, block: B:121:0x0351  */
    /* JADX WARN: Code duplicated, block: B:124:0x035f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0372  */
    /* JADX WARN: Code duplicated, block: B:132:0x0383  */
    /* JADX WARN: Code duplicated, block: B:135:0x0398  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:151:0x0405  */
    /* JADX WARN: Code duplicated, block: B:154:0x0411  */
    /* JADX WARN: Code duplicated, block: B:155:0x0413  */
    /* JADX WARN: Code duplicated, block: B:157:0x0423  */
    /* JADX WARN: Code duplicated, block: B:160:0x042e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0440  */
    /* JADX WARN: Code duplicated, block: B:164:0x0444  */
    /* JADX WARN: Code duplicated, block: B:167:0x0451  */
    /* JADX WARN: Code duplicated, block: B:170:0x0461  */
    /* JADX WARN: Code duplicated, block: B:173:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x047d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0488  */
    /* JADX WARN: Code duplicated, block: B:184:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0496  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:213:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:215:0x04da  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b A[LOOP:1: B:50:0x0135->B:52:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x015b  */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:61:0x018b  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0194  */
    /* JADX WARN: Code duplicated, block: B:66:0x0196  */
    /* JADX WARN: Code duplicated, block: B:69:0x019b  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x0207  */
    /* JADX WARN: Code duplicated, block: B:84:0x020f  */
    /* JADX WARN: Code duplicated, block: B:85:0x021e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0225  */
    /* JADX WARN: Code duplicated, block: B:89:0x022d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0230  */
    /* JADX WARN: Code duplicated, block: B:92:0x0238  */
    /* JADX WARN: Code duplicated, block: B:93:0x023f  */
    /* JADX WARN: Code duplicated, block: B:96:0x026b  */
    /* JADX WARN: Code duplicated, block: B:97:0x029e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    private final void zzaf(final zzlb zzlbVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        boolean z3;
        boolean z4;
        Pair pair;
        boolean z5;
        int i5;
        boolean zBooleanValue;
        final int iIntValue;
        final zzar zzarVar;
        zzat zzatVarZza;
        List list;
        int i6;
        zzay zzayVar;
        int i7;
        zzbq zzbqVarZzn;
        zzav zzavVarZzu;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        zzyc zzycVar;
        zzyc zzycVar2;
        zzbg zzbgVar;
        zzg zzgVar;
        zzbq zzbqVarZzn2;
        boolean z10;
        zzbq zzbqVarZzn3;
        boolean z11;
        int i8;
        boolean z12;
        ?? r14;
        zzbq zzbqVarZzn4;
        int iZzd;
        boolean z13;
        zzbq zzbqVarZzn5;
        long j2;
        zzbq zzbqVarZzn6;
        boolean z14;
        boolean zZzo;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i9;
        boolean z20;
        int i10;
        boolean z21;
        zzbg zzbgVarZze;
        zzbo zzboVar;
        int i11;
        Object obj;
        zzar zzarVar2;
        Object obj2;
        int i12;
        long jZzV;
        long jZzV2;
        int iZzd2;
        Object obj3;
        zzar zzarVar3;
        Object obj4;
        int iZza;
        long jZzv;
        long jZzv2;
        final int i13 = i2;
        zzlb zzlbVar2 = this.zzR;
        this.zzR = zzlbVar;
        boolean z22 = !zzlbVar2.zza.equals(zzlbVar.zza);
        zzbq zzbqVar = zzlbVar2.zza;
        zzbq zzbqVar2 = zzlbVar.zza;
        if (!zzbqVar2.zzo() || !zzbqVar.zzo()) {
            if (zzbqVar2.zzo() != zzbqVar.zzo()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (zzbqVar.zze(zzbqVar.zzn(zzlbVar2.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb.equals(zzbqVar2.zze(zzbqVar2.zzn(zzlbVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzb)) {
                if (!z) {
                    i4 = i13;
                    z3 = false;
                } else if (i13 != 0) {
                    i4 = i13;
                    z3 = true;
                } else if (zzlbVar2.zzb.zzd < zzlbVar.zzb.zzd) {
                    pair = new Pair(Boolean.TRUE, 0);
                    i13 = 0;
                    z4 = true;
                } else {
                    z3 = true;
                    i4 = 0;
                }
                z4 = z3;
                i13 = i4;
                pair = new Pair(Boolean.FALSE, -1);
            } else {
                if (z) {
                    if (i13 == 0) {
                        i13 = 0;
                        i5 = 1;
                        z4 = true;
                    } else {
                        z5 = true;
                        z4 = true;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
                } else {
                    z5 = false;
                    z4 = false;
                }
                if (z5 && i13 == 1) {
                    i5 = 2;
                } else {
                    if (!z22) {
                        throw new IllegalStateException();
                    }
                    z4 = z5;
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzlbVar.zza.zzo()) {
                    zzarVar = null;
                } else {
                    zzarVar = zzlbVar.zza.zze(zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzd;
                }
                this.zzQ = zzav.zza;
            } else {
                zzarVar = null;
            }
            if (zBooleanValue || !zzlbVar2.zzj.equals(zzlbVar.zzj)) {
                zzatVarZza = this.zzQ.zza();
                list = zzlbVar.zzj;
                for (i6 = 0; i6 < list.size(); i6++) {
                    zzayVar = (zzay) list.get(i6);
                    for (i7 = 0; i7 < zzayVar.zza(); i7++) {
                        zzayVar.zzb(i7).zza(zzatVarZza);
                    }
                }
                this.zzQ = zzatVarZza.zzu();
            }
            zzbqVarZzn = zzn();
            if (zzbqVarZzn.zzo()) {
                zzavVarZzu = this.zzQ;
            } else {
                zzar zzarVar4 = zzbqVarZzn.zze(zzd(), this.zza, 0L).zzd;
                zzat zzatVarZza2 = this.zzQ.zza();
                zzatVarZza2.zzb(zzarVar4.zzd);
                zzavVarZzu = zzatVarZza2.zzu();
            }
            z6 = !zzavVarZzu.equals(this.zzE);
            this.zzE = zzavVarZzu;
            if (zzlbVar2.zzl != zzlbVar.zzl) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (zzlbVar2.zze != zzlbVar.zze) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 || z7) {
                zzag();
            }
            if (zzlbVar2.zzg != zzlbVar.zzg) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z22) {
                this.zzl.zzd(0, new zzdk() { // from class: com.google.android.gms.internal.ads.zzin
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj5) {
                        int i14 = zzjp.zzd;
                        ((zzbh) obj5).zzp(zzlbVar.zza, i);
                    }
                });
            }
            if (z4) {
                zzboVar = new zzbo();
                if (zzlbVar2.zza.zzo()) {
                    i11 = i3;
                    obj = null;
                    zzarVar2 = null;
                    obj2 = null;
                    i12 = -1;
                } else {
                    Object obj5 = zzlbVar2.zzb.zza;
                    zzlbVar2.zza.zzn(obj5, zzboVar);
                    int i14 = zzboVar.zzc;
                    int iZza2 = zzlbVar2.zza.zza(obj5);
                    obj2 = obj5;
                    obj = zzlbVar2.zza.zze(i14, this.zza, 0L).zzb;
                    zzarVar2 = this.zza.zzd;
                    i11 = i14;
                    i12 = iZza2;
                }
                if (i13 == 0) {
                    if (zzlbVar2.zzb.zzb()) {
                        zzug zzugVar = zzlbVar2.zzb;
                        jZzV = zzboVar.zzf(zzugVar.zzb, zzugVar.zzc);
                        jZzV2 = zzV(zzlbVar2);
                    } else {
                        if (zzlbVar2.zzb.zze != -1) {
                            jZzV = zzV(this.zzR);
                        } else {
                            jZzV = zzboVar.zzd;
                        }
                        jZzV2 = jZzV;
                    }
                } else if (zzlbVar2.zzb.zzb()) {
                    jZzV = zzlbVar2.zzs;
                    jZzV2 = zzV(zzlbVar2);
                } else {
                    jZzV = zzlbVar2.zzs;
                    jZzV2 = jZzV;
                }
                int i15 = zzei.zza;
                zzug zzugVar2 = zzlbVar2.zzb;
                final zzbi zzbiVar = new zzbi(obj, i11, zzarVar2, obj2, i12, zzei.zzv(jZzV), zzei.zzv(jZzV2), zzugVar2.zzb, zzugVar2.zzc);
                iZzd2 = zzd();
                if (this.zzR.zza.zzo()) {
                    obj3 = null;
                    zzarVar3 = null;
                    obj4 = null;
                    iZza = -1;
                } else {
                    zzlb zzlbVar3 = this.zzR;
                    Object obj6 = zzlbVar3.zzb.zza;
                    zzlbVar3.zza.zzn(obj6, this.zzn);
                    iZza = this.zzR.zza.zza(obj6);
                    obj3 = this.zzR.zza.zze(iZzd2, this.zza, 0L).zzb;
                    zzarVar3 = this.zza.zzd;
                    obj4 = obj6;
                }
                jZzv = zzei.zzv(j);
                if (this.zzR.zzb.zzb()) {
                    jZzv2 = zzei.zzv(zzV(this.zzR));
                } else {
                    jZzv2 = jZzv;
                }
                zzug zzugVar3 = this.zzR.zzb;
                final zzbi zzbiVar2 = new zzbi(obj3, iZzd2, zzarVar3, obj4, iZza, jZzv, jZzv2, zzugVar3.zzb, zzugVar3.zzc);
                this.zzl.zzd(11, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjd
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzm(zzbiVar, zzbiVar2, i13);
                    }
                });
            } else {
                z7 = z7;
                z9 = z9;
            }
            if (zBooleanValue) {
                this.zzl.zzd(1, new zzdk() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzd(zzarVar, iIntValue);
                    }
                });
            }
            if (zzlbVar2.zzf != zzlbVar.zzf) {
                this.zzl.zzd(10, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjf
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzk(zzlbVar.zzf);
                    }
                });
                if (zzlbVar.zzf != null) {
                    this.zzl.zzd(10, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjg
                        @Override // com.google.android.gms.internal.ads.zzdk
                        public final void zza(Object obj7) {
                            int i16 = zzjp.zzd;
                            ((zzbh) obj7).zzj(zzlbVar.zzf);
                        }
                    });
                }
            }
            zzycVar = zzlbVar2.zzi;
            zzycVar2 = zzlbVar.zzi;
            if (zzycVar != zzycVar2) {
                this.zzi.zzp(zzycVar2.zze);
                this.zzl.zzd(2, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjh
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzq(zzlbVar.zzi.zzd);
                    }
                });
            }
            if (z6) {
                final zzav zzavVar = this.zzE;
                this.zzl.zzd(14, new zzdk() { // from class: com.google.android.gms.internal.ads.zzio
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zze(zzavVar);
                    }
                });
            }
            if (z9) {
                this.zzl.zzd(3, new zzdk() { // from class: com.google.android.gms.internal.ads.zzip
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzb(zzlbVar.zzg);
                    }
                });
            }
            if (z8 || z7) {
                this.zzl.zzd(-1, new zzdk() { // from class: com.google.android.gms.internal.ads.zziq
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        zzlb zzlbVar4 = zzlbVar;
                        ((zzbh) obj7).zzl(zzlbVar4.zzl, zzlbVar4.zze);
                    }
                });
            }
            if (z8) {
                this.zzl.zzd(4, new zzdk() { // from class: com.google.android.gms.internal.ads.zzir
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzh(zzlbVar.zze);
                    }
                });
            }
            if (z7 || zzlbVar2.zzm != zzlbVar.zzm) {
                this.zzl.zzd(5, new zzdk() { // from class: com.google.android.gms.internal.ads.zziv
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        zzlb zzlbVar4 = zzlbVar;
                        ((zzbh) obj7).zzf(zzlbVar4.zzl, zzlbVar4.zzm);
                    }
                });
            }
            if (zzlbVar2.zzn != zzlbVar.zzn) {
                this.zzl.zzd(6, new zzdk() { // from class: com.google.android.gms.internal.ads.zzja
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzi(zzlbVar.zzn);
                    }
                });
            }
            if (zzlbVar2.zzi() != zzlbVar.zzi()) {
                this.zzl.zzd(7, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjb
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzc(zzlbVar.zzi());
                    }
                });
            }
            if (!zzlbVar2.zzo.equals(zzlbVar.zzo)) {
                this.zzl.zzd(12, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjc
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        int i16 = zzjp.zzd;
                        ((zzbh) obj7).zzg(zzlbVar.zzo);
                    }
                });
            }
            zzbgVar = this.zzD;
            zzbk zzbkVar = this.zzg;
            zzbg zzbgVar2 = this.zzc;
            int i16 = zzei.zza;
            boolean zZzw = zzbkVar.zzw();
            zzgVar = (zzg) zzbkVar;
            zzbqVarZzn2 = zzgVar.zzn();
            if (zzbqVarZzn2.zzo() && zzbqVarZzn2.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzh) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzbqVarZzn3 = zzgVar.zzn();
            if (zzbqVarZzn3.zzo()) {
                int iZzd3 = zzgVar.zzd();
                zzgVar.zzh();
                zzgVar.zzv();
                z11 = false;
                r14 = 0;
                int iZzk = zzbqVarZzn3.zzk(iZzd3, 0, false);
                i8 = -1;
                z12 = iZzk != -1;
                zzbqVarZzn4 = zzgVar.zzn();
                if (zzbqVarZzn4.zzo()) {
                    z13 = false;
                } else {
                    iZzd = zzgVar.zzd();
                    zzgVar.zzh();
                    zzgVar.zzv();
                    if (zzbqVarZzn4.zzj(iZzd, r14, r14) != i8) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                zzbqVarZzn5 = zzgVar.zzn();
                if (!zzbqVarZzn5.zzo()) {
                    j2 = 0;
                    boolean z23 = zzbqVarZzn5.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzb();
                    zzbqVarZzn6 = zzgVar.zzn();
                    if (zzbqVarZzn6.zzo() && zzbqVarZzn6.zze(zzgVar.zzd(), zzgVar.zza, j2).zzi) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zZzo = zzbkVar.zzn().zzo();
                    zzbf zzbfVar = new zzbf();
                    zzbfVar.zzb(zzbgVar2);
                    boolean z24 = !zZzw;
                    zzbfVar.zzd(4, z24);
                    if (z10 || zZzw) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    zzbfVar.zzd(5, z15);
                    if (z12 || zZzw) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    zzbfVar.zzd(6, z16);
                    if (!zZzo || (!(z12 || !z23 || z10) || zZzw)) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    zzbfVar.zzd(7, z17);
                    if (z13 || zZzw) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    zzbfVar.zzd(8, z18);
                    if (!zZzo || (!(z13 || (z23 && z14)) || zZzw)) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    zzbfVar.zzd(9, z19);
                    zzbfVar.zzd(10, z24);
                    if (z10 || zZzw) {
                        i9 = 11;
                        z20 = false;
                    } else {
                        i9 = 11;
                        z20 = true;
                    }
                    zzbfVar.zzd(i9, z20);
                    if (z10 || zZzw) {
                        i10 = 12;
                        z21 = false;
                    } else {
                        i10 = 12;
                        z21 = true;
                    }
                    zzbfVar.zzd(i10, z21);
                    zzbgVarZze = zzbfVar.zze();
                    this.zzD = zzbgVarZze;
                    if (!zzbgVarZze.equals(zzbgVar)) {
                        this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                            @Override // com.google.android.gms.internal.ads.zzdk
                            public final void zza(Object obj7) {
                                this.zza.zzP((zzbh) obj7);
                            }
                        });
                    }
                    this.zzl.zzc();
                }
                j2 = 0;
                zzbqVarZzn6 = zzgVar.zzn();
                if (zzbqVarZzn6.zzo()) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                zZzo = zzbkVar.zzn().zzo();
                zzbf zzbfVar2 = new zzbf();
                zzbfVar2.zzb(zzbgVar2);
                boolean z25 = !zZzw;
                zzbfVar2.zzd(4, z25);
                if (z10) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                zzbfVar2.zzd(5, z15);
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                zzbfVar2.zzd(6, z16);
                if (zZzo) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zzbfVar2.zzd(7, z17);
                if (z13) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                zzbfVar2.zzd(8, z18);
                if (zZzo) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                zzbfVar2.zzd(9, z19);
                zzbfVar2.zzd(10, z25);
                if (z10) {
                    i9 = 11;
                    z20 = false;
                } else {
                    i9 = 11;
                    z20 = false;
                }
                zzbfVar2.zzd(i9, z20);
                if (z10) {
                    i10 = 12;
                    z21 = false;
                } else {
                    i10 = 12;
                    z21 = false;
                }
                zzbfVar2.zzd(i10, z21);
                zzbgVarZze = zzbfVar2.zze();
                this.zzD = zzbgVarZze;
                if (!zzbgVarZze.equals(zzbgVar)) {
                    this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                        @Override // com.google.android.gms.internal.ads.zzdk
                        public final void zza(Object obj7) {
                            this.zza.zzP((zzbh) obj7);
                        }
                    });
                }
                this.zzl.zzc();
            }
            i8 = -1;
            z11 = false;
            r14 = z11;
            zzbqVarZzn4 = zzgVar.zzn();
            if (zzbqVarZzn4.zzo()) {
                z13 = false;
            } else {
                iZzd = zzgVar.zzd();
                zzgVar.zzh();
                zzgVar.zzv();
                if (zzbqVarZzn4.zzj(iZzd, r14, r14) != i8) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            zzbqVarZzn5 = zzgVar.zzn();
            if (!zzbqVarZzn5.zzo()) {
                j2 = 0;
                if (zzbqVarZzn5.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzb()) {
                }
                zzbqVarZzn6 = zzgVar.zzn();
                if (zzbqVarZzn6.zzo()) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                zZzo = zzbkVar.zzn().zzo();
                zzbf zzbfVar3 = new zzbf();
                zzbfVar3.zzb(zzbgVar2);
                boolean z26 = !zZzw;
                zzbfVar3.zzd(4, z26);
                if (z10) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                zzbfVar3.zzd(5, z15);
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                zzbfVar3.zzd(6, z16);
                if (zZzo) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zzbfVar3.zzd(7, z17);
                if (z13) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                zzbfVar3.zzd(8, z18);
                if (zZzo) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                zzbfVar3.zzd(9, z19);
                zzbfVar3.zzd(10, z26);
                if (z10) {
                    i9 = 11;
                    z20 = false;
                } else {
                    i9 = 11;
                    z20 = false;
                }
                zzbfVar3.zzd(i9, z20);
                if (z10) {
                    i10 = 12;
                    z21 = false;
                } else {
                    i10 = 12;
                    z21 = false;
                }
                zzbfVar3.zzd(i10, z21);
                zzbgVarZze = zzbfVar3.zze();
                this.zzD = zzbgVarZze;
                if (!zzbgVarZze.equals(zzbgVar)) {
                    this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                        @Override // com.google.android.gms.internal.ads.zzdk
                        public final void zza(Object obj7) {
                            this.zza.zzP((zzbh) obj7);
                        }
                    });
                }
                this.zzl.zzc();
            }
            j2 = 0;
            zzbqVarZzn6 = zzgVar.zzn();
            if (zzbqVarZzn6.zzo()) {
                z14 = false;
            } else {
                z14 = false;
            }
            zZzo = zzbkVar.zzn().zzo();
            zzbf zzbfVar4 = new zzbf();
            zzbfVar4.zzb(zzbgVar2);
            boolean z27 = !zZzw;
            zzbfVar4.zzd(4, z27);
            if (z10) {
                z15 = false;
            } else {
                z15 = false;
            }
            zzbfVar4.zzd(5, z15);
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            zzbfVar4.zzd(6, z16);
            if (zZzo) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbfVar4.zzd(7, z17);
            if (z13) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzbfVar4.zzd(8, z18);
            if (zZzo) {
                z19 = false;
            } else {
                z19 = false;
            }
            zzbfVar4.zzd(9, z19);
            zzbfVar4.zzd(10, z27);
            if (z10) {
                i9 = 11;
                z20 = false;
            } else {
                i9 = 11;
                z20 = false;
            }
            zzbfVar4.zzd(i9, z20);
            if (z10) {
                i10 = 12;
                z21 = false;
            } else {
                i10 = 12;
                z21 = false;
            }
            zzbfVar4.zzd(i10, z21);
            zzbgVarZze = zzbfVar4.zze();
            this.zzD = zzbgVarZze;
            if (!zzbgVarZze.equals(zzbgVar)) {
                this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj7) {
                        this.zza.zzP((zzbh) obj7);
                    }
                });
            }
            this.zzl.zzc();
        }
        pair = new Pair(Boolean.FALSE, -1);
        z4 = z;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzlbVar.zza.zzo()) {
                zzarVar = zzlbVar.zza.zze(zzlbVar.zza.zzn(zzlbVar.zzb.zza, this.zzn).zzc, this.zza, 0L).zzd;
            } else {
                zzarVar = null;
            }
            this.zzQ = zzav.zza;
        } else {
            zzarVar = null;
        }
        if (zBooleanValue) {
            zzatVarZza = this.zzQ.zza();
            list = zzlbVar.zzj;
            while (i6 < list.size()) {
                zzayVar = (zzay) list.get(i6);
                while (i7 < zzayVar.zza()) {
                    zzayVar.zzb(i7).zza(zzatVarZza);
                }
            }
            this.zzQ = zzatVarZza.zzu();
        } else {
            zzatVarZza = this.zzQ.zza();
            list = zzlbVar.zzj;
            while (i6 < list.size()) {
                zzayVar = (zzay) list.get(i6);
                while (i7 < zzayVar.zza()) {
                    zzayVar.zzb(i7).zza(zzatVarZza);
                }
            }
            this.zzQ = zzatVarZza.zzu();
        }
        zzbqVarZzn = zzn();
        if (zzbqVarZzn.zzo()) {
            zzavVarZzu = this.zzQ;
        } else {
            zzar zzarVar5 = zzbqVarZzn.zze(zzd(), this.zza, 0L).zzd;
            zzat zzatVarZza3 = this.zzQ.zza();
            zzatVarZza3.zzb(zzarVar5.zzd);
            zzavVarZzu = zzatVarZza3.zzu();
        }
        z6 = !zzavVarZzu.equals(this.zzE);
        this.zzE = zzavVarZzu;
        if (zzlbVar2.zzl != zzlbVar.zzl) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (zzlbVar2.zze != zzlbVar.zze) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            zzag();
        } else {
            zzag();
        }
        if (zzlbVar2.zzg != zzlbVar.zzg) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z22) {
            this.zzl.zzd(0, new zzdk() { // from class: com.google.android.gms.internal.ads.zzin
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj7) {
                    int i17 = zzjp.zzd;
                    ((zzbh) obj7).zzp(zzlbVar.zza, i);
                }
            });
        }
        if (z4) {
            zzboVar = new zzbo();
            if (zzlbVar2.zza.zzo()) {
                Object obj7 = zzlbVar2.zzb.zza;
                zzlbVar2.zza.zzn(obj7, zzboVar);
                int i17 = zzboVar.zzc;
                int iZza3 = zzlbVar2.zza.zza(obj7);
                obj2 = obj7;
                obj = zzlbVar2.zza.zze(i17, this.zza, 0L).zzb;
                zzarVar2 = this.zza.zzd;
                i11 = i17;
                i12 = iZza3;
            } else {
                i11 = i3;
                obj = null;
                zzarVar2 = null;
                obj2 = null;
                i12 = -1;
            }
            if (i13 == 0) {
                if (zzlbVar2.zzb.zzb()) {
                    zzug zzugVar4 = zzlbVar2.zzb;
                    jZzV = zzboVar.zzf(zzugVar4.zzb, zzugVar4.zzc);
                    jZzV2 = zzV(zzlbVar2);
                } else {
                    if (zzlbVar2.zzb.zze != -1) {
                        jZzV = zzV(this.zzR);
                    } else {
                        jZzV = zzboVar.zzd;
                    }
                    jZzV2 = jZzV;
                }
            } else if (zzlbVar2.zzb.zzb()) {
                jZzV = zzlbVar2.zzs;
                jZzV2 = zzV(zzlbVar2);
            } else {
                jZzV = zzlbVar2.zzs;
                jZzV2 = jZzV;
            }
            int i18 = zzei.zza;
            zzug zzugVar5 = zzlbVar2.zzb;
            final zzbi zzbiVar3 = new zzbi(obj, i11, zzarVar2, obj2, i12, zzei.zzv(jZzV), zzei.zzv(jZzV2), zzugVar5.zzb, zzugVar5.zzc);
            iZzd2 = zzd();
            if (this.zzR.zza.zzo()) {
                zzlb zzlbVar4 = this.zzR;
                Object obj8 = zzlbVar4.zzb.zza;
                zzlbVar4.zza.zzn(obj8, this.zzn);
                iZza = this.zzR.zza.zza(obj8);
                obj3 = this.zzR.zza.zze(iZzd2, this.zza, 0L).zzb;
                zzarVar3 = this.zza.zzd;
                obj4 = obj8;
            } else {
                obj3 = null;
                zzarVar3 = null;
                obj4 = null;
                iZza = -1;
            }
            jZzv = zzei.zzv(j);
            if (this.zzR.zzb.zzb()) {
                jZzv2 = zzei.zzv(zzV(this.zzR));
            } else {
                jZzv2 = jZzv;
            }
            zzug zzugVar6 = this.zzR.zzb;
            final zzbi zzbiVar4 = new zzbi(obj3, iZzd2, zzarVar3, obj4, iZza, jZzv, jZzv2, zzugVar6.zzb, zzugVar6.zzc);
            this.zzl.zzd(11, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzm(zzbiVar3, zzbiVar4, i13);
                }
            });
        } else {
            z7 = z7;
            z9 = z9;
        }
        if (zBooleanValue) {
            this.zzl.zzd(1, new zzdk() { // from class: com.google.android.gms.internal.ads.zzje
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzd(zzarVar, iIntValue);
                }
            });
        }
        if (zzlbVar2.zzf != zzlbVar.zzf) {
            this.zzl.zzd(10, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzk(zzlbVar.zzf);
                }
            });
            if (zzlbVar.zzf != null) {
                this.zzl.zzd(10, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjg
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj9) {
                        int i19 = zzjp.zzd;
                        ((zzbh) obj9).zzj(zzlbVar.zzf);
                    }
                });
            }
        }
        zzycVar = zzlbVar2.zzi;
        zzycVar2 = zzlbVar.zzi;
        if (zzycVar != zzycVar2) {
            this.zzi.zzp(zzycVar2.zze);
            this.zzl.zzd(2, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjh
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzq(zzlbVar.zzi.zzd);
                }
            });
        }
        if (z6) {
            final zzav zzavVar2 = this.zzE;
            this.zzl.zzd(14, new zzdk() { // from class: com.google.android.gms.internal.ads.zzio
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zze(zzavVar2);
                }
            });
        }
        if (z9) {
            this.zzl.zzd(3, new zzdk() { // from class: com.google.android.gms.internal.ads.zzip
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzb(zzlbVar.zzg);
                }
            });
        }
        if (z8) {
            this.zzl.zzd(-1, new zzdk() { // from class: com.google.android.gms.internal.ads.zziq
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    zzlb zzlbVar5 = zzlbVar;
                    ((zzbh) obj9).zzl(zzlbVar5.zzl, zzlbVar5.zze);
                }
            });
        } else {
            this.zzl.zzd(-1, new zzdk() { // from class: com.google.android.gms.internal.ads.zziq
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    zzlb zzlbVar5 = zzlbVar;
                    ((zzbh) obj9).zzl(zzlbVar5.zzl, zzlbVar5.zze);
                }
            });
        }
        if (z8) {
            this.zzl.zzd(4, new zzdk() { // from class: com.google.android.gms.internal.ads.zzir
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzh(zzlbVar.zze);
                }
            });
        }
        if (z7) {
            this.zzl.zzd(5, new zzdk() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    zzlb zzlbVar5 = zzlbVar;
                    ((zzbh) obj9).zzf(zzlbVar5.zzl, zzlbVar5.zzm);
                }
            });
        } else {
            this.zzl.zzd(5, new zzdk() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    zzlb zzlbVar5 = zzlbVar;
                    ((zzbh) obj9).zzf(zzlbVar5.zzl, zzlbVar5.zzm);
                }
            });
        }
        if (zzlbVar2.zzn != zzlbVar.zzn) {
            this.zzl.zzd(6, new zzdk() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzi(zzlbVar.zzn);
                }
            });
        }
        if (zzlbVar2.zzi() != zzlbVar.zzi()) {
            this.zzl.zzd(7, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzc(zzlbVar.zzi());
                }
            });
        }
        if (!zzlbVar2.zzo.equals(zzlbVar.zzo)) {
            this.zzl.zzd(12, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    int i19 = zzjp.zzd;
                    ((zzbh) obj9).zzg(zzlbVar.zzo);
                }
            });
        }
        zzbgVar = this.zzD;
        zzbk zzbkVar2 = this.zzg;
        zzbg zzbgVar3 = this.zzc;
        int i19 = zzei.zza;
        boolean zZzw2 = zzbkVar2.zzw();
        zzgVar = (zzg) zzbkVar2;
        zzbqVarZzn2 = zzgVar.zzn();
        if (zzbqVarZzn2.zzo()) {
            z10 = false;
        } else {
            z10 = false;
        }
        zzbqVarZzn3 = zzgVar.zzn();
        if (zzbqVarZzn3.zzo()) {
            int iZzd4 = zzgVar.zzd();
            zzgVar.zzh();
            zzgVar.zzv();
            z11 = false;
            r14 = 0;
            int iZzk2 = zzbqVarZzn3.zzk(iZzd4, 0, false);
            i8 = -1;
            if (iZzk2 != -1) {
            }
            zzbqVarZzn4 = zzgVar.zzn();
            if (zzbqVarZzn4.zzo()) {
                z13 = false;
            } else {
                iZzd = zzgVar.zzd();
                zzgVar.zzh();
                zzgVar.zzv();
                if (zzbqVarZzn4.zzj(iZzd, r14, r14) != i8) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            zzbqVarZzn5 = zzgVar.zzn();
            if (!zzbqVarZzn5.zzo()) {
                j2 = 0;
                if (zzbqVarZzn5.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzb()) {
                }
                zzbqVarZzn6 = zzgVar.zzn();
                if (zzbqVarZzn6.zzo()) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                zZzo = zzbkVar2.zzn().zzo();
                zzbf zzbfVar5 = new zzbf();
                zzbfVar5.zzb(zzbgVar3);
                boolean z28 = !zZzw2;
                zzbfVar5.zzd(4, z28);
                if (z10) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                zzbfVar5.zzd(5, z15);
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                zzbfVar5.zzd(6, z16);
                if (zZzo) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zzbfVar5.zzd(7, z17);
                if (z13) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                zzbfVar5.zzd(8, z18);
                if (zZzo) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                zzbfVar5.zzd(9, z19);
                zzbfVar5.zzd(10, z28);
                if (z10) {
                    i9 = 11;
                    z20 = false;
                } else {
                    i9 = 11;
                    z20 = false;
                }
                zzbfVar5.zzd(i9, z20);
                if (z10) {
                    i10 = 12;
                    z21 = false;
                } else {
                    i10 = 12;
                    z21 = false;
                }
                zzbfVar5.zzd(i10, z21);
                zzbgVarZze = zzbfVar5.zze();
                this.zzD = zzbgVarZze;
                if (!zzbgVarZze.equals(zzbgVar)) {
                    this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                        @Override // com.google.android.gms.internal.ads.zzdk
                        public final void zza(Object obj9) {
                            this.zza.zzP((zzbh) obj9);
                        }
                    });
                }
                this.zzl.zzc();
            }
            j2 = 0;
            zzbqVarZzn6 = zzgVar.zzn();
            if (zzbqVarZzn6.zzo()) {
                z14 = false;
            } else {
                z14 = false;
            }
            zZzo = zzbkVar2.zzn().zzo();
            zzbf zzbfVar6 = new zzbf();
            zzbfVar6.zzb(zzbgVar3);
            boolean z29 = !zZzw2;
            zzbfVar6.zzd(4, z29);
            if (z10) {
                z15 = false;
            } else {
                z15 = false;
            }
            zzbfVar6.zzd(5, z15);
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            zzbfVar6.zzd(6, z16);
            if (zZzo) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbfVar6.zzd(7, z17);
            if (z13) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzbfVar6.zzd(8, z18);
            if (zZzo) {
                z19 = false;
            } else {
                z19 = false;
            }
            zzbfVar6.zzd(9, z19);
            zzbfVar6.zzd(10, z29);
            if (z10) {
                i9 = 11;
                z20 = false;
            } else {
                i9 = 11;
                z20 = false;
            }
            zzbfVar6.zzd(i9, z20);
            if (z10) {
                i10 = 12;
                z21 = false;
            } else {
                i10 = 12;
                z21 = false;
            }
            zzbfVar6.zzd(i10, z21);
            zzbgVarZze = zzbfVar6.zze();
            this.zzD = zzbgVarZze;
            if (!zzbgVarZze.equals(zzbgVar)) {
                this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj9) {
                        this.zza.zzP((zzbh) obj9);
                    }
                });
            }
            this.zzl.zzc();
        }
        i8 = -1;
        z11 = false;
        r14 = z11;
        zzbqVarZzn4 = zzgVar.zzn();
        if (zzbqVarZzn4.zzo()) {
            z13 = false;
        } else {
            iZzd = zzgVar.zzd();
            zzgVar.zzh();
            zzgVar.zzv();
            if (zzbqVarZzn4.zzj(iZzd, r14, r14) != i8) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        zzbqVarZzn5 = zzgVar.zzn();
        if (!zzbqVarZzn5.zzo()) {
            j2 = 0;
            if (zzbqVarZzn5.zze(zzgVar.zzd(), zzgVar.zza, 0L).zzb()) {
            }
            zzbqVarZzn6 = zzgVar.zzn();
            if (zzbqVarZzn6.zzo()) {
                z14 = false;
            } else {
                z14 = false;
            }
            zZzo = zzbkVar2.zzn().zzo();
            zzbf zzbfVar7 = new zzbf();
            zzbfVar7.zzb(zzbgVar3);
            boolean z210 = !zZzw2;
            zzbfVar7.zzd(4, z210);
            if (z10) {
                z15 = false;
            } else {
                z15 = false;
            }
            zzbfVar7.zzd(5, z15);
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            zzbfVar7.zzd(6, z16);
            if (zZzo) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzbfVar7.zzd(7, z17);
            if (z13) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzbfVar7.zzd(8, z18);
            if (zZzo) {
                z19 = false;
            } else {
                z19 = false;
            }
            zzbfVar7.zzd(9, z19);
            zzbfVar7.zzd(10, z210);
            if (z10) {
                i9 = 11;
                z20 = false;
            } else {
                i9 = 11;
                z20 = false;
            }
            zzbfVar7.zzd(i9, z20);
            if (z10) {
                i10 = 12;
                z21 = false;
            } else {
                i10 = 12;
                z21 = false;
            }
            zzbfVar7.zzd(i10, z21);
            zzbgVarZze = zzbfVar7.zze();
            this.zzD = zzbgVarZze;
            if (!zzbgVarZze.equals(zzbgVar)) {
                this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                    @Override // com.google.android.gms.internal.ads.zzdk
                    public final void zza(Object obj9) {
                        this.zza.zzP((zzbh) obj9);
                    }
                });
            }
            this.zzl.zzc();
        }
        j2 = 0;
        zzbqVarZzn6 = zzgVar.zzn();
        if (zzbqVarZzn6.zzo()) {
            z14 = false;
        } else {
            z14 = false;
        }
        zZzo = zzbkVar2.zzn().zzo();
        zzbf zzbfVar8 = new zzbf();
        zzbfVar8.zzb(zzbgVar3);
        boolean z211 = !zZzw2;
        zzbfVar8.zzd(4, z211);
        if (z10) {
            z15 = false;
        } else {
            z15 = false;
        }
        zzbfVar8.zzd(5, z15);
        if (z12) {
            z16 = false;
        } else {
            z16 = false;
        }
        zzbfVar8.zzd(6, z16);
        if (zZzo) {
            z17 = false;
        } else {
            z17 = false;
        }
        zzbfVar8.zzd(7, z17);
        if (z13) {
            z18 = false;
        } else {
            z18 = false;
        }
        zzbfVar8.zzd(8, z18);
        if (zZzo) {
            z19 = false;
        } else {
            z19 = false;
        }
        zzbfVar8.zzd(9, z19);
        zzbfVar8.zzd(10, z211);
        if (z10) {
            i9 = 11;
            z20 = false;
        } else {
            i9 = 11;
            z20 = false;
        }
        zzbfVar8.zzd(i9, z20);
        if (z10) {
            i10 = 12;
            z21 = false;
        } else {
            i10 = 12;
            z21 = false;
        }
        zzbfVar8.zzd(i10, z21);
        zzbgVarZze = zzbfVar8.zze();
        this.zzD = zzbgVarZze;
        if (!zzbgVarZze.equals(zzbgVar)) {
            this.zzl.zzd(13, new zzdk() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj9) {
                    this.zza.zzP((zzbh) obj9);
                }
            });
        }
        this.zzl.zzc();
    }

    private final void zzag() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            zzah();
            boolean z = this.zzR.zzp;
            zzu();
            zzu();
        }
    }

    private final void zzah() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzr.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.zzr.getThread().getName();
            Locale locale = Locale.US;
            String strN = AbstractC5044xl.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzN) {
                throw new IllegalStateException(strN);
            }
            zzdo.zzg("ExoPlayerImpl", strN, this.zzO ? null : new IllegalStateException());
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzA(zzlw zzlwVar) {
        zzah();
        this.zzq.zzR(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzB(zzui zzuiVar) {
        zzah();
        List listSingletonList = Collections.singletonList(zzuiVar);
        zzah();
        zzah();
        zzR(this.zzR);
        zzk();
        this.zzy++;
        boolean z = false;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzV = this.zzV.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            zzky zzkyVar = new zzky((zzui) listSingletonList.get(i2), this.zzp);
            arrayList.add(zzkyVar);
            this.zzo.add(i2, new zzjn(zzkyVar.zzb, zzkyVar.zza));
        }
        this.zzV = this.zzV.zzg(0, arrayList.size());
        zzlh zzlhVar = new zzlh(this.zzo, this.zzV);
        if (!zzlhVar.zzo() && zzlhVar.zzc() < 0) {
            throw new zzac(zzlhVar, -1, C.TIME_UNSET);
        }
        int iZzg = zzlhVar.zzg(false);
        zzlb zzlbVarZzY = zzY(this.zzR, zzlhVar, zzX(zzlhVar, iZzg, C.TIME_UNSET));
        int i3 = zzlbVarZzY.zze;
        if (iZzg != -1 && i3 != 1) {
            i3 = 4;
            if (!zzlhVar.zzo() && iZzg < zzlhVar.zzc()) {
                i3 = 2;
            }
        }
        zzlb zzlbVarZze = zzlbVarZzY.zze(i3);
        this.zzk.zzr(arrayList, iZzg, zzei.zzs(C.TIME_UNSET), this.zzV);
        if (!this.zzR.zzb.zza.equals(zzlbVarZze.zzb.zza) && !this.zzR.zza.zzo()) {
            z = true;
        }
        zzaf(zzlbVarZze, 0, z, 4, zzU(zzlbVarZze), -1, false);
    }

    @Nullable
    public final zzib zzE() {
        zzah();
        return this.zzR.zzf;
    }

    public final /* synthetic */ void zzN(final zzjz zzjzVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zziy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(zzjzVar);
            }
        });
    }

    public final /* synthetic */ void zzO(zzjz zzjzVar) {
        long j;
        int i = this.zzy - zzjzVar.zzb;
        this.zzy = i;
        boolean z = true;
        if (zzjzVar.zzc) {
            this.zzz = zzjzVar.zzd;
            this.zzA = true;
        }
        if (i == 0) {
            zzbq zzbqVar = zzjzVar.zza.zza;
            if (!this.zzR.zza.zzo() && zzbqVar.zzo()) {
                this.zzS = -1;
                this.zzT = 0L;
            }
            if (!zzbqVar.zzo()) {
                List listZzw = ((zzlh) zzbqVar).zzw();
                zzcw.zzf(listZzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < listZzw.size(); i2++) {
                    ((zzjn) this.zzo.get(i2)).zzc((zzbq) listZzw.get(i2));
                }
            }
            boolean z2 = this.zzA;
            long j2 = C.TIME_UNSET;
            if (z2) {
                if (zzjzVar.zza.zzb.equals(this.zzR.zzb) && zzjzVar.zza.zzd == this.zzR.zzs) {
                    z = false;
                }
                if (z) {
                    if (zzbqVar.zzo() || zzjzVar.zza.zzb.zzb()) {
                        j = zzjzVar.zza.zzd;
                    } else {
                        zzlb zzlbVar = zzjzVar.zza;
                        zzug zzugVar = zzlbVar.zzb;
                        j = zzlbVar.zzd;
                        zzW(zzbqVar, zzugVar, j);
                    }
                    j2 = j;
                }
            } else {
                z = false;
            }
            this.zzA = false;
            zzaf(zzjzVar.zza, 1, z, this.zzz, j2, -1, false);
        }
    }

    public final /* synthetic */ void zzP(zzbh zzbhVar) {
        zzbhVar.zza(this.zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void zza(int i, long j, int i2, boolean z) {
        zzah();
        if (i == -1) {
            return;
        }
        zzcw.zzd(i >= 0);
        zzbq zzbqVar = this.zzR.zza;
        if (zzbqVar.zzo() || i < zzbqVar.zzc()) {
            this.zzq.zzu();
            this.zzy++;
            if (zzw()) {
                zzdo.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzjz zzjzVar = new zzjz(this.zzR);
                zzjzVar.zza(1);
                this.zzU.zza.zzN(zzjzVar);
                return;
            }
            zzlb zzlbVarZze = this.zzR;
            int i3 = zzlbVarZze.zze;
            if (i3 == 3 || (i3 == 4 && !zzbqVar.zzo())) {
                zzlbVarZze = this.zzR.zze(2);
            }
            int iZzd = zzd();
            zzlb zzlbVarZzY = zzY(zzlbVarZze, zzbqVar, zzX(zzbqVar, i, j));
            this.zzk.zzl(zzbqVar, i, zzei.zzs(j));
            zzaf(zzlbVarZzY, 0, true, 1, zzU(zzlbVarZzY), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzb() {
        zzah();
        if (zzw()) {
            return this.zzR.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzc() {
        zzah();
        if (zzw()) {
            return this.zzR.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzd() {
        zzah();
        int iZzR = zzR(this.zzR);
        if (iZzR == -1) {
            return 0;
        }
        return iZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zze() {
        zzah();
        if (this.zzR.zza.zzo()) {
            return 0;
        }
        zzlb zzlbVar = this.zzR;
        return zzlbVar.zza.zza(zzlbVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzf() {
        zzah();
        return this.zzR.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzg() {
        zzah();
        return this.zzR.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int zzh() {
        zzah();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzi() {
        zzah();
        if (zzw()) {
            zzlb zzlbVar = this.zzR;
            return zzlbVar.zzk.equals(zzlbVar.zzb) ? zzei.zzv(this.zzR.zzq) : zzl();
        }
        zzah();
        if (this.zzR.zza.zzo()) {
            return this.zzT;
        }
        zzlb zzlbVar2 = this.zzR;
        long j = 0;
        if (zzlbVar2.zzk.zzd != zzlbVar2.zzb.zzd) {
            return zzei.zzv(zzlbVar2.zza.zze(zzd(), this.zza, 0L).zzm);
        }
        long j2 = zzlbVar2.zzq;
        if (this.zzR.zzk.zzb()) {
            zzlb zzlbVar3 = this.zzR;
            zzlbVar3.zza.zzn(zzlbVar3.zzk.zza, this.zzn).zzg(this.zzR.zzk.zzb);
        } else {
            j = j2;
        }
        zzlb zzlbVar4 = this.zzR;
        zzW(zzlbVar4.zza, zzlbVar4.zzk, j);
        return zzei.zzv(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzj() {
        zzah();
        return zzT(this.zzR);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzk() {
        zzah();
        return zzei.zzv(zzU(this.zzR));
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzl() {
        zzah();
        if (!zzw()) {
            zzbq zzbqVarZzn = zzn();
            return zzbqVarZzn.zzo() ? C.TIME_UNSET : zzei.zzv(zzbqVarZzn.zze(zzd(), this.zza, 0L).zzm);
        }
        zzlb zzlbVar = this.zzR;
        zzug zzugVar = zzlbVar.zzb;
        zzlbVar.zza.zzn(zzugVar.zza, this.zzn);
        return zzei.zzv(this.zzn.zzf(zzugVar.zzb, zzugVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final long zzm() {
        zzah();
        return zzei.zzv(this.zzR.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final zzbq zzn() {
        zzah();
        return this.zzR.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final zzby zzo() {
        zzah();
        return this.zzR.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzp() {
        zzah();
        zzhq zzhqVar = this.zzw;
        boolean zZzu = zzu();
        zzhqVar.zzb(zZzu, 2);
        zzae(zZzu, 1, zzS(1));
        zzlb zzlbVar = this.zzR;
        if (zzlbVar.zze != 1) {
            return;
        }
        zzlb zzlbVarZzd = zzlbVar.zzd(null);
        zzlb zzlbVarZze = zzlbVarZzd.zze(true == zzlbVarZzd.zza.zzo() ? 4 : 2);
        this.zzy++;
        this.zzk.zzk();
        zzaf(zzlbVarZze, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzq(boolean z) {
        zzah();
        this.zzw.zzb(z, zzf());
        zzae(z, 1, zzS(1));
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzr(@Nullable Surface surface) {
        zzah();
        zzac(surface);
        int i = surface == null ? 0 : -1;
        zzZ(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzs(float f) {
        zzah();
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzL == fMax) {
            return;
        }
        this.zzL = fMax;
        zzab();
        zzdn zzdnVar = this.zzl;
        zzdnVar.zzd(22, new zzdk() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(Object obj) {
                int i = zzjp.zzd;
                ((zzbh) obj).zzs(fMax);
            }
        });
        zzdnVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zzt() {
        zzah();
        this.zzw.zzb(zzu(), 1);
        zzad(null);
        int i = zzcp.zza;
        zzfxn zzfxnVarZzn = zzfxn.zzn();
        long j = this.zzR.zzs;
        zzfxn.zzl(zzfxnVarZzn);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzu() {
        zzah();
        return this.zzR.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzv() {
        zzah();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean zzw() {
        zzah();
        return this.zzR.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final int zzx() {
        zzah();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzy(zzlw zzlwVar) {
        this.zzq.zzt(zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zzz() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzei.zze;
        String strZza = zzas.zza();
        StringBuilder sbR = DM.r("Release ", hexString, " [AndroidXMedia3/1.5.0-beta01] [", str, "] [");
        sbR.append(strZza);
        sbR.append("]");
        zzdo.zze("ExoPlayerImpl", sbR.toString());
        zzah();
        this.zzw.zzd();
        if (!this.zzk.zzp()) {
            zzdn zzdnVar = this.zzl;
            zzdnVar.zzd(10, new zzdk() { // from class: com.google.android.gms.internal.ads.zziu
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj) {
                    ((zzbh) obj).zzj(zzib.zzd(new zzkd(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzdnVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzg(this.zzq);
        zzlb zzlbVar = this.zzR;
        boolean z = zzlbVar.zzp;
        zzlb zzlbVarZze = zzlbVar.zze(1);
        this.zzR = zzlbVarZze;
        zzlb zzlbVarZza = zzlbVarZze.zza(zzlbVarZze.zzb);
        this.zzR = zzlbVarZza;
        zzlbVarZza.zzq = zzlbVarZza.zzs;
        this.zzR.zzr = 0L;
        this.zzq.zzQ();
        this.zzi.zzj();
        Surface surface = this.zzG;
        if (surface != null) {
            surface.release();
            this.zzG = null;
        }
        int i = zzcp.zza;
    }
}
