package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbjn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjn> CREATOR = new zzbjo();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final com.google.android.gms.ads.internal.client.zzga zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbjn(int i2, boolean z2, int i3, boolean z3, int i4, com.google.android.gms.ads.internal.client.zzga zzgaVar, boolean z4, int i5, int i6, boolean z5, int i7) {
        this.zza = i2;
        this.zzb = z2;
        this.zzc = i3;
        this.zzd = z3;
        this.zze = i4;
        this.zzf = zzgaVar;
        this.zzg = z4;
        this.zzh = i5;
        this.zzj = z5;
        this.zzi = i6;
        this.zzk = i7;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static NativeAdOptions zza(zzbjn zzbjnVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbjnVar == null) {
            return builder.build();
        }
        int i2 = zzbjnVar.zza;
        int i3 = 2;
        if (i2 == 2) {
            builder.setAdChoicesPlacement(zzbjnVar.zze);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbjnVar.zzg);
                    builder.setMediaAspectRatio(zzbjnVar.zzh);
                    builder.enableCustomClickGestureDirection(zzbjnVar.zzi, zzbjnVar.zzj);
                    int i4 = zzbjnVar.zzk;
                    if (i4 == 0) {
                        i3 = 1;
                    } else if (i4 == 2) {
                        i3 = 3;
                    } else if (i4 != 1) {
                        i3 = 1;
                    }
                    builder.zzi(i3);
                }
            }
            com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbjnVar.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(zzbjnVar.zze);
        }
        builder.setReturnUrlsForImageAssets(zzbjnVar.zzb);
        builder.setRequestMultipleImages(zzbjnVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i2, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Deprecated
    public zzbjn(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
