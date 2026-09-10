package com.bytedance.adsdk.ugeno.mzz;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class mo extends com.bytedance.adsdk.ugeno.ud.qdl<mzz> {
    private int dps;
    private int iw;
    private int kr;
    private int lme;
    private int xx;

    public static class qdl extends com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl {
        public float bqt;
        public int ekw;
        public int hkc;
        public int hzv;
        public int kdv;
        public float koa;
        public float rc;
        public int vu;
        public int xmv;

        public qdl(com.bytedance.adsdk.ugeno.ud.qdl qdlVar) {
            super(qdlVar);
            this.xmv = 1;
            this.bqt = 0.0f;
            this.koa = 0.0f;
            this.vu = -1;
            this.rc = -1.0f;
            this.kdv = -1;
            this.ekw = -1;
            this.hkc = 16777215;
            this.hzv = 16777215;
        }

        private float lnr(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float mml(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private int mzz(String str) {
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

        private float ud(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl
        public String toString() {
            return "LayoutParams{mWidth=" + this.qdl + ", mHeight=" + this.ud + ", mMargin=" + this.mzz + ", mMarginLeft=" + this.mo + ", mMarginRight=" + this.wd + ", mMarginTop=" + this.jpc + ", mMarginBottom=" + this.tvp + ", mParams=" + this.bch + ", mOrder=" + this.xmv + ", mFlexGrow=" + this.bqt + ", mFlexShrink=" + this.koa + ", mAlignSelf=" + this.vu + ", mFlexBasisPercent=" + this.rc + ", mMinWidth=" + this.kdv + ", mMinHeight=" + this.ekw + ", mMaxWidth=" + this.hkc + ", mMaxHeight=" + this.hzv + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl
        public void qdl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.qdl(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.rc = mml(str2);
                    break;
                case "order":
                    this.xmv = qdl(str2);
                    break;
                case "flexShrink":
                    this.koa = lnr(str2);
                    break;
                case "flexGrow":
                    this.bqt = ud(str2);
                    break;
                case "alignSelf":
                    this.vu = mzz(str2);
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public mzz.qdl qdl() {
            mzz.qdl qdlVar = new mzz.qdl((int) this.qdl, (int) this.ud);
            ((ViewGroup.MarginLayoutParams) qdlVar).leftMargin = (int) this.mo;
            ((ViewGroup.MarginLayoutParams) qdlVar).rightMargin = (int) this.wd;
            ((ViewGroup.MarginLayoutParams) qdlVar).topMargin = (int) this.jpc;
            ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin = (int) this.tvp;
            qdlVar.lnr(this.xmv);
            qdlVar.mml(this.vu);
            qdlVar.qdl(this.bqt);
            qdlVar.ud(this.koa);
            qdlVar.lnr(this.rc);
            return qdlVar;
        }

        private int qdl(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public mo(Context context) {
        super(context);
    }

    private int bjy(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private int jl(String str) {
        byte b2;
        switch (str) {
            case "stretch":
                b2 = 5;
                break;
            case "center":
                b2 = 2;
                break;
            case "space_around":
                b2 = 3;
                break;
            case "flex_start":
                b2 = 0;
                break;
            case "space_between":
                b2 = 4;
                break;
            case "flex_end":
                b2 = 1;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            return 2;
        }
        if (b2 != 3) {
            return b2 != 4 ? 5 : 3;
        }
        return 4;
    }

    private int jtx(String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    private int yt(String str) {
        byte b2;
        switch (str) {
            case "stretch":
                b2 = 4;
                break;
            case "baseline":
                b2 = 3;
                break;
            case "center":
                b2 = 2;
                break;
            case "flex_start":
                b2 = 0;
                break;
            case "flex_end":
                b2 = 1;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 != 2) {
            return b2 != 3 ? 4 : 3;
        }
        return 2;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public mzz qdl() {
        mzz mzzVar = new mzz(this.ud);
        mzzVar.qdl(this);
        return mzzVar;
    }

    public int rdp(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl to() {
        return new qdl(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        ((mzz) this.mzz).setFlexDirection(this.dps);
        ((mzz) this.mzz).setFlexWrap(this.iw);
        ((mzz) this.mzz).setJustifyContent(this.lme);
        ((mzz) this.mzz).setAlignItems(this.kr);
        ((mzz) this.mzz).setAlignContent(this.xx);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.kr = yt(str2);
                break;
            case "flexDirection":
                this.dps = rdp(str2);
                break;
            case "alignContent":
                this.xx = jl(str2);
                break;
            case "flexWrap":
                this.iw = bjy(str2);
                break;
            case "justifyContent":
                this.lme = jtx(str2);
                break;
        }
    }
}
