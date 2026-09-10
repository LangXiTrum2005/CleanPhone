package com.bytedance.adsdk.lk;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.LD.ZU;
import com.bytedance.adsdk.LD.lc;
import com.bytedance.adsdk.LD.nBu;
import com.bytedance.adsdk.ugeno.LD.lk;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.bytedance.adsdk.ugeno.lk.LD;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends lk<lc> {
    private float Iyd;
    protected HashMap<String, Bitmap> LD;
    protected String Lxb;
    private String Rt;
    private boolean SlV;
    protected ImageView.ScaleType ZU;
    private int chu;
    protected ImageView.ScaleType lk;

    @Deprecated
    private boolean mb;
    private float owi;
    private boolean pyu;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lk.Lxb$1, reason: invalid class name */
    public class AnonymousClass1 implements ZU {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.LD.ZU
        public Bitmap Lxb(final nBu nbu) {
            final String strLxb;
            if (nbu == null) {
                return null;
            }
            String strNBu = nbu.nBu();
            String strQAg = nbu.QAg();
            if (!TextUtils.isEmpty(strNBu) && TextUtils.isEmpty(strQAg)) {
                strLxb = LD.Lxb(strNBu, ((lk) Lxb.this).ebl);
            } else if (!TextUtils.isEmpty(strQAg) && TextUtils.isEmpty(strNBu)) {
                strLxb = LD.Lxb(strQAg, ((lk) Lxb.this).ebl);
            } else if (TextUtils.isEmpty(strQAg) || TextUtils.isEmpty(strNBu)) {
                strLxb = null;
            } else {
                strLxb = LD.Lxb(strNBu, ((lk) Lxb.this).ebl) + LD.Lxb(strQAg, ((lk) Lxb.this).ebl);
            }
            if (TextUtils.isEmpty(strLxb)) {
                return null;
            }
            Bitmap bitmap = Lxb.this.LD.get(strLxb);
            if (bitmap != null) {
                return bitmap;
            }
            com.bytedance.adsdk.ugeno.ZU.Lxb().LD().Lxb(((lk) Lxb.this).sLN, strLxb, new com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb() { // from class: com.bytedance.adsdk.lk.Lxb.1.1
                @Override // com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb
                public void Lxb(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, nbu.Lxb(), nbu.LD(), false);
                        Lxb.this.LD.put(strLxb, bitmapCreateScaledBitmap);
                        OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.lk.Lxb.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((lc) ((lk) Lxb.this).OY).Lxb(nbu.OY(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return Lxb.this.LD.get(strLxb);
        }
    }

    public Lxb(Context context) {
        super(context);
        this.Rt = "images";
        this.owi = 1.0f;
        this.lk = ImageView.ScaleType.FIT_CENTER;
        this.ZU = ImageView.ScaleType.FIT_XY;
        this.LD = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private ImageView.ScaleType OY(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    b = 0;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    b = 1;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    b = 2;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    b = 3;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    b = 4;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    b = 5;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    b = 6;
                }
                break;
        }
        switch (b) {
            case 0:
                return ImageView.ScaleType.CENTER;
            case 1:
                return ImageView.ScaleType.FIT_END;
            case 2:
                return ImageView.ScaleType.FIT_START;
            case 3:
                return ImageView.ScaleType.CENTER_INSIDE;
            case 4:
            default:
                return scaleType;
            case 5:
                return ImageView.ScaleType.FIT_CENTER;
            case 6:
                return ImageView.ScaleType.CENTER_CROP;
        }
    }

    private ImageView.ScaleType QAg(String str) {
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
            case "fill":
            default:
                return scaleType;
        }
    }

    private String ebl(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        ((lc) this.OY).setProgress(this.Iyd);
        if (this.owi <= 0.0f) {
            this.owi = 1.0f;
        }
        ((lc) this.OY).setSpeed(this.owi);
        if (this.Lxb.startsWith("local")) {
            ((lc) this.OY).setAnimation(ebl(this.Lxb));
            ((lc) this.OY).setImageAssetsFolder(this.Rt);
        } else {
            ((lc) this.OY).setAnimationFromUrl(this.Lxb);
        }
        ((lc) this.OY).setImageAssetDelegate(new AnonymousClass1());
        if (KPU()) {
            ((lc) this.OY).setScaleType(this.ZU);
        } else {
            ((lc) this.OY).setScaleType(this.lk);
        }
        if (KPU()) {
            ((lc) this.OY).setRepeatCount(this.chu);
        } else {
            ((lc) this.OY).Lxb(this.mb);
        }
        lk();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public lc ZU() {
        lc lcVar = new lc(this.JXs);
        lcVar.Lxb(this);
        return lcVar;
    }

    public void lk() {
        ((lc) this.OY).Lxb();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.Lxb(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.ZU = QAg(str2);
                break;
            case "scaleType":
                this.lk = OY(str2);
                break;
            case "progress":
                this.Iyd = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case "imagePath":
                this.Rt = str2;
                break;
            case "autoReverse":
                this.pyu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, false);
                break;
            case "src":
                this.Lxb = str2;
                break;
            case "loop":
                if (KPU()) {
                    this.chu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0);
                    break;
                } else {
                    this.mb = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, false);
                    break;
                }
                break;
            case "speed":
                this.owi = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 1.0f);
                break;
            case "autoPlay":
                this.SlV = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, false);
                break;
            case "autoplay":
                this.SlV = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, true);
                break;
        }
    }
}
