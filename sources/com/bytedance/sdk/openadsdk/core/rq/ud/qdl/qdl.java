package com.bytedance.sdk.openadsdk.core.rq.ud.qdl;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ud.mml;
import com.bytedance.adsdk.ud.to;
import com.bytedance.adsdk.ugeno.mzz;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.adsdk.ugeno.wd.jpc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends lnr<ud> {
    private boolean ca;
    protected HashMap<String, Bitmap> dps;
    private boolean gsp;
    private float hr;
    protected ImageView.ScaleType iw;
    private String kr;
    protected ImageView.ScaleType lme;
    protected String qdl;
    private boolean syy;
    private int tdy;
    private boolean xx;
    private float ygv;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl$1, reason: invalid class name */
    public class AnonymousClass1 implements mml {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.ud.mml
        public Bitmap qdl(final to toVar) {
            final String strQdl;
            if (toVar == null) {
                return null;
            }
            String str = toVar.to();
            String strTvp = toVar.tvp();
            if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(strTvp)) {
                strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(str, ((lnr) qdl.this).mml);
            } else if (!TextUtils.isEmpty(strTvp) && TextUtils.isEmpty(str)) {
                strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(strTvp, ((lnr) qdl.this).mml);
            } else if (TextUtils.isEmpty(strTvp) || TextUtils.isEmpty(str)) {
                strQdl = null;
            } else {
                strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(str, ((lnr) qdl.this).mml) + com.bytedance.adsdk.ugeno.lnr.ud.qdl(strTvp, ((lnr) qdl.this).mml);
            }
            if (TextUtils.isEmpty(strQdl)) {
                return null;
            }
            Bitmap bitmap = qdl.this.dps.get(strQdl);
            if (bitmap != null) {
                return bitmap;
            }
            mzz.qdl().ud().qdl(((lnr) qdl.this).tvp, strQdl, new com.bytedance.adsdk.ugeno.qdl.InterfaceC0066qdl() { // from class: com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl.1.1
                @Override // com.bytedance.adsdk.ugeno.qdl.InterfaceC0066qdl
                public void qdl(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, toVar.qdl(), toVar.ud(), false);
                        qdl.this.dps.put(strQdl, bitmapCreateScaledBitmap);
                        jpc.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((ud) ((lnr) qdl.this).mzz).qdl(toVar.jpc(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return qdl.this.dps.get(strQdl);
        }
    }

    public qdl(Context context) {
        super(context);
        this.kr = "images";
        this.gsp = true;
        this.hr = 1.0f;
        this.iw = ImageView.ScaleType.FIT_CENTER;
        this.lme = ImageView.ScaleType.FIT_XY;
        this.dps = new HashMap<>();
    }

    private ImageView.ScaleType bjy(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private ImageView.ScaleType jtx(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private String rdp(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public ud qdl() {
        ud udVar = new ud(this.ud);
        udVar.qdl(this);
        return udVar;
    }

    public void mml() {
        T t = this.mzz;
        if (t != 0) {
            ((ud) t).qdl();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        ((ud) this.mzz).setProgress(this.ygv);
        if (this.hr <= 0.0f) {
            this.hr = 1.0f;
        }
        ((ud) this.mzz).setSpeed(this.hr);
        if (this.qdl.startsWith("local")) {
            ((ud) this.mzz).setAnimation(rdp(this.qdl));
            ((ud) this.mzz).setImageAssetsFolder(this.kr);
        } else {
            ((ud) this.mzz).setAnimationFromUrl(this.qdl);
        }
        ((ud) this.mzz).setImageAssetDelegate(new AnonymousClass1());
        if (kdv()) {
            ((ud) this.mzz).setScaleType(this.lme);
        } else {
            ((ud) this.mzz).setScaleType(this.iw);
        }
        if (kdv()) {
            ((ud) this.mzz).setRepeatCount(this.tdy);
        } else {
            ((ud) this.mzz).qdl(this.syy);
        }
        if (!kdv()) {
            T t = this.mzz;
            if (t != 0) {
                ((ud) t).qdl();
                return;
            }
            return;
        }
        T t2 = this.mzz;
        if (t2 == 0 || !this.gsp) {
            return;
        }
        ((ud) t2).qdl();
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.lme = jtx(str2);
                break;
            case "scaleType":
                this.iw = bjy(str2);
                break;
            case "progress":
                this.ygv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "imagePath":
                this.kr = str2;
                break;
            case "autoReverse":
                this.xx = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case "src":
                this.qdl = com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(str2);
                break;
            case "loop":
                if (kdv()) {
                    this.tdy = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                    break;
                } else {
                    this.syy = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                    break;
                }
                break;
            case "speed":
                this.hr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case "autoPlay":
                this.ca = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case "autoplay":
                this.gsp = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
        }
    }

    public void qdl(AnimatorListenerAdapter animatorListenerAdapter) {
        ((ud) this.mzz).qdl(animatorListenerAdapter);
    }
}
