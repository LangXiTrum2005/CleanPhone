package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;
import com.ironsource.mediationsdk.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdSize[] f10897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10898b;

    public zzz(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adSizes);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f10897a = a(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f10897a = a(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adUnitId);
        this.f10898b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    public static AdSize[] a(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    String str2 = strArrSplit2[0];
                    int i11 = "FULL_WIDTH".equals(str2) ? -1 : Integer.parseInt(str2);
                    String str3 = strArrSplit2[1];
                    adSizeArr[i10] = new AdSize(i11, "AUTO_HEIGHT".equals(str3) ? -2 : Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if (j.f29553a.equals(strTrim)) {
                adSizeArr[i10] = AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.FULL_BANNER;
            } else if (j.f29556d.equals(strTrim)) {
                adSizeArr[i10] = AdSize.LEADERBOARD;
            } else if (j.f29559g.equals(strTrim)) {
                adSizeArr[i10] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                adSizeArr[i10] = AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(strTrim)) {
                adSizeArr[i10] = AdSize.FLUID;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                adSizeArr[i10] = AdSize.zza;
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final AdSize[] zza(boolean z10) {
        AdSize[] adSizeArr = this.f10897a;
        if (z10 || adSizeArr.length == 1) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String zzb() {
        return this.f10898b;
    }
}
