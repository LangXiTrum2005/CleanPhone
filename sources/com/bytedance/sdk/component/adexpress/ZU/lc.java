package com.bytedance.sdk.component.adexpress.ZU;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private static final byte[] Lxb = Lxb("VP8X");

    public static void LD(ImageView imageView, byte[] bArr, int i, int i2) {
        if (TextUtils.equals("png", com.bytedance.sdk.component.utils.OY.Lxb(Arrays.copyOfRange(bArr, 0, com.bytedance.sdk.component.utils.OY.Lxb())))) {
            lk(imageView, bArr, i, i2);
        } else {
            Lxb(imageView, bArr, i, i2);
        }
    }

    private static byte[] Lxb(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    private static void ZU(ImageView imageView, byte[] bArr, int i, int i2) {
        Bitmap bitmapLxb = new com.bytedance.sdk.component.JXs.lk.LD.Lxb(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).Lxb(bArr);
        if (bitmapLxb != null) {
            imageView.setImageBitmap(bitmapLxb);
        }
    }

    private static void lk(ImageView imageView, byte[] bArr, int i, int i2) {
        ZU(imageView, bArr, i, i2);
    }

    public static void Lxb(ImageView imageView, byte[] bArr, int i, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                imageView.setImageDrawable(ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap)));
            } catch (IOException unused) {
            }
        } else {
            ZU(imageView, bArr, i, i2);
        }
    }

    public static boolean Lxb(byte[] bArr, int i) {
        try {
            boolean zLxb = Lxb(bArr, i + 12, Lxb);
            int i2 = i + 20;
            if (bArr.length <= i2) {
                return false;
            }
            boolean z = (bArr[i2] & 2) == 2;
            if (zLxb && z) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean Lxb(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
