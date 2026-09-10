package com.bytedance.sdk.openadsdk.di;

import com.bytedance.sdk.openadsdk.core.ik;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static volatile ri ri;
    private boolean aw;
    private boolean bgr;
    private boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int[] f18152co;
    private int[] di;
    private int[] fi;
    private boolean ik;
    private int[] jbs;
    private boolean ka;
    private boolean lr;
    private int[] mj;
    private boolean qt;
    private boolean sf;
    private boolean slm;
    private int vr;
    private int[] xha;

    private ri() {
        lr();
    }

    public int[] aw() {
        return this.jbs;
    }

    public boolean bgr() {
        return this.qt;
    }

    public boolean bu() {
        return this.aw;
    }

    public int[] co() {
        return this.mj;
    }

    public boolean nr() {
        return this.bu;
    }

    public int[] qt() {
        return this.di;
    }

    public int[] sf() {
        return this.xha;
    }

    public int[] slm() {
        return this.f18152co;
    }

    public boolean vr() {
        return this.sf;
    }

    public int[] jbs() {
        return this.fi;
    }

    public boolean mj() {
        return this.ka;
    }

    public boolean xha() {
        return this.ik;
    }

    public boolean di() {
        return this.lr;
    }

    public boolean fi() {
        return this.slm;
    }

    public int ka() {
        return this.vr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] ik(String[] strArr) {
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

    public void lr() {
        vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.ri.1
            @Override // java.lang.Runnable
            public void run() {
                ri.this.bgr = fi.ri("feature_switch", false);
                if (ri.this.bgr) {
                    try {
                        ri.this.bu = fi.ri("exclude_banner_native", false);
                        ri.this.vr = fi.ri("feature_timer_interval", 10000);
                        ri.this.slm = fi.ri("enable_feature_cids", true);
                        String[] strArrSplit = fi.ri("pag_ad_show_cnt", "1,3,5&session").split(X3.j.c);
                        String[] strArrSplit2 = fi.ri("pag_ad_click_cnt", "1,3,5&session").split(X3.j.c);
                        String[] strArrSplit3 = fi.ri("pag_video_play_cnt", "1,3,5&session").split(X3.j.c);
                        String[] strArrSplit4 = fi.ri("pag_dislike_cnt", "1,3,5session").split(",");
                        ri riVar = ri.this;
                        riVar.lr = riVar.ri(strArrSplit);
                        ri riVar2 = ri.this;
                        riVar2.ik = riVar2.ri(strArrSplit2);
                        ri riVar3 = ri.this;
                        riVar3.ka = riVar3.ri(strArrSplit3);
                        ri riVar4 = ri.this;
                        riVar4.fi = riVar4.lr(strArrSplit);
                        ri riVar5 = ri.this;
                        riVar5.di = riVar5.lr(strArrSplit2);
                        ri riVar6 = ri.this;
                        riVar6.xha = riVar6.lr(strArrSplit3);
                        ri riVar7 = ri.this;
                        riVar7.f18152co = riVar7.ik(strArrSplit4);
                        String[] strArrSplit5 = fi.ri("pag_landingPage_stay_time", "1,3,5&session").split(X3.j.c);
                        String[] strArrSplit6 = fi.ri("pag_video_stay_time", "1,3,5&session").split(X3.j.c);
                        ri riVar8 = ri.this;
                        riVar8.qt = riVar8.ri(strArrSplit5);
                        ri riVar9 = ri.this;
                        riVar9.sf = riVar9.ri(strArrSplit6);
                        ri riVar10 = ri.this;
                        riVar10.mj = riVar10.lr(strArrSplit5);
                        ri riVar11 = ri.this;
                        riVar11.jbs = riVar11.lr(strArrSplit6);
                        ri.this.aw = fi.ri("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] lr(String[] strArr) {
        if (strArr.length > 0) {
            return ik(strArr[0].split(","));
        }
        return new int[0];
    }

    public static ri ri() {
        if (ri == null) {
            synchronized (ik.class) {
                try {
                    if (ri == null) {
                        ri = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public boolean ik() {
        return this.bgr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
