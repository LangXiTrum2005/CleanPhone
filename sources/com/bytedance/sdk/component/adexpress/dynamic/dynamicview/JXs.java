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
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JXs extends FrameLayout implements IAnimation, CG, nJ {
    private static final View.OnTouchListener HD = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener eK = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    private float DY;
    protected View IeN;
    protected Context JVA;
    protected float JXs;
    private float LD;
    private float Lxb;
    protected com.bytedance.sdk.component.adexpress.dynamic.ZU.OY NXR;
    protected int OY;
    protected int QAg;
    protected DynamicRootView STP;
    private com.bytedance.sdk.component.utils.DY Sfi;
    protected boolean VVE;
    protected float ZU;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.lk brP;
    protected int ebl;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.LD kqm;
    protected float lc;
    protected float lk;
    protected int nBu;
    protected com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl sLN;
    private float tD;

    public JXs(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context);
        this.JVA = context;
        this.STP = dynamicRootView;
        this.NXR = oy;
        this.lk = oy.lc();
        this.ZU = oy.ebl();
        this.JXs = oy.OY();
        this.lc = oy.QAg();
        this.QAg = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.lk);
        this.nBu = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.ZU);
        this.ebl = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.JXs);
        this.OY = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.lc);
        com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar = new com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl(oy.nBu());
        this.sLN = eblVar;
        if (eblVar.brP() > 0) {
            this.ebl = (this.sLN.brP() * 2) + this.ebl;
            this.OY = (this.sLN.brP() * 2) + this.OY;
            this.QAg -= this.sLN.brP();
            this.nBu -= this.sLN.brP();
            List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> listJVA = oy.JVA();
            if (listJVA != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy2 : listJVA) {
                    oy2.lk(oy2.lc() + com.bytedance.sdk.component.adexpress.ZU.OY.LD(this.JVA, this.sLN.brP()));
                    oy2.ZU(oy2.ebl() + com.bytedance.sdk.component.adexpress.ZU.OY.LD(this.JVA, this.sLN.brP()));
                    oy2.Lxb(com.bytedance.sdk.component.adexpress.ZU.OY.LD(this.JVA, this.sLN.brP()));
                    oy2.LD(com.bytedance.sdk.component.adexpress.ZU.OY.LD(this.JVA, this.sLN.brP()));
                }
            }
        }
        this.VVE = this.sLN.STP() > 0.0d;
        this.brP = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.lk();
    }

    public boolean JXs() {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar = this.sLN;
        return (eblVar == null || eblVar.foI() == 0) ? false : true;
    }

    public void LD(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = this.NXR;
        if (oy == null || (lcVarJXs = oy.nBu().JXs()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(lcVarJXs.LRt()));
    }

    public void Lxb(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar = this.sLN;
        if (eblVar != null && eblVar.Lxb(i)) {
            QAg();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof JXs)) {
                    ((JXs) childAt).Lxb(i);
                }
            }
        }
    }

    public boolean OY() {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = this.NXR;
        return oy == null || oy.nBu() == null || this.NXR.nBu().JXs() == null || this.NXR.nBu().JXs().SlV() == null;
    }

    public boolean ZU() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.IeN;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (JXs()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = HD;
            onClickListener = eK;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iLxb = com.bytedance.sdk.component.adexpress.dynamic.LD.Lxb.Lxb(this.sLN);
            if (iLxb == 2 || iLxb == 3) {
                view2.setOnClickListener(eK);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        Lxb(view2);
        LD(view2);
        return true;
    }

    public void ebl() {
        if (OY()) {
            return;
        }
        View view = this.IeN;
        if (view == null) {
            view = this;
        }
        this.kqm = new com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.LD(view, this.NXR.nBu().JXs().SlV());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.LD ld = JXs.this.kqm;
                if (ld != null) {
                    ld.Lxb();
                }
            }
        });
    }

    public Drawable getBackgroundDrawable() {
        return Lxb(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.VVE;
    }

    public int getClickArea() {
        return this.sLN.foI();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb getDynamicClickListener() {
        return this.STP.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.OY;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ZU.lc getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.JXs jXsNBu;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = this.NXR;
        if (oy == null || (jXsNBu = oy.nBu()) == null) {
            return null;
        }
        return jXsNBu.JXs();
    }

    public int getDynamicWidth() {
        return this.ebl;
    }

    public String getImageObjectFit() {
        return this.sLN.Sv();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.tD;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(Lxb(LD(this.sLN.le().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.DY;
    }

    public void lc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ebl, this.OY);
        layoutParams.topMargin = this.nBu;
        int i = this.QAg;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean lk() {
        QAg();
        lc();
        ZU();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ebl();
        Lxb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        LD();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.brP.Lxb(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.lk lkVar = this.brP;
        View view = this.IeN;
        if (view == null) {
            view = this;
        }
        lkVar.Lxb(view, i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.tD = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.Lxb = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.LD = f;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z) {
        this.VVE = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.DY = f;
        this.brP.Lxb(this, f);
    }

    private List<String> LD(String str) {
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

    public void Lxb(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.NXR.OY());
            jSONObject.put("height", this.NXR.QAg());
            if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Lxb.DY, this.sLN.BcA());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Lxb.Sfi, this.NXR.nBu().LD());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Lxb.HD, this.NXR.lk());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.Lxb.eK, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.sLN.BcA());
            view.setTag(2097610715, this.NXR.nBu().LD());
            view.setTag(2097610714, this.NXR.lk());
            view.setTag(2097610713, jSONObject.toString());
            int iLxb = com.bytedance.sdk.component.adexpress.dynamic.LD.Lxb.Lxb(this.sLN);
            if (iLxb == 1) {
                view.setTag(2097610707, new Pair(this.sLN.CSn(), Long.valueOf(this.sLN.id())));
                view.setTag(2097610708, Integer.valueOf(iLxb));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ
    public void LD() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.LD ld = this.kqm;
        if (ld != null) {
            ld.LD();
        }
    }

    public Drawable Lxb(boolean z, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iKPU;
        if (!TextUtils.isEmpty(this.sLN.le())) {
            try {
                String strLe = this.sLN.le();
                String strSubstring = strLe.substring(strLe.indexOf("(") + 1, strLe.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(strArrSplit[2].substring(0, 7))};
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
                GradientDrawable gradientDrawableLxb = Lxb(Lxb(strArrSplit[0]), iArr);
                gradientDrawableLxb.setShape(0);
                gradientDrawableLxb.setCornerRadius(com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.IeN()));
                return gradientDrawableLxb;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fLxb = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.IeN());
        drawable.setCornerRadius(fLxb);
        if (fLxb < 1.0f) {
            float fLxb2 = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.nE());
            float fLxb3 = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.xan());
            float fLxb4 = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.hg());
            float fLxb5 = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.CG());
            float[] fArr = new float[8];
            if (fLxb2 > 0.0f) {
                fArr[0] = fLxb2;
                fArr[1] = fLxb2;
            }
            if (fLxb3 > 0.0f) {
                fArr[2] = fLxb3;
                fArr[3] = fLxb3;
            }
            if (fLxb4 > 0.0f) {
                fArr[4] = fLxb4;
                fArr[5] = fLxb4;
            }
            if (fLxb5 > 0.0f) {
                fArr[6] = fLxb5;
                fArr[7] = fLxb5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            iKPU = Color.parseColor(str);
        } else {
            iKPU = this.sLN.KPU();
        }
        drawable.setColor(iKPU);
        if (this.sLN.kqm() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.kqm()), this.sLN.VVE());
            return drawable;
        }
        if (this.sLN.brP() <= 0) {
            return drawable;
        }
        drawable.setStroke(this.sLN.brP(), this.sLN.VVE());
        drawable.setAlpha(50);
        if (!AbstractC5044xl.u(this.NXR, "video-vd")) {
            return drawable;
        }
        setLayerType(1, null);
        return new tD((int) fLxb, this.sLN.brP());
    }

    public LD Lxb(Bitmap bitmap) {
        return new Lxb(bitmap, null);
    }

    private Drawable[] Lxb(List<String> list) {
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
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(strArrSplit[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable gradientDrawableLxb = Lxb(Lxb(strArrSplit[0]), iArr);
                gradientDrawableLxb.setShape(0);
                gradientDrawableLxb.setCornerRadius(com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.IeN()));
                drawableArr[(list.size() - 1) - i] = gradientDrawableLxb;
            }
        }
        return drawableArr;
    }

    public GradientDrawable Lxb(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
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

    public GradientDrawable.Orientation Lxb(String str) {
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

    private void Lxb() {
        if (isShown()) {
            int iLxb = com.bytedance.sdk.component.adexpress.dynamic.LD.Lxb.Lxb(this.sLN);
            if (iLxb == 2) {
                if (this.Sfi == null) {
                    this.Sfi = new com.bytedance.sdk.component.utils.DY(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs.4
                };
                com.bytedance.sdk.component.adexpress.LD.NXR renderRequest = this.STP.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.IeN();
                    renderRequest.Sfi();
                    renderRequest.tD();
                    return;
                }
                return;
            }
            if (iLxb == 3) {
                if (this.Sfi == null) {
                    this.Sfi = new com.bytedance.sdk.component.utils.DY(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs.5
                };
                com.bytedance.sdk.component.adexpress.LD.NXR renderRequest2 = this.STP.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.kqm();
                    renderRequest2.HD();
                    renderRequest2.brP();
                    renderRequest2.DY();
                }
            }
        }
    }
}
