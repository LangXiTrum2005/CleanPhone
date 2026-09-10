package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import d5.u;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10638i;

    @NonNull
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");

    @NonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");

    @NonNull
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");

    @NonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");

    @NonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");

    @NonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @NonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");

    @NonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");

    @NonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");

    @NonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    /* JADX WARN: Illegal instructions before constructor call */
    public AdSize(int i10, int i11) {
        String strValueOf = i10 == -1 ? "FULL" : String.valueOf(i10);
        String strValueOf2 = i11 == -2 ? "AUTO" : String.valueOf(i11);
        this(i10, i11, u.h(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"));
    }

    @NonNull
    @Deprecated
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        AdSize adSizeZzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i10, 50, 0);
        adSizeZzk.f10633d = true;
        return adSizeZzk;
    }

    @NonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        int iZzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 0);
        if (iZzr == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.f10636g = iZzr;
        adSize.f10635f = true;
        return adSize;
    }

    @NonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        AdSize adSize = new AdSize(i10, 0);
        adSize.f10636g = i11;
        adSize.f10635f = true;
        if (i11 < 32) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 118);
            sb2.append("The maximum height set for the inline adaptive ad size was ");
            sb2.append(i11);
            sb2.append(" dp, which is below the minimum recommended value of 32 dp.");
            zzo.zzi(sb2.toString());
        }
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        AdSize adSizeZzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i10, 50, 2);
        adSizeZzk.f10633d = true;
        return adSizeZzk;
    }

    @NonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        int iZzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 2);
        AdSize adSize = new AdSize(i10, 0);
        if (iZzr == -1) {
            return INVALID;
        }
        adSize.f10636g = iZzr;
        adSize.f10635f = true;
        return adSize;
    }

    @NonNull
    public static AdSize getLargeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        AdSize adSizeZzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i10, 0);
        adSizeZzl.f10634e = true;
        return adSizeZzl;
    }

    @NonNull
    public static AdSize getLargeLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        AdSize adSizeZzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i10, 2);
        adSizeZzl.f10634e = true;
        return adSizeZzl;
    }

    @NonNull
    public static AdSize getLargePortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        AdSize adSizeZzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i10, 1);
        adSizeZzl.f10634e = true;
        return adSizeZzl;
    }

    @NonNull
    @Deprecated
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        AdSize adSizeZzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i10, 50, 1);
        adSizeZzk.f10633d = true;
        return adSizeZzk;
    }

    @NonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@NonNull Context context, int i10) {
        int iZzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 1);
        AdSize adSize = new AdSize(i10, 0);
        if (iZzr == -1) {
            return INVALID;
        }
        adSize.f10636g = iZzr;
        adSize.f10635f = true;
        return adSize;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f10630a == adSize.f10630a && this.f10631b == adSize.f10631b && this.f10632c.equals(adSize.f10632c);
    }

    public int getHeight() {
        return this.f10631b;
    }

    public int getHeightInPixels(@NonNull Context context) {
        int i10 = this.f10631b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return zzr.zza(context.getResources().getDisplayMetrics());
        }
        zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i10);
    }

    public int getWidth() {
        return this.f10630a;
    }

    public int getWidthInPixels(@NonNull Context context) {
        int i10 = this.f10630a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            zzay.zza();
            return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.f10632c.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f10631b == -2;
    }

    public boolean isFluid() {
        return this.f10630a == -3 && this.f10631b == -4;
    }

    public boolean isFullWidth() {
        return this.f10630a == -1;
    }

    @NonNull
    public String toString() {
        return this.f10632c;
    }

    public AdSize(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(d.k(new StringBuilder(String.valueOf(i10).length() + 26), "Invalid width for AdSize: ", i10));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(d.k(new StringBuilder(String.valueOf(i11).length() + 27), "Invalid height for AdSize: ", i11));
        }
        this.f10630a = i10;
        this.f10631b = i11;
        this.f10632c = str;
    }
}
