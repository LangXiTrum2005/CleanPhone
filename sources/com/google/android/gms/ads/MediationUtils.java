package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.am;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MediationUtils {
    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0076 A[SYNTHETIC] */
    @Nullable
    public static AdSize findClosestSize(@NonNull Context context, @NonNull AdSize adSize, @NonNull List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.f10635f && !adSize.f10637h) {
                float f10 = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f10), Math.round(adSize.getHeightInPixels(context) / f10));
            }
            float fFloatValue = ((Float) zzba.zzc().a(am.f12140eg)).floatValue();
            float fFloatValue2 = ((Float) zzba.zzc().a(am.f12157fg)).floatValue();
            int iIntValue = ((Integer) zzba.zzc().a(am.f12180h9)).intValue();
            int iIntValue2 = ((Integer) zzba.zzc().a(am.f12197i9)).intValue();
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    int height2 = adSize3.getHeight();
                    if ((width * fFloatValue) - width2 <= 1.0E-6f && width >= width2) {
                        if (adSize.f10637h) {
                            int i10 = adSize.f10638i;
                            if (iIntValue <= width2 && iIntValue2 <= height2 && i10 >= height2) {
                                if (adSize2 != null) {
                                    if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                    }
                                }
                                adSize2 = adSize3;
                            }
                        } else if (adSize.f10635f) {
                            if (adSize.f10636g >= height2) {
                                if (adSize2 != null) {
                                    if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                    }
                                }
                                adSize2 = adSize3;
                            }
                        } else if ((height * fFloatValue2) - height2 <= 1.0E-6f && height >= height2) {
                            if (adSize2 != null) {
                                if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                }
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
