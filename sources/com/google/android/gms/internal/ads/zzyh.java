package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyh {
    public static final zzyh zza = new zzyh(new zzbg[0]);
    public final int zzb;
    private final zzgtd zzc;
    private int zzd;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public zzyh(zzbg... zzbgVarArr) {
        this.zzc = zzgtd.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i2 = 0;
        while (i2 < this.zzc.size()) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < this.zzc.size(); i4++) {
                if (((zzbg) this.zzc.get(i2)).equals(this.zzc.get(i4))) {
                    zzee.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyh.class == obj.getClass()) {
            zzyh zzyhVar = (zzyh) obj;
            if (this.zzb == zzyhVar.zzb && this.zzc.equals(zzyhVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i2) {
        return (zzbg) this.zzc.get(i2);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgtd zzc() {
        return zzgtd.zzq(zzgud.zzc(this.zzc, zzyg.zza));
    }
}
