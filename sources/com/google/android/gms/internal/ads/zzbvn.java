package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.thinkup.core.common.n.mo;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbvn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvn> CREATOR = new zzbvo();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbvn(int i2, int i3, int i4) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    public static zzbvn zza(VersionInfo versionInfo) {
        return new zzbvn(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvn)) {
            zzbvn zzbvnVar = (zzbvn) obj;
            if (zzbvnVar.zzc == this.zzc && zzbvnVar.zzb == this.zzb && zzbvnVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i2 = this.zza;
        int length = String.valueOf(i2).length();
        int i3 = this.zzb;
        int length2 = String.valueOf(i3).length();
        int i4 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i4).length());
        androidx.datastore.preferences.protobuf.a.y(sb, i2, mo.ono, i3, mo.ono);
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
