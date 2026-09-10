package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.sdk.openadsdk.core.di.ka {
    private int lr;
    private int ri;

    public ri(Context context) {
        super(context);
        this.ri = 0;
        this.lr = 0;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.ri == 0) {
            this.ri = getWidth();
        }
        if (this.lr == 0) {
            this.lr = getHeight();
        }
        int i = this.ri;
        int i2 = this.lr;
        if (i >= i2) {
            i = i2;
        }
        return i / 2;
    }

    private boolean lr() {
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            return (getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() == null;
        }
        return true;
    }

    private boolean ri() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapCopy;
        Bitmap bitmapRi;
        if (ri()) {
            return;
        }
        measure(0, 0);
        if (lr()) {
            return;
        }
        try {
            bitmapCopy = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            super.onDraw(canvas);
            return;
        }
        int radius = getRadius();
        try {
            bitmapRi = ri(bitmapCopy, radius);
        } catch (Throwable unused2) {
            bitmapRi = null;
        }
        if (bitmapRi == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapRi, (this.ri / 2) - radius, (this.lr / 2) - radius, (Paint) null);
        }
    }

    private Bitmap ri(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        int i2 = i * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            bitmapCreateBitmap = height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (bitmapCreateBitmap != null) {
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i2) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, true);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap2;
    }
}
