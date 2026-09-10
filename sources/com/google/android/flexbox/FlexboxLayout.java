package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public Drawable k0;
    public Drawable l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public SparseIntArray q0;
    public List r0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new AnonymousClass1();
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public float f19044Y;
        public float Z;
        public int e0;
        public float f0;
        public int g0;
        public int h0;
        public int i0;
        public int j0;
        public boolean k0;

        /* JADX INFO: renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(0, 0);
                layoutParams.X = 1;
                layoutParams.f19044Y = 0.0f;
                layoutParams.Z = 1.0f;
                layoutParams.e0 = -1;
                layoutParams.f0 = -1.0f;
                layoutParams.g0 = -1;
                layoutParams.h0 = -1;
                layoutParams.i0 = 16777215;
                layoutParams.j0 = 16777215;
                layoutParams.X = parcel.readInt();
                layoutParams.f19044Y = parcel.readFloat();
                layoutParams.Z = parcel.readFloat();
                layoutParams.e0 = parcel.readInt();
                layoutParams.f0 = parcel.readFloat();
                layoutParams.g0 = parcel.readInt();
                layoutParams.h0 = parcel.readInt();
                layoutParams.i0 = parcel.readInt();
                layoutParams.j0 = parcel.readInt();
                layoutParams.k0 = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i2) {
                return new LayoutParams[i2];
            }
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int G0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int I() {
            return this.e0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float J() {
            return this.Z;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int J0() {
            return this.h0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int K() {
            return this.g0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L0() {
            return this.j0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int P() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void S(int i2) {
            this.h0 = i2;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float T() {
            return this.f19044Y;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float U() {
            return this.f0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean Y() {
            return this.k0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c0() {
            return this.i0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int q0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int s0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void setMinWidth(int i2) {
            this.g0 = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.X);
            parcel.writeFloat(this.f19044Y);
            parcel.writeFloat(this.Z);
            parcel.writeInt(this.e0);
            parcel.writeFloat(this.f0);
            parcel.writeInt(this.g0);
            parcel.writeInt(this.h0);
            parcel.writeInt(this.i0);
            parcel.writeInt(this.j0);
            parcel.writeByte(this.k0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[EDGE_INSN: B:24:0x0068->B:36:0x0086 BREAK  A[LOOP:2: B:13:0x0048->B:28:0x0071]] */
    public final void a(Canvas canvas, boolean z2, boolean z3) {
        int paddingLeft = getPaddingLeft();
        int i2 = 0;
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.r0.size();
        int i3 = 0;
        while (i3 < size) {
            FlexLine flexLine = (FlexLine) this.r0.get(i3);
            for (int i4 = i2; i4 < flexLine.f19034h; i4++) {
                int i5 = flexLine.o + i4;
                View viewE = e(i5);
                if (viewE != null && viewE.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewE.getLayoutParams();
                    boolean z4 = true;
                    int i6 = 1;
                    while (true) {
                        if (i6 > i4) {
                            if (!h() ? (this.m0 & 1) == 0 : (this.n0 & 1) == 0) {
                                z4 = false;
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                        View viewE2 = e(i5 - i6);
                        if (viewE2 != null && viewE2.getVisibility() != 8) {
                            if (!h() ? (this.m0 & 2) == 0 : (this.n0 & 2) == 0) {
                                z4 = false;
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                        i6++;
                    }
                    if (z4) {
                        d(canvas, z2 ? viewE.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewE.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.p0, flexLine.f19031b, flexLine.g);
                    }
                    if (i4 == flexLine.f19034h - 1 && (this.n0 & 4) > 0) {
                        d(canvas, z2 ? (viewE.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.p0 : viewE.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.f19031b, flexLine.g);
                    }
                }
            }
            if (f(i3)) {
                c(canvas, paddingLeft, z3 ? flexLine.d : flexLine.f19031b - this.o0, iMax);
            }
            if (g(i3) && (this.m0 & 4) > 0) {
                c(canvas, paddingLeft, z3 ? flexLine.f19031b - this.o0 : flexLine.d, iMax);
            }
            i3++;
            i2 = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (this.q0 == null) {
            this.q0 = new SparseIntArray(getChildCount());
        }
        throw null;
    }

    public final void b(Canvas canvas, boolean z2, boolean z3) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            FlexLine flexLine = (FlexLine) this.r0.get(i2);
            for (int i3 = 0; i3 < flexLine.f19034h; i3++) {
                if (flexLine.o + i3 >= 0) {
                    throw null;
                }
            }
            if (f(i2)) {
                d(canvas, z2 ? flexLine.f19032c : flexLine.f19030a - this.p0, paddingTop, iMax);
            }
            if (g(i2) && (this.n0 & 4) > 0) {
                d(canvas, z2 ? flexLine.f19030a - this.p0 : flexLine.f19032c, paddingTop, iMax);
            }
        }
    }

    public final void c(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.k0;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i2, i3, i4 + i2, this.o0 + i3);
        this.k0.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.l0;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i2, i3, this.p0 + i2, i4 + i3);
        this.l0.draw(canvas);
    }

    public final View e(int i2) {
        if (i2 < 0) {
            return null;
        }
        throw null;
    }

    public final boolean f(int i2) {
        if (i2 >= 0 && i2 < this.r0.size()) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (((FlexLine) this.r0.get(i3)).a() > 0) {
                    if (h()) {
                        return (this.m0 & 2) != 0;
                    }
                    return (this.n0 & 2) != 0;
                }
            }
            if (h()) {
                return (this.m0 & 1) != 0;
            }
            if ((this.n0 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i2) {
        if (i2 >= 0 && i2 < this.r0.size()) {
            for (int i3 = i2 + 1; i3 < this.r0.size(); i3++) {
                if (((FlexLine) this.r0.get(i3)).a() > 0) {
                    return false;
                }
            }
            if (h()) {
                return (this.m0 & 4) != 0;
            }
            if ((this.n0 & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.X = 1;
        layoutParams.f19044Y = 0.0f;
        layoutParams.Z = 1.0f;
        layoutParams.e0 = -1;
        layoutParams.f0 = -1.0f;
        layoutParams.g0 = -1;
        layoutParams.h0 = -1;
        layoutParams.i0 = 16777215;
        layoutParams.j0 = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19058a);
        layoutParams.X = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.f19044Y = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.Z = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.e0 = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.f0 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.k0 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public int getAlignContent() {
        return this.i0;
    }

    public int getAlignItems() {
        return this.h0;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.k0;
    }

    public Drawable getDividerDrawableVertical() {
        return this.l0;
    }

    public int getFlexDirection() {
        return this.e0;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.r0.size());
        for (FlexLine flexLine : this.r0) {
            if (flexLine.a() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    public List<FlexLine> getFlexLinesInternal() {
        return this.r0;
    }

    public int getFlexWrap() {
        return this.f0;
    }

    public int getJustifyContent() {
        return this.g0;
    }

    public int getLargestMainSize() {
        Iterator it = this.r0.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((FlexLine) it.next()).f19033e);
        }
        return iMax;
    }

    public int getMaxLine() {
        return this.j0;
    }

    public int getShowDividerHorizontal() {
        return this.m0;
    }

    public int getShowDividerVertical() {
        return this.n0;
    }

    public int getSumOfCrossSize() {
        int size = this.r0.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            FlexLine flexLine = (FlexLine) this.r0.get(i3);
            if (f(i3)) {
                i2 += h() ? this.o0 : this.p0;
            }
            if (g(i3)) {
                i2 += h() ? this.o0 : this.p0;
            }
            i2 += flexLine.g;
        }
        return i2;
    }

    public final boolean h() {
        int i2 = this.e0;
        return i2 == 0 || i2 == 1;
    }

    public final void i(int i2, int i3, boolean z2) {
        float f;
        float f2;
        float f3;
        int iA;
        getPaddingLeft();
        getPaddingRight();
        int i4 = i3 - i2;
        getPaddingBottom();
        getPaddingTop();
        int size = this.r0.size();
        for (int i5 = 0; i5 < size; i5++) {
            FlexLine flexLine = (FlexLine) this.r0.get(i5);
            f(i5);
            int i6 = this.g0;
            if (i6 == 0) {
                f = 0.0f;
            } else {
                if (i6 == 1 || i6 == 2) {
                    int i7 = flexLine.f19033e;
                } else {
                    if (i6 == 3) {
                        int iA2 = flexLine.a();
                        f2 = iA2 != 1 ? iA2 - 1 : 1.0f;
                        f3 = i4 - flexLine.f19033e;
                    } else if (i6 == 4) {
                        iA = flexLine.a();
                        if (iA != 0) {
                            f3 = i4 - flexLine.f19033e;
                            f2 = iA;
                        }
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException("Invalid justifyContent is set: " + this.g0);
                        }
                        int iA3 = flexLine.a();
                        if (iA3 != 0) {
                            f3 = i4 - flexLine.f19033e;
                            iA = iA3 + 1;
                            f2 = iA;
                        }
                    }
                    f = f3 / f2;
                }
                f = 0.0f;
            }
            Math.max(f, 0.0f);
            for (int i8 = 0; i8 < flexLine.f19034h; i8++) {
                if (flexLine.o + i8 >= 0) {
                    throw null;
                }
            }
        }
    }

    public final void j(int i2, int i3, boolean z2, boolean z3) {
        float f;
        float f2;
        float f3;
        int iA;
        getPaddingTop();
        getPaddingBottom();
        getPaddingRight();
        getPaddingLeft();
        int i4 = i3 - i2;
        int size = this.r0.size();
        for (int i5 = 0; i5 < size; i5++) {
            FlexLine flexLine = (FlexLine) this.r0.get(i5);
            f(i5);
            int i6 = this.g0;
            if (i6 == 0) {
                f = 0.0f;
            } else {
                if (i6 == 1 || i6 == 2) {
                    int i7 = flexLine.f19033e;
                } else {
                    if (i6 == 3) {
                        int iA2 = flexLine.a();
                        f2 = iA2 != 1 ? iA2 - 1 : 1.0f;
                        f3 = i4 - flexLine.f19033e;
                    } else if (i6 == 4) {
                        iA = flexLine.a();
                        if (iA != 0) {
                            f3 = i4 - flexLine.f19033e;
                            f2 = iA;
                        }
                    } else {
                        if (i6 != 5) {
                            throw new IllegalStateException("Invalid justifyContent is set: " + this.g0);
                        }
                        int iA3 = flexLine.a();
                        if (iA3 != 0) {
                            f3 = i4 - flexLine.f19033e;
                            iA = iA3 + 1;
                            f2 = iA;
                        }
                    }
                    f = f3 / f2;
                }
                f = 0.0f;
            }
            Math.max(f, 0.0f);
            for (int i8 = 0; i8 < flexLine.f19034h; i8++) {
                if (flexLine.o + i8 >= 0) {
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.l0 == null && this.k0 == null) {
            return;
        }
        if (this.m0 == 0 && this.n0 == 0) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int layoutDirection = getLayoutDirection();
        int i2 = this.e0;
        if (i2 == 0) {
            a(canvas, layoutDirection == 1, this.f0 == 2);
            return;
        }
        if (i2 == 1) {
            a(canvas, layoutDirection != 1, this.f0 == 2);
            return;
        }
        if (i2 == 2) {
            boolean z2 = layoutDirection == 1;
            if (this.f0 == 2) {
                z2 = !z2;
            }
            b(canvas, z2, false);
            return;
        }
        if (i2 != 3) {
            return;
        }
        boolean z3 = layoutDirection == 1;
        if (this.f0 == 2) {
            z3 = !z3;
        }
        b(canvas, z3, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int layoutDirection = getLayoutDirection();
        int i6 = this.e0;
        if (i6 == 0) {
            i(i2, i4, layoutDirection == 1);
            return;
        }
        if (i6 == 1) {
            i(i2, i4, layoutDirection != 1);
            return;
        }
        if (i6 == 2) {
            boolean z3 = layoutDirection == 1;
            if (this.f0 == 2) {
                z3 = !z3;
            }
            j(i3, i5, z3, false);
            return;
        }
        if (i6 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.e0);
        }
        boolean z4 = layoutDirection == 1;
        if (this.f0 == 2) {
            z4 = !z4;
        }
        j(i3, i5, z4, true);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.q0 == null) {
            this.q0 = new SparseIntArray(getChildCount());
        }
        throw null;
    }

    public void setAlignContent(int i2) {
        if (this.i0 != i2) {
            this.i0 = i2;
            requestLayout();
        }
    }

    public void setAlignItems(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.k0) {
            return;
        }
        this.k0 = drawable;
        if (drawable != null) {
            this.o0 = drawable.getIntrinsicHeight();
        } else {
            this.o0 = 0;
        }
        if (this.k0 == null && this.l0 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.l0) {
            return;
        }
        this.l0 = drawable;
        if (drawable != null) {
            this.p0 = drawable.getIntrinsicWidth();
        } else {
            this.p0 = 0;
        }
        if (this.k0 == null && this.l0 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i2) {
        if (this.e0 != i2) {
            this.e0 = i2;
            requestLayout();
        }
    }

    public void setFlexLines(List<FlexLine> list) {
        this.r0 = list;
    }

    public void setFlexWrap(int i2) {
        if (this.f0 != i2) {
            this.f0 = i2;
            requestLayout();
        }
    }

    public void setJustifyContent(int i2) {
        if (this.g0 != i2) {
            this.g0 = i2;
            requestLayout();
        }
    }

    public void setMaxLine(int i2) {
        if (this.j0 != i2) {
            this.j0 = i2;
            requestLayout();
        }
    }

    public void setShowDivider(int i2) {
        setShowDividerVertical(i2);
        setShowDividerHorizontal(i2);
    }

    public void setShowDividerHorizontal(int i2) {
        if (i2 != this.m0) {
            this.m0 = i2;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i2) {
        if (i2 != this.n0) {
            this.n0 = i2;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.X = 1;
            layoutParams3.f19044Y = 0.0f;
            layoutParams3.Z = 1.0f;
            layoutParams3.e0 = -1;
            layoutParams3.f0 = -1.0f;
            layoutParams3.g0 = -1;
            layoutParams3.h0 = -1;
            layoutParams3.i0 = 16777215;
            layoutParams3.j0 = 16777215;
            layoutParams3.X = layoutParams2.X;
            layoutParams3.f19044Y = layoutParams2.f19044Y;
            layoutParams3.Z = layoutParams2.Z;
            layoutParams3.e0 = layoutParams2.e0;
            layoutParams3.f0 = layoutParams2.f0;
            layoutParams3.g0 = layoutParams2.g0;
            layoutParams3.h0 = layoutParams2.h0;
            layoutParams3.i0 = layoutParams2.i0;
            layoutParams3.j0 = layoutParams2.j0;
            layoutParams3.k0 = layoutParams2.k0;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.X = 1;
            layoutParams4.f19044Y = 0.0f;
            layoutParams4.Z = 1.0f;
            layoutParams4.e0 = -1;
            layoutParams4.f0 = -1.0f;
            layoutParams4.g0 = -1;
            layoutParams4.h0 = -1;
            layoutParams4.i0 = 16777215;
            layoutParams4.j0 = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.X = 1;
        layoutParams5.f19044Y = 0.0f;
        layoutParams5.Z = 1.0f;
        layoutParams5.e0 = -1;
        layoutParams5.f0 = -1.0f;
        layoutParams5.g0 = -1;
        layoutParams5.h0 = -1;
        layoutParams5.i0 = 16777215;
        layoutParams5.j0 = 16777215;
        return layoutParams5;
    }
}
