package com.bytedance.sdk.openadsdk.core.co.lr.lr;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.lr.ka;
import com.bytedance.adsdk.lr.qt;
import com.bytedance.adsdk.ugeno.fi;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ik<lr> {
    private boolean adz;
    protected HashMap<String, Bitmap> akr;
    protected ImageView.ScaleType de;
    private boolean eu;
    private float evm;
    private float ezp;
    private boolean jm;
    protected String ri;
    private int tpb;
    private String xlq;
    protected ImageView.ScaleType zv;
    private boolean zxp;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.lr.ri$1, reason: invalid class name */
    public class AnonymousClass1 implements ka {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.lr.ka
        public Bitmap ri(final qt qtVar) {
            final String strRi;
            if (qtVar == null) {
                return null;
            }
            String strQt = qtVar.qt();
            String strJbs = qtVar.jbs();
            if (!TextUtils.isEmpty(strQt) && TextUtils.isEmpty(strJbs)) {
                strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(strQt, ((ik) ri.this).ka);
            } else if (!TextUtils.isEmpty(strJbs) && TextUtils.isEmpty(strQt)) {
                strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(strJbs, ((ik) ri.this).ka);
            } else if (TextUtils.isEmpty(strJbs) || TextUtils.isEmpty(strQt)) {
                strRi = null;
            } else {
                strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(strQt, ((ik) ri.this).ka) + com.bytedance.adsdk.ugeno.ik.lr.ri(strJbs, ((ik) ri.this).ka);
            }
            if (TextUtils.isEmpty(strRi)) {
                return null;
            }
            Bitmap bitmap = ri.this.akr.get(strRi);
            if (bitmap != null) {
                return bitmap;
            }
            fi.ri().lr().ri(((ik) ri.this).jbs, strRi, new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.lr.ri.1.1
                @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
                public void ri(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, qtVar.ri(), qtVar.lr(), false);
                        ri.this.akr.put(strRi, bitmapCreateScaledBitmap);
                        mj.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.lr.ri.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((lr) ((ik) ri.this).fi).ri(qtVar.mj(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return ri.this.akr.get(strRi);
        }
    }

    public ri(Context context) {
        super(context);
        this.xlq = "images";
        this.adz = true;
        this.evm = 1.0f;
        this.de = ImageView.ScaleType.FIT_CENTER;
        this.zv = ImageView.ScaleType.FIT_XY;
        this.akr = new HashMap<>();
    }

    private String aw(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    private ImageView.ScaleType bgr(String str) {
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

    private ImageView.ScaleType vr(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public lr ri() {
        lr lrVar = new lr(this.lr);
        lrVar.ri(this);
        return lrVar;
    }

    public void ka() {
        T t = this.fi;
        if (t != 0) {
            ((lr) t).ri();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        ((lr) this.fi).setProgress(this.ezp);
        if (this.evm <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.evm = 1.0f;
        }
        ((lr) this.fi).setSpeed(this.evm);
        if (this.ri.startsWith("local")) {
            ((lr) this.fi).setAnimation(aw(this.ri));
            ((lr) this.fi).setImageAssetsFolder(this.xlq);
        } else {
            ((lr) this.fi).setAnimationFromUrl(this.ri);
        }
        ((lr) this.fi).setImageAssetDelegate(new AnonymousClass1());
        if (hcw()) {
            ((lr) this.fi).setScaleType(this.zv);
        } else {
            ((lr) this.fi).setScaleType(this.de);
        }
        if (hcw()) {
            ((lr) this.fi).setRepeatCount(this.tpb);
        } else {
            ((lr) this.fi).ri(this.eu);
        }
        if (!hcw()) {
            T t = this.fi;
            if (t != 0) {
                ((lr) t).ri();
                return;
            }
            return;
        }
        T t2 = this.fi;
        if (t2 == 0 || !this.adz) {
            return;
        }
        ((lr) t2).ri();
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.ri(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.zv = vr(str2);
                break;
            case "scaleType":
                this.de = bgr(str2);
                break;
            case "progress":
                this.ezp = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "imagePath":
                this.xlq = str2;
                break;
            case "autoReverse":
                this.zxp = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, false);
                break;
            case "src":
                this.ri = com.bytedance.sdk.openadsdk.core.co.ka.ri(str2);
                break;
            case "loop":
                if (hcw()) {
                    this.tpb = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0);
                    break;
                } else {
                    this.eu = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, false);
                    break;
                }
                break;
            case "speed":
                this.evm = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f);
                break;
            case "autoPlay":
                this.jm = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, false);
                break;
            case "autoplay":
                this.adz = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
        }
    }

    public void ri(AnimatorListenerAdapter animatorListenerAdapter) {
        ((lr) this.fi).ri(animatorListenerAdapter);
    }
}
