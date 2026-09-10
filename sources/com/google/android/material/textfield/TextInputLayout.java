package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] D1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public Fade A0;
    public boolean A1;
    public Fade B0;
    public boolean B1;
    public ColorStateList C0;
    public boolean C1;
    public ColorStateList D0;
    public ColorStateList E0;
    public ColorStateList F0;
    public boolean G0;
    public CharSequence H0;
    public boolean I0;
    public MaterialShapeDrawable J0;
    public MaterialShapeDrawable K0;
    public StateListDrawable L0;
    public boolean M0;
    public MaterialShapeDrawable N0;
    public MaterialShapeDrawable O0;
    public ShapeAppearanceModel P0;
    public boolean Q0;
    public final int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public final Rect Z0;
    public final Rect a1;
    public final RectF b1;
    public Typeface c1;
    public ColorDrawable d1;
    public final FrameLayout e0;
    public int e1;
    public final StartCompoundLayout f0;
    public final LinkedHashSet f1;
    public final EndCompoundLayout g0;
    public ColorDrawable g1;
    public EditText h0;
    public int h1;
    public CharSequence i0;
    public Drawable i1;
    public int j0;
    public ColorStateList j1;
    public int k0;
    public ColorStateList k1;
    public int l0;
    public int l1;
    public int m0;
    public int m1;
    public final IndicatorViewController n0;
    public int n1;
    public boolean o0;
    public ColorStateList o1;
    public int p0;
    public int p1;
    public boolean q0;
    public int q1;
    public LengthCounter r0;
    public int r1;
    public AppCompatTextView s0;
    public int s1;
    public int t0;
    public int t1;
    public int u0;
    public int u1;
    public CharSequence v0;
    public boolean v1;
    public boolean w0;
    public final CollapsingTextHelper w1;
    public AppCompatTextView x0;
    public boolean x1;
    public ColorStateList y0;
    public boolean y1;
    public int z0;
    public ValueAnimator z1;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public final TextInputLayout d;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z2 = textInputLayout.v1;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z3 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            StartCompoundLayout startCompoundLayout = textInputLayout.f0;
            AppCompatTextView appCompatTextView = startCompoundLayout.f0;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(startCompoundLayout.h0);
            }
            if (!zIsEmpty) {
                accessibilityNodeInfoCompat.q(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.q(string);
                if (!z2 && placeholderText != null) {
                    accessibilityNodeInfoCompat.q(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.q(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26) {
                    accessibilityNodeInfoCompat.n(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.q(string);
                }
                if (i2 >= 26) {
                    accessibilityNodeInfo.setShowingHintText(zIsEmpty);
                } else {
                    accessibilityNodeInfoCompat.i(4, zIsEmpty);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z3) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.n0.y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.g0.b().n(accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.d.g0.b().o(accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int c(Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void a(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void a();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public CharSequence Z;
        public boolean e0;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e0 = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.Z) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.Z, parcel, i2);
            parcel.writeInt(this.e0 ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.a(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.textInputStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_Design_TextInputLayout), attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.textInputStyle);
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = new IndicatorViewController(this);
        this.r0 = new com.google.android.exoplayer2.analytics.f(28);
        this.Z0 = new Rect();
        this.a1 = new Rect();
        this.b1 = new RectF();
        this.f1 = new LinkedHashSet();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.w1 = collapsingTextHelper;
        this.C1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.e0 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AnimationUtils.f19078a;
        collapsingTextHelper.f19314Q = linearInterpolator;
        collapsingTextHelper.h(false);
        collapsingTextHelper.f19313P = linearInterpolator;
        collapsingTextHelper.h(false);
        if (collapsingTextHelper.g != 8388659) {
            collapsingTextHelper.g = 8388659;
            collapsingTextHelper.h(false);
        }
        int[] iArr = com.google.android.material.R.styleable.H;
        ThemeEnforcement.a(context2, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.textInputStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_Design_TextInputLayout);
        ThemeEnforcement.b(context2, attributeSet, iArr, com.charging.screenshow.battery.animations.themes.R.attr.textInputStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.charging.screenshow.battery.animations.themes.R.attr.textInputStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_Design_TextInputLayout);
        TintTypedArray tintTypedArray = new TintTypedArray(context2, typedArrayObtainStyledAttributes);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, tintTypedArray);
        this.f0 = startCompoundLayout;
        this.G0 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.y1 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.x1 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.P0 = ShapeAppearanceModel.c(context2, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.textInputStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_Design_TextInputLayout).a();
        this.R0 = context2.getResources().getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.T0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.U0 = this.V0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        ShapeAppearanceModel.Builder builderF = this.P0.f();
        if (dimension >= 0.0f) {
            builderF.f(dimension);
        }
        if (dimension2 >= 0.0f) {
            builderF.g(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builderF.e(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builderF.d(dimension4);
        }
        this.P0 = builderF.a();
        ColorStateList colorStateListB = MaterialResources.b(context2, tintTypedArray, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.p1 = defaultColor;
            this.Y0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.q1 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.r1 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.s1 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.r1 = this.p1;
                ColorStateList colorStateList = ContextCompat.getColorStateList(context2, com.charging.screenshow.battery.animations.themes.R.color.mtrl_filled_background_color);
                this.q1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.s1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.Y0 = 0;
            this.p1 = 0;
            this.q1 = 0;
            this.r1 = 0;
            this.s1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListA = tintTypedArray.a(1);
            this.k1 = colorStateListA;
            this.j1 = colorStateListA;
        }
        ColorStateList colorStateListB2 = MaterialResources.b(context2, tintTypedArray, 14);
        this.n1 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.l1 = ContextCompat.getColor(context2, com.charging.screenshow.battery.animations.themes.R.color.mtrl_textinput_default_box_stroke_color);
        this.t1 = ContextCompat.getColor(context2, com.charging.screenshow.battery.animations.themes.R.color.mtrl_textinput_disabled_color);
        this.m1 = ContextCompat.getColor(context2, com.charging.screenshow.battery.animations.themes.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(MaterialResources.b(context2, tintTypedArray, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.E0 = tintTypedArray.a(24);
        this.F0 = tintTypedArray.a(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.u0 = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.t0 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.t0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.u0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(tintTypedArray.a(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(tintTypedArray.a(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(tintTypedArray.a(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(tintTypedArray.a(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(tintTypedArray.a(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(tintTypedArray.a(58));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, tintTypedArray);
        this.g0 = endCompoundLayout;
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        tintTypedArray.f();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.F(this, 1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.h0;
        if (!(editText instanceof AutoCompleteTextView) || EditTextUtils.a(editText)) {
            return this.J0;
        }
        int iB = MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorControlHighlight, this.h0);
        int i2 = this.S0;
        int[][] iArr = D1;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            MaterialShapeDrawable materialShapeDrawable = this.J0;
            int i3 = this.Y0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.e(0.1f, iB, i3), i3}), materialShapeDrawable, materialShapeDrawable);
        }
        Context context = getContext();
        MaterialShapeDrawable materialShapeDrawable2 = this.J0;
        TypedValue typedValueC = MaterialAttributes.c(com.charging.screenshow.battery.animations.themes.R.attr.colorSurface, context, "TextInputLayout");
        int i4 = typedValueC.resourceId;
        int color = i4 != 0 ? ContextCompat.getColor(context, i4) : typedValueC.data;
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.X.f19417a);
        int iE = MaterialColors.e(0.1f, iB, color);
        materialShapeDrawable3.l(new ColorStateList(iArr, new int[]{iE, 0}));
        materialShapeDrawable3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iE, color});
        MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.X.f19417a);
        materialShapeDrawable4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.L0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.L0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.L0.addState(new int[0], f(false));
        }
        return this.L0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.K0 == null) {
            this.K0 = f(true);
        }
        return this.K0;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.h0 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.h0 = editText;
        int i2 = this.j0;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.l0);
        }
        int i3 = this.k0;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.m0);
        }
        this.M0 = false;
        i();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        Typeface typeface = this.h0.getTypeface();
        CollapsingTextHelper collapsingTextHelper = this.w1;
        boolean zK = collapsingTextHelper.k(typeface);
        boolean zL = collapsingTextHelper.l(typeface);
        if (zK || zL) {
            collapsingTextHelper.h(false);
        }
        float textSize = this.h0.getTextSize();
        if (collapsingTextHelper.f19326h != textSize) {
            collapsingTextHelper.f19326h = textSize;
            collapsingTextHelper.h(false);
        }
        int i4 = Build.VERSION.SDK_INT;
        float letterSpacing = this.h0.getLetterSpacing();
        if (collapsingTextHelper.W != letterSpacing) {
            collapsingTextHelper.W = letterSpacing;
            collapsingTextHelper.h(false);
        }
        int gravity = this.h0.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (collapsingTextHelper.g != i5) {
            collapsingTextHelper.g = i5;
            collapsingTextHelper.h(false);
        }
        if (collapsingTextHelper.f != gravity) {
            collapsingTextHelper.f = gravity;
            collapsingTextHelper.h(false);
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        this.u1 = editText.getMinimumHeight();
        this.h0.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
            public int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ EditText f19532Y;

            {
                this.f19532Y = editText;
                this.X = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.u(!textInputLayout.B1, false);
                if (textInputLayout.o0) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.w0) {
                    textInputLayout.v(editable);
                }
                EditText editText2 = this.f19532Y;
                int lineCount = editText2.getLineCount();
                int i6 = this.X;
                if (lineCount != i6) {
                    if (lineCount < i6) {
                        WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                        int minimumHeight = editText2.getMinimumHeight();
                        int i7 = textInputLayout.u1;
                        if (minimumHeight != i7) {
                            editText2.setMinimumHeight(i7);
                        }
                    }
                    this.X = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }
        });
        if (this.j1 == null) {
            this.j1 = this.h0.getHintTextColors();
        }
        if (this.G0) {
            if (TextUtils.isEmpty(this.H0)) {
                CharSequence hint = this.h0.getHint();
                this.i0 = hint;
                setHint(hint);
                this.h0.setHint((CharSequence) null);
            }
            this.I0 = true;
        }
        if (i4 >= 29) {
            p();
        }
        if (this.s0 != null) {
            n(this.h0.getText());
        }
        r();
        this.n0.b();
        this.f0.bringToFront();
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.bringToFront();
        Iterator it = this.f1.iterator();
        while (it.hasNext()) {
            ((OnEditTextAttachedListener) it.next()).a(this);
        }
        endCompoundLayout.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.H0)) {
            return;
        }
        this.H0 = charSequence;
        CollapsingTextHelper collapsingTextHelper = this.w1;
        if (charSequence == null || !TextUtils.equals(collapsingTextHelper.f19306A, charSequence)) {
            collapsingTextHelper.f19306A = charSequence;
            collapsingTextHelper.f19307B = null;
            Bitmap bitmap = collapsingTextHelper.f19308E;
            if (bitmap != null) {
                bitmap.recycle();
                collapsingTextHelper.f19308E = null;
            }
            collapsingTextHelper.h(false);
        }
        if (this.v1) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.w0 == z2) {
            return;
        }
        if (z2) {
            AppCompatTextView appCompatTextView = this.x0;
            if (appCompatTextView != null) {
                this.e0.addView(appCompatTextView);
                this.x0.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.x0;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.x0 = null;
        }
        this.w0 = z2;
    }

    public final void a(float f) {
        CollapsingTextHelper collapsingTextHelper = this.w1;
        if (collapsingTextHelper.f19320b == f) {
            return;
        }
        if (this.z1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z1 = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.d(getContext(), com.charging.screenshow.battery.animations.themes.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f19079b));
            this.z1.setDuration(MotionUtils.c(getContext(), com.charging.screenshow.battery.animations.themes.R.attr.motionDurationMedium4, 167));
            this.z1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.w1.m(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.z1.setFloatValues(collapsingTextHelper.f19320b, f);
        this.z1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.e0;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i2;
        int i3;
        MaterialShapeDrawable materialShapeDrawable = this.J0;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.X.f19417a;
        ShapeAppearanceModel shapeAppearanceModel2 = this.P0;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (this.S0 == 2 && (i2 = this.U0) > -1 && (i3 = this.X0) != 0) {
            MaterialShapeDrawable materialShapeDrawable2 = this.J0;
            materialShapeDrawable2.X.j = i2;
            materialShapeDrawable2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable2.X;
            if (materialShapeDrawableState.d != colorStateListValueOf) {
                materialShapeDrawableState.d = colorStateListValueOf;
                materialShapeDrawable2.onStateChange(materialShapeDrawable2.getState());
            }
        }
        int iC = this.Y0;
        if (this.S0 == 1) {
            iC = ColorUtils.c(this.Y0, MaterialColors.c(getContext(), com.charging.screenshow.battery.animations.themes.R.attr.colorSurface, 0));
        }
        this.Y0 = iC;
        this.J0.l(ColorStateList.valueOf(iC));
        MaterialShapeDrawable materialShapeDrawable3 = this.N0;
        if (materialShapeDrawable3 != null && this.O0 != null) {
            if (this.U0 > -1 && this.X0 != 0) {
                materialShapeDrawable3.l(this.h0.isFocused() ? ColorStateList.valueOf(this.l1) : ColorStateList.valueOf(this.X0));
                this.O0.l(ColorStateList.valueOf(this.X0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.G0) {
            return 0;
        }
        int i2 = this.S0;
        CollapsingTextHelper collapsingTextHelper = this.w1;
        if (i2 == 0) {
            fD = collapsingTextHelper.d();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fD = collapsingTextHelper.d() / 2.0f;
        }
        return (int) fD;
    }

    public final Fade d() {
        Fade fade = new Fade();
        fade.Z = MotionUtils.c(getContext(), com.charging.screenshow.battery.animations.themes.R.attr.motionDurationShort2, 87);
        fade.e0 = MotionUtils.d(getContext(), com.charging.screenshow.battery.animations.themes.R.attr.motionEasingLinearInterpolator, AnimationUtils.f19078a);
        return fade;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.h0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.i0 != null) {
            boolean z2 = this.I0;
            this.I0 = false;
            CharSequence hint = editText.getHint();
            this.h0.setHint(this.i0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.h0.setHint(hint);
                this.I0 = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.e0;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.h0) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.B1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z2 = this.G0;
        CollapsingTextHelper collapsingTextHelper = this.w1;
        if (z2) {
            collapsingTextHelper.getClass();
            int iSave = canvas.save();
            if (collapsingTextHelper.f19307B != null) {
                RectF rectF = collapsingTextHelper.f19325e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = collapsingTextHelper.f19312N;
                    textPaint.setTextSize(collapsingTextHelper.G);
                    float f = collapsingTextHelper.f19330p;
                    float f2 = collapsingTextHelper.q;
                    float f3 = collapsingTextHelper.f19309F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (collapsingTextHelper.f19324d0 <= 1 || collapsingTextHelper.C) {
                        canvas.translate(f, f2);
                        collapsingTextHelper.f19318Y.draw(canvas);
                    } else {
                        float lineStart = collapsingTextHelper.f19330p - collapsingTextHelper.f19318Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (collapsingTextHelper.f19321b0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(collapsingTextHelper.H, collapsingTextHelper.f19310I, collapsingTextHelper.f19311J, MaterialColors.a(collapsingTextHelper.K, textPaint.getAlpha()));
                        }
                        collapsingTextHelper.f19318Y.draw(canvas);
                        textPaint.setAlpha((int) (collapsingTextHelper.a0 * f4));
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(collapsingTextHelper.H, collapsingTextHelper.f19310I, collapsingTextHelper.f19311J, MaterialColors.a(collapsingTextHelper.K, textPaint.getAlpha()));
                        }
                        int lineBaseline = collapsingTextHelper.f19318Y.getLineBaseline(0);
                        CharSequence charSequence = collapsingTextHelper.f19323c0;
                        float f5 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(collapsingTextHelper.H, collapsingTextHelper.f19310I, collapsingTextHelper.f19311J, collapsingTextHelper.K);
                        }
                        String strTrim = collapsingTextHelper.f19323c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = android.support.v4.media.a.f(1, 0, strTrim);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(collapsingTextHelper.f19318Y.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                        canvas = canvas;
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.O0 == null || (materialShapeDrawable = this.N0) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.h0.isFocused()) {
            Rect bounds = this.O0.getBounds();
            Rect bounds2 = this.N0.getBounds();
            float f6 = collapsingTextHelper.f19320b;
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.c(f6, iCenterX, bounds2.left);
            bounds.right = AnimationUtils.c(f6, iCenterX, bounds2.right);
            this.O0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.A1) {
            return;
        }
        this.A1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.w1;
        if (collapsingTextHelper != null) {
            collapsingTextHelper.L = drawableState;
            ColorStateList colorStateList2 = collapsingTextHelper.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = collapsingTextHelper.j) == null || !colorStateList.isStateful())) {
                z2 = false;
            } else {
                collapsingTextHelper.h(false);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (this.h0 != null) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z2) {
            invalidate();
        }
        this.A1 = false;
    }

    public final boolean e() {
        return this.G0 && !TextUtils.isEmpty(this.H0) && (this.J0 instanceof CutoutDrawable);
    }

    public final MaterialShapeDrawable f(boolean z2) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.h0;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.f(f);
        builder.g(f);
        builder.d(dimensionPixelOffset);
        builder.e(dimensionPixelOffset);
        ShapeAppearanceModel shapeAppearanceModelA = builder.a();
        EditText editText2 = this.h0;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = MaterialShapeDrawable.y0;
            TypedValue typedValueC = MaterialAttributes.c(com.charging.screenshow.battery.animations.themes.R.attr.colorSurface, context, "MaterialShapeDrawable");
            int i2 = typedValueC.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? ContextCompat.getColor(context, i2) : typedValueC.data);
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.j(context);
        materialShapeDrawable.l(dropDownBackgroundTintList);
        materialShapeDrawable.k(popupElevation);
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.X;
        if (materialShapeDrawableState.g == null) {
            materialShapeDrawableState.g = new Rect();
        }
        materialShapeDrawable.X.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    public final int g(int i2, boolean z2) {
        int iC;
        if (!z2 && getPrefixText() != null) {
            iC = this.f0.a();
        } else {
            if (!z2 || getSuffixText() == null) {
                return this.h0.getCompoundPaddingLeft() + i2;
            }
            iC = this.g0.c();
        }
        return i2 + iC;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.h0;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public MaterialShapeDrawable getBoxBackground() {
        int i2 = this.S0;
        if (i2 == 1 || i2 == 2) {
            return this.J0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.Y0;
    }

    public int getBoxBackgroundMode() {
        return this.S0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.T0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zE = ViewUtils.e(this);
        RectF rectF = this.b1;
        return zE ? this.P0.f19431h.a(rectF) : this.P0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zE = ViewUtils.e(this);
        RectF rectF = this.b1;
        return zE ? this.P0.g.a(rectF) : this.P0.f19431h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zE = ViewUtils.e(this);
        RectF rectF = this.b1;
        return zE ? this.P0.f19430e.a(rectF) : this.P0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zE = ViewUtils.e(this);
        RectF rectF = this.b1;
        return zE ? this.P0.f.a(rectF) : this.P0.f19430e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.n1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.o1;
    }

    public int getBoxStrokeWidth() {
        return this.V0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.W0;
    }

    public int getCounterMaxLength() {
        return this.p0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.o0 && this.q0 && (appCompatTextView = this.s0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.D0;
    }

    public ColorStateList getCounterTextColor() {
        return this.C0;
    }

    public ColorStateList getCursorColor() {
        return this.E0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.F0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.j1;
    }

    public EditText getEditText() {
        return this.h0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.g0.k0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.g0.k0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.g0.q0;
    }

    public int getEndIconMode() {
        return this.g0.m0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.g0.r0;
    }

    public CheckableImageButton getEndIconView() {
        return this.g0.k0;
    }

    public CharSequence getError() {
        IndicatorViewController indicatorViewController = this.n0;
        if (indicatorViewController.q) {
            return indicatorViewController.f19524p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.n0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.n0.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.n0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.g0.g0.getDrawable();
    }

    public CharSequence getHelperText() {
        IndicatorViewController indicatorViewController = this.n0;
        if (indicatorViewController.x) {
            return indicatorViewController.f19526w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.n0.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.G0) {
            return this.H0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.w1.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        CollapsingTextHelper collapsingTextHelper = this.w1;
        return collapsingTextHelper.e(collapsingTextHelper.k);
    }

    public ColorStateList getHintTextColor() {
        return this.k1;
    }

    public LengthCounter getLengthCounter() {
        return this.r0;
    }

    public int getMaxEms() {
        return this.k0;
    }

    public int getMaxWidth() {
        return this.m0;
    }

    public int getMinEms() {
        return this.j0;
    }

    public int getMinWidth() {
        return this.l0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.g0.k0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.g0.k0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.w0) {
            return this.v0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.z0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.y0;
    }

    public CharSequence getPrefixText() {
        return this.f0.g0;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f0.f0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f0.f0;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.P0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f0.h0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f0.h0.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f0.k0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f0.l0;
    }

    public CharSequence getSuffixText() {
        return this.g0.t0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.g0.u0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.g0.u0;
    }

    public Typeface getTypeface() {
        return this.c1;
    }

    public final int h(int i2, boolean z2) {
        int compoundPaddingRight;
        if (z2 || getSuffixText() == null) {
            compoundPaddingRight = (!z2 || getPrefixText() == null) ? this.h0.getCompoundPaddingRight() : this.f0.a();
        } else {
            compoundPaddingRight = this.g0.c();
        }
        return i2 - compoundPaddingRight;
    }

    public final void i() {
        int i2 = this.S0;
        if (i2 == 0) {
            this.J0 = null;
            this.N0 = null;
            this.O0 = null;
        } else if (i2 == 1) {
            this.J0 = new MaterialShapeDrawable(this.P0);
            this.N0 = new MaterialShapeDrawable();
            this.O0 = new MaterialShapeDrawable();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(android.support.v4.media.a.i(this.S0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.G0 || (this.J0 instanceof CutoutDrawable)) {
                this.J0 = new MaterialShapeDrawable(this.P0);
            } else {
                ShapeAppearanceModel shapeAppearanceModel = this.P0;
                int i3 = CutoutDrawable.A0;
                if (shapeAppearanceModel == null) {
                    shapeAppearanceModel = new ShapeAppearanceModel();
                }
                CutoutDrawable.CutoutDrawableState cutoutDrawableState = new CutoutDrawable.CutoutDrawableState(shapeAppearanceModel, new RectF());
                CutoutDrawable.ImplApi18 implApi18 = new CutoutDrawable.ImplApi18(cutoutDrawableState);
                implApi18.z0 = cutoutDrawableState;
                this.J0 = implApi18;
            }
            this.N0 = null;
            this.O0 = null;
        }
        s();
        x();
        if (this.S0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.T0 = getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.d(getContext())) {
                this.T0 = getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.h0 != null && this.S0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.h0;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_filled_edittext_font_2_0_padding_top), this.h0.getPaddingEnd(), getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.d(getContext())) {
                EditText editText2 = this.h0;
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_filled_edittext_font_1_3_padding_top), this.h0.getPaddingEnd(), getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.S0 != 0) {
            t();
        }
        EditText editText3 = this.h0;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.S0;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i2;
        float f5;
        int i3;
        if (e()) {
            int width = this.h0.getWidth();
            int gravity = this.h0.getGravity();
            CollapsingTextHelper collapsingTextHelper = this.w1;
            boolean zB = collapsingTextHelper.b(collapsingTextHelper.f19306A);
            collapsingTextHelper.C = zB;
            Rect rect = collapsingTextHelper.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i3 = rect.left;
                        f3 = i3;
                    } else {
                        f = rect.right;
                        f2 = collapsingTextHelper.Z;
                    }
                } else if (zB) {
                    f = rect.right;
                    f2 = collapsingTextHelper.Z;
                } else {
                    i3 = rect.left;
                    f3 = i3;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.b1;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (collapsingTextHelper.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (collapsingTextHelper.C) {
                        f5 = collapsingTextHelper.Z;
                        f4 = f5 + fMax;
                    } else {
                        i2 = rect.right;
                        f4 = i2;
                    }
                } else if (collapsingTextHelper.C) {
                    i2 = rect.right;
                    f4 = i2;
                } else {
                    f5 = collapsingTextHelper.Z;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = collapsingTextHelper.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.R0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.U0);
                CutoutDrawable cutoutDrawable = (CutoutDrawable) this.J0;
                cutoutDrawable.getClass();
                cutoutDrawable.s(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = collapsingTextHelper.Z / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.b1;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (collapsingTextHelper.Z / 2.0f);
            } else {
                f4 = (width / 2.0f) + (collapsingTextHelper.Z / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = collapsingTextHelper.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(AppCompatTextView appCompatTextView, int i2) {
        try {
            appCompatTextView.setTextAppearance(i2);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.charging.screenshow.battery.animations.themes.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), com.charging.screenshow.battery.animations.themes.R.color.design_error));
    }

    public final boolean m() {
        IndicatorViewController indicatorViewController = this.n0;
        return (indicatorViewController.o != 1 || indicatorViewController.r == null || TextUtils.isEmpty(indicatorViewController.f19524p)) ? false : true;
    }

    public final void n(Editable editable) {
        int iC = this.r0.c(editable);
        boolean z2 = this.q0;
        int i2 = this.p0;
        String string = null;
        if (i2 == -1) {
            this.s0.setText(String.valueOf(iC));
            this.s0.setContentDescription(null);
            this.q0 = false;
        } else {
            this.q0 = iC > i2;
            Context context = getContext();
            this.s0.setContentDescription(context.getString(this.q0 ? com.charging.screenshow.battery.animations.themes.R.string.character_counter_overflowed_content_description : com.charging.screenshow.battery.animations.themes.R.string.character_counter_content_description, Integer.valueOf(iC), Integer.valueOf(this.p0)));
            if (z2 != this.q0) {
                o();
            }
            BidiFormatter bidiFormatterC = BidiFormatter.c();
            AppCompatTextView appCompatTextView = this.s0;
            String string2 = getContext().getString(com.charging.screenshow.battery.animations.themes.R.string.character_counter_pattern, Integer.valueOf(iC), Integer.valueOf(this.p0));
            if (string2 == null) {
                bidiFormatterC.getClass();
            } else {
                bidiFormatterC.getClass();
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f4397a;
                string = bidiFormatterC.d(string2).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.h0 == null || z2 == this.q0) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.s0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.q0 ? this.t0 : this.u0);
            if (!this.q0 && (colorStateList2 = this.C0) != null) {
                this.s0.setTextColor(colorStateList2);
            }
            if (!this.q0 || (colorStateList = this.D0) == null) {
                return;
            }
            this.s0.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w1.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.C1 = false;
        if (this.h0 != null && this.h0.getMeasuredHeight() < (iMax = Math.max(endCompoundLayout.getMeasuredHeight(), this.f0.getMeasuredHeight()))) {
            this.h0.setMinimumHeight(iMax);
            z2 = true;
        }
        boolean zQ = q();
        if (z2 || zQ) {
            this.h0.post(new d(this, 2));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.h0;
        if (editText != null) {
            Rect rect = this.Z0;
            DescendantOffsetUtils.a(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.N0;
            if (materialShapeDrawable != null) {
                int i6 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i6 - this.V0, rect.right, i6);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.O0;
            if (materialShapeDrawable2 != null) {
                int i7 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i7 - this.W0, rect.right, i7);
            }
            if (this.G0) {
                float textSize = this.h0.getTextSize();
                CollapsingTextHelper collapsingTextHelper = this.w1;
                if (collapsingTextHelper.f19326h != textSize) {
                    collapsingTextHelper.f19326h = textSize;
                    collapsingTextHelper.h(false);
                }
                int gravity = this.h0.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (collapsingTextHelper.g != i8) {
                    collapsingTextHelper.g = i8;
                    collapsingTextHelper.h(false);
                }
                if (collapsingTextHelper.f != gravity) {
                    collapsingTextHelper.f = gravity;
                    collapsingTextHelper.h(false);
                }
                if (this.h0 == null) {
                    throw new IllegalStateException();
                }
                boolean zE = ViewUtils.e(this);
                int i9 = rect.bottom;
                Rect rect2 = this.a1;
                rect2.bottom = i9;
                int i10 = this.S0;
                if (i10 == 1) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = rect.top + this.T0;
                    rect2.right = h(rect.right, zE);
                } else if (i10 != 2) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zE);
                } else {
                    rect2.left = this.h0.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.h0.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = collapsingTextHelper.d;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    collapsingTextHelper.M = true;
                }
                if (this.h0 == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = collapsingTextHelper.O;
                textPaint.setTextSize(collapsingTextHelper.f19326h);
                textPaint.setTypeface(collapsingTextHelper.f19331u);
                textPaint.setLetterSpacing(collapsingTextHelper.W);
                float f = -textPaint.ascent();
                rect2.left = this.h0.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.S0 != 1 || this.h0.getMinLines() > 1) ? rect.top + this.h0.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.h0.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.S0 != 1 || this.h0.getMinLines() > 1) ? rect.bottom - this.h0.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = collapsingTextHelper.f19322c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    collapsingTextHelper.M = true;
                }
                collapsingTextHelper.h(false);
                if (!e() || this.v1) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z2 = this.C1;
        EndCompoundLayout endCompoundLayout = this.g0;
        if (!z2) {
            endCompoundLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C1 = true;
        }
        if (this.x0 != null && (editText = this.h0) != null) {
            this.x0.setGravity(editText.getGravity());
            this.x0.setPadding(this.h0.getCompoundPaddingLeft(), this.h0.getCompoundPaddingTop(), this.h0.getCompoundPaddingRight(), this.h0.getCompoundPaddingBottom());
        }
        endCompoundLayout.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        setError(savedState.Z);
        if (savedState.e0) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public final void run() {
                    CheckableImageButton checkableImageButton = TextInputLayout.this.g0.k0;
                    checkableImageButton.performClick();
                    checkableImageButton.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = i2 == 1;
        if (z2 != this.Q0) {
            CornerSize cornerSize = this.P0.f19430e;
            RectF rectF = this.b1;
            float fA = cornerSize.a(rectF);
            float fA2 = this.P0.f.a(rectF);
            float fA3 = this.P0.f19431h.a(rectF);
            float fA4 = this.P0.g.a(rectF);
            ShapeAppearanceModel shapeAppearanceModel = this.P0;
            CornerTreatment cornerTreatment = shapeAppearanceModel.f19427a;
            CornerTreatment cornerTreatment2 = shapeAppearanceModel.f19428b;
            CornerTreatment cornerTreatment3 = shapeAppearanceModel.d;
            CornerTreatment cornerTreatment4 = shapeAppearanceModel.f19429c;
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.f19434a = cornerTreatment2;
            ShapeAppearanceModel.Builder.b(cornerTreatment2);
            builder.f19435b = cornerTreatment;
            ShapeAppearanceModel.Builder.b(cornerTreatment);
            builder.d = cornerTreatment4;
            ShapeAppearanceModel.Builder.b(cornerTreatment4);
            builder.f19436c = cornerTreatment3;
            ShapeAppearanceModel.Builder.b(cornerTreatment3);
            builder.f(fA2);
            builder.g(fA);
            builder.d(fA4);
            builder.e(fA3);
            ShapeAppearanceModel shapeAppearanceModelA = builder.a();
            this.Q0 = z2;
            setShapeAppearanceModel(shapeAppearanceModelA);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.Z = getError();
        }
        EndCompoundLayout endCompoundLayout = this.g0;
        savedState.e0 = endCompoundLayout.m0 != 0 && endCompoundLayout.k0.h0;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.E0;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueA = MaterialAttributes.a(context, com.charging.screenshow.battery.animations.themes.R.attr.colorControlActivated);
            if (typedValueA != null) {
                int i2 = typedValueA.resourceId;
                if (i2 != 0) {
                    colorStateListValueOf = ContextCompat.getColorStateList(context, i2);
                } else {
                    int i3 = typedValueA.data;
                    if (i3 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i3);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.h0;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.h0.getTextCursorDrawable().mutate();
        if ((m() || (this.s0 != null && this.q0)) && (colorStateList = this.F0) != null) {
            colorStateListValueOf = colorStateList;
        }
        DrawableCompat.j(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z2;
        if (this.h0 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            StartCompoundLayout startCompoundLayout = this.f0;
            if (startCompoundLayout.getMeasuredWidth() > 0) {
                int measuredWidth = startCompoundLayout.getMeasuredWidth() - this.h0.getPaddingLeft();
                if (this.d1 == null || this.e1 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.d1 = colorDrawable;
                    this.e1 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.h0.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.d1;
                if (drawable != colorDrawable2) {
                    this.h0.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (this.d1 != null) {
                Drawable[] compoundDrawablesRelative2 = this.h0.getCompoundDrawablesRelative();
                this.h0.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.d1 = null;
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (this.d1 != null) {
            Drawable[] compoundDrawablesRelative3 = this.h0.getCompoundDrawablesRelative();
            this.h0.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.d1 = null;
            z2 = true;
        } else {
            z2 = false;
        }
        EndCompoundLayout endCompoundLayout = this.g0;
        if ((endCompoundLayout.e() || ((endCompoundLayout.m0 != 0 && endCompoundLayout.d()) || endCompoundLayout.t0 != null)) && endCompoundLayout.getMeasuredWidth() > 0) {
            int measuredWidth2 = endCompoundLayout.u0.getMeasuredWidth() - this.h0.getPaddingRight();
            if (endCompoundLayout.e()) {
                checkableImageButton = endCompoundLayout.g0;
            } else if (endCompoundLayout.m0 != 0 && endCompoundLayout.d()) {
                checkableImageButton = endCompoundLayout.k0;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.h0.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.g1;
            if (colorDrawable3 != null && this.h1 != measuredWidth2) {
                this.h1 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.h0.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.g1, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.g1 = colorDrawable4;
                this.h1 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.g1;
            if (drawable2 != colorDrawable5) {
                this.i1 = drawable2;
                this.h0.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.g1 != null) {
            Drawable[] compoundDrawablesRelative5 = this.h0.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.g1) {
                this.h0.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.i1, compoundDrawablesRelative5[3]);
            } else {
                z3 = z2;
            }
            this.g1 = null;
            return z3;
        }
        return z2;
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.h0;
        if (editText == null || this.S0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = DrawableUtils.f3600a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(AppCompatDrawableManager.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.q0 && (appCompatTextView = this.s0) != null) {
            drawableMutate.setColorFilter(AppCompatDrawableManager.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.h0.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.h0;
        if (editText == null || this.J0 == null) {
            return;
        }
        if ((this.M0 || editText.getBackground() == null) && this.S0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.h0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            editText2.setBackground(editTextBoxBackground);
            this.M0 = true;
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.Y0 != i2) {
            this.Y0 = i2;
            this.p1 = i2;
            this.r1 = i2;
            this.s1 = i2;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.p1 = defaultColor;
        this.Y0 = defaultColor;
        this.q1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.r1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.s1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.S0) {
            return;
        }
        this.S0 = i2;
        if (this.h0 != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.T0 = i2;
    }

    public void setBoxCornerFamily(int i2) {
        ShapeAppearanceModel.Builder builderF = this.P0.f();
        CornerSize cornerSize = this.P0.f19430e;
        CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(i2);
        builderF.f19434a = cornerTreatmentA;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA);
        builderF.f19437e = cornerSize;
        CornerSize cornerSize2 = this.P0.f;
        CornerTreatment cornerTreatmentA2 = MaterialShapeUtils.a(i2);
        builderF.f19435b = cornerTreatmentA2;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA2);
        builderF.f = cornerSize2;
        CornerSize cornerSize3 = this.P0.f19431h;
        CornerTreatment cornerTreatmentA3 = MaterialShapeUtils.a(i2);
        builderF.d = cornerTreatmentA3;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA3);
        builderF.f19438h = cornerSize3;
        CornerSize cornerSize4 = this.P0.g;
        CornerTreatment cornerTreatmentA4 = MaterialShapeUtils.a(i2);
        builderF.f19436c = cornerTreatmentA4;
        ShapeAppearanceModel.Builder.b(cornerTreatmentA4);
        builderF.g = cornerSize4;
        this.P0 = builderF.a();
        b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.n1 != i2) {
            this.n1 = i2;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.l1 = colorStateList.getDefaultColor();
            this.t1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.m1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.n1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.n1 != colorStateList.getDefaultColor()) {
            this.n1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.o1 != colorStateList) {
            this.o1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.V0 = i2;
        x();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.W0 = i2;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.o0 != z2) {
            IndicatorViewController indicatorViewController = this.n0;
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.s0 = appCompatTextView;
                appCompatTextView.setId(com.charging.screenshow.battery.animations.themes.R.id.textinput_counter);
                Typeface typeface = this.c1;
                if (typeface != null) {
                    this.s0.setTypeface(typeface);
                }
                this.s0.setMaxLines(1);
                indicatorViewController.a(this.s0, 2);
                ((ViewGroup.MarginLayoutParams) this.s0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.s0 != null) {
                    EditText editText = this.h0;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                indicatorViewController.g(this.s0, 2);
                this.s0 = null;
            }
            this.o0 = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.p0 != i2) {
            if (i2 > 0) {
                this.p0 = i2;
            } else {
                this.p0 = -1;
            }
            if (!this.o0 || this.s0 == null) {
                return;
            }
            EditText editText = this.h0;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.t0 != i2) {
            this.t0 = i2;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.u0 != i2) {
            this.u0 = i2;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            this.C0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            if (m() || (this.s0 != null && this.q0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.j1 = colorStateList;
        this.k1 = colorStateList;
        if (this.h0 != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.g0.k0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.g0.k0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        EndCompoundLayout endCompoundLayout = this.g0;
        CharSequence text = i2 != 0 ? endCompoundLayout.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = endCompoundLayout.k0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        EndCompoundLayout endCompoundLayout = this.g0;
        Drawable drawableA = i2 != 0 ? AppCompatResources.a(endCompoundLayout.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = endCompoundLayout.k0;
        checkableImageButton.setImageDrawable(drawableA);
        if (drawableA != null) {
            ColorStateList colorStateList = endCompoundLayout.o0;
            PorterDuff.Mode mode = endCompoundLayout.p0;
            TextInputLayout textInputLayout = endCompoundLayout.e0;
            IconHelper.a(textInputLayout, checkableImageButton, colorStateList, mode);
            IconHelper.c(textInputLayout, checkableImageButton, endCompoundLayout.o0);
        }
    }

    public void setEndIconMinSize(int i2) {
        EndCompoundLayout endCompoundLayout = this.g0;
        if (i2 < 0) {
            endCompoundLayout.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != endCompoundLayout.q0) {
            endCompoundLayout.q0 = i2;
            CheckableImageButton checkableImageButton = endCompoundLayout.k0;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = endCompoundLayout.g0;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.g0.g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.g0;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.s0;
        CheckableImageButton checkableImageButton = endCompoundLayout.k0;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.s0 = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.k0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.r0 = scaleType;
        endCompoundLayout.k0.setScaleType(scaleType);
        endCompoundLayout.g0.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.g0;
        if (endCompoundLayout.o0 != colorStateList) {
            endCompoundLayout.o0 = colorStateList;
            IconHelper.a(endCompoundLayout.e0, endCompoundLayout.k0, colorStateList, endCompoundLayout.p0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.g0;
        if (endCompoundLayout.p0 != mode) {
            endCompoundLayout.p0 = mode;
            IconHelper.a(endCompoundLayout.e0, endCompoundLayout.k0, endCompoundLayout.o0, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.g0.h(z2);
    }

    public void setError(CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.n0;
        if (!indicatorViewController.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            indicatorViewController.f();
            return;
        }
        indicatorViewController.c();
        indicatorViewController.f19524p = charSequence;
        indicatorViewController.r.setText(charSequence);
        int i2 = indicatorViewController.f19523n;
        if (i2 != 1) {
            indicatorViewController.o = 1;
        }
        indicatorViewController.i(i2, indicatorViewController.o, indicatorViewController.h(indicatorViewController.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        IndicatorViewController indicatorViewController = this.n0;
        indicatorViewController.t = i2;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            appCompatTextView.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.n0;
        indicatorViewController.s = charSequence;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        IndicatorViewController indicatorViewController = this.n0;
        if (indicatorViewController.q == z2) {
            return;
        }
        indicatorViewController.c();
        TextInputLayout textInputLayout = indicatorViewController.f19520h;
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.g, null);
            indicatorViewController.r = appCompatTextView;
            appCompatTextView.setId(com.charging.screenshow.battery.animations.themes.R.id.textinput_error);
            indicatorViewController.r.setTextAlignment(5);
            Typeface typeface = indicatorViewController.f19515B;
            if (typeface != null) {
                indicatorViewController.r.setTypeface(typeface);
            }
            int i2 = indicatorViewController.f19525u;
            indicatorViewController.f19525u = i2;
            AppCompatTextView appCompatTextView2 = indicatorViewController.r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i2);
            }
            ColorStateList colorStateList = indicatorViewController.v;
            indicatorViewController.v = colorStateList;
            AppCompatTextView appCompatTextView3 = indicatorViewController.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = indicatorViewController.s;
            indicatorViewController.s = charSequence;
            AppCompatTextView appCompatTextView4 = indicatorViewController.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i3 = indicatorViewController.t;
            indicatorViewController.t = i3;
            AppCompatTextView appCompatTextView5 = indicatorViewController.r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                appCompatTextView5.setAccessibilityLiveRegion(i3);
            }
            indicatorViewController.r.setVisibility(4);
            indicatorViewController.a(indicatorViewController.r, 0);
        } else {
            indicatorViewController.f();
            indicatorViewController.g(indicatorViewController.r, 0);
            indicatorViewController.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        indicatorViewController.q = z2;
    }

    public void setErrorIconDrawable(int i2) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.i(i2 != 0 ? AppCompatResources.a(endCompoundLayout.getContext(), i2) : null);
        IconHelper.c(endCompoundLayout.e0, endCompoundLayout.g0, endCompoundLayout.h0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.g0;
        CheckableImageButton checkableImageButton = endCompoundLayout.g0;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.j0;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.j0 = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.g0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.g0;
        if (endCompoundLayout.h0 != colorStateList) {
            endCompoundLayout.h0 = colorStateList;
            IconHelper.a(endCompoundLayout.e0, endCompoundLayout.g0, colorStateList, endCompoundLayout.i0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.g0;
        if (endCompoundLayout.i0 != mode) {
            endCompoundLayout.i0 = mode;
            IconHelper.a(endCompoundLayout.e0, endCompoundLayout.g0, endCompoundLayout.h0, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        IndicatorViewController indicatorViewController = this.n0;
        indicatorViewController.f19525u = i2;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView != null) {
            indicatorViewController.f19520h.l(appCompatTextView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.n0;
        indicatorViewController.v = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.x1 != z2) {
            this.x1 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        IndicatorViewController indicatorViewController = this.n0;
        if (zIsEmpty) {
            if (indicatorViewController.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!indicatorViewController.x) {
            setHelperTextEnabled(true);
        }
        indicatorViewController.c();
        indicatorViewController.f19526w = charSequence;
        indicatorViewController.y.setText(charSequence);
        int i2 = indicatorViewController.f19523n;
        if (i2 != 2) {
            indicatorViewController.o = 2;
        }
        indicatorViewController.i(i2, indicatorViewController.o, indicatorViewController.h(indicatorViewController.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.n0;
        indicatorViewController.f19514A = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        final IndicatorViewController indicatorViewController = this.n0;
        if (indicatorViewController.x == z2) {
            return;
        }
        indicatorViewController.c();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.g, null);
            indicatorViewController.y = appCompatTextView;
            appCompatTextView.setId(com.charging.screenshow.battery.animations.themes.R.id.textinput_helper_text);
            indicatorViewController.y.setTextAlignment(5);
            Typeface typeface = indicatorViewController.f19515B;
            if (typeface != null) {
                indicatorViewController.y.setTypeface(typeface);
            }
            indicatorViewController.y.setVisibility(4);
            indicatorViewController.y.setAccessibilityLiveRegion(1);
            int i2 = indicatorViewController.f19527z;
            indicatorViewController.f19527z = i2;
            AppCompatTextView appCompatTextView2 = indicatorViewController.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i2);
            }
            ColorStateList colorStateList = indicatorViewController.f19514A;
            indicatorViewController.f19514A = colorStateList;
            AppCompatTextView appCompatTextView3 = indicatorViewController.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            indicatorViewController.a(indicatorViewController.y, 1);
            indicatorViewController.y.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editText = IndicatorViewController.this.f19520h.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            indicatorViewController.c();
            int i3 = indicatorViewController.f19523n;
            if (i3 == 2) {
                indicatorViewController.o = 0;
            }
            indicatorViewController.i(i3, indicatorViewController.o, indicatorViewController.h(indicatorViewController.y, ""));
            indicatorViewController.g(indicatorViewController.y, 1);
            indicatorViewController.y = null;
            TextInputLayout textInputLayout = indicatorViewController.f19520h;
            textInputLayout.r();
            textInputLayout.x();
        }
        indicatorViewController.x = z2;
    }

    public void setHelperTextTextAppearance(int i2) {
        IndicatorViewController indicatorViewController = this.n0;
        indicatorViewController.f19527z = i2;
        AppCompatTextView appCompatTextView = indicatorViewController.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.G0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(com.p004ironsource.mediationsdk.metadata.a.f25965n);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.y1 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.G0) {
            this.G0 = z2;
            if (z2) {
                CharSequence hint = this.h0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.H0)) {
                        setHint(hint);
                    }
                    this.h0.setHint((CharSequence) null);
                }
                this.I0 = true;
            } else {
                this.I0 = false;
                if (!TextUtils.isEmpty(this.H0) && TextUtils.isEmpty(this.h0.getHint())) {
                    this.h0.setHint(this.H0);
                }
                setHintInternal(null);
            }
            if (this.h0 != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        CollapsingTextHelper collapsingTextHelper = this.w1;
        collapsingTextHelper.j(i2);
        this.k1 = collapsingTextHelper.k;
        if (this.h0 != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.k1 != colorStateList) {
            if (this.j1 == null) {
                CollapsingTextHelper collapsingTextHelper = this.w1;
                if (collapsingTextHelper.k != colorStateList) {
                    collapsingTextHelper.k = colorStateList;
                    collapsingTextHelper.h(false);
                }
            }
            this.k1 = colorStateList;
            if (this.h0 != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(LengthCounter lengthCounter) {
        this.r0 = lengthCounter;
    }

    public void setMaxEms(int i2) {
        this.k0 = i2;
        EditText editText = this.h0;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.m0 = i2;
        EditText editText = this.h0;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.j0 = i2;
        EditText editText = this.h0;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.l0 = i2;
        EditText editText = this.h0;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.k0.setContentDescription(i2 != 0 ? endCompoundLayout.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.k0.setImageDrawable(i2 != 0 ? AppCompatResources.a(endCompoundLayout.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        EndCompoundLayout endCompoundLayout = this.g0;
        if (z2 && endCompoundLayout.m0 != 1) {
            endCompoundLayout.g(1);
        } else if (z2) {
            endCompoundLayout.getClass();
        } else {
            endCompoundLayout.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.o0 = colorStateList;
        IconHelper.a(endCompoundLayout.e0, endCompoundLayout.k0, colorStateList, endCompoundLayout.p0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.p0 = mode;
        IconHelper.a(endCompoundLayout.e0, endCompoundLayout.k0, endCompoundLayout.o0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.x0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.x0 = appCompatTextView;
            appCompatTextView.setId(com.charging.screenshow.battery.animations.themes.R.id.textinput_placeholder);
            this.x0.setImportantForAccessibility(2);
            Fade fadeD = d();
            this.A0 = fadeD;
            fadeD.f8426Y = 67L;
            this.B0 = d();
            setPlaceholderTextAppearance(this.z0);
            setPlaceholderTextColor(this.y0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.w0) {
                setPlaceholderTextEnabled(true);
            }
            this.v0 = charSequence;
        }
        EditText editText = this.h0;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.z0 = i2;
        AppCompatTextView appCompatTextView = this.x0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            AppCompatTextView appCompatTextView = this.x0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        StartCompoundLayout startCompoundLayout = this.f0;
        startCompoundLayout.getClass();
        startCompoundLayout.g0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        startCompoundLayout.f0.setText(charSequence);
        startCompoundLayout.e();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f0.f0.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f0.f0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.J0;
        if (materialShapeDrawable == null || materialShapeDrawable.X.f19417a == shapeAppearanceModel) {
            return;
        }
        this.P0 = shapeAppearanceModel;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f0.h0.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f0.h0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? AppCompatResources.a(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        StartCompoundLayout startCompoundLayout = this.f0;
        if (i2 < 0) {
            startCompoundLayout.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != startCompoundLayout.k0) {
            startCompoundLayout.k0 = i2;
            CheckableImageButton checkableImageButton = startCompoundLayout.h0;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        StartCompoundLayout startCompoundLayout = this.f0;
        View.OnLongClickListener onLongClickListener = startCompoundLayout.m0;
        CheckableImageButton checkableImageButton = startCompoundLayout.h0;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        StartCompoundLayout startCompoundLayout = this.f0;
        startCompoundLayout.m0 = onLongClickListener;
        CheckableImageButton checkableImageButton = startCompoundLayout.h0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        StartCompoundLayout startCompoundLayout = this.f0;
        startCompoundLayout.l0 = scaleType;
        startCompoundLayout.h0.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        StartCompoundLayout startCompoundLayout = this.f0;
        if (startCompoundLayout.i0 != colorStateList) {
            startCompoundLayout.i0 = colorStateList;
            IconHelper.a(startCompoundLayout.e0, startCompoundLayout.h0, colorStateList, startCompoundLayout.j0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        StartCompoundLayout startCompoundLayout = this.f0;
        if (startCompoundLayout.j0 != mode) {
            startCompoundLayout.j0 = mode;
            IconHelper.a(startCompoundLayout.e0, startCompoundLayout.h0, startCompoundLayout.i0, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f0.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.getClass();
        endCompoundLayout.t0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        endCompoundLayout.u0.setText(charSequence);
        endCompoundLayout.n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.g0.u0.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.g0.u0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.h0;
        if (editText != null) {
            ViewCompat.z(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.c1) {
            this.c1 = typeface;
            CollapsingTextHelper collapsingTextHelper = this.w1;
            boolean zK = collapsingTextHelper.k(typeface);
            boolean zL = collapsingTextHelper.l(typeface);
            if (zK || zL) {
                collapsingTextHelper.h(false);
            }
            IndicatorViewController indicatorViewController = this.n0;
            if (typeface != indicatorViewController.f19515B) {
                indicatorViewController.f19515B = typeface;
                AppCompatTextView appCompatTextView = indicatorViewController.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = indicatorViewController.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.s0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.S0 != 1) {
            FrameLayout frameLayout = this.e0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.h0;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.h0;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.j1;
        CollapsingTextHelper collapsingTextHelper = this.w1;
        if (colorStateList2 != null) {
            collapsingTextHelper.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.j1;
            collapsingTextHelper.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.t1) : this.t1));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.n0.r;
            collapsingTextHelper.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.q0 && (appCompatTextView = this.s0) != null) {
            collapsingTextHelper.i(appCompatTextView.getTextColors());
        } else if (z5 && (colorStateList = this.k1) != null && collapsingTextHelper.k != colorStateList) {
            collapsingTextHelper.k = colorStateList;
            collapsingTextHelper.h(false);
        }
        EndCompoundLayout endCompoundLayout = this.g0;
        StartCompoundLayout startCompoundLayout = this.f0;
        if (z4 || !this.x1 || (isEnabled() && z5)) {
            if (z3 || this.v1) {
                ValueAnimator valueAnimator = this.z1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.z1.cancel();
                }
                if (z2 && this.y1) {
                    a(1.0f);
                } else {
                    collapsingTextHelper.m(1.0f);
                }
                this.v1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.h0;
                v(editText3 != null ? editText3.getText() : null);
                startCompoundLayout.n0 = false;
                startCompoundLayout.e();
                endCompoundLayout.v0 = false;
                endCompoundLayout.n();
                return;
            }
            return;
        }
        if (z3 || !this.v1) {
            ValueAnimator valueAnimator2 = this.z1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.z1.cancel();
            }
            if (z2 && this.y1) {
                a(0.0f);
            } else {
                collapsingTextHelper.m(0.0f);
            }
            if (e() && !((CutoutDrawable) this.J0).z0.r.isEmpty() && e()) {
                ((CutoutDrawable) this.J0).s(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.v1 = true;
            AppCompatTextView appCompatTextView3 = this.x0;
            if (appCompatTextView3 != null && this.w0) {
                appCompatTextView3.setText((CharSequence) null);
                TransitionManager.a(this.e0, this.B0);
                this.x0.setVisibility(4);
            }
            startCompoundLayout.n0 = true;
            startCompoundLayout.e();
            endCompoundLayout.v0 = true;
            endCompoundLayout.n();
        }
    }

    public final void v(Editable editable) {
        int iC = this.r0.c(editable);
        FrameLayout frameLayout = this.e0;
        if (iC != 0 || this.v1) {
            AppCompatTextView appCompatTextView = this.x0;
            if (appCompatTextView == null || !this.w0) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            TransitionManager.a(frameLayout, this.B0);
            this.x0.setVisibility(4);
            return;
        }
        if (this.x0 == null || !this.w0 || TextUtils.isEmpty(this.v0)) {
            return;
        }
        this.x0.setText(this.v0);
        TransitionManager.a(frameLayout, this.A0);
        this.x0.setVisibility(0);
        this.x0.bringToFront();
        announceForAccessibility(this.v0);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.o1.getDefaultColor();
        int colorForState = this.o1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.o1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.X0 = colorForState2;
        } else if (z3) {
            this.X0 = colorForState;
        } else {
            this.X0 = defaultColor;
        }
    }

    public final void x() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.J0 == null || this.S0 == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.h0) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.h0) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.X0 = this.t1;
        } else if (m()) {
            if (this.o1 != null) {
                w(z3, z2);
            } else {
                this.X0 = getErrorCurrentTextColors();
            }
        } else if (!this.q0 || (appCompatTextView = this.s0) == null) {
            if (z3) {
                this.X0 = this.n1;
            } else if (z2) {
                this.X0 = this.m1;
            } else {
                this.X0 = this.l1;
            }
        } else if (this.o1 != null) {
            w(z3, z2);
        } else {
            this.X0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        EndCompoundLayout endCompoundLayout = this.g0;
        endCompoundLayout.l();
        CheckableImageButton checkableImageButton = endCompoundLayout.g0;
        ColorStateList colorStateList = endCompoundLayout.h0;
        TextInputLayout textInputLayout = endCompoundLayout.e0;
        IconHelper.c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = endCompoundLayout.o0;
        CheckableImageButton checkableImageButton2 = endCompoundLayout.k0;
        IconHelper.c(textInputLayout, checkableImageButton2, colorStateList2);
        if (endCompoundLayout.b() instanceof DropdownMenuEndIconDelegate) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                IconHelper.a(textInputLayout, checkableImageButton2, endCompoundLayout.o0, endCompoundLayout.p0);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                DrawableCompat.i(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        StartCompoundLayout startCompoundLayout = this.f0;
        IconHelper.c(startCompoundLayout.e0, startCompoundLayout.h0, startCompoundLayout.i0);
        if (this.S0 == 2) {
            int i2 = this.U0;
            if (z3 && isEnabled()) {
                this.U0 = this.W0;
            } else {
                this.U0 = this.V0;
            }
            if (this.U0 != i2 && e() && !this.v1) {
                if (e()) {
                    ((CutoutDrawable) this.J0).s(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.S0 == 1) {
            if (!isEnabled()) {
                this.Y0 = this.q1;
            } else if (z2 && !z3) {
                this.Y0 = this.s1;
            } else if (z3) {
                this.Y0 = this.r1;
            } else {
                this.Y0 = this.p1;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f0.b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.g0.k0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.g0.k0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.g0.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.g0.k0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        EndCompoundLayout endCompoundLayout = this.g0;
        CheckableImageButton checkableImageButton = endCompoundLayout.k0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = endCompoundLayout.o0;
            PorterDuff.Mode mode = endCompoundLayout.p0;
            TextInputLayout textInputLayout = endCompoundLayout.e0;
            IconHelper.a(textInputLayout, checkableImageButton, colorStateList, mode);
            IconHelper.c(textInputLayout, checkableImageButton, endCompoundLayout.o0);
        }
    }
}
