package com.bytedance.adsdk.ugeno.QAg.LD;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class LD extends com.bytedance.adsdk.ugeno.LD.Lxb<com.bytedance.adsdk.ugeno.QAg.LD.Lxb> {
    private com.bytedance.adsdk.ugeno.QAg.LD.Lxb LD;

    public static class Lxb extends com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb {
        protected int CSn;

        public Lxb(com.bytedance.adsdk.ugeno.LD.Lxb lxb) {
            super(lxb);
            this.CSn = -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:4:0x000e  */
        private int LD(String str) {
            str.getClass();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams Lxb() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.Lxb, (int) this.LD);
            layoutParams.leftMargin = (int) this.lc;
            layoutParams.rightMargin = (int) this.ebl;
            layoutParams.topMargin = (int) this.OY;
            layoutParams.bottomMargin = (int) this.QAg;
            layoutParams.gravity = this.CSn;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        public void Lxb(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.Lxb(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.CSn = Lxb(str2);
            }
        }

        private int Lxb(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iLD = 0;
            for (String str2 : strArrSplit) {
                iLD |= LD(str2);
            }
            return iLD;
        }
    }

    public LD(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        this.LD.setEventMap(this.iC);
        super.LD();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Of, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.QAg.LD.Lxb ZU() {
        com.bytedance.adsdk.ugeno.QAg.LD.Lxb lxb = new com.bytedance.adsdk.ugeno.QAg.LD.Lxb(this.JXs);
        this.LD = lxb;
        lxb.Lxb(this);
        return this.LD;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb
    public com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb lk() {
        return new Lxb(this);
    }
}
