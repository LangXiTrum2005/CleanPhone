package com.bytedance.adsdk.ugeno.fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class di extends com.bytedance.adsdk.ugeno.lr.ri<fi> {
    private int akr;
    private int de;
    private int xlq;
    private int zv;
    private int zxp;

    public static class ri extends com.bytedance.adsdk.ugeno.lr.ri.C0193ri {
        public int dw;
        public int dzy;
        public int hcw;
        public float igq;
        public int oh;
        public float ory;
        public int su;
        public int xd;
        public float zf;

        public ri(com.bytedance.adsdk.ugeno.lr.ri riVar) {
            super(riVar);
            this.su = 1;
            this.igq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.zf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.dw = -1;
            this.ory = -1.0f;
            this.hcw = -1;
            this.oh = -1;
            this.xd = 16777215;
            this.dzy = 16777215;
        }

        private int fi(String str) {
            str.getClass();
            switch (str) {
                case "stretch":
                    return 4;
                case "baseline":
                    return 3;
                case "center":
                    return 2;
                case "flex_start":
                    return 0;
                case "flex_end":
                    return 1;
                default:
                    return -1;
            }
        }

        private float ik(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        private float ka(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float lr(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        public String toString() {
            return "LayoutParams{mWidth=" + this.ri + ", mHeight=" + this.lr + ", mMargin=" + this.fi + ", mMarginLeft=" + this.di + ", mMarginRight=" + this.xha + ", mMarginTop=" + this.mj + ", mMarginBottom=" + this.jbs + ", mParams=" + this.ay + ", mOrder=" + this.su + ", mFlexGrow=" + this.igq + ", mFlexShrink=" + this.zf + ", mAlignSelf=" + this.dw + ", mFlexBasisPercent=" + this.ory + ", mMinWidth=" + this.hcw + ", mMinHeight=" + this.oh + ", mMaxWidth=" + this.xd + ", mMaxHeight=" + this.dzy + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public fi.ri ri() {
            fi.ri riVar = new fi.ri((int) this.ri, (int) this.lr);
            ((ViewGroup.MarginLayoutParams) riVar).leftMargin = (int) this.di;
            ((ViewGroup.MarginLayoutParams) riVar).rightMargin = (int) this.xha;
            ((ViewGroup.MarginLayoutParams) riVar).topMargin = (int) this.mj;
            ((ViewGroup.MarginLayoutParams) riVar).bottomMargin = (int) this.jbs;
            riVar.ik(this.su);
            riVar.ka(this.dw);
            riVar.ri(this.igq);
            riVar.lr(this.zf);
            riVar.ik(this.ory);
            return riVar;
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        public void ri(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ri(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.ory = ka(str2);
                    break;
                case "order":
                    this.su = ri(str2);
                    break;
                case "flexShrink":
                    this.zf = ik(str2);
                    break;
                case "flexGrow":
                    this.igq = lr(str2);
                    break;
                case "alignSelf":
                    this.dw = fi(str2);
                    break;
            }
        }

        private int ri(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public di(Context context) {
        super(context);
    }

    private int bgr(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int bu(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 5;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 5;
            case -932331738:
                return str.equals("space_around") ? 4 : 5;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 5;
            case 1682480591:
                return str.equals("space_between") ? 3 : 5;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 5;
            default:
                return 5;
        }
    }

    private int slm(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 4;
            case -1720785339:
                return str.equals("baseline") ? 3 : 4;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 4;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 4;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 4;
            default:
                return 4;
        }
    }

    private int vr(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    public int aw(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public fi ri() {
        fi fiVar = new fi(this.lr);
        fiVar.ri(this);
        return fiVar;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        ((fi) this.fi).setFlexDirection(this.akr);
        ((fi) this.fi).setFlexWrap(this.de);
        ((fi) this.fi).setJustifyContent(this.zv);
        ((fi) this.fi).setAlignItems(this.xlq);
        ((fi) this.fi).setAlignContent(this.zxp);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public com.bytedance.adsdk.ugeno.lr.ri.C0193ri qt() {
        return new ri(this);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.ri(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.xlq = slm(str2);
                break;
            case "flexDirection":
                this.akr = aw(str2);
                break;
            case "alignContent":
                this.zxp = bu(str2);
                break;
            case "flexWrap":
                this.de = bgr(str2);
                break;
            case "justifyContent":
                this.zv = vr(str2);
                break;
        }
    }
}
