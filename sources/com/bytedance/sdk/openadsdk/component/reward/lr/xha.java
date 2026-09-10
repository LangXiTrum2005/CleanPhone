package com.bytedance.sdk.openadsdk.component.reward.lr;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.component.reward.view.mj;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends lr {
    private final int aw;
    private ViewGroup bgr;
    private String slm;
    private com.bytedance.sdk.openadsdk.component.reward.view.di vr;

    public xha(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        super(riVar);
        this.slm = "fullscreen_interstitial_ad";
        this.aw = this.lr.vz();
    }

    private void dw() {
        if (this.bgr == null) {
            return;
        }
        ri((View) this.vr);
    }

    private boolean hcw() {
        wjv wjvVar = this.lr;
        return wjvVar != null && wjvVar.ajz() == 2;
    }

    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ik(wjv wjvVar) {
        if (wjvVar.adz() == 4) {
            return new com.bytedance.sdk.openadsdk.ihz.ri.ri.lr(nr.ri(), this.slm);
        }
        return null;
    }

    private void lr(wjv wjvVar) {
        if (wjvVar == null || this.vr == null) {
            return;
        }
        ory();
        ri((ImageView) this.vr);
    }

    private void ory() {
        com.bytedance.sdk.openadsdk.core.model.nr nrVar;
        List<com.bytedance.sdk.openadsdk.core.model.nr> listRbz = this.lr.rbz();
        if (listRbz == null || listRbz.size() <= 0 || (nrVar = listRbz.get(0)) == null) {
            return;
        }
        try {
            int iLr = nrVar.lr();
            int iIk = nrVar.ik();
            if (iLr != 0 && iIk != 0) {
                this.vr.setRatio(iLr / iIk);
                return;
            }
            int i = this.aw;
            if (i == 33) {
                this.vr.setRatio(1.0f);
            } else if (i == 3) {
                this.vr.setRatio(1.91f);
            } else {
                this.vr.setRatio(0.56f);
            }
        } catch (Exception e) {
            ac.ik("TTAD.RFTI", e.getMessage());
        }
    }

    private void ri(ImageView imageView) {
        List<com.bytedance.sdk.openadsdk.core.model.nr> listRbz;
        com.bytedance.sdk.openadsdk.core.model.nr nrVar;
        wjv wjvVar = this.lr;
        if (wjvVar == null || (listRbz = wjvVar.rbz()) == null || listRbz.size() <= 0 || (nrVar = listRbz.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.qt.ka.ri(listRbz.get(0)).ik(1).ri(com.bytedance.sdk.openadsdk.qt.ik.ri(this.lr, nrVar.ri(), imageView));
    }

    private void zf() {
        FrameLayout frameLayout = new FrameLayout(this.ri.ig);
        this.bgr = frameLayout;
        frameLayout.setId(slm.vk);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.bgr.setLayoutParams(layoutParams);
        View viewSf = this.ri.dzy.sf();
        if (viewSf != null) {
            layoutParams.bottomMargin = viewSf.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.di diVar = new com.bytedance.sdk.openadsdk.component.reward.view.di(this.ri.ig);
        this.vr = diVar;
        diVar.setId(slm.sez);
        FrameLayout.LayoutParams layoutParams2 = this.ri.lr.bbu() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.vr.setLayoutParams(layoutParams2);
        this.bgr.addView(this.vr);
        dw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void di() {
        if (com.bytedance.sdk.openadsdk.core.model.ac.lr(this.lr)) {
            this.di.lr(8);
        }
        this.mj.ik(false);
        this.mj.ka(false);
        if (this.lr.ajz() == 2) {
            this.mj.ri(false);
            this.di.di(8);
            return;
        }
        this.mj.ri(this.lr.nlk());
        if (this.ri.zb) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            int iQd = (int) (riVar.ihz.qd() * 1000.0d);
            riVar.mj = iQd;
            messageObtain.arg1 = iQd;
            this.ri.jc.sendMessage(messageObtain);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public boolean fi() {
        return hcw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public boolean ka() {
        return hcw();
    }

    public void ri(View view) {
        if (view == null || this.ri.ig == null || this.lr == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ik.lr riVar = this.sf;
        if (riVar == null) {
            Activity activity = this.ri.ig;
            wjv wjvVar = this.lr;
            String str = this.slm;
            riVar = new com.bytedance.sdk.openadsdk.core.ik.ri(activity, wjvVar, str, ig.ri(str));
            riVar.ri(ik(this.lr));
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            riVar.ri(map);
        }
        Activity activity2 = this.ri.ig;
        if (activity2 != null) {
            riVar.ri(activity2);
        }
        view.setOnTouchListener(riVar);
        view.setOnClickListener(riVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void ri(FrameLayout frameLayout) {
        try {
            zf();
            lr(this.lr);
            frameLayout.addView(this.bgr);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.lr
    public void ri(mj mjVar) {
        if (com.bytedance.sdk.openadsdk.core.model.ac.lr(this.lr)) {
            ka.ri(mjVar, this.lr);
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            riVar.aac.ri((long) (riVar.ihz.qd() * 1000.0d));
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.ac.ka(this.lr) && !com.bytedance.sdk.openadsdk.core.model.ac.xha(this.lr)) {
                super.ri(mjVar);
                return;
            }
            ka.lr(mjVar, this.lr);
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
            if (riVar2.xe) {
                return;
            }
            riVar2.aac.ri((long) (riVar2.ihz.qd() * 1000.0d));
        }
    }

    public static boolean ri(wjv wjvVar) {
        return !wjv.fi(wjvVar) && wjvVar.gz() == 100.0f;
    }
}
