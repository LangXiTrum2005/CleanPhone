package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3239t2 implements M0 {
    public final AdConfig.AdQualityConfig a;

    public AbstractC3239t2(AdConfig.AdQualityConfig adQualityConfig) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        double resizedPercentage = (((double) this.a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getWidth());
        double resizedPercentage2 = (((double) this.a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.a.getMaxImageSize()) {
            return bitmapCreateScaledBitmap;
        }
        while (length > this.a.getMaxImageSize()) {
            double dSqrt = Math.sqrt(((double) this.a.getMaxImageSize()) / ((double) length));
            resizedPercentage *= dSqrt;
            resizedPercentage2 *= dSqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return bitmapCreateScaledBitmap;
            }
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream.reset();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            length = byteArrayOutputStream.toByteArray().length;
        }
        byteArrayOutputStream.size();
        return bitmapCreateScaledBitmap;
    }
}
