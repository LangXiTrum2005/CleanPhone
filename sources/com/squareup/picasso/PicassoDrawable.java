package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
final class PicassoDrawable extends BitmapDrawable {
    private static final Paint DEBUG_PAINT = new Paint();
    private static final float FADE_DURATION = 200.0f;
    int alpha;
    boolean animating;
    private final boolean debugging;
    private final float density;
    private final Picasso.LoadedFrom loadedFrom;
    Drawable placeholder;
    long startTimeMillis;

    public PicassoDrawable(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z2, boolean z3) {
        super(context.getResources(), bitmap);
        this.alpha = 255;
        this.debugging = z3;
        this.density = context.getResources().getDisplayMetrics().density;
        this.loadedFrom = loadedFrom;
        if (loadedFrom == Picasso.LoadedFrom.MEMORY || z2) {
            return;
        }
        this.placeholder = drawable;
        this.animating = true;
        this.startTimeMillis = SystemClock.uptimeMillis();
    }

    private void drawDebugIndicator(Canvas canvas) {
        Paint paint = DEBUG_PAINT;
        paint.setColor(-1);
        canvas.drawPath(getTrianglePath(0, 0, (int) (this.density * 16.0f)), paint);
        paint.setColor(this.loadedFrom.debugColor);
        canvas.drawPath(getTrianglePath(0, 0, (int) (this.density * 15.0f)), paint);
    }

    private static Path getTrianglePath(int i2, int i3, int i4) {
        Path path = new Path();
        float f = i2;
        float f2 = i3;
        path.moveTo(f, f2);
        path.lineTo(i2 + i4, f2);
        path.lineTo(f, i3 + i4);
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setBitmap(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z2, boolean z3) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new PicassoDrawable(context, bitmap, drawable, loadedFrom, z2, z3));
    }

    public static void setPlaceholder(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.animating) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.startTimeMillis) / FADE_DURATION;
            if (fUptimeMillis >= 1.0f) {
                this.animating = false;
                this.placeholder = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.placeholder;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.alpha * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.alpha);
            }
        } else {
            super.draw(canvas);
        }
        if (this.debugging) {
            drawDebugIndicator(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.alpha = i2;
        Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
