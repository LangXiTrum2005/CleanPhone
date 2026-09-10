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
import android.widget.ImageView;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends JXs {
    private static String DY = "";
    private ImageView HD;
    private Runnable LD;
    private Runnable Lxb;
    private volatile boolean Sfi;
    protected com.bytedance.sdk.component.adexpress.dynamic.lk.QAg tD;

    public static class LD implements com.bytedance.sdk.component.JXs.VVE<Bitmap> {
        private final WeakReference<JXs> LD;
        private final WeakReference<View> Lxb;

        public LD(View view, JXs jXs) {
            this.Lxb = new WeakReference<>(view);
            this.LD = new WeakReference<>(jXs);
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, @Nullable Throwable th) {
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
            Bitmap bitmapLD;
            JXs jXs;
            View view = this.Lxb.get();
            if (view == null || (bitmapLD = jva.LD()) == null || jva.lk() == null || (jXs = this.LD.get()) == null) {
                return;
            }
            view.setBackground(jXs.Lxb(bitmapLD));
        }
    }

    public static class Lxb implements com.bytedance.sdk.component.JXs.VVE<Bitmap> {
        private final WeakReference<DynamicRootView> LD;
        private final WeakReference<View> Lxb;
        private final com.bytedance.sdk.component.adexpress.dynamic.ZU.OY lk;

        public Lxb(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
            this.Lxb = new WeakReference<>(view);
            this.LD = new WeakReference<>(dynamicRootView);
            this.lk = oy;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, @Nullable Throwable th) {
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
            View view = this.Lxb.get();
            if (!com.bytedance.sdk.component.adexpress.ZU.LD()) {
                DynamicRootView dynamicRootView = this.LD.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().ZU()) || "splash_ad".equals(dynamicRootView.getRenderRequest().ZU())) {
                    view.setBackground(new BitmapDrawable(jva.LD()));
                    return;
                } else {
                    view.setBackground(new BitmapDrawable(jva.LD()));
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(new BitmapDrawable(jva.LD()));
            com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = this.lk;
            if (oy == null || oy.nBu() == null || 6 != this.lk.nBu().Lxb() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    public static class lk implements com.bytedance.sdk.component.JXs.OY {
        private final int LD;
        private final WeakReference<Context> Lxb;

        public lk(Context context, int i) {
            this.Lxb = new WeakReference<>(context);
            this.LD = i;
        }

        @Override // com.bytedance.sdk.component.JXs.OY
        public Bitmap Lxb(Bitmap bitmap) {
            Context context = this.Lxb.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.ZU.Lxb.Lxb(context, bitmap, this.LD);
            }
            return null;
        }
    }

    public lc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.Sfi = true;
        setTag(Integer.valueOf(getClickArea()));
        String strLD = oy.nBu().LD();
        if ("logo-union".equals(strLD)) {
            dynamicRootView.setLogoUnionHeight(this.OY - ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, this.sLN.Lxb() + this.sLN.LD())));
        } else if ("scoreCountWithIcon".equals(strLD)) {
            dynamicRootView.setScoreCountWithIcon(this.OY - ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, this.sLN.Lxb() + this.sLN.LD())));
        }
    }

    private String LD(String str) {
        try {
            Map<String, String> mapJVA = this.STP.getRenderRequest().JVA();
            if (mapJVA != null && mapJVA.size() > 0) {
                return mapJVA.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String getBuildModel() {
        try {
            DY = com.bytedance.sdk.component.utils.Sfi.Lxb();
        } catch (Throwable unused) {
            DY = Build.MODEL;
        }
        if (TextUtils.isEmpty(DY)) {
            DY = Build.MODEL;
        }
        return DY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable lk(String str) {
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
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(((String) arrayList.get(i2)).substring(0, 7));
            }
            GradientDrawable gradientDrawableLxb = Lxb(Lxb(string), iArr);
            gradientDrawableLxb.setShape(0);
            gradientDrawableLxb.setCornerRadius(com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.IeN()));
            return gradientDrawableLxb;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean QAg() {
        int iIeN;
        int iVVE;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        View view = this.IeN;
        final View view2 = view;
        if (view == null) {
            view2 = this;
        }
        setContentDescription(this.NXR.Lxb(this.sLN.foI()));
        String strRo = this.sLN.ro();
        String strAH = null;
        String strLxb = (TextUtils.isEmpty(strRo) || (dynamicRootView = this.STP) == null || dynamicRootView.getRenderRequest() == null || this.STP.getRenderRequest().lk() == null || (jSONObjectOptJSONObject = this.STP.getRenderRequest().lk().optJSONObject("creative")) == null) ? null : Lxb(jSONObjectOptJSONObject.opt(strRo));
        if (TextUtils.isEmpty(strLxb)) {
            strLxb = this.sLN.Sfi();
        }
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
        if (lkVarLk != null) {
            iIeN = lkVarLk.IeN();
            iVVE = lkVarLk.VVE();
        } else {
            iIeN = 0;
            iVVE = 0;
        }
        if (this.sLN.DY()) {
            int iTD = this.sLN.tD();
            String str = this.sLN.LD;
            com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().JXs().Lxb(str).Lxb(this.ebl).LD(this.OY).ZU(iIeN).JXs(iVVE).Lxb(LD(str)).lk(2).Lxb(new lk(this.JVA, iTD)).Lxb(new LD(view2, this));
        } else if (!TextUtils.isEmpty(strLxb)) {
            if (!strLxb.startsWith("http:") && !strLxb.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.STP;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strAH = this.STP.getRenderRequest().aH();
                }
                strLxb = com.bytedance.sdk.component.adexpress.dynamic.JXs.QAg.LD(strLxb, strAH);
            }
            com.bytedance.sdk.component.JXs.nBu nbuLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().JXs().Lxb(strLxb).Lxb(this.ebl).LD(this.OY).ZU(iIeN).JXs(iVVE).Lxb(LD(strLxb)).lk(2);
            Lxb(nbuLk);
            if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                nbuLk.Lxb(new Lxb(view2, this.STP, this.NXR));
            } else if ((view2 instanceof FrameLayout) && AbstractC5044xl.u(this.NXR, "vessel")) {
                if (com.bytedance.sdk.component.adexpress.ZU.nBu.LD(strLxb)) {
                    this.HD = new com.bytedance.sdk.component.adexpress.lc.NXR(this.JVA);
                } else {
                    this.HD = new ImageView(this.JVA);
                }
                ((FrameLayout) view2).addView(this.HD, new FrameLayout.LayoutParams(-1, -1));
                nbuLk.lk(3).Lxb(new com.bytedance.sdk.component.JXs.VVE() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc.1
                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(int i, String str2, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(com.bytedance.sdk.component.JXs.JVA jva) {
                        Object objLD = jva.LD();
                        if (objLD instanceof byte[]) {
                            lc lcVar = lc.this;
                            com.bytedance.sdk.component.adexpress.ZU.lc.LD(lc.this.HD, (byte[]) objLD, lcVar.ebl, lcVar.OY);
                        }
                    }
                });
            } else {
                Lxb(nbuLk, view2);
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view2.setBackground(backgroundDrawable);
        }
        if (this.sLN.Ivz() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (lc.this.sLN.nJ() > 0) {
                            lc lcVar = lc.this;
                            Drawable drawableLk = lcVar.lk(lcVar.STP.getBgMaterialCenterCalcColor().get(Integer.valueOf(lc.this.sLN.nJ())));
                            if (drawableLk == null) {
                                lc lcVar2 = lc.this;
                                drawableLk = lcVar2.Lxb(true, lcVar2.STP.getBgMaterialCenterCalcColor().get(Integer.valueOf(lc.this.sLN.nJ())));
                            }
                            if (drawableLk != null) {
                                view2.setBackground(drawableLk);
                                return;
                            }
                            View view3 = view2;
                            lc lcVar3 = lc.this;
                            view3.setBackground(lcVar3.Lxb(true, lcVar3.STP.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.sLN.Ivz() * 1000.0d));
        }
        View view3 = this.IeN;
        if (view3 != null) {
            view3.setPadding((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.lk()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.LD()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.ZU()), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.JVA, this.sLN.Lxb()));
        }
        if (this.VVE || this.sLN.STP() > 0.0d) {
            setShouldInvisible(true);
            view2.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.ebl, this.OY);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.IeN;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        double dDY = this.NXR.nBu().JXs().DY();
        if (dDY < 90.0d && dDY > 0.0d) {
            com.bytedance.sdk.component.utils.ebl.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc.4
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.setVisibility(8);
                }
            }, (long) (dDY * 1000.0d));
        }
        Lxb(this.NXR.nBu().JXs().tD(), view2);
        if (!TextUtils.isEmpty(this.sLN.NDz())) {
            Lxb();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.Lxb);
            removeCallbacks(this.LD);
        } catch (Exception unused) {
        }
    }

    private String Lxb(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return Lxb(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return Lxb((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private void Lxb(com.bytedance.sdk.component.JXs.nBu nbu, final View view) {
        nbu.Lxb(new com.bytedance.sdk.component.JXs.VVE<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc.3
            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(int i, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
                DynamicRootView dynamicRootView = lc.this.STP;
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().ZU()) && !"splash_ad".equals(lc.this.STP.getRenderRequest().ZU())) {
                    view.setBackground(new BitmapDrawable(jva.LD()));
                } else {
                    if (!com.bytedance.sdk.component.adexpress.ZU.LD()) {
                        view.setBackground(new BitmapDrawable(jva.LD()));
                        return;
                    }
                    view.setBackground(new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Lxb(jva.LD(), ((brP) lc.this.STP.getChildAt(0)).Lxb));
                }
            }
        });
    }

    private static void Lxb(com.bytedance.sdk.component.JXs.nBu nbu) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            nbu.Lxb(Bitmap.Config.ARGB_8888);
        }
    }

    private void Lxb(double d, final View view) {
        if (d > 0.0d) {
            com.bytedance.sdk.component.utils.ebl.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc.5
                @Override // java.lang.Runnable
                public void run() {
                    if (lc.this.NXR.nBu().JXs().SlV() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    lc.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof com.bytedance.sdk.component.adexpress.dynamic.lk.QAg) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void Lxb() {
        if (this.Sfi) {
            int iLd = this.sLN.Ld();
            int iJZE = this.sLN.JZE();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc.6
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = lc.this.STP;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        lc lcVar = lc.this;
                        lc lcVar2 = lc.this;
                        lcVar.tD = new com.bytedance.sdk.component.adexpress.dynamic.lk.QAg(lcVar2.JVA, lcVar2, lcVar2.sLN);
                    } else {
                        com.bytedance.sdk.component.adexpress.LD.NXR renderRequest = lc.this.STP.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu nbu = new com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu();
                        nbu.Lxb(renderRequest.IeN());
                        nbu.LD(renderRequest.VVE());
                        nbu.lk(renderRequest.kqm());
                        nbu.Lxb(renderRequest.brP());
                        nbu.LD(renderRequest.tD());
                        nbu.lk(renderRequest.DY());
                        nbu.ZU(renderRequest.Sfi());
                        nbu.JXs(renderRequest.HD());
                        lc lcVar3 = lc.this;
                        lc lcVar4 = lc.this;
                        lcVar3.tD = new com.bytedance.sdk.component.adexpress.dynamic.lk.QAg(lcVar4.JVA, lcVar4, lcVar4.sLN, nbu, renderRequest);
                    }
                    lc lcVar5 = lc.this;
                    lcVar5.LD(lcVar5.tD);
                    if (lc.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) lc.this.getParent()).setClipChildren(false);
                    }
                    lc.this.setClipChildren(false);
                    lc.this.tD.setTag(2);
                    lc lcVar6 = lc.this;
                    lcVar6.Lxb((ViewGroup) lcVar6);
                    lc lcVar7 = lc.this;
                    lcVar7.addView(lcVar7.tD, new FrameLayout.LayoutParams(-1, -1));
                    lc.this.tD.lk();
                }
            };
            this.Lxb = runnable;
            postDelayed(runnable, ((long) iLd) * 1000);
            if (this.sLN.Lpq() || iJZE >= Integer.MAX_VALUE || iLd >= iJZE) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc.7
                @Override // java.lang.Runnable
                public void run() {
                    lc lcVar = lc.this;
                    if (lcVar.tD != null) {
                        lcVar.Sfi = false;
                        lc.this.tD.ZU();
                        lc.this.tD.setVisibility(4);
                        lc lcVar2 = lc.this;
                        lcVar2.removeView(lcVar2.tD);
                    }
                }
            };
            this.LD = runnable2;
            postDelayed(runnable2, ((long) iJZE) * 1000);
        }
    }
}
