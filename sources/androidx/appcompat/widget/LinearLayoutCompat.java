package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public float k0;
    public boolean l0;
    public int[] m0;
    public int[] n0;
    public Drawable o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = true;
        this.f0 = -1;
        this.g0 = 0;
        this.i0 = 8388659;
        int[] iArr = R.styleable.f3284n;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i2);
        ViewCompat.y(this, context, iArr, attributeSet, tintTypedArrayE.f3646b, i2);
        TypedArray typedArray = tintTypedArrayE.f3646b;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.k0 = typedArray.getFloat(4, -1.0f);
        this.f0 = typedArray.getInt(3, -1);
        this.l0 = typedArray.getBoolean(7, false);
        setDividerDrawable(tintTypedArrayE.b(5));
        this.r0 = typedArray.getInt(8, 0);
        this.s0 = typedArray.getDimensionPixelSize(6, 0);
        tintTypedArrayE.f();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void f(Canvas canvas, int i2) {
        this.o0.setBounds(getPaddingLeft() + this.s0, i2, (getWidth() - getPaddingRight()) - this.s0, this.q0 + i2);
        this.o0.draw(canvas);
    }

    public final void g(Canvas canvas, int i2) {
        this.o0.setBounds(i2, getPaddingTop() + this.s0, this.p0 + i2, (getHeight() - getPaddingBottom()) - this.s0);
        this.o0.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f0;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f0 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.g0;
        if (this.h0 == 1 && (i2 = this.i0 & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.j0) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.j0;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f0;
    }

    public Drawable getDividerDrawable() {
        return this.o0;
    }

    public int getDividerPadding() {
        return this.s0;
    }

    public int getDividerWidth() {
        return this.p0;
    }

    public int getGravity() {
        return this.i0;
    }

    public int getOrientation() {
        return this.h0;
    }

    public int getShowDividers() {
        return this.r0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.k0;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i2 = this.h0;
        if (i2 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public final boolean k(int i2) {
        if (i2 == 0) {
            return (this.r0 & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.r0 & 4) != 0;
        }
        if ((this.r0 & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        int bottom;
        if (this.o0 == null) {
            return;
        }
        int i3 = 0;
        if (this.h0 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && k(i3)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.q0);
                }
                i3++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.q0;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = ViewUtils.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i3)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                g(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.p0);
            }
            i3++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i2 = this.p0;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.p0;
                right = left - i2;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        int i8;
        int i9;
        int baseline;
        int i10;
        int i11;
        int i12;
        int measuredHeight;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        char c2 = 2;
        if (this.h0 == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i18 = i4 - i2;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.i0;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            if (i20 != 16) {
                paddingTop = i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.j0;
            } else {
                paddingTop = getPaddingTop() + (((i5 - i3) - this.j0) / 2);
            }
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt != null && childAt.getVisibility() != i17) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i16 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft2;
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        }
                        if (k(i22)) {
                            paddingTop += this.q0;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i24;
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (k(i22)) {
                        paddingTop += this.q0;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    childAt.layout(i16, i25, measuredWidth + i16, i25 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i25;
                }
                i22++;
                c2 = c2;
                i17 = 8;
            }
            return;
        }
        boolean zA = ViewUtils.a(this);
        int paddingTop2 = getPaddingTop();
        int i26 = i5 - i3;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.i0;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z3 = this.e0;
        int[] iArr = this.m0;
        int[] iArr2 = this.n0;
        WeakHashMap weakHashMap2 = ViewCompat.f4466a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.j0;
        } else {
            paddingLeft = getPaddingLeft() + (((i4 - i2) - this.j0) / 2);
        }
        if (zA) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = 1;
            i7 = 0;
        }
        int i30 = 0;
        while (i30 < virtualChildCount2) {
            int i31 = (i6 * i30) + i7;
            View childAt2 = getChildAt(i31);
            if (childAt2 == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int i32 = paddingLeft;
                    if (z3) {
                        i9 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) layoutParams2).height != -1 ? childAt2.getBaseline() : -1;
                        i10 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                        if (i10 < 0) {
                            i10 = i29;
                        }
                        i11 = i10 & 112;
                        if (i11 != 16) {
                            if (i11 != 48) {
                                i12 = i9 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                                if (baseline != -1) {
                                    i12 = (iArr[1] - baseline) + i12;
                                }
                            } else if (i11 != 80) {
                                i12 = i9;
                            } else {
                                i12 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (k(i31)) {
                                i13 = i32 + this.p0;
                            } else {
                                i13 = i32;
                            }
                            int i33 = i13 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                            childAt2.layout(i33, i12, i33 + measuredWidth2, i12 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i33;
                        } else {
                            i12 = ((paddingBottom2 - measuredHeight3) / 2) + i9 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                        }
                        i12 -= measuredHeight;
                        if (k(i31)) {
                            i13 = i32 + this.p0;
                        } else {
                            i13 = i32;
                        }
                        int i34 = i13 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                        childAt2.layout(i34, i12, i34 + measuredWidth2, i12 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i34;
                    } else {
                        i9 = paddingTop2;
                    }
                    i10 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                    if (i10 < 0) {
                        i10 = i29;
                    }
                    i11 = i10 & 112;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            i12 = i9 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                            if (baseline != -1) {
                                i12 = (iArr[1] - baseline) + i12;
                            }
                        } else if (i11 != 80) {
                            i12 = i9;
                        } else {
                            i12 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (k(i31)) {
                            i13 = i32 + this.p0;
                        } else {
                            i13 = i32;
                        }
                        int i35 = i13 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                        childAt2.layout(i35, i12, i35 + measuredWidth2, i12 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i35;
                    } else {
                        i12 = ((paddingBottom2 - measuredHeight3) / 2) + i9 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    i12 -= measuredHeight;
                    if (k(i31)) {
                        i13 = i32 + this.p0;
                    } else {
                        i13 = i32;
                    }
                    int i36 = i13 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    childAt2.layout(i36, i12, i36 + measuredWidth2, i12 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i36;
                }
                i30++;
                i7 = i8;
                paddingTop2 = i9;
            }
            i9 = paddingTop2;
            i30++;
            i7 = i8;
            paddingTop2 = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x0502  */
    /* JADX WARN: Code duplicated, block: B:235:0x0506  */
    /* JADX WARN: Code duplicated, block: B:237:0x0527  */
    /* JADX WARN: Code duplicated, block: B:243:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x053e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0541  */
    /* JADX WARN: Code duplicated, block: B:250:0x0548 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054b  */
    /* JADX WARN: Code duplicated, block: B:366:0x079d  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int iMax;
        int i7;
        int baseline;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        LayoutParams layoutParams;
        View view;
        int i12;
        int[] iArr2;
        int i13;
        int i14;
        boolean z4;
        int i15;
        int measuredHeight;
        boolean z5;
        boolean z6;
        int iMax2;
        int i16;
        int baseline2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z7;
        int i22;
        int i23;
        int i24;
        View view2;
        boolean z8;
        LinearLayoutCompat linearLayoutCompat = this;
        int i25 = -2;
        int i26 = 1073741824;
        int i27 = 8;
        int iMax3 = 0;
        if (linearLayoutCompat.h0 == 1) {
            linearLayoutCompat.j0 = 0;
            int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i28 = linearLayoutCompat.f0;
            boolean z9 = linearLayoutCompat.l0;
            int i29 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z10 = false;
            int i30 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i29 < virtualChildCount) {
                int i31 = mode;
                View childAt = linearLayoutCompat.getChildAt(i29);
                if (childAt == null) {
                    linearLayoutCompat.j0 = linearLayoutCompat.j0;
                } else {
                    if (childAt.getVisibility() != i27) {
                        if (linearLayoutCompat.k(i29)) {
                            linearLayoutCompat.j0 += linearLayoutCompat.q0;
                        }
                        LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                        f += f2;
                        if (mode2 == i26 && ((LinearLayout.LayoutParams) layoutParams2).height == 0 && f2 > 0.0f) {
                            int i32 = linearLayoutCompat.j0;
                            linearLayoutCompat.j0 = Math.max(i32, ((LinearLayout.LayoutParams) layoutParams2).topMargin + i32 + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                            view2 = childAt;
                            i21 = mode2;
                            i22 = i28;
                            z7 = z9;
                            i23 = i29;
                            z10 = true;
                            i24 = i31;
                        } else {
                            if (((LinearLayout.LayoutParams) layoutParams2).height != 0 || f2 <= 0.0f) {
                                i20 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) layoutParams2).height = i25;
                                i20 = 0;
                            }
                            i21 = mode2;
                            z7 = z9;
                            i22 = i28;
                            i23 = i29;
                            i24 = i31;
                            linearLayoutCompat.measureChildWithMargins(childAt, i2, 0, i3, f == 0.0f ? linearLayoutCompat.j0 : 0);
                            if (i20 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) layoutParams2).height = i20;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i33 = linearLayoutCompat.j0;
                            view2 = childAt;
                            linearLayoutCompat.j0 = Math.max(i33, i33 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                            if (z7) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i22 >= 0 && i22 == i23 + 1) {
                            linearLayoutCompat.g0 = linearLayoutCompat.j0;
                        }
                        if (i23 < i22 && ((LinearLayout.LayoutParams) layoutParams2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i24 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams2).width != -1) {
                            z8 = false;
                        } else {
                            z8 = true;
                            z11 = true;
                        }
                        int i34 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i34;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z13 = z8;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i30, measuredState);
                        if (z12) {
                            i30 = iCombineMeasuredStates;
                            boolean z14 = ((LinearLayout.LayoutParams) layoutParams2).width == -1;
                            if (((LinearLayout.LayoutParams) layoutParams2).weight > 0.0f) {
                                if (!z13) {
                                    i34 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i34);
                            } else {
                                if (!z13) {
                                    i34 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i34);
                            }
                            z12 = z14;
                            iMax3 = iMax7;
                        } else {
                            i30 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams2).weight > 0.0f) {
                            if (!z13) {
                                i34 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i34);
                        } else {
                            if (!z13) {
                                i34 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i34);
                        }
                        z12 = z14;
                        iMax3 = iMax7;
                    }
                    i29 = i23 + 1;
                    i28 = i22;
                    mode = i24;
                    z9 = z7;
                    mode2 = i21;
                    i25 = -2;
                    i26 = 1073741824;
                    i27 = 8;
                }
                i21 = mode2;
                i22 = i28;
                z7 = z9;
                i23 = i29;
                i24 = i31;
                i29 = i23 + 1;
                i28 = i22;
                mode = i24;
                z9 = z7;
                mode2 = i21;
                i25 = -2;
                i26 = 1073741824;
                i27 = 8;
            }
            int i35 = mode;
            int i36 = mode2;
            boolean z15 = z9;
            int i37 = i30;
            int i38 = i3;
            if (linearLayoutCompat.j0 > 0 && linearLayoutCompat.k(virtualChildCount)) {
                linearLayoutCompat.j0 += linearLayoutCompat.q0;
            }
            if (z15 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                linearLayoutCompat.j0 = 0;
                for (int i39 = 0; i39 < virtualChildCount; i39++) {
                    View childAt2 = linearLayoutCompat.getChildAt(i39);
                    if (childAt2 == null) {
                        linearLayoutCompat.j0 = linearLayoutCompat.j0;
                    } else if (childAt2.getVisibility() != 8) {
                        LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                        int i40 = linearLayoutCompat.j0;
                        linearLayoutCompat.j0 = Math.max(i40, i40 + iMax6 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                    }
                }
            }
            int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.j0;
            linearLayoutCompat.j0 = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i38, 0);
            int i41 = (iResolveSizeAndState & 16777215) - linearLayoutCompat.j0;
            if (z10 || (i41 != 0 && f > 0.0f)) {
                float f3 = linearLayoutCompat.k0;
                if (f3 > 0.0f) {
                    f = f3;
                }
                linearLayoutCompat.j0 = 0;
                int iCombineMeasuredStates2 = i37;
                int i42 = 0;
                while (i42 < virtualChildCount) {
                    View childAt3 = linearLayoutCompat.getChildAt(i42);
                    if (childAt3.getVisibility() == 8) {
                        i42 = i42;
                    } else {
                        LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) layoutParams4).weight;
                        if (f4 > 0.0f) {
                            int i43 = (int) ((i41 * f4) / f);
                            f -= f4;
                            i41 -= i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin, ((LinearLayout.LayoutParams) layoutParams4).width);
                            if (((LinearLayout.LayoutParams) layoutParams4).height == 0) {
                                i19 = 1073741824;
                                if (i36 == 1073741824) {
                                    if (i43 <= 0) {
                                        i43 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i43;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i19));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i44 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i44;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i35 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) layoutParams4).width == -1) {
                                measuredWidth2 = i44;
                            }
                        } else {
                            i18 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z16 = z12 && ((LinearLayout.LayoutParams) layoutParams4).width == i18;
                        int i45 = linearLayoutCompat.j0;
                        linearLayoutCompat.j0 = Math.max(i45, childAt3.getMeasuredHeight() + i45 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
                        z12 = z16;
                    }
                    i42++;
                }
                linearLayoutCompat.j0 = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.j0;
                i37 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z15 && i36 != 1073741824) {
                    for (int i46 = 0; i46 < virtualChildCount; i46++) {
                        View childAt4 = linearLayoutCompat.getChildAt(i46);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z12 || i35 == 1073741824) {
                iMax4 = iMax3;
            }
            linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax4, linearLayoutCompat.getSuggestedMinimumWidth()), i2, i37), iResolveSizeAndState);
            if (z11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                int i47 = 0;
                while (i47 < virtualChildCount) {
                    View childAt5 = linearLayoutCompat.getChildAt(i47);
                    if (childAt5.getVisibility() != 8) {
                        LayoutParams layoutParams5 = (LayoutParams) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams5).width == -1) {
                            int i48 = ((LinearLayout.LayoutParams) layoutParams5).height;
                            ((LinearLayout.LayoutParams) layoutParams5).height = childAt5.getMeasuredHeight();
                            linearLayoutCompat.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i38, 0);
                            ((LinearLayout.LayoutParams) layoutParams5).height = i48;
                        }
                    }
                    i47++;
                    i38 = i3;
                }
                return;
            }
            return;
        }
        int i49 = i2;
        linearLayoutCompat.j0 = 0;
        int virtualChildCount2 = linearLayoutCompat.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i49);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (linearLayoutCompat.m0 == null || linearLayoutCompat.n0 == null) {
            linearLayoutCompat.m0 = new int[4];
            linearLayoutCompat.n0 = new int[4];
        }
        int[] iArr3 = linearLayoutCompat.m0;
        int[] iArr4 = linearLayoutCompat.n0;
        iArr3[3] = -1;
        char c2 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z17 = linearLayoutCompat.e0;
        boolean z18 = linearLayoutCompat.l0;
        boolean z19 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z20 = true;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i50 < virtualChildCount2) {
            char c3 = c2;
            View childAt6 = linearLayoutCompat.getChildAt(i50);
            if (childAt6 == null) {
                linearLayoutCompat.j0 = linearLayoutCompat.j0;
                i11 = i50;
                i16 = i52;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z17;
                z3 = z18;
            } else {
                int i53 = i51;
                if (childAt6.getVisibility() == 8) {
                    i49 = i2;
                    i11 = i50;
                    i16 = i52;
                    iArr = iArr4;
                    z2 = z17;
                    z3 = z18;
                    i51 = i53;
                    iArr2 = iArr3;
                } else {
                    if (linearLayoutCompat.k(i50)) {
                        linearLayoutCompat.j0 += linearLayoutCompat.p0;
                    }
                    LayoutParams layoutParams6 = (LayoutParams) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) layoutParams6).weight;
                    f5 += f6;
                    int i54 = i50;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams6).width == 0 && f6 > 0.0f) {
                        if (z19) {
                            linearLayoutCompat.j0 = ((LinearLayout.LayoutParams) layoutParams6).leftMargin + ((LinearLayout.LayoutParams) layoutParams6).rightMargin + linearLayoutCompat.j0;
                        } else {
                            int i55 = linearLayoutCompat.j0;
                            linearLayoutCompat.j0 = Math.max(i55, ((LinearLayout.LayoutParams) layoutParams6).leftMargin + i55 + ((LinearLayout.LayoutParams) layoutParams6).rightMargin);
                        }
                        if (z17) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z2 = z17;
                            z3 = z18;
                            i12 = i53;
                            i11 = i54;
                            layoutParams = layoutParams6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i49 = i2;
                            i13 = i52;
                            i10 = iMax8;
                        } else {
                            view = childAt6;
                            z2 = z17;
                            z3 = z18;
                            z22 = true;
                            i12 = i53;
                            i11 = i54;
                            i14 = 1073741824;
                            layoutParams = layoutParams6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i49 = i2;
                            i13 = i52;
                            i10 = iMax8;
                        }
                        if (mode4 == i14 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z4 = true;
                            z21 = true;
                        } else {
                            z4 = false;
                        }
                        i15 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i15;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z2) {
                            baseline2 = view.getBaseline();
                            z5 = z4;
                            if (baseline2 != -1) {
                                i17 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                                if (i17 < 0) {
                                    i17 = linearLayoutCompat.i0;
                                }
                                int i56 = (((i17 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i56] = Math.max(iArr2[i56], baseline2);
                                iArr[i56] = Math.max(iArr[i56], measuredHeight - baseline2);
                            }
                        } else {
                            z5 = z4;
                        }
                        int iMax10 = Math.max(i12, measuredHeight);
                        if (z20 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                            if (!z5) {
                                i15 = measuredHeight;
                            }
                            iMax8 = Math.max(i10, i15);
                            iMax2 = i13;
                        } else {
                            if (!z5) {
                                i15 = measuredHeight;
                            }
                            iMax2 = Math.max(i13, i15);
                            iMax8 = i10;
                        }
                        int i57 = iMax2;
                        i51 = iMax10;
                        i16 = i57;
                        z20 = z6;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams6).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams6).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax8;
                        i11 = i54;
                        z2 = z17;
                        z3 = z18;
                        int i58 = i9;
                        layoutParams = layoutParams6;
                        view = childAt6;
                        i12 = i53;
                        i49 = i2;
                        iArr2 = iArr3;
                        i13 = i52;
                        linearLayoutCompat.measureChildWithMargins(view, i49, f5 == 0.0f ? linearLayoutCompat.j0 : 0, i3, 0);
                        if (i58 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).width = i58;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z19) {
                            linearLayoutCompat.j0 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + linearLayoutCompat.j0;
                        } else {
                            int i59 = linearLayoutCompat.j0;
                            linearLayoutCompat.j0 = Math.max(i59, i59 + measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z3) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i15 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i15;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z2) {
                        baseline2 = view.getBaseline();
                        z5 = z4;
                        if (baseline2 != -1) {
                            i17 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i17 < 0) {
                                i17 = linearLayoutCompat.i0;
                            }
                            int i510 = (((i17 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i510] = Math.max(iArr2[i510], baseline2);
                            iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z5 = z4;
                    }
                    int iMax11 = Math.max(i12, measuredHeight);
                    if (z20) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                        if (!z5) {
                            i15 = measuredHeight;
                        }
                        iMax8 = Math.max(i10, i15);
                        iMax2 = i13;
                    } else {
                        if (!z5) {
                            i15 = measuredHeight;
                        }
                        iMax2 = Math.max(i13, i15);
                        iMax8 = i10;
                    }
                    int i511 = iMax2;
                    i51 = iMax11;
                    i16 = i511;
                    z20 = z6;
                }
            }
            i52 = i16;
            i50 = i11 + 1;
            c2 = c3;
            iArr3 = iArr2;
            iArr4 = iArr;
            z17 = z2;
            z18 = z3;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c4 = c2;
        boolean z23 = z17;
        boolean z24 = z18;
        int i60 = i51;
        int i61 = i52;
        int i62 = iMax8;
        if (linearLayoutCompat.j0 > 0 && linearLayoutCompat.k(virtualChildCount2)) {
            linearLayoutCompat.j0 += linearLayoutCompat.p0;
        }
        int i63 = iArr5[1];
        int iMax12 = (i63 == -1 && iArr5[0] == -1 && iArr5[c4] == -1 && iArr5[3] == -1) ? i60 : Math.max(i60, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c4]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i63, iArr5[c4]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            linearLayoutCompat.j0 = 0;
            for (int i64 = 0; i64 < virtualChildCount2; i64++) {
                View childAt7 = linearLayoutCompat.getChildAt(i64);
                if (childAt7 == null) {
                    linearLayoutCompat.j0 = linearLayoutCompat.j0;
                } else if (childAt7.getVisibility() != 8) {
                    LayoutParams layoutParams7 = (LayoutParams) childAt7.getLayoutParams();
                    if (z19) {
                        linearLayoutCompat.j0 = ((LinearLayout.LayoutParams) layoutParams7).leftMargin + iMax9 + ((LinearLayout.LayoutParams) layoutParams7).rightMargin + linearLayoutCompat.j0;
                    } else {
                        int i65 = linearLayoutCompat.j0;
                        linearLayoutCompat.j0 = Math.max(i65, i65 + iMax9 + ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.j0;
        linearLayoutCompat.j0 = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i49, 0);
        int i66 = (iResolveSizeAndState2 & 16777215) - linearLayoutCompat.j0;
        if (z22 || (i66 != 0 && f5 > 0.0f)) {
            float f7 = linearLayoutCompat.k0;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c4] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c4] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            linearLayoutCompat.j0 = 0;
            iMax12 = -1;
            int i67 = 0;
            while (i67 < virtualChildCount2) {
                View childAt8 = linearLayoutCompat.getChildAt(i67);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    LayoutParams layoutParams8 = (LayoutParams) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) layoutParams8).weight;
                    if (f8 > 0.0f) {
                        int i68 = (int) ((i66 * f8) / f5);
                        f5 -= f8;
                        i66 -= i68;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams8).topMargin + ((LinearLayout.LayoutParams) layoutParams8).bottomMargin, ((LinearLayout.LayoutParams) layoutParams8).height);
                        if (((LinearLayout.LayoutParams) layoutParams8).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i68 <= 0) {
                                    i68 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i68, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i68;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z19) {
                        linearLayoutCompat.j0 = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams8).leftMargin + ((LinearLayout.LayoutParams) layoutParams8).rightMargin + linearLayoutCompat.j0;
                    } else {
                        int i69 = linearLayoutCompat.j0;
                        linearLayoutCompat.j0 = Math.max(i69, childAt8.getMeasuredWidth() + i69 + ((LinearLayout.LayoutParams) layoutParams8).leftMargin + ((LinearLayout.LayoutParams) layoutParams8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams8).height == -1;
                    int i70 = ((LinearLayout.LayoutParams) layoutParams8).topMargin + ((LinearLayout.LayoutParams) layoutParams8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i70;
                    iMax12 = Math.max(iMax12, measuredHeight4);
                    if (!z25) {
                        i70 = measuredHeight4;
                    }
                    int iMax13 = Math.max(i61, i70);
                    if (z20) {
                        i7 = -1;
                        boolean z26 = ((LinearLayout.LayoutParams) layoutParams8).height == -1;
                        if (!z23 && (baseline = childAt8.getBaseline()) != i7) {
                            int i71 = ((LinearLayout.LayoutParams) layoutParams8).gravity;
                            if (i71 < 0) {
                                i71 = linearLayoutCompat.i0;
                            }
                            int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i72] = Math.max(iArr5[i72], baseline);
                            iArr6[i72] = Math.max(iArr6[i72], measuredHeight4 - baseline);
                        }
                        z20 = z26;
                        i61 = iMax13;
                    } else {
                        i7 = -1;
                    }
                    if (!z23) {
                    }
                    z20 = z26;
                    i61 = iMax13;
                }
                i67++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i4 = iResolveSizeAndState2;
            i5 = -16777216;
            linearLayoutCompat.j0 = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.j0;
            int i73 = iArr5[1];
            if (i73 == -1 && iArr5[0] == -1 && iArr5[c4] == -1 && iArr5[3] == -1) {
                i6 = 0;
            } else {
                i6 = 0;
                iMax12 = Math.max(iMax12, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c4]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[c4]))));
            }
            iMax = i61;
        } else {
            iMax = Math.max(i61, i62);
            if (z24 && mode3 != 1073741824) {
                for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                    View childAt9 = linearLayoutCompat.getChildAt(i74);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = iResolveSizeAndState2;
            i5 = -16777216;
            i6 = 0;
        }
        if (!z20 && mode4 != 1073741824) {
            iMax12 = iMax;
        }
        linearLayoutCompat.setMeasuredDimension(i4 | (iCombineMeasuredStates3 & i5), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax12, linearLayoutCompat.getSuggestedMinimumHeight()), i3, iCombineMeasuredStates3 << 16));
        if (z21) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i75 = i6;
            while (i75 < virtualChildCount2) {
                View childAt10 = linearLayoutCompat.getChildAt(i75);
                if (childAt10.getVisibility() != 8) {
                    LayoutParams layoutParams9 = (LayoutParams) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams9).height == -1) {
                        int i76 = ((LinearLayout.LayoutParams) layoutParams9).width;
                        ((LinearLayout.LayoutParams) layoutParams9).width = childAt10.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(childAt10, i49, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) layoutParams9).width = i76;
                    }
                }
                i75++;
                linearLayoutCompat = this;
                i49 = i2;
            }
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.e0 = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f0 = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.o0) {
            return;
        }
        this.o0 = drawable;
        if (drawable != null) {
            this.p0 = drawable.getIntrinsicWidth();
            this.q0 = drawable.getIntrinsicHeight();
        } else {
            this.p0 = 0;
            this.q0 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.s0 = i2;
    }

    public void setGravity(int i2) {
        if (this.i0 != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.i0 = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.i0;
        if ((8388615 & i4) != i3) {
            this.i0 = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.l0 = z2;
    }

    public void setOrientation(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.r0) {
            requestLayout();
        }
        this.r0 = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.i0;
        if ((i4 & 112) != i3) {
            this.i0 = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.k0 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
