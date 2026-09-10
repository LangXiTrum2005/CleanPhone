package com.bytedance.adsdk.ugeno.tvp.mml;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.a;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ud extends Drawable {
    private ImageView.ScaleType aaj;
    private float bjy;
    private ColorStateList exc;
    private Shader.TileMode exu;
    private Shader.TileMode fs;
    private float jl;
    private final RectF jpc;
    private final boolean[] jtx;
    private final RectF lnr;
    private final Bitmap mml;
    private final int mo;
    private final Paint mzz;
    private boolean rdp;
    private final RectF rq;
    private final Matrix to;
    private final Paint tvp;
    private final int wd;
    private boolean yt;
    private final RectF qdl = new RectF();
    private final RectF ud = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.tvp.mml.ud$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            qdl = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ud(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.lnr = rectF;
        this.jpc = new RectF();
        this.to = new Matrix();
        this.rq = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.fs = tileMode;
        this.exu = tileMode;
        this.rdp = true;
        this.bjy = 0.0f;
        this.jtx = new boolean[]{true, true, true, true};
        this.yt = false;
        this.jl = 0.0f;
        this.exc = ColorStateList.valueOf(-16777216);
        this.aaj = ImageView.ScaleType.FIT_CENTER;
        this.mml = bitmap;
        int width = bitmap.getWidth();
        this.mo = width;
        int height = bitmap.getHeight();
        this.wd = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.mzz = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.tvp = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.exc.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.jl);
    }

    public static ud qdl(Bitmap bitmap) {
        if (bitmap != null) {
            return new ud(bitmap);
        }
        return null;
    }

    public static Bitmap ud(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.rdp) {
            BitmapShader bitmapShader = new BitmapShader(this.mml, this.fs, this.exu);
            Shader.TileMode tileMode = this.fs;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.exu == tileMode2) {
                bitmapShader.setLocalMatrix(this.to);
            }
            this.mzz.setShader(bitmapShader);
            this.rdp = false;
        }
        if (this.yt) {
            if (this.jl <= 0.0f) {
                canvas.drawOval(this.ud, this.mzz);
                return;
            } else {
                canvas.drawOval(this.ud, this.mzz);
                canvas.drawOval(this.jpc, this.tvp);
                return;
            }
        }
        if (!qdl(this.jtx)) {
            canvas.drawRect(this.ud, this.mzz);
            if (this.jl > 0.0f) {
                canvas.drawRect(this.jpc, this.tvp);
                return;
            }
            return;
        }
        float f = this.bjy;
        if (this.jl <= 0.0f) {
            canvas.drawRoundRect(this.ud, f, f, this.mzz);
            qdl(canvas);
        } else {
            canvas.drawRoundRect(this.ud, f, f, this.mzz);
            canvas.drawRoundRect(this.jpc, f, f, this.tvp);
            qdl(canvas);
            ud(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mzz.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mzz.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.wd;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.exc.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.qdl.set(rect);
        qdl();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.exc.getColorForState(iArr, 0);
        if (this.tvp.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.tvp.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.mzz.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mzz.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.mzz.setDither(z2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.mzz.setFilterBitmap(z2);
        invalidateSelf();
    }

    public static Drawable qdl(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof ud) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.v(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i2), qdl(layerDrawable.getDrawable(i2)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapUd = ud(drawable);
        return bitmapUd != null ? new ud(bitmapUd) : drawable;
    }

    private void ud(Canvas canvas) {
        float f;
        float f2;
        if (ud(this.jtx) || this.bjy == 0.0f) {
            return;
        }
        RectF rectF = this.ud;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float fWidth = rectF.width() + f3;
        float fHeight = this.ud.height() + f4;
        float f5 = this.bjy;
        float f6 = this.jl / 2.0f;
        if (this.jtx[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.tvp);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.tvp);
        }
        if (!this.jtx[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.tvp);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.tvp);
            fWidth = fWidth;
        }
        if (this.jtx[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.tvp);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.tvp);
            f2 = fHeight;
        }
        if (this.jtx[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.tvp);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.tvp);
    }

    private void qdl() {
        float fWidth;
        float fHeight;
        int i2 = AnonymousClass1.qdl[this.aaj.ordinal()];
        if (i2 == 1) {
            this.jpc.set(this.qdl);
            RectF rectF = this.jpc;
            float f = this.jl;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.to.reset();
            this.to.setTranslate((int) android.support.v4.media.a.a(this.jpc.width(), this.mo, 0.5f, 0.5f), (int) android.support.v4.media.a.a(this.jpc.height(), this.wd, 0.5f, 0.5f));
        } else if (i2 == 2) {
            this.jpc.set(this.qdl);
            RectF rectF2 = this.jpc;
            float f2 = this.jl;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.to.reset();
            float fWidth2 = 0.0f;
            if (this.jpc.height() * this.mo > this.jpc.width() * this.wd) {
                fWidth = this.jpc.height() / this.wd;
                fHeight = 0.0f;
                fWidth2 = (this.jpc.width() - (this.mo * fWidth)) * 0.5f;
            } else {
                fWidth = this.jpc.width() / this.mo;
                fHeight = (this.jpc.height() - (this.wd * fWidth)) * 0.5f;
            }
            this.to.setScale(fWidth, fWidth);
            Matrix matrix = this.to;
            float f3 = this.jl;
            matrix.postTranslate((f3 / 2.0f) + ((int) (fWidth2 + 0.5f)), (f3 / 2.0f) + ((int) (fHeight + 0.5f)));
        } else if (i2 == 3) {
            this.to.reset();
            float fMin = (((float) this.mo) > this.qdl.width() || ((float) this.wd) > this.qdl.height()) ? Math.min(this.qdl.width() / this.mo, this.qdl.height() / this.wd) : 1.0f;
            float fWidth3 = (int) (((this.qdl.width() - (this.mo * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.qdl.height() - (this.wd * fMin)) * 0.5f) + 0.5f);
            this.to.setScale(fMin, fMin);
            this.to.postTranslate(fWidth3, fHeight2);
            this.jpc.set(this.lnr);
            this.to.mapRect(this.jpc);
            RectF rectF3 = this.jpc;
            float f4 = this.jl;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else if (i2 == 5) {
            this.jpc.set(this.lnr);
            this.to.setRectToRect(this.lnr, this.qdl, Matrix.ScaleToFit.END);
            this.to.mapRect(this.jpc);
            RectF rectF4 = this.jpc;
            float f5 = this.jl;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else if (i2 == 6) {
            this.jpc.set(this.lnr);
            this.to.setRectToRect(this.lnr, this.qdl, Matrix.ScaleToFit.START);
            this.to.mapRect(this.jpc);
            RectF rectF5 = this.jpc;
            float f6 = this.jl;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else if (i2 != 7) {
            this.jpc.set(this.lnr);
            this.to.setRectToRect(this.lnr, this.qdl, Matrix.ScaleToFit.CENTER);
            this.to.mapRect(this.jpc);
            RectF rectF6 = this.jpc;
            float f7 = this.jl;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        } else {
            this.jpc.set(this.qdl);
            RectF rectF7 = this.jpc;
            float f8 = this.jl;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.to.reset();
            this.to.setRectToRect(this.lnr, this.jpc, Matrix.ScaleToFit.FILL);
        }
        this.ud.set(this.jpc);
        this.rdp = true;
    }

    public ud ud(Shader.TileMode tileMode) {
        if (this.exu != tileMode) {
            this.exu = tileMode;
            this.rdp = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ud(boolean[] zArr) {
        for (boolean z2 : zArr) {
            if (z2) {
                return false;
            }
        }
        return true;
    }

    private void qdl(Canvas canvas) {
        if (ud(this.jtx) || this.bjy == 0.0f) {
            return;
        }
        RectF rectF = this.ud;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.ud.height() + f2;
        float f3 = this.bjy;
        if (!this.jtx[0]) {
            this.rq.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.rq, this.mzz);
        }
        if (!this.jtx[1]) {
            this.rq.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.rq, this.mzz);
        }
        if (!this.jtx[2]) {
            this.rq.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.rq, this.mzz);
        }
        if (this.jtx[3]) {
            return;
        }
        this.rq.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.rq, this.mzz);
    }

    public ud qdl(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.bjy = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.bjy = 0.0f;
            }
            boolean[] zArr = this.jtx;
            zArr[0] = f > 0.0f;
            zArr[1] = f2 > 0.0f;
            zArr[2] = f3 > 0.0f;
            zArr[3] = f4 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public ud qdl(float f) {
        this.jl = f;
        this.tvp.setStrokeWidth(f);
        return this;
    }

    public ud qdl(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.exc = colorStateList;
        this.tvp.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public ud qdl(boolean z2) {
        this.yt = z2;
        return this;
    }

    public ud qdl(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.aaj != scaleType) {
            this.aaj = scaleType;
            qdl();
        }
        return this;
    }

    public ud qdl(Shader.TileMode tileMode) {
        if (this.fs != tileMode) {
            this.fs = tileMode;
            this.rdp = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean qdl(boolean[] zArr) {
        for (boolean z2 : zArr) {
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
