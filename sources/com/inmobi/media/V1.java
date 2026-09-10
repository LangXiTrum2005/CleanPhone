package com.inmobi.media;

import android.graphics.Bitmap;
import android.util.Log;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class V1 implements InterfaceC3169p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f23291a;

    public V1(AdConfig.AdQualityConfig adQualityConfig) {
        Intrinsics.f(adQualityConfig, "adQualityConfig");
        this.f23291a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        Intrinsics.f(bitmap, "bitmap");
        double resizedPercentage = (((double) this.f23291a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getWidth());
        double resizedPercentage2 = (((double) this.f23291a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        Intrinsics.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f23291a.getMaxImageSize()) {
            return bitmapCreateScaledBitmap;
        }
        StringBuilder sb = new StringBuilder("resize - original - ");
        sb.append(resizedPercentage);
        String str = "  - ";
        sb.append("  - ");
        sb.append(resizedPercentage2);
        sb.append(" - size - ");
        sb.append(length);
        String message = sb.toString();
        Intrinsics.f(message, "message");
        Log.i("BaseScreenShotProcess", message);
        while (length > this.f23291a.getMaxImageSize()) {
            String str2 = str;
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            double dSqrt = Math.sqrt(((double) this.f23291a.getMaxImageSize()) / ((double) length));
            resizedPercentage *= dSqrt;
            resizedPercentage2 *= dSqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return bitmapCreateScaledBitmap;
            }
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            Intrinsics.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream2.reset();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
            length = byteArrayOutputStream2.toByteArray().length;
            str = str2;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        String message2 = "resize - " + resizedPercentage + str + resizedPercentage2 + " - " + byteArrayOutputStream.size();
        Intrinsics.f(message2, "message");
        Log.i("BaseScreenShotProcess", message2);
        return bitmapCreateScaledBitmap;
    }
}
