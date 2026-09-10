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
import com.applovin.impl.Z;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class mzz extends FrameLayout implements IAnimation, hkc, hzv {
    private float aaj;
    protected View bjy;
    private float exc;
    protected com.bytedance.sdk.component.adexpress.dynamic.mml.jpc exu;
    protected com.bytedance.sdk.component.adexpress.dynamic.mml.wd fs;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.lnr jl;
    protected int jpc;
    protected boolean jtx;
    private com.bytedance.sdk.component.utils.uw jyq;
    protected float lnr;
    protected float mml;
    protected float mo;
    protected float mzz;
    private float qdl;
    protected DynamicRootView rdp;
    protected Context rq;
    protected int to;
    protected int tvp;
    private float ud;
    protected int wd;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud yt;
    private static final View.OnTouchListener oth = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener ljh = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public mzz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context);
        this.rq = context;
        this.rdp = dynamicRootView;
        this.exu = jpcVar;
        this.lnr = jpcVar.mo();
        this.mml = jpcVar.wd();
        this.mzz = jpcVar.jpc();
        this.mo = jpcVar.tvp();
        this.tvp = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.lnr);
        this.to = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.mml);
        this.wd = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.mzz);
        this.jpc = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.mo);
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = new com.bytedance.sdk.component.adexpress.dynamic.mml.wd(jpcVar.to());
        this.fs = wdVar;
        if (wdVar.jl() > 0) {
            this.wd = (this.fs.jl() * 2) + this.wd;
            this.jpc = (this.fs.jl() * 2) + this.jpc;
            this.tvp -= this.fs.jl();
            this.to -= this.fs.jl();
            List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> listRq = jpcVar.rq();
            if (listRq != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2 : listRq) {
                    jpcVar2.lnr(jpcVar2.mo() + com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                    jpcVar2.mml(jpcVar2.wd() + com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                    jpcVar2.qdl(com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                    jpcVar2.ud(com.bytedance.sdk.component.adexpress.mml.wd.ud(this.rq, this.fs.jl()));
                }
            }
        }
        this.jtx = this.fs.rdp() > 0.0d;
        this.jl = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.lnr();
    }

    public Drawable getBackgroundDrawable() {
        return qdl(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.jtx;
    }

    public int getClickArea() {
        return this.fs.bqt();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mo.qdl getDynamicClickListener() {
        return this.rdp.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.jpc;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mml.mo getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.mml.mzz mzzVar;
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        if (jpcVar == null || (mzzVar = jpcVar.to()) == null) {
            return null;
        }
        return mzzVar.mzz();
    }

    public int getDynamicWidth() {
        return this.wd;
    }

    public String getImageObjectFit() {
        return this.fs.zlt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.exc;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(qdl(ud(this.fs.fco().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.aaj;
    }

    public boolean jpc() {
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        return jpcVar == null || jpcVar.to() == null || this.exu.to().mzz() == null || this.exu.to().mzz().kr() == null;
    }

    public boolean lnr() {
        tvp();
        mo();
        mml();
        return true;
    }

    public boolean mml() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.bjy;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (mzz()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = oth;
            onClickListener = ljh;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iQdl = com.bytedance.sdk.component.adexpress.dynamic.ud.qdl.qdl(this.fs);
            if (iQdl == 2 || iQdl == 3) {
                view2.setOnClickListener(ljh);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        qdl(view2);
        ud(view2);
        return true;
    }

    public void mo() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.wd, this.jpc);
        layoutParams.topMargin = this.to;
        int i2 = this.tvp;
        layoutParams.leftMargin = i2;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public boolean mzz() {
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = this.fs;
        return (wdVar == null || wdVar.bqt() == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wd();
        qdl();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ud();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.jl.qdl(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.lnr lnrVar = this.jl;
        View view = this.bjy;
        if (view == null) {
            view = this;
        }
        lnrVar.qdl(view, i2, i3);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
    }

    public void qdl(int i2) {
        com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar = this.fs;
        if (wdVar != null && wdVar.qdl(i2)) {
            tvp();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && (getChildAt(i3) instanceof mzz)) {
                    ((mzz) childAt).qdl(i2);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.exc = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.qdl = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.ud = f;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z2) {
        this.jtx = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.aaj = f;
        this.jl.qdl(this, f);
    }

    public void ud(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz;
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        if (jpcVar == null || (moVarMzz = jpcVar.to().mzz()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(moVarMzz.fge()));
    }

    public void wd() {
        if (jpc()) {
            return;
        }
        View view = this.bjy;
        if (view == null) {
            view = this;
        }
        this.yt = new com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud(view, this.exu.to().mzz().kr());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud udVar = mzz.this.yt;
                if (udVar != null) {
                    udVar.qdl();
                }
            }
        });
    }

    private List<String> ud(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (str.charAt(i4) == '(') {
                i2++;
                z2 = true;
            } else if (str.charAt(i4) == ')' && (i2 = i2 - 1) == 0 && z2) {
                int i5 = i4 + 1;
                arrayList.add(str.substring(i3, i5));
                i3 = i5;
                z2 = false;
            }
        }
        return arrayList;
    }

    public void qdl(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.exu.jpc());
            jSONObject.put("height", this.exu.tvp());
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.aaj, this.fs.mrf());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.jyq, this.exu.to().ud());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.oth, this.exu.lnr());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.ljh, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.fs.mrf());
            view.setTag(2097610715, this.exu.to().ud());
            view.setTag(2097610714, this.exu.lnr());
            view.setTag(2097610713, jSONObject.toString());
            int iQdl = com.bytedance.sdk.component.adexpress.dynamic.ud.qdl.qdl(this.fs);
            if (iQdl == 1) {
                view.setTag(2097610707, new Pair(this.fs.uw(), Long.valueOf(this.fs.xmv())));
                view.setTag(2097610708, Integer.valueOf(iQdl));
            }
        } catch (JSONException unused) {
        }
    }

    public void ud() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.ud udVar = this.yt;
        if (udVar != null) {
            udVar.ud();
        }
    }

    public Drawable qdl(boolean z2, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iKoa;
        if (!TextUtils.isEmpty(this.fs.fco())) {
            try {
                String strFco = this.fs.fco();
                String strSubstring = strFco.substring(strFco.indexOf("(") + 1, strFco.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d > 225.0d && d < 315.0d) {
                        int i2 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i2;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableQdl = qdl(qdl(strArrSplit[0]), iArr);
                gradientDrawableQdl.setShape(0);
                gradientDrawableQdl.setCornerRadius(com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.bjy()));
                return gradientDrawableQdl;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fQdl = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.bjy());
        drawable.setCornerRadius(fQdl);
        if (fQdl < 1.0f) {
            float fQdl2 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.rc());
            float fQdl3 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.kdv());
            float fQdl4 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.ekw());
            float fQdl5 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.hkc());
            float[] fArr = new float[8];
            if (fQdl2 > 0.0f) {
                fArr[0] = fQdl2;
                fArr[1] = fQdl2;
            }
            if (fQdl3 > 0.0f) {
                fArr[2] = fQdl3;
                fArr[3] = fQdl3;
            }
            if (fQdl4 > 0.0f) {
                fArr[4] = fQdl4;
                fArr[5] = fQdl4;
            }
            if (fQdl5 > 0.0f) {
                fArr[6] = fQdl5;
                fArr[7] = fQdl5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z2) {
            iKoa = Color.parseColor(str);
        } else {
            iKoa = this.fs.koa();
        }
        drawable.setColor(iKoa);
        if (this.fs.yt() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.yt()), this.fs.jtx());
        } else if (this.fs.jl() > 0) {
            drawable.setStroke(this.fs.jl(), this.fs.jtx());
            drawable.setAlpha(50);
            if (Z.y(this.exu, "video-vd")) {
                setLayerType(1, null);
                return new exc((int) fQdl, this.fs.jl());
            }
        }
        return drawable;
    }

    public ud qdl(Bitmap bitmap) {
        return new qdl(bitmap, null);
    }

    private Drawable[] qdl(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    iArr[i3] = com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(strArrSplit[i4].substring(0, 7));
                    i3 = i4;
                }
                GradientDrawable gradientDrawableQdl = qdl(qdl(strArrSplit[0]), iArr);
                gradientDrawableQdl.setShape(0);
                gradientDrawableQdl.setCornerRadius(com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.rq, this.fs.bjy()));
                drawableArr[(list.size() - 1) - i2] = gradientDrawableQdl;
            }
        }
        return drawableArr;
    }

    public GradientDrawable qdl(GradientDrawable.Orientation orientation, int[] iArr) {
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

    public GradientDrawable.Orientation qdl(String str) {
        try {
            int i2 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i2 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i2 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i2 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void qdl() {
        if (isShown()) {
            int iQdl = com.bytedance.sdk.component.adexpress.dynamic.ud.qdl.qdl(this.fs);
            if (iQdl == 2) {
                if (this.jyq == null) {
                    this.jyq = new com.bytedance.sdk.component.utils.uw(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.4
                };
                com.bytedance.sdk.component.adexpress.ud.exu renderRequest = this.rdp.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.bjy();
                    renderRequest.jyq();
                    renderRequest.exc();
                    return;
                }
                return;
            }
            if (iQdl == 3) {
                if (this.jyq == null) {
                    this.jyq = new com.bytedance.sdk.component.utils.uw(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz.5
                };
                com.bytedance.sdk.component.adexpress.ud.exu renderRequest2 = this.rdp.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.yt();
                    renderRequest2.oth();
                    renderRequest2.jl();
                    renderRequest2.aaj();
                }
            }
        }
    }
}
