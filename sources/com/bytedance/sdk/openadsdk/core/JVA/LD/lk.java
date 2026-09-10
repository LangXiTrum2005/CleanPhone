package com.bytedance.sdk.openadsdk.core.JVA.LD;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends com.bytedance.adsdk.ugeno.LD.lk<com.bytedance.sdk.openadsdk.core.widget.JXs> {
    protected ImageView.ScaleType LD;
    protected String Lxb;

    public lk(Context context) {
        super(context);
        this.LD = ImageView.ScaleType.FIT_CENTER;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private ImageView.ScaleType ebl(String str) {
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

    private void lk() {
        if (TextUtils.isEmpty(this.Lxb)) {
            return;
        }
        if (!this.Lxb.startsWith("local://")) {
            com.bytedance.adsdk.ugeno.ZU.Lxb().LD().Lxb(this.sLN, this.Lxb, (ImageView) this.OY);
        } else {
            ((com.bytedance.sdk.openadsdk.core.widget.JXs) this.OY).Lxb(com.bytedance.adsdk.ugeno.ebl.ZU.Lxb(this.JXs, this.Lxb.replace("local://", "")), false);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        lk();
        ((com.bytedance.sdk.openadsdk.core.widget.JXs) this.OY).setScaleType(this.LD);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.core.widget.JXs ZU() {
        com.bytedance.sdk.openadsdk.core.widget.JXs jXs = new com.bytedance.sdk.openadsdk.core.widget.JXs(this.JXs);
        this.OY = jXs;
        return jXs;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("scaleType")) {
            this.LD = ebl(str2);
        } else if (str.equals("src")) {
            this.Lxb = str2;
        }
    }
}
