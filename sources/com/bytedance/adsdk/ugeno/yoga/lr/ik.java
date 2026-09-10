package com.bytedance.adsdk.ugeno.yoga.lr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.ka;
import com.bytedance.adsdk.ugeno.ri.mj;
import com.bytedance.adsdk.ugeno.ri.xha;
import com.bytedance.adsdk.ugeno.yoga.aw;
import com.bytedance.adsdk.ugeno.yoga.bgr;
import com.bytedance.adsdk.ugeno.yoga.di;
import com.bytedance.adsdk.ugeno.yoga.fi;
import com.bytedance.adsdk.ugeno.yoga.jbs;
import com.bytedance.adsdk.ugeno.yoga.qt;
import com.bytedance.adsdk.ugeno.yoga.sf;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ViewGroup implements com.bytedance.adsdk.ugeno.lr.lr, xha {
    private ka ik;
    private mj ka;
    private final qt lr;
    private final Map<View, qt> ri;

    public ik(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        qt qtVarRi;
        this.lr.ri((com.bytedance.adsdk.ugeno.yoga.xha) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.lr.lr) {
            throw null;
        }
        super.addView(view, i, layoutParams);
        if (this.ri.containsKey(view)) {
            return;
        }
        if (view instanceof ik) {
            qtVarRi = ((ik) view).getYogaNode();
        } else {
            qtVarRi = this.ri.containsKey(view) ? this.ri.get(view) : sf.ri();
            qtVarRi.ri(view);
            qtVarRi.ri((com.bytedance.adsdk.ugeno.yoga.xha) new lr());
        }
        ri((ri) view.getLayoutParams(), qtVarRi, view);
        this.ri.put(view, qtVarRi);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.lr.ri()));
        } else {
            qt qtVar = this.lr;
            qtVar.ri(qtVarRi, qtVar.ri());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ri;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.lr(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ri(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ri(layoutParams);
    }

    public float getBorderRadius() {
        return this.ka.ri();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getRipple() {
        return this.ka.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getRubIn() {
        return this.ka.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getShine() {
        return this.ka.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getStretch() {
        return this.ka.getStretch();
    }

    public qt getYogaNode() {
        return this.lr;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.lr
    public void ik(View view, int i) {
        ka(view, i);
    }

    public void ka(View view, int i) {
        int iRi;
        view.setVisibility(i);
        try {
            qt qtVar = this.ri.get(view);
            Object tag = view.getTag(151060224);
            if (i != 0) {
                if (i != 8 || (iRi = this.lr.ri(qtVar)) == -1) {
                    return;
                }
                this.lr.lr(iRi);
                view.setTag(151060224, Integer.valueOf(iRi));
                ri(this.lr);
                return;
            }
            if (tag == null || this.lr.ri(qtVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.lr.ri()) {
                this.lr.ri(this.ri.get(view), iIntValue);
            } else {
                this.lr.ri(this.ri.get(view), this.lr.ri());
            }
            ri(this.lr);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.lr
    public void lr(int i) {
        qt qtVar = this.lr;
        if (qtVar != null) {
            lr(qtVar, i);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.ri(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.di();
        }
        if (!(getParent() instanceof ik)) {
            ri(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        ri(this.lr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ka kaVar2 = this.ik;
        if (kaVar2 != null) {
            kaVar2.ri(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof ik)) {
            ri(i, i2);
        }
        ka kaVar = this.ik;
        if (kaVar != null) {
            int[] iArrRi = kaVar.ri(i, i2);
            setMeasuredDimension(iArrRi[0], iArrRi[1]);
        } else {
            setMeasuredDimension(Math.round(this.lr.mj()), Math.round(this.lr.jbs()));
        }
        ka kaVar2 = this.ik;
        if (kaVar2 != null) {
            kaVar2.fi();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i4);
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
            ri(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ri(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        ri(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        ri(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        ri(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            ri(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            ri(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    public qt ri(View view) {
        return this.ri.get(view);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.ka.ri(i);
    }

    public void setBorderRadius(float f) {
        this.ka.ri(f);
    }

    public void setRipple(float f) {
        mj mjVar = this.ka;
        if (mjVar != null) {
            mjVar.lr(f);
        }
    }

    public void setRubIn(float f) {
        mj mjVar = this.ka;
        if (mjVar != null) {
            mjVar.fi(f);
        }
    }

    public void setShine(float f) {
        mj mjVar = this.ka;
        if (mjVar != null) {
            mjVar.ik(f);
        }
    }

    public void setStretch(float f) {
        mj mjVar = this.ka;
        if (mjVar != null) {
            mjVar.ka(f);
        }
    }

    public ik(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ka = new mj(this);
        qt qtVarRi = sf.ri();
        this.lr = qtVarRi;
        this.ri = new HashMap();
        qtVarRi.ri(this);
        qtVarRi.ri((com.bytedance.adsdk.ugeno.yoga.xha) new lr());
        ri((ri) generateDefaultLayoutParams(), qtVarRi, this);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.lr
    public void ri(int i) {
        qt qtVar = this.lr;
        if (qtVar != null) {
            ri(qtVar, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.lr
    public void lr(View view, int i) {
        qt qtVarRi;
        if (view == null || (qtVarRi = ri(view)) == null) {
            return;
        }
        lr(qtVarRi, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.lr.lr
    public void ri(View view, int i) {
        qt qtVarRi;
        if (view == null || (qtVarRi = ri(view)) == null) {
            return;
        }
        ri(qtVarRi, i);
        view.requestLayout();
    }

    private void lr(qt qtVar, int i) {
        if (i == -1) {
            qtVar.xha(100.0f);
        } else if (i == -2) {
            qtVar.fi();
        } else {
            qtVar.di(i);
        }
    }

    private void ri(qt qtVar, int i) {
        if (i == -1) {
            qtVar.fi(100.0f);
        } else if (i == -2) {
            qtVar.ka();
        } else {
            qtVar.ka(i);
        }
    }

    public static class lr implements com.bytedance.adsdk.ugeno.yoga.xha {
        @Override // com.bytedance.adsdk.ugeno.yoga.xha
        public long ri(qt qtVar, float f, com.bytedance.adsdk.ugeno.yoga.mj mjVar, float f2, com.bytedance.adsdk.ugeno.yoga.mj mjVar2) {
            View view = (View) qtVar.qt();
            if (view == null || (view instanceof ik)) {
                return jbs.ri(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, ri(mjVar)), View.MeasureSpec.makeMeasureSpec((int) f2, ri(mjVar2)));
            return jbs.ri(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int ri(com.bytedance.adsdk.ugeno.yoga.mj mjVar) {
            if (mjVar == com.bytedance.adsdk.ugeno.yoga.mj.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return mjVar == com.bytedance.adsdk.ugeno.yoga.mj.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class ri extends ViewGroup.LayoutParams {
        private float aw;
        private float bgr;
        private float bu;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private float f18030co;
        private float di;
        private float fi;
        private float ik;
        private float jbs;
        private float ka;
        SparseArray<String> lr;
        private float mj;
        private float nr;
        private float qt;
        SparseArray<Float> ri;
        private float sf;
        private float slm;
        private float tan;
        private float vr;
        private float xha;

        public ri(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof ri) {
                ri riVar = (ri) layoutParams;
                this.ri = riVar.ri.clone();
                this.lr = riVar.lr.clone();
                return;
            }
            this.ri = new SparseArray<>();
            this.lr = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.ri.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.ri.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void aw(float f) {
            this.fi = f;
            this.ri.put(19, Float.valueOf(f));
        }

        public void bgr(float f) {
            this.di = f;
            this.ri.put(20, Float.valueOf(f));
        }

        public void bu(float f) {
            this.tan = f;
            this.ri.put(28, Float.valueOf(f));
        }

        public void co(float f) {
            this.ka = f;
            this.ri.put(18, Float.valueOf(f));
        }

        public void di(float f) {
            this.f18030co = f;
            this.ri.put(14, Float.valueOf(f));
        }

        public void fi(float f) {
            this.sf = f;
            this.ri.put(9, Float.valueOf(f));
        }

        public void ik(float f) {
            this.jbs = f;
            this.ri.put(7, Float.valueOf(f));
        }

        public void jbs(float f) {
            this.vr = f;
            this.ri.put(12, Float.valueOf(f));
        }

        public void ka(float f) {
            this.qt = f;
            this.ri.put(8, Float.valueOf(f));
        }

        public void lr(float f) {
            this.mj = f;
            this.ri.put(6, Float.valueOf(f));
        }

        public void mj(float f) {
            this.bgr = f;
            this.ri.put(11, Float.valueOf(f));
        }

        public void qt(float f) {
            this.slm = f;
            this.ri.put(13, Float.valueOf(f));
        }

        public void ri(float f) {
            this.xha = f;
            this.ri.put(5, Float.valueOf(f));
        }

        public void sf(float f) {
            this.ik = f;
            this.ri.put(17, Float.valueOf(f));
        }

        public void slm(float f) {
            this.nr = f;
            this.ri.put(27, Float.valueOf(f));
        }

        public void vr(float f) {
            this.bu = f;
            this.ri.put(25, Float.valueOf(f));
        }

        public void xha(float f) {
            this.aw = f;
            this.ri.put(10, Float.valueOf(f));
        }

        public ri(int i, int i2) {
            super(i, i2);
            this.ri = new SparseArray<>();
            this.lr = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.ri.put(15, Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.ri.put(16, Float.valueOf(i2));
            }
        }
    }

    private void ri(qt qtVar) {
        if (qtVar.lr() != null) {
            ri(qtVar.lr());
        } else {
            qtVar.ri(Float.NaN, Float.NaN);
        }
    }

    private void ri(View view, boolean z) {
        try {
            qt qtVar = this.ri.get(view);
            if (qtVar == null) {
                return;
            }
            qt qtVarLr = qtVar.lr();
            for (int i = 0; i < qtVarLr.ri(); i++) {
                if (qtVarLr.ri(i).equals(qtVar)) {
                    qtVarLr.lr(i);
                    break;
                }
            }
            qtVar.ri((Object) null);
            this.ri.remove(view);
            if (z) {
                this.lr.ri(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void ri(qt qtVar, float f, float f2) {
        View view = (View) qtVar.qt();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(qtVar.di() + f);
            int iRound2 = Math.round(qtVar.xha() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(qtVar.mj()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(qtVar.jbs()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iRi = qtVar.ri();
        for (int i = 0; i < iRi; i++) {
            if (equals(view)) {
                ri(qtVar.ri(i), f, f2);
            } else if (!(view instanceof ik)) {
                ri(qtVar.ri(i), qtVar.di() + f, qtVar.xha() + f2);
            }
        }
    }

    private void ri(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.lr.di(size2);
        }
        if (mode == 1073741824) {
            this.lr.ka(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.lr.sf(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.lr.qt(size);
        }
        this.lr.ri(Float.NaN, Float.NaN);
    }

    public static void ri(ri riVar, qt qtVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            qtVar.ri(com.bytedance.adsdk.ugeno.yoga.ik.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.LEFT, rect.left);
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.TOP, rect.top);
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.RIGHT, rect.right);
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.BOTTOM, rect.bottom);
            }
        }
        for (int i = 0; i < riVar.ri.size(); i++) {
            int iKeyAt = riVar.ri.keyAt(i);
            float fFloatValue = riVar.ri.valueAt(i).floatValue();
            if (iKeyAt == 4) {
                qtVar.ik(com.bytedance.adsdk.ugeno.yoga.ri.ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                qtVar.ri(com.bytedance.adsdk.ugeno.yoga.ri.ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ri.ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                qtVar.co(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    qtVar.ik();
                } else {
                    qtVar.ik(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                qtVar.ri(fi.ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                qtVar.ri(fFloatValue);
            } else if (iKeyAt == 7) {
                qtVar.lr(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    qtVar.xha(100.0f);
                } else if (fFloatValue == -2.0f) {
                    qtVar.fi();
                } else {
                    qtVar.di(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                qtVar.ri(com.bytedance.adsdk.ugeno.yoga.ka.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                qtVar.ri(di.ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                qtVar.ri(com.bytedance.adsdk.ugeno.yoga.ka.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                qtVar.ri(com.bytedance.adsdk.ugeno.yoga.ka.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                qtVar.ri(com.bytedance.adsdk.ugeno.yoga.ka.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                qtVar.jbs(fFloatValue);
            } else if (iKeyAt == 27) {
                qtVar.mj(fFloatValue);
            } else if (iKeyAt == 22) {
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                qtVar.lr(com.bytedance.adsdk.ugeno.yoga.ka.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                qtVar.ik(com.bytedance.adsdk.ugeno.yoga.ka.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                qtVar.ik(com.bytedance.adsdk.ugeno.yoga.ka.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                qtVar.ik(com.bytedance.adsdk.ugeno.yoga.ka.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                qtVar.ik(com.bytedance.adsdk.ugeno.yoga.ka.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                qtVar.ri(aw.ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    qtVar.fi(100.0f);
                } else if (fFloatValue == -2.0f) {
                    qtVar.ka();
                } else {
                    qtVar.ka(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                qtVar.ri(bgr.ri(Math.round(fFloatValue)));
            }
        }
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        this.ik = ikVar;
    }
}
