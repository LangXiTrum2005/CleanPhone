package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
final class zzapz implements zzaqa {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, com.smartdigimkt.b0.a.X0, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzaer zzc;
    private final zzaga zzd;
    private final zzaqe zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzer zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzapz(zzaer zzaerVar, zzaga zzagaVar, zzaqe zzaqeVar) throws zzat {
        this.zzc = zzaerVar;
        this.zzd = zzagaVar;
        this.zze = zzaqeVar;
        int iMax = Math.max(1, zzaqeVar.zzc / 10);
        this.zzi = iMax;
        zzer zzerVar = new zzer(zzaqeVar.zzf);
        zzerVar.zzu();
        int iZzu = zzerVar.zzu();
        this.zzf = iZzu;
        int i2 = zzaqeVar.zzb;
        int i3 = zzaqeVar.zzd;
        int iB = android.support.v4.media.a.B(i3 - (i2 * 4), 8, zzaqeVar.zze * i2, 1);
        if (iZzu != iB) {
            throw zzat.zzb(p005e.a.a(new StringBuilder(String.valueOf(iB).length() + 34 + String.valueOf(iZzu).length()), iB, "Expected frames per block: ", iZzu, "; got: "), null);
        }
        String str = zzfj.zza;
        int i4 = ((iMax + iZzu) - 1) / iZzu;
        this.zzg = new byte[i3 * i4];
        this.zzh = new zzer((iZzu + iZzu) * i2 * i4);
        int i5 = ((zzaqeVar.zzc * zzaqeVar.zzd) * 8) / iZzu;
        zzt zztVar = new zzt();
        zztVar.zzm("audio/raw");
        zztVar.zzh(i5);
        zztVar.zzi(i5);
        zztVar.zzn((iMax + iMax) * i2);
        zztVar.zzE(zzaqeVar.zzb);
        zztVar.zzF(zzaqeVar.zzc);
        zztVar.zzG(2);
        this.zzj = zztVar.zzM();
    }

    private final void zzd(int i2) {
        long jZzt = this.zzl + zzfj.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZzf = zzf(i2);
        this.zzd.zzx(jZzt, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += (long) i2;
        this.zzm -= iZzf;
    }

    private final int zze(int i2) {
        int i3 = this.zze.zzb;
        return i2 / (i3 + i3);
    }

    private final int zzf(int i2) {
        return (i2 + i2) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(int i2, long j) {
        this.zzc.zzw(new zzaqh(this.zze, this.zzf, i2, j));
        this.zzd.zzu(this.zzj);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040 A[LOOP:0: B:6:0x0025->B:12:0x0040, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:4:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final boolean zzc(com.google.android.gms.internal.ads.zzaep r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapz.zzc(com.google.android.gms.internal.ads.zzaep, long):boolean");
    }
}
