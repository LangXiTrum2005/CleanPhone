package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fi extends FrameLayout implements IAnimation, dzy, xd {
    private static final View.OnTouchListener uq = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener wjv = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    private float ac;
    protected com.bytedance.sdk.component.adexpress.dynamic.ka.mj aw;
    protected DynamicRootView bgr;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.ri.lr bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.ka.xha f18035co;
    protected float di;
    protected float fi;
    private com.bytedance.sdk.component.utils.ay ihz;
    protected float ik;
    protected int jbs;
    protected float ka;
    private float lr;
    protected int mj;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.ik nr;
    protected int qt;
    private float ri;
    protected Context sf;
    protected boolean slm;
    private float tan;
    protected View vr;
    protected int xha;

    public fi(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context);
        this.sf = context;
        this.bgr = dynamicRootView;
        this.aw = mjVar;
        this.ik = mjVar.di();
        this.ka = mjVar.xha();
        this.fi = mjVar.mj();
        this.di = mjVar.jbs();
        this.jbs = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.ik);
        this.qt = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.ka);
        this.xha = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.fi);
        this.mj = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.di);
        com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar = new com.bytedance.sdk.component.adexpress.dynamic.ka.xha(mjVar.qt());
        this.f18035co = xhaVar;
        if (xhaVar.nr() > 0) {
            this.xha += this.f18035co.nr() * 2;
            this.mj += this.f18035co.nr() * 2;
            this.jbs -= this.f18035co.nr();
            this.qt -= this.f18035co.nr();
            List<com.bytedance.sdk.component.adexpress.dynamic.ka.mj> listSf = mjVar.sf();
            if (listSf != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar2 : listSf) {
                    mjVar2.ik(mjVar2.di() + com.bytedance.sdk.component.adexpress.ka.xha.lr(this.sf, this.f18035co.nr()));
                    mjVar2.ka(mjVar2.xha() + com.bytedance.sdk.component.adexpress.ka.xha.lr(this.sf, this.f18035co.nr()));
                    mjVar2.ri(com.bytedance.sdk.component.adexpress.ka.xha.lr(this.sf, this.f18035co.nr()));
                    mjVar2.lr(com.bytedance.sdk.component.adexpress.ka.xha.lr(this.sf, this.f18035co.nr()));
                }
            }
        }
        this.slm = this.f18035co.bgr() > 0.0d;
        this.nr = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ik();
    }

    public void di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.mj);
        layoutParams.topMargin = this.qt;
        int i = this.jbs;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean fi() {
        com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar = this.f18035co;
        return (xhaVar == null || xhaVar.igq() == 0) ? false : true;
    }

    public Drawable getBackgroundDrawable() {
        return ri(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.slm;
    }

    public int getClickArea() {
        return this.f18035co.igq();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.di.ri getDynamicClickListener() {
        return this.bgr.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.mj;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ka.di getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.ka.fi fiVarQt;
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = this.aw;
        if (mjVar == null || (fiVarQt = mjVar.qt()) == null) {
            return null;
        }
        return fiVarQt.fi();
    }

    public int getDynamicWidth() {
        return this.xha;
    }

    public String getImageObjectFit() {
        return this.f18035co.xm();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.tan;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(ri(lr(this.f18035co.pv().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.ac;
    }

    public boolean ik() {
        jbs();
        di();
        ka();
        return true;
    }

    public boolean ka() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.vr;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (fi()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = uq;
            onClickListener = wjv;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iRi = com.bytedance.sdk.component.adexpress.dynamic.lr.ri.ri(this.f18035co);
            if (iRi == 2 || iRi == 3) {
                view2.setOnClickListener(wjv);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        ri(view2);
        lr(view2);
        return true;
    }

    public void lr(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi;
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = this.aw;
        if (mjVar == null || (diVarFi = mjVar.qt().fi()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(diVarFi.smj()));
    }

    public boolean mj() {
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = this.aw;
        return mjVar == null || mjVar.qt() == null || this.aw.qt().fi() == null || this.aw.qt().fi().xlq() == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xha();
        ri();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        lr();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.nr.ri(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.ik ikVar = this.nr;
        View view = this.vr;
        if (view == null) {
            view = this;
        }
        ikVar.ri(view, i, i2);
    }

    public void ri(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar = this.f18035co;
        if (xhaVar != null && xhaVar.ri(i)) {
            jbs();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof fi)) {
                    ((fi) childAt).ri(i);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.tan = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.ri = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.lr = f;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z) {
        this.slm = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.ac = f;
        this.nr.ri(this, f);
    }

    public void xha() {
        if (mj()) {
            return;
        }
        View view = this.vr;
        if (view == null) {
            view = this;
        }
        this.bu = new com.bytedance.sdk.component.adexpress.dynamic.animation.ri.lr(view, this.aw.qt().fi().xlq());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.ri.lr lrVar = fi.this.bu;
                if (lrVar != null) {
                    lrVar.ri();
                }
            }
        });
    }

    private List<String> lr(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && (i = i - 1) == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    public void ri(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.aw.mj());
            jSONObject.put("height", this.aw.jbs());
            if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ri.ac, this.f18035co.ig());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ri.ihz, this.aw.qt().lr());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ri.uq, this.aw.ik());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ri.wjv, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.f18035co.ig());
            view.setTag(2097610715, this.aw.qt().lr());
            view.setTag(2097610714, this.aw.ik());
            view.setTag(2097610713, jSONObject.toString());
            int iRi = com.bytedance.sdk.component.adexpress.dynamic.lr.ri.ri(this.f18035co);
            if (iRi == 1) {
                view.setTag(2097610707, new Pair(this.f18035co.fr(), Long.valueOf(this.f18035co.su())));
                view.setTag(2097610708, Integer.valueOf(iRi));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    public void lr() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.ri.lr lrVar = this.bu;
        if (lrVar != null) {
            lrVar.lr();
        }
    }

    public Drawable ri(boolean z, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iZf;
        if (!TextUtils.isEmpty(this.f18035co.pv())) {
            try {
                String strPv = this.f18035co.pv();
                String strSubstring = strPv.substring(strPv.indexOf("(") + 1, strPv.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d > 225.0d && d < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableRi = ri(ri(strArrSplit[0]), iArr);
                gradientDrawableRi.setShape(0);
                gradientDrawableRi.setCornerRadius(com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.vr()));
                return gradientDrawableRi;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fRi = com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.vr());
        drawable.setCornerRadius(fRi);
        if (fRi < 1.0f) {
            float fRi2 = com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.ory());
            float fRi3 = com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.hcw());
            float fRi4 = com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.oh());
            float fRi5 = com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.xd());
            float[] fArr = new float[8];
            if (fRi2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[0] = fRi2;
                fArr[1] = fRi2;
            }
            if (fRi3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[2] = fRi3;
                fArr[3] = fRi3;
            }
            if (fRi4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[4] = fRi4;
                fArr[5] = fRi4;
            }
            if (fRi5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[6] = fRi5;
                fArr[7] = fRi5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            iZf = Color.parseColor(str);
        } else {
            iZf = this.f18035co.zf();
        }
        drawable.setColor(iZf);
        if (this.f18035co.bu() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.bu()), this.f18035co.slm());
        } else if (this.f18035co.nr() > 0) {
            drawable.setStroke(this.f18035co.nr(), this.f18035co.slm());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.aw.qt().lr(), "video-vd")) {
                setLayerType(1, null);
                return new tan((int) fRi, this.f18035co.nr());
            }
        }
        return drawable;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public lr ri(Bitmap bitmap) {
        return new ri(bitmap, null);
    }

    private Drawable[] ri(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(strArrSplit[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable gradientDrawableRi = ri(ri(strArrSplit[0]), iArr);
                gradientDrawableRi.setShape(0);
                gradientDrawableRi.setCornerRadius(com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.vr()));
                drawableArr[(list.size() - 1) - i] = gradientDrawableRi;
            }
        }
        return drawableArr;
    }

    public GradientDrawable ri(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation ri(String str) {
        try {
            int i = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void ri() {
        if (isShown()) {
            int iRi = com.bytedance.sdk.component.adexpress.dynamic.lr.ri.ri(this.f18035co);
            if (iRi == 2) {
                if (this.ihz == null) {
                    this.ihz = new com.bytedance.sdk.component.utils.ay(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.4
                };
                com.bytedance.sdk.component.adexpress.lr.aw renderRequest = this.bgr.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.vr();
                    renderRequest.ihz();
                    renderRequest.tan();
                    return;
                }
                return;
            }
            if (iRi == 3) {
                if (this.ihz == null) {
                    this.ihz = new com.bytedance.sdk.component.utils.ay(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.5
                };
                com.bytedance.sdk.component.adexpress.lr.aw renderRequest2 = this.bgr.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.bu();
                    renderRequest2.uq();
                    renderRequest2.nr();
                    renderRequest2.ac();
                }
            }
        }
    }
}
