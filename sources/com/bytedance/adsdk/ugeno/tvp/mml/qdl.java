package com.bytedance.adsdk.ugeno.tvp.mml;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.qdl.jpc;
import com.bytedance.adsdk.ugeno.qdl.wd;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends ImageView implements IAnimation, wd {
    static final /* synthetic */ boolean ud = true;
    private mml aaj;
    private int bjy;
    private Shader.TileMode exc;
    private boolean exu;
    private boolean fs;
    private Shader.TileMode jl;
    private float jpc;
    private int jtx;
    private jpc jyq;
    private float lnr;
    private Drawable mo;
    private final float[] mzz;
    private boolean rdp;
    private Drawable rq;
    private boolean to;
    private ColorFilter tvp;
    private ColorStateList wd;
    private ImageView.ScaleType yt;
    public static final Shader.TileMode qdl = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] mml = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.tvp.mml.qdl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            qdl = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qdl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public qdl(Context context) {
        super(context);
        this.mzz = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.wd = ColorStateList.valueOf(-16777216);
        this.jpc = 0.0f;
        this.tvp = null;
        this.to = false;
        this.fs = false;
        this.exu = false;
        this.rdp = false;
        Shader.TileMode tileMode = qdl;
        this.jl = tileMode;
        this.exc = tileMode;
        this.jyq = new jpc(this);
    }

    private void lnr() {
        qdl(this.rq, this.yt);
    }

    private void mml() {
        Drawable drawable = this.rq;
        if (drawable == null || !this.to) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.rq = drawableMutate;
        if (this.fs) {
            drawableMutate.setColorFilter(this.tvp);
        }
    }

    private Drawable qdl() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i2 = this.bjy;
        if (i2 != 0) {
            try {
                drawable = resources.getDrawable(i2);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.bjy, e2);
                this.bjy = 0;
            }
        }
        return ud.qdl(drawable);
    }

    private Drawable ud() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i2 = this.jtx;
        if (i2 != 0) {
            try {
                drawable = resources.getDrawable(i2);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.jtx, e2);
                this.jtx = 0;
            }
        }
        return ud.qdl(drawable);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.ud(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.wd.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.wd;
    }

    public float getBorderRadius() {
        return this.jyq.qdl();
    }

    public float getBorderWidth() {
        return this.jpc;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.mzz) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.jyq.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.yt;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.jyq.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.jyq.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.jl;
    }

    public Shader.TileMode getTileModeY() {
        return this.exc;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.qdl(canvas, this);
            this.aaj.qdl(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.qdl(i2, i3, i4, i5);
        }
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        mml mmlVar = this.aaj;
        if (mmlVar == null) {
            super.onMeasure(i2, i3);
        } else {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        mml mmlVar = this.aaj;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        this.mo = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.mo = drawable;
        qdl(true);
        super.setBackgroundDrawable(this.mo);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        if (this.jtx != i2) {
            this.jtx = i2;
            Drawable drawableUd = ud();
            this.mo = drawableUd;
            setBackgroundDrawable(drawableUd);
        }
    }

    public void setBorderColor(int i2) {
        setBorderColor(ColorStateList.valueOf(i2));
    }

    public void setBorderRadius(float f) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.qdl(f);
        }
    }

    public void setBorderWidth(int i2) {
        setBorderWidth(getResources().getDimension(i2));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.tvp != colorFilter) {
            this.tvp = colorFilter;
            this.fs = true;
            this.to = true;
            mml();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        qdl(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i2) {
        float dimension = getResources().getDimension(i2);
        qdl(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.bjy = 0;
        this.rq = ud.qdl(bitmap);
        lnr();
        super.setImageDrawable(this.rq);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.bjy = 0;
        this.rq = ud.qdl(drawable);
        lnr();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.bjy != i2) {
            this.bjy = i2;
            this.rq = qdl();
            lnr();
            super.setImageDrawable(this.rq);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z2) {
        this.exu = z2;
        lnr();
        qdl(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.lnr = f;
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.ud(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.mzz(f);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!ud && scaleType == null) {
            throw new AssertionError();
        }
        if (this.yt != scaleType) {
            this.yt = scaleType;
            int i2 = AnonymousClass1.qdl[scaleType.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            lnr();
            qdl(false);
            invalidate();
        }
    }

    public void setShine(float f) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.lnr(f);
        }
    }

    public void setStretch(float f) {
        jpc jpcVar = this.jyq;
        if (jpcVar != null) {
            jpcVar.mml(f);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.jl == tileMode) {
            return;
        }
        this.jl = tileMode;
        lnr();
        qdl(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.exc == tileMode) {
            return;
        }
        this.exc = tileMode;
        lnr();
        qdl(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.wd.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.wd = colorStateList;
        lnr();
        qdl(false);
        if (this.jpc > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.jpc == f) {
            return;
        }
        this.jpc = f;
        lnr();
        qdl(false);
        invalidate();
    }

    private void qdl(boolean z2) {
        if (this.rdp) {
            if (z2) {
                this.mo = ud.qdl(this.mo);
            }
            qdl(this.mo, ImageView.ScaleType.FIT_XY);
        }
    }

    private void qdl(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof ud) {
            ud udVar = (ud) drawable;
            udVar.qdl(scaleType).qdl(this.jpc).qdl(this.wd).qdl(this.exu).qdl(this.jl).ud(this.exc);
            float[] fArr = this.mzz;
            if (fArr != null) {
                udVar.qdl(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            mml();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                qdl(layerDrawable.getDrawable(i2), scaleType);
            }
        }
    }

    public void qdl(float f, float f2, float f3, float f4) {
        float[] fArr = this.mzz;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        lnr();
        qdl(false);
        invalidate();
    }

    public void qdl(mml mmlVar) {
        this.aaj = mmlVar;
    }
}
