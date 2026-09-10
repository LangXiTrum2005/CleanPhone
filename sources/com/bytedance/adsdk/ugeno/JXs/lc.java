package com.bytedance.adsdk.ugeno.JXs;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class lc extends com.bytedance.adsdk.ugeno.LD.Lxb<JXs> {
    private int LD;
    private int Rt;
    private int ZU;
    private int lk;
    private int pyu;

    public static class Lxb extends com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb {
        public int CG;
        public int CSn;
        public float Ivz;
        public int KPU;
        public float foI;
        public int hg;
        public float id;
        public int nE;
        public int xan;

        public Lxb(com.bytedance.adsdk.ugeno.LD.Lxb lxb) {
            super(lxb);
            this.CSn = 1;
            this.id = 0.0f;
            this.foI = 0.0f;
            this.KPU = -1;
            this.Ivz = -1.0f;
            this.nE = -1;
            this.xan = -1;
            this.hg = ViewCompat.MEASURED_SIZE_MASK;
            this.CG = ViewCompat.MEASURED_SIZE_MASK;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x0010  */
        private int JXs(String str) {
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

        private float LD(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float ZU(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float lk(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        public String toString() {
            return "LayoutParams{mWidth=" + this.Lxb + ", mHeight=" + this.LD + ", mMargin=" + this.JXs + ", mMarginLeft=" + this.lc + ", mMarginRight=" + this.ebl + ", mMarginTop=" + this.OY + ", mMarginBottom=" + this.QAg + ", mParams=" + this.eK + ", mOrder=" + this.CSn + ", mFlexGrow=" + this.id + ", mFlexShrink=" + this.foI + ", mAlignSelf=" + this.KPU + ", mFlexBasisPercent=" + this.Ivz + ", mMinWidth=" + this.nE + ", mMinHeight=" + this.xan + ", mMaxWidth=" + this.hg + ", mMaxHeight=" + this.CG + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
        public JXs.Lxb Lxb() {
            JXs.Lxb lxb = new JXs.Lxb((int) this.Lxb, (int) this.LD);
            ((ViewGroup.MarginLayoutParams) lxb).leftMargin = (int) this.lc;
            ((ViewGroup.MarginLayoutParams) lxb).rightMargin = (int) this.ebl;
            ((ViewGroup.MarginLayoutParams) lxb).topMargin = (int) this.OY;
            ((ViewGroup.MarginLayoutParams) lxb).bottomMargin = (int) this.QAg;
            lxb.lk(this.CSn);
            lxb.ZU(this.KPU);
            lxb.Lxb(this.id);
            lxb.LD(this.foI);
            lxb.lk(this.Ivz);
            return lxb;
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        public void Lxb(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.Lxb(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.Ivz = ZU(str2);
                    break;
                case "order":
                    this.CSn = Lxb(str2);
                    break;
                case "flexShrink":
                    this.foI = lk(str2);
                    break;
                case "flexGrow":
                    this.id = LD(str2);
                    break;
                case "alignSelf":
                    this.KPU = JXs(str2);
                    break;
            }
        }

        private int Lxb(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public lc(Context context) {
        super(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private int JVA(String str) {
        byte b;
        switch (str) {
            case "stretch":
                b = 5;
                break;
            case "center":
                b = 2;
                break;
            case "space_around":
                b = 3;
                break;
            case "flex_start":
                b = 0;
                break;
            case "space_between":
                b = 4;
                break;
            case "flex_end":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b != 3) {
            return b != 4 ? 5 : 3;
        }
        return 4;
    }

    private int OY(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int QAg(String str) {
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
    private int nBu(String str) {
        byte b;
        switch (str) {
            case "stretch":
                b = 4;
                break;
            case "baseline":
                b = 3;
                break;
            case "center":
                b = 2;
                break;
            case "flex_start":
                b = 0;
                break;
            case "flex_end":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b != 2) {
            return b != 3 ? 4 : 3;
        }
        return 2;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        ((JXs) this.OY).setFlexDirection(this.LD);
        ((JXs) this.OY).setFlexWrap(this.lk);
        ((JXs) this.OY).setJustifyContent(this.ZU);
        ((JXs) this.OY).setAlignItems(this.Rt);
        ((JXs) this.OY).setAlignContent(this.pyu);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.Lxb(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.Rt = nBu(str2);
                break;
            case "flexDirection":
                this.LD = ebl(str2);
                break;
            case "alignContent":
                this.pyu = JVA(str2);
                break;
            case "flexWrap":
                this.lk = OY(str2);
                break;
            case "justifyContent":
                this.ZU = QAg(str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Of, reason: merged with bridge method [inline-methods] */
    public JXs ZU() {
        JXs jXs = new JXs(this.JXs);
        jXs.Lxb(this);
        return jXs;
    }

    public int ebl(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb
    public com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb lk() {
        return new Lxb(this);
    }
}
