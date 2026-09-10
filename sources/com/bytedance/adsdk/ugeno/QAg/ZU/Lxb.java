package com.bytedance.adsdk.ugeno.QAg.ZU;

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
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.Lxb.JXs;
import com.bytedance.adsdk.ugeno.Lxb.lc;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends ImageView implements JXs, IAnimation {
    static final /* synthetic */ boolean LD = true;
    public static final Shader.TileMode Lxb = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] ZU = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private com.bytedance.adsdk.ugeno.lk DY;
    private int IeN;
    private Drawable JVA;
    private final float[] JXs;
    private boolean NXR;
    private float OY;
    private ColorFilter QAg;
    private boolean STP;
    private lc Sfi;
    private int VVE;
    private Shader.TileMode brP;
    private ColorStateList ebl;
    private ImageView.ScaleType kqm;
    private Drawable lc;
    private float lk;
    private boolean nBu;
    private boolean sLN;
    private Shader.TileMode tD;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.QAg.ZU.Lxb$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            Lxb = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Lxb[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Lxb[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Lxb[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Lxb[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public Lxb(Context context) {
        super(context);
        this.JXs = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.ebl = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.OY = 0.0f;
        this.QAg = null;
        this.nBu = false;
        this.sLN = false;
        this.NXR = false;
        this.STP = false;
        Shader.TileMode tileMode = Lxb;
        this.brP = tileMode;
        this.tD = tileMode;
        this.Sfi = new lc(this);
    }

    private Drawable LD() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.VVE;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.VVE = 0;
            }
        }
        return LD.Lxb(drawable);
    }

    private Drawable Lxb() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.IeN;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.IeN = 0;
            }
        }
        return LD.Lxb(drawable);
    }

    private void ZU() {
        Drawable drawable = this.JVA;
        if (drawable == null || !this.nBu) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.JVA = drawableMutate;
        if (this.sLN) {
            drawableMutate.setColorFilter(this.QAg);
        }
    }

    private void lk() {
        Lxb(this.JVA, this.kqm);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.ebl.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.ebl;
    }

    public float getBorderRadius() {
        return this.Sfi.Lxb();
    }

    public float getBorderWidth() {
        return this.OY;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.JXs) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRipple() {
        return this.lk;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRubIn() {
        return this.Sfi.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.kqm;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getShine() {
        return this.Sfi.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getStretch() {
        return this.Sfi.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.brP;
    }

    public Shader.TileMode getTileModeY() {
        return this.tD;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.DY;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.DY;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.lk lkVar = this.DY;
        if (lkVar != null) {
            lkVar.Lxb(canvas, this);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.lk lkVar = this.DY;
        if (lkVar != null) {
            lkVar.Lxb(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.lk lkVar = this.DY;
        if (lkVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] iArrLxb = lkVar.Lxb(i, i2);
            super.onMeasure(iArrLxb[0], iArrLxb[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.lk lkVar = this.DY;
        if (lkVar != null) {
            lkVar.LD(i, i2, i3, i3);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.lc = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.lc = drawable;
        Lxb(true);
        super.setBackgroundDrawable(this.lc);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.VVE != i) {
            this.VVE = i;
            Drawable drawableLD = LD();
            this.lc = drawableLD;
            setBackgroundDrawable(drawableLD);
        }
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderRadius(float f) {
        lc lcVar = this.Sfi;
        if (lcVar != null) {
            lcVar.Lxb(f);
        }
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.QAg != colorFilter) {
            this.QAg = colorFilter;
            this.sLN = true;
            this.nBu = true;
            ZU();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        Lxb(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        Lxb(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.IeN = 0;
        this.JVA = LD.Lxb(bitmap);
        lk();
        super.setImageDrawable(this.JVA);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.IeN = 0;
        this.JVA = LD.Lxb(drawable);
        lk();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.IeN != i) {
            this.IeN = i;
            this.JVA = Lxb();
            lk();
            super.setImageDrawable(this.JVA);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.NXR = z;
        lk();
        Lxb(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.lk = f;
        lc lcVar = this.Sfi;
        if (lcVar != null) {
            lcVar.LD(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        lc lcVar = this.Sfi;
        if (lcVar != null) {
            lcVar.JXs(f);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!LD && scaleType == null) {
            throw new AssertionError();
        }
        if (this.kqm != scaleType) {
            this.kqm = scaleType;
            int i = AnonymousClass1.Lxb[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            lk();
            Lxb(false);
            invalidate();
        }
    }

    public void setShine(float f) {
        lc lcVar = this.Sfi;
        if (lcVar != null) {
            lcVar.lk(f);
        }
    }

    public void setStretch(float f) {
        lc lcVar = this.Sfi;
        if (lcVar != null) {
            lcVar.ZU(f);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.brP == tileMode) {
            return;
        }
        this.brP = tileMode;
        lk();
        Lxb(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.tD == tileMode) {
            return;
        }
        this.tD = tileMode;
        lk();
        Lxb(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.ebl.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.ebl = colorStateList;
        lk();
        Lxb(false);
        if (this.OY > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.OY == f) {
            return;
        }
        this.OY = f;
        lk();
        Lxb(false);
        invalidate();
    }

    private void Lxb(boolean z) {
        if (this.STP) {
            if (z) {
                this.lc = LD.Lxb(this.lc);
            }
            Lxb(this.lc, ImageView.ScaleType.FIT_XY);
        }
    }

    private void Lxb(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof LD) {
            LD ld = (LD) drawable;
            ld.Lxb(scaleType).Lxb(this.OY).Lxb(this.ebl).Lxb(this.NXR).Lxb(this.brP).LD(this.tD);
            float[] fArr = this.JXs;
            if (fArr != null) {
                ld.Lxb(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            ZU();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Lxb(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    public void Lxb(float f, float f2, float f3, float f4) {
        float[] fArr = this.JXs;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        lk();
        Lxb(false);
        invalidate();
    }

    public void Lxb(com.bytedance.adsdk.ugeno.lk lkVar) {
        this.DY = lkVar;
    }
}
