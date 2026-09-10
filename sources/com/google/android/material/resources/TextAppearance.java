package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes4.dex */
public class TextAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f19384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19386c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19387e;
    public final float f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19389i;
    public final ColorStateList j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19390l;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f19391n;

    public TextAppearance(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, R.styleable.f19064F);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        MaterialResources.a(context, typedArrayObtainStyledAttributes, 4);
        MaterialResources.a(context, typedArrayObtainStyledAttributes, 5);
        this.f19386c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i3 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f19390l = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
        this.f19385b = typedArrayObtainStyledAttributes.getString(i3);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f19384a = MaterialResources.a(context, typedArrayObtainStyledAttributes, 6);
        this.f19387e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, R.styleable.v);
        this.f19388h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f19389i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f19391n;
        int i2 = this.f19386c;
        if (typeface == null && (str = this.f19385b) != null) {
            this.f19391n = Typeface.create(str, i2);
        }
        if (this.f19391n == null) {
            int i3 = this.d;
            if (i3 == 1) {
                this.f19391n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f19391n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f19391n = Typeface.DEFAULT;
            } else {
                this.f19391n = Typeface.MONOSPACE;
            }
            this.f19391n = Typeface.create(this.f19391n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.f19391n;
        }
        if (!context.isRestricted()) {
            try {
                int i2 = this.f19390l;
                ThreadLocal threadLocal = ResourcesCompat.f4277a;
                Typeface typefaceD = context.isRestricted() ? null : ResourcesCompat.d(context, i2, new TypedValue(), 0, null, false, false);
                this.f19391n = typefaceD;
                if (typefaceD != null) {
                    this.f19391n = Typeface.create(typefaceD, this.f19386c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f19385b, e2);
            }
        }
        a();
        this.m = true;
        return this.f19391n;
    }

    public final void c(Context context, final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f19390l;
        if (i2 == 0) {
            this.m = true;
        }
        if (this.m) {
            textAppearanceFontCallback.b(this.f19391n, true);
            return;
        }
        try {
            ResourcesCompat.FontCallback fontCallback = new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public final void b(int i3) {
                    TextAppearance.this.m = true;
                    textAppearanceFontCallback.a(i3);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public final void c(Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.f19391n = Typeface.create(typeface, textAppearance.f19386c);
                    textAppearance.m = true;
                    textAppearanceFontCallback.b(textAppearance.f19391n, false);
                }
            };
            ThreadLocal threadLocal = ResourcesCompat.f4277a;
            if (context.isRestricted()) {
                fontCallback.a(-4);
            } else {
                ResourcesCompat.d(context, i2, new TypedValue(), 0, fontCallback, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            textAppearanceFontCallback.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f19385b, e2);
            this.m = true;
            textAppearanceFontCallback.a(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceD = null;
        int i2 = this.f19390l;
        if (i2 != 0) {
            ThreadLocal threadLocal = ResourcesCompat.f4277a;
            if (!context.isRestricted()) {
                typefaceD = ResourcesCompat.d(context, i2, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceD != null;
    }

    public final void e(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        f(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f19384a;
        textPaint.setShadowLayer(this.g, this.f19387e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(final Context context, final TextPaint textPaint, final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f19391n);
        c(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void a(int i2) {
                textAppearanceFontCallback.a(i2);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void b(Typeface typeface, boolean z2) {
                TextAppearance.this.g(context, textPaint, typeface);
                textAppearanceFontCallback.b(typeface, z2);
            }
        });
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = TypefaceUtils.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f19386c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.f19388h) {
            textPaint.setLetterSpacing(this.f19389i);
        }
    }
}
