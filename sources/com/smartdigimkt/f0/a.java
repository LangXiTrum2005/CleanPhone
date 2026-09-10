package com.smartdigimkt.f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.smartdigimkt.v0.p;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static Drawable a(Resources resources, Bitmap bitmap) {
        return new BitmapDrawable(resources, bitmap);
    }

    public static Bitmap b(Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f2 = width / 2;
            f3 = width;
            f4 = 0.0f;
            f = f3;
        } else {
            float f5 = (width - height) / 2;
            float f6 = height;
            f = width - f5;
            width = height;
            f2 = height / 2;
            f3 = f6;
            f4 = f5;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            int i2 = (int) 0.0f;
            int i3 = (int) f3;
            Rect rect = new Rect((int) f4, i2, (int) f, i3);
            Rect rect2 = new Rect(i2, i2, i3, i3);
            RectF rectF = new RectF(rect2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f2, f2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Bitmap a(String str) {
        Bitmap bitmapDecodeFile = null;
        if (!p.f(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inDither = true;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            System.gc();
            b.b();
            try {
                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return bitmapDecodeFile;
            } catch (OutOfMemoryError e3) {
                e3.printStackTrace();
                return bitmapDecodeFile;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(BitmapFactory.Options options, int i2, int i3) {
        int iMin;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int iCeil = i3 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / ((double) i3)));
        if (i2 == -1) {
            iMin = 128;
        } else {
            double d3 = i2;
            iMin = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (iMin >= iCeil) {
            if (i3 == -1 && i2 == -1) {
                return 1;
            }
            if (i2 != -1) {
                return iMin;
            }
        }
        return iCeil;
    }

    public static Bitmap a(Context context, int i2) {
        Bitmap bitmapDecodeResource;
        try {
            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i2);
        } catch (Exception unused) {
            bitmapDecodeResource = null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            bitmapDecodeResource = null;
        }
        return bitmapDecodeResource == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8) : bitmapDecodeResource;
    }

    public static InputStream a(Bitmap bitmap) {
        return com.smartdigimkt.o8.b.a(bitmap);
    }
}
