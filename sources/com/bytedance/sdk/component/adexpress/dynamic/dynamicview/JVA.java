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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.umeng.analytics.pro.ay;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3745j0;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends lc {
    private String Lxb;

    public static class LD implements com.bytedance.sdk.component.JXs.VVE<Bitmap> {
        private Resources LD;
        private WeakReference<View> Lxb;

        public LD(View view, Resources resources) {
            this.Lxb = new WeakReference<>(view);
            this.LD = resources;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, @Nullable Throwable th) {
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
            Bitmap bitmapLD;
            View view = this.Lxb.get();
            if (view == null || (bitmapLD = jva.LD()) == null || jva.lk() == null) {
                return;
            }
            view.setBackground(new BitmapDrawable(this.LD, bitmapLD));
        }
    }

    public static class Lxb implements com.bytedance.sdk.component.JXs.OY {
        private final WeakReference<Context> Lxb;

        public Lxb(Context context) {
            this.Lxb = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.JXs.OY
        public Bitmap Lxb(Bitmap bitmap) {
            Context context = this.Lxb.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.ZU.Lxb.Lxb(context, bitmap, 25);
            }
            return null;
        }
    }

    public JVA(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        if (!TextUtils.isEmpty(this.sLN.MGT()) && oy.tD()) {
            com.bytedance.sdk.component.adexpress.lc.nBu nbu = new com.bytedance.sdk.component.adexpress.lc.nBu(context);
            nbu.setAnimationsLoop(this.sLN.nTb());
            nbu.setImageLottieTosPath(this.sLN.MGT());
            nbu.setLottieAppNameMaxLength(this.sLN.Wi());
            nbu.setLottieAdTitleMaxLength(this.sLN.FGm());
            nbu.setLottieAdDescMaxLength(this.sLN.Lv());
            nbu.setData(oy.DY());
            this.IeN = nbu;
        } else if (this.sLN.IeN() > 0.0f) {
            com.bytedance.sdk.component.adexpress.lc.CSn cSn = new com.bytedance.sdk.component.adexpress.lc.CSn(context);
            this.IeN = cSn;
            cSn.setXRound((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, this.sLN.IeN()));
            ((com.bytedance.sdk.component.adexpress.lc.CSn) this.IeN).setYRound((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, this.sLN.IeN()));
        } else if (!OY() && "arrowButton".equals(oy.nBu().LD())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.LD ld = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.LD(context);
            ld.setBrickNativeValue(this.sLN);
            this.IeN = ld;
        } else if (com.bytedance.sdk.component.adexpress.ZU.nBu.LD(this.sLN.JVA())) {
            this.IeN = new com.bytedance.sdk.component.adexpress.lc.NXR(context);
        } else {
            this.IeN = new ImageView(context);
        }
        this.Lxb = getImageKey();
        this.IeN.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(oy.nBu().LD())) {
            if (this.sLN.LD() > 0 || this.sLN.Lxb() > 0) {
                int iMin = Math.min(this.ebl, this.OY);
                this.ebl = iMin;
                this.OY = Math.min(iMin, this.OY);
                this.QAg = (int) (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, (this.sLN.Lxb() / 2) + this.sLN.LD() + 0.5f) + this.QAg);
            } else {
                int iMax = Math.max(this.ebl, this.OY);
                this.ebl = iMax;
                this.OY = Math.max(iMax, this.OY);
            }
            this.sLN.Lxb(this.ebl / 2);
        }
        addView(this.IeN, new FrameLayout.LayoutParams(this.ebl, this.OY));
    }

    private boolean Lxb() {
        String strSLN = this.sLN.sLN();
        if (this.sLN.DY()) {
            return true;
        }
        if (TextUtils.isEmpty(strSLN)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strSLN);
            return Math.abs((((float) this.ebl) / (((float) this.OY) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> mapJVA = this.STP.getRenderRequest().JVA();
        if (mapJVA == null || mapJVA.size() <= 0) {
            return null;
        }
        return mapJVA.get(this.sLN.JVA());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        int iVVE;
        super.QAg();
        if (!TextUtils.isEmpty(this.sLN.MGT())) {
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iIeN = 0;
        if ("arrowButton".equals(this.NXR.nBu().LD())) {
            ((ImageView) this.IeN).setImageResource(com.bytedance.sdk.component.utils.tD.ZU(this.JVA, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.IeN).getDrawable() != null) {
                ((ImageView) this.IeN).getDrawable().setAutoMirrored(true);
            }
            this.IeN.setPadding(0, 0, 0, 0);
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.IeN.setBackgroundColor(this.sLN.KPU());
        String strLk = this.NXR.nBu().lk();
        if (ay.m.equals(strLk)) {
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.IeN).setColorFilter(this.sLN.ebl());
            ((ImageView) this.IeN).setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.IeN;
            int i = this.ebl;
            imageView.setPadding(i / 10, this.OY / 5, i / 10, 0);
        } else if (strLk != null && strLk.startsWith("@")) {
            try {
                ((ImageView) this.IeN).setImageResource(Integer.parseInt(strLk.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.JXs.IeN ieNJXs = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().JXs();
        String strJVA = this.sLN.JVA();
        if (!TextUtils.isEmpty(strJVA) && !strJVA.startsWith("http:") && !strJVA.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.STP;
            strJVA = com.bytedance.sdk.component.adexpress.dynamic.JXs.QAg.LD(strJVA, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.STP.getRenderRequest().aH());
        }
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
        if (lkVarLk != null) {
            iIeN = lkVarLk.IeN();
            iVVE = lkVarLk.VVE();
        } else {
            iVVE = 0;
        }
        com.bytedance.sdk.component.JXs.nBu nbuJXs = ieNJXs.Lxb(strJVA).Lxb(this.Lxb).Lxb(this.ebl).LD(this.OY).ZU(iIeN).JXs(iVVE);
        String strSTP = this.STP.getRenderRequest().STP();
        if (!TextUtils.isEmpty(strSTP)) {
            nbuJXs.LD(strSTP);
        }
        if (Lxb()) {
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.FIT_CENTER);
            nbuJXs.Lxb(Bitmap.Config.ARGB_4444).lk(2).Lxb(new Lxb(this.JVA)).Lxb(new LD(this.IeN, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                nbuJXs.Lxb((ImageView) this.IeN);
            }
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.IeN instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.IeN).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (!com.bytedance.sdk.component.adexpress.ZU.LD()) {
            Lxb(nbuJXs);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.IeN).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !AbstractC3745j0.q(drawable)) {
            return;
        }
        AbstractC3745j0.c(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.IeN).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !AbstractC3745j0.q(drawable)) {
            return;
        }
        AbstractC3745j0.c(drawable).stop();
    }

    private void Lxb(com.bytedance.sdk.component.JXs.nBu nbu) {
        nbu.lk(3).Lxb(new com.bytedance.sdk.component.JXs.VVE() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JVA.1
            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(com.bytedance.sdk.component.JXs.JVA jva) {
                Object objLD = jva.LD();
                if (objLD instanceof byte[]) {
                    JVA jva2 = JVA.this;
                    View view = jva2.IeN;
                    if (view instanceof ImageView) {
                        com.bytedance.sdk.component.adexpress.ZU.lc.LD((ImageView) view, (byte[]) objLD, jva2.ebl, jva2.OY);
                    }
                }
            }
        });
    }
}
