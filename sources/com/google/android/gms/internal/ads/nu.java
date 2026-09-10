package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nu implements NativeMediationAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f17947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f17949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Location f17951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eo f17953g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17955i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f17954h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f17956j = new HashMap();

    public nu(Date date, int i10, HashSet hashSet, Location location, boolean z10, int i11, eo eoVar, List list, boolean z11) {
        this.f17947a = date;
        this.f17948b = i10;
        this.f17949c = hashSet;
        this.f17951e = location;
        this.f17950d = z10;
        this.f17952f = i11;
        this.f17953g = eoVar;
        this.f17955i = z11;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str2 = strArrSplit[2];
                        if (com.ironsource.mediationsdk.metadata.a.f29610g.equals(str2)) {
                            this.f17956j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f17956j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f17954h.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzeu.zzb().zzg();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.f17947a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f17948b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.f17949c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f17951e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        eo eoVar = this.f17953g;
        if (eoVar == null) {
            return builder.build();
        }
        int i10 = eoVar.f14030a;
        if (i10 == 2) {
            builder.setAdChoicesPlacement(eoVar.f14034e);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.setRequestCustomMuteThisAd(eoVar.f14036g);
                    builder.setMediaAspectRatio(eoVar.f14037h);
                }
            }
            zzfw zzfwVar = eoVar.f14035f;
            if (zzfwVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfwVar));
            }
            builder.setAdChoicesPlacement(eoVar.f14034e);
        }
        builder.setReturnUrlsForImageAssets(eoVar.f14031b);
        builder.setImageOrientation(eoVar.f14032c);
        builder.setRequestMultipleImages(eoVar.f14033d);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return eo.b(this.f17953g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzeu.zzb().zzi();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f17955i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f17950d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.f17954h.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f17952f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.f17954h.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zzb() {
        return this.f17956j;
    }
}
