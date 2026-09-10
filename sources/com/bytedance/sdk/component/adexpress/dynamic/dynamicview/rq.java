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
import com.bumptech.glide.load.resource.bitmap.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rq extends mo {
    private String qdl;

    public static class qdl implements com.bytedance.sdk.component.mzz.jpc {
        private final WeakReference<Context> qdl;

        public qdl(Context context) {
            this.qdl = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.mzz.jpc
        public Bitmap qdl(Bitmap bitmap) {
            Context context = this.qdl.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.mml.qdl.qdl(context, bitmap, 25);
            }
            return null;
        }
    }

    public static class ud implements com.bytedance.sdk.component.mzz.jtx {
        private WeakReference<View> qdl;
        private Resources ud;

        public ud(View view, Resources resources) {
            this.qdl = new WeakReference<>(view);
            this.ud = resources;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(int i2, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
            Object objUd;
            View view = this.qdl.get();
            if (view == null || (objUd = rqVar.ud()) == null || rqVar.lnr() == null) {
                return;
            }
            if (objUd instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.ud, (Bitmap) objUd));
            } else if (objUd instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.w(objUd)) {
                    a.l(objUd).start();
                }
                view.setBackground((Drawable) objUd);
            }
        }
    }

    public rq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        if (!TextUtils.isEmpty(this.fs.nz()) && jpcVar.exc()) {
            com.bytedance.sdk.component.adexpress.mo.to toVar = new com.bytedance.sdk.component.adexpress.mo.to(context);
            toVar.setAnimationsLoop(this.fs.kab());
            toVar.setImageLottieTosPath(this.fs.nz());
            toVar.setLottieAppNameMaxLength(this.fs.tqd());
            toVar.setLottieAdTitleMaxLength(this.fs.qk());
            toVar.setLottieAdDescMaxLength(this.fs.ra());
            toVar.setData(jpcVar.aaj());
            this.bjy = toVar;
        } else if (this.fs.bjy() > 0.0f) {
            com.bytedance.sdk.component.adexpress.mo.uw uwVar = new com.bytedance.sdk.component.adexpress.mo.uw(context);
            this.bjy = uwVar;
            uwVar.setXRound((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, this.fs.bjy()));
            ((com.bytedance.sdk.component.adexpress.mo.uw) this.bjy).setYRound((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, this.fs.bjy()));
        } else if (!jpc() && "arrowButton".equals(jpcVar.to().ud())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.ud udVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ud(context);
            udVar.setBrickNativeValue(this.fs);
            this.bjy = udVar;
        } else if (com.bytedance.sdk.component.adexpress.mml.tvp.ud(this.fs.rq())) {
            this.bjy = new com.bytedance.sdk.component.adexpress.mo.exu(context);
        } else {
            this.bjy = new ImageView(context);
        }
        this.qdl = getImageKey();
        this.bjy.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(jpcVar.to().ud())) {
            if (this.fs.ud() > 0 || this.fs.qdl() > 0) {
                int iMin = Math.min(this.wd, this.jpc);
                this.wd = iMin;
                this.jpc = Math.min(iMin, this.jpc);
                this.tvp = (int) (com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, (this.fs.qdl() / 2) + this.fs.ud() + 0.5f) + this.tvp);
            } else {
                int iMax = Math.max(this.wd, this.jpc);
                this.wd = iMax;
                this.jpc = Math.max(iMax, this.jpc);
            }
            this.fs.qdl(this.wd / 2);
        }
        addView(this.bjy, new FrameLayout.LayoutParams(this.wd, this.jpc));
    }

    private String getImageKey() {
        Map<String, String> mapRq = this.rdp.getRenderRequest().rq();
        if (mapRq == null || mapRq.size() <= 0) {
            return null;
        }
        return mapRq.get(this.fs.rq());
    }

    private boolean qdl() {
        String strFs = this.fs.fs();
        if (this.fs.aaj()) {
            return true;
        }
        if (TextUtils.isEmpty(strFs)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strFs);
            return Math.abs((((float) this.wd) / (((float) this.jpc) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.bjy).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.v(drawable)) {
            return;
        }
        a.k(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.bjy).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.v(drawable)) {
            return;
        }
        a.k(drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        int iJtx;
        super.tvp();
        if (!TextUtils.isEmpty(this.fs.nz())) {
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iBjy = 0;
        if ("arrowButton".equals(this.exu.to().ud())) {
            ((ImageView) this.bjy).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(this.rq, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.bjy).getDrawable() != null) {
                ((ImageView) this.bjy).getDrawable().setAutoMirrored(true);
            }
            this.bjy.setPadding(0, 0, 0, 0);
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.bjy.setBackgroundColor(this.fs.koa());
        String strLnr = this.exu.to().lnr();
        if ("user".equals(strLnr)) {
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.bjy).setColorFilter(this.fs.wd());
            ((ImageView) this.bjy).setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.bjy;
            int i2 = this.wd;
            imageView.setPadding(i2 / 10, this.jpc / 5, i2 / 10, 0);
        } else if (strLnr != null && strLnr.startsWith("@")) {
            try {
                ((ImageView) this.bjy).setImageResource(Integer.parseInt(strLnr.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.mzz.bjy bjyVarMzz = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mzz();
        String strRq = this.fs.rq();
        if (!TextUtils.isEmpty(strRq) && !strRq.startsWith("http:") && !strRq.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.rdp;
            strRq = com.bytedance.sdk.component.adexpress.dynamic.mzz.tvp.ud(strRq, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.rdp.getRenderRequest().bch());
        }
        com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
        if (lnrVarLnr != null) {
            iBjy = lnrVarLnr.bjy();
            iJtx = lnrVarLnr.jtx();
        } else {
            iJtx = 0;
        }
        com.bytedance.sdk.component.mzz.to toVarMzz = bjyVarMzz.qdl(strRq).qdl(this.qdl).qdl(this.wd).ud(this.jpc).mml(iBjy).mzz(iJtx);
        String strRdp = this.rdp.getRenderRequest().rdp();
        if (!TextUtils.isEmpty(strRdp)) {
            toVarMzz.ud(strRdp);
        }
        if (qdl()) {
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.FIT_CENTER);
            toVarMzz.qdl(Bitmap.Config.ARGB_4444).lnr(2).qdl(new qdl(this.rq)).qdl(new ud(this.bjy, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                toVarMzz.lnr(1).qdl((ImageView) this.bjy);
            }
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.bjy instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.bjy).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }
}
