package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f3580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TintInfo f3581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TintInfo f3582c;
    public TintInfo d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TintInfo f3583e;
    public TintInfo f;
    public TintInfo g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TintInfo f3584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AppCompatTextViewAutoSizeHelper f3585i;
    public int j = 0;
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f3586l;
    public boolean m;

    public static class Api17Impl {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class Api21Impl {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class Api24Impl {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class Api26Impl {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        public static void c(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class Api28Impl {
        public static Typeface a(Typeface typeface, int i2, boolean z2) {
            return Typeface.create(typeface, i2, z2);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.f3580a = textView;
        this.f3585i = new AppCompatTextViewAutoSizeHelper(textView);
    }

    public static TintInfo c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i2) {
        ColorStateList colorStateListG;
        synchronized (appCompatDrawableManager) {
            colorStateListG = appCompatDrawableManager.f3556a.g(context, i2);
        }
        if (colorStateListG == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.d = true;
        tintInfo.f3642a = colorStateListG;
        return tintInfo;
    }

    public final void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, this.f3580a.getDrawableState());
    }

    public final void b() {
        TintInfo tintInfo = this.f3581b;
        TextView textView = this.f3580a;
        if (tintInfo != null || this.f3582c != null || this.d != null || this.f3583e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3581b);
            a(compoundDrawables[1], this.f3582c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f3583e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] drawableArrA = Api17Impl.a(textView);
        a(drawableArrA[0], this.f);
        a(drawableArrA[2], this.g);
    }

    public final ColorStateList d() {
        TintInfo tintInfo = this.f3584h;
        if (tintInfo != null) {
            return tintInfo.f3642a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        TintInfo tintInfo = this.f3584h;
        if (tintInfo != null) {
            return tintInfo.f3643b;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String string;
        String string2;
        int i3;
        int resourceId;
        TextView textView = this.f3580a;
        Context context = textView.getContext();
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        int[] iArr = R.styleable.f3281h;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i2);
        ViewCompat.y(textView, textView.getContext(), iArr, attributeSet, tintTypedArrayE.f3646b, i2);
        TypedArray typedArray = tintTypedArrayE.f3646b;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3581b = c(context, appCompatDrawableManagerA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3582c = c(context, appCompatDrawableManagerA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, appCompatDrawableManagerA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3583e = c(context, appCompatDrawableManagerA, typedArray.getResourceId(2, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, appCompatDrawableManagerA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, appCompatDrawableManagerA, typedArray.getResourceId(6, 0));
        }
        tintTypedArrayE.f();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = R.styleable.x;
        if (resourceId2 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, iArr2);
            TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
            if (z4 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m(context, tintTypedArray);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i4 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            tintTypedArray.f();
        } else {
            z2 = false;
            z3 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        TintTypedArray tintTypedArray2 = new TintTypedArray(context, typedArrayObtainStyledAttributes2);
        if (!z4 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z5 = z3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i4 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i4 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, tintTypedArray2);
        tintTypedArray2.f();
        if (!z4 && z2) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f3586l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            Api26Impl.d(textView, string);
        }
        if (string2 != null) {
            Api24Impl.b(textView, Api24Impl.a(string2));
        }
        int[] iArr3 = R.styleable.f3282i;
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f3585i;
        Context context2 = appCompatTextViewAutoSizeHelper.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = appCompatTextViewAutoSizeHelper.f3599i;
        ViewCompat.y(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i2);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            appCompatTextViewAutoSizeHelper.f3594a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                appCompatTextViewAutoSizeHelper.f = AppCompatTextViewAutoSizeHelper.b(iArr4);
                appCompatTextViewAutoSizeHelper.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!appCompatTextViewAutoSizeHelper.j()) {
            appCompatTextViewAutoSizeHelper.f3594a = 0;
        } else if (appCompatTextViewAutoSizeHelper.f3594a == 1) {
            if (!appCompatTextViewAutoSizeHelper.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                appCompatTextViewAutoSizeHelper.k(dimension2, f, dimension);
            }
            appCompatTextViewAutoSizeHelper.h();
        }
        if (ViewUtils.f3670b && appCompatTextViewAutoSizeHelper.f3594a != 0) {
            int[] iArr5 = appCompatTextViewAutoSizeHelper.f;
            if (iArr5.length > 0) {
                if (Api26Impl.a(textView) != -1.0f) {
                    Api26Impl.b(textView, Math.round(appCompatTextViewAutoSizeHelper.d), Math.round(appCompatTextViewAutoSizeHelper.f3597e), Math.round(appCompatTextViewAutoSizeHelper.f3596c), 0);
                } else {
                    Api26Impl.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        TintTypedArray tintTypedArray3 = new TintTypedArray(context, typedArrayObtainStyledAttributes4);
        int resourceId3 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId3 != -1 ? appCompatDrawableManagerA.b(context, resourceId3) : null;
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId4 != -1 ? appCompatDrawableManagerA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId5 != -1 ? appCompatDrawableManagerA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId6 != -1 ? appCompatDrawableManagerA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId7 != -1 ? appCompatDrawableManagerA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId8 != -1 ? appCompatDrawableManagerA.b(context, resourceId8) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = Api17Impl.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            Api17Impl.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = Api17Impl.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                Api17Impl.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            TextViewCompat.b(textView, tintTypedArray3.a(11));
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            TextViewCompat.c(textView, DrawableUtils.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        tintTypedArray3.f();
        if (dimensionPixelSize != -1) {
            TextViewCompat.d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            TextViewCompat.e(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            Preconditions.c(dimensionPixelSize3);
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, R.styleable.x);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f3580a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, tintTypedArray);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            Api26Impl.d(textView, string);
        }
        tintTypedArray.f();
        Typeface typeface = this.f3586l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i2, int i3, int i4, int i5) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f3585i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void i(int[] iArr, int i2) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f3585i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                appCompatTextViewAutoSizeHelper.f = AppCompatTextViewAutoSizeHelper.b(iArrCopyOf);
                if (!appCompatTextViewAutoSizeHelper.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                appCompatTextViewAutoSizeHelper.g = false;
            }
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void j(int i2) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f3585i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            if (i2 == 0) {
                appCompatTextViewAutoSizeHelper.f3594a = 0;
                appCompatTextViewAutoSizeHelper.d = -1.0f;
                appCompatTextViewAutoSizeHelper.f3597e = -1.0f;
                appCompatTextViewAutoSizeHelper.f3596c = -1.0f;
                appCompatTextViewAutoSizeHelper.f = new int[0];
                appCompatTextViewAutoSizeHelper.f3595b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f3584h == null) {
            this.f3584h = new TintInfo();
        }
        TintInfo tintInfo = this.f3584h;
        tintInfo.f3642a = colorStateList;
        tintInfo.d = colorStateList != null;
        this.f3581b = tintInfo;
        this.f3582c = tintInfo;
        this.d = tintInfo;
        this.f3583e = tintInfo;
        this.f = tintInfo;
        this.g = tintInfo;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f3584h == null) {
            this.f3584h = new TintInfo();
        }
        TintInfo tintInfo = this.f3584h;
        tintInfo.f3643b = mode;
        tintInfo.f3644c = mode != null;
        this.f3581b = tintInfo;
        this.f3582c = tintInfo;
        this.d = tintInfo;
        this.f3583e = tintInfo;
        this.f = tintInfo;
        this.g = tintInfo;
    }

    public final void m(Context context, TintTypedArray tintTypedArray) {
        String string;
        int i2 = this.j;
        TypedArray typedArray = tintTypedArray.f3646b;
        this.j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.k = i4;
            if (i4 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f3586l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f3586l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f3586l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3586l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        final int i7 = this.k;
        final int i8 = this.j;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.f3580a);
            try {
                Typeface typefaceD = tintTypedArray.d(i6, this.j, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void b(int i9) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void c(final Typeface typeface) {
                        int i9;
                        if (Build.VERSION.SDK_INT >= 28 && (i9 = i7) != -1) {
                            typeface = Api28Impl.a(typeface, i9, (i8 & 2) != 0);
                        }
                        AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
                        if (appCompatTextHelper.m) {
                            appCompatTextHelper.f3586l = typeface;
                            final TextView textView = (TextView) weakReference.get();
                            if (textView != null) {
                                WeakHashMap weakHashMap = ViewCompat.f4466a;
                                if (!textView.isAttachedToWindow()) {
                                    textView.setTypeface(typeface, appCompatTextHelper.j);
                                } else {
                                    final int i10 = appCompatTextHelper.j;
                                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            textView.setTypeface(typeface, i10);
                                        }
                                    });
                                }
                            }
                        }
                    }
                });
                if (typefaceD != null) {
                    if (i3 < 28 || this.k == -1) {
                        this.f3586l = typefaceD;
                    } else {
                        this.f3586l = Api28Impl.a(Typeface.create(typefaceD, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.f3586l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3586l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.f3586l = Typeface.create(string, this.j);
        } else {
            this.f3586l = Api28Impl.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
