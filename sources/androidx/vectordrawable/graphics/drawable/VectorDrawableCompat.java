package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ColorStateListInflaterCompat;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {
    public static final PorterDuff.Mode k0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public VectorDrawableCompatState f8479Y;
    public PorterDuffColorFilter Z;
    public ColorFilter e0;
    public boolean f0;
    public boolean g0;
    public final float[] h0;
    public final Matrix i0;
    public final Rect j0;

    public static class VClipPath extends VPath {
    }

    public static class VFullPath extends VPath {
        public ComplexColorCompat d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8480e;
        public ComplexColorCompat f;
        public float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8481h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f8482i;
        public float j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint.Cap f8483l;
        public Paint.Join m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f8484n;

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            return this.f.b() || this.d.b();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean b(int[] iArr) {
            boolean z2;
            ComplexColorCompat complexColorCompat = this.f;
            boolean z3 = false;
            if (complexColorCompat.b()) {
                ColorStateList colorStateList = complexColorCompat.f4265b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != complexColorCompat.f4266c) {
                    complexColorCompat.f4266c = colorForState;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            ComplexColorCompat complexColorCompat2 = this.d;
            if (complexColorCompat2.b()) {
                ColorStateList colorStateList2 = complexColorCompat2.f4265b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != complexColorCompat2.f4266c) {
                    complexColorCompat2.f4266c = colorForState2;
                    z3 = true;
                }
            }
            return z2 | z3;
        }

        public float getFillAlpha() {
            return this.f8481h;
        }

        public int getFillColor() {
            return this.f.f4266c;
        }

        public float getStrokeAlpha() {
            return this.g;
        }

        public int getStrokeColor() {
            return this.d.f4266c;
        }

        public float getStrokeWidth() {
            return this.f8480e;
        }

        public float getTrimPathEnd() {
            return this.j;
        }

        public float getTrimPathOffset() {
            return this.k;
        }

        public float getTrimPathStart() {
            return this.f8482i;
        }

        public void setFillAlpha(float f) {
            this.f8481h = f;
        }

        public void setFillColor(int i2) {
            this.f.f4266c = i2;
        }

        public void setStrokeAlpha(float f) {
            this.g = f;
        }

        public void setStrokeColor(int i2) {
            this.d.f4266c = i2;
        }

        public void setStrokeWidth(float f) {
            this.f8480e = f;
        }

        public void setTrimPathEnd(float f) {
            this.j = f;
        }

        public void setTrimPathOffset(float f) {
            this.k = f;
        }

        public void setTrimPathStart(float f) {
            this.f8482i = f;
        }
    }

    public static abstract class VObject {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class VectorDrawableCompatState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public VPathRenderer f8504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f8505c;
        public PorterDuff.Mode d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8506e;
        public Bitmap f;
        public ColorStateList g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f8507h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8508i;
        public boolean j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f8509l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8503a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }
    }

    public VectorDrawableCompat() {
        this.g0 = true;
        this.h0 = new float[9];
        this.i0 = new Matrix();
        this.j0 = new Rect();
        VectorDrawableCompatState vectorDrawableCompatState = new VectorDrawableCompatState();
        vectorDrawableCompatState.f8505c = null;
        vectorDrawableCompatState.d = k0;
        vectorDrawableCompatState.f8504b = new VPathRenderer();
        this.f8479Y = vectorDrawableCompatState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.X;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j0;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e0;
        if (colorFilter == null) {
            colorFilter = this.Z;
        }
        Matrix matrix = this.i0;
        canvas.getMatrix(matrix);
        float[] fArr = this.h0;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(a.f25965n, iWidth);
        int iMin2 = Math.min(a.f25965n, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && DrawableCompat.d(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        VectorDrawableCompatState vectorDrawableCompatState = this.f8479Y;
        Bitmap bitmap = vectorDrawableCompatState.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != vectorDrawableCompatState.f.getHeight()) {
            vectorDrawableCompatState.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            vectorDrawableCompatState.k = true;
        }
        if (this.g0) {
            VectorDrawableCompatState vectorDrawableCompatState2 = this.f8479Y;
            if (vectorDrawableCompatState2.k || vectorDrawableCompatState2.g != vectorDrawableCompatState2.f8505c || vectorDrawableCompatState2.f8507h != vectorDrawableCompatState2.d || vectorDrawableCompatState2.j != vectorDrawableCompatState2.f8506e || vectorDrawableCompatState2.f8508i != vectorDrawableCompatState2.f8504b.getRootAlpha()) {
                VectorDrawableCompatState vectorDrawableCompatState3 = this.f8479Y;
                vectorDrawableCompatState3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(vectorDrawableCompatState3.f);
                VPathRenderer vPathRenderer = vectorDrawableCompatState3.f8504b;
                vPathRenderer.a(vPathRenderer.g, VPathRenderer.f8494p, canvas2, iMin, iMin2);
                VectorDrawableCompatState vectorDrawableCompatState4 = this.f8479Y;
                vectorDrawableCompatState4.g = vectorDrawableCompatState4.f8505c;
                vectorDrawableCompatState4.f8507h = vectorDrawableCompatState4.d;
                vectorDrawableCompatState4.f8508i = vectorDrawableCompatState4.f8504b.getRootAlpha();
                vectorDrawableCompatState4.j = vectorDrawableCompatState4.f8506e;
                vectorDrawableCompatState4.k = false;
            }
        } else {
            VectorDrawableCompatState vectorDrawableCompatState5 = this.f8479Y;
            vectorDrawableCompatState5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(vectorDrawableCompatState5.f);
            VPathRenderer vPathRenderer2 = vectorDrawableCompatState5.f8504b;
            vPathRenderer2.a(vPathRenderer2.g, VPathRenderer.f8494p, canvas3, iMin, iMin2);
        }
        VectorDrawableCompatState vectorDrawableCompatState6 = this.f8479Y;
        if (vectorDrawableCompatState6.f8504b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (vectorDrawableCompatState6.f8509l == null) {
                Paint paint2 = new Paint();
                vectorDrawableCompatState6.f8509l = paint2;
                paint2.setFilterBitmap(true);
            }
            vectorDrawableCompatState6.f8509l.setAlpha(vectorDrawableCompatState6.f8504b.getRootAlpha());
            vectorDrawableCompatState6.f8509l.setColorFilter(colorFilter);
            paint = vectorDrawableCompatState6.f8509l;
        }
        canvas.drawBitmap(vectorDrawableCompatState6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getAlpha() : this.f8479Y.f8504b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f8479Y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.X;
        return drawable != null ? DrawableCompat.c(drawable) : this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.X != null) {
            return new VectorDrawableDelegateState(this.X.getConstantState());
        }
        this.f8479Y.f8503a = getChangingConfigurations();
        return this.f8479Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f8479Y.f8504b.f8500i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f8479Y.f8504b.f8499h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.isAutoMirrored() : this.f8479Y.f8506e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f8479Y;
        if (vectorDrawableCompatState == null) {
            return false;
        }
        VPathRenderer vPathRenderer = vectorDrawableCompatState.f8504b;
        if (vPathRenderer.f8502n == null) {
            vPathRenderer.f8502n = Boolean.valueOf(vPathRenderer.g.a());
        }
        if (vPathRenderer.f8502n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f8479Y.f8505c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f0 && super.mutate() == this) {
            VectorDrawableCompatState vectorDrawableCompatState = this.f8479Y;
            VectorDrawableCompatState vectorDrawableCompatState2 = new VectorDrawableCompatState();
            vectorDrawableCompatState2.f8505c = null;
            vectorDrawableCompatState2.d = k0;
            if (vectorDrawableCompatState != null) {
                vectorDrawableCompatState2.f8503a = vectorDrawableCompatState.f8503a;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.f8504b);
                vectorDrawableCompatState2.f8504b = vPathRenderer;
                if (vectorDrawableCompatState.f8504b.f8498e != null) {
                    vPathRenderer.f8498e = new Paint(vectorDrawableCompatState.f8504b.f8498e);
                }
                if (vectorDrawableCompatState.f8504b.d != null) {
                    vectorDrawableCompatState2.f8504b.d = new Paint(vectorDrawableCompatState.f8504b.d);
                }
                vectorDrawableCompatState2.f8505c = vectorDrawableCompatState.f8505c;
                vectorDrawableCompatState2.d = vectorDrawableCompatState.d;
                vectorDrawableCompatState2.f8506e = vectorDrawableCompatState.f8506e;
            }
            this.f8479Y = vectorDrawableCompatState2;
            this.f0 = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f8479Y;
        ColorStateList colorStateList = vectorDrawableCompatState.f8505c;
        if (colorStateList == null || (mode = vectorDrawableCompatState.d) == null) {
            z2 = false;
        } else {
            this.Z = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        VPathRenderer vPathRenderer = vectorDrawableCompatState.f8504b;
        if (vPathRenderer.f8502n == null) {
            vPathRenderer.f8502n = Boolean.valueOf(vPathRenderer.g.a());
        }
        if (vPathRenderer.f8502n.booleanValue()) {
            boolean zB = vectorDrawableCompatState.f8504b.g.b(iArr);
            vectorDrawableCompatState.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f8479Y.f8504b.getRootAlpha() != i2) {
            this.f8479Y.f8504b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f8479Y.f8506e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.i(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.j(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f8479Y;
        if (vectorDrawableCompatState.f8505c != colorStateList) {
            vectorDrawableCompatState.f8505c = colorStateList;
            this.Z = a(colorStateList, vectorDrawableCompatState.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.k(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f8479Y;
        if (vectorDrawableCompatState.d != mode) {
            vectorDrawableCompatState.d = mode;
            this.Z = a(vectorDrawableCompatState.f8505c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.X;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class VectorDrawableDelegateState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f8510a;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f8510a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f8510a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8510a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.X = (VectorDrawable) this.f8510a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.X = (VectorDrawable) this.f8510a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.X = (VectorDrawable) this.f8510a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    public static abstract class VPath extends VObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f8491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8493c;

        public VPath() {
            this.f8491a = null;
            this.f8493c = 0;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f8491a;
        }

        public String getPathName() {
            return this.f8492b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.a(this.f8491a, pathDataNodeArr)) {
                this.f8491a = PathParser.d(pathDataNodeArr);
                return;
            }
            PathParser.PathDataNode[] pathDataNodeArr2 = this.f8491a;
            for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                pathDataNodeArr2[i2].f4301a = pathDataNodeArr[i2].f4301a;
                int i3 = 0;
                while (true) {
                    float[] fArr = pathDataNodeArr[i2].f4302b;
                    if (i3 < fArr.length) {
                        pathDataNodeArr2[i2].f4302b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
        }

        public VPath(VPath vPath) {
            this.f8491a = null;
            this.f8493c = 0;
            this.f8492b = vPath.f8492b;
            this.f8491a = PathParser.d(vPath.f8491a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VPathRenderer vPathRenderer;
        int i2;
        boolean z2;
        char c2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.e(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f8479Y;
        vectorDrawableCompatState.f8504b = new VPathRenderer();
        TypedArray typedArrayC = TypedArrayUtils.c(resources, theme, attributeSet, AndroidResources.f8467a);
        VectorDrawableCompatState vectorDrawableCompatState2 = this.f8479Y;
        VPathRenderer vPathRenderer2 = vectorDrawableCompatState2.f8504b;
        int i5 = !TypedArrayUtils.b(xmlPullParser, "tintMode") ? -1 : typedArrayC.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        vectorDrawableCompatState2.d = mode;
        int i6 = 1;
        ColorStateList colorStateListA = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayC.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayC.getResources();
                int resourceId = typedArrayC.getResourceId(1, 0);
                ThreadLocal threadLocal = ColorStateListInflaterCompat.f4263a;
                try {
                    colorStateListA = ColorStateListInflaterCompat.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            vectorDrawableCompatState2.f8505c = colorStateList;
        }
        boolean z3 = vectorDrawableCompatState2.f8506e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z3 = typedArrayC.getBoolean(5, z3);
        }
        vectorDrawableCompatState2.f8506e = z3;
        float f = vPathRenderer2.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayC.getFloat(7, f);
        }
        vPathRenderer2.j = f;
        float f2 = vPathRenderer2.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayC.getFloat(8, f2);
        }
        vPathRenderer2.k = f2;
        boolean z4 = false;
        if (vPathRenderer2.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            vPathRenderer2.f8499h = typedArrayC.getDimension(3, vPathRenderer2.f8499h);
            float dimension = typedArrayC.getDimension(2, vPathRenderer2.f8500i);
            vPathRenderer2.f8500i = dimension;
            if (vPathRenderer2.f8499h <= 0.0f) {
                throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = vPathRenderer2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayC.getFloat(4, alpha);
                }
                vPathRenderer2.setAlpha(alpha);
                String string = typedArrayC.getString(0);
                if (string != null) {
                    vPathRenderer2.m = string;
                    vPathRenderer2.o.put(string, vPathRenderer2);
                }
                typedArrayC.recycle();
                vectorDrawableCompatState.f8503a = getChangingConfigurations();
                vectorDrawableCompatState.k = true;
                VectorDrawableCompatState vectorDrawableCompatState3 = this.f8479Y;
                VPathRenderer vPathRenderer3 = vectorDrawableCompatState3.f8504b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(vPathRenderer3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        VGroup vGroup = (VGroup) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        ArrayMap arrayMap = vPathRenderer3.o;
                        vPathRenderer = vPathRenderer3;
                        if (zEquals) {
                            VFullPath vFullPath = new VFullPath();
                            vFullPath.f8480e = 0.0f;
                            vFullPath.g = 1.0f;
                            vFullPath.f8481h = 1.0f;
                            i2 = depth;
                            vFullPath.f8482i = 0.0f;
                            vFullPath.j = 1.0f;
                            vFullPath.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            vFullPath.f8483l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            vFullPath.m = join2;
                            vFullPath.f8484n = 4.0f;
                            TypedArray typedArrayC2 = TypedArrayUtils.c(resources, theme, attributeSet, AndroidResources.f8469c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayC2.getString(0);
                                if (string2 != null) {
                                    vFullPath.f8492b = string2;
                                }
                                String string3 = typedArrayC2.getString(2);
                                if (string3 != null) {
                                    vFullPath.f8491a = PathParser.c(string3);
                                }
                                vFullPath.f = TypedArrayUtils.a(typedArrayC2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = vFullPath.f8481h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayC2.getFloat(12, f3);
                                }
                                vFullPath.f8481h = f3;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayC2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = vFullPath.f8483l;
                                if (i8 == 0) {
                                    cap = cap2;
                                } else if (i8 != 1) {
                                    cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                vFullPath.f8483l = cap;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayC2.getInt(9, -1) : -1;
                                Paint.Join join3 = vFullPath.m;
                                if (i9 == 0) {
                                    join = join2;
                                } else if (i9 != 1) {
                                    join = i9 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                vFullPath.m = join;
                                float f4 = vFullPath.f8484n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayC2.getFloat(10, f4);
                                }
                                vFullPath.f8484n = f4;
                                vFullPath.d = TypedArrayUtils.a(typedArrayC2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = vFullPath.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayC2.getFloat(11, f5);
                                }
                                vFullPath.g = f5;
                                float f6 = vFullPath.f8480e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayC2.getFloat(4, f6);
                                }
                                vFullPath.f8480e = f6;
                                float f7 = vFullPath.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayC2.getFloat(6, f7);
                                }
                                vFullPath.j = f7;
                                float f8 = vFullPath.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayC2.getFloat(7, f8);
                                }
                                vFullPath.k = f8;
                                float f9 = vFullPath.f8482i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayC2.getFloat(5, f9);
                                }
                                vFullPath.f8482i = f9;
                                int i10 = vFullPath.f8493c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i10 = typedArrayC2.getInt(13, i10);
                                }
                                vFullPath.f8493c = i10;
                            }
                            typedArrayC2.recycle();
                            vGroup.f8486b.add(vFullPath);
                            if (vFullPath.getPathName() != null) {
                                arrayMap.put(vFullPath.getPathName(), vFullPath);
                            }
                            vectorDrawableCompatState3.f8503a = vectorDrawableCompatState3.f8503a;
                            i4 = 1;
                            z5 = false;
                            c2 = '\b';
                            z2 = false;
                        } else {
                            i2 = depth;
                            c2 = '\b';
                            z2 = false;
                            if ("clip-path".equals(name)) {
                                VClipPath vClipPath = new VClipPath();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayC3 = TypedArrayUtils.c(resources, theme, attributeSet, AndroidResources.d);
                                    String string4 = typedArrayC3.getString(0);
                                    if (string4 != null) {
                                        vClipPath.f8492b = string4;
                                    }
                                    String string5 = typedArrayC3.getString(1);
                                    if (string5 != null) {
                                        vClipPath.f8491a = PathParser.c(string5);
                                    }
                                    vClipPath.f8493c = !TypedArrayUtils.b(xmlPullParser, "fillType") ? 0 : typedArrayC3.getInt(2, 0);
                                    typedArrayC3.recycle();
                                }
                                vGroup.f8486b.add(vClipPath);
                                if (vClipPath.getPathName() != null) {
                                    arrayMap.put(vClipPath.getPathName(), vClipPath);
                                }
                                vectorDrawableCompatState3.f8503a = vectorDrawableCompatState3.f8503a;
                            } else if ("group".equals(name)) {
                                VGroup vGroup2 = new VGroup();
                                TypedArray typedArrayC4 = TypedArrayUtils.c(resources, theme, attributeSet, AndroidResources.f8468b);
                                float f10 = vGroup2.f8487c;
                                if (TypedArrayUtils.b(xmlPullParser, "rotation")) {
                                    f10 = typedArrayC4.getFloat(5, f10);
                                }
                                vGroup2.f8487c = f10;
                                i4 = 1;
                                vGroup2.d = typedArrayC4.getFloat(1, vGroup2.d);
                                vGroup2.f8488e = typedArrayC4.getFloat(2, vGroup2.f8488e);
                                float f11 = vGroup2.f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayC4.getFloat(3, f11);
                                }
                                vGroup2.f = f11;
                                float f12 = vGroup2.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayC4.getFloat(4, f12);
                                }
                                vGroup2.g = f12;
                                float f13 = vGroup2.f8489h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayC4.getFloat(6, f13);
                                }
                                vGroup2.f8489h = f13;
                                float f14 = vGroup2.f8490i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayC4.getFloat(7, f14);
                                }
                                vGroup2.f8490i = f14;
                                String string6 = typedArrayC4.getString(0);
                                if (string6 != null) {
                                    vGroup2.k = string6;
                                }
                                vGroup2.c();
                                typedArrayC4.recycle();
                                vGroup.f8486b.add(vGroup2);
                                arrayDeque.push(vGroup2);
                                if (vGroup2.getGroupName() != null) {
                                    arrayMap.put(vGroup2.getGroupName(), vGroup2);
                                }
                                vectorDrawableCompatState3.f8503a = vectorDrawableCompatState3.f8503a;
                            }
                            i4 = 1;
                        }
                        i3 = i4;
                    } else {
                        vPathRenderer = vPathRenderer3;
                        i2 = depth;
                        z2 = z4;
                        c2 = '\b';
                        i3 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i6 = i3;
                    z4 = z2;
                    vPathRenderer3 = vPathRenderer;
                    depth = i2;
                }
                if (!z5) {
                    this.Z = a(vectorDrawableCompatState.f8505c, vectorDrawableCompatState.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayC.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public static class VGroup extends VObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f8485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f8486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8487c;
        public float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8488e;
        public float f;
        public float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8489h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f8490i;
        public final Matrix j;
        public String k;

        public VGroup() {
            this.f8485a = new Matrix();
            this.f8486b = new ArrayList();
            this.f8487c = 0.0f;
            this.d = 0.0f;
            this.f8488e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.f8489h = 0.0f;
            this.f8490i = 0.0f;
            this.j = new Matrix();
            this.k = null;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f8486b;
                if (i2 >= arrayList.size()) {
                    return false;
                }
                if (((VObject) arrayList.get(i2)).a()) {
                    return true;
                }
                i2++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean b(int[] iArr) {
            int i2 = 0;
            boolean zB = false;
            while (true) {
                ArrayList arrayList = this.f8486b;
                if (i2 >= arrayList.size()) {
                    return zB;
                }
                zB |= ((VObject) arrayList.get(i2)).b(iArr);
                i2++;
            }
        }

        public final void c() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.f8488e);
            matrix.postScale(this.f, this.g);
            matrix.postRotate(this.f8487c, 0.0f, 0.0f);
            matrix.postTranslate(this.f8489h + this.d, this.f8490i + this.f8488e);
        }

        public String getGroupName() {
            return this.k;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.f8488e;
        }

        public float getRotation() {
            return this.f8487c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.f8489h;
        }

        public float getTranslateY() {
            return this.f8490i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f8488e) {
                this.f8488e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f8487c) {
                this.f8487c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f8489h) {
                this.f8489h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f8490i) {
                this.f8490i = f;
                c();
            }
        }

        public VGroup(VGroup vGroup, ArrayMap arrayMap) {
            VPath vClipPath;
            this.f8485a = new Matrix();
            this.f8486b = new ArrayList();
            this.f8487c = 0.0f;
            this.d = 0.0f;
            this.f8488e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.f8489h = 0.0f;
            this.f8490i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.k = null;
            this.f8487c = vGroup.f8487c;
            this.d = vGroup.d;
            this.f8488e = vGroup.f8488e;
            this.f = vGroup.f;
            this.g = vGroup.g;
            this.f8489h = vGroup.f8489h;
            this.f8490i = vGroup.f8490i;
            String str = vGroup.k;
            this.k = str;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.j);
            ArrayList arrayList = vGroup.f8486b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof VGroup) {
                    this.f8486b.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        VFullPath vFullPath = (VFullPath) obj;
                        VFullPath vFullPath2 = new VFullPath(vFullPath);
                        vFullPath2.f8480e = 0.0f;
                        vFullPath2.g = 1.0f;
                        vFullPath2.f8481h = 1.0f;
                        vFullPath2.f8482i = 0.0f;
                        vFullPath2.j = 1.0f;
                        vFullPath2.k = 0.0f;
                        vFullPath2.f8483l = Paint.Cap.BUTT;
                        vFullPath2.m = Paint.Join.MITER;
                        vFullPath2.f8484n = 4.0f;
                        vFullPath2.d = vFullPath.d;
                        vFullPath2.f8480e = vFullPath.f8480e;
                        vFullPath2.g = vFullPath.g;
                        vFullPath2.f = vFullPath.f;
                        vFullPath2.f8493c = vFullPath.f8493c;
                        vFullPath2.f8481h = vFullPath.f8481h;
                        vFullPath2.f8482i = vFullPath.f8482i;
                        vFullPath2.j = vFullPath.j;
                        vFullPath2.k = vFullPath.k;
                        vFullPath2.f8483l = vFullPath.f8483l;
                        vFullPath2.m = vFullPath.m;
                        vFullPath2.f8484n = vFullPath.f8484n;
                        vClipPath = vFullPath2;
                    } else if (obj instanceof VClipPath) {
                        vClipPath = new VClipPath((VClipPath) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f8486b.add(vClipPath);
                    Object obj2 = vClipPath.f8492b;
                    if (obj2 != null) {
                        arrayMap.put(obj2, vClipPath);
                    }
                }
            }
        }
    }

    public VectorDrawableCompat(VectorDrawableCompatState vectorDrawableCompatState) {
        this.g0 = true;
        this.h0 = new float[9];
        this.i0 = new Matrix();
        this.j0 = new Rect();
        this.f8479Y = vectorDrawableCompatState;
        this.Z = a(vectorDrawableCompatState.f8505c, vectorDrawableCompatState.d);
    }

    public static class VPathRenderer {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Matrix f8494p = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f8495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f8496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f8497c;
        public Paint d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f8498e;
        public PathMeasure f;
        public final VGroup g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8499h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f8500i;
        public float j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8501l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Boolean f8502n;
        public final ArrayMap o;

        public VPathRenderer() {
            this.f8497c = new Matrix();
            this.f8499h = 0.0f;
            this.f8500i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.f8501l = 255;
            this.m = null;
            this.f8502n = null;
            this.o = new ArrayMap(0);
            this.g = new VGroup();
            this.f8495a = new Path();
            this.f8496b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(VGroup vGroup, Matrix matrix, Canvas canvas, int i2, int i3) {
            char c2;
            float f;
            int i4;
            VGroup vGroup2 = vGroup;
            char c3 = 1;
            vGroup2.f8485a.set(matrix);
            Matrix matrix2 = vGroup2.j;
            Matrix matrix3 = vGroup2.f8485a;
            matrix3.preConcat(matrix2);
            canvas.save();
            char c4 = 0;
            int i5 = 0;
            while (true) {
                ArrayList arrayList = vGroup2.f8486b;
                if (i5 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                VObject vObject = (VObject) arrayList.get(i5);
                if (vObject instanceof VGroup) {
                    a((VGroup) vObject, matrix3, canvas, i2, i3);
                } else {
                    if (vObject instanceof VPath) {
                        VPath vPath = (VPath) vObject;
                        float f2 = i2 / this.j;
                        float f3 = i3 / this.k;
                        float fMin = Math.min(f2, f3);
                        Matrix matrix4 = this.f8497c;
                        matrix4.set(matrix3);
                        matrix4.postScale(f2, f3);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix3.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c4], fArr[c3]);
                        boolean z2 = c3;
                        boolean z3 = c4;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f4 = (fArr[z3 ? 1 : 0] * fArr[3]) - (fArr[z2 ? 1 : 0] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                        if (fAbs != 0.0f) {
                            vPath.getClass();
                            Path path = this.f8495a;
                            path.reset();
                            PathParser.PathDataNode[] pathDataNodeArr = vPath.f8491a;
                            if (pathDataNodeArr != null) {
                                PathParser.PathDataNode.b(pathDataNodeArr, path);
                            }
                            Path path2 = this.f8496b;
                            path2.reset();
                            if (vPath instanceof VClipPath) {
                                path2.setFillType(vPath.f8493c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix4);
                                canvas.clipPath(path2);
                            } else {
                                VFullPath vFullPath = (VFullPath) vPath;
                                float f5 = vFullPath.f8482i;
                                if (f5 != 0.0f || vFullPath.j != 1.0f) {
                                    float f6 = vFullPath.k;
                                    float f7 = (f5 + f6) % 1.0f;
                                    float f8 = (vFullPath.j + f6) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, z3);
                                    float length = this.f.getLength();
                                    float f9 = f7 * length;
                                    float f10 = f8 * length;
                                    path.reset();
                                    if (f9 > f10) {
                                        this.f.getSegment(f9, length, path, z2);
                                        f = 0.0f;
                                        this.f.getSegment(0.0f, f10, path, z2);
                                    } else {
                                        f = 0.0f;
                                        this.f.getSegment(f9, f10, path, z2);
                                    }
                                    path.rLineTo(f, f);
                                }
                                path2.addPath(path, matrix4);
                                ComplexColorCompat complexColorCompat = vFullPath.f;
                                float f11 = 255.0f;
                                if ((complexColorCompat.f4264a == null && complexColorCompat.f4266c == 0) ? false : true) {
                                    if (this.f8498e == null) {
                                        i4 = 16777215;
                                        Paint paint = new Paint(1);
                                        this.f8498e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    } else {
                                        i4 = 16777215;
                                    }
                                    Paint paint2 = this.f8498e;
                                    Shader shader = complexColorCompat.f4264a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(vFullPath.f8481h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i6 = complexColorCompat.f4266c;
                                        float f12 = vFullPath.f8481h;
                                        PorterDuff.Mode mode = VectorDrawableCompat.k0;
                                        paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(vFullPath.f8493c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                } else {
                                    f11 = 255.0f;
                                    i4 = 16777215;
                                }
                                ComplexColorCompat complexColorCompat2 = vFullPath.d;
                                if (complexColorCompat2.f4264a != null || complexColorCompat2.f4266c != 0) {
                                    if (this.d == null) {
                                        Paint paint3 = new Paint(1);
                                        this.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.d;
                                    Paint.Join join = vFullPath.m;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = vFullPath.f8483l;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(vFullPath.f8484n);
                                    Shader shader2 = complexColorCompat2.f4264a;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(vFullPath.g * f11));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i7 = complexColorCompat2.f4266c;
                                        float f13 = vFullPath.g;
                                        PorterDuff.Mode mode2 = VectorDrawableCompat.k0;
                                        paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(vFullPath.f8480e * fMin * fAbs);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                        c2 = 1;
                    }
                    i5++;
                    vGroup2 = vGroup;
                    c3 = c2;
                    c4 = 0;
                }
                c2 = c3;
                i5++;
                vGroup2 = vGroup;
                c3 = c2;
                c4 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f8501l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f8501l = i2;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.f8497c = new Matrix();
            this.f8499h = 0.0f;
            this.f8500i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.f8501l = 255;
            this.m = null;
            this.f8502n = null;
            ArrayMap arrayMap = new ArrayMap(0);
            this.o = arrayMap;
            this.g = new VGroup(vPathRenderer.g, arrayMap);
            this.f8495a = new Path(vPathRenderer.f8495a);
            this.f8496b = new Path(vPathRenderer.f8496b);
            this.f8499h = vPathRenderer.f8499h;
            this.f8500i = vPathRenderer.f8500i;
            this.j = vPathRenderer.j;
            this.k = vPathRenderer.k;
            this.f8501l = vPathRenderer.f8501l;
            this.m = vPathRenderer.m;
            String str = vPathRenderer.m;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f8502n = vPathRenderer.f8502n;
        }
    }
}
