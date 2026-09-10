package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.a;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements FlexContainer, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final Rect z0 = new Rect();
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f19045Y;
    public final int Z;
    public boolean f0;
    public boolean g0;
    public RecyclerView.Recycler j0;
    public RecyclerView.State k0;
    public LayoutState l0;
    public OrientationHelper n0;
    public OrientationHelper o0;
    public SavedState p0;
    public final Context v0;
    public View w0;
    public final int e0 = -1;
    public List h0 = new ArrayList();
    public final FlexboxHelper i0 = new FlexboxHelper(this);
    public final AnchorInfo m0 = new AnchorInfo();
    public int q0 = -1;
    public int r0 = Integer.MIN_VALUE;
    public int s0 = Integer.MIN_VALUE;
    public int t0 = Integer.MIN_VALUE;
    public final SparseArray u0 = new SparseArray();
    public int x0 = -1;
    public final FlexboxHelper.FlexLinesResult y0 = new FlexboxHelper.FlexLinesResult();

    public class AnchorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19048c;
        public int d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19049e;
        public boolean f;
        public boolean g;

        public AnchorInfo() {
        }

        public static void a(AnchorInfo anchorInfo) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.x() || !flexboxLayoutManager.f0) {
                anchorInfo.f19048c = anchorInfo.f19049e ? flexboxLayoutManager.n0.i() : flexboxLayoutManager.n0.m();
            } else {
                anchorInfo.f19048c = anchorInfo.f19049e ? flexboxLayoutManager.n0.i() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.n0.m();
            }
        }

        public static void b(AnchorInfo anchorInfo) {
            anchorInfo.f19046a = -1;
            anchorInfo.f19047b = -1;
            anchorInfo.f19048c = Integer.MIN_VALUE;
            anchorInfo.f = false;
            anchorInfo.g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.x()) {
                int i2 = flexboxLayoutManager.f19045Y;
                if (i2 == 0) {
                    anchorInfo.f19049e = flexboxLayoutManager.X == 1;
                    return;
                } else {
                    anchorInfo.f19049e = i2 == 2;
                    return;
                }
            }
            int i3 = flexboxLayoutManager.f19045Y;
            if (i3 == 0) {
                anchorInfo.f19049e = flexboxLayoutManager.X == 3;
            } else {
                anchorInfo.f19049e = i3 == 2;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f19046a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f19047b);
            sb.append(", mCoordinate=");
            sb.append(this.f19048c);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.d);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f19049e);
            sb.append(", mValid=");
            sb.append(this.f);
            sb.append(", mAssignedFromSavedState=");
            return a.r(sb, this.g, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new AnonymousClass1();
        public float f0;
        public float g0;
        public int h0;
        public float i0;
        public int j0;
        public int k0;
        public int l0;
        public int m0;
        public boolean n0;

        /* JADX INFO: renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.f0 = 0.0f;
                layoutParams.g0 = 1.0f;
                layoutParams.h0 = -1;
                layoutParams.i0 = -1.0f;
                layoutParams.l0 = 16777215;
                layoutParams.m0 = 16777215;
                layoutParams.f0 = parcel.readFloat();
                layoutParams.g0 = parcel.readFloat();
                layoutParams.h0 = parcel.readInt();
                layoutParams.i0 = parcel.readFloat();
                layoutParams.j0 = parcel.readInt();
                layoutParams.k0 = parcel.readInt();
                layoutParams.l0 = parcel.readInt();
                layoutParams.m0 = parcel.readInt();
                layoutParams.n0 = parcel.readByte() != 0;
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
            return this.h0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float J() {
            return this.g0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int J0() {
            return this.k0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int K() {
            return this.j0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L0() {
            return this.m0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int P() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void S(int i2) {
            this.k0 = i2;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float T() {
            return this.f0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float U() {
            return this.i0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean Y() {
            return this.n0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c0() {
            return this.l0;
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
            this.j0 = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeFloat(this.f0);
            parcel.writeFloat(this.g0);
            parcel.writeInt(this.h0);
            parcel.writeFloat(this.i0);
            parcel.writeInt(this.j0);
            parcel.writeInt(this.k0);
            parcel.writeInt(this.l0);
            parcel.writeInt(this.m0);
            parcel.writeByte(this.n0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public static class LayoutState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19053c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19054e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19055h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19056i;
        public boolean j;

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.f19051a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f19053c);
            sb.append(", mPosition=");
            sb.append(this.d);
            sb.append(", mOffset=");
            sb.append(this.f19054e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.g);
            sb.append(", mItemDirection=");
            sb.append(this.f19055h);
            sb.append(", mLayoutDirection=");
            return android.support.v4.media.a.p(sb, this.f19056i, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19057Y;

        /* JADX INFO: renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.X = parcel.readInt();
                savedState.f19057Y = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.X);
            sb.append(", mAnchorOffset=");
            return android.support.v4.media.a.p(sb, this.f19057Y, AbstractJsonLexerKt.END_OBJ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.X);
            parcel.writeInt(this.f19057Y);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3);
        int i4 = properties.f8103a;
        if (i4 != 0) {
            if (i4 == 1) {
                if (properties.f8105c) {
                    A(3);
                } else {
                    A(2);
                }
            }
        } else if (properties.f8105c) {
            A(1);
        } else {
            A(0);
        }
        int i5 = this.f19045Y;
        if (i5 != 1) {
            if (i5 == 0) {
                removeAllViews();
                this.h0.clear();
                AnchorInfo anchorInfo = this.m0;
                AnchorInfo.b(anchorInfo);
                anchorInfo.d = 0;
            }
            this.f19045Y = 1;
            this.n0 = null;
            this.o0 = null;
            requestLayout();
        }
        if (this.Z != 4) {
            removeAllViews();
            this.h0.clear();
            AnchorInfo anchorInfo2 = this.m0;
            AnchorInfo.b(anchorInfo2);
            anchorInfo2.d = 0;
            this.Z = 4;
            requestLayout();
        }
        setAutoMeasureEnabled(true);
        this.v0 = context;
    }

    public static boolean b(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    public final void A(int i2) {
        if (this.X != i2) {
            removeAllViews();
            this.X = i2;
            this.n0 = null;
            this.o0 = null;
            this.h0.clear();
            AnchorInfo anchorInfo = this.m0;
            AnchorInfo.b(anchorInfo);
            anchorInfo.d = 0;
            requestLayout();
        }
    }

    public final boolean B(View view, int i2, int i3, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && b(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).width) && b(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final void C(int i2) {
        View viewM = m(getChildCount() - 1, -1);
        if (i2 >= (viewM != null ? getPosition(viewM) : -1)) {
            return;
        }
        int childCount = getChildCount();
        FlexboxHelper flexboxHelper = this.i0;
        flexboxHelper.f(childCount);
        flexboxHelper.g(childCount);
        flexboxHelper.e(childCount);
        if (i2 >= flexboxHelper.f19041c.length) {
            return;
        }
        this.x0 = i2;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.q0 = getPosition(childAt);
        if (x() || !this.f0) {
            this.r0 = this.n0.g(childAt) - this.n0.m();
        } else {
            this.r0 = this.n0.j() + this.n0.d(childAt);
        }
    }

    public final void D(AnchorInfo anchorInfo, boolean z2, boolean z3) {
        int i2;
        if (z3) {
            z();
        } else {
            this.l0.f19052b = false;
        }
        if (x() || !this.f0) {
            this.l0.f19051a = this.n0.i() - anchorInfo.f19048c;
        } else {
            this.l0.f19051a = anchorInfo.f19048c - getPaddingRight();
        }
        LayoutState layoutState = this.l0;
        layoutState.d = anchorInfo.f19046a;
        layoutState.f19055h = 1;
        layoutState.f19056i = 1;
        layoutState.f19054e = anchorInfo.f19048c;
        layoutState.f = Integer.MIN_VALUE;
        layoutState.f19053c = anchorInfo.f19047b;
        if (!z2 || this.h0.size() <= 1 || (i2 = anchorInfo.f19047b) < 0 || i2 >= this.h0.size() - 1) {
            return;
        }
        FlexLine flexLine = (FlexLine) this.h0.get(anchorInfo.f19047b);
        LayoutState layoutState2 = this.l0;
        layoutState2.f19053c++;
        layoutState2.d += flexLine.f19034h;
    }

    public final void E(AnchorInfo anchorInfo, boolean z2, boolean z3) {
        if (z3) {
            z();
        } else {
            this.l0.f19052b = false;
        }
        if (x() || !this.f0) {
            this.l0.f19051a = anchorInfo.f19048c - this.n0.m();
        } else {
            this.l0.f19051a = (this.w0.getWidth() - anchorInfo.f19048c) - this.n0.m();
        }
        LayoutState layoutState = this.l0;
        layoutState.d = anchorInfo.f19046a;
        layoutState.f19055h = 1;
        layoutState.f19056i = -1;
        layoutState.f19054e = anchorInfo.f19048c;
        layoutState.f = Integer.MIN_VALUE;
        int i2 = anchorInfo.f19047b;
        layoutState.f19053c = i2;
        if (!z2 || i2 <= 0) {
            return;
        }
        int size = this.h0.size();
        int i3 = anchorInfo.f19047b;
        if (size > i3) {
            FlexLine flexLine = (FlexLine) this.h0.get(i3);
            LayoutState layoutState2 = this.l0;
            layoutState2.f19053c--;
            layoutState2.d -= flexLine.f19034h;
        }
    }

    public final void F(int i2, View view) {
        this.u0.put(i2, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        if (this.f19045Y == 0) {
            return x();
        }
        if (!x()) {
            return true;
        }
        int width = getWidth();
        View view = this.w0;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.f19045Y == 0) {
            return !x();
        }
        if (!x()) {
            int height = getHeight();
            View view = this.w0;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i2) {
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = i2 < getPosition(getChildAt(0)) ? -1 : 1;
        return x() ? new PointF(0.0f, i3) : new PointF(i3, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return f(state);
    }

    public final int d(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = state.b();
        g();
        View viewI = i(iB);
        View viewK = k(iB);
        if (state.b() == 0 || viewI == null || viewK == null) {
            return 0;
        }
        return Math.min(this.n0.n(), this.n0.d(viewK) - this.n0.g(viewI));
    }

    public final int e(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iB = state.b();
        View viewI = i(iB);
        View viewK = k(iB);
        if (state.b() == 0 || viewI == null || viewK == null) {
            return 0;
        }
        int position = getPosition(viewI);
        int position2 = getPosition(viewK);
        int iAbs = Math.abs(this.n0.d(viewK) - this.n0.g(viewI));
        int[] iArr = this.i0.f19041c;
        int i2 = iArr[position];
        if (i2 == 0 || i2 == -1) {
            return 0;
        }
        return Math.round((i2 * (iAbs / ((iArr[position2] - i2) + 1))) + (this.n0.m() - this.n0.g(viewI)));
    }

    public final int f(RecyclerView.State state) {
        if (getChildCount() != 0) {
            int iB = state.b();
            View viewI = i(iB);
            View viewK = k(iB);
            if (state.b() != 0 && viewI != null && viewK != null) {
                View viewM = m(0, getChildCount());
                int position = viewM == null ? -1 : getPosition(viewM);
                View viewM2 = m(getChildCount() - 1, -1);
                return (int) ((Math.abs(this.n0.d(viewK) - this.n0.g(viewI)) / (((viewM2 != null ? getPosition(viewM2) : -1) - position) + 1)) * state.b());
            }
        }
        return 0;
    }

    public final void g() {
        if (this.n0 != null) {
            return;
        }
        if (x()) {
            if (this.f19045Y == 0) {
                this.n0 = OrientationHelper.a(this);
                this.o0 = OrientationHelper.c(this);
                return;
            } else {
                this.n0 = OrientationHelper.c(this);
                this.o0 = OrientationHelper.a(this);
                return;
            }
        }
        if (this.f19045Y == 0) {
            this.n0 = OrientationHelper.c(this);
            this.o0 = OrientationHelper.a(this);
        } else {
            this.n0 = OrientationHelper.a(this);
            this.o0 = OrientationHelper.c(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f0 = 0.0f;
        layoutParams.g0 = 1.0f;
        layoutParams.h0 = -1;
        layoutParams.i0 = -1.0f;
        layoutParams.l0 = 16777215;
        layoutParams.m0 = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f0 = 0.0f;
        layoutParams.g0 = 1.0f;
        layoutParams.h0 = -1;
        layoutParams.i0 = -1.0f;
        layoutParams.l0 = 16777215;
        layoutParams.m0 = 16777215;
        return layoutParams;
    }

    public final int h(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        Rect rect;
        int i6;
        int i7;
        int i8;
        int i9;
        FlexboxHelper flexboxHelper;
        int i10;
        int i11 = layoutState.f;
        if (i11 != Integer.MIN_VALUE) {
            int i12 = layoutState.f19051a;
            if (i12 < 0) {
                layoutState.f = i11 + i12;
            }
            y(recycler, layoutState);
        }
        int i13 = layoutState.f19051a;
        boolean zX = x();
        int i14 = i13;
        int i15 = 0;
        while (true) {
            if (i14 <= 0 && !this.l0.f19052b) {
                break;
            }
            List list = this.h0;
            int i16 = layoutState.d;
            if (i16 < 0 || i16 >= state.b() || (i2 = layoutState.f19053c) < 0 || i2 >= list.size()) {
                break;
            }
            FlexLine flexLine = (FlexLine) this.h0.get(layoutState.f19053c);
            layoutState.d = flexLine.o;
            boolean zX2 = x();
            AnchorInfo anchorInfo = this.m0;
            FlexboxHelper flexboxHelper2 = this.i0;
            Rect rect2 = z0;
            if (zX2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i17 = layoutState.f19054e;
                if (layoutState.f19056i == -1) {
                    i17 -= flexLine.g;
                }
                int i18 = layoutState.d;
                float f = anchorInfo.d;
                float f2 = paddingLeft - f;
                float f3 = (width - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i19 = flexLine.f19034h;
                int i20 = i17;
                int i21 = i18;
                int i22 = 0;
                while (i21 < i18 + i19) {
                    float leftDecorationWidth = f3;
                    View viewT = t(i21);
                    if (viewT == null) {
                        i9 = i22;
                        i19 = i19;
                        flexboxHelper = flexboxHelper2;
                        rect2 = rect2;
                        i10 = i21;
                    } else {
                        if (layoutState.f19056i == 1) {
                            calculateItemDecorationsForChild(viewT, rect2);
                            addView(viewT);
                        } else {
                            calculateItemDecorationsForChild(viewT, rect2);
                            addView(viewT, i22);
                            i22++;
                        }
                        long j = flexboxHelper2.d[i21];
                        int i23 = (int) j;
                        int i24 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewT.getLayoutParams();
                        if (B(viewT, i23, i24, layoutParams)) {
                            viewT.measure(i23, i24);
                        }
                        float leftDecorationWidth2 = f2 + getLeftDecorationWidth(viewT) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        float rightDecorationWidth = leftDecorationWidth - (getRightDecorationWidth(viewT) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(viewT) + i20;
                        i9 = i22;
                        if (this.f0) {
                            flexboxHelper = flexboxHelper2;
                            i10 = i21;
                            this.i0.k(viewT, flexLine, Math.round(rightDecorationWidth) - viewT.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), viewT.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            flexboxHelper = flexboxHelper2;
                            i10 = i21;
                            this.i0.k(viewT, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight, viewT.getMeasuredWidth() + Math.round(leftDecorationWidth2), viewT.getMeasuredHeight() + topDecorationHeight);
                        }
                        float rightDecorationWidth2 = getRightDecorationWidth(viewT) + viewT.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + fMax + leftDecorationWidth2;
                        leftDecorationWidth = rightDecorationWidth - ((getLeftDecorationWidth(viewT) + (viewT.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + fMax);
                        f2 = rightDecorationWidth2;
                    }
                    f3 = leftDecorationWidth;
                    i21 = i10 + 1;
                    flexboxHelper2 = flexboxHelper;
                    i18 = i18;
                    zX = zX;
                    i22 = i9;
                    i19 = i19;
                    rect2 = rect2;
                }
                z2 = zX;
                layoutState.f19053c += this.l0.f19056i;
                i5 = flexLine.g;
            } else {
                z2 = zX;
                FlexboxHelper flexboxHelper3 = flexboxHelper2;
                Rect rect3 = rect2;
                boolean z4 = true;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i25 = layoutState.f19054e;
                if (layoutState.f19056i == -1) {
                    int i26 = flexLine.g;
                    i4 = i25 + i26;
                    i3 = i25 - i26;
                } else {
                    i3 = i25;
                    i4 = i3;
                }
                int i27 = layoutState.d;
                float f4 = anchorInfo.d;
                float f5 = paddingTop - f4;
                float topDecorationHeight2 = (height - paddingBottom) - f4;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i28 = flexLine.f19034h;
                int i29 = i27;
                int i30 = 0;
                while (i29 < i27 + i28) {
                    int i31 = i29;
                    View viewT2 = t(i31);
                    if (viewT2 == null) {
                        z3 = z4;
                        i6 = i28;
                        i7 = i31;
                        rect = rect3;
                        i8 = i27;
                    } else {
                        float f6 = f5;
                        long j2 = flexboxHelper3.d[i31];
                        int i32 = (int) j2;
                        int i33 = (int) (j2 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewT2.getLayoutParams();
                        if (B(viewT2, i32, i33, layoutParams2)) {
                            viewT2.measure(i32, i33);
                        }
                        float topDecorationHeight3 = f6 + getTopDecorationHeight(viewT2) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float bottomDecorationHeight = topDecorationHeight2 - (getBottomDecorationHeight(viewT2) + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        z3 = true;
                        if (layoutState.f19056i == 1) {
                            rect = rect3;
                            calculateItemDecorationsForChild(viewT2, rect);
                            addView(viewT2);
                        } else {
                            rect = rect3;
                            calculateItemDecorationsForChild(viewT2, rect);
                            addView(viewT2, i30);
                            i30++;
                        }
                        int i34 = i30;
                        int leftDecorationWidth3 = getLeftDecorationWidth(viewT2) + i3;
                        int rightDecorationWidth3 = i4 - getRightDecorationWidth(viewT2);
                        int i35 = i27;
                        boolean z5 = this.f0;
                        if (!z5) {
                            i6 = i28;
                            i7 = i31;
                            i8 = i35;
                            if (this.g0) {
                                this.i0.l(viewT2, flexLine, z5, leftDecorationWidth3, Math.round(bottomDecorationHeight) - viewT2.getMeasuredHeight(), viewT2.getMeasuredWidth() + leftDecorationWidth3, Math.round(bottomDecorationHeight));
                            } else {
                                this.i0.l(viewT2, flexLine, z5, leftDecorationWidth3, Math.round(topDecorationHeight3), viewT2.getMeasuredWidth() + leftDecorationWidth3, viewT2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                        } else if (this.g0) {
                            i8 = i35;
                            i6 = i28;
                            i7 = i31;
                            this.i0.l(viewT2, flexLine, z5, rightDecorationWidth3 - viewT2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewT2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight));
                        } else {
                            i6 = i28;
                            i7 = i31;
                            i8 = i35;
                            this.i0.l(viewT2, flexLine, z5, rightDecorationWidth3 - viewT2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth3, viewT2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                        }
                        float bottomDecorationHeight2 = getBottomDecorationHeight(viewT2) + viewT2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + fMax2 + topDecorationHeight3;
                        topDecorationHeight2 = bottomDecorationHeight - ((getTopDecorationHeight(viewT2) + (viewT2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin)) + fMax2);
                        f5 = bottomDecorationHeight2;
                        i30 = i34;
                    }
                    i29 = i7 + 1;
                    i27 = i8;
                    i28 = i6;
                    rect3 = rect;
                    z4 = z3;
                    flexboxHelper3 = flexboxHelper3;
                }
                layoutState.f19053c += this.l0.f19056i;
                i5 = flexLine.g;
            }
            i15 += i5;
            if (z2 || !this.f0) {
                layoutState.f19054e = (flexLine.g * layoutState.f19056i) + layoutState.f19054e;
            } else {
                layoutState.f19054e -= flexLine.g * layoutState.f19056i;
            }
            i14 -= flexLine.g;
            i13 = i13;
            zX = z2;
        }
        int i36 = i13;
        int i37 = layoutState.f19051a - i15;
        layoutState.f19051a = i37;
        int i38 = layoutState.f;
        if (i38 != Integer.MIN_VALUE) {
            int i39 = i38 + i15;
            layoutState.f = i39;
            if (i37 < 0) {
                layoutState.f = i39 + i37;
            }
            y(recycler, layoutState);
        }
        return i36 - layoutState.f19051a;
    }

    public final View i(int i2) {
        View viewN = n(0, getChildCount(), i2);
        if (viewN == null) {
            return null;
        }
        int i3 = this.i0.f19041c[getPosition(viewN)];
        if (i3 == -1) {
            return null;
        }
        return j(viewN, (FlexLine) this.h0.get(i3));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View j(View view, FlexLine flexLine) {
        boolean zX = x();
        int i2 = flexLine.f19034h;
        for (int i3 = 1; i3 < i2; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f0 || zX) {
                    if (this.n0.g(view) > this.n0.g(childAt)) {
                        view = childAt;
                    }
                } else if (this.n0.d(view) < this.n0.d(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View k(int i2) {
        View viewN = n(getChildCount() - 1, -1, i2);
        if (viewN == null) {
            return null;
        }
        return l(viewN, (FlexLine) this.h0.get(this.i0.f19041c[getPosition(viewN)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View l(View view, FlexLine flexLine) {
        boolean zX = x();
        int childCount = (getChildCount() - flexLine.f19034h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f0 || zX) {
                    if (this.n0.d(view) < this.n0.d(childAt)) {
                        view = childAt;
                    }
                } else if (this.n0.g(view) > this.n0.g(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View m(int i2, int i3) {
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z2 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z3 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z2 && z3) {
                return childAt;
            }
            i2 += i4;
        }
        return null;
    }

    public final View n(int i2, int i3, int i4) {
        g();
        if (this.l0 == null) {
            LayoutState layoutState = new LayoutState();
            layoutState.f19055h = 1;
            layoutState.f19056i = 1;
            this.l0 = layoutState;
        }
        int iM = this.n0.m();
        int i5 = this.n0.i();
        int i6 = i3 <= i2 ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < i4) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).X.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.n0.g(childAt) >= iM && this.n0.d(childAt) <= i5) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i6;
        }
        return view != null ? view : view2;
    }

    public final int o(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iV;
        int i3;
        if (x() || !this.f0) {
            int i4 = this.n0.i() - i2;
            if (i4 <= 0) {
                return 0;
            }
            iV = -v(-i4, recycler, state);
        } else {
            int iM = i2 - this.n0.m();
            if (iM <= 0) {
                return 0;
            }
            iV = v(iM, recycler, state);
        }
        int i5 = i2 + iV;
        if (!z2 || (i3 = this.n0.i() - i5) <= 0) {
            return iV;
        }
        this.n0.r(i3);
        return i3 + iV;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.w0 = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        super.onItemsAdded(recyclerView, i2, i3);
        C(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        super.onItemsMoved(recyclerView, i2, i3, i4);
        C(Math.min(i2, i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        super.onItemsRemoved(recyclerView, i2, i3);
        C(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        super.onItemsUpdated(recyclerView, i2, i3, obj);
        C(i2);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0192  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:111:0x01af  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0213  */
    /* JADX WARN: Code duplicated, block: B:137:0x0219  */
    /* JADX WARN: Code duplicated, block: B:140:0x0226  */
    /* JADX WARN: Code duplicated, block: B:141:0x0233  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0165  */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x0173  */
    /* JADX WARN: Code duplicated, block: B:99:0x017b  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewI;
        FlexboxLayoutManager flexboxLayoutManager;
        OrientationHelper orientationHelper;
        int position;
        int i2;
        int size;
        int i3;
        int i4;
        View viewFindViewByPosition;
        boolean z2;
        int iG;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        this.j0 = recycler;
        this.k0 = state;
        int iB = state.b();
        if (iB == 0 && state.g) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i9 = this.X;
        if (i9 == 0) {
            this.f0 = layoutDirection == 1;
            this.g0 = this.f19045Y == 2;
        } else if (i9 == 1) {
            this.f0 = layoutDirection != 1;
            this.g0 = this.f19045Y == 2;
        } else if (i9 == 2) {
            boolean z4 = layoutDirection == 1;
            this.f0 = z4;
            if (this.f19045Y == 2) {
                this.f0 = !z4;
            }
            this.g0 = false;
        } else if (i9 != 3) {
            this.f0 = false;
            this.g0 = false;
        } else {
            boolean z5 = layoutDirection == 1;
            this.f0 = z5;
            if (this.f19045Y == 2) {
                this.f0 = !z5;
            }
            this.g0 = true;
        }
        g();
        if (this.l0 == null) {
            LayoutState layoutState = new LayoutState();
            layoutState.f19055h = 1;
            layoutState.f19056i = 1;
            this.l0 = layoutState;
        }
        FlexboxHelper flexboxHelper = this.i0;
        flexboxHelper.f(iB);
        flexboxHelper.g(iB);
        flexboxHelper.e(iB);
        this.l0.j = false;
        SavedState savedState = this.p0;
        if (savedState != null && (i8 = savedState.X) >= 0 && i8 < iB) {
            this.q0 = i8;
        }
        AnchorInfo anchorInfo = this.m0;
        if (!anchorInfo.f || this.q0 != -1 || savedState != null) {
            AnchorInfo.b(anchorInfo);
            SavedState savedState2 = this.p0;
            if (state.g || (i4 = this.q0) == -1) {
                if (getChildCount() != 0) {
                    if (anchorInfo.f19049e) {
                        viewI = k(state.b());
                    } else {
                        viewI = i(state.b());
                    }
                    if (viewI != null) {
                        flexboxLayoutManager = FlexboxLayoutManager.this;
                        if (flexboxLayoutManager.f19045Y == 0) {
                            orientationHelper = flexboxLayoutManager.o0;
                        } else {
                            orientationHelper = flexboxLayoutManager.n0;
                        }
                        if (flexboxLayoutManager.x() && flexboxLayoutManager.f0) {
                            if (anchorInfo.f19049e) {
                                anchorInfo.f19048c = orientationHelper.o() + orientationHelper.g(viewI);
                            } else {
                                anchorInfo.f19048c = orientationHelper.d(viewI);
                            }
                        } else if (anchorInfo.f19049e) {
                            anchorInfo.f19048c = orientationHelper.o() + orientationHelper.d(viewI);
                        } else {
                            anchorInfo.f19048c = orientationHelper.g(viewI);
                        }
                        position = flexboxLayoutManager.getPosition(viewI);
                        anchorInfo.f19046a = position;
                        anchorInfo.g = false;
                        int[] iArr = flexboxLayoutManager.i0.f19041c;
                        if (position == -1) {
                            position = 0;
                        }
                        i2 = iArr[position];
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        anchorInfo.f19047b = i2;
                        size = flexboxLayoutManager.h0.size();
                        i3 = anchorInfo.f19047b;
                        if (size > i3) {
                            anchorInfo.f19046a = ((FlexLine) flexboxLayoutManager.h0.get(i3)).o;
                        }
                    } else {
                        AnchorInfo.a(anchorInfo);
                        anchorInfo.f19046a = 0;
                        anchorInfo.f19047b = 0;
                    }
                } else {
                    AnchorInfo.a(anchorInfo);
                    anchorInfo.f19046a = 0;
                    anchorInfo.f19047b = 0;
                }
            } else if (i4 < 0 || i4 >= state.b()) {
                this.q0 = -1;
                this.r0 = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    if (anchorInfo.f19049e) {
                        viewI = k(state.b());
                    } else {
                        viewI = i(state.b());
                    }
                    if (viewI != null) {
                        flexboxLayoutManager = FlexboxLayoutManager.this;
                        if (flexboxLayoutManager.f19045Y == 0) {
                            orientationHelper = flexboxLayoutManager.o0;
                        } else {
                            orientationHelper = flexboxLayoutManager.n0;
                        }
                        if (flexboxLayoutManager.x()) {
                            if (anchorInfo.f19049e) {
                                anchorInfo.f19048c = orientationHelper.o() + orientationHelper.d(viewI);
                            } else {
                                anchorInfo.f19048c = orientationHelper.g(viewI);
                            }
                        } else if (anchorInfo.f19049e) {
                            anchorInfo.f19048c = orientationHelper.o() + orientationHelper.d(viewI);
                        } else {
                            anchorInfo.f19048c = orientationHelper.g(viewI);
                        }
                        position = flexboxLayoutManager.getPosition(viewI);
                        anchorInfo.f19046a = position;
                        anchorInfo.g = false;
                        int[] iArr2 = flexboxLayoutManager.i0.f19041c;
                        if (position == -1) {
                            position = 0;
                        }
                        i2 = iArr2[position];
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        anchorInfo.f19047b = i2;
                        size = flexboxLayoutManager.h0.size();
                        i3 = anchorInfo.f19047b;
                        if (size > i3) {
                            anchorInfo.f19046a = ((FlexLine) flexboxLayoutManager.h0.get(i3)).o;
                        }
                    } else {
                        AnchorInfo.a(anchorInfo);
                        anchorInfo.f19046a = 0;
                        anchorInfo.f19047b = 0;
                    }
                } else {
                    AnchorInfo.a(anchorInfo);
                    anchorInfo.f19046a = 0;
                    anchorInfo.f19047b = 0;
                }
            } else {
                int i10 = this.q0;
                anchorInfo.f19046a = i10;
                anchorInfo.f19047b = flexboxHelper.f19041c[i10];
                SavedState savedState3 = this.p0;
                if (savedState3 != null) {
                    int iB2 = state.b();
                    int i11 = savedState3.X;
                    if (i11 >= 0 && i11 < iB2) {
                        anchorInfo.f19048c = this.n0.m() + savedState2.f19057Y;
                        anchorInfo.g = true;
                        anchorInfo.f19047b = -1;
                    } else if (this.r0 == Integer.MIN_VALUE) {
                        viewFindViewByPosition = findViewByPosition(this.q0);
                        if (viewFindViewByPosition != null) {
                            if (getChildCount() > 0) {
                                if (this.q0 < getPosition(getChildAt(0))) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                anchorInfo.f19049e = z2;
                            }
                            AnchorInfo.a(anchorInfo);
                        } else if (this.n0.e(viewFindViewByPosition) > this.n0.n()) {
                            AnchorInfo.a(anchorInfo);
                        } else if (this.n0.g(viewFindViewByPosition) - this.n0.m() < 0) {
                            anchorInfo.f19048c = this.n0.m();
                            anchorInfo.f19049e = false;
                        } else if (this.n0.i() - this.n0.d(viewFindViewByPosition) < 0) {
                            anchorInfo.f19048c = this.n0.i();
                            anchorInfo.f19049e = true;
                        } else {
                            if (anchorInfo.f19049e) {
                                iG = this.n0.o() + this.n0.d(viewFindViewByPosition);
                            } else {
                                iG = this.n0.g(viewFindViewByPosition);
                            }
                            anchorInfo.f19048c = iG;
                        }
                    } else if (x() && this.f0) {
                        anchorInfo.f19048c = this.r0 - this.n0.j();
                    } else {
                        anchorInfo.f19048c = this.n0.m() + this.r0;
                    }
                } else if (this.r0 == Integer.MIN_VALUE) {
                    viewFindViewByPosition = findViewByPosition(this.q0);
                    if (viewFindViewByPosition != null) {
                        if (getChildCount() > 0) {
                            if (this.q0 < getPosition(getChildAt(0))) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            anchorInfo.f19049e = z2;
                        }
                        AnchorInfo.a(anchorInfo);
                    } else if (this.n0.e(viewFindViewByPosition) > this.n0.n()) {
                        AnchorInfo.a(anchorInfo);
                    } else if (this.n0.g(viewFindViewByPosition) - this.n0.m() < 0) {
                        anchorInfo.f19048c = this.n0.m();
                        anchorInfo.f19049e = false;
                    } else if (this.n0.i() - this.n0.d(viewFindViewByPosition) < 0) {
                        anchorInfo.f19048c = this.n0.i();
                        anchorInfo.f19049e = true;
                    } else {
                        if (anchorInfo.f19049e) {
                            iG = this.n0.o() + this.n0.d(viewFindViewByPosition);
                        } else {
                            iG = this.n0.g(viewFindViewByPosition);
                        }
                        anchorInfo.f19048c = iG;
                    }
                } else if (x()) {
                    anchorInfo.f19048c = this.n0.m() + this.r0;
                } else {
                    anchorInfo.f19048c = this.n0.m() + this.r0;
                }
            }
            anchorInfo.f = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (anchorInfo.f19049e) {
            E(anchorInfo, false, true);
        } else {
            D(anchorInfo, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean zX = x();
        Context context = this.v0;
        if (zX) {
            int i12 = this.s0;
            z3 = (i12 == Integer.MIN_VALUE || i12 == width) ? false : true;
            LayoutState layoutState2 = this.l0;
            i5 = layoutState2.f19052b ? context.getResources().getDisplayMetrics().heightPixels : layoutState2.f19051a;
        } else {
            int i13 = this.t0;
            z3 = (i13 == Integer.MIN_VALUE || i13 == height) ? false : true;
            LayoutState layoutState3 = this.l0;
            i5 = layoutState3.f19052b ? context.getResources().getDisplayMetrics().widthPixels : layoutState3.f19051a;
        }
        int i14 = i5;
        this.s0 = width;
        this.t0 = height;
        int i15 = this.x0;
        FlexboxHelper.FlexLinesResult flexLinesResult = this.y0;
        if (i15 != -1 || (this.q0 == -1 && !z3)) {
            int iMin = i15 != -1 ? Math.min(i15, anchorInfo.f19046a) : anchorInfo.f19046a;
            flexLinesResult.f19043a = null;
            if (x()) {
                if (this.h0.size() > 0) {
                    flexboxHelper.c(iMin, this.h0);
                    this.i0.a(this.y0, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, anchorInfo.f19046a, this.h0);
                } else {
                    flexboxHelper.e(iB);
                    this.i0.a(this.y0, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, -1, this.h0);
                }
            } else if (this.h0.size() > 0) {
                flexboxHelper.c(iMin, this.h0);
                int i16 = iMin;
                this.i0.a(this.y0, iMakeMeasureSpec2, iMakeMeasureSpec, i14, i16, anchorInfo.f19046a, this.h0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i16;
            } else {
                flexboxHelper.e(iB);
                this.i0.a(this.y0, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, -1, this.h0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.h0 = flexLinesResult.f19043a;
            flexboxHelper.d(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            flexboxHelper.p(iMin);
        } else if (!anchorInfo.f19049e) {
            this.h0.clear();
            flexLinesResult.f19043a = null;
            if (x()) {
                this.i0.a(this.y0, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, anchorInfo.f19046a, this.h0);
            } else {
                this.i0.a(this.y0, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, anchorInfo.f19046a, this.h0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.h0 = flexLinesResult.f19043a;
            flexboxHelper.d(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            flexboxHelper.p(0);
            int i17 = flexboxHelper.f19041c[anchorInfo.f19046a];
            anchorInfo.f19047b = i17;
            this.l0.f19053c = i17;
        }
        if (anchorInfo.f19049e) {
            h(recycler, state, this.l0);
            i7 = this.l0.f19054e;
            D(anchorInfo, true, false);
            h(recycler, state, this.l0);
            i6 = this.l0.f19054e;
        } else {
            h(recycler, state, this.l0);
            i6 = this.l0.f19054e;
            E(anchorInfo, true, false);
            h(recycler, state, this.l0);
            i7 = this.l0.f19054e;
        }
        if (getChildCount() > 0) {
            if (anchorInfo.f19049e) {
                p(o(i6, recycler, state, true) + i7, recycler, state, false);
            } else {
                o(p(i7, recycler, state, true) + i6, recycler, state, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        this.p0 = null;
        this.q0 = -1;
        this.r0 = Integer.MIN_VALUE;
        this.x0 = -1;
        AnchorInfo.b(this.m0);
        this.u0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.p0 = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.p0;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.X = savedState.X;
            savedState2.f19057Y = savedState.f19057Y;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.X = -1;
            return savedState3;
        }
        View childAt = getChildAt(0);
        savedState3.X = getPosition(childAt);
        savedState3.f19057Y = this.n0.g(childAt) - this.n0.m();
        return savedState3;
    }

    public final int p(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iV;
        int iM;
        if (x() || !this.f0) {
            int iM2 = i2 - this.n0.m();
            if (iM2 <= 0) {
                return 0;
            }
            iV = -v(iM2, recycler, state);
        } else {
            int i3 = this.n0.i() - i2;
            if (i3 <= 0) {
                return 0;
            }
            iV = v(-i3, recycler, state);
        }
        int i4 = i2 + iV;
        if (!z2 || (iM = i4 - this.n0.m()) <= 0) {
            return iV;
        }
        this.n0.r(-iM);
        return iV - iM;
    }

    public final int q(int i2, int i3, int i4) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i3, i4, canScrollVertically());
    }

    public final int r(int i2, int i3, int i4) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i3, i4, canScrollHorizontally());
    }

    public final int s(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (x()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!x() || (this.f19045Y == 0 && x())) {
            int iV = v(i2, recycler, state);
            this.u0.clear();
            return iV;
        }
        int iW = w(i2);
        this.m0.d += iW;
        this.o0.r(-iW);
        return iW;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i2) {
        this.q0 = i2;
        this.r0 = Integer.MIN_VALUE;
        SavedState savedState = this.p0;
        if (savedState != null) {
            savedState.X = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (x() || (this.f19045Y == 0 && !x())) {
            int iV = v(i2, recycler, state);
            this.u0.clear();
            return iV;
        }
        int iW = w(i2);
        this.m0.d += iW;
        this.o0.r(-iW);
        return iW;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    public final View t(int i2) {
        View view = (View) this.u0.get(i2);
        return view != null ? view : this.j0.l(i2, Long.MAX_VALUE).itemView;
    }

    public final int u() {
        if (this.h0.size() == 0) {
            return 0;
        }
        int size = this.h0.size();
        int iMax = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            iMax = Math.max(iMax, ((FlexLine) this.h0.get(i2)).f19033e);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01e9  */
    public final int v(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i3;
        if (getChildCount() != 0 && i2 != 0) {
            g();
            this.l0.j = true;
            boolean z2 = !x() && this.f0;
            int i4 = (!z2 ? i2 > 0 : i2 < 0) ? -1 : 1;
            int iAbs = Math.abs(i2);
            this.l0.f19056i = i4;
            boolean zX = x();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            boolean z3 = !zX && this.f0;
            FlexboxHelper flexboxHelper = this.i0;
            if (i4 == 1) {
                View childAt = getChildAt(getChildCount() - 1);
                this.l0.f19054e = this.n0.d(childAt);
                int position = getPosition(childAt);
                View viewL = l(childAt, (FlexLine) this.h0.get(flexboxHelper.f19041c[position]));
                LayoutState layoutState = this.l0;
                layoutState.f19055h = 1;
                int i5 = position + 1;
                layoutState.d = i5;
                int[] iArr = flexboxHelper.f19041c;
                if (iArr.length <= i5) {
                    layoutState.f19053c = -1;
                } else {
                    layoutState.f19053c = iArr[i5];
                }
                if (z3) {
                    layoutState.f19054e = this.n0.g(viewL);
                    this.l0.f = this.n0.m() + (-this.n0.g(viewL));
                    LayoutState layoutState2 = this.l0;
                    int i6 = layoutState2.f;
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    layoutState2.f = i6;
                } else {
                    layoutState.f19054e = this.n0.d(viewL);
                    this.l0.f = this.n0.d(viewL) - this.n0.i();
                }
                int i7 = this.l0.f19053c;
                if ((i7 == -1 || i7 > this.h0.size() - 1) && this.l0.d <= this.k0.b()) {
                    LayoutState layoutState3 = this.l0;
                    int i8 = iAbs - layoutState3.f;
                    FlexboxHelper.FlexLinesResult flexLinesResult = this.y0;
                    flexLinesResult.f19043a = null;
                    if (i8 > 0) {
                        if (zX) {
                            this.i0.a(flexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i8, layoutState3.d, -1, this.h0);
                        } else {
                            this.i0.a(flexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i8, layoutState3.d, -1, this.h0);
                            iMakeMeasureSpec2 = iMakeMeasureSpec2;
                            iMakeMeasureSpec = iMakeMeasureSpec;
                        }
                        flexboxHelper.d(iMakeMeasureSpec, iMakeMeasureSpec2, this.l0.d);
                        flexboxHelper.p(this.l0.d);
                    }
                }
            } else {
                View childAt2 = getChildAt(0);
                this.l0.f19054e = this.n0.g(childAt2);
                int position2 = getPosition(childAt2);
                View viewJ = j(childAt2, (FlexLine) this.h0.get(flexboxHelper.f19041c[position2]));
                LayoutState layoutState4 = this.l0;
                layoutState4.f19055h = 1;
                int i9 = flexboxHelper.f19041c[position2];
                if (i9 == -1) {
                    i9 = 0;
                }
                if (i9 > 0) {
                    this.l0.d = position2 - ((FlexLine) this.h0.get(i9 - 1)).f19034h;
                } else {
                    layoutState4.d = -1;
                }
                LayoutState layoutState5 = this.l0;
                layoutState5.f19053c = i9 > 0 ? i9 - 1 : 0;
                if (z3) {
                    layoutState5.f19054e = this.n0.d(viewJ);
                    this.l0.f = this.n0.d(viewJ) - this.n0.i();
                    LayoutState layoutState6 = this.l0;
                    int i10 = layoutState6.f;
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    layoutState6.f = i10;
                } else {
                    layoutState5.f19054e = this.n0.g(viewJ);
                    this.l0.f = this.n0.m() + (-this.n0.g(viewJ));
                }
            }
            LayoutState layoutState7 = this.l0;
            int i11 = layoutState7.f;
            layoutState7.f19051a = iAbs - i11;
            int iH = h(recycler, state, layoutState7) + i11;
            if (iH >= 0) {
                if (z2) {
                    if (iAbs > iH) {
                        i3 = (-i4) * iH;
                    } else {
                        i3 = i2;
                    }
                } else if (iAbs > iH) {
                    i3 = i4 * iH;
                } else {
                    i3 = i2;
                }
                this.n0.r(-i3);
                this.l0.g = i3;
                return i3;
            }
        }
        return 0;
    }

    public final int w(int i2) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        g();
        boolean zX = x();
        View view = this.w0;
        int width = zX ? view.getWidth() : view.getHeight();
        int width2 = zX ? getWidth() : getHeight();
        int layoutDirection = getLayoutDirection();
        AnchorInfo anchorInfo = this.m0;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i2);
            if (i2 < 0) {
                return -Math.min((width2 + anchorInfo.d) - width, iAbs);
            }
            int i3 = anchorInfo.d;
            if (i3 + i2 > 0) {
                return -i3;
            }
        } else {
            if (i2 > 0) {
                return Math.min((width2 - anchorInfo.d) - width, i2);
            }
            int i4 = anchorInfo.d;
            if (i4 + i2 < 0) {
                return -i4;
            }
        }
        return i2;
    }

    public final boolean x() {
        int i2 = this.X;
        return i2 == 0 || i2 == 1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa A[SYNTHETIC] */
    public final void y(RecyclerView.Recycler recycler, LayoutState layoutState) {
        int childCount;
        if (layoutState.j) {
            int i2 = layoutState.f19056i;
            int i3 = -1;
            FlexboxHelper flexboxHelper = this.i0;
            if (i2 != -1) {
                if (layoutState.f >= 0 && (childCount = getChildCount()) != 0) {
                    int i4 = flexboxHelper.f19041c[getPosition(getChildAt(0))];
                    if (i4 == -1) {
                        return;
                    }
                    FlexLine flexLine = (FlexLine) this.h0.get(i4);
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        int i6 = layoutState.f;
                        if (!x() && this.f0) {
                            if (this.n0.h() - this.n0.g(childAt) > i6) {
                                break;
                            }
                            if (flexLine.f19038p != getPosition(childAt)) {
                                if (i4 >= this.h0.size() - 1) {
                                    i3 = i5;
                                    break;
                                } else {
                                    i4 += layoutState.f19056i;
                                    flexLine = (FlexLine) this.h0.get(i4);
                                    i3 = i5;
                                }
                            }
                        } else {
                            if (this.n0.d(childAt) > i6) {
                                break;
                            }
                            if (flexLine.f19038p != getPosition(childAt)) {
                                if (i4 >= this.h0.size() - 1) {
                                    i3 = i5;
                                    break;
                                } else {
                                    i4 += layoutState.f19056i;
                                    flexLine = (FlexLine) this.h0.get(i4);
                                    i3 = i5;
                                }
                            }
                        }
                    }
                    while (i3 >= 0) {
                        removeAndRecycleViewAt(i3, recycler);
                        i3--;
                    }
                    return;
                }
                return;
            }
            if (layoutState.f < 0) {
                return;
            }
            this.n0.h();
            int childCount2 = getChildCount();
            if (childCount2 == 0) {
                return;
            }
            int i7 = childCount2 - 1;
            int i8 = flexboxHelper.f19041c[getPosition(getChildAt(i7))];
            if (i8 == -1) {
                return;
            }
            FlexLine flexLine2 = (FlexLine) this.h0.get(i8);
            for (int i9 = i7; i9 >= 0; i9--) {
                View childAt2 = getChildAt(i9);
                int i10 = layoutState.f;
                if (!x() && this.f0) {
                    if (this.n0.d(childAt2) > i10) {
                        break;
                    }
                    if (flexLine2.o != getPosition(childAt2)) {
                        if (i8 <= 0) {
                            childCount2 = i9;
                            break;
                        } else {
                            i8 += layoutState.f19056i;
                            flexLine2 = (FlexLine) this.h0.get(i8);
                            childCount2 = i9;
                        }
                    }
                } else {
                    if (this.n0.g(childAt2) < this.n0.h() - i10) {
                        break;
                    }
                    if (flexLine2.o != getPosition(childAt2)) {
                        if (i8 <= 0) {
                            childCount2 = i9;
                            break;
                        } else {
                            i8 += layoutState.f19056i;
                            flexLine2 = (FlexLine) this.h0.get(i8);
                            childCount2 = i9;
                        }
                    }
                }
            }
            while (i7 >= childCount2) {
                removeAndRecycleViewAt(i7, recycler);
                i7--;
            }
        }
    }

    public final void z() {
        int heightMode = x() ? getHeightMode() : getWidthMode();
        this.l0.f19052b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i2, int i3) {
        super.onItemsUpdated(recyclerView, i2, i3);
        C(i2);
    }
}
