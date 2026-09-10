package com.bytedance.adsdk.ugeno.fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.xha.xha;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends ViewGroup implements com.bytedance.adsdk.ugeno.fi.ri {
    private int[] aw;
    private SparseIntArray bgr;
    private com.bytedance.adsdk.ugeno.ka bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18014co;
    private int di;
    private int fi;
    private int ik;
    private int jbs;
    private int ka;
    private int lr;
    private Drawable mj;
    private ka.ri nr;
    private int qt;
    private int ri;
    private int sf;
    private List<ik> slm;
    private ka vr;
    private Drawable xha;

    public static class ri extends ViewGroup.MarginLayoutParams implements lr {
        public static final Parcelable.Creator<ri> CREATOR = new Parcelable.Creator<ri>() { // from class: com.bytedance.adsdk.ugeno.fi.fi.ri.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ri createFromParcel(Parcel parcel) {
                return new ri(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ri[] newArray(int i) {
                return new ri[i];
            }
        };
        private int di;
        private float fi;
        private float ik;
        private int jbs;
        private int ka;
        private float lr;
        private int mj;
        private boolean qt;
        private int ri;
        private int xha;

        public ri(ri riVar) {
            super((ViewGroup.MarginLayoutParams) riVar);
            this.ri = 1;
            this.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ka = -1;
            this.fi = -1.0f;
            this.di = -1;
            this.xha = -1;
            this.mj = 16777215;
            this.jbs = 16777215;
            this.ri = riVar.ri;
            this.lr = riVar.lr;
            this.ik = riVar.ik;
            this.ka = riVar.ka;
            this.fi = riVar.fi;
            this.di = riVar.di;
            this.xha = riVar.xha;
            this.mj = riVar.mj;
            this.jbs = riVar.jbs;
            this.qt = riVar.qt;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int aw() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int bgr() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public float co() {
            return this.fi;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int di() {
            return this.ka;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public float fi() {
            return this.ik;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int ik() {
            return this.ri;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int jbs() {
            return this.mj;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public float ka() {
            return this.lr;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int lr() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int mj() {
            return this.xha;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int qt() {
            return this.jbs;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int ri() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public boolean sf() {
            return this.qt;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int slm() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int vr() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.ri);
            parcel.writeFloat(this.lr);
            parcel.writeFloat(this.ik);
            parcel.writeInt(this.ka);
            parcel.writeFloat(this.fi);
            parcel.writeInt(this.di);
            parcel.writeInt(this.xha);
            parcel.writeInt(this.mj);
            parcel.writeInt(this.jbs);
            parcel.writeByte(this.qt ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public int xha() {
            return this.di;
        }

        public void ik(int i) {
            this.ri = i;
        }

        public void ka(int i) {
            this.ka = i;
        }

        public void lr(float f) {
            this.ik = f;
        }

        public void ri(float f) {
            this.lr = f;
        }

        public void ik(float f) {
            this.fi = f;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public void lr(int i) {
            this.xha = i;
        }

        @Override // com.bytedance.adsdk.ugeno.fi.lr
        public void ri(int i) {
            this.di = i;
        }

        public ri(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.ri = 1;
            this.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ka = -1;
            this.fi = -1.0f;
            this.di = -1;
            this.xha = -1;
            this.mj = 16777215;
            this.jbs = 16777215;
        }

        public ri(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.ri = 1;
            this.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ka = -1;
            this.fi = -1.0f;
            this.di = -1;
            this.xha = -1;
            this.mj = 16777215;
            this.jbs = 16777215;
        }

        public ri(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.ri = 1;
            this.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ka = -1;
            this.fi = -1.0f;
            this.di = -1;
            this.xha = -1;
            this.mj = 16777215;
            this.jbs = 16777215;
        }

        public ri(Parcel parcel) {
            super(0, 0);
            this.ri = 1;
            this.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.ka = -1;
            this.fi = -1.0f;
            this.di = -1;
            this.xha = -1;
            this.mj = 16777215;
            this.jbs = 16777215;
            this.ri = parcel.readInt();
            this.lr = parcel.readFloat();
            this.ik = parcel.readFloat();
            this.ka = parcel.readInt();
            this.fi = parcel.readFloat();
            this.di = parcel.readInt();
            this.xha = parcel.readInt();
            this.mj = parcel.readInt();
            this.jbs = parcel.readInt();
            this.qt = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public fi(Context context) {
        super(context, null);
        this.di = -1;
        this.vr = new ka(this);
        this.slm = new ArrayList();
        this.nr = new ka.ri();
    }

    private boolean di(int i) {
        if (i >= 0 && i < this.slm.size()) {
            for (int i2 = i + 1; i2 < this.slm.size(); i2++) {
                if (this.slm.get(i2).lr() > 0) {
                    return false;
                }
            }
            if (ri()) {
                return (this.jbs & 4) != 0;
            }
            if ((this.qt & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean fi(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewIk = ik(i - i3);
            if (viewIk != null && viewIk.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean ka(int i, int i2) {
        if (fi(i, i2)) {
            if (ri()) {
                return (this.qt & 1) != 0;
            }
            return (this.jbs & 1) != 0;
        }
        if (ri()) {
            return (this.qt & 2) != 0;
        }
        return (this.jbs & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.bgr == null) {
            this.bgr = new SparseIntArray(getChildCount());
        }
        this.aw = this.vr.ri(view, i, layoutParams, this.bgr);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ri;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ri) {
            return new ri((ri) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ri((ViewGroup.MarginLayoutParams) layoutParams) : new ri(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getAlignContent() {
        return this.fi;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getAlignItems() {
        return this.ka;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.xha;
    }

    public Drawable getDividerDrawableVertical() {
        return this.mj;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getFlexDirection() {
        return this.ri;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<ik> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.slm.size());
        for (ik ikVar : this.slm) {
            if (ikVar.lr() != 0) {
                arrayList.add(ikVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public List<ik> getFlexLinesInternal() {
        return this.slm;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getFlexWrap() {
        return this.lr;
    }

    public int getJustifyContent() {
        return this.ik;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getLargestMainSize() {
        Iterator<ik> it = this.slm.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().fi);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getMaxLine() {
        return this.di;
    }

    public int getShowDividerHorizontal() {
        return this.jbs;
    }

    public int getShowDividerVertical() {
        return this.qt;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int getSumOfCrossSize() {
        int size = this.slm.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ik ikVar = this.slm.get(i2);
            if (ka(i2)) {
                i += ri() ? this.sf : this.f18014co;
            }
            if (di(i2)) {
                i += ri() ? this.sf : this.f18014co;
            }
            i += ikVar.xha;
        }
        return i;
    }

    public View ik(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.aw;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public View lr(int i) {
        return ik(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.ka kaVar = this.bu;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.ka kaVar = this.bu;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mj == null && this.xha == null) {
            return;
        }
        if (this.jbs == 0 && this.qt == 0) {
            return;
        }
        int iRi = xha.ri(this);
        int i = this.ri;
        if (i == 0) {
            ri(canvas, iRi == 1, this.lr == 2);
            return;
        }
        if (i == 1) {
            ri(canvas, iRi != 1, this.lr == 2);
            return;
        }
        if (i == 2) {
            boolean z = iRi == 1;
            if (this.lr == 2) {
                z = !z;
            }
            lr(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iRi == 1;
        if (this.lr == 2) {
            z2 = !z2;
        }
        lr(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.ka kaVar = this.bu;
        if (kaVar != null) {
            kaVar.di();
        }
        int iRi = xha.ri(this);
        int i5 = this.ri;
        if (i5 == 0) {
            ri(iRi == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            ri(iRi != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = iRi == 1;
            if (this.lr == 2) {
                z2 = !z2;
            }
            ri(z2, false, i, i2, i3, i4);
        } else {
            if (i5 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.ri);
            }
            z2 = iRi == 1;
            if (this.lr == 2) {
                z2 = !z2;
            }
            ri(z2, true, i, i2, i3, i4);
        }
        com.bytedance.adsdk.ugeno.ka kaVar2 = this.bu;
        if (kaVar2 != null) {
            kaVar2.ri(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.ka kaVar = this.bu;
        if (kaVar != null) {
            int[] iArrRi = kaVar.ri(i, i2);
            ri(iArrRi[0], iArrRi[1]);
        } else {
            ri(i, i2);
        }
        com.bytedance.adsdk.ugeno.ka kaVar2 = this.bu;
        if (kaVar2 != null) {
            kaVar2.fi();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.ka kaVar = this.bu;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int ri(View view) {
        return 0;
    }

    public void setAlignContent(int i) {
        if (this.fi != i) {
            this.fi = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.ka != i) {
            this.ka = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.xha) {
            return;
        }
        this.xha = drawable;
        if (drawable != null) {
            this.sf = drawable.getIntrinsicHeight();
        } else {
            this.sf = 0;
        }
        lr();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.mj) {
            return;
        }
        this.mj = drawable;
        if (drawable != null) {
            this.f18014co = drawable.getIntrinsicWidth();
        } else {
            this.f18014co = 0;
        }
        lr();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.ri != i) {
            this.ri = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public void setFlexLines(List<ik> list) {
        this.slm = list;
    }

    public void setFlexWrap(int i) {
        if (this.lr != i) {
            this.lr = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.ik != i) {
            this.ik = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.di != i) {
            this.di = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.jbs) {
            this.jbs = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.qt) {
            this.qt = i;
            requestLayout();
        }
    }

    private void lr(int i, int i2) {
        this.slm.clear();
        this.nr.ri();
        this.vr.ri(this.nr, i, i2);
        this.slm = this.nr.ri;
        this.vr.ri(i, i2);
        if (this.ka == 3) {
            for (ik ikVar : this.slm) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < ikVar.mj; i3++) {
                    View viewIk = ik(ikVar.vr + i3);
                    if (viewIk != null && viewIk.getVisibility() != 8) {
                        ri riVar = (ri) viewIk.getLayoutParams();
                        iMax = this.lr != 2 ? Math.max(iMax, viewIk.getMeasuredHeight() + Math.max(ikVar.f18015co - viewIk.getBaseline(), ((ViewGroup.MarginLayoutParams) riVar).topMargin) + ((ViewGroup.MarginLayoutParams) riVar).bottomMargin) : Math.max(iMax, viewIk.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) riVar).topMargin + Math.max((ikVar.f18015co - viewIk.getMeasuredHeight()) + viewIk.getBaseline(), ((ViewGroup.MarginLayoutParams) riVar).bottomMargin));
                    }
                }
                ikVar.xha = iMax;
            }
        }
        this.vr.lr(i, i2, getPaddingTop() + getPaddingBottom());
        this.vr.ri();
        ri(this.ri, i, i2, this.nr.lr);
    }

    private void ri(int i, int i2) {
        if (this.bgr == null) {
            this.bgr = new SparseIntArray(getChildCount());
        }
        if (this.vr.lr(this.bgr)) {
            this.aw = this.vr.ri(this.bgr);
        }
        int i3 = this.ri;
        if (i3 == 0 || i3 == 1) {
            lr(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            ik(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.ri);
        }
    }

    private boolean fi(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.slm.get(i2).lr() > 0) {
                return false;
            }
        }
        return true;
    }

    private void ik(int i, int i2) {
        this.slm.clear();
        this.nr.ri();
        this.vr.lr(this.nr, i, i2);
        this.slm = this.nr.ri;
        this.vr.ri(i, i2);
        this.vr.lr(i, i2, getPaddingLeft() + getPaddingRight());
        this.vr.ri();
        ri(this.ri, i, i2, this.nr.lr);
    }

    private boolean ka(int i) {
        if (i >= 0 && i < this.slm.size()) {
            if (fi(i)) {
                if (ri()) {
                    return (this.jbs & 1) != 0;
                }
                return (this.qt & 1) != 0;
            }
            if (ri()) {
                return (this.jbs & 2) != 0;
            }
            if ((this.qt & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public View ri(int i) {
        return getChildAt(i);
    }

    private void ri(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void lr(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.slm.size();
        for (int i3 = 0; i3 < size; i3++) {
            ik ikVar = this.slm.get(i3);
            for (int i4 = 0; i4 < ikVar.mj; i4++) {
                int i5 = ikVar.vr + i4;
                View viewIk = ik(i5);
                if (viewIk != null && viewIk.getVisibility() != 8) {
                    ri riVar = (ri) viewIk.getLayoutParams();
                    if (ka(i5, i4)) {
                        if (z2) {
                            top = viewIk.getBottom() + ((ViewGroup.MarginLayoutParams) riVar).bottomMargin;
                        } else {
                            top = (viewIk.getTop() - ((ViewGroup.MarginLayoutParams) riVar).topMargin) - this.sf;
                        }
                        lr(canvas, ikVar.ri, top, ikVar.xha);
                    }
                    if (i4 == ikVar.mj - 1 && (this.jbs & 4) > 0) {
                        if (z2) {
                            bottom = (viewIk.getTop() - ((ViewGroup.MarginLayoutParams) riVar).topMargin) - this.sf;
                        } else {
                            bottom = viewIk.getBottom() + ((ViewGroup.MarginLayoutParams) riVar).bottomMargin;
                        }
                        lr(canvas, ikVar.ri, bottom, ikVar.xha);
                    }
                }
            }
            if (ka(i3)) {
                if (z) {
                    i2 = ikVar.ik;
                } else {
                    i2 = ikVar.ri - this.f18014co;
                }
                ri(canvas, i2, paddingTop, iMax);
            }
            if (di(i3) && (this.qt & 4) > 0) {
                if (z) {
                    i = ikVar.ri - this.f18014co;
                } else {
                    i = ikVar.ik;
                }
                ri(canvas, i, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public boolean ri() {
        int i = this.ri;
        return i == 0 || i == 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    private void ri(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewIk;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        ik ikVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.slm.size();
        for (int i12 = 0; i12 < size; i12++) {
            ik ikVar2 = this.slm.get(i12);
            if (ka(i12)) {
                int i13 = this.sf;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.ik;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 == 1) {
                int i17 = ikVar2.fi;
                f = i17 - paddingLeft;
                measuredWidth = (i11 - i17) + paddingRight;
            } else {
                if (i15 == 2) {
                    int i18 = ikVar2.fi;
                    measuredWidth = paddingLeft + ((i11 - i18) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i18) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iLr = ikVar2.lr();
                    f2 = (i11 - ikVar2.fi) / (iLr != 1 ? iLr - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iLr2 = ikVar2.lr();
                    float f6 = iLr2 != 0 ? (i11 - ikVar2.fi) / iLr2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else if (i15 == 5) {
                    int iLr3 = ikVar2.lr();
                    f2 = iLr3 != 0 ? (i11 - ikVar2.fi) / (iLr3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.ik);
                }
                fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < ikVar2.mj) {
                    i6 = ikVar2.vr + i5;
                    viewIk = ik(i6);
                    char c2 = c;
                    if (viewIk != null) {
                        z2 = z3;
                        if (viewIk.getVisibility() != 8) {
                            ri riVar = (ri) viewIk.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) riVar).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) riVar).rightMargin;
                            if (ka(i6, i5)) {
                                int i19 = this.f18014co;
                                float f9 = i19;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i19;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == ikVar2.mj - 1 || (this.qt & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.f18014co;
                            }
                            if (this.lr == i16) {
                                if (z) {
                                    i7 = i16;
                                    view = viewIk;
                                    this.vr.ri(view, ikVar2, Math.round(f5) - viewIk.getMeasuredWidth(), i14 - viewIk.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewIk;
                                    i7 = i16;
                                    this.vr.ri(view, ikVar2, Math.round(f3), i14 - view.getMeasuredHeight(), Math.round(f3) + view.getMeasuredWidth(), i14);
                                }
                                i8 = i14;
                            } else {
                                i5 = i5;
                                view = viewIk;
                                z2 = z2;
                                i7 = i16;
                                i8 = i14;
                                if (z) {
                                    this.vr.ri(view, ikVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + view.getMeasuredHeight());
                                } else {
                                    int i20 = paddingTop;
                                    this.vr.ri(view, ikVar2, Math.round(f3), i20, view.getMeasuredWidth() + Math.round(f3), i20 + view.getMeasuredHeight());
                                    paddingTop = i20;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) riVar).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) riVar).leftMargin);
                            if (z) {
                                ikVar = ikVar2;
                                ikVar.ri(view, i10, 0, i9, 0);
                            } else {
                                ikVar = ikVar2;
                                ikVar.ri(view, i9, 0, i10, 0);
                            }
                            ikVar2 = ikVar;
                            f = measuredWidth2;
                        } else {
                            z2 = z2;
                        }
                        i5++;
                        c = c2;
                        i16 = i7;
                        z3 = z2;
                        i14 = i8;
                    } else {
                        z2 = z3;
                    }
                    i7 = i16;
                    i5 = i5;
                    i8 = i14;
                    i5++;
                    c = c2;
                    i16 = i7;
                    z3 = z2;
                    i14 = i8;
                }
                int i21 = ikVar2.xha;
                paddingTop += i21;
                paddingBottom = i14 - i21;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < ikVar2.mj) {
                i6 = ikVar2.vr + i5;
                viewIk = ik(i6);
                char c3 = c;
                if (viewIk != null) {
                    z2 = z3;
                    if (viewIk.getVisibility() != 8) {
                        ri riVar2 = (ri) viewIk.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) riVar2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) riVar2).rightMargin;
                        if (ka(i6, i5)) {
                            int i110 = this.f18014co;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == ikVar2.mj - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.lr == i16) {
                            if (z) {
                                i7 = i16;
                                view = viewIk;
                                this.vr.ri(view, ikVar2, Math.round(f5) - viewIk.getMeasuredWidth(), i14 - viewIk.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewIk;
                                i7 = i16;
                                this.vr.ri(view, ikVar2, Math.round(f3), i14 - view.getMeasuredHeight(), Math.round(f3) + view.getMeasuredWidth(), i14);
                            }
                            i8 = i14;
                        } else {
                            i5 = i5;
                            view = viewIk;
                            z2 = z2;
                            i7 = i16;
                            i8 = i14;
                            if (z) {
                                this.vr.ri(view, ikVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + view.getMeasuredHeight());
                            } else {
                                int i22 = paddingTop;
                                this.vr.ri(view, ikVar2, Math.round(f3), i22, view.getMeasuredWidth() + Math.round(f3), i22 + view.getMeasuredHeight());
                                paddingTop = i22;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) riVar2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) riVar2).leftMargin);
                        if (z) {
                            ikVar = ikVar2;
                            ikVar.ri(view, i10, 0, i9, 0);
                        } else {
                            ikVar = ikVar2;
                            ikVar.ri(view, i9, 0, i10, 0);
                        }
                        ikVar2 = ikVar;
                        f = measuredWidth3;
                    } else {
                        z2 = z2;
                    }
                    i5++;
                    c = c3;
                    i16 = i7;
                    z3 = z2;
                    i14 = i8;
                } else {
                    z2 = z3;
                }
                i7 = i16;
                i5 = i5;
                i8 = i14;
                i5++;
                c = c3;
                i16 = i7;
                z3 = z2;
                i14 = i8;
            }
            int i23 = ikVar2.xha;
            paddingTop += i23;
            paddingBottom = i14 - i23;
        }
    }

    private void lr(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.xha;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.sf + i2);
        this.xha.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int lr(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    private void lr() {
        if (this.xha == null && this.mj == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01db  */
    private void ri(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewIk;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        ik ikVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.slm.size();
        for (int i14 = 0; i14 < size; i14++) {
            ik ikVar2 = this.slm.get(i14);
            if (ka(i14)) {
                int i15 = this.f18014co;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.ik;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 == 1) {
                int i19 = ikVar2.fi;
                f = i19 - paddingTop;
                measuredHeight = (i12 - i19) + paddingBottom;
            } else {
                if (i17 == 2) {
                    int i20 = ikVar2.fi;
                    measuredHeight = paddingTop + ((i12 - i20) / 2.0f);
                    f = (i12 - paddingBottom) - ((i12 - i20) / 2.0f);
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iLr = ikVar2.lr();
                    f2 = (i12 - ikVar2.fi) / (iLr != 1 ? iLr - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iLr2 = ikVar2.lr();
                    f2 = iLr2 != 0 ? (i12 - ikVar2.fi) / iLr2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 5) {
                    int iLr3 = ikVar2.lr();
                    f2 = iLr3 != 0 ? (i12 - ikVar2.fi) / (iLr3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.ik);
                }
                fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < ikVar2.mj) {
                    i6 = ikVar2.vr + i5;
                    i7 = i18;
                    viewIk = ik(i6);
                    if (viewIk != null) {
                        c = c2;
                        if (viewIk.getVisibility() != 8) {
                            ri riVar = (ri) viewIk.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) riVar).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) riVar).bottomMargin;
                            if (ka(i6, i5)) {
                                i10 = this.sf;
                                float f7 = i10;
                                f3 += f7;
                                f4 -= f7;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == ikVar2.mj - i7 || (this.jbs & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.sf;
                            }
                            if (z) {
                                if (z2) {
                                    i8 = i5;
                                    this.vr.ri(viewIk, ikVar2, true, i16 - viewIk.getMeasuredWidth(), Math.round(f5) - viewIk.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    i8 = i5;
                                    this.vr.ri(viewIk, ikVar2, true, i16 - viewIk.getMeasuredWidth(), Math.round(f3), i16, Math.round(f3) + viewIk.getMeasuredHeight());
                                }
                                i9 = i16;
                            } else {
                                i8 = i5;
                                i7 = i7;
                                i9 = i16;
                                if (z2) {
                                    this.vr.ri(viewIk, ikVar2, false, paddingLeft, Math.round(f5) - viewIk.getMeasuredHeight(), paddingLeft + viewIk.getMeasuredWidth(), Math.round(f5));
                                } else {
                                    int i21 = paddingLeft;
                                    this.vr.ri(viewIk, ikVar2, false, i21, Math.round(f3), i21 + viewIk.getMeasuredWidth(), Math.round(f3) + viewIk.getMeasuredHeight());
                                    paddingLeft = i21;
                                }
                            }
                            measuredHeight = f3 + viewIk.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) riVar).bottomMargin;
                            float measuredHeight2 = f5 - ((viewIk.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) riVar).topMargin);
                            if (z2) {
                                ikVar = ikVar2;
                                ikVar.ri(viewIk, 0, i11, 0, i10);
                            } else {
                                ikVar = ikVar2;
                                ikVar.ri(viewIk, 0, i10, 0, i11);
                            }
                            ikVar2 = ikVar;
                            f = measuredHeight2;
                        }
                        i5 = i8 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i9;
                    } else {
                        c = c2;
                    }
                    i8 = i5;
                    i7 = i7;
                    i9 = i16;
                    i5 = i8 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i9;
                }
                int i22 = ikVar2.xha;
                paddingLeft += i22;
                i13 = i16 - i22;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < ikVar2.mj) {
                i6 = ikVar2.vr + i5;
                i7 = i18;
                viewIk = ik(i6);
                if (viewIk != null) {
                    c = c2;
                    if (viewIk.getVisibility() != 8) {
                        ri riVar2 = (ri) viewIk.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) riVar2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) riVar2).bottomMargin;
                        if (ka(i6, i5)) {
                            i10 = this.sf;
                            float f8 = i10;
                            f3 += f8;
                            f4 -= f8;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == ikVar2.mj - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        if (z) {
                            if (z2) {
                                i8 = i5;
                                this.vr.ri(viewIk, ikVar2, true, i16 - viewIk.getMeasuredWidth(), Math.round(f5) - viewIk.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                i8 = i5;
                                this.vr.ri(viewIk, ikVar2, true, i16 - viewIk.getMeasuredWidth(), Math.round(f3), i16, Math.round(f3) + viewIk.getMeasuredHeight());
                            }
                            i9 = i16;
                        } else {
                            i8 = i5;
                            i7 = i7;
                            i9 = i16;
                            if (z2) {
                                this.vr.ri(viewIk, ikVar2, false, paddingLeft, Math.round(f5) - viewIk.getMeasuredHeight(), paddingLeft + viewIk.getMeasuredWidth(), Math.round(f5));
                            } else {
                                int i23 = paddingLeft;
                                this.vr.ri(viewIk, ikVar2, false, i23, Math.round(f3), i23 + viewIk.getMeasuredWidth(), Math.round(f3) + viewIk.getMeasuredHeight());
                                paddingLeft = i23;
                            }
                        }
                        measuredHeight = f3 + viewIk.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) riVar2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewIk.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) riVar2).topMargin);
                        if (z2) {
                            ikVar = ikVar2;
                            ikVar.ri(viewIk, 0, i11, 0, i10);
                        } else {
                            ikVar = ikVar2;
                            ikVar.ri(viewIk, 0, i10, 0, i11);
                        }
                        ikVar2 = ikVar;
                        f = measuredHeight3;
                    }
                    i5 = i8 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i9;
                } else {
                    c = c2;
                }
                i8 = i5;
                i7 = i7;
                i9 = i16;
                i5 = i8 + 1;
                c2 = c;
                i18 = i7;
                i16 = i9;
            }
            int i24 = ikVar2.xha;
            paddingLeft += i24;
            i13 = i16 - i24;
        }
    }

    private void ri(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.slm.size();
        for (int i3 = 0; i3 < size; i3++) {
            ik ikVar = this.slm.get(i3);
            for (int i4 = 0; i4 < ikVar.mj; i4++) {
                int i5 = ikVar.vr + i4;
                View viewIk = ik(i5);
                if (viewIk != null && viewIk.getVisibility() != 8) {
                    ri riVar = (ri) viewIk.getLayoutParams();
                    if (ka(i5, i4)) {
                        if (z) {
                            left = viewIk.getRight() + ((ViewGroup.MarginLayoutParams) riVar).rightMargin;
                        } else {
                            left = (viewIk.getLeft() - ((ViewGroup.MarginLayoutParams) riVar).leftMargin) - this.f18014co;
                        }
                        ri(canvas, left, ikVar.lr, ikVar.xha);
                    }
                    if (i4 == ikVar.mj - 1 && (this.qt & 4) > 0) {
                        if (z) {
                            right = (viewIk.getLeft() - ((ViewGroup.MarginLayoutParams) riVar).leftMargin) - this.f18014co;
                        } else {
                            right = viewIk.getRight() + ((ViewGroup.MarginLayoutParams) riVar).rightMargin;
                        }
                        ri(canvas, right, ikVar.lr, ikVar.xha);
                    }
                }
            }
            if (ka(i3)) {
                if (z2) {
                    i2 = ikVar.ka;
                } else {
                    i2 = ikVar.lr - this.sf;
                }
                lr(canvas, paddingLeft, i2, iMax);
            }
            if (di(i3) && (this.jbs & 4) > 0) {
                if (z2) {
                    i = ikVar.lr - this.sf;
                } else {
                    i = ikVar.ka;
                }
                lr(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void ri(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mj;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f18014co + i, i3 + i2);
        this.mj.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int ri(View view, int i, int i2) {
        int i3;
        int i4;
        if (ri()) {
            i3 = ka(i, i2) ? this.f18014co : 0;
            if ((this.qt & 4) <= 0) {
                return i3;
            }
            i4 = this.f18014co;
        } else {
            i3 = ka(i, i2) ? this.sf : 0;
            if ((this.jbs & 4) <= 0) {
                return i3;
            }
            i4 = this.sf;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public void ri(ik ikVar) {
        if (ri()) {
            if ((this.qt & 4) > 0) {
                int i = ikVar.fi;
                int i2 = this.f18014co;
                ikVar.fi = i + i2;
                ikVar.di += i2;
                return;
            }
            return;
        }
        if ((this.jbs & 4) > 0) {
            int i3 = ikVar.fi;
            int i4 = this.sf;
            ikVar.fi = i3 + i4;
            ikVar.di += i4;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public int ri(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.fi.ri
    public void ri(View view, int i, int i2, ik ikVar) {
        if (ka(i, i2)) {
            if (ri()) {
                int i3 = ikVar.fi;
                int i4 = this.f18014co;
                ikVar.fi = i3 + i4;
                ikVar.di += i4;
                return;
            }
            int i5 = ikVar.fi;
            int i6 = this.sf;
            ikVar.fi = i5 + i6;
            ikVar.di += i6;
        }
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        this.bu = ikVar;
    }
}
