package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes4.dex */
final class zzrh {
    private final zzrg zza;
    private final int zzb;
    private final zzsf zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzrh(AudioTrack audioTrack, zzsf zzsfVar) {
        this.zza = new zzrg(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzsfVar;
        zzf(0);
    }

    private final void zzf(int i2) {
        this.zzd = i2;
        long j = 10000;
        if (i2 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i2 == 1) {
                this.zzf = 10000L;
                return;
            }
            j = (i2 == 2 || i2 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        zzrg zzrgVar = this.zza;
        return zzh(zzrgVar.zzc(), zzrgVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        long j4 = j3 - j2;
        return zzfj.zzv(j4, f) + zzfj.zzr(j, this.zzb);
    }

    public final void zza(long j, float f, long j2) {
        boolean z2;
        int i2;
        if (j - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j;
        zzrg zzrgVar = this.zza;
        boolean zZza = zzrgVar.zza();
        if (zZza) {
            long jZzb = zzrgVar.zzb();
            long jZzg = zzg(j, f);
            i2 = 2;
            if (Math.abs(jZzb - j) > 5000000) {
                zzsf zzsfVar = this.zzc;
                long jZzc = zzrgVar.zzc();
                long jZzq = ((zzrs) zzsfVar).zza.zzq();
                int length = String.valueOf(jZzc).length();
                int length2 = String.valueOf(jZzb).length();
                int length3 = String.valueOf(j).length();
                StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j2).length() + 2 + String.valueOf(jZzq).length());
                androidx.datastore.preferences.protobuf.a.A(sb, "Spurious audio timestamp (system clock mismatch): ", jZzc, ", ");
                sb.append(jZzb);
                androidx.datastore.preferences.protobuf.a.A(sb, ", ", j, ", ");
                sb.append(j2);
                sb.append(", ");
                sb.append(jZzq);
                zzee.zzc("AudioTrackAudioOutput", sb.toString());
                zzf(4);
                z2 = zZza;
            } else if (Math.abs(jZzg - j2) > 5000000) {
                zzsf zzsfVar2 = this.zzc;
                long jZzc2 = zzrgVar.zzc();
                long jZzq2 = ((zzrs) zzsfVar2).zza.zzq();
                int length4 = String.valueOf(jZzc2).length();
                int length5 = String.valueOf(jZzb).length();
                int length6 = String.valueOf(j).length();
                int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j2).length() + 2;
                z2 = zZza;
                StringBuilder sb2 = new StringBuilder(length7 + String.valueOf(jZzq2).length());
                androidx.datastore.preferences.protobuf.a.A(sb2, "Spurious audio timestamp (frame position mismatch): ", jZzc2, ", ");
                sb2.append(jZzb);
                androidx.datastore.preferences.protobuf.a.A(sb2, ", ", j, ", ");
                sb2.append(j2);
                sb2.append(", ");
                sb2.append(jZzq2);
                zzee.zzc("AudioTrackAudioOutput", sb2.toString());
                zzf(4);
            } else {
                z2 = zZza;
                if (this.zzd == 4) {
                    zzf(0);
                }
            }
        } else {
            z2 = zZza;
            i2 = 2;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            if (!z2) {
                if (j - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzrgVar.zzb() >= this.zze) {
                    this.zzh = zzrgVar.zzc();
                    this.zzi = zzrgVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i3 != 1) {
            if (i3 == i2) {
                if (z2) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i3 == 3 && z2) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!z2) {
            zzf(0);
            return;
        }
        long jZzc3 = zzrgVar.zzc();
        long j3 = this.zzh;
        if (jZzc3 > j3) {
            if (Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j - this.zze > 2000000) {
            zzf(3);
        } else {
            this.zzh = zzrgVar.zzc();
            this.zzi = zzrgVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i2 = this.zzd;
        return i2 == 0 || i2 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}
