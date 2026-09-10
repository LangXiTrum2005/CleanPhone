package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.p004ironsource.d9;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcl {
    public static final zzcl zza = new zzcl(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcl(int i2, int i3, int i4) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzfj.zzA(i4) ? zzfj.zzD(i4) * i3 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i2 = this.zzb;
        int length = String.valueOf(i2).length();
        int i3 = this.zzc;
        int length2 = String.valueOf(i3).length();
        int i4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i4).length() + 1);
        androidx.datastore.preferences.protobuf.a.z(sb, "AudioFormat[sampleRate=", i2, ", channelCount=", i3);
        return Z.n(sb, ", encoding=", i4, d9.i.f24752e);
    }
}
