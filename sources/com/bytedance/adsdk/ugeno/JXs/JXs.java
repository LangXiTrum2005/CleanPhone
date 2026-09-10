package com.bytedance.adsdk.ugeno.JXs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ebl.ebl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JXs extends ViewGroup implements com.bytedance.adsdk.ugeno.JXs.Lxb {
    private ZU IeN;
    private int JVA;
    private int JXs;
    private int LD;
    private int Lxb;
    private int[] NXR;
    private Drawable OY;
    private int QAg;
    private SparseIntArray STP;
    private List<lk> VVE;
    private int ZU;
    private ZU.Lxb brP;
    private Drawable ebl;
    private com.bytedance.adsdk.ugeno.lk kqm;
    private int lc;
    private int lk;
    private int nBu;
    private int sLN;

    public static class Lxb extends ViewGroup.MarginLayoutParams implements LD {
        public static final Parcelable.Creator<Lxb> CREATOR = new Parcelable.Creator<Lxb>() { // from class: com.bytedance.adsdk.ugeno.JXs.JXs.Lxb.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public Lxb createFromParcel(Parcel parcel) {
                return new Lxb(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public Lxb[] newArray(int i) {
                return new Lxb[i];
            }
        };
        private float JXs;
        private float LD;
        private int Lxb;
        private int OY;
        private int QAg;
        private int ZU;
        private int ebl;
        private int lc;
        private float lk;
        private boolean nBu;

        public Lxb(Lxb lxb) {
            super((ViewGroup.MarginLayoutParams) lxb);
            this.Lxb = 1;
            this.LD = 0.0f;
            this.lk = 0.0f;
            this.ZU = -1;
            this.JXs = -1.0f;
            this.lc = -1;
            this.ebl = -1;
            this.OY = ViewCompat.MEASURED_SIZE_MASK;
            this.QAg = ViewCompat.MEASURED_SIZE_MASK;
            this.Lxb = lxb.Lxb;
            this.LD = lxb.LD;
            this.lk = lxb.lk;
            this.ZU = lxb.ZU;
            this.JXs = lxb.JXs;
            this.lc = lxb.lc;
            this.ebl = lxb.ebl;
            this.OY = lxb.OY;
            this.QAg = lxb.QAg;
            this.nBu = lxb.nBu;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int IeN() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public boolean JVA() {
            return this.nBu;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public float JXs() {
            return this.lk;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int LD() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int Lxb() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int NXR() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int OY() {
            return this.ebl;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int QAg() {
            return this.OY;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int STP() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int VVE() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public float ZU() {
            return this.LD;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int ebl() {
            return this.lc;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int lc() {
            return this.ZU;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int lk() {
            return this.Lxb;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public int nBu() {
            return this.QAg;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public float sLN() {
            return this.JXs;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.Lxb);
            parcel.writeFloat(this.LD);
            parcel.writeFloat(this.lk);
            parcel.writeInt(this.ZU);
            parcel.writeFloat(this.JXs);
            parcel.writeInt(this.lc);
            parcel.writeInt(this.ebl);
            parcel.writeInt(this.OY);
            parcel.writeInt(this.QAg);
            parcel.writeByte(this.nBu ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public void LD(float f) {
            this.lk = f;
        }

        public void Lxb(float f) {
            this.LD = f;
        }

        public void ZU(int i) {
            this.ZU = i;
        }

        public void lk(int i) {
            this.Lxb = i;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public void LD(int i) {
            this.ebl = i;
        }

        @Override // com.bytedance.adsdk.ugeno.JXs.LD
        public void Lxb(int i) {
            this.lc = i;
        }

        public void lk(float f) {
            this.JXs = f;
        }

        public Lxb(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.Lxb = 1;
            this.LD = 0.0f;
            this.lk = 0.0f;
            this.ZU = -1;
            this.JXs = -1.0f;
            this.lc = -1;
            this.ebl = -1;
            this.OY = ViewCompat.MEASURED_SIZE_MASK;
            this.QAg = ViewCompat.MEASURED_SIZE_MASK;
        }

        public Lxb(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.Lxb = 1;
            this.LD = 0.0f;
            this.lk = 0.0f;
            this.ZU = -1;
            this.JXs = -1.0f;
            this.lc = -1;
            this.ebl = -1;
            this.OY = ViewCompat.MEASURED_SIZE_MASK;
            this.QAg = ViewCompat.MEASURED_SIZE_MASK;
        }

        public Lxb(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.Lxb = 1;
            this.LD = 0.0f;
            this.lk = 0.0f;
            this.ZU = -1;
            this.JXs = -1.0f;
            this.lc = -1;
            this.ebl = -1;
            this.OY = ViewCompat.MEASURED_SIZE_MASK;
            this.QAg = ViewCompat.MEASURED_SIZE_MASK;
        }

        public Lxb(Parcel parcel) {
            super(0, 0);
            this.Lxb = 1;
            this.LD = 0.0f;
            this.lk = 0.0f;
            this.ZU = -1;
            this.JXs = -1.0f;
            this.lc = -1;
            this.ebl = -1;
            this.OY = ViewCompat.MEASURED_SIZE_MASK;
            this.QAg = ViewCompat.MEASURED_SIZE_MASK;
            this.Lxb = parcel.readInt();
            this.LD = parcel.readFloat();
            this.lk = parcel.readFloat();
            this.ZU = parcel.readInt();
            this.JXs = parcel.readFloat();
            this.lc = parcel.readInt();
            this.ebl = parcel.readInt();
            this.OY = parcel.readInt();
            this.QAg = parcel.readInt();
            this.nBu = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public JXs(Context context) {
        super(context, null);
        this.lc = -1;
        this.IeN = new ZU(this);
        this.VVE = new ArrayList();
        this.brP = new ZU.Lxb();
    }

    private boolean JXs(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewLk = lk(i - i3);
            if (viewLk != null && viewLk.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean ZU(int i, int i2) {
        if (JXs(i, i2)) {
            if (Lxb()) {
                return (this.nBu & 1) != 0;
            }
            return (this.QAg & 1) != 0;
        }
        if (Lxb()) {
            return (this.nBu & 2) != 0;
        }
        return (this.QAg & 2) != 0;
    }

    private boolean lc(int i) {
        if (i >= 0 && i < this.VVE.size()) {
            for (int i2 = i + 1; i2 < this.VVE.size(); i2++) {
                if (this.VVE.get(i2).LD() > 0) {
                    return false;
                }
            }
            if (Lxb()) {
                return (this.QAg & 4) != 0;
            }
            if ((this.nBu & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public View LD(int i) {
        return lk(i);
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int Lxb(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.STP == null) {
            this.STP = new SparseIntArray(getChildCount());
        }
        this.NXR = this.IeN.Lxb(view, i, layoutParams, this.STP);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Lxb;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof Lxb) {
            return new Lxb((Lxb) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new Lxb((ViewGroup.MarginLayoutParams) layoutParams) : new Lxb(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getAlignContent() {
        return this.JXs;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getAlignItems() {
        return this.ZU;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.ebl;
    }

    public Drawable getDividerDrawableVertical() {
        return this.OY;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getFlexDirection() {
        return this.Lxb;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<lk> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.VVE.size());
        for (lk lkVar : this.VVE) {
            if (lkVar.LD() != 0) {
                arrayList.add(lkVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public List<lk> getFlexLinesInternal() {
        return this.VVE;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getFlexWrap() {
        return this.LD;
    }

    public int getJustifyContent() {
        return this.lk;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getLargestMainSize() {
        Iterator<lk> it = this.VVE.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().JXs);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getMaxLine() {
        return this.lc;
    }

    public int getShowDividerHorizontal() {
        return this.QAg;
    }

    public int getShowDividerVertical() {
        return this.nBu;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int getSumOfCrossSize() {
        int size = this.VVE.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            lk lkVar = this.VVE.get(i2);
            if (ZU(i2)) {
                i += Lxb() ? this.JVA : this.sLN;
            }
            if (lc(i2)) {
                i += Lxb() ? this.JVA : this.sLN;
            }
            i += lkVar.ebl;
        }
        return i;
    }

    public View lk(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.NXR;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.kqm;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.kqm;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.OY == null && this.ebl == null) {
            return;
        }
        if (this.QAg == 0 && this.nBu == 0) {
            return;
        }
        int iLxb = ebl.Lxb(this);
        int i = this.Lxb;
        if (i == 0) {
            Lxb(canvas, iLxb == 1, this.LD == 2);
            return;
        }
        if (i == 1) {
            Lxb(canvas, iLxb != 1, this.LD == 2);
            return;
        }
        if (i == 2) {
            boolean z = iLxb == 1;
            if (this.LD == 2) {
                z = !z;
            }
            LD(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iLxb == 1;
        if (this.LD == 2) {
            z2 = !z2;
        }
        LD(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        com.bytedance.adsdk.ugeno.lk lkVar = this.kqm;
        if (lkVar != null) {
            lkVar.lc();
        }
        int iLxb = ebl.Lxb(this);
        int i5 = this.Lxb;
        if (i5 == 0) {
            Lxb(iLxb == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            Lxb(iLxb != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = iLxb == 1;
            Lxb(this.LD == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else {
            if (i5 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.Lxb);
            }
            z2 = iLxb == 1;
            Lxb(this.LD == 2 ? !z2 : z2, true, i, i2, i3, i4);
        }
        com.bytedance.adsdk.ugeno.lk lkVar2 = this.kqm;
        if (lkVar2 != null) {
            lkVar2.Lxb(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.lk lkVar = this.kqm;
        if (lkVar != null) {
            int[] iArrLxb = lkVar.Lxb(i, i2);
            Lxb(iArrLxb[0], iArrLxb[1]);
        } else {
            Lxb(i, i2);
        }
        com.bytedance.adsdk.ugeno.lk lkVar2 = this.kqm;
        if (lkVar2 != null) {
            lkVar2.JXs();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.lk lkVar = this.kqm;
        if (lkVar != null) {
            lkVar.LD(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setAlignContent(int i) {
        if (this.JXs != i) {
            this.JXs = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.ZU != i) {
            this.ZU = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.ebl) {
            return;
        }
        this.ebl = drawable;
        if (drawable != null) {
            this.JVA = drawable.getIntrinsicHeight();
        } else {
            this.JVA = 0;
        }
        LD();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.OY) {
            return;
        }
        this.OY = drawable;
        if (drawable != null) {
            this.sLN = drawable.getIntrinsicWidth();
        } else {
            this.sLN = 0;
        }
        LD();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.Lxb != i) {
            this.Lxb = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public void setFlexLines(List<lk> list) {
        this.VVE = list;
    }

    public void setFlexWrap(int i) {
        if (this.LD != i) {
            this.LD = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.lk != i) {
            this.lk = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.lc != i) {
            this.lc = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.QAg) {
            this.QAg = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.nBu) {
            this.nBu = i;
            requestLayout();
        }
    }

    private void LD(int i, int i2) {
        this.VVE.clear();
        this.brP.Lxb();
        this.IeN.Lxb(this.brP, i, i2);
        this.VVE = this.brP.Lxb;
        this.IeN.Lxb(i, i2);
        if (this.ZU == 3) {
            for (lk lkVar : this.VVE) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < lkVar.OY; i3++) {
                    View viewLk = lk(lkVar.IeN + i3);
                    if (viewLk != null && viewLk.getVisibility() != 8) {
                        Lxb lxb = (Lxb) viewLk.getLayoutParams();
                        iMax = this.LD != 2 ? Math.max(iMax, viewLk.getMeasuredHeight() + Math.max(lkVar.sLN - viewLk.getBaseline(), ((ViewGroup.MarginLayoutParams) lxb).topMargin) + ((ViewGroup.MarginLayoutParams) lxb).bottomMargin) : Math.max(iMax, viewLk.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lxb).topMargin + Math.max(viewLk.getBaseline() + (lkVar.sLN - viewLk.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) lxb).bottomMargin));
                    }
                }
                lkVar.ebl = iMax;
            }
        }
        this.IeN.LD(i, i2, getPaddingBottom() + getPaddingTop());
        this.IeN.Lxb();
        Lxb(this.Lxb, i, i2, this.brP.LD);
    }

    private void Lxb(int i, int i2) {
        if (this.STP == null) {
            this.STP = new SparseIntArray(getChildCount());
        }
        if (this.IeN.LD(this.STP)) {
            this.NXR = this.IeN.Lxb(this.STP);
        }
        int i3 = this.Lxb;
        if (i3 == 0 || i3 == 1) {
            LD(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            lk(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.Lxb);
        }
    }

    private boolean JXs(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.VVE.get(i2).LD() > 0) {
                return false;
            }
        }
        return true;
    }

    private void lk(int i, int i2) {
        this.VVE.clear();
        this.brP.Lxb();
        this.IeN.LD(this.brP, i, i2);
        this.VVE = this.brP.Lxb;
        this.IeN.Lxb(i, i2);
        this.IeN.LD(i, i2, getPaddingRight() + getPaddingLeft());
        this.IeN.Lxb();
        Lxb(this.Lxb, i, i2, this.brP.LD);
    }

    private boolean ZU(int i) {
        if (i >= 0 && i < this.VVE.size()) {
            if (JXs(i)) {
                if (Lxb()) {
                    return (this.QAg & 1) != 0;
                }
                return (this.nBu & 1) != 0;
            }
            if (Lxb()) {
                return (this.QAg & 2) != 0;
            }
            if ((this.nBu & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public View Lxb(int i) {
        return getChildAt(i);
    }

    private void Lxb(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
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
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void LD(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.VVE.size();
        for (int i3 = 0; i3 < size; i3++) {
            lk lkVar = this.VVE.get(i3);
            for (int i4 = 0; i4 < lkVar.OY; i4++) {
                int i5 = lkVar.IeN + i4;
                View viewLk = lk(i5);
                if (viewLk != null && viewLk.getVisibility() != 8) {
                    Lxb lxb = (Lxb) viewLk.getLayoutParams();
                    if (ZU(i5, i4)) {
                        if (z2) {
                            top = viewLk.getBottom() + ((ViewGroup.MarginLayoutParams) lxb).bottomMargin;
                        } else {
                            top = (viewLk.getTop() - ((ViewGroup.MarginLayoutParams) lxb).topMargin) - this.JVA;
                        }
                        LD(canvas, lkVar.Lxb, top, lkVar.ebl);
                    }
                    if (i4 == lkVar.OY - 1 && (this.QAg & 4) > 0) {
                        if (z2) {
                            bottom = (viewLk.getTop() - ((ViewGroup.MarginLayoutParams) lxb).topMargin) - this.JVA;
                        } else {
                            bottom = viewLk.getBottom() + ((ViewGroup.MarginLayoutParams) lxb).bottomMargin;
                        }
                        LD(canvas, lkVar.Lxb, bottom, lkVar.ebl);
                    }
                }
            }
            if (ZU(i3)) {
                if (z) {
                    i2 = lkVar.lk;
                } else {
                    i2 = lkVar.Lxb - this.sLN;
                }
                Lxb(canvas, i2, paddingTop, iMax);
            }
            if (lc(i3) && (this.nBu & 4) > 0) {
                if (z) {
                    i = lkVar.Lxb - this.sLN;
                } else {
                    i = lkVar.lk;
                }
                Lxb(canvas, i, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public boolean Lxb() {
        int i = this.Lxb;
        return i == 0 || i == 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ff  */
    private void Lxb(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        int i5;
        View viewLk;
        int i6;
        int i7;
        float f3;
        int i8;
        Lxb lxb;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i9 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.VVE.size();
        int i10 = 0;
        while (i10 < size) {
            lk lkVar = this.VVE.get(i10);
            if (ZU(i10)) {
                int i11 = this.JVA;
                paddingBottom -= i11;
                paddingTop += i11;
            }
            int i12 = this.lk;
            int i13 = 1;
            if (i12 == 0) {
                measuredWidth = paddingLeft;
                f = i9 - paddingRight;
            } else if (i12 == 1) {
                int i14 = lkVar.JXs;
                f = i14 - paddingLeft;
                measuredWidth = (i9 - i14) + paddingRight;
            } else {
                if (i12 == 2) {
                    int i15 = lkVar.JXs;
                    measuredWidth = paddingLeft + ((i9 - i15) / 2.0f);
                    f = (i9 - paddingRight) - ((i9 - i15) / 2.0f);
                } else if (i12 == 3) {
                    measuredWidth = paddingLeft;
                    int iLD = lkVar.LD();
                    f2 = (i9 - lkVar.JXs) / (iLD != 1 ? iLD - 1 : 1.0f);
                    f = i9 - paddingRight;
                } else if (i12 == 4) {
                    int iLD2 = lkVar.LD();
                    f2 = iLD2 != 0 ? (i9 - lkVar.JXs) / iLD2 : 0.0f;
                    float f4 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f4;
                    f = (i9 - paddingRight) - f4;
                } else if (i12 == 5) {
                    int iLD3 = lkVar.LD();
                    f2 = iLD3 != 0 ? (i9 - lkVar.JXs) / (iLD3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i9 - paddingRight) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.lk);
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < lkVar.OY) {
                    int i16 = lkVar.IeN + i5;
                    viewLk = lk(i16);
                    if (viewLk != null || viewLk.getVisibility() == 8) {
                        i6 = paddingLeft;
                        i7 = i5;
                    } else {
                        Lxb lxb2 = (Lxb) viewLk.getLayoutParams();
                        float f5 = measuredWidth + ((ViewGroup.MarginLayoutParams) lxb2).leftMargin;
                        float f6 = f - ((ViewGroup.MarginLayoutParams) lxb2).rightMargin;
                        if (ZU(i16, i5)) {
                            int i17 = this.sLN;
                            float f7 = i17;
                            f5 += f7;
                            i8 = i17;
                            f3 = f6 - f7;
                        } else {
                            f3 = f6;
                            i8 = 0;
                        }
                        int i18 = (i5 != lkVar.OY - i13 || (this.nBu & 4) <= 0) ? 0 : this.sLN;
                        if (this.LD != 2) {
                            i6 = paddingLeft;
                            i7 = i5;
                            lxb = lxb2;
                            if (z) {
                                this.IeN.Lxb(viewLk, lkVar, Math.round(f3) - viewLk.getMeasuredWidth(), paddingTop, Math.round(f3), viewLk.getMeasuredHeight() + paddingTop);
                            } else {
                                this.IeN.Lxb(viewLk, lkVar, Math.round(f5), paddingTop, viewLk.getMeasuredWidth() + Math.round(f5), viewLk.getMeasuredHeight() + paddingTop);
                            }
                        } else if (z) {
                            i7 = i5;
                            i6 = paddingLeft;
                            lxb = lxb2;
                            this.IeN.Lxb(viewLk, lkVar, Math.round(f3) - viewLk.getMeasuredWidth(), paddingBottom - viewLk.getMeasuredHeight(), Math.round(f3), paddingBottom);
                        } else {
                            i6 = paddingLeft;
                            i7 = i5;
                            lxb = lxb2;
                            this.IeN.Lxb(viewLk, lkVar, Math.round(f5), paddingBottom - viewLk.getMeasuredHeight(), viewLk.getMeasuredWidth() + Math.round(f5), paddingBottom);
                        }
                        measuredWidth = f5 + viewLk.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) lxb).rightMargin;
                        float measuredWidth2 = f3 - ((viewLk.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) lxb).leftMargin);
                        if (z) {
                            lkVar.Lxb(viewLk, i18, 0, i8, 0);
                        } else {
                            lkVar.Lxb(viewLk, i8, 0, i18, 0);
                        }
                        f = measuredWidth2;
                    }
                    i5 = i7 + 1;
                    paddingLeft = i6;
                    i13 = 1;
                }
                int i19 = paddingLeft;
                int i20 = lkVar.ebl;
                paddingTop += i20;
                paddingBottom -= i20;
                i10++;
                paddingLeft = i19;
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < lkVar.OY) {
                int i110 = lkVar.IeN + i5;
                viewLk = lk(i110);
                if (viewLk != null) {
                    i6 = paddingLeft;
                    i7 = i5;
                } else {
                    i6 = paddingLeft;
                    i7 = i5;
                }
                i5 = i7 + 1;
                paddingLeft = i6;
                i13 = 1;
            }
            int i111 = paddingLeft;
            int i21 = lkVar.ebl;
            paddingTop += i21;
            paddingBottom -= i21;
            i10++;
            paddingLeft = i111;
        }
    }

    private void LD(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.ebl;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.JVA + i2);
        this.ebl.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int LD(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    private void LD() {
        if (this.ebl == null && this.OY == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb  */
    private void Lxb(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        View viewLk;
        int i7;
        float f4;
        float f5;
        int i8;
        Lxb lxb;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int i10 = (i3 - i) - paddingRight;
        int size = this.VVE.size();
        for (int i11 = 0; i11 < size; i11++) {
            lk lkVar = this.VVE.get(i11);
            if (ZU(i11)) {
                int i12 = this.sLN;
                paddingLeft += i12;
                i10 -= i12;
            }
            int i13 = this.lk;
            if (i13 != 0) {
                if (i13 == 1) {
                    int i14 = lkVar.JXs;
                    f = (i9 - i14) + paddingBottom;
                    i5 = i14 - paddingTop;
                } else if (i13 == 2) {
                    int i15 = lkVar.JXs;
                    f2 = (i9 - paddingBottom) - ((i9 - i15) / 2.0f);
                    f = paddingTop + ((i9 - i15) / 2.0f);
                    f3 = 0.0f;
                } else if (i13 == 3) {
                    f = paddingTop;
                    int iLD = lkVar.LD();
                    f3 = (i9 - lkVar.JXs) / (iLD != 1 ? iLD - 1 : 1.0f);
                    f2 = i9 - paddingBottom;
                } else if (i13 == 4) {
                    int iLD2 = lkVar.LD();
                    f3 = iLD2 != 0 ? (i9 - lkVar.JXs) / iLD2 : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingTop + f6;
                    f2 = (i9 - paddingBottom) - f6;
                } else if (i13 == 5) {
                    int iLD3 = lkVar.LD();
                    f3 = iLD3 != 0 ? (i9 - lkVar.JXs) / (iLD3 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i9 - paddingBottom) - f3;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.lk);
                }
                float fMax = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < lkVar.OY) {
                    int i16 = lkVar.IeN + i6;
                    viewLk = lk(i16);
                    if (viewLk != null || viewLk.getVisibility() == 8) {
                        i7 = i6;
                    } else {
                        Lxb lxb2 = (Lxb) viewLk.getLayoutParams();
                        float f7 = f + ((ViewGroup.MarginLayoutParams) lxb2).topMargin;
                        float f8 = f2 - ((ViewGroup.MarginLayoutParams) lxb2).bottomMargin;
                        if (ZU(i16, i6)) {
                            int i17 = this.JVA;
                            float f9 = i17;
                            f4 = f7 + f9;
                            i8 = i17;
                            f5 = f8 - f9;
                        } else {
                            f4 = f7;
                            f5 = f8;
                            i8 = 0;
                        }
                        int i18 = (i6 != lkVar.OY - 1 || (this.QAg & 4) <= 0) ? 0 : this.JVA;
                        if (!z) {
                            i7 = i6;
                            lxb = lxb2;
                            if (z2) {
                                this.IeN.Lxb(viewLk, lkVar, false, paddingLeft, Math.round(f5) - viewLk.getMeasuredHeight(), viewLk.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                this.IeN.Lxb(viewLk, lkVar, false, paddingLeft, Math.round(f4), viewLk.getMeasuredWidth() + paddingLeft, viewLk.getMeasuredHeight() + Math.round(f4));
                            }
                        } else if (z2) {
                            i7 = i6;
                            lxb = lxb2;
                            this.IeN.Lxb(viewLk, lkVar, true, i10 - viewLk.getMeasuredWidth(), Math.round(f5) - viewLk.getMeasuredHeight(), i10, Math.round(f5));
                        } else {
                            i7 = i6;
                            lxb = lxb2;
                            this.IeN.Lxb(viewLk, lkVar, true, i10 - viewLk.getMeasuredWidth(), Math.round(f4), i10, viewLk.getMeasuredHeight() + Math.round(f4));
                        }
                        Lxb lxb3 = lxb;
                        float measuredHeight = viewLk.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) lxb3).bottomMargin + f4;
                        float measuredHeight2 = f5 - ((viewLk.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) lxb3).topMargin);
                        if (z2) {
                            lkVar.Lxb(viewLk, 0, i18, 0, i8);
                        } else {
                            lkVar.Lxb(viewLk, 0, i8, 0, i18);
                        }
                        f = measuredHeight;
                        f2 = measuredHeight2;
                    }
                    i6 = i7 + 1;
                }
                int i19 = lkVar.ebl;
                paddingLeft += i19;
                i10 -= i19;
            } else {
                f = paddingTop;
                i5 = i9 - paddingBottom;
            }
            f2 = i5;
            f3 = 0.0f;
            float fMax2 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < lkVar.OY) {
                int i110 = lkVar.IeN + i6;
                viewLk = lk(i110);
                if (viewLk != null) {
                    i7 = i6;
                } else {
                    i7 = i6;
                }
                i6 = i7 + 1;
            }
            int i111 = lkVar.ebl;
            paddingLeft += i111;
            i10 -= i111;
        }
    }

    private void Lxb(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.VVE.size();
        for (int i3 = 0; i3 < size; i3++) {
            lk lkVar = this.VVE.get(i3);
            for (int i4 = 0; i4 < lkVar.OY; i4++) {
                int i5 = lkVar.IeN + i4;
                View viewLk = lk(i5);
                if (viewLk != null && viewLk.getVisibility() != 8) {
                    Lxb lxb = (Lxb) viewLk.getLayoutParams();
                    if (ZU(i5, i4)) {
                        if (z) {
                            left = viewLk.getRight() + ((ViewGroup.MarginLayoutParams) lxb).rightMargin;
                        } else {
                            left = (viewLk.getLeft() - ((ViewGroup.MarginLayoutParams) lxb).leftMargin) - this.sLN;
                        }
                        Lxb(canvas, left, lkVar.LD, lkVar.ebl);
                    }
                    if (i4 == lkVar.OY - 1 && (this.nBu & 4) > 0) {
                        if (z) {
                            right = (viewLk.getLeft() - ((ViewGroup.MarginLayoutParams) lxb).leftMargin) - this.sLN;
                        } else {
                            right = viewLk.getRight() + ((ViewGroup.MarginLayoutParams) lxb).rightMargin;
                        }
                        Lxb(canvas, right, lkVar.LD, lkVar.ebl);
                    }
                }
            }
            if (ZU(i3)) {
                if (z2) {
                    i2 = lkVar.ZU;
                } else {
                    i2 = lkVar.LD - this.JVA;
                }
                LD(canvas, paddingLeft, i2, iMax);
            }
            if (lc(i3) && (this.QAg & 4) > 0) {
                if (z2) {
                    i = lkVar.LD - this.JVA;
                } else {
                    i = lkVar.ZU;
                }
                LD(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void Lxb(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.OY;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.sLN + i, i3 + i2);
        this.OY.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int Lxb(View view, int i, int i2) {
        int i3;
        int i4;
        if (Lxb()) {
            i3 = ZU(i, i2) ? this.sLN : 0;
            if ((this.nBu & 4) <= 0) {
                return i3;
            }
            i4 = this.sLN;
        } else {
            i3 = ZU(i, i2) ? this.JVA : 0;
            if ((this.QAg & 4) <= 0) {
                return i3;
            }
            i4 = this.JVA;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public void Lxb(lk lkVar) {
        if (Lxb()) {
            if ((this.nBu & 4) > 0) {
                int i = lkVar.JXs;
                int i2 = this.sLN;
                lkVar.JXs = i + i2;
                lkVar.lc += i2;
                return;
            }
            return;
        }
        if ((this.QAg & 4) > 0) {
            int i3 = lkVar.JXs;
            int i4 = this.JVA;
            lkVar.JXs = i3 + i4;
            lkVar.lc += i4;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public int Lxb(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.JXs.Lxb
    public void Lxb(View view, int i, int i2, lk lkVar) {
        if (ZU(i, i2)) {
            if (Lxb()) {
                int i3 = lkVar.JXs;
                int i4 = this.sLN;
                lkVar.JXs = i3 + i4;
                lkVar.lc += i4;
                return;
            }
            int i5 = lkVar.JXs;
            int i6 = this.JVA;
            lkVar.JXs = i5 + i6;
            lkVar.lc += i6;
        }
    }

    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        this.kqm = lkVar;
    }
}
