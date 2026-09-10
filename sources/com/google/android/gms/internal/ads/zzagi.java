package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagi implements zzaeo {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaga zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzaer zzn;
    private zzaga zzo;
    private zzaga zzp;
    private zzafr zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzfj.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzagi() {
        throw null;
    }

    private final boolean zzh(zzaep zzaepVar) throws IOException {
        byte[] bArr = zzc;
        if (zzi(zzaepVar, bArr)) {
            this.zzg = false;
            zzaepVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzaepVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzaepVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(zzaep zzaepVar, byte[] bArr) throws IOException {
        zzaepVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzaepVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    @RequiresNonNull
    private final int zzj(zzaep zzaepVar) throws IOException {
        int i2 = this.zzj;
        if (i2 == 0) {
            try {
                zzaepVar.zzl();
                byte[] bArr = this.zze;
                zzaepVar.zzi(bArr, 0, 1);
                byte b2 = bArr[0];
                if ((b2 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b2).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b2);
                    throw zzat.zzb(sb.toString(), null);
                }
                boolean z2 = this.zzg;
                int i3 = (b2 >> 3) & 15;
                if (!z2) {
                    if (!z2) {
                        if (i3 >= 12 && i3 <= 14) {
                        }
                    }
                    String str = true != z2 ? "NB" : "WB";
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 26);
                    sb2.append("Illegal AMR ");
                    sb2.append(str);
                    sb2.append(" frame type ");
                    sb2.append(i3);
                    throw zzat.zzb(sb2.toString(), null);
                }
                if (i3 >= 10 && i3 <= 13) {
                    if (!z2) {
                        if (i3 >= 12) {
                        }
                    }
                    if (true != z2) {
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 26);
                    sb3.append("Illegal AMR ");
                    sb3.append(str);
                    sb3.append(" frame type ");
                    sb3.append(i3);
                    throw zzat.zzb(sb3.toString(), null);
                }
                i2 = z2 ? zzb[i3] : zza[i3];
                this.zzi = i2;
                this.zzj = i2;
                int i4 = this.zzk;
                if (i4 == -1) {
                    this.zzk = i2;
                    i4 = i2;
                }
                if (i4 == i2) {
                    this.zzl++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZzy = this.zzp.zzy(zzaepVar, i2, true);
        if (iZzy == -1) {
            return -1;
        }
        int i5 = this.zzj - iZzy;
        this.zzj = i5;
        if (i5 > 0) {
            return 0;
        }
        this.zzp.zzx(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        return zzh(zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzn = zzaerVar;
        zzaga zzagaVarZzu = zzaerVar.zzu(0, 1);
        this.zzo = zzagaVarZzu;
        this.zzp = zzagaVarZzu;
        zzaerVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        this.zzo.getClass();
        String str = zzfj.zza;
        if (zzaepVar.zzn() == 0 && !zzh(zzaepVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z2 = this.zzg;
            String str2 = true != z2 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z2 ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z2 ? 8000 : 16000;
            int i3 = z2 ? zzb[8] : zza[7];
            zzaga zzagaVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzl(str2);
            zztVar.zzm(str3);
            zztVar.zzn(i3);
            zztVar.zzE(1);
            zztVar.zzF(i2);
            zzagaVar.zzu(zztVar.zzM());
        }
        int iZzj = zzj(zzaepVar);
        if (this.zzq == null) {
            zzafq zzafqVar = new zzafq(-9223372036854775807L, 0L);
            this.zzq = zzafqVar;
            this.zzn.zzw(zzafqVar);
        }
        return iZzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public zzagi(int i2) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzael zzaelVar = new zzael();
        this.zzf = zzaelVar;
        this.zzp = zzaelVar;
    }
}
