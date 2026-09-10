package com.chartboost.heliumsdk.domain;

import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/PartnerAdUtils;", "", "()V", "getCreativeSizeFromPartnerAdDetails", "Landroid/util/Size;", "partnerAd", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "requestedSize", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerAdUtils {
    public static final PartnerAdUtils INSTANCE = new PartnerAdUtils();

    private PartnerAdUtils() {
    }

    public final Size getCreativeSizeFromPartnerAdDetails(PartnerAd partnerAd, Size requestedSize) {
        Intrinsics.f(partnerAd, "partnerAd");
        Intrinsics.f(requestedSize, "requestedSize");
        String str = partnerAd.getDetails().get("banner_width_dips");
        int i2 = str != null ? Integer.parseInt(str) : requestedSize.getWidth();
        String str2 = partnerAd.getDetails().get("banner_height_dips");
        return new Size(i2, str2 != null ? Integer.parseInt(str2) : requestedSize.getHeight());
    }
}
