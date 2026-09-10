package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.jbs.vr;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    private final Activity di;
    private ik jbs;
    Handler lr;
    private final String mj;
    private com.bytedance.sdk.openadsdk.component.reward.ri.ri qt;
    com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ri;
    private boolean sf;
    private final wjv xha;
    boolean ik = false;
    boolean ka = false;
    boolean fi = false;

    public jbs(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.qt = riVar;
        this.di = riVar.ig;
        this.xha = riVar.lr;
        this.mj = riVar.fi;
    }

    public void aw() {
        ik ikVar = this.jbs;
        if (ikVar == null) {
            return;
        }
        ikVar.nr();
    }

    public void bgr() {
        ik ikVar = this.jbs;
        if (ikVar == null) {
            return;
        }
        ikVar.tan();
        this.jbs.qt();
    }

    public boolean co() {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            return ikVar.zf instanceof com.bytedance.sdk.component.adexpress.fi.ri;
        }
        return false;
    }

    public void di() {
        if (this.sf) {
            return;
        }
        this.sf = true;
        ik ikVar = this.jbs;
        if (ikVar != null) {
            ikVar.co();
        }
        Handler handler = this.lr;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public Handler fi() {
        if (this.lr == null) {
            this.lr = new Handler(Looper.getMainLooper());
        }
        return this.lr;
    }

    public boolean ik() {
        return this.ik;
    }

    public boolean jbs() {
        ik ikVar = this.jbs;
        if (ikVar == null) {
            return false;
        }
        return ikVar.ihz();
    }

    public boolean ka() {
        return this.ka;
    }

    public FrameLayout lr() {
        ik ikVar = this.jbs;
        if (ikVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = ikVar.getVideoFrameLayout();
        if (this.jbs.ihz()) {
            vr();
        }
        return videoFrameLayout;
    }

    public void mj() {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            ikVar.sf();
        }
    }

    public boolean qt() {
        ik ikVar = this.jbs;
        return ikVar != null && ikVar.wjv();
    }

    public void ri(AdSlot adSlot, ac acVar) {
        if (this.fi) {
            return;
        }
        this.fi = true;
        ik ikVar = new ik(this.qt, adSlot, this.mj);
        this.jbs = ikVar;
        if (acVar != null) {
            acVar.ri(ikVar, ikVar.getVideoFrameLayout());
        }
    }

    public int sf() {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            return ikVar.getDynamicShowType();
        }
        return 0;
    }

    public void vr() {
        if (wjv.fi(this.xha) && this.xha.hws() == 3 && this.xha.jxw() == 0) {
            try {
                if (this.xha.bbu() == 1) {
                    int iLr = qd.lr(nr.ri(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.jbs.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iLr;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void xha() {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            ikVar.qt();
        }
    }

    public void lr(boolean z) {
        this.ka = z;
    }

    public ik ri() {
        return this.jbs;
    }

    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik lr(wjv wjvVar) {
        if (wjvVar.adz() == 4) {
            return com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.di, this.mj);
        }
        return null;
    }

    public void ri(boolean z) {
        this.ik = z;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.jbs.jbs jbsVar, com.bytedance.sdk.openadsdk.core.jbs.mj mjVar) {
        wjv wjvVar;
        if (this.jbs == null || (wjvVar = this.xha) == null) {
            return;
        }
        this.ri = lr(wjvVar);
        jbsVar.ri(this.jbs);
        jbsVar.ri(this.ri);
        this.jbs.setClickListener(jbsVar);
        mjVar.ri((View) this.jbs);
        mjVar.ri(this.ri);
        this.jbs.setClickCreativeListener(mjVar);
    }

    public void ri(vr vrVar) {
        ik ikVar = this.jbs;
        if (ikVar == null) {
            return;
        }
        ikVar.setExpressVideoListenerProxy(vrVar);
    }

    public void ri(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        if (this.jbs == null) {
            return;
        }
        this.jbs.setExpressInteractionListener(new PAGRewardFullExpressAdListenerProxy(pAGExpressAdWrapperListener));
    }

    public JSONObject ri(JSONObject jSONObject) {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            return ikVar.ri(jSONObject, this.qt.lr);
        }
        return null;
    }

    public void ri(int i, boolean z) {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            ikVar.ri(i, z, false);
        }
    }

    public void ri(int i, String str) {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            ikVar.lr(i, str);
        }
    }

    public void ri(wjv wjvVar) {
        ik ikVar = this.jbs;
        if (ikVar != null) {
            AdSlot adSlotEb = wjvVar.eb();
            String strFi = wjvVar.fi();
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.qt;
            ikVar.ri(wjvVar, adSlotEb, strFi, riVar.zyn, !riVar.xe);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.qt = riVar;
    }
}
