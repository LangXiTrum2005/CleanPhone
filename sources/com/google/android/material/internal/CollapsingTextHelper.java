package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class CollapsingTextHelper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f19306A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f19307B;
    public boolean C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Bitmap f19308E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f19309F;
    public float G;
    public float H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f19310I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f19311J;
    public int K;
    public int[] L;
    public boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final TextPaint f19312N;
    public final TextPaint O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LinearInterpolator f19313P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f19314Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f19315R;
    public float S;
    public float T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f19316U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f19317V;
    public float W;
    public float X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public StaticLayout f19318Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f19319a;
    public float a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19320b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f19321b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f19322c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f19323c0;
    public final Rect d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f19325e;
    public ColorStateList j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19328l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19329n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19330p;
    public float q;
    public Typeface r;
    public Typeface s;
    public Typeface t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f19331u;
    public Typeface v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f19332w;
    public Typeface x;
    public CancelableFontCallback y;
    public int f = 16;
    public int g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19326h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19327i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f19333z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f19324d0 = 1;
    public final float e0 = 1.0f;
    public final int f0 = 1;

    /* JADX INFO: renamed from: com.google.android.material.internal.CollapsingTextHelper$2, reason: invalid class name */
    class AnonymousClass2 implements CancelableFontCallback.ApplyFont {
        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public final void a(Typeface typeface) {
            throw null;
        }
    }

    public CollapsingTextHelper(TextInputLayout textInputLayout) {
        this.f19319a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f19312N = textPaint;
        this.O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f19322c = new Rect();
        this.f19325e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i2, int i3) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i3) * f) + (Color.alpha(i2) * f2)), Math.round((Color.red(i3) * f) + (Color.red(i2) * f2)), Math.round((Color.green(i3) * f) + (Color.green(i2) * f2)), Math.round((Color.blue(i3) * f) + (Color.blue(i2) * f2)));
    }

    public static float f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.a(f, f2, f3);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        boolean z2 = this.f19319a.getLayoutDirection() == 1;
        if (this.D) {
            return (z2 ? TextDirectionHeuristicsCompat.d : TextDirectionHeuristicsCompat.f4399c).a(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f, boolean z2) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z3;
        StaticLayout staticLayoutA;
        Layout.Alignment alignment;
        if (this.f19306A == null) {
            return;
        }
        float fWidth = this.d.width();
        float fWidth2 = this.f19322c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f19327i;
            f3 = this.f19317V;
            this.f19309F = 1.0f;
            typeface = this.r;
        } else {
            float f4 = this.f19326h;
            float f5 = this.W;
            Typeface typeface2 = this.f19331u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f19309F = 1.0f;
            } else {
                this.f19309F = f(this.f19326h, this.f19327i, f, this.f19314Q) / this.f19326h;
            }
            float f6 = this.f19327i / this.f19326h;
            fWidth = (z2 || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f19312N;
        if (fWidth > 0.0f) {
            boolean z4 = this.G != f2;
            boolean z5 = this.X != f3;
            boolean z6 = this.x != typeface;
            StaticLayout staticLayout = this.f19318Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.M;
            this.G = f2;
            this.X = f3;
            this.x = typeface;
            this.M = false;
            textPaint.setLinearText(this.f19309F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f19307B == null || z3) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.f19306A);
            this.C = zB;
            int i2 = this.f19324d0;
            if (i2 <= 1 || zB) {
                i2 = 1;
            }
            try {
                if (i2 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f, zB ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        alignment = this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.f19306A, textPaint, (int) fWidth);
                staticLayoutBuilderCompat.k = this.f19333z;
                staticLayoutBuilderCompat.j = zB;
                staticLayoutBuilderCompat.f19342e = alignment;
                staticLayoutBuilderCompat.f19344i = false;
                staticLayoutBuilderCompat.f = i2;
                staticLayoutBuilderCompat.g = this.e0;
                staticLayoutBuilderCompat.f19343h = this.f0;
                staticLayoutA = staticLayoutBuilderCompat.a();
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayoutA = null;
            }
            staticLayoutA.getClass();
            this.f19318Y = staticLayoutA;
            this.f19307B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f19327i);
        textPaint.setTypeface(this.r);
        textPaint.setLetterSpacing(this.f19317V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.t;
            if (typeface != null) {
                this.s = TypefaceUtils.a(configuration, typeface);
            }
            Typeface typeface2 = this.f19332w;
            if (typeface2 != null) {
                this.v = TypefaceUtils.a(configuration, typeface2);
            }
            Typeface typeface3 = this.s;
            if (typeface3 == null) {
                typeface3 = this.t;
            }
            this.r = typeface3;
            Typeface typeface4 = this.v;
            if (typeface4 == null) {
                typeface4 = this.f19332w;
            }
            this.f19331u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f19319a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f19307B;
        TextPaint textPaint = this.f19312N;
        if (charSequence != null && (staticLayout = this.f19318Y) != null) {
            this.f19323c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f19333z);
        }
        CharSequence charSequence2 = this.f19323c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.C ? 1 : 0);
        int i2 = absoluteGravity & 112;
        Rect rect = this.d;
        if (i2 == 48) {
            this.m = rect.top;
        } else if (i2 != 80) {
            this.m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.m = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.o = rect.centerX() - (this.Z / 2.0f);
        } else if (i3 != 5) {
            this.o = rect.left;
        } else {
            this.o = rect.right - this.Z;
        }
        c(0.0f, z2);
        StaticLayout staticLayout2 = this.f19318Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f19318Y;
        if (staticLayout3 == null || this.f19324d0 <= 1) {
            CharSequence charSequence3 = this.f19307B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f19318Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.C ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        Rect rect2 = this.f19322c;
        if (i4 == 48) {
            this.f19328l = rect2.top;
        } else if (i4 != 80) {
            this.f19328l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f19328l = textPaint.descent() + (rect2.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f19329n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i5 != 5) {
            this.f19329n = rect2.left;
        } else {
            this.f19329n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f19308E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f19308E = null;
        }
        n(this.f19320b);
        float f = this.f19320b;
        RectF rectF = this.f19325e;
        rectF.left = f(rect2.left, rect.left, f, this.f19313P);
        rectF.top = f(this.f19328l, this.m, f, this.f19313P);
        rectF.right = f(rect2.right, rect.right, f, this.f19313P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f, this.f19313P);
        this.f19330p = f(this.f19329n, this.o, f, this.f19313P);
        this.q = f(this.f19328l, this.m, f, this.f19313P);
        n(f);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = AnimationUtils.f19079b;
        this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, fastOutSlowInInterpolator);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        textInputLayout.postInvalidateOnAnimation();
        this.f19321b0 = f(1.0f, 0.0f, f, fastOutSlowInInterpolator);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, e(colorStateList2), e(this.k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f2 = this.f19317V;
        float f3 = this.W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(f(f3, f2, f, fastOutSlowInInterpolator));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.H = AnimationUtils.a(0.0f, this.f19315R, f);
        this.f19310I = AnimationUtils.a(0.0f, this.S, f);
        this.f19311J = AnimationUtils.a(0.0f, this.T, f);
        int iA = a(f, 0, e(this.f19316U));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.f19310I, this.f19311J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final void j(int i2) {
        TextInputLayout textInputLayout = this.f19319a;
        TextAppearance textAppearance = new TextAppearance(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = textAppearance.j;
        if (colorStateList != null) {
            this.k = colorStateList;
        }
        float f = textAppearance.k;
        if (f != 0.0f) {
            this.f19327i = f;
        }
        ColorStateList colorStateList2 = textAppearance.f19384a;
        if (colorStateList2 != null) {
            this.f19316U = colorStateList2;
        }
        this.S = textAppearance.f19387e;
        this.T = textAppearance.f;
        this.f19315R = textAppearance.g;
        this.f19317V = textAppearance.f19389i;
        CancelableFontCallback cancelableFontCallback = this.y;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f19383c = true;
        }
        CancelableFontCallback.ApplyFont applyFont = new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public final void a(Typeface typeface) {
                CollapsingTextHelper collapsingTextHelper = CollapsingTextHelper.this;
                if (collapsingTextHelper.k(typeface)) {
                    collapsingTextHelper.h(false);
                }
            }
        };
        textAppearance.a();
        this.y = new CancelableFontCallback(applyFont, textAppearance.f19391n);
        textAppearance.c(textInputLayout.getContext(), this.y);
        h(false);
    }

    public final boolean k(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.y;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f19383c = true;
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        Typeface typefaceA = TypefaceUtils.a(this.f19319a.getContext().getResources().getConfiguration(), typeface);
        this.s = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.t;
        }
        this.r = typefaceA;
        return true;
    }

    public final boolean l(Typeface typeface) {
        if (this.f19332w == typeface) {
            return false;
        }
        this.f19332w = typeface;
        Typeface typefaceA = TypefaceUtils.a(this.f19319a.getContext().getResources().getConfiguration(), typeface);
        this.v = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f19332w;
        }
        this.f19331u = typefaceA;
        return true;
    }

    public final void m(float f) {
        float fA = MathUtils.a(f, 0.0f, 1.0f);
        if (fA != this.f19320b) {
            this.f19320b = fA;
            RectF rectF = this.f19325e;
            Rect rect = this.f19322c;
            float f2 = rect.left;
            Rect rect2 = this.d;
            rectF.left = f(f2, rect2.left, fA, this.f19313P);
            rectF.top = f(this.f19328l, this.m, fA, this.f19313P);
            rectF.right = f(rect.right, rect2.right, fA, this.f19313P);
            rectF.bottom = f(rect.bottom, rect2.bottom, fA, this.f19313P);
            this.f19330p = f(this.f19329n, this.o, fA, this.f19313P);
            this.q = f(this.f19328l, this.m, fA, this.f19313P);
            n(fA);
            FastOutSlowInInterpolator fastOutSlowInInterpolator = AnimationUtils.f19079b;
            this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - fA, fastOutSlowInInterpolator);
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            TextInputLayout textInputLayout = this.f19319a;
            textInputLayout.postInvalidateOnAnimation();
            this.f19321b0 = f(1.0f, 0.0f, fA, fastOutSlowInInterpolator);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f19312N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(fA, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f3 = this.f19317V;
            float f4 = this.W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(f(f4, f3, fA, fastOutSlowInInterpolator));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.H = AnimationUtils.a(0.0f, this.f19315R, fA);
            this.f19310I = AnimationUtils.a(0.0f, this.S, fA);
            this.f19311J = AnimationUtils.a(0.0f, this.T, fA);
            int iA = a(fA, 0, e(this.f19316U));
            this.K = iA;
            textPaint.setShadowLayer(this.H, this.f19310I, this.f19311J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void n(float f) {
        c(f, false);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        this.f19319a.postInvalidateOnAnimation();
    }
}
