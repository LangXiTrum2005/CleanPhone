package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzalg {
    private final zzalh zza = new zzalh();
    private final zzer zzb = new zzer(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i2) {
        int i3;
        int i4 = 0;
        this.zzd = 0;
        do {
            int i5 = this.zzd;
            int i6 = i2 + i5;
            zzalh zzalhVar = this.zza;
            if (i6 >= zzalhVar.zzc) {
                break;
            }
            this.zzd = i5 + 1;
            i3 = zzalhVar.zzf[i6];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final boolean zzb(zzaep zzaepVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i2 = this.zzc;
            if (i2 < 0) {
                zzalh zzalhVar = this.zza;
                if (!zzalhVar.zzb(zzaepVar, -1L) || !zzalhVar.zzc(zzaepVar, true)) {
                    return false;
                }
                int iZzf = zzalhVar.zzd;
                if ((zzalhVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i2 = this.zzd;
                } else {
                    i2 = 0;
                }
                if (!zzaes.zzd(zzaepVar, iZzf)) {
                    return false;
                }
                this.zzc = i2;
            }
            int iZzf2 = zzf(i2);
            int i3 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzer zzerVar = this.zzb;
                zzerVar.zzc(zzerVar.zze() + iZzf2);
                if (!zzaes.zzc(zzaepVar, zzerVar.zzi(), zzerVar.zze(), iZzf2)) {
                    return false;
                }
                zzerVar.zzf(zzerVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }

    public final zzalh zzc() {
        return this.zza;
    }

    public final zzer zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzer zzerVar = this.zzb;
        if (zzerVar.zzi().length == 65025) {
            return;
        }
        zzerVar.zzb(Arrays.copyOf(zzerVar.zzi(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzerVar.zze())), zzerVar.zze());
    }
}
