package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import dumb.dern;
import dumb.saneness;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends fi {
    private static String ac = "";
    private volatile boolean ihz;
    private Runnable lr;
    private Runnable ri;
    protected com.bytedance.sdk.component.adexpress.dynamic.ik.jbs tan;

    public static class ik implements com.bytedance.sdk.component.fi.mj {
        private final int lr;
        private final WeakReference<Context> ri;

        public ik(Context context, int i) {
            this.ri = new WeakReference<>(context);
            this.lr = i;
        }

        @Override // com.bytedance.sdk.component.fi.mj
        public Bitmap ri(Bitmap bitmap) {
            Context context = this.ri.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.ka.ri.ri(context, bitmap, this.lr);
            }
            return null;
        }
    }

    public static class lr implements com.bytedance.sdk.component.fi.slm {
        private final WeakReference<fi> lr;
        private final WeakReference<View> ri;

        public lr(View view, fi fiVar) {
            this.ri = new WeakReference<>(view);
            this.lr = new WeakReference<>(fiVar);
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
            Object objLr;
            fi fiVar;
            View view = this.ri.get();
            if (view == null || (objLr = sfVar.lr()) == null || sfVar.ik() == null || (fiVar = this.lr.get()) == null || !(objLr instanceof Bitmap)) {
                return;
            }
            view.setBackground(fiVar.ri((Bitmap) objLr));
        }
    }

    public static class ri implements com.bytedance.sdk.component.fi.slm {
        private final com.bytedance.sdk.component.adexpress.dynamic.ka.mj ik;
        private final WeakReference<DynamicRootView> lr;
        private final WeakReference<View> ri;

        public ri(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
            this.ri = new WeakReference<>(view);
            this.lr = new WeakReference<>(dynamicRootView);
            this.ik = mjVar;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
            Drawable bitmapDrawable;
            View view = this.ri.get();
            Object objLr = sfVar.lr();
            if (objLr instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objLr);
            } else if (objLr instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(objLr)) {
                    dern.attabal(objLr).start();
                }
                bitmapDrawable = (Drawable) objLr;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
                DynamicRootView dynamicRootView = this.lr.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().ka()) || "splash_ad".equals(dynamicRootView.getRenderRequest().ka())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(bitmapDrawable);
            com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = this.ik;
            if (mjVar == null || mjVar.qt() == null || 6 != this.ik.qt().ri() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    public di(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.ihz = true;
        setTag(Integer.valueOf(getClickArea()));
        String strLr = mjVar.qt().lr();
        if ("logo-union".equals(strLr)) {
            dynamicRootView.setLogoUnionHeight(this.mj - ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, this.f18035co.lr() + this.f18035co.ri())));
        } else if ("scoreCountWithIcon".equals(strLr)) {
            dynamicRootView.setScoreCountWithIcon(this.mj - ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, this.f18035co.lr() + this.f18035co.ri())));
        }
    }

    private static String getBuildModel() {
        try {
            ac = com.bytedance.sdk.component.utils.fr.ri();
        } catch (Throwable unused) {
            ac = Build.MODEL;
        }
        if (TextUtils.isEmpty(ac)) {
            ac = Build.MODEL;
        }
        return ac;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable ik(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    string = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(((String) arrayList.get(i2)).substring(0, 7));
            }
            GradientDrawable gradientDrawableRi = ri(ri(string), iArr);
            gradientDrawableRi.setShape(0);
            gradientDrawableRi.setCornerRadius(com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.vr()));
            return gradientDrawableRi;
        } catch (Throwable unused) {
            return null;
        }
    }

    private String lr(String str) {
        try {
            Map<String, String> mapSf = this.bgr.getRenderRequest().sf();
            if (mapSf != null && mapSf.size() > 0) {
                return mapSf.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.xha, this.mj);
    }

    public boolean jbs() {
        int iSlm;
        int iBu;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.vr;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.aw.ri(this.f18035co.igq()));
        String strQmx = this.f18035co.qmx();
        String strAy = null;
        String strRi = (TextUtils.isEmpty(strQmx) || (dynamicRootView = this.bgr) == null || dynamicRootView.getRenderRequest() == null || this.bgr.getRenderRequest().ik() == null || (jSONObjectOptJSONObject = this.bgr.getRenderRequest().ik().optJSONObject("creative")) == null) ? null : ri(jSONObjectOptJSONObject.opt(strQmx));
        if (TextUtils.isEmpty(strRi)) {
            strRi = this.f18035co.ihz();
        }
        com.bytedance.sdk.component.adexpress.ri.ri.ik ikVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik();
        if (ikVarIk != null) {
            iSlm = ikVarIk.slm();
            iBu = ikVarIk.bu();
        } else {
            iSlm = 0;
            iBu = 0;
        }
        if (this.f18035co.ac()) {
            int iTan = this.f18035co.tan();
            String str = this.f18035co.lr;
            com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().fi().ri(str).ri(this.xha).lr(this.mj).ka(iSlm).fi(iBu).ri(lr(str)).ik(2).ri(new ik(this.sf, iTan)).ri(new lr(view, this));
        } else if (!TextUtils.isEmpty(strRi)) {
            if (!strRi.startsWith("http:") && !strRi.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.bgr;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strAy = this.bgr.getRenderRequest().ay();
                }
                strRi = com.bytedance.sdk.component.adexpress.dynamic.fi.jbs.lr(strRi, strAy);
            }
            com.bytedance.sdk.component.fi.qt qtVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().fi().ri(strRi).ri(this.xha).lr(this.mj).ka(iSlm).fi(iBu).ri(lr(strRi)).ik(1);
            ri(qtVarIk);
            qtVarIk.ri(new ri(view, this.bgr, this.aw));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f18035co.dw() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (di.this.f18035co.dzy() > 0) {
                            di diVar = di.this;
                            Drawable drawableIk = diVar.ik(diVar.bgr.getBgMaterialCenterCalcColor().get(Integer.valueOf(di.this.f18035co.dzy())));
                            if (drawableIk == null) {
                                di diVar2 = di.this;
                                drawableIk = diVar2.ri(true, diVar2.bgr.getBgMaterialCenterCalcColor().get(Integer.valueOf(di.this.f18035co.dzy())));
                            }
                            if (drawableIk != null) {
                                view.setBackground(drawableIk);
                                return;
                            }
                            View view2 = view;
                            di diVar3 = di.this;
                            view2.setBackground(diVar3.ri(true, diVar3.bgr.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.f18035co.dw() * 1000.0d));
        }
        View view2 = this.vr;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.ik()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.lr()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.ka()), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.sf, this.f18035co.ri()));
        }
        if (this.slm || this.f18035co.bgr() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.vr;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        double dAc = this.aw.qt().fi().ac();
        if (dAc < 90.0d && dAc > 0.0d) {
            com.bytedance.sdk.component.utils.jbs.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.2
                @Override // java.lang.Runnable
                public void run() {
                    di.this.setVisibility(8);
                }
            }, (long) (dAc * 1000.0d));
        }
        ri(this.aw.qt().fi().tan(), view2);
        if (!TextUtils.isEmpty(this.f18035co.kt())) {
            ri();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.ri);
            removeCallbacks(this.lr);
        } catch (Exception unused) {
        }
    }

    private String ri(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return ri(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return ri((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private static void ri(com.bytedance.sdk.component.fi.qt qtVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            qtVar.ri(Bitmap.Config.ARGB_8888);
        }
    }

    private void ri(double d, final View view) {
        if (d > 0.0d) {
            com.bytedance.sdk.component.utils.jbs.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.3
                @Override // java.lang.Runnable
                public void run() {
                    if (di.this.aw.qt().fi().xlq() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    di.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof com.bytedance.sdk.component.adexpress.dynamic.ik.jbs) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void ri() {
        if (this.ihz) {
            int iTa = this.f18035co.ta();
            int iBnj = this.f18035co.bnj();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = di.this.bgr;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        di diVar = di.this;
                        di diVar2 = di.this;
                        diVar.tan = new com.bytedance.sdk.component.adexpress.dynamic.ik.jbs(diVar2.sf, diVar2, diVar2.f18035co);
                    } else {
                        com.bytedance.sdk.component.adexpress.lr.aw renderRequest = di.this.bgr.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.ka.qt qtVar = new com.bytedance.sdk.component.adexpress.dynamic.ka.qt();
                        qtVar.ri(renderRequest.vr());
                        qtVar.lr(renderRequest.slm());
                        qtVar.ik(renderRequest.bu());
                        qtVar.ri(renderRequest.nr());
                        qtVar.lr(renderRequest.tan());
                        qtVar.ik(renderRequest.ac());
                        qtVar.ka(renderRequest.ihz());
                        qtVar.fi(renderRequest.uq());
                        di diVar3 = di.this;
                        di diVar4 = di.this;
                        diVar3.tan = new com.bytedance.sdk.component.adexpress.dynamic.ik.jbs(diVar4.sf, diVar4, diVar4.f18035co, qtVar, renderRequest);
                    }
                    di diVar5 = di.this;
                    diVar5.lr(diVar5.tan);
                    if (di.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) di.this.getParent()).setClipChildren(false);
                    }
                    di.this.setClipChildren(false);
                    di.this.tan.setTag(2);
                    di diVar6 = di.this;
                    diVar6.ri((ViewGroup) diVar6);
                    di diVar7 = di.this;
                    diVar7.addView(diVar7.tan, new FrameLayout.LayoutParams(-1, -1));
                    di.this.tan.ik();
                }
            };
            this.ri = runnable;
            postDelayed(runnable, ((long) iTa) * 1000);
            if (this.f18035co.siy() || iBnj >= Integer.MAX_VALUE || iTa >= iBnj) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.5
                @Override // java.lang.Runnable
                public void run() {
                    di diVar = di.this;
                    if (diVar.tan != null) {
                        diVar.ihz = false;
                        di.this.tan.ka();
                        di.this.tan.setVisibility(4);
                        di diVar2 = di.this;
                        diVar2.removeView(diVar2.tan);
                    }
                }
            };
            this.lr = runnable2;
            postDelayed(runnable2, ((long) iBnj) * 1000);
        }
    }
}
