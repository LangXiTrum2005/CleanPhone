package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.n3;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f47822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f47823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f47824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f47825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f47826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f47827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f47828k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f47829m;

    public u0(TextView textView) {
        this.f47818a = 0;
        this.f47820c = -1;
        this.f47821d = textView;
        this.l = new b1(textView);
    }

    public static l7.z c(Context context, t tVar, int i10) {
        ColorStateList colorStateListF;
        synchronized (tVar) {
            colorStateListF = tVar.f47813a.f(context, i10);
        }
        if (colorStateListF == null) {
            return null;
        }
        l7.z zVar = new l7.z();
        zVar.f45237b = true;
        zVar.f45238c = colorStateListF;
        return zVar;
    }

    public void a(Drawable drawable, l7.z zVar) {
        if (drawable == null || zVar == null) {
            return;
        }
        t.d(drawable, zVar, ((TextView) this.f47821d).getDrawableState());
    }

    public void b() {
        TextView textView = (TextView) this.f47821d;
        if (((l7.z) this.f47822e) != null || ((l7.z) this.f47823f) != null || ((l7.z) this.f47824g) != null || ((l7.z) this.f47825h) != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], (l7.z) this.f47822e);
            a(compoundDrawables[1], (l7.z) this.f47823f);
            a(compoundDrawables[2], (l7.z) this.f47824g);
            a(compoundDrawables[3], (l7.z) this.f47825h);
        }
        if (((l7.z) this.f47826i) == null && ((l7.z) this.f47827j) == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], (l7.z) this.f47826i);
        a(compoundDrawablesRelative[2], (l7.z) this.f47827j);
    }

    public ColorStateList d() {
        l7.z zVar = (l7.z) this.f47828k;
        if (zVar != null) {
            return (ColorStateList) zVar.f45238c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        l7.z zVar = (l7.z) this.f47828k;
        if (zVar != null) {
            return (PorterDuff.Mode) zVar.f45239d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        int i14;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i15;
        int resourceId2;
        b1 b1Var = (b1) this.l;
        TextView textView = (TextView) this.f47821d;
        Context context = textView.getContext();
        t tVarA = t.a();
        int[] iArr = j.a.f43524h;
        g9.k kVarZ = g9.k.z(context, attributeSet, iArr, i10);
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        m0.p0.b(textView, context2, iArr, attributeSet, typedArray, i10, 0);
        TypedArray typedArray2 = (TypedArray) kVarZ.f41771c;
        int resourceId3 = typedArray2.getResourceId(0, -1);
        if (typedArray2.hasValue(3)) {
            this.f47822e = c(context, tVarA, typedArray2.getResourceId(3, 0));
        }
        if (typedArray2.hasValue(1)) {
            this.f47823f = c(context, tVarA, typedArray2.getResourceId(1, 0));
        }
        if (typedArray2.hasValue(4)) {
            this.f47824g = c(context, tVarA, typedArray2.getResourceId(4, 0));
        }
        if (typedArray2.hasValue(2)) {
            this.f47825h = c(context, tVarA, typedArray2.getResourceId(2, 0));
        }
        if (typedArray2.hasValue(5)) {
            this.f47826i = c(context, tVarA, typedArray2.getResourceId(5, 0));
        }
        if (typedArray2.hasValue(6)) {
            this.f47827j = c(context, tVarA, typedArray2.getResourceId(6, 0));
        }
        kVarZ.B();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = j.a.f43538w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            g9.k kVar = new g9.k(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            j(context, kVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            kVar.B();
        } else {
            z10 = false;
            z11 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        g9.k kVar2 = new g9.k(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        j(context, kVar2);
        kVar2.B();
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = (Typeface) this.f47829m;
        if (typeface != null) {
            if (this.f47820c == -1) {
                textView.setTypeface(typeface, this.f47818a);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            s0.d(textView, string);
        }
        if (string2 != null) {
            r0.b(textView, r0.a(string2));
        }
        Context context3 = b1Var.f47631h;
        int[] iArr3 = j.a.f43525i;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = b1Var.f47630g;
        m0.p0.b(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            b1Var.f47624a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i11 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            i11 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr4[i16] = typedArrayObtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                int[] iArrA = b1.a(iArr4);
                b1Var.f47628e = iArrA;
                int length2 = iArrA.length;
                boolean z14 = length2 > 0;
                b1Var.f47629f = z14;
                if (z14) {
                    b1Var.f47624a = 1;
                    b1Var.f47626c = iArrA[0];
                    b1Var.f47627d = iArrA[length2 - 1];
                    b1Var.f47625b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!b1Var.b()) {
            b1Var.f47624a = i11;
        } else if (b1Var.f47624a == 1) {
            if (!b1Var.f47629f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i15 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i15 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i15, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                b1Var.f47624a = 1;
                b1Var.f47626c = dimension2;
                b1Var.f47627d = dimension3;
                b1Var.f47625b = dimension;
                b1Var.f47629f = i11;
            }
            if (b1Var.b() && b1Var.f47624a == 1 && (!b1Var.f47629f || b1Var.f47628e.length == 0)) {
                int iFloor = ((int) Math.floor((b1Var.f47627d - b1Var.f47626c) / b1Var.f47625b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i17 = 0; i17 < iFloor; i17++) {
                    iArr5[i17] = Math.round((i17 * b1Var.f47625b) + b1Var.f47626c);
                }
                b1Var.f47628e = b1.a(iArr5);
            }
        }
        if (b1Var.f47624a != 0) {
            int[] iArr6 = b1Var.f47628e;
            if (iArr6.length > 0) {
                if (s0.a(textView) != -1.0f) {
                    s0.b(textView, Math.round(b1Var.f47626c), Math.round(b1Var.f47627d), Math.round(b1Var.f47625b), 0);
                } else {
                    s0.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? tVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? tVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? tVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? tVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? tVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? tVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
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
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = com.google.android.gms.internal.auth.o.h(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i12 = -1;
            textView.setCompoundDrawableTintMode(h1.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i12 = -1;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i12);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i12);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i13 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i14 = -1;
            } else {
                int i18 = typedValuePeekValue.data;
                int i19 = i18 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i18);
                i14 = i19;
                i13 = -1;
            }
        } else {
            i13 = -1;
            i14 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i13) {
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException();
            }
            textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i13) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i20 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize3 > Math.abs(i20)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i20);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i14 == -1) {
                t9.e.v(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                m0.d0.h(textView, i14, dimensionPixelSize);
            } else {
                t9.e.v(textView, Math.round(TypedValue.applyDimension(i14, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public void g(Context context, int i10) {
        String string;
        TextView textView = (TextView) this.f47821d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.a.f43538w);
        g9.k kVar = new g9.k(context, typedArrayObtainStyledAttributes);
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        j(context, kVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            s0.d(textView, string);
        }
        kVar.B();
        Typeface typeface = (Typeface) this.f47829m;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f47818a);
        }
    }

    public void h(ColorStateList colorStateList) {
        if (((l7.z) this.f47828k) == null) {
            this.f47828k = new l7.z();
        }
        l7.z zVar = (l7.z) this.f47828k;
        zVar.f45238c = colorStateList;
        zVar.f45237b = colorStateList != null;
        this.f47822e = zVar;
        this.f47823f = zVar;
        this.f47824g = zVar;
        this.f47825h = zVar;
        this.f47826i = zVar;
        this.f47827j = zVar;
    }

    public void i(PorterDuff.Mode mode) {
        if (((l7.z) this.f47828k) == null) {
            this.f47828k = new l7.z();
        }
        l7.z zVar = (l7.z) this.f47828k;
        zVar.f45239d = mode;
        zVar.f45236a = mode != null;
        this.f47822e = zVar;
        this.f47823f = zVar;
        this.f47824g = zVar;
        this.f47825h = zVar;
        this.f47826i = zVar;
        this.f47827j = zVar;
    }

    public void j(Context context, g9.k kVar) {
        String string;
        int i10 = this.f47818a;
        TypedArray typedArray = (TypedArray) kVar.f41771c;
        this.f47818a = typedArray.getInt(2, i10);
        int i11 = typedArray.getInt(11, -1);
        this.f47820c = i11;
        if (i11 != -1) {
            this.f47818a &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f47819b = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f47829m = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f47829m = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f47829m = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f47829m = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f47820c;
        int i15 = this.f47818a;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceU = kVar.u(i13, this.f47818a, new k3(this, i14, i15, new WeakReference((TextView) this.f47821d)));
                if (typefaceU != null) {
                    if (this.f47820c != -1) {
                        this.f47829m = t0.a(Typeface.create(typefaceU, 0), this.f47820c, (this.f47818a & 2) != 0);
                    } else {
                        this.f47829m = typefaceU;
                    }
                }
                this.f47819b = ((Typeface) this.f47829m) == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.f47829m) != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (this.f47820c != -1) {
            this.f47829m = t0.a(Typeface.create(string, 0), this.f47820c, (this.f47818a & 2) != 0);
        } else {
            this.f47829m = Typeface.create(string, this.f47818a);
        }
    }

    public u0() {
        d5.o[] oVarArr = {new d5.o(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"), new d5.o(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")};
        int iGlCreateProgram = GLES20.glCreateProgram();
        nf.a.b("glCreateProgram");
        if (iGlCreateProgram != 0) {
            for (int i10 = 0; i10 < 2; i10++) {
                GLES20.glAttachShader(iGlCreateProgram, oVarArr[i10].f38703b);
                nf.a.b("glAttachShader");
            }
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                this.f47818a = iGlCreateProgram;
                this.f47821d = new d5.o[0];
                this.f47822e = cc.a2.C(nf.a.f46733a);
                this.f47823f = new n3(iGlCreateProgram, 2, "uTexMatrix");
                this.f47824g = android.support.v4.media.session.a.n(8);
                this.f47825h = new n3(iGlCreateProgram, 1, "aTextureCoord");
                this.f47826i = new n3(iGlCreateProgram, 1, "aPosition");
                this.f47827j = new n3(iGlCreateProgram, 2, "uMVPMatrix");
                this.f47828k = new RectF();
                this.f47820c = -1;
                return;
            }
            String str = "Could not link program: " + ((Object) GLES20.glGetProgramInfoLog(iGlCreateProgram));
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new RuntimeException(str);
        }
        throw new RuntimeException("Could not create program");
    }
}
