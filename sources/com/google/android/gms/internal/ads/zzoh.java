package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzoh {
    public static final zzoh zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzfxs zzd;

    static {
        zzoh zzohVar;
        if (zzei.zza >= 33) {
            zzfxr zzfxrVar = new zzfxr();
            for (int i = 1; i <= 10; i++) {
                zzfxrVar.zzf(Integer.valueOf(zzei.zzi(i)));
            }
            zzohVar = new zzoh(2, zzfxrVar.zzi());
        } else {
            zzohVar = new zzoh(2, 10);
        }
        zza = zzohVar;
    }

    public zzoh(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoh)) {
            return false;
        }
        zzoh zzohVar = (zzoh) obj;
        return this.zzb == zzohVar.zzb && this.zzc == zzohVar.zzc && Objects.equals(this.zzd, zzohVar.zzd);
    }

    public final int hashCode() {
        zzfxs zzfxsVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfxsVar == null ? 0 : zzfxsVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i, zze zzeVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzei.zza < 29) {
            Integer num = (Integer) zzoi.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int iZzi = zzei.zzi(i3);
            if (iZzi != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(iZzi).build(), zzeVar.zza().zza)) {
                return i3;
            }
        }
        return 0;
    }

    public final boolean zzb(int i) {
        if (this.zzd == null) {
            return i <= this.zzc;
        }
        int iZzi = zzei.zzi(i);
        if (iZzi == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(iZzi));
    }

    @RequiresApi(33)
    public zzoh(int i, Set set) {
        this.zzb = i;
        zzfxs zzfxsVarZzl = zzfxs.zzl(set);
        this.zzd = zzfxsVarZzl;
        zzfzt it = zzfxsVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
