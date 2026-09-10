package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import com.p004ironsource.d9;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzpo {
    public static final zzpo zza;
    public final int zzb;
    public final int zzc;
    private final zzgtn zzd;

    static {
        zzpo zzpoVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgtm zzgtmVar = new zzgtm();
            for (int i2 = 1; i2 <= 10; i2++) {
                zzgtmVar.zzf(Integer.valueOf(zzfj.zzB(i2)));
            }
            zzpoVar = new zzpo(2, zzgtmVar.zzi());
        } else {
            zzpoVar = new zzpo(2, 10);
        }
        zza = zzpoVar;
    }

    public zzpo(int i2, int i3) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpo)) {
            return false;
        }
        zzpo zzpoVar = (zzpo) obj;
        return this.zzb == zzpoVar.zzb && this.zzc == zzpoVar.zzc && Objects.equals(this.zzd, zzpoVar.zzd);
    }

    public final int hashCode() {
        zzgtn zzgtnVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgtnVar == null ? 0 : zzgtnVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i2 = this.zzb;
        int length = String.valueOf(i2).length();
        int i3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i3).length() + 15 + strValueOf.length() + 1);
        androidx.datastore.preferences.protobuf.a.z(sb, "AudioProfile[format=", i2, ", maxChannelCount=", i3);
        return android.support.v4.media.a.s(sb, ", channelMasks=", strValueOf, d9.i.f24752e);
    }

    public final boolean zza(int i2) {
        zzgtn zzgtnVar = this.zzd;
        if (zzgtnVar == null) {
            return i2 <= this.zzc;
        }
        int iZzB = zzfj.zzB(i2);
        if (iZzB == 0) {
            return false;
        }
        return zzgtnVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i2, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzpp.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i3 = this.zzb;
        for (int i4 = 10; i4 > 0; i4--) {
            int iZzB = zzfj.zzB(i4);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i2).setChannelMask(iZzB).build(), zzdVar.zza())) {
                return i4;
            }
        }
        return 0;
    }

    public zzpo(int i2, Set set) {
        this.zzb = i2;
        zzgtn zzgtnVarZzo = zzgtn.zzo(set);
        this.zzd = zzgtnVarZzo;
        zzgvr it = zzgtnVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
