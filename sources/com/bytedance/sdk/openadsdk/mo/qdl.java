package com.bytedance.sdk.openadsdk.mo;

import com.bytedance.sdk.openadsdk.core.lnr;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static volatile qdl qdl;
    private int bjy;
    private boolean exu;
    private int[] fs;
    private int[] jpc;
    private boolean jtx;
    private boolean lnr;
    private boolean mml;
    private int[] mo;
    private int[] mzz;
    private boolean rdp;
    private boolean rq;
    private boolean to;
    private int[] tvp;
    private boolean ud;
    private int[] wd;
    private boolean yt;

    private qdl() {
        ud();
    }

    public boolean bjy() {
        return this.rq;
    }

    public int[] exu() {
        return this.tvp;
    }

    public int[] fs() {
        return this.jpc;
    }

    public boolean jl() {
        return this.yt;
    }

    public int[] jtx() {
        return this.fs;
    }

    public boolean rdp() {
        return this.to;
    }

    public int[] rq() {
        return this.wd;
    }

    public int[] to() {
        return this.mo;
    }

    public boolean yt() {
        return this.exu;
    }

    public boolean jpc() {
        return this.mml;
    }

    public int[] tvp() {
        return this.mzz;
    }

    public boolean wd() {
        return this.lnr;
    }

    public int mml() {
        return this.bjy;
    }

    public boolean mo() {
        return this.ud;
    }

    public boolean mzz() {
        return this.jtx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] lnr(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i2 = 0;
        for (String str : strArr) {
            try {
                int i3 = Integer.parseInt(str);
                iArr[i2] = i3;
                if (i3 > 0) {
                    i2++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i2 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return iArr2;
    }

    public void ud() {
        rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mo.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                qdl.this.rdp = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("feature_switch", false);
                if (qdl.this.rdp) {
                    try {
                        qdl.this.yt = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("exclude_banner_native", false);
                        qdl.this.bjy = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("feature_timer_interval", 10000);
                        qdl.this.jtx = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pag_ad_show_cnt", "1,3,5&session").split(d9.i.f24749c);
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pag_ad_click_cnt", "1,3,5&session").split(d9.i.f24749c);
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pag_video_play_cnt", "1,3,5&session").split(d9.i.f24749c);
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pag_dislike_cnt", "1,3,5session").split(",");
                        qdl qdlVar = qdl.this;
                        qdlVar.ud = qdlVar.qdl(strArrSplit);
                        qdl qdlVar2 = qdl.this;
                        qdlVar2.lnr = qdlVar2.qdl(strArrSplit2);
                        qdl qdlVar3 = qdl.this;
                        qdlVar3.mml = qdlVar3.qdl(strArrSplit3);
                        qdl qdlVar4 = qdl.this;
                        qdlVar4.mzz = qdlVar4.ud(strArrSplit);
                        qdl qdlVar5 = qdl.this;
                        qdlVar5.mo = qdlVar5.ud(strArrSplit2);
                        qdl qdlVar6 = qdl.this;
                        qdlVar6.wd = qdlVar6.ud(strArrSplit3);
                        qdl qdlVar7 = qdl.this;
                        qdlVar7.fs = qdlVar7.lnr(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pag_landingPage_stay_time", "1,3,5&session").split(d9.i.f24749c);
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pag_video_stay_time", "1,3,5&session").split(d9.i.f24749c);
                        qdl qdlVar8 = qdl.this;
                        qdlVar8.to = qdlVar8.qdl(strArrSplit5);
                        qdl qdlVar9 = qdl.this;
                        qdlVar9.rq = qdlVar9.qdl(strArrSplit6);
                        qdl qdlVar10 = qdl.this;
                        qdlVar10.jpc = qdlVar10.ud(strArrSplit5);
                        qdl qdlVar11 = qdl.this;
                        qdlVar11.tvp = qdlVar11.ud(strArrSplit6);
                        qdl.this.exu = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] ud(String[] strArr) {
        if (strArr.length > 0) {
            return lnr(strArr[0].split(","));
        }
        return new int[0];
    }

    public static qdl qdl() {
        if (qdl == null) {
            synchronized (lnr.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public boolean lnr() {
        return this.rdp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
