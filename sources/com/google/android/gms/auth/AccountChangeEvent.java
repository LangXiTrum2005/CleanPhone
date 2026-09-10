package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes3.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
    final int zza;
    final long zzb;
    final String zzc;
    final int zzd;
    final int zze;
    final String zzf;

    public AccountChangeEvent(int i2, long j, String str, int i3, int i4, String str2) {
        this.zza = i2;
        this.zzb = j;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.zza == accountChangeEvent.zza && this.zzb == accountChangeEvent.zzb && Objects.equal(this.zzc, accountChangeEvent.zzc) && this.zzd == accountChangeEvent.zzd && this.zze == accountChangeEvent.zze && Objects.equal(this.zzf, accountChangeEvent.zzf);
    }

    public String getAccountName() {
        return this.zzc;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
    }

    public String toString() {
        String str;
        int i2 = this.zzd;
        if (i2 == 1) {
            str = "ADDED";
        } else if (i2 == 2) {
            str = "REMOVED";
        } else if (i2 != 3) {
            str = i2 != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        String str2 = this.zzc;
        String str3 = this.zzf;
        int i3 = this.zze;
        StringBuilder sbQ = a.q("AccountChangeEvent {accountName = ", str2, ", changeType = ", str, ", changeData = ");
        sbQ.append(str3);
        sbQ.append(", eventIndex = ");
        sbQ.append(i3);
        sbQ.append("}");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AccountChangeEvent(long j, String str, int i2, int i3, String str2) {
        this.zza = 1;
        this.zzb = j;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str2;
    }
}
