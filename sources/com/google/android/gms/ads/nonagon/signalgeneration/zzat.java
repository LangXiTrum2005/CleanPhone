package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.qj;
import com.ironsource.mediationsdk.j;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11434a;

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f11434a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.f11434a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final qj zzc() {
        String str = this.f11434a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return qj.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return qj.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return qj.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals(j.f29553a)) {
                    return qj.BANNER;
                }
                break;
        }
        return qj.AD_INITIATER_UNSPECIFIED;
    }
}
