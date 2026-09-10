package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import dumb.dern;
import dumb.saneness;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends di {
    private String ri;

    public static class lr implements com.bytedance.sdk.component.fi.slm {
        private Resources lr;
        private WeakReference<View> ri;

        public lr(View view, Resources resources) {
            this.ri = new WeakReference<>(view);
            this.lr = resources;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
            Object objLr;
            View view = this.ri.get();
            if (view == null || (objLr = sfVar.lr()) == null || sfVar.ik() == null) {
                return;
            }
            if (objLr instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.lr, (Bitmap) objLr));
            } else if (objLr instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(objLr)) {
                    dern.attabal(objLr).start();
                }
                view.setBackground((Drawable) objLr);
            }
        }
    }

    public static class ri implements com.bytedance.sdk.component.fi.mj {
        private final WeakReference<Context> ri;

        public ri(Context context) {
            this.ri = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.fi.mj
        public Bitmap ri(Bitmap bitmap) {
            Context context = this.ri.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.ka.ri.ri(context, bitmap, 25);
            }
            return null;
        }
    }

    public sf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        if (!TextUtils.isEmpty(this.f18035co.pc()) && mjVar.tan()) {
            com.bytedance.sdk.component.adexpress.di.qt qtVar = new com.bytedance.sdk.component.adexpress.di.qt(context);
            qtVar.setAnimationsLoop(this.f18035co.ajz());
            qtVar.setImageLottieTosPath(this.f18035co.pc());
            qtVar.setLottieAppNameMaxLength(this.f18035co.ud());
            qtVar.setLottieAdTitleMaxLength(this.f18035co.luy());
            qtVar.setLottieAdDescMaxLength(this.f18035co.zk());
            qtVar.setData(mjVar.ac());
            this.vr = qtVar;
        } else if (this.f18035co.vr() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.sdk.component.adexpress.di.ay ayVar = new com.bytedance.sdk.component.adexpress.di.ay(context);
            this.vr = ayVar;
            ayVar.setXRound((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, this.f18035co.vr()));
            ((com.bytedance.sdk.component.adexpress.di.ay) this.vr).setYRound((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, this.f18035co.vr()));
        } else if (mj() || !"arrowButton".equals(mjVar.qt().lr())) {
            this.vr = new ImageView(context);
        } else {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.lr lrVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.lr(context);
            lrVar.setBrickNativeValue(this.f18035co);
            this.vr = lrVar;
        }
        this.ri = getImageKey();
        this.vr.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(mjVar.qt().lr())) {
            if (this.f18035co.lr() > 0 || this.f18035co.ri() > 0) {
                int iMin = Math.min(this.xha, this.mj);
                this.xha = iMin;
                this.mj = Math.min(iMin, this.mj);
                this.jbs = (int) (this.jbs + com.bytedance.sdk.component.adexpress.ka.xha.ri(context, this.f18035co.lr() + (this.f18035co.ri() / 2) + 0.5f));
            } else {
                int iMax = Math.max(this.xha, this.mj);
                this.xha = iMax;
                this.mj = Math.max(iMax, this.mj);
            }
            this.f18035co.ri(this.xha / 2);
        }
        addView(this.vr, new FrameLayout.LayoutParams(this.xha, this.mj));
    }

    private String getImageKey() {
        Map<String, String> mapSf = this.bgr.getRenderRequest().sf();
        if (mapSf == null || mapSf.size() <= 0) {
            return null;
        }
        return mapSf.get(this.f18035co.sf());
    }

    private boolean ri() {
        String strCo = this.f18035co.co();
        if (this.f18035co.ac()) {
            return true;
        }
        if (TextUtils.isEmpty(strCo)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strCo);
            return Math.abs((((float) this.xha) / (((float) this.mj) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        int iBu;
        super.jbs();
        if (!TextUtils.isEmpty(this.f18035co.pc())) {
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iSlm = 0;
        if ("arrowButton".equals(this.aw.qt().lr())) {
            ((ImageView) this.vr).setImageResource(com.bytedance.sdk.component.utils.uq.ka(this.sf, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.vr).getDrawable() != null) {
                ((ImageView) this.vr).getDrawable().setAutoMirrored(true);
            }
            this.vr.setPadding(0, 0, 0, 0);
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.vr.setBackgroundColor(this.f18035co.zf());
        String strIk = this.aw.qt().ik();
        if ("user".equals(strIk)) {
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.vr).setColorFilter(this.f18035co.xha());
            ((ImageView) this.vr).setImageDrawable(com.bytedance.sdk.component.utils.uq.ik(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.vr;
            int i = this.xha;
            imageView.setPadding(i / 10, this.mj / 5, i / 10, 0);
        } else if (strIk != null && strIk.startsWith("@")) {
            try {
                ((ImageView) this.vr).setImageResource(Integer.parseInt(strIk.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.fi.vr vrVarFi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().fi();
        String strSf = this.f18035co.sf();
        if (!TextUtils.isEmpty(strSf) && !strSf.startsWith("http:") && !strSf.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.bgr;
            strSf = com.bytedance.sdk.component.adexpress.dynamic.fi.jbs.lr(strSf, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.bgr.getRenderRequest().ay());
        }
        com.bytedance.sdk.component.adexpress.ri.ri.ik ikVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik();
        if (ikVarIk != null) {
            iSlm = ikVarIk.slm();
            iBu = ikVarIk.bu();
        } else {
            iBu = 0;
        }
        com.bytedance.sdk.component.fi.qt qtVarFi = vrVarFi.ri(strSf).ri(this.ri).ri(this.xha).lr(this.mj).ka(iSlm).fi(iBu);
        String strBgr = this.bgr.getRenderRequest().bgr();
        if (!TextUtils.isEmpty(strBgr)) {
            qtVarFi.lr(strBgr);
        }
        if (ri()) {
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.FIT_CENTER);
            qtVarFi.ri(Bitmap.Config.ARGB_4444).ik(2).ri(new ri(this.sf)).ri(new lr(this.vr, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                qtVarFi.ik(1).ri((ImageView) this.vr);
            }
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.vr instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.vr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.vr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !saneness.attabal(drawable)) {
            return;
        }
        dern.attabal(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.vr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !saneness.attabal(drawable)) {
            return;
        }
        dern.attabal(drawable).stop();
    }
}
