package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    Bundle zza;
    Feature[] zzb;
    int zzc;
    ConnectionTelemetryConfiguration zzd;

    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzb, i2, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i2, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArr;
        this.zzc = i2;
        this.zzd = connectionTelemetryConfiguration;
    }
}
