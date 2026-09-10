package com.bytedance.sdk.openadsdk.component.reward.lr;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.mj;
import com.bytedance.sdk.openadsdk.component.reward.ri.co;
import com.bytedance.sdk.openadsdk.component.reward.ri.vr;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.jbs;
import com.bytedance.sdk.openadsdk.component.reward.view.sf;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.ka.qt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bgr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.google.android.gms.ads.AdSize;
import com.google.android.material.card.MaterialCardView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lr extends ri {
    private com.bytedance.sdk.openadsdk.aw.di aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.lr f18093co;
    protected com.bytedance.sdk.openadsdk.core.ik.fi sf;

    public lr(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        super(riVar);
    }

    private void ik(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        sf sfVar = riVar.dzy;
        if (sfVar == null || sfVar.qt() == null) {
            return;
        }
        riVar.dzy.qt().performClick();
    }

    private void ka(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        co coVar = riVar.oh;
        if (coVar != null) {
            coVar.ka();
        }
    }

    public void ac() {
        lr(false);
    }

    public void aw() {
        if (this.ri.xha()) {
            this.ri.oh.fi();
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            if (riVar.xe && (riVar.ajz instanceof com.bytedance.sdk.openadsdk.activity.single.ri)) {
                return;
            }
            riVar.dzy.di(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public void ay() {
        wjv wjvVar;
        if (!fi() && (this instanceof xha)) {
            this.ri.su.lr();
            return;
        }
        if (!this.jbs.ri(this.fi.vr(), false)) {
            this.ri.ihz.sf();
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            if (riVar.xe) {
                mj mjVar = riVar.ajz;
                if (mjVar instanceof com.bytedance.sdk.openadsdk.activity.single.ri) {
                    ((com.bytedance.sdk.openadsdk.activity.single.ri) mjVar).wjv();
                } else {
                    ri(com.bytedance.sdk.openadsdk.ka.lr.C0265lr.ri);
                    vr vrVar = this.fi;
                    vrVar.ri(!vrVar.ig() ? 1 : 0, 4);
                }
            } else {
                ri(com.bytedance.sdk.openadsdk.ka.lr.C0265lr.ri);
                vr vrVar2 = this.fi;
                vrVar2.ri(!vrVar2.ig() ? 1 : 0, 4);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
        if (riVar2 == null || (wjvVar = riVar2.lr) == null || riVar2.aac == null || !wjvVar.vgs()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
        riVar3.aac.ri(riVar3.ihz.igq());
    }

    public void bgr() {
        igq igqVar = this.qt;
        if (igqVar != null) {
            igqVar.removeMessages(AdSize.MEDIUM_RECTANGLE_WIDTH);
        }
    }

    public void bu() {
        if (!this.ri.qt.get() && this.ri.jbs.get() && this.ri.nr.getAndSet(false)) {
            int i = this.ri.xha;
            if (i >= 0 || i == -1) {
                Message messageObtain = Message.obtain();
                messageObtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
                messageObtain.arg1 = riVar.xha;
                riVar.jc.sendMessage(messageObtain);
            }
        }
    }

    public void co() {
        com.bytedance.sdk.openadsdk.core.widget.lr lrVar = this.f18093co;
        if (lrVar == null || !lrVar.isShowing()) {
            return;
        }
        this.f18093co.dismiss();
    }

    public abstract void di();

    public abstract boolean fi();

    public void fr() {
        ik();
        if (!this.ri.lr.zz() && igq()) {
            su();
        }
        if (igq()) {
            this.ri.xd.lr();
        }
        if (ac.ka(this.ri.lr) || ac.xha(this.ri.lr)) {
            this.qt.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        riVar.dzy.ri(riVar.siy == 100.0f);
        wjv();
        di();
    }

    public boolean igq() {
        return true;
    }

    public void ihz() {
        if (!this.ri.wjv.sf() && nr.ka().ihz(String.valueOf(this.ri.di)) == 1) {
            int iRi = ri(this.ri);
            if (lr(this.ri)) {
                ik(this.ri);
            } else if (ri(this.ri, iRi)) {
                ka(this.ri);
            }
        }
    }

    public View jbs() {
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar;
        if (this.lr.jxw() != 5) {
            xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(this.ri.ig);
            xhaVar.setId(slm.ugd);
        } else {
            xhaVar = null;
        }
        Objects.toString(xhaVar);
        return xhaVar;
    }

    public abstract boolean ka();

    public void lr(boolean z) {
        try {
            jbs jbsVar = this.ri.ay;
            if (jbsVar != null && !z) {
                jbsVar.di();
            }
            sf sfVar = this.ri.dzy;
            if (sfVar != null) {
                sfVar.bgr();
            }
            this.ri.ihz.dzy();
            if (!ka()) {
                this.ri.jbs.get();
            }
            com.bytedance.sdk.openadsdk.component.reward.ri.slm slmVar = this.ri.ory;
            if (slmVar != null) {
                slmVar.sf();
            }
            com.bytedance.sdk.openadsdk.component.reward.ri.mj mjVar = this.ri.wjv;
            if (mjVar != null) {
                mjVar.ik(com.bytedance.sdk.openadsdk.component.reward.ri.mj.ri);
            }
            sf sfVar2 = this.ri.dzy;
            if (sfVar2 != null) {
                sfVar2.co();
            }
            com.bytedance.sdk.openadsdk.component.reward.ri.fi fiVar = this.ri.xd;
            if (fiVar != null) {
                fiVar.ik();
            }
            bgr bgrVar = this.ri.aac;
            if (bgrVar != null) {
                bgrVar.ik();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00f3  */
    public View mj() {
        View viewCreatePAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(this.ri.ig);
        ikVar.setId(slm.udw);
        View viewLr = com.bytedance.sdk.openadsdk.core.widget.di.lr(this.ri.ig);
        viewLr.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END;
        layoutParams.topMargin = qd.lr(this.ri.ig, 20.0f);
        layoutParams.rightMargin = qd.lr(this.ri.ig, 16.0f);
        viewLr.setLayoutParams(layoutParams);
        viewLr.setContentDescription(uq.ri(this.ri.ig, "tt_ad_close_text"));
        viewLr.setVisibility(8);
        mj mjVar = this.ri.ajz;
        if (mjVar == null || !mjVar.jc().su()) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(riVar.ig, riVar.lr);
            viewCreatePAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, qd.lr(this.ri.ig, 14.0f));
            layoutParams2.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            viewCreatePAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(this.ri.ig);
        kaVar.setId(slm.hqg);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(qd.lr(this.ri.ig, 32.0f), qd.lr(this.ri.ig, 14.0f));
        layoutParams3.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_END;
        kaVar.setLayoutParams(layoutParams3);
        kaVar.setPadding(qd.lr(this.ri.ig, 9.0f), 0, qd.lr(this.ri.ig, 9.0f), 0);
        kaVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (viewCreatePAGLogoViewByMaterial != null) {
            ikVar.addView(viewCreatePAGLogoViewByMaterial);
        }
        ikVar.addView(kaVar);
        if (this.ri.lr.zyn()) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
            if (!riVar2.xe || riVar2.ri != 1) {
                View ikVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.ik(this.ri.ig);
                ikVar2.setId(slm.gz);
                ikVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                ikVar.addView(ikVar2);
            }
        } else {
            View ikVar3 = new com.bytedance.sdk.openadsdk.component.reward.top.ik(this.ri.ig);
            ikVar3.setId(slm.gz);
            ikVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            ikVar.addView(ikVar3);
        }
        ikVar.addView(viewLr);
        return ikVar;
    }

    public void nr() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        if (riVar == null) {
            return;
        }
        try {
            riVar.tnn = false;
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
            boolean z = riVar2.tnn;
            boolean z2 = riVar2.zyn;
            if (!riVar2.qt.get()) {
                this.ri.ihz.slm();
            }
            bgr();
            this.ri.ory.slm();
            this.ri.wjv.mj();
            this.ri.tan.set(true);
            if (this.ri.jbs.get()) {
                this.ri.nr.set(true);
            }
            bgr bgrVar = this.ri.aac;
            if (bgrVar != null) {
                bgrVar.lr();
            }
            this.ri.fi();
        } catch (Throwable unused) {
        }
    }

    public void qt() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        riVar.fr.ri(riVar.ka);
        this.ri.dzy.lr();
        this.ri.xd.ri();
        if (!this.ri.lr.zz()) {
            this.ri.ory.ri();
            this.ri.hcw.ri();
        }
        this.ri.wjv.xha();
        this.ri.oh.ri();
        if (dw.di(this.ri.lr)) {
            this.ri.dzy.ka();
            qd.ri((View) this.ri.ory.mj(), 4);
        }
        if (ac.ka(this.ri.lr) || ac.lr(this.ri.lr) || ac.xha(this.ri.lr)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
        sf sfVar = riVar2.dzy;
        int iLr = qd.lr(riVar2.srn, riVar2.whw);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
        sfVar.ri(iLr, qd.lr(riVar3.srn, riVar3.xm));
        this.ri.uq.ri();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = this.ri;
        if (riVar4.tw) {
            riVar4.dzy.ri(0);
        }
    }

    public abstract void ri(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.lr.ri
    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar, igq igqVar) {
        super.ri(lrVar, igqVar);
        if (this.ri.lr.di()) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            if (riVar.zb) {
                riVar.ory.ri(false);
            }
        }
    }

    public void slm() {
        bu();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        if (riVar.mj <= 0 || !riVar.tan.getAndSet(false)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 900;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
        messageObtain.arg1 = riVar2.mj;
        riVar2.jc.sendMessage(messageObtain);
    }

    public final void su() {
        if (this.ri.ig.isFinishing()) {
            return;
        }
        this.ri.ory.qt();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        String str = riVar.ka ? "reward_endcard" : "fullscreen_endcard";
        riVar.ory.ri(this.aw, str, riVar.qd);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
        if (riVar2.luy) {
            riVar2.wjv.ri(riVar2.zyn);
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
        riVar3.ory.ri(str, riVar3.qd);
        this.ri.ory.fi();
    }

    public void tan() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        if (riVar == null) {
            return;
        }
        sf sfVar = riVar.dzy;
        if (sfVar != null) {
            sfVar.slm();
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
        boolean z = riVar2.zyn;
        riVar2.dw.ri();
        DeviceUtils.xha();
        this.ri.ory.vr();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
        if (riVar3.zyn) {
            riVar3.ig.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    if (lr.this.ri.dw.ri() > 0) {
                        lr.this.ri.dw.ri(false);
                    }
                }
            });
        }
    }

    public void uq() {
        this.ri.oh.ik();
        this.ri.oh.fi(true);
    }

    public void vr() {
        if (this.ri.ajz != null || ((!dw.lr(this.lr) && !dw.ik(this.lr)) || (dw.mj(this.lr) && this.ri.ory.zf() && !this.ri.ory.hcw()))) {
            slm();
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        if (riVar == null) {
            return;
        }
        bgr bgrVar = riVar.aac;
        if (bgrVar != null) {
            bgrVar.ri();
        }
        this.ri.ka();
    }

    public void wjv() {
        this.sf = this.ri.su.ik();
    }

    public RFEndCardBackUpLayout xha() {
        return new RFEndCardBackUpLayout(this.ri.srn);
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.view.mj mjVar) {
        ri(mjVar, this.ri);
    }

    public void ri(boolean z, boolean z2, boolean z3, int i) {
        this.ri.xd.ri(z, z2, z3, this, i);
    }

    private int ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        if (dw.ik(riVar.lr)) {
            return riVar.lr.ye();
        }
        if (riVar.ka) {
            return riVar.lr.plm();
        }
        return riVar.lr.mhp();
    }

    private boolean ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, int i) {
        if (i == -1) {
            return false;
        }
        boolean z = !riVar.jbs.get() || dw.ik(riVar.lr);
        vr vrVar = riVar.ihz;
        boolean z2 = vrVar != null && vrVar.bgr() >= ((long) i) * 1000;
        com.bytedance.sdk.openadsdk.component.reward.ri.mj mjVar = riVar.wjv;
        return z && (z2 || (mjVar != null && mjVar.ka()));
    }

    private boolean lr(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        sf sfVar = riVar.dzy;
        return sfVar != null && sfVar.jbs();
    }

    public void ri(int i) {
        this.fi.ac();
        ri(false, true, false, i);
        if (this.ri.ka) {
            this.jbs.lr(10000);
        }
    }

    public void sf() {
    }

    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    public void ri(Message message) {
        ac acVar;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        int i = message.what;
        if (i == 1) {
            uq();
            return;
        }
        if (i == 300) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            if (riVar.xe) {
                mj mjVar = riVar.ajz;
                if (mjVar instanceof com.bytedance.sdk.openadsdk.activity.single.ri) {
                    ((com.bytedance.sdk.openadsdk.activity.single.ri) mjVar).wjv();
                } else {
                    ri(com.bytedance.sdk.openadsdk.ka.lr.C0265lr.lr);
                    vr vrVar = this.ri.ihz;
                    vrVar.ri(!vrVar.ig() ? 1 : 0, 1 ^ (this.ri.ihz.ig() ? 1 : 0));
                }
            } else {
                ri(com.bytedance.sdk.openadsdk.ka.lr.C0265lr.lr);
                vr vrVar2 = this.ri.ihz;
                vrVar2.ri(!vrVar2.ig() ? 1 : 0, 1 ^ (this.ri.ihz.ig() ? 1 : 0));
            }
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
            qt.ri(riVar2.lr, "play_video_time_out", riVar2.fi, (String) null);
            com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.ri.lr.qc();
            if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                kaVarRi.ri(com.bytedance.sdk.openadsdk.core.aw.ri.ri.GENERAL_LINEAR_AD_ERROR);
            }
            sf sfVar = this.ri.dzy;
            if (sfVar == null || (acVar = sfVar.vr) == null) {
                return;
            }
            acVar.qt();
            return;
        }
        if (i == 400) {
            this.ri.ihz.ac();
            ri(false, true, false, 3);
            return;
        }
        if (i == 500) {
            if (!dw.fi(this.ri.lr)) {
                this.ri.oh.ik(false);
            }
            com.bytedance.sdk.component.jbs.di diVarMj = this.ri.ory.mj();
            if (diVarMj != null && diVarMj.getWebView() != null) {
                diVarMj.aw();
                diVarMj.getWebView().resumeTimers();
            }
            if (this.ri.ory.mj() != null) {
                this.ri.ory.ri(1.0f);
                this.ri.dzy.ri(1.0f);
            }
            if (!this.ri.lr.qa() && this.ri.ihz.di() && this.ri.vr.get()) {
                this.ri.ihz.ac();
                return;
            }
            return;
        }
        if (i == 600) {
            aw();
            return;
        }
        if (i == 700) {
            int i2 = message.arg1;
            if (this.ri.nr.get()) {
                return;
            }
            if (i2 > 0) {
                this.ri.oh.lr();
                this.ri.oh.ri((CharSequence) ((i2 / 1000) + "s"));
                this.ri.oh.fi(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                messageObtain.arg1 = i2 - 1000;
                this.ri.xha -= 1000;
                this.qt.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            this.qt.removeMessages(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
            if (dw.xha(this.lr)) {
                if (!this.ri.wjv.lr() && this.ri.ory.aw()) {
                    uq();
                    return;
                } else {
                    aw();
                    return;
                }
            }
            aw();
            return;
        }
        if (i != 800) {
            if (i == 900 && !this.ri.tan.get()) {
                int i3 = message.arg1;
                double dQd = this.ri.ihz.qd();
                ri(i3, (long) (1000.0d * dQd));
                if (i3 > 0) {
                    this.ri.oh.lr();
                    this.ri.oh.ri((CharSequence) ((i3 / 1000) + "s"));
                    this.ri.oh.fi(false);
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 900;
                    int i4 = i3 - 1000;
                    messageObtain2.arg1 = i4;
                    this.ri.mj = i4;
                    this.qt.sendMessageDelayed(messageObtain2, 1000L);
                    com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
                    if (riVar3.xe) {
                        mj mjVar2 = riVar3.ajz;
                        if (!(mjVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.ri) || dQd <= 0.0d) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.activity.single.ri) mjVar2).ri((float) (1.0d - (((double) (i3 / 1000.0f)) / dQd)));
                        return;
                    }
                    return;
                }
                this.qt.removeMessages(900);
                aw();
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = this.ri;
                mj mjVar3 = riVar4.ajz;
                if (riVar4.xe && (mjVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.ri)) {
                    mjVar3.jc().ri(mjVar3, new com.bytedance.sdk.openadsdk.activity.single.lr.fi(5, this.ri));
                    return;
                }
                return;
            }
            return;
        }
        if (!dw.lr(this.ri.lr)) {
            this.ri.oh.ik(false);
        }
        this.ri.dzy.ri(1.0f);
        if (!this.ri.lr.qa() && this.ri.ihz.di() && this.ri.vr.get()) {
            this.ri.ihz.ac();
        }
    }

    private void ri(long j, long j2) {
        long j3 = j2 - j;
        Activity activity = this.ri.ig;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).ik(j3, j2);
        }
    }

    public static void ri(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        final com.bytedance.sdk.openadsdk.core.di.ka kaVar;
        Context context = frameLayout.getContext();
        if (riVar.zb) {
            com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(context);
            ikVar.setId(slm.f18175co);
            frameLayout.addView(ikVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutRi = ri(context);
            String strRi = "";
            if (wjv.fi(riVar.lr)) {
                attabal attabalVarEu = riVar.lr.eu();
                if (attabalVarEu != null) {
                    strRi = attabalVarEu.cuirassed();
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.nr> listRbz = riVar.lr.rbz();
                if (listRbz != null && !listRbz.isEmpty()) {
                    strRi = listRbz.get(0).ri();
                }
            }
            if (TextUtils.isEmpty(strRi)) {
                kaVar = null;
            } else {
                kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
                int i = slm.ar;
                kaVar.setId(i);
                kaVar.setTag(i, strRi);
                kaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutRi.addView(kaVar);
            }
            ikVar.addView(frameLayoutRi);
            ikVar.addView(new com.bytedance.sdk.openadsdk.core.widget.sf(context), new FrameLayout.LayoutParams(-1, -1));
            View kaVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.ka(context);
            kaVar2.setId(slm.bgr);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(kaVar2, layoutParams);
            kaVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.lr.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = riVar.pv.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = riVar.pv.findViewById(slm.hqg);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = riVar.pv.findViewById(slm.vk);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.di.ka kaVar3 = kaVar;
                    if (kaVar3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = kaVar3.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            kaVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
            fiVar.setId(slm.vr);
            fiVar.setOrientation(1);
            fiVar.setVisibility(8);
            frameLayout.addView(fiVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (riVar.kt) {
            View diVar = new com.bytedance.sdk.component.jbs.di(context, true, com.bytedance.sdk.component.jbs.di.ik.ENDCARD);
            diVar.setId(slm.slm);
            diVar.setLayerType(2, null);
            diVar.setVisibility(4);
            boolean zDi = ac.di(riVar.lr);
            boolean zCo = ac.co(riVar.lr);
            if (!riVar.hpn && (zDi || zCo)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = qd.lr(riVar.srn, 58.0f);
                frameLayout.addView(diVar, layoutParams2);
            } else {
                frameLayout.addView(diVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(slm.bu);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (dw.lr(riVar.lr)) {
                View ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
                ikVar2.setId(slm.cgm);
                ikVar2.setVisibility(4);
                frameLayout.addView(ikVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout ri(Context context) {
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        ikVar.setId(slm.aw);
        ikVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        ikVar.setLayoutParams(layoutParams);
        return ikVar;
    }
}
