package com.bytedance.sdk.component.fi.lr.ik.lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.fi.lr.ik.di;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private final int di;
    private int fi;
    private final Bitmap.Config ik;
    private int ka;
    private final ImageView.ScaleType mj;
    private final int xha;
    public static final ImageView.ScaleType ri = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config lr = Bitmap.Config.ARGB_4444;
    private final int jbs = 1280;
    private final int qt = 83886080;

    public lr(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.ik = config;
        this.ka = i;
        this.fi = i2;
        this.mj = scaleType;
        this.di = i3;
        this.xha = i4;
        ri(i, i2);
    }

    private static int ri(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    public static int ri(int i, int i2, int i3, int i4, int i5, int i6) {
        double dMin = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        if (i5 > 0 && i6 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i, i2)) / ((double) Math.max(i5, i6)), ((double) Math.min(i, i2)) / ((double) Math.min(i5, i6))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    private float ri(int i, int i2, int i3, int i4, int i5) {
        float f = i;
        return Math.max(i4 / (i2 / f), i5 / (i3 / f));
    }

    public Bitmap ri(byte[] bArr, di diVar) {
        Context contextRi;
        boolean zLr;
        Bitmap bitmapDecodeByteArray;
        if (diVar != null) {
            contextRi = diVar.ri();
            zLr = diVar.lr();
        } else {
            contextRi = null;
            zLr = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.ka == 0 && this.fi == 0) {
            options.inPreferredConfig = this.ik;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int iRi = ri(this.ka, this.fi, i, i2);
            int iRi2 = ri(this.fi, this.ka, i2, i);
            options.inJustDecodeBounds = false;
            int iRi3 = ri(i, i2, iRi, iRi2, this.di, this.xha);
            options.inSampleSize = iRi3;
            float fRi = ri(iRi3, i, i2, iRi, iRi2);
            boolean z = fRi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fRi < 1.0f && contextRi != null && zLr;
            if (z) {
                options.inScaled = true;
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = Math.round(fRi * 2.1474836E9f);
            }
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (z && bitmapDecodeByteArray != null) {
                bitmapDecodeByteArray.setDensity(contextRi.getResources().getDisplayMetrics().densityDpi);
            }
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iRi || bitmapDecodeByteArray.getHeight() > iRi2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iRi, iRi2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void ri(int i, int i2) {
        if (i > 1280 && i2 > 1280) {
            if (i > i2) {
                this.ka = 1280;
                this.fi = (i2 * 1280) / i;
                return;
            } else {
                this.ka = (i * 1280) / i2;
                this.fi = 1280;
                return;
            }
        }
        if (i > 1280) {
            this.ka = 1280;
            this.fi = (i2 * 1280) / i;
        } else if (i2 > 1280) {
            this.ka = (i * 1280) / i2;
            this.fi = 1280;
        }
    }
}
