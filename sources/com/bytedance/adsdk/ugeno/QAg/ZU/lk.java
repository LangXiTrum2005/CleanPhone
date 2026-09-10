package com.bytedance.adsdk.ugeno.QAg.ZU;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.ZU;
import com.bytedance.adsdk.ugeno.ebl.OY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3745j0;

/* JADX INFO: loaded from: classes.dex */
public class lk extends com.bytedance.adsdk.ugeno.LD.lk<Lxb> {
    protected ImageView.ScaleType LD;
    protected String Lxb;
    private float Rt;
    private int ZU;
    protected boolean lk;
    private float pyu;

    public lk(Context context) {
        super(context);
        this.LD = ImageView.ScaleType.FIT_XY;
        this.ZU = -1;
        this.Rt = -1.0f;
        this.pyu = -1.0f;
    }

    private void Of() {
        if (this.Rt > 0.0f) {
            ZU.Lxb().LD().Lxb(this.sLN, this.Lxb, new com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb() { // from class: com.bytedance.adsdk.ugeno.QAg.ZU.lk.1
                @Override // com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb
                public void Lxb(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapLxb = OY.Lxb(((com.bytedance.adsdk.ugeno.LD.lk) lk.this).JXs, bitmap, (int) lk.this.Rt);
                    if (bitmapLxb != null) {
                        OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.ugeno.QAg.ZU.lk.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((Lxb) ((com.bytedance.adsdk.ugeno.LD.lk) lk.this).OY).setImageBitmap(bitmapLxb);
                            }
                        });
                    }
                    lk lkVar = lk.this;
                    if (lkVar.lk || lkVar.pyu > 0.0f) {
                        Bitmap bitmapLxb2 = OY.Lxb(((com.bytedance.adsdk.ugeno.LD.lk) lk.this).JXs, bitmap, lk.this.pyu > 0.0f ? (int) lk.this.pyu : 10);
                        if (bitmapLxb2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.LD.lk) lk.this).JXs.getResources(), bitmapLxb2);
                            OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.ugeno.QAg.ZU.lk.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((Lxb) ((com.bytedance.adsdk.ugeno.LD.lk) lk.this).OY).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.Lxb lxbLD = ZU.Lxb().LD();
        com.bytedance.adsdk.ugeno.core.OY oy = this.sLN;
        String str = this.Lxb;
        T t = this.OY;
        lxbLD.Lxb(oy, str, (ImageView) t, ((Lxb) t).getWidth(), ((Lxb) this.OY).getHeight());
        if (this.lk || this.pyu > 0.0f) {
            ZU.Lxb().LD().Lxb(this.sLN, this.Lxb, new com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb() { // from class: com.bytedance.adsdk.ugeno.QAg.ZU.lk.2
                @Override // com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb
                public void Lxb(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapLxb = OY.Lxb(((com.bytedance.adsdk.ugeno.LD.lk) lk.this).JXs, bitmap, lk.this.pyu > 0.0f ? (int) lk.this.pyu : 10);
                    OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.ugeno.QAg.ZU.lk.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapLxb != null) {
                                ((Lxb) ((com.bytedance.adsdk.ugeno.LD.lk) lk.this).OY).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.LD.lk) lk.this).JXs.getResources(), bitmapLxb));
                            }
                        }
                    });
                }
            });
        }
    }

    private ImageView.ScaleType ebl(String str) {
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
            case "fill":
            case "fitXY":
            default:
                return scaleType;
        }
    }

    private void lk() {
        if (TextUtils.isEmpty(this.Lxb)) {
            return;
        }
        ((Lxb) this.OY).setImageDrawable(null);
        if (this.Lxb.startsWith("local://")) {
            try {
                ((Lxb) this.OY).setImageResource(com.bytedance.adsdk.ugeno.ebl.ZU.Lxb(this.JXs, this.Lxb.replace("local://", "")));
            } catch (Throwable unused) {
            }
        } else {
            if (!this.Lxb.startsWith("@")) {
                Of();
                return;
            }
            try {
                ((Lxb) this.OY).setImageResource(Integer.parseInt(this.Lxb.substring(1)));
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        lk();
        ((Lxb) this.OY).setScaleType(this.LD);
        ((Lxb) this.OY).setBorderColor(this.wbY);
        ((Lxb) this.OY).setCornerRadius(this.Of);
        ((Lxb) this.OY).setBorderWidth(this.LXE);
        int i = this.ZU;
        if (i != -1) {
            ((Lxb) this.OY).setColorFilter(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public Lxb ZU() {
        Lxb lxb = new Lxb(this.JXs);
        lxb.Lxb(this);
        return lxb;
    }

    public void OY(String str) {
        this.Lxb = str;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk, com.bytedance.adsdk.ugeno.lk
    public void OY() {
        super.OY();
        Drawable drawable = ((Lxb) this.OY).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !AbstractC3745j0.q(drawable)) {
            return;
        }
        AbstractC3745j0.c(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.Lxb(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.LD = ebl(str2);
                break;
            case "imageBlur":
                this.Rt = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.lk = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, false);
                break;
            case "src":
                this.Lxb = str2;
                break;
            case "tintColor":
                this.ZU = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                break;
            case "imageBgBlur":
                this.pyu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, -1.0f);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk, com.bytedance.adsdk.ugeno.lk
    public void ebl() {
        super.ebl();
        ((Lxb) this.OY).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.QAg.ZU.lk.3
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((Lxb) ((com.bytedance.adsdk.ugeno.LD.lk) lk.this).OY).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !AbstractC3745j0.q(drawable)) {
                    return;
                }
                AbstractC3745j0.c(drawable).start();
            }
        });
    }
}
