package com.bytedance.adsdk.ugeno.jbs.ka;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.di;
import com.bytedance.adsdk.ugeno.core.sf;
import com.bytedance.adsdk.ugeno.fi;
import com.bytedance.adsdk.ugeno.xha.ka;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;
import dumb.dern;
import dumb.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.adsdk.ugeno.lr.ik<ri> {
    protected ImageView.ScaleType akr;
    protected boolean de;
    private float eu;
    protected String ri;
    private int xlq;
    protected String zv;
    private float zxp;

    public ik(Context context) {
        super(context);
        this.akr = ImageView.ScaleType.FIT_XY;
        this.xlq = -1;
        this.zxp = -1.0f;
        this.eu = -1.0f;
    }

    private ImageView.ScaleType aw(String str) {
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
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void jbs() {
        if (TextUtils.isEmpty(this.ri)) {
            return;
        }
        ((ri) this.fi).setImageDrawable(null);
        if (!this.ri.startsWith("local://")) {
            if (!this.ri.startsWith("@")) {
                qt();
                return;
            } else {
                ((ri) this.fi).setImageResource(Integer.parseInt(this.ri.substring(1)));
                return;
            }
        }
        try {
            String strReplace = this.ri.replace("local://", "");
            if (TextUtils.equals(ik(), "raw")) {
                ((ri) this.fi).setImageResource(ka.ri(this.lr, strReplace));
            } else {
                ((ri) this.fi).setImageResource(ka.lr(this.lr, strReplace));
            }
        } catch (Exception unused) {
        }
    }

    private void qt() {
        if (this.zxp > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fi.ri().lr().ri(this.jbs, this.ri, new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.1
                @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
                public void ri(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu != null) {
                            di unused = ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu != null) {
                        di unused2 = ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu;
                    }
                    final Bitmap bitmapRi = mj.ri(((com.bytedance.adsdk.ugeno.lr.ik) ik.this).lr, bitmap, (int) ik.this.zxp);
                    if (bitmapRi != null) {
                        mj.ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((ri) ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).fi).setImageBitmap(bitmapRi);
                            }
                        });
                    }
                    ik ikVar = ik.this;
                    if (ikVar.de || ikVar.eu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        Bitmap bitmapRi2 = mj.ri(((com.bytedance.adsdk.ugeno.lr.ik) ik.this).lr, bitmap, ik.this.eu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) ik.this.eu : 10);
                        if (bitmapRi2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.lr.ik) ik.this).lr.getResources(), bitmapRi2);
                            mj.ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((ri) ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).fi).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.ri riVarLr = fi.ri().lr();
        sf sfVar = this.jbs;
        String str = this.ri;
        T t = this.fi;
        riVarLr.ri(sfVar, str, (ImageView) t, ((ri) t).getWidth(), ((ri) this.fi).getHeight(), new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.2
            @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
            public void ri(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu != null) {
                        di unused = ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu;
                    }
                } else if (((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu != null) {
                    di unused2 = ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).pu;
                }
            }
        });
        if (this.de || this.eu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fi.ri().lr().ri(this.jbs, this.ri, new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.3
                @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
                public void ri(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapRi = mj.ri(((com.bytedance.adsdk.ugeno.lr.ik) ik.this).lr, bitmap, ik.this.eu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) ik.this.eu : 10);
                    mj.ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapRi != null) {
                                ((ri) ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).fi).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.lr.ik) ik.this).lr.getResources(), bitmapRi));
                            }
                        }
                    });
                }
            });
        }
    }

    public void bgr(String str) {
        this.ri = str;
    }

    public String ik() {
        return this.zv;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public ri ri() {
        ri riVar = new ri(this.lr);
        riVar.ri(this);
        return riVar;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        jbs();
        ((ri) this.fi).setScaleType(this.akr);
        ((ri) this.fi).setBorderColor(this.gcp);
        ((ri) this.fi).setCornerRadius(this.zyn);
        ((ri) this.fi).setBorderWidth(this.qh);
        int i = this.xlq;
        if (i != -1) {
            ((ri) this.fi).setColorFilter(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik, com.bytedance.adsdk.ugeno.ka
    public void mj() {
        super.mj();
        Drawable drawable = ((ri) this.fi).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !saneness.attabal(drawable)) {
            return;
        }
        dern.attabal(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik, com.bytedance.adsdk.ugeno.ka
    public void xha() {
        super.xha();
        ((ri) this.fi).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((ri) ((com.bytedance.adsdk.ugeno.lr.ik) ik.this).fi).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !saneness.attabal(drawable)) {
                    return;
                }
                dern.attabal(drawable).start();
            }
        });
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
            case "scaleType":
                this.akr = aw(str2);
                break;
            case "imageBlur":
                this.zxp = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.de = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, false);
                break;
            case "src":
                this.ri = str2;
                break;
            case "tintColor":
                this.xlq = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case "imageBgBlur":
                this.eu = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, -1.0f);
                break;
        }
    }
}
