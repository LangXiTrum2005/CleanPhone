package com.bytedance.sdk.component.mzz.mml.lnr.ud;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    public static final ImageView.ScaleType qdl = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config ud = Bitmap.Config.ARGB_4444;
    private final ImageView.ScaleType jpc;
    private final Bitmap.Config lnr;
    private int mml;
    private final int mo;
    private int mzz;
    private final int wd;
    private final int tvp = 1280;
    private final int to = 83886080;

    public ud(int i2, int i3, ImageView.ScaleType scaleType, Bitmap.Config config, int i4, int i5) {
        this.lnr = config;
        this.mml = i2;
        this.mzz = i3;
        this.jpc = scaleType;
        this.mo = i4;
        this.wd = i5;
        qdl(i2, i3);
    }

    private static int qdl(int i2, int i3, int i4, int i5) {
        if (i2 == 0 && i3 == 0) {
            return i4;
        }
        if (i2 == 0) {
            return (int) (((double) i4) * (((double) i3) / ((double) i5)));
        }
        if (i3 == 0) {
            return i2;
        }
        double d = ((double) i5) / ((double) i4);
        double d2 = i3;
        return ((double) i2) * d > d2 ? (int) (d2 / d) : i2;
    }

    public static int qdl(int i2, int i3, int i4, int i5, int i6, int i7) {
        double dMin = Math.min(((double) i2) / ((double) i4), ((double) i3) / ((double) i5));
        if (i6 > 0 && i7 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i2, i3)) / ((double) Math.max(i6, i7)), ((double) Math.min(i2, i3)) / ((double) Math.min(i6, i7))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    public Bitmap qdl(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mml == 0 && this.mzz == 0) {
            options.inPreferredConfig = this.lnr;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            int iQdl = qdl(this.mml, this.mzz, i2, i3);
            int iQdl2 = qdl(this.mzz, this.mml, i3, i2);
            options.inJustDecodeBounds = false;
            options.inSampleSize = qdl(i2, i3, iQdl, iQdl2, this.mo, this.wd);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iQdl || bitmapDecodeByteArray.getHeight() > iQdl2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iQdl, iQdl2, true);
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

    private void qdl(int i2, int i3) {
        if (i2 > 1280 && i3 > 1280) {
            if (i2 > i3) {
                this.mml = 1280;
                this.mzz = (i3 * 1280) / i2;
                return;
            } else {
                this.mml = (i2 * 1280) / i3;
                this.mzz = 1280;
                return;
            }
        }
        if (i2 > 1280) {
            this.mml = 1280;
            this.mzz = (i3 * 1280) / i2;
        } else if (i3 > 1280) {
            this.mml = (i2 * 1280) / i3;
            this.mzz = 1280;
        }
    }
}
