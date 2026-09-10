package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.applovin.impl.Z;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    final int zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;

    @Nullable
    private final List zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    public WakeLockEvent(int i2, long j, int i3, String str, int i4, @Nullable List list, String str2, long j2, int i5, String str3, String str4, float f, long j3, String str5, boolean z2) {
        this.zza = i2;
        this.zzb = j;
        this.zzc = i3;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i4;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i5;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List list = this.zzh;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.zzk;
        String str = this.zze;
        String str2 = this.zzl;
        float f = this.zzm;
        String str3 = this.zzf;
        int i3 = this.zzg;
        String str4 = this.zzd;
        boolean z2 = this.zzo;
        int length = String.valueOf(i2).length() + String.valueOf(i3).length() + String.valueOf(str4).length() + 2 + 1 + String.valueOf(strJoin).length() + 1;
        if (str == null) {
            str = "";
        }
        int iD = Z.d(str, length + 1, 1);
        if (str2 == null) {
            str2 = "";
        }
        int length2 = String.valueOf(f).length() + Z.d(str2, iD, 1) + 1;
        String str5 = str3 != null ? str3 : "";
        StringBuilder sb = new StringBuilder(Z.d(str5, length2, 1) + String.valueOf(z2).length());
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i2);
        a.C(sb, "\t", str, "\t", str2);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z2);
        return sb.toString();
    }
}
