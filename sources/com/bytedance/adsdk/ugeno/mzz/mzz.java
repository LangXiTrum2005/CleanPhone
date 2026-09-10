package com.bytedance.adsdk.ugeno.mzz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.wd.wd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends ViewGroup implements com.bytedance.adsdk.ugeno.mzz.qdl {
    private mml bjy;
    private int[] exu;
    private int fs;
    private mml.qdl jl;
    private Drawable jpc;
    private List<lnr> jtx;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    private int qdl;
    private SparseIntArray rdp;
    private int rq;
    private int to;
    private int tvp;
    private int ud;
    private Drawable wd;
    private com.bytedance.adsdk.ugeno.mml yt;

    public static class qdl extends ViewGroup.MarginLayoutParams implements ud {
        public static final Parcelable.Creator<qdl> CREATOR = new Parcelable.Creator<qdl>() { // from class: com.bytedance.adsdk.ugeno.mzz.mzz.qdl.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public qdl createFromParcel(Parcel parcel) {
                return new qdl(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public qdl[] newArray(int i2) {
                return new qdl[i2];
            }
        };
        private int jpc;
        private float lnr;
        private int mml;
        private int mo;
        private float mzz;
        private int qdl;
        private boolean to;
        private int tvp;
        private float ud;
        private int wd;

        public qdl(qdl qdlVar) {
            super((ViewGroup.MarginLayoutParams) qdlVar);
            this.qdl = 1;
            this.ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.wd = -1;
            this.jpc = 16777215;
            this.tvp = 16777215;
            this.qdl = qdlVar.qdl;
            this.ud = qdlVar.ud;
            this.lnr = qdlVar.lnr;
            this.mml = qdlVar.mml;
            this.mzz = qdlVar.mzz;
            this.mo = qdlVar.mo;
            this.wd = qdlVar.wd;
            this.jpc = qdlVar.jpc;
            this.tvp = qdlVar.tvp;
            this.to = qdlVar.to;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int bjy() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int exu() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public float fs() {
            return this.mzz;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int jpc() {
            return this.wd;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int jtx() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int lnr() {
            return this.qdl;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public float mml() {
            return this.ud;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int mo() {
            return this.mml;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public float mzz() {
            return this.lnr;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int qdl() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int rdp() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public boolean rq() {
            return this.to;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int to() {
            return this.tvp;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int tvp() {
            return this.jpc;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int ud() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int wd() {
            return this.mo;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.qdl);
            parcel.writeFloat(this.ud);
            parcel.writeFloat(this.lnr);
            parcel.writeInt(this.mml);
            parcel.writeFloat(this.mzz);
            parcel.writeInt(this.mo);
            parcel.writeInt(this.wd);
            parcel.writeInt(this.jpc);
            parcel.writeInt(this.tvp);
            parcel.writeByte(this.to ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public void lnr(int i2) {
            this.qdl = i2;
        }

        public void mml(int i2) {
            this.mml = i2;
        }

        public void qdl(float f) {
            this.ud = f;
        }

        public void ud(float f) {
            this.lnr = f;
        }

        public void lnr(float f) {
            this.mzz = f;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public void qdl(int i2) {
            this.mo = i2;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public void ud(int i2) {
            this.wd = i2;
        }

        public qdl(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.qdl = 1;
            this.ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.wd = -1;
            this.jpc = 16777215;
            this.tvp = 16777215;
        }

        public qdl(int i2, int i3) {
            super(new ViewGroup.LayoutParams(i2, i3));
            this.qdl = 1;
            this.ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.wd = -1;
            this.jpc = 16777215;
            this.tvp = 16777215;
        }

        public qdl(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.qdl = 1;
            this.ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.wd = -1;
            this.jpc = 16777215;
            this.tvp = 16777215;
        }

        public qdl(Parcel parcel) {
            super(0, 0);
            this.qdl = 1;
            this.ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.wd = -1;
            this.jpc = 16777215;
            this.tvp = 16777215;
            this.qdl = parcel.readInt();
            this.ud = parcel.readFloat();
            this.lnr = parcel.readFloat();
            this.mml = parcel.readInt();
            this.mzz = parcel.readFloat();
            this.mo = parcel.readInt();
            this.wd = parcel.readInt();
            this.jpc = parcel.readInt();
            this.tvp = parcel.readInt();
            this.to = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public mzz(Context context) {
        super(context, null);
        this.mo = -1;
        this.bjy = new mml(this);
        this.jtx = new ArrayList();
        this.jl = new mml.qdl();
    }

    private boolean mml(int i2, int i3) {
        if (mzz(i2, i3)) {
            if (qdl()) {
                return (this.to & 1) != 0;
            }
            return (this.tvp & 1) != 0;
        }
        if (qdl()) {
            return (this.to & 2) != 0;
        }
        return (this.tvp & 2) != 0;
    }

    private boolean mo(int i2) {
        if (i2 >= 0 && i2 < this.jtx.size()) {
            for (int i3 = i2 + 1; i3 < this.jtx.size(); i3++) {
                if (this.jtx.get(i3).ud() > 0) {
                    return false;
                }
            }
            if (qdl()) {
                return (this.tvp & 4) != 0;
            }
            if ((this.to & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean mzz(int i2, int i3) {
        for (int i4 = 1; i4 <= i3; i4++) {
            View viewLnr = lnr(i2 - i4);
            if (viewLnr != null && viewLnr.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (this.rdp == null) {
            this.rdp = new SparseIntArray(getChildCount());
        }
        this.exu = this.bjy.qdl(view, i2, layoutParams, this.rdp);
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qdl;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof qdl) {
            return new qdl((qdl) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new qdl((ViewGroup.MarginLayoutParams) layoutParams) : new qdl(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getAlignContent() {
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getAlignItems() {
        return this.mml;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.wd;
    }

    public Drawable getDividerDrawableVertical() {
        return this.jpc;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getFlexDirection() {
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<lnr> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.jtx.size());
        for (lnr lnrVar : this.jtx) {
            if (lnrVar.ud() != 0) {
                arrayList.add(lnrVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public List<lnr> getFlexLinesInternal() {
        return this.jtx;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getFlexWrap() {
        return this.ud;
    }

    public int getJustifyContent() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getLargestMainSize() {
        Iterator<lnr> it = this.jtx.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mzz);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getMaxLine() {
        return this.mo;
    }

    public int getShowDividerHorizontal() {
        return this.tvp;
    }

    public int getShowDividerVertical() {
        return this.to;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getSumOfCrossSize() {
        int size = this.jtx.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            lnr lnrVar = this.jtx.get(i3);
            if (mml(i3)) {
                i2 += qdl() ? this.rq : this.fs;
            }
            if (mo(i3)) {
                i2 += qdl() ? this.rq : this.fs;
            }
            i2 += lnrVar.wd;
        }
        return i2;
    }

    public View lnr(int i2) {
        if (i2 < 0) {
            return null;
        }
        int[] iArr = this.exu;
        if (i2 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i2]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.jpc == null && this.wd == null) {
            return;
        }
        if (this.tvp == 0 && this.to == 0) {
            return;
        }
        int iQdl = wd.qdl(this);
        int i2 = this.qdl;
        if (i2 == 0) {
            qdl(canvas, iQdl == 1, this.ud == 2);
            return;
        }
        if (i2 == 1) {
            qdl(canvas, iQdl != 1, this.ud == 2);
            return;
        }
        if (i2 == 2) {
            boolean z2 = iQdl == 1;
            if (this.ud == 2) {
                z2 = !z2;
            }
            ud(canvas, z2, false);
            return;
        }
        if (i2 != 3) {
            return;
        }
        boolean z3 = iQdl == 1;
        if (this.ud == 2) {
            z3 = !z3;
        }
        ud(canvas, z3, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        int iQdl = wd.qdl(this);
        int i6 = this.qdl;
        if (i6 == 0) {
            qdl(iQdl == 1, i2, i3, i4, i5);
        } else if (i6 == 1) {
            qdl(iQdl != 1, i2, i3, i4, i5);
        } else if (i6 == 2) {
            z3 = iQdl == 1;
            if (this.ud == 2) {
                z3 = !z3;
            }
            qdl(z3, false, i2, i3, i4, i5);
        } else {
            if (i6 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.qdl);
            }
            z3 = iQdl == 1;
            if (this.ud == 2) {
                z3 = !z3;
            }
            qdl(z3, true, i2, i3, i4, i5);
        }
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.yt;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            qdl(iArrQdl[0], iArrQdl[1]);
        } else {
            qdl(i2, i3);
        }
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.yt;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int qdl(View view) {
        return 0;
    }

    public void setAlignContent(int i2) {
        if (this.mzz != i2) {
            this.mzz = i2;
            requestLayout();
        }
    }

    public void setAlignItems(int i2) {
        if (this.mml != i2) {
            this.mml = i2;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.wd) {
            return;
        }
        this.wd = drawable;
        if (drawable != null) {
            this.rq = drawable.getIntrinsicHeight();
        } else {
            this.rq = 0;
        }
        ud();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.jpc) {
            return;
        }
        this.jpc = drawable;
        if (drawable != null) {
            this.fs = drawable.getIntrinsicWidth();
        } else {
            this.fs = 0;
        }
        ud();
        requestLayout();
    }

    public void setFlexDirection(int i2) {
        if (this.qdl != i2) {
            this.qdl = i2;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public void setFlexLines(List<lnr> list) {
        this.jtx = list;
    }

    public void setFlexWrap(int i2) {
        if (this.ud != i2) {
            this.ud = i2;
            requestLayout();
        }
    }

    public void setJustifyContent(int i2) {
        if (this.lnr != i2) {
            this.lnr = i2;
            requestLayout();
        }
    }

    public void setMaxLine(int i2) {
        if (this.mo != i2) {
            this.mo = i2;
            requestLayout();
        }
    }

    public void setShowDivider(int i2) {
        setShowDividerVertical(i2);
        setShowDividerHorizontal(i2);
    }

    public void setShowDividerHorizontal(int i2) {
        if (i2 != this.tvp) {
            this.tvp = i2;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i2) {
        if (i2 != this.to) {
            this.to = i2;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public View ud(int i2) {
        return lnr(i2);
    }

    private void qdl(int i2, int i3) {
        if (this.rdp == null) {
            this.rdp = new SparseIntArray(getChildCount());
        }
        if (this.bjy.ud(this.rdp)) {
            this.exu = this.bjy.qdl(this.rdp);
        }
        int i4 = this.qdl;
        if (i4 == 0 || i4 == 1) {
            ud(i2, i3);
        } else if (i4 == 2 || i4 == 3) {
            lnr(i2, i3);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.qdl);
        }
    }

    private void ud(int i2, int i3) {
        this.jtx.clear();
        this.jl.qdl();
        this.bjy.qdl(this.jl, i2, i3);
        this.jtx = this.jl.qdl;
        this.bjy.qdl(i2, i3);
        if (this.mml == 3) {
            for (lnr lnrVar : this.jtx) {
                int iMax = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < lnrVar.jpc; i4++) {
                    View viewLnr = lnr(lnrVar.bjy + i4);
                    if (viewLnr != null && viewLnr.getVisibility() != 8) {
                        qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                        iMax = this.ud != 2 ? Math.max(iMax, viewLnr.getMeasuredHeight() + Math.max(lnrVar.fs - viewLnr.getBaseline(), ((ViewGroup.MarginLayoutParams) qdlVar).topMargin) + ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin) : Math.max(iMax, viewLnr.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) qdlVar).topMargin + Math.max(viewLnr.getBaseline() + (lnrVar.fs - viewLnr.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin));
                    }
                }
                lnrVar.wd = iMax;
            }
        }
        this.bjy.ud(i2, i3, getPaddingBottom() + getPaddingTop());
        this.bjy.qdl();
        qdl(this.qdl, i2, i3, this.jl.ud);
    }

    private void lnr(int i2, int i3) {
        this.jtx.clear();
        this.jl.qdl();
        this.bjy.ud(this.jl, i2, i3);
        this.jtx = this.jl.qdl;
        this.bjy.qdl(i2, i3);
        this.bjy.ud(i2, i3, getPaddingRight() + getPaddingLeft());
        this.bjy.qdl();
        qdl(this.qdl, i2, i3, this.jl.ud);
    }

    private boolean mzz(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.jtx.get(i3).ud() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean mml(int i2) {
        if (i2 >= 0 && i2 < this.jtx.size()) {
            if (mzz(i2)) {
                if (qdl()) {
                    return (this.tvp & 1) != 0;
                }
                return (this.to & 1) != 0;
            }
            if (qdl()) {
                return (this.tvp & 2) != 0;
            }
            if ((this.to & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public View qdl(int i2) {
        return getChildAt(i2);
    }

    private void qdl(int i2, int i3, int i4, int i5) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (i2 == 0 || i2 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i2)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i5 = View.combineMeasuredStates(i5, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i3, i5);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i3, i5);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i5 = View.combineMeasuredStates(i5, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i3, i5);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i5 = View.combineMeasuredStates(i5, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i4, i5);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i4, i5);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i5 = View.combineMeasuredStates(i5, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i4, i5);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void ud(Canvas canvas, boolean z2, boolean z3) {
        int i2;
        int i3;
        int bottom;
        int top2;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.jtx.size();
        for (int i4 = 0; i4 < size; i4++) {
            lnr lnrVar = this.jtx.get(i4);
            for (int i5 = 0; i5 < lnrVar.jpc; i5++) {
                int i6 = lnrVar.bjy + i5;
                View viewLnr = lnr(i6);
                if (viewLnr != null && viewLnr.getVisibility() != 8) {
                    qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                    if (mml(i6, i5)) {
                        if (z3) {
                            top2 = viewLnr.getBottom() + ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin;
                        } else {
                            top2 = (viewLnr.getTop() - ((ViewGroup.MarginLayoutParams) qdlVar).topMargin) - this.rq;
                        }
                        ud(canvas, lnrVar.qdl, top2, lnrVar.wd);
                    }
                    if (i5 == lnrVar.jpc - 1 && (this.tvp & 4) > 0) {
                        if (z3) {
                            bottom = (viewLnr.getTop() - ((ViewGroup.MarginLayoutParams) qdlVar).topMargin) - this.rq;
                        } else {
                            bottom = viewLnr.getBottom() + ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin;
                        }
                        ud(canvas, lnrVar.qdl, bottom, lnrVar.wd);
                    }
                }
            }
            if (mml(i4)) {
                if (z2) {
                    i3 = lnrVar.lnr;
                } else {
                    i3 = lnrVar.qdl - this.fs;
                }
                qdl(canvas, i3, paddingTop, iMax);
            }
            if (mo(i4) && (this.to & 4) > 0) {
                if (z2) {
                    i2 = lnrVar.qdl - this.fs;
                } else {
                    i2 = lnrVar.lnr;
                }
                qdl(canvas, i2, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public boolean qdl() {
        int i2 = this.qdl;
        return i2 == 0 || i2 == 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01eb  */
    private void qdl(boolean z2, int i2, int i3, int i4, int i5) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i6;
        int i7;
        View viewLnr;
        boolean z3;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        View view;
        lnr lnrVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i4 - i2;
        int paddingBottom = (i5 - i3) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.jtx.size();
        for (int i13 = 0; i13 < size; i13++) {
            lnr lnrVar2 = this.jtx.get(i13);
            if (mml(i13)) {
                int i14 = this.rq;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = paddingBottom;
            int i16 = this.lnr;
            char c2 = 4;
            int i17 = 2;
            boolean z4 = true;
            if (i16 == 0) {
                measuredWidth = paddingLeft;
                f = i12 - paddingRight;
            } else if (i16 == 1) {
                int i18 = lnrVar2.mzz;
                f = i18 - paddingLeft;
                measuredWidth = (i12 - i18) + paddingRight;
            } else {
                if (i16 == 2) {
                    int i19 = lnrVar2.mzz;
                    measuredWidth = paddingLeft + ((i12 - i19) / 2.0f);
                    f = (i12 - paddingRight) - ((i12 - i19) / 2.0f);
                } else if (i16 == 3) {
                    measuredWidth = paddingLeft;
                    int iUd = lnrVar2.ud();
                    f2 = (i12 - lnrVar2.mzz) / (iUd != 1 ? iUd - 1 : 1.0f);
                    f = i12 - paddingRight;
                } else if (i16 == 4) {
                    int iUd2 = lnrVar2.ud();
                    float f6 = iUd2 != 0 ? (i12 - lnrVar2.mzz) / iUd2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i12 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else if (i16 == 5) {
                    int iUd3 = lnrVar2.ud();
                    f2 = iUd3 != 0 ? (i12 - lnrVar2.mzz) / (iUd3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i12 - paddingRight) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.lnr);
                }
                fMax = Math.max(f2, 0.0f);
                i6 = 0;
                while (i6 < lnrVar2.jpc) {
                    i7 = lnrVar2.bjy + i6;
                    viewLnr = lnr(i7);
                    char c3 = c2;
                    if (viewLnr != null) {
                        z3 = z4;
                        if (viewLnr.getVisibility() != 8) {
                            qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) qdlVar).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) qdlVar).rightMargin;
                            if (mml(i7, i6)) {
                                int i20 = this.fs;
                                float f9 = i20;
                                f3 += f9;
                                f4 -= f9;
                                i10 = i20;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i6 == lnrVar2.jpc - 1 || (this.to & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.fs;
                            }
                            if (this.ud == i17) {
                                if (z2) {
                                    i8 = i17;
                                    view = viewLnr;
                                    this.bjy.qdl(view, lnrVar2, Math.round(f5) - viewLnr.getMeasuredWidth(), i15 - viewLnr.getMeasuredHeight(), Math.round(f5), i15);
                                } else {
                                    i8 = i17;
                                    view = viewLnr;
                                    this.bjy.qdl(view, lnrVar2, Math.round(f3), i15 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i15);
                                }
                                i9 = i15;
                            } else {
                                i8 = i17;
                                i6 = i6;
                                i9 = i15;
                                view = viewLnr;
                                z3 = z3;
                                if (z2) {
                                    this.bjy.qdl(view, lnrVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i21 = paddingTop;
                                    this.bjy.qdl(view, lnrVar2, Math.round(f3), i21, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i21);
                                    paddingTop = i21;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) qdlVar).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) qdlVar).leftMargin);
                            if (z2) {
                                lnrVar = lnrVar2;
                                lnrVar.qdl(view, i11, 0, i10, 0);
                            } else {
                                lnrVar = lnrVar2;
                                lnrVar.qdl(view, i10, 0, i11, 0);
                            }
                            lnrVar2 = lnrVar;
                            f = measuredWidth2;
                        } else {
                            z3 = z3;
                        }
                        i6++;
                        c2 = c3;
                        z4 = z3;
                        i17 = i8;
                        i15 = i9;
                    } else {
                        z3 = z4;
                    }
                    i8 = i17;
                    i6 = i6;
                    i9 = i15;
                    i6++;
                    c2 = c3;
                    z4 = z3;
                    i17 = i8;
                    i15 = i9;
                }
                int i22 = lnrVar2.wd;
                paddingTop += i22;
                paddingBottom = i15 - i22;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i6 = 0;
            while (i6 < lnrVar2.jpc) {
                i7 = lnrVar2.bjy + i6;
                viewLnr = lnr(i7);
                char c4 = c2;
                if (viewLnr != null) {
                    z3 = z4;
                    if (viewLnr.getVisibility() != 8) {
                        qdl qdlVar2 = (qdl) viewLnr.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) qdlVar2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) qdlVar2).rightMargin;
                        if (mml(i7, i6)) {
                            int i23 = this.fs;
                            float f10 = i23;
                            f3 += f10;
                            f4 -= f10;
                            i10 = i23;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i6 == lnrVar2.jpc - 1) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        if (this.ud == i17) {
                            if (z2) {
                                i8 = i17;
                                view = viewLnr;
                                this.bjy.qdl(view, lnrVar2, Math.round(f5) - viewLnr.getMeasuredWidth(), i15 - viewLnr.getMeasuredHeight(), Math.round(f5), i15);
                            } else {
                                i8 = i17;
                                view = viewLnr;
                                this.bjy.qdl(view, lnrVar2, Math.round(f3), i15 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i15);
                            }
                            i9 = i15;
                        } else {
                            i8 = i17;
                            i6 = i6;
                            i9 = i15;
                            view = viewLnr;
                            z3 = z3;
                            if (z2) {
                                this.bjy.qdl(view, lnrVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i24 = paddingTop;
                                this.bjy.qdl(view, lnrVar2, Math.round(f3), i24, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i24);
                                paddingTop = i24;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) qdlVar2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) qdlVar2).leftMargin);
                        if (z2) {
                            lnrVar = lnrVar2;
                            lnrVar.qdl(view, i11, 0, i10, 0);
                        } else {
                            lnrVar = lnrVar2;
                            lnrVar.qdl(view, i10, 0, i11, 0);
                        }
                        lnrVar2 = lnrVar;
                        f = measuredWidth3;
                    } else {
                        z3 = z3;
                    }
                    i6++;
                    c2 = c4;
                    z4 = z3;
                    i17 = i8;
                    i15 = i9;
                } else {
                    z3 = z4;
                }
                i8 = i17;
                i6 = i6;
                i9 = i15;
                i6++;
                c2 = c4;
                z4 = z3;
                i17 = i8;
                i15 = i9;
            }
            int i25 = lnrVar2.wd;
            paddingTop += i25;
            paddingBottom = i15 - i25;
        }
    }

    private void ud(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.wd;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i2, i3, i4 + i2, this.rq + i3);
        this.wd.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int ud(int i2, int i3, int i4) {
        return ViewGroup.getChildMeasureSpec(i2, i3, i4);
    }

    private void ud() {
        if (this.wd == null && this.jpc == null) {
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
    private void qdl(boolean z2, boolean z3, int i2, int i3, int i4, int i5) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i6;
        int i7;
        int i8;
        View viewLnr;
        char c2;
        int i9;
        int i10;
        float f3;
        float f4;
        int i11;
        float f5;
        int i12;
        lnr lnrVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i13 = i5 - i3;
        int i14 = (i4 - i2) - paddingRight;
        int size = this.jtx.size();
        for (int i15 = 0; i15 < size; i15++) {
            lnr lnrVar2 = this.jtx.get(i15);
            if (mml(i15)) {
                int i16 = this.fs;
                paddingLeft += i16;
                i14 -= i16;
            }
            int i17 = i14;
            int i18 = this.lnr;
            char c3 = 4;
            int i19 = 1;
            if (i18 == 0) {
                measuredHeight = paddingTop;
                f = i13 - paddingBottom;
            } else if (i18 == 1) {
                int i20 = lnrVar2.mzz;
                f = i20 - paddingTop;
                measuredHeight = (i13 - i20) + paddingBottom;
            } else {
                if (i18 == 2) {
                    int i21 = lnrVar2.mzz;
                    measuredHeight = paddingTop + ((i13 - i21) / 2.0f);
                    f = (i13 - paddingBottom) - ((i13 - i21) / 2.0f);
                } else if (i18 == 3) {
                    measuredHeight = paddingTop;
                    int iUd = lnrVar2.ud();
                    f2 = (i13 - lnrVar2.mzz) / (iUd != 1 ? iUd - 1 : 1.0f);
                    f = i13 - paddingBottom;
                } else if (i18 == 4) {
                    int iUd2 = lnrVar2.ud();
                    f2 = iUd2 != 0 ? (i13 - lnrVar2.mzz) / iUd2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i13 - paddingBottom) - f6;
                } else if (i18 == 5) {
                    int iUd3 = lnrVar2.ud();
                    f2 = iUd3 != 0 ? (i13 - lnrVar2.mzz) / (iUd3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i13 - paddingBottom) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.lnr);
                }
                fMax = Math.max(f2, 0.0f);
                i6 = 0;
                while (i6 < lnrVar2.jpc) {
                    i7 = lnrVar2.bjy + i6;
                    i8 = i19;
                    viewLnr = lnr(i7);
                    if (viewLnr != null) {
                        c2 = c3;
                        if (viewLnr.getVisibility() != 8) {
                            qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) qdlVar).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin;
                            if (mml(i7, i6)) {
                                i11 = this.rq;
                                float f7 = i11;
                                f3 += f7;
                                f4 -= f7;
                            } else {
                                i11 = 0;
                            }
                            f5 = f4;
                            if (i6 == lnrVar2.jpc - i8 || (this.tvp & 4) <= 0) {
                                i12 = 0;
                            } else {
                                i12 = this.rq;
                            }
                            if (z2) {
                                if (z3) {
                                    i9 = i6;
                                    this.bjy.qdl(viewLnr, lnrVar2, true, i17 - viewLnr.getMeasuredWidth(), Math.round(f5) - viewLnr.getMeasuredHeight(), i17, Math.round(f5));
                                } else {
                                    i9 = i6;
                                    this.bjy.qdl(viewLnr, lnrVar2, true, i17 - viewLnr.getMeasuredWidth(), Math.round(f3), i17, viewLnr.getMeasuredHeight() + Math.round(f3));
                                }
                                i10 = i17;
                            } else {
                                i9 = i6;
                                i8 = i8;
                                i10 = i17;
                                if (z3) {
                                    this.bjy.qdl(viewLnr, lnrVar2, false, paddingLeft, Math.round(f5) - viewLnr.getMeasuredHeight(), viewLnr.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i22 = paddingLeft;
                                    this.bjy.qdl(viewLnr, lnrVar2, false, i22, Math.round(f3), viewLnr.getMeasuredWidth() + i22, viewLnr.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i22;
                                }
                            }
                            measuredHeight = f3 + viewLnr.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin;
                            float measuredHeight2 = f5 - ((viewLnr.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) qdlVar).topMargin);
                            if (z3) {
                                lnrVar = lnrVar2;
                                lnrVar.qdl(viewLnr, 0, i12, 0, i11);
                            } else {
                                lnrVar = lnrVar2;
                                lnrVar.qdl(viewLnr, 0, i11, 0, i12);
                            }
                            lnrVar2 = lnrVar;
                            f = measuredHeight2;
                        }
                        i6 = i9 + 1;
                        c3 = c2;
                        i19 = i8;
                        i17 = i10;
                    } else {
                        c2 = c3;
                    }
                    i9 = i6;
                    i8 = i8;
                    i10 = i17;
                    i6 = i9 + 1;
                    c3 = c2;
                    i19 = i8;
                    i17 = i10;
                }
                int i23 = lnrVar2.wd;
                paddingLeft += i23;
                i14 = i17 - i23;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i6 = 0;
            while (i6 < lnrVar2.jpc) {
                i7 = lnrVar2.bjy + i6;
                i8 = i19;
                viewLnr = lnr(i7);
                if (viewLnr != null) {
                    c2 = c3;
                    if (viewLnr.getVisibility() != 8) {
                        qdl qdlVar2 = (qdl) viewLnr.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) qdlVar2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) qdlVar2).bottomMargin;
                        if (mml(i7, i6)) {
                            i11 = this.rq;
                            float f8 = i11;
                            f3 += f8;
                            f4 -= f8;
                        } else {
                            i11 = 0;
                        }
                        f5 = f4;
                        if (i6 == lnrVar2.jpc - i8) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                        }
                        if (z2) {
                            if (z3) {
                                i9 = i6;
                                this.bjy.qdl(viewLnr, lnrVar2, true, i17 - viewLnr.getMeasuredWidth(), Math.round(f5) - viewLnr.getMeasuredHeight(), i17, Math.round(f5));
                            } else {
                                i9 = i6;
                                this.bjy.qdl(viewLnr, lnrVar2, true, i17 - viewLnr.getMeasuredWidth(), Math.round(f3), i17, viewLnr.getMeasuredHeight() + Math.round(f3));
                            }
                            i10 = i17;
                        } else {
                            i9 = i6;
                            i8 = i8;
                            i10 = i17;
                            if (z3) {
                                this.bjy.qdl(viewLnr, lnrVar2, false, paddingLeft, Math.round(f5) - viewLnr.getMeasuredHeight(), viewLnr.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i24 = paddingLeft;
                                this.bjy.qdl(viewLnr, lnrVar2, false, i24, Math.round(f3), viewLnr.getMeasuredWidth() + i24, viewLnr.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i24;
                            }
                        }
                        measuredHeight = f3 + viewLnr.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) qdlVar2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewLnr.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) qdlVar2).topMargin);
                        if (z3) {
                            lnrVar = lnrVar2;
                            lnrVar.qdl(viewLnr, 0, i12, 0, i11);
                        } else {
                            lnrVar = lnrVar2;
                            lnrVar.qdl(viewLnr, 0, i11, 0, i12);
                        }
                        lnrVar2 = lnrVar;
                        f = measuredHeight3;
                    }
                    i6 = i9 + 1;
                    c3 = c2;
                    i19 = i8;
                    i17 = i10;
                } else {
                    c2 = c3;
                }
                i9 = i6;
                i8 = i8;
                i10 = i17;
                i6 = i9 + 1;
                c3 = c2;
                i19 = i8;
                i17 = i10;
            }
            int i25 = lnrVar2.wd;
            paddingLeft += i25;
            i14 = i17 - i25;
        }
    }

    private void qdl(Canvas canvas, boolean z2, boolean z3) {
        int i2;
        int i3;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.jtx.size();
        for (int i4 = 0; i4 < size; i4++) {
            lnr lnrVar = this.jtx.get(i4);
            for (int i5 = 0; i5 < lnrVar.jpc; i5++) {
                int i6 = lnrVar.bjy + i5;
                View viewLnr = lnr(i6);
                if (viewLnr != null && viewLnr.getVisibility() != 8) {
                    qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                    if (mml(i6, i5)) {
                        if (z2) {
                            left = viewLnr.getRight() + ((ViewGroup.MarginLayoutParams) qdlVar).rightMargin;
                        } else {
                            left = (viewLnr.getLeft() - ((ViewGroup.MarginLayoutParams) qdlVar).leftMargin) - this.fs;
                        }
                        qdl(canvas, left, lnrVar.ud, lnrVar.wd);
                    }
                    if (i5 == lnrVar.jpc - 1 && (this.to & 4) > 0) {
                        if (z2) {
                            right = (viewLnr.getLeft() - ((ViewGroup.MarginLayoutParams) qdlVar).leftMargin) - this.fs;
                        } else {
                            right = viewLnr.getRight() + ((ViewGroup.MarginLayoutParams) qdlVar).rightMargin;
                        }
                        qdl(canvas, right, lnrVar.ud, lnrVar.wd);
                    }
                }
            }
            if (mml(i4)) {
                if (z3) {
                    i3 = lnrVar.mml;
                } else {
                    i3 = lnrVar.ud - this.rq;
                }
                ud(canvas, paddingLeft, i3, iMax);
            }
            if (mo(i4) && (this.tvp & 4) > 0) {
                if (z3) {
                    i2 = lnrVar.ud - this.rq;
                } else {
                    i2 = lnrVar.mml;
                }
                ud(canvas, paddingLeft, i2, iMax);
            }
        }
    }

    private void qdl(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.jpc;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i2, i3, this.fs + i2, i4 + i3);
        this.jpc.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int qdl(View view, int i2, int i3) {
        int i4;
        int i5;
        if (qdl()) {
            i4 = mml(i2, i3) ? this.fs : 0;
            if ((this.to & 4) <= 0) {
                return i4;
            }
            i5 = this.fs;
        } else {
            i4 = mml(i2, i3) ? this.rq : 0;
            if ((this.tvp & 4) <= 0) {
                return i4;
            }
            i5 = this.rq;
        }
        return i4 + i5;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public void qdl(lnr lnrVar) {
        if (qdl()) {
            if ((this.to & 4) > 0) {
                int i2 = lnrVar.mzz;
                int i3 = this.fs;
                lnrVar.mzz = i2 + i3;
                lnrVar.mo += i3;
                return;
            }
            return;
        }
        if ((this.tvp & 4) > 0) {
            int i4 = lnrVar.mzz;
            int i5 = this.rq;
            lnrVar.mzz = i4 + i5;
            lnrVar.mo += i5;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int qdl(int i2, int i3, int i4) {
        return ViewGroup.getChildMeasureSpec(i2, i3, i4);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public void qdl(View view, int i2, int i3, lnr lnrVar) {
        if (mml(i2, i3)) {
            if (qdl()) {
                int i4 = lnrVar.mzz;
                int i5 = this.fs;
                lnrVar.mzz = i4 + i5;
                lnrVar.mo += i5;
                return;
            }
            int i6 = lnrVar.mzz;
            int i7 = this.rq;
            lnrVar.mzz = i6 + i7;
            lnrVar.mo += i7;
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.yt = lnrVar;
    }
}
