package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.WrappedDrawable;
import androidx.core.text.BidiFormatter;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    public static final Rect B0 = new Rect();
    public static final int[] C0 = {R.attr.state_selected};
    public static final int[] D0 = {R.attr.state_checkable};
    public final TextAppearanceFontCallback A0;
    public ChipDrawable i0;
    public InsetDrawable j0;
    public RippleDrawable k0;
    public View.OnClickListener l0;
    public CompoundButton.OnCheckedChangeListener m0;
    public MaterialCheckable.OnCheckedChangeListener n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public int u0;
    public CharSequence v0;
    public final ChipTouchHelper w0;
    public boolean x0;
    public final Rect y0;
    public final RectF z0;

    public class ChipTouchHelper extends ExploreByTouchHelper {
        public ChipTouchHelper(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void l(ArrayList arrayList) {
            ChipDrawable chipDrawable;
            arrayList.add(0);
            Rect rect = Chip.B0;
            Chip chip = Chip.this;
            if (!chip.e() || (chipDrawable = chip.i0) == null || !chipDrawable.M0 || chip.l0 == null) {
                return;
            }
            arrayList.add(1);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean o(int i2, int i3) {
            boolean z2 = false;
            if (i3 == 16) {
                Chip chip = Chip.this;
                if (i2 == 0) {
                    return chip.performClick();
                }
                if (i2 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.l0;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z2 = true;
                    }
                    if (chip.x0) {
                        chip.w0.t(1, 1);
                    }
                }
            }
            return z2;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void p(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Chip chip = Chip.this;
            ChipDrawable chipDrawable = chip.i0;
            boolean z2 = chipDrawable != null && chipDrawable.S0;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            accessibilityNodeInfo.setCheckable(z2);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            accessibilityNodeInfoCompat.j(chip.getAccessibilityClassName());
            accessibilityNodeInfoCompat.q(chip.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void q(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            if (i2 != 1) {
                accessibilityNodeInfoCompat.m("");
                accessibilityNodeInfo.setBoundsInParent(Chip.B0);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.m(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                accessibilityNodeInfoCompat.m(chip.getContext().getString(com.charging.screenshow.battery.animations.themes.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void r(int i2, boolean z2) {
            if (i2 == 1) {
                Chip chip = Chip.this;
                chip.r0 = z2;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(MaterialThemeOverlay.a(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle);
        this.y0 = new Rect();
        this.z0 = new RectF();
        this.A0 = new TextAppearanceFontCallback() { // from class: com.google.android.material.chip.Chip.1
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void a(int i2) {
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void b(Typeface typeface, boolean z2) {
                Chip chip = Chip.this;
                ChipDrawable chipDrawable = chip.i0;
                chip.setText(chipDrawable.E1 ? chipDrawable.G0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
            }
        };
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ChipDrawable chipDrawable = new ChipDrawable(context2, attributeSet);
        int[] iArr = com.google.android.material.R.styleable.f;
        TypedArray typedArrayD = ThemeEnforcement.d(chipDrawable.g1, attributeSet, iArr, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        chipDrawable.G1 = typedArrayD.hasValue(37);
        Context context3 = chipDrawable.g1;
        ColorStateList colorStateListA = MaterialResources.a(context3, typedArrayD, 24);
        if (chipDrawable.z0 != colorStateListA) {
            chipDrawable.z0 = colorStateListA;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        ColorStateList colorStateListA2 = MaterialResources.a(context3, typedArrayD, 11);
        if (chipDrawable.A0 != colorStateListA2) {
            chipDrawable.A0 = colorStateListA2;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (chipDrawable.B0 != dimension) {
            chipDrawable.B0 = dimension;
            chipDrawable.invalidateSelf();
            chipDrawable.z();
        }
        if (typedArrayD.hasValue(12)) {
            chipDrawable.F(typedArrayD.getDimension(12, 0.0f));
        }
        chipDrawable.K(MaterialResources.a(context3, typedArrayD, 22));
        chipDrawable.L(typedArrayD.getDimension(23, 0.0f));
        chipDrawable.U(MaterialResources.a(context3, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(chipDrawable.G0, text);
        TextDrawableHelper textDrawableHelper = chipDrawable.m1;
        if (!zEquals) {
            chipDrawable.G0 = text;
            textDrawableHelper.f19348e = true;
            chipDrawable.invalidateSelf();
            chipDrawable.z();
        }
        TextAppearance textAppearance = (!typedArrayD.hasValue(0) || (resourceId3 = typedArrayD.getResourceId(0, 0)) == 0) ? null : new TextAppearance(context3, resourceId3);
        textAppearance.k = typedArrayD.getDimension(1, textAppearance.k);
        textDrawableHelper.c(textAppearance, context3);
        int i2 = typedArrayD.getInt(3, 0);
        if (i2 == 1) {
            chipDrawable.D1 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            chipDrawable.D1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            chipDrawable.D1 = TextUtils.TruncateAt.END;
        }
        chipDrawable.J(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable.J(typedArrayD.getBoolean(15, false));
        }
        chipDrawable.G(MaterialResources.c(context3, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            chipDrawable.I(MaterialResources.a(context3, typedArrayD, 17));
        }
        chipDrawable.H(typedArrayD.getDimension(16, -1.0f));
        chipDrawable.R(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable.R(typedArrayD.getBoolean(26, false));
        }
        chipDrawable.M(MaterialResources.c(context3, typedArrayD, 25));
        chipDrawable.Q(MaterialResources.a(context3, typedArrayD, 30));
        chipDrawable.O(typedArrayD.getDimension(28, 0.0f));
        chipDrawable.B(typedArrayD.getBoolean(6, false));
        chipDrawable.E(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable.E(typedArrayD.getBoolean(8, false));
        }
        chipDrawable.C(MaterialResources.c(context3, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            chipDrawable.D(MaterialResources.a(context3, typedArrayD, 9));
        }
        chipDrawable.W0 = (!typedArrayD.hasValue(39) || (resourceId2 = typedArrayD.getResourceId(39, 0)) == 0) ? null : MotionSpec.a(context3, resourceId2);
        chipDrawable.X0 = (!typedArrayD.hasValue(33) || (resourceId = typedArrayD.getResourceId(33, 0)) == 0) ? null : MotionSpec.a(context3, resourceId);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (chipDrawable.Y0 != dimension2) {
            chipDrawable.Y0 = dimension2;
            chipDrawable.invalidateSelf();
            chipDrawable.z();
        }
        chipDrawable.T(typedArrayD.getDimension(35, 0.0f));
        chipDrawable.S(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (chipDrawable.b1 != dimension3) {
            chipDrawable.b1 = dimension3;
            chipDrawable.invalidateSelf();
            chipDrawable.z();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (chipDrawable.c1 != dimension4) {
            chipDrawable.c1 = dimension4;
            chipDrawable.invalidateSelf();
            chipDrawable.z();
        }
        chipDrawable.P(typedArrayD.getDimension(29, 0.0f));
        chipDrawable.N(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (chipDrawable.f1 != dimension5) {
            chipDrawable.f1 = dimension5;
            chipDrawable.invalidateSelf();
            chipDrawable.z();
        }
        chipDrawable.F1 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        ThemeEnforcement.a(context2, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action);
        ThemeEnforcement.b(context2, attributeSet, iArr, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action);
        this.s0 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.u0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(ViewUtils.b(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(chipDrawable);
        chipDrawable.k(ViewCompat.k(this));
        ThemeEnforcement.a(context2, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action);
        ThemeEnforcement.b(context2, attributeSet, iArr, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.charging.screenshow.battery.animations.themes.R.attr.chipStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.w0 = new ChipTouchHelper(this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.chip.Chip.2
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    ChipDrawable chipDrawable2 = Chip.this.i0;
                    if (chipDrawable2 != null) {
                        chipDrawable2.getOutline(outline);
                    } else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
        setChecked(this.o0);
        setText(chipDrawable.G0);
        setEllipsize(chipDrawable.D1);
        i();
        if (!this.i0.E1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.s0) {
            setMinHeight(this.u0);
        }
        this.t0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                Chip chip = this.X;
                MaterialCheckable.OnCheckedChangeListener onCheckedChangeListener = chip.n0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.a(chip, z2);
                    throw null;
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.m0;
                if (onCheckedChangeListener2 != null) {
                    onCheckedChangeListener2.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.z0;
        rectF.setEmpty();
        if (e() && this.l0 != null) {
            ChipDrawable chipDrawable = this.i0;
            Rect bounds = chipDrawable.getBounds();
            rectF.setEmpty();
            if (chipDrawable.X()) {
                float f = chipDrawable.f1 + chipDrawable.e1 + chipDrawable.Q0 + chipDrawable.d1 + chipDrawable.c1;
                if (DrawableCompat.d(chipDrawable) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.y0;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.m1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.q0 != z2) {
            this.q0 = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.p0 != z2) {
            this.p0 = z2;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public final void a() {
        d(this.u0);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i2) {
        this.u0 = i2;
        if (!this.s0) {
            InsetDrawable insetDrawable = this.j0;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.j0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i2 - ((int) this.i0.B0));
        int iMax2 = Math.max(0, i2 - this.i0.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.j0;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.j0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.j0 != null) {
            Rect rect = new Rect();
            this.j0.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                g();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.j0 = new InsetDrawable((Drawable) this.i0, i3, i4, i3, i4);
        g();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        if (!this.x0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        ChipTouchHelper chipTouchHelper = this.w0;
        AccessibilityManager accessibilityManager = chipTouchHelper.f4583h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                chipTouchHelper.getClass();
                Chip chip = Chip.this;
                int i3 = (chip.e() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i4 = chipTouchHelper.m;
                if (i4 != i3) {
                    chipTouchHelper.m = i3;
                    chipTouchHelper.t(i3, 128);
                    chipTouchHelper.t(i4, 256);
                }
                if (i3 == Integer.MIN_VALUE) {
                    if (!super.dispatchHoverEvent(motionEvent)) {
                        return false;
                    }
                }
            } else if (action == 10 && (i2 = chipTouchHelper.m) != Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    chipTouchHelper.m = Integer.MIN_VALUE;
                    chipTouchHelper.t(i2, 256);
                }
            } else if (!super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i2;
        if (!this.x0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ChipTouchHelper chipTouchHelper = this.w0;
        chipTouchHelper.getClass();
        boolean zM = false;
        int i3 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i4 = 33;
                                } else if (keyCode == 21) {
                                    i4 = 17;
                                } else if (keyCode != 22) {
                                    i4 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i3 < repeatCount && chipTouchHelper.m(i4, null)) {
                                    i3++;
                                    z2 = true;
                                }
                                zM = z2;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i2 = chipTouchHelper.f4585l;
                                if (i2 != Integer.MIN_VALUE) {
                                    chipTouchHelper.o(i2, 16);
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i2 = chipTouchHelper.f4585l;
                    if (i2 != Integer.MIN_VALUE) {
                        chipTouchHelper.o(i2, 16);
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = chipTouchHelper.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = chipTouchHelper.m(1, null);
            }
        }
        if (!zM || chipTouchHelper.f4585l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i2;
        int i3;
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.i0;
        boolean zA = false;
        if (chipDrawable != null && ChipDrawable.y(chipDrawable.N0)) {
            ChipDrawable chipDrawable2 = this.i0;
            ?? IsEnabled = isEnabled();
            if (this.r0) {
                i2 = IsEnabled;
                i2 = IsEnabled + 1;
            }
            i2 = IsEnabled;
            int i4 = i2;
            if (this.q0) {
                i4 = i2 + 1;
            }
            int i5 = i4;
            if (this.p0) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (this.r0) {
                iArr[i3] = 16842908;
                i3++;
            }
            if (this.q0) {
                iArr[i3] = 16843623;
                i3++;
            }
            if (this.p0) {
                iArr[i3] = 16842919;
                i3++;
            }
            if (isChecked()) {
                iArr[i3] = 16842913;
            }
            if (!Arrays.equals(chipDrawable2.A1, iArr)) {
                chipDrawable2.A1 = iArr;
                if (chipDrawable2.X()) {
                    zA = chipDrawable2.A(chipDrawable2.getState(), iArr);
                }
            }
        }
        if (zA) {
            invalidate();
        }
    }

    public final boolean e() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null) {
            return false;
        }
        Object objA = chipDrawable.N0;
        if (objA == null) {
            objA = null;
        } else if (objA instanceof WrappedDrawable) {
            objA = ((WrappedDrawable) objA).a();
        }
        return objA != null;
    }

    public final void f() {
        ChipDrawable chipDrawable;
        if (!e() || (chipDrawable = this.i0) == null || !chipDrawable.M0 || this.l0 == null) {
            ViewCompat.z(this, null);
            this.x0 = false;
        } else {
            ViewCompat.z(this, this.w0);
            this.x0 = true;
        }
    }

    public final void g() {
        this.k0 = new RippleDrawable(RippleUtils.c(this.i0.F0), getBackgroundDrawable(), null);
        this.i0.getClass();
        RippleDrawable rippleDrawable = this.k0;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.v0)) {
            return this.v0;
        }
        ChipDrawable chipDrawable = this.i0;
        if (!(chipDrawable != null && chipDrawable.S0)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof ChipGroup)) {
            return "android.widget.Button";
        }
        ((ChipGroup) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.j0;
        return insetDrawable == null ? this.i0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.U0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.V0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.A0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.w());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.i0;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.f1;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || (drawable = chipDrawable.I0) == 0) {
            return null;
        }
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).a() : drawable;
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.K0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.J0;
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.B0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.Y0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.D0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.E0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || (drawable = chipDrawable.N0) == 0) {
            return null;
        }
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).a() : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.R0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.e1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.Q0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.d1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.P0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.D1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.x0) {
            ChipTouchHelper chipTouchHelper = this.w0;
            if (chipTouchHelper.f4585l == 1 || chipTouchHelper.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.X0;
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.a1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.Z0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.F0;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.i0.X.f19417a;
    }

    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.W0;
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.c1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            return chipDrawable.b1;
        }
        return 0.0f;
    }

    public final void h() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.i0) == null) {
            return;
        }
        int iV = (int) (chipDrawable.v() + chipDrawable.f1 + chipDrawable.c1);
        ChipDrawable chipDrawable2 = this.i0;
        int iU = (int) (chipDrawable2.u() + chipDrawable2.Y0 + chipDrawable2.b1);
        if (this.j0 != null) {
            Rect rect = new Rect();
            this.j0.getPadding(rect);
            iU += rect.left;
            iV += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        setPaddingRelative(iU, paddingTop, iV, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.A0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, this.i0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C0);
        }
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null && chipDrawable.S0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.x0) {
            ChipTouchHelper chipTouchHelper = this.w0;
            int i3 = chipTouchHelper.f4585l;
            if (i3 != Integer.MIN_VALUE) {
                chipTouchHelper.j(i3);
            }
            if (z2) {
                chipTouchHelper.m(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        ChipDrawable chipDrawable = this.i0;
        int i3 = 0;
        accessibilityNodeInfo.setCheckable(chipDrawable != null && chipDrawable.S0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            if (!chipGroup.g0) {
                i2 = -1;
                break;
            }
            i2 = 0;
            while (true) {
                if (i3 >= chipGroup.getChildCount()) {
                    i2 = -1;
                    break;
                }
                View childAt = chipGroup.getChildAt(i3);
                if ((childAt instanceof Chip) && chipGroup.getChildAt(i3).getVisibility() == 0) {
                    if (((Chip) childAt) == this) {
                        break;
                    } else {
                        i2++;
                    }
                }
                i3++;
            }
            Object tag = getTag(com.charging.screenshow.battery.animations.themes.R.id.row_index_key);
            accessibilityNodeInfoCompat.l(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i2, 1, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.t0 != i2) {
            this.t0 = i2;
            h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.p0) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z2 = true;
                }
                z2 = false;
            } else {
                if (this.p0) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.l0;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.x0) {
                        this.w0.t(1, 1);
                    }
                    z2 = true;
                }
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.v0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.k0) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.k0) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.B(z2);
        }
    }

    public void setCheckableResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.B(chipDrawable.g1.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null) {
            this.o0 = z2;
        } else if (chipDrawable.S0) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.C(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.C(AppCompatResources.a(chipDrawable.g1, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.D(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.D(ContextCompat.getColorStateList(chipDrawable.g1, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.E(chipDrawable.g1.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.A0 == colorStateList) {
            return;
        }
        chipDrawable.A0 = colorStateList;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList colorStateList;
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.A0 == (colorStateList = ContextCompat.getColorStateList(chipDrawable.g1, i2))) {
            return;
        }
        chipDrawable.A0 = colorStateList;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.F(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.F(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.i0;
        if (chipDrawable2 != chipDrawable) {
            if (chipDrawable2 != null) {
                chipDrawable2.C1 = new WeakReference(null);
            }
            this.i0 = chipDrawable;
            chipDrawable.E1 = false;
            chipDrawable.C1 = new WeakReference(this);
            d(this.u0);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.f1 == f) {
            return;
        }
        chipDrawable.f1 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.z();
    }

    public void setChipEndPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            float dimension = chipDrawable.g1.getResources().getDimension(i2);
            if (chipDrawable.f1 != dimension) {
                chipDrawable.f1 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.z();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.G(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.G(AppCompatResources.a(chipDrawable.g1, i2));
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.H(f);
        }
    }

    public void setChipIconSizeResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.H(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.I(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.I(ContextCompat.getColorStateList(chipDrawable.g1, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.J(chipDrawable.g1.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.B0 == f) {
            return;
        }
        chipDrawable.B0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.z();
    }

    public void setChipMinHeightResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            float dimension = chipDrawable.g1.getResources().getDimension(i2);
            if (chipDrawable.B0 != dimension) {
                chipDrawable.B0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.z();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.Y0 == f) {
            return;
        }
        chipDrawable.Y0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.z();
    }

    public void setChipStartPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            float dimension = chipDrawable.g1.getResources().getDimension(i2);
            if (chipDrawable.Y0 != dimension) {
                chipDrawable.Y0 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.z();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.K(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.K(ContextCompat.getColorStateList(chipDrawable.g1, i2));
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.L(f);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.L(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.M(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.R0 == charSequence) {
            return;
        }
        BidiFormatter bidiFormatterC = BidiFormatter.c();
        bidiFormatterC.getClass();
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f4397a;
        chipDrawable.R0 = bidiFormatterC.d(charSequence);
        chipDrawable.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.N(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.N(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.M(AppCompatResources.a(chipDrawable.g1, i2));
        }
        f();
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.O(f);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.O(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.P(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.P(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.Q(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.Q(ContextCompat.getColorStateList(chipDrawable.g1, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.i0 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.D1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.s0 = z2;
        d(this.u0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.X0 = motionSpec;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.X0 = MotionSpec.a(chipDrawable.g1, i2);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.S(f);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.S(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.T(f);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.T(chipDrawable.g1.getResources().getDimension(i2));
        }
    }

    public void setInternalOnCheckedChangeListener(MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.n0 = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.i0 == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.F1 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.m0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.l0 = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.U(colorStateList);
        }
        this.i0.getClass();
        g();
    }

    public void setRippleColorResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.U(ContextCompat.getColorStateList(chipDrawable.g1, i2));
            this.i0.getClass();
            g();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.i0.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.W0 = motionSpec;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.W0 = MotionSpec.a(chipDrawable.g1, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(chipDrawable.E1 ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.i0;
        if (chipDrawable2 == null || TextUtils.equals(chipDrawable2.G0, charSequence)) {
            return;
        }
        chipDrawable2.G0 = charSequence;
        chipDrawable2.m1.f19348e = true;
        chipDrawable2.invalidateSelf();
        chipDrawable2.z();
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.m1.c(textAppearance, chipDrawable.g1);
        }
        i();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.c1 == f) {
            return;
        }
        chipDrawable.c1 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.z();
    }

    public void setTextEndPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            float dimension = chipDrawable.g1.getResources().getDimension(i2);
            if (chipDrawable.c1 != dimension) {
                chipDrawable.c1 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.z();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            float fApplyDimension = TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics());
            TextDrawableHelper textDrawableHelper = chipDrawable.m1;
            TextAppearance textAppearance = textDrawableHelper.g;
            if (textAppearance != null) {
                textAppearance.k = fApplyDimension;
                textDrawableHelper.f19345a.setTextSize(fApplyDimension);
                chipDrawable.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable == null || chipDrawable.b1 == f) {
            return;
        }
        chipDrawable.b1 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.z();
    }

    public void setTextStartPaddingResource(int i2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            float dimension = chipDrawable.g1.getResources().getDimension(i2);
            if (chipDrawable.b1 != dimension) {
                chipDrawable.b1 = dimension;
                chipDrawable.invalidateSelf();
                chipDrawable.z();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.R(z2);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.E(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            chipDrawable.J(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            Context context2 = chipDrawable.g1;
            chipDrawable.m1.c(new TextAppearance(context2, i2), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        ChipDrawable chipDrawable = this.i0;
        if (chipDrawable != null) {
            Context context = chipDrawable.g1;
            chipDrawable.m1.c(new TextAppearance(context, i2), context);
        }
        i();
    }
}
