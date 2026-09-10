package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbuf implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbjn zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbuf(Date date, int i2, Set set, Location location, boolean z2, int i3, zzbjn zzbjnVar, List list, boolean z3, int i4, String str) {
        this.zza = date;
        this.zzb = i2;
        this.zzc = set;
        this.zze = location;
        this.zzd = z2;
        this.zzf = i3;
        this.zzg = zzbjnVar;
        this.zzi = z3;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str3 = strArrSplit[2];
                        if (com.p004ironsource.mediationsdk.metadata.a.g.equals(str3)) {
                            this.zzj.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str3)) {
                            this.zzj.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzex.zzb().zzg();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        Parcelable.Creator<zzbjn> creator = zzbjn.CREATOR;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbjn zzbjnVar = this.zzg;
        if (zzbjnVar == null) {
            return builder.build();
        }
        int i2 = zzbjnVar.zza;
        if (i2 == 2) {
            builder.setAdChoicesPlacement(zzbjnVar.zze);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbjnVar.zzg);
                    builder.setMediaAspectRatio(zzbjnVar.zzh);
                }
            }
            com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbjnVar.zzf;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(zzbjnVar.zze);
        }
        builder.setReturnUrlsForImageAssets(zzbjnVar.zzb);
        builder.setImageOrientation(zzbjnVar.zzc);
        builder.setRequestMultipleImages(zzbjnVar.zzd);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbjn.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzex.zzb().zzi();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.zzh.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zzb() {
        return this.zzj;
    }
}
