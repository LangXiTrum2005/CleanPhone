package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cc.a2;
import com.google.android.gms.internal.auth.o;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import g9.k;
import java.util.WeakHashMap;
import m.a;
import m0.h0;
import m0.p0;
import m0.s0;
import o4.c;
import p.h1;
import p.m2;
import p.n2;
import p.u0;
import p.w;
import x0.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final c R = new c(7, Float.class, "thumbPos");
    public static final int[] S = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public final ColorStateList J;
    public StaticLayout K;
    public StaticLayout L;
    public final a M;
    public ObjectAnimator N;
    public w O;
    public m2 P;
    public final Rect Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f3945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f3946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f3947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f3950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f3951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3955k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f3958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f3959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f3960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f3961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f3964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f3965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f3966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final VelocityTracker f3967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f3969z;

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.storage.androidcleaner.R.attr.switchStyle);
        this.f3946b = null;
        this.f3947c = null;
        this.f3948d = false;
        this.f3949e = false;
        this.f3951g = null;
        this.f3952h = null;
        this.f3953i = false;
        this.f3954j = false;
        this.f3967x = VelocityTracker.obtain();
        this.H = true;
        this.Q = new Rect();
        n2.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = j.a.f43537v;
        k kVarZ = k.z(context, attributeSet, iArr, com.storage.androidcleaner.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = s0.f45746a;
        p0.b(this, context, iArr, attributeSet, typedArray, com.storage.androidcleaner.R.attr.switchStyle, 0);
        Drawable drawableS = kVarZ.s(2);
        this.f3945a = drawableS;
        if (drawableS != null) {
            drawableS.setCallback(this);
        }
        Drawable drawableS2 = kVarZ.s(11);
        this.f3950f = drawableS2;
        if (drawableS2 != null) {
            drawableS2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f3962s = typedArray.getBoolean(3, true);
        this.f3955k = typedArray.getDimensionPixelSize(8, 0);
        this.l = typedArray.getDimensionPixelSize(5, 0);
        this.f3956m = typedArray.getDimensionPixelSize(6, 0);
        this.f3957n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListQ = kVarZ.q(9);
        if (colorStateListQ != null) {
            this.f3946b = colorStateListQ;
            this.f3948d = true;
        }
        PorterDuff.Mode modeC = h1.c(typedArray.getInt(10, -1), null);
        if (this.f3947c != modeC) {
            this.f3947c = modeC;
            this.f3949e = true;
        }
        if (this.f3948d || this.f3949e) {
            a();
        }
        ColorStateList colorStateListQ2 = kVarZ.q(12);
        if (colorStateListQ2 != null) {
            this.f3951g = colorStateListQ2;
            this.f3953i = true;
        }
        PorterDuff.Mode modeC2 = h1.c(typedArray.getInt(13, -1), null);
        if (this.f3952h != modeC2) {
            this.f3952h = modeC2;
            this.f3954j = true;
        }
        if (this.f3953i || this.f3954j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, j.a.f43538w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = o.h(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.J = colorStateList;
            } else {
                this.J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i10 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i11 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i10 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i10 != 2) {
                typeface = i10 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i11 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : f11);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                a aVar = new a();
                aVar.f45676a = context2.getResources().getConfiguration().locale;
                this.M = aVar;
            } else {
                this.M = null;
            }
            setTextOnInternal(this.f3958o);
            setTextOffInternal(this.f3960q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new u0(this).f(attributeSet, com.storage.androidcleaner.R.attr.switchStyle);
        kVarZ.B();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3964u = viewConfiguration.getScaledTouchSlop();
        this.f3968y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.storage.androidcleaner.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @NonNull
    private w getEmojiTextViewHelper() {
        if (this.O == null) {
            this.O = new w(this);
        }
        return this.O;
    }

    private boolean getTargetCheckedState() {
        return this.f3969z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f3969z : this.f3969z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3950f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3945a;
        Rect rectB = drawable2 != null ? h1.b(drawable2) : h1.f47660c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3960q = charSequence;
        TransformationMethod transformationMethodO = ((a2) getEmojiTextViewHelper().f47838b.f49529b).O(this.M);
        if (transformationMethodO != null) {
            charSequence = transformationMethodO.getTransformation(charSequence, this);
        }
        this.f3961r = charSequence;
        this.L = null;
        if (this.f3962s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3958o = charSequence;
        TransformationMethod transformationMethodO = ((a2) getEmojiTextViewHelper().f47838b.f49529b).O(this.M);
        if (transformationMethodO != null) {
            charSequence = transformationMethodO.getTransformation(charSequence, this);
        }
        this.f3959p = charSequence;
        this.K = null;
        if (this.f3962s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f3945a;
        if (drawable != null) {
            if (this.f3948d || this.f3949e) {
                Drawable drawableMutate = drawable.mutate();
                this.f3945a = drawableMutate;
                if (this.f3948d) {
                    drawableMutate.setTintList(this.f3946b);
                }
                if (this.f3949e) {
                    this.f3945a.setTintMode(this.f3947c);
                }
                if (this.f3945a.isStateful()) {
                    this.f3945a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f3950f;
        if (drawable != null) {
            if (this.f3953i || this.f3954j) {
                Drawable drawableMutate = drawable.mutate();
                this.f3950f = drawableMutate;
                if (this.f3953i) {
                    drawableMutate.setTintList(this.f3951g);
                }
                if (this.f3954j) {
                    this.f3950f.setTintMode(this.f3952h);
                }
                if (this.f3950f.isStateful()) {
                    this.f3950f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f3958o);
        setTextOffInternal(this.f3960q);
        requestLayout();
    }

    public final void d() {
        if (this.P == null && ((a2) this.O.f47838b.f49529b).x() && g.f53514k != null) {
            g gVarA = g.a();
            int iB = gVarA.b();
            if (iB == 3 || iB == 0) {
                m2 m2Var = new m2(this);
                this.P = m2Var;
                gVarA.f(m2Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f3945a;
        Rect rectB = drawable != null ? h1.b(drawable) : h1.f47660c;
        Drawable drawable2 = this.f3950f;
        Rect rect = this.Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectB != null) {
                int i17 = rectB.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectB.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectB.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectB.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f3950f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f3950f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f3945a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.C + rect.right;
            this.f3945a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f3945a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f3950f;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3945a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3950f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3956m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3956m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f3962s;
    }

    public boolean getSplitTrack() {
        return this.f3957n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.f3956m;
    }

    public CharSequence getTextOff() {
        return this.f3960q;
    }

    public CharSequence getTextOn() {
        return this.f3958o;
    }

    public Drawable getThumbDrawable() {
        return this.f3945a;
    }

    public final float getThumbPosition() {
        return this.f3969z;
    }

    public int getThumbTextPadding() {
        return this.f3955k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f3946b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f3947c;
    }

    public Drawable getTrackDrawable() {
        return this.f3950f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f3951g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f3952h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3945a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3950f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3950f;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f3945a;
        if (drawable != null) {
            if (!this.f3957n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = h1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.K : this.L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.I;
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f3945a != null) {
            Drawable drawable = this.f3950f;
            Rect rect = this.Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = h1.b(this.f3945a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & InterfaceC0435l1.d.b.f29113j;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.B;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.B;
        }
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f3962s) {
            StaticLayout staticLayout = this.K;
            TextPaint textPaint = this.I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3959p;
                this.K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
            if (this.L == null) {
                CharSequence charSequence2 = this.f3961r;
                this.L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
        }
        Drawable drawable = this.f3945a;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3945a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3945a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f3962s) {
            iMax = (this.f3955k * 2) + Math.max(this.K.getWidth(), this.L.getWidth());
        } else {
            iMax = 0;
        }
        this.C = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f3950f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3950f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f3945a;
        if (drawable3 != null) {
            Rect rectB = h1.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.H ? Math.max(this.l, (this.C * 2) + iMax2 + iMax3) : this.l;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax4;
        this.B = iMax5;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3958o : this.f3960q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f10;
        VelocityTracker velocityTracker = this.f3967x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f3964u;
        if (actionMasked != 0) {
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (actionMasked == 1) {
                if (this.f3963t == 2) {
                    this.f3963t = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f3968y) {
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : xVelocity < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f3963t = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i11 = this.f3963t;
                if (i11 == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f12 = i10;
                    if (Math.abs(x10 - this.f3965v) > f12 || Math.abs(y10 - this.f3966w) > f12) {
                        this.f3963t = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f3965v = x10;
                        this.f3966w = y10;
                        return true;
                    }
                } else if (i11 == 2) {
                    float x11 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f13 = x11 - this.f3965v;
                    if (thumbScrollRange != 0) {
                        f10 = f13 / thumbScrollRange;
                    } else {
                        f10 = f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : -1.0f;
                    }
                    if (getLayoutDirection() == 1) {
                        f10 = -f10;
                    }
                    float f14 = this.f3969z;
                    float f15 = f10 + f14;
                    if (f15 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f11 = f15 > 1.0f ? 1.0f : f15;
                    }
                    if (f11 != f14) {
                        this.f3965v = x11;
                        setThumbPosition(f11);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f3963t == 2) {
                    this.f3963t = 0;
                    if (motionEvent.getAction() == 1) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f3968y) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (getLayoutDirection() == 1) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f3963t = 0;
                velocityTracker.clear();
            }
        } else {
            float x12 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled() && this.f3945a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f3945a;
                Rect rect = this.Q;
                drawable.getPadding(rect);
                int i12 = this.E - i10;
                int i13 = (this.D + thumbOffset) - i10;
                int i14 = this.C + i13 + rect.left + rect.right + i10;
                int i15 = this.G + i10;
                if (x12 > i13 && x12 < i14 && y11 > i12 && y11 < i15) {
                    this.f3963t = 1;
                    this.f3965v = x12;
                    this.f3966w = y11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            Object string = this.f3958o;
            if (string == null) {
                string = getResources().getString(com.storage.androidcleaner.R.string.abc_capital_on);
            }
            Object obj = string;
            WeakHashMap weakHashMap = s0.f45746a;
            new h0(com.storage.androidcleaner.R.id.tag_state_description, CharSequence.class, 64, 30, 1).h(this, obj);
        } else {
            Object string2 = this.f3960q;
            if (string2 == null) {
                string2 = getResources().getString(com.storage.androidcleaner.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = s0.f45746a;
            new h0(com.storage.androidcleaner.R.id.tag_state_description, CharSequence.class, 64, 30, 1).h(this, obj2);
        }
        IBinder windowToken = getWindowToken();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (windowToken == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (zIsChecked) {
                f10 = 1.0f;
            }
            setThumbPosition(f10);
            return;
        }
        if (zIsChecked) {
            f10 = 1.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, R, f10);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f3958o);
        setTextOffInternal(this.f3960q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f3962s != z10) {
            this.f3962s = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f3957n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f3956m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        Object string = this.f3960q;
        if (string == null) {
            string = getResources().getString(com.storage.androidcleaner.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = s0.f45746a;
        new h0(com.storage.androidcleaner.R.id.tag_state_description, CharSequence.class, 64, 30, 1).h(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            Object string = this.f3958o;
            if (string == null) {
                string = getResources().getString(com.storage.androidcleaner.R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = s0.f45746a;
            new h0(com.storage.androidcleaner.R.id.tag_state_description, CharSequence.class, 64, 30, 1).h(this, string);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3945a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3945a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f3969z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(o.i(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f3955k = i10;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f3946b = colorStateList;
        this.f3948d = true;
        a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f3947c = mode;
        this.f3949e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3950f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3950f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(o.i(getContext(), i10));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f3951g = colorStateList;
        this.f3953i = true;
        b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f3952h = mode;
        this.f3954j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3945a || drawable == this.f3950f;
    }
}
