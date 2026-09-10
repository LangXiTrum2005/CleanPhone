package com.bytedance.adsdk.ugeno.yoga.ud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.qdl.jpc;
import com.bytedance.adsdk.ugeno.qdl.wd;
import com.bytedance.adsdk.ugeno.yoga.exu;
import com.bytedance.adsdk.ugeno.yoga.mo;
import com.bytedance.adsdk.ugeno.yoga.mzz;
import com.bytedance.adsdk.ugeno.yoga.rdp;
import com.bytedance.adsdk.ugeno.yoga.rq;
import com.bytedance.adsdk.ugeno.yoga.to;
import com.bytedance.adsdk.ugeno.yoga.tvp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends ViewGroup implements wd, com.bytedance.adsdk.ugeno.ud.ud {
    private mml lnr;
    private jpc mml;
    private final Map<View, to> qdl;
    private final to ud;

    public lnr(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        to toVarQdl;
        this.ud.qdl((com.bytedance.adsdk.ugeno.yoga.wd) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.ud.ud) {
            throw null;
        }
        super.addView(view, i2, layoutParams);
        if (this.qdl.containsKey(view)) {
            return;
        }
        if (view instanceof lnr) {
            toVarQdl = ((lnr) view).getYogaNode();
        } else {
            toVarQdl = this.qdl.containsKey(view) ? this.qdl.get(view) : rq.qdl();
            toVarQdl.qdl(view);
            toVarQdl.qdl((com.bytedance.adsdk.ugeno.yoga.wd) new ud());
        }
        qdl((qdl) view.getLayoutParams(), toVarQdl, view);
        this.qdl.put(view, toVarQdl);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.ud.qdl()));
        } else {
            to toVar = this.ud;
            toVar.qdl(toVarQdl, toVar.qdl());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qdl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.ud(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qdl(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new qdl(layoutParams);
    }

    public float getBorderRadius() {
        return this.mml.qdl();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.mml.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.mml.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.mml.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.mml.getStretch();
    }

    public to getYogaNode() {
        return this.ud;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void lnr(View view, int i2) {
        mml(view, i2);
    }

    public void mml(View view, int i2) {
        int iQdl;
        view.setVisibility(i2);
        try {
            to toVar = this.qdl.get(view);
            Object tag = view.getTag(151060224);
            if (i2 != 0) {
                if (i2 != 8 || (iQdl = this.ud.qdl(toVar)) == -1) {
                    return;
                }
                this.ud.ud(iQdl);
                view.setTag(151060224, Integer.valueOf(iQdl));
                qdl(this.ud);
                return;
            }
            if (tag == null || this.ud.qdl(toVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.ud.qdl()) {
                this.ud.qdl(this.qdl.get(view), iIntValue);
            } else {
                this.ud.qdl(this.qdl.get(view), this.ud.qdl());
            }
            qdl(this.ud);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.qdl(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        if (!(getParent() instanceof lnr)) {
            qdl(View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i5 - i3, 1073741824));
        }
        qdl(this.ud, 0.0f, 0.0f);
        mml mmlVar2 = this.lnr;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (!(getParent() instanceof lnr)) {
            qdl(i2, i3);
        }
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            setMeasuredDimension(iArrQdl[0], iArrQdl[1]);
        } else {
            setMeasuredDimension(Math.round(this.ud.jpc()), Math.round(this.ud.tvp()));
        }
        mml mmlVar2 = this.lnr;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public to qdl(View view) {
        return this.qdl.get(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            qdl(getChildAt(i2), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            qdl(getChildAt(i2), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        qdl(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        qdl(getChildAt(i2), false);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        qdl(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            qdl(getChildAt(i4), false);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            qdl(getChildAt(i4), true);
        }
        super.removeViewsInLayout(i2, i3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.mml.qdl(i2);
    }

    public void setBorderRadius(float f) {
        this.mml.qdl(f);
    }

    public void setRipple(float f) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.ud(f);
        }
    }

    public void setRubIn(float f) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.mzz(f);
        }
    }

    public void setShine(float f) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.lnr(f);
        }
    }

    public void setStretch(float f) {
        jpc jpcVar = this.mml;
        if (jpcVar != null) {
            jpcVar.mml(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void ud(int i2) {
        to toVar = this.ud;
        if (toVar != null) {
            ud(toVar, i2);
            requestLayout();
        }
    }

    public lnr(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mml = new jpc(this);
        to toVarQdl = rq.qdl();
        this.ud = toVarQdl;
        this.qdl = new HashMap();
        toVarQdl.qdl(this);
        toVarQdl.qdl((com.bytedance.adsdk.ugeno.yoga.wd) new ud());
        qdl((qdl) generateDefaultLayoutParams(), toVarQdl, this);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void qdl(int i2) {
        to toVar = this.ud;
        if (toVar != null) {
            qdl(toVar, i2);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void ud(View view, int i2) {
        to toVarQdl;
        if (view == null || (toVarQdl = qdl(view)) == null) {
            return;
        }
        ud(toVarQdl, i2);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.ud.ud
    public void qdl(View view, int i2) {
        to toVarQdl;
        if (view == null || (toVarQdl = qdl(view)) == null) {
            return;
        }
        qdl(toVarQdl, i2);
        view.requestLayout();
    }

    private void ud(to toVar, int i2) {
        if (i2 == -1) {
            toVar.wd(100.0f);
        } else if (i2 == -2) {
            toVar.mzz();
        } else {
            toVar.mo(i2);
        }
    }

    private void qdl(to toVar, int i2) {
        if (i2 == -1) {
            toVar.mzz(100.0f);
        } else if (i2 == -2) {
            toVar.mml();
        } else {
            toVar.mml(i2);
        }
    }

    public static class ud implements com.bytedance.adsdk.ugeno.yoga.wd {
        @Override // com.bytedance.adsdk.ugeno.yoga.wd
        public long qdl(to toVar, float f, com.bytedance.adsdk.ugeno.yoga.jpc jpcVar, float f2, com.bytedance.adsdk.ugeno.yoga.jpc jpcVar2) {
            View view = (View) toVar.to();
            if (view == null || (view instanceof lnr)) {
                return tvp.qdl(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, qdl(jpcVar)), View.MeasureSpec.makeMeasureSpec((int) f2, qdl(jpcVar2)));
            return tvp.qdl(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int qdl(com.bytedance.adsdk.ugeno.yoga.jpc jpcVar) {
            if (jpcVar == com.bytedance.adsdk.ugeno.yoga.jpc.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return jpcVar == com.bytedance.adsdk.ugeno.yoga.jpc.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class qdl extends ViewGroup.LayoutParams {
        private float bjy;
        private float exc;
        private float exu;
        private float fs;
        private float jl;
        private float jpc;
        private float jtx;
        private float lnr;
        private float mml;
        private float mo;
        private float mzz;
        SparseArray<Float> qdl;
        private float rdp;
        private float rq;
        private float to;
        private float tvp;
        SparseArray<String> ud;
        private float wd;
        private float yt;

        public qdl(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof qdl) {
                qdl qdlVar = (qdl) layoutParams;
                this.qdl = qdlVar.qdl.clone();
                this.ud = qdlVar.ud.clone();
                return;
            }
            this.qdl = new SparseArray<>();
            this.ud = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.qdl.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.qdl.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void bjy(float f) {
            this.yt = f;
            this.qdl.put(25, Float.valueOf(f));
        }

        public void exu(float f) {
            this.mzz = f;
            this.qdl.put(19, Float.valueOf(f));
        }

        public void fs(float f) {
            this.mml = f;
            this.qdl.put(18, Float.valueOf(f));
        }

        public void jpc(float f) {
            this.rdp = f;
            this.qdl.put(11, Float.valueOf(f));
        }

        public void jtx(float f) {
            this.jl = f;
            this.qdl.put(27, Float.valueOf(f));
        }

        public void lnr(float f) {
            this.tvp = f;
            this.qdl.put(7, Float.valueOf(f));
        }

        public void mml(float f) {
            this.to = f;
            this.qdl.put(8, Float.valueOf(f));
        }

        public void mo(float f) {
            this.fs = f;
            this.qdl.put(14, Float.valueOf(f));
        }

        public void mzz(float f) {
            this.rq = f;
            this.qdl.put(9, Float.valueOf(f));
        }

        public void qdl(float f) {
            this.wd = f;
            this.qdl.put(5, Float.valueOf(f));
        }

        public void rdp(float f) {
            this.mo = f;
            this.qdl.put(20, Float.valueOf(f));
        }

        public void rq(float f) {
            this.lnr = f;
            this.qdl.put(17, Float.valueOf(f));
        }

        public void to(float f) {
            this.jtx = f;
            this.qdl.put(13, Float.valueOf(f));
        }

        public void tvp(float f) {
            this.bjy = f;
            this.qdl.put(12, Float.valueOf(f));
        }

        public void ud(float f) {
            this.jpc = f;
            this.qdl.put(6, Float.valueOf(f));
        }

        public void wd(float f) {
            this.exu = f;
            this.qdl.put(10, Float.valueOf(f));
        }

        public void yt(float f) {
            this.exc = f;
            this.qdl.put(28, Float.valueOf(f));
        }

        public qdl(int i2, int i3) {
            super(i2, i3);
            this.qdl = new SparseArray<>();
            this.ud = new SparseArray<>();
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.qdl.put(15, Float.valueOf(i2));
            }
            if (i3 == -2 || i3 == -1 || i3 >= 0) {
                this.qdl.put(16, Float.valueOf(i3));
            }
        }
    }

    private void qdl(to toVar) {
        if (toVar.ud() != null) {
            qdl(toVar.ud());
        } else {
            toVar.qdl(Float.NaN, Float.NaN);
        }
    }

    private void qdl(View view, boolean z2) {
        try {
            to toVar = this.qdl.get(view);
            if (toVar == null) {
                return;
            }
            to toVarUd = toVar.ud();
            for (int i2 = 0; i2 < toVarUd.qdl(); i2++) {
                if (toVarUd.qdl(i2).equals(toVar)) {
                    toVarUd.ud(i2);
                    break;
                }
            }
            toVar.qdl((Object) null);
            this.qdl.remove(view);
            if (z2) {
                this.ud.qdl(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void qdl(to toVar, float f, float f2) {
        View view = (View) toVar.to();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(toVar.mo() + f);
            int iRound2 = Math.round(toVar.wd() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(toVar.jpc()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(toVar.tvp()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iQdl = toVar.qdl();
        for (int i2 = 0; i2 < iQdl; i2++) {
            if (equals(view)) {
                qdl(toVar.qdl(i2), f, f2);
            } else if (!(view instanceof lnr)) {
                qdl(toVar.qdl(i2), toVar.mo() + f, toVar.wd() + f2);
            }
        }
    }

    private void qdl(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == 1073741824) {
            this.ud.mo(size2);
        }
        if (mode == 1073741824) {
            this.ud.mml(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.ud.rq(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.ud.to(size);
        }
        this.ud.qdl(Float.NaN, Float.NaN);
    }

    public static void qdl(qdl qdlVar, to toVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            toVar.qdl(com.bytedance.adsdk.ugeno.yoga.lnr.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, rect.left);
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.TOP, rect.top);
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, rect.right);
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, rect.bottom);
            }
        }
        for (int i2 = 0; i2 < qdlVar.qdl.size(); i2++) {
            int iKeyAt = qdlVar.qdl.keyAt(i2);
            float fFloatValue = qdlVar.qdl.valueAt(i2).floatValue();
            if (iKeyAt == 4) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.qdl.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.qdl.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.qdl.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                toVar.fs(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    toVar.lnr();
                } else {
                    toVar.lnr(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                toVar.qdl(mzz.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                toVar.qdl(fFloatValue);
            } else if (iKeyAt == 7) {
                toVar.ud(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    toVar.wd(100.0f);
                } else if (fFloatValue == -2.0f) {
                    toVar.mzz();
                } else {
                    toVar.mo(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                toVar.qdl(mo.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                toVar.qdl(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                toVar.tvp(fFloatValue);
            } else if (iKeyAt == 27) {
                toVar.jpc(fFloatValue);
            } else if (iKeyAt == 22) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                toVar.ud(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                toVar.lnr(com.bytedance.adsdk.ugeno.yoga.mml.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                toVar.qdl(exu.qdl(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    toVar.mzz(100.0f);
                } else if (fFloatValue == -2.0f) {
                    toVar.mml();
                } else {
                    toVar.mml(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                toVar.qdl(rdp.qdl(Math.round(fFloatValue)));
            }
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.lnr = lnrVar;
    }
}
