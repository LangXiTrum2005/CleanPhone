package com.bytedance.sdk.openadsdk.lc;

import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.lk;
import com.umeng.analytics.pro.f;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static volatile Lxb Lxb;
    private int IeN;
    private boolean JVA;
    private int[] JXs;
    private boolean LD;
    private boolean NXR;
    private int[] OY;
    private int[] QAg;
    private boolean STP;
    private boolean VVE;
    private boolean ZU;
    private int[] ebl;
    private boolean kqm;
    private int[] lc;
    private boolean lk;
    private boolean nBu;
    private int[] sLN;

    private Lxb() {
        LD();
    }

    public boolean IeN() {
        return this.JVA;
    }

    public int[] JVA() {
        return this.ebl;
    }

    public int[] NXR() {
        return this.QAg;
    }

    public boolean STP() {
        return this.nBu;
    }

    public int[] VVE() {
        return this.sLN;
    }

    public boolean brP() {
        return this.kqm;
    }

    public boolean kqm() {
        return this.NXR;
    }

    public int[] nBu() {
        return this.lc;
    }

    public int[] sLN() {
        return this.OY;
    }

    public boolean OY() {
        return this.ZU;
    }

    public int[] QAg() {
        return this.JXs;
    }

    public boolean ebl() {
        return this.lk;
    }

    public boolean JXs() {
        return this.VVE;
    }

    public int ZU() {
        return this.IeN;
    }

    public boolean lc() {
        return this.LD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] lk(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int i2 = Integer.parseInt(str);
                iArr[i] = i2;
                if (i2 > 0) {
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public void LD() {
        STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lc.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                Lxb.this.STP = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("feature_switch", false);
                if (Lxb.this.STP) {
                    try {
                        Lxb.this.kqm = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("exclude_banner_native", false);
                        Lxb.this.IeN = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("feature_timer_interval", 10000);
                        Lxb.this.VVE = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("pag_dislike_cnt", "1,3,5session").split(",");
                        Lxb lxb = Lxb.this;
                        lxb.LD = lxb.Lxb(strArrSplit);
                        Lxb lxb2 = Lxb.this;
                        lxb2.lk = lxb2.Lxb(strArrSplit2);
                        Lxb lxb3 = Lxb.this;
                        lxb3.ZU = lxb3.Lxb(strArrSplit3);
                        Lxb lxb4 = Lxb.this;
                        lxb4.JXs = lxb4.LD(strArrSplit);
                        Lxb lxb5 = Lxb.this;
                        lxb5.lc = lxb5.LD(strArrSplit2);
                        Lxb lxb6 = Lxb.this;
                        lxb6.ebl = lxb6.LD(strArrSplit3);
                        Lxb lxb7 = Lxb.this;
                        lxb7.sLN = lxb7.lk(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("pag_video_stay_time", "1,3,5&session").split("&");
                        Lxb lxb8 = Lxb.this;
                        lxb8.nBu = lxb8.Lxb(strArrSplit5);
                        Lxb lxb9 = Lxb.this;
                        lxb9.JVA = lxb9.Lxb(strArrSplit6);
                        Lxb lxb10 = Lxb.this;
                        lxb10.OY = lxb10.LD(strArrSplit5);
                        Lxb lxb11 = Lxb.this;
                        lxb11.QAg = lxb11.LD(strArrSplit6);
                        Lxb.this.NXR = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] LD(String[] strArr) {
        if (strArr.length > 0) {
            return lk(strArr[0].split(","));
        }
        return new int[0];
    }

    public static Lxb Lxb() {
        if (Lxb == null) {
            synchronized (lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new Lxb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public boolean lk() {
        return this.STP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(String[] strArr) {
        if (strArr.length == 2) {
            return f.aC.equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return f.aC.equals(strArr[0]);
        }
        return false;
    }
}
