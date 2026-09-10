package com.bytedance.adsdk.ugeno.yoga;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OY extends ViewGroup implements com.bytedance.adsdk.ugeno.LD.LD, com.bytedance.adsdk.ugeno.Lxb.JXs {
    private final sLN LD;
    private final Map<View, sLN> Lxb;
    private com.bytedance.adsdk.ugeno.Lxb.lc ZU;
    private com.bytedance.adsdk.ugeno.lk lk;

    public OY(Context context) {
        this(context, null, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.LD
    public void LD(int i) {
        sLN sln = this.LD;
        if (sln != null) {
            LD(sln, i);
            requestLayout();
        }
    }

    public sLN Lxb(View view) {
        return this.Lxb.get(view);
    }

    public void ZU(View view, int i) {
        int iLxb;
        view.setVisibility(i);
        try {
            sLN sln = this.Lxb.get(view);
            Object tag = view.getTag(151060224);
            if (i != 0) {
                if (i != 8 || (iLxb = this.LD.Lxb(sln)) == -1) {
                    return;
                }
                this.LD.LD(iLxb);
                view.setTag(151060224, Integer.valueOf(iLxb));
                Lxb(this.LD);
                return;
            }
            if (tag == null || this.LD.Lxb(sln) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.LD.Lxb()) {
                this.LD.Lxb(this.Lxb.get(view), iIntValue);
            } else {
                this.LD.Lxb(this.Lxb.get(view), this.LD.Lxb());
            }
            Lxb(this.LD);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        sLN slnLxb;
        this.LD.Lxb((QAg) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.Lxb) {
            throw null;
        }
        super.addView(view, i, layoutParams);
        if (this.Lxb.containsKey(view)) {
            return;
        }
        if (view instanceof OY) {
            slnLxb = ((OY) view).getYogaNode();
        } else {
            slnLxb = this.Lxb.containsKey(view) ? this.Lxb.get(view) : NXR.Lxb();
            slnLxb.Lxb(view);
            slnLxb.Lxb((QAg) new LD());
        }
        Lxb((Lxb) view.getLayoutParams(), slnLxb, view);
        this.Lxb.put(view, slnLxb);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.LD.Lxb()));
        } else {
            sLN sln = this.LD;
            sln.Lxb(slnLxb, sln.Lxb());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Lxb;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Lxb(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new Lxb(layoutParams);
    }

    public float getBorderRadius() {
        return this.ZU.Lxb();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRipple() {
        return this.ZU.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRubIn() {
        return this.ZU.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getShine() {
        return this.ZU.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getStretch() {
        return this.ZU.getStretch();
    }

    public sLN getYogaNode() {
        return this.LD;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.LD
    public void lk(View view, int i) {
        ZU(view, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.Lxb(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.lc();
        }
        if (!(getParent() instanceof OY)) {
            Lxb(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        Lxb(this.LD, 0.0f, 0.0f);
        com.bytedance.adsdk.ugeno.lk lkVar2 = this.lk;
        if (lkVar2 != null) {
            lkVar2.Lxb(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof OY)) {
            Lxb(i, i2);
        }
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            int[] iArrLxb = lkVar.Lxb(i, i2);
            setMeasuredDimension(iArrLxb[0], iArrLxb[1]);
        } else {
            setMeasuredDimension(Math.round(this.LD.ebl()), Math.round(this.LD.OY()));
        }
        com.bytedance.adsdk.ugeno.lk lkVar2 = this.lk;
        if (lkVar2 != null) {
            lkVar2.JXs();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.LD(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Lxb(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Lxb(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Lxb(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Lxb(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        Lxb(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            Lxb(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            Lxb(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.ZU.Lxb(i);
    }

    public void setBorderRadius(float f) {
        this.ZU.Lxb(f);
    }

    public void setRipple(float f) {
        com.bytedance.adsdk.ugeno.Lxb.lc lcVar = this.ZU;
        if (lcVar != null) {
            lcVar.LD(f);
        }
    }

    public void setRubIn(float f) {
        com.bytedance.adsdk.ugeno.Lxb.lc lcVar = this.ZU;
        if (lcVar != null) {
            lcVar.JXs(f);
        }
    }

    public void setShine(float f) {
        com.bytedance.adsdk.ugeno.Lxb.lc lcVar = this.ZU;
        if (lcVar != null) {
            lcVar.lk(f);
        }
    }

    public void setStretch(float f) {
        com.bytedance.adsdk.ugeno.Lxb.lc lcVar = this.ZU;
        if (lcVar != null) {
            lcVar.ZU(f);
        }
    }

    public OY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ZU = new com.bytedance.adsdk.ugeno.Lxb.lc(this);
        sLN slnLxb = NXR.Lxb();
        this.LD = slnLxb;
        this.Lxb = new HashMap();
        slnLxb.Lxb(this);
        slnLxb.Lxb((QAg) new LD());
        Lxb((Lxb) generateDefaultLayoutParams(), slnLxb, this);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.LD
    public void Lxb(int i) {
        sLN sln = this.LD;
        if (sln != null) {
            Lxb(sln, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.LD
    public void LD(View view, int i) {
        sLN slnLxb;
        if (view == null || (slnLxb = Lxb(view)) == null) {
            return;
        }
        LD(slnLxb, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.LD
    public void Lxb(View view, int i) {
        sLN slnLxb;
        if (view == null || (slnLxb = Lxb(view)) == null) {
            return;
        }
        Lxb(slnLxb, i);
        view.requestLayout();
    }

    private void LD(sLN sln, int i) {
        if (i == -1) {
            sln.ebl(100.0f);
        } else if (i == -2) {
            sln.ZU();
        } else {
            sln.lc(i);
        }
    }

    private void Lxb(sLN sln, int i) {
        if (i == -1) {
            sln.JXs(100.0f);
        } else if (i == -2) {
            sln.lk();
        } else {
            sln.ZU(i);
        }
    }

    public static class LD implements QAg {
        @Override // com.bytedance.adsdk.ugeno.yoga.QAg
        public long Lxb(sLN sln, float f, nBu nbu, float f2, nBu nbu2) {
            View view = (View) sln.QAg();
            if (view == null || (view instanceof OY)) {
                return JVA.Lxb(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, Lxb(nbu)), View.MeasureSpec.makeMeasureSpec((int) f2, Lxb(nbu2)));
            return JVA.Lxb(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int Lxb(nBu nbu) {
            if (nbu == nBu.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return nbu == nBu.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class Lxb extends ViewGroup.LayoutParams {
        private float IeN;
        private float JVA;
        private float JXs;
        SparseArray<String> LD;
        SparseArray<Float> Lxb;
        private float NXR;
        private float OY;
        private float QAg;
        private float STP;
        private float VVE;
        private float ZU;
        private float brP;
        private float ebl;
        private float kqm;
        private float lc;
        private float lk;
        private float nBu;
        private float sLN;
        private float tD;

        public Lxb(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof Lxb) {
                Lxb lxb = (Lxb) layoutParams;
                this.Lxb = lxb.Lxb.clone();
                this.LD = lxb.LD.clone();
                return;
            }
            this.Lxb = new SparseArray<>();
            this.LD = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.Lxb.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.Lxb.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void IeN(float f) {
            this.kqm = f;
            this.Lxb.put(25, Float.valueOf(f));
        }

        public void JVA(float f) {
            this.lk = f;
            this.Lxb.put(17, Float.valueOf(f));
        }

        public void JXs(float f) {
            this.JVA = f;
            this.Lxb.put(9, Float.valueOf(f));
        }

        public void LD(float f) {
            this.OY = f;
            this.Lxb.put(6, Float.valueOf(f));
        }

        public void Lxb(float f) {
            this.ebl = f;
            this.Lxb.put(5, Float.valueOf(f));
        }

        public void NXR(float f) {
            this.JXs = f;
            this.Lxb.put(19, Float.valueOf(f));
        }

        public void OY(float f) {
            this.STP = f;
            this.Lxb.put(11, Float.valueOf(f));
        }

        public void QAg(float f) {
            this.IeN = f;
            this.Lxb.put(12, Float.valueOf(f));
        }

        public void STP(float f) {
            this.lc = f;
            this.Lxb.put(20, Float.valueOf(f));
        }

        public void VVE(float f) {
            this.brP = f;
            this.Lxb.put(27, Float.valueOf(f));
        }

        public void ZU(float f) {
            this.nBu = f;
            this.Lxb.put(8, Float.valueOf(f));
        }

        public void ebl(float f) {
            this.NXR = f;
            this.Lxb.put(10, Float.valueOf(f));
        }

        public void kqm(float f) {
            this.tD = f;
            this.Lxb.put(28, Float.valueOf(f));
        }

        public void lc(float f) {
            this.sLN = f;
            this.Lxb.put(14, Float.valueOf(f));
        }

        public void lk(float f) {
            this.QAg = f;
            this.Lxb.put(7, Float.valueOf(f));
        }

        public void nBu(float f) {
            this.VVE = f;
            this.Lxb.put(13, Float.valueOf(f));
        }

        public void sLN(float f) {
            this.ZU = f;
            this.Lxb.put(18, Float.valueOf(f));
        }

        public Lxb(int i, int i2) {
            super(i, i2);
            this.Lxb = new SparseArray<>();
            this.LD = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.Lxb.put(15, Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.Lxb.put(16, Float.valueOf(i2));
            }
        }
    }

    private void Lxb(sLN sln) {
        if (sln.LD() != null) {
            Lxb(sln.LD());
        } else {
            sln.Lxb(Float.NaN, Float.NaN);
        }
    }

    private void Lxb(View view, boolean z) {
        sLN sln = this.Lxb.get(view);
        if (sln == null) {
            return;
        }
        sLN slnLD = sln.LD();
        for (int i = 0; i < slnLD.Lxb(); i++) {
            if (slnLD.Lxb(i).equals(sln)) {
                slnLD.LD(i);
                break;
            }
        }
        sln.Lxb((Object) null);
        this.Lxb.remove(view);
        if (z) {
            this.LD.Lxb(Float.NaN, Float.NaN);
        }
    }

    private void Lxb(sLN sln, float f, float f2) {
        View view = (View) sln.QAg();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(sln.JXs() + f);
            int iRound2 = Math.round(sln.lc() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(sln.ebl()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(sln.OY()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iLxb = sln.Lxb();
        for (int i = 0; i < iLxb; i++) {
            if (equals(view)) {
                Lxb(sln.Lxb(i), f, f2);
            } else if (!(view instanceof OY)) {
                Lxb(sln.Lxb(i), sln.JXs() + f, sln.lc() + f2);
            }
        }
    }

    private void Lxb(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.LD.lc(size2);
        }
        if (mode == 1073741824) {
            this.LD.ZU(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.LD.JVA(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.LD.nBu(size);
        }
        this.LD.Lxb(Float.NaN, Float.NaN);
    }

    public static void Lxb(Lxb lxb, sLN sln, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            sln.Lxb(ZU.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                sln.LD(JXs.LEFT, rect.left);
                sln.LD(JXs.TOP, rect.top);
                sln.LD(JXs.RIGHT, rect.right);
                sln.LD(JXs.BOTTOM, rect.bottom);
            }
        }
        for (int i = 0; i < lxb.Lxb.size(); i++) {
            int iKeyAt = lxb.Lxb.keyAt(i);
            float fFloatValue = lxb.Lxb.valueAt(i).floatValue();
            if (iKeyAt == 4) {
                sln.lk(com.bytedance.adsdk.ugeno.yoga.LD.Lxb(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                sln.Lxb(com.bytedance.adsdk.ugeno.yoga.LD.Lxb(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                sln.LD(com.bytedance.adsdk.ugeno.yoga.LD.Lxb(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                sln.sLN(fFloatValue);
            } else if (iKeyAt == 8) {
                sln.lk(fFloatValue);
            } else if (iKeyAt == 1) {
                sln.Lxb(lc.Lxb(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                sln.Lxb(fFloatValue);
            } else if (iKeyAt == 7) {
                sln.LD(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    sln.ebl(100.0f);
                } else if (fFloatValue == -2.0f) {
                    sln.ZU();
                } else {
                    sln.lc(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                sln.Lxb(JXs.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                sln.Lxb(ebl.Lxb(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                sln.Lxb(JXs.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                sln.Lxb(JXs.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                sln.Lxb(JXs.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                sln.QAg(fFloatValue);
            } else if (iKeyAt == 27) {
                sln.OY(fFloatValue);
            } else if (iKeyAt == 22) {
                sln.LD(JXs.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                sln.LD(JXs.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                sln.LD(JXs.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                sln.LD(JXs.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                sln.lk(JXs.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                sln.lk(JXs.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                sln.lk(JXs.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                sln.lk(JXs.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                sln.Lxb(IeN.Lxb(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    sln.JXs(100.0f);
                } else if (fFloatValue == -2.0f) {
                    sln.lk();
                } else {
                    sln.ZU(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                sln.Lxb(VVE.Lxb(Math.round(fFloatValue)));
            }
        }
    }

    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        this.lk = lkVar;
    }
}
