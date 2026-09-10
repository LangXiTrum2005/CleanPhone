package com.bytedance.sdk.openadsdk.component.reward.ud;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.exu;
import com.bytedance.sdk.openadsdk.component.reward.qdl.bjy;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.component.reward.view.tvp;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.bytedance.sdk.openadsdk.utils.rdp;
import com.smartdigimkt.o1.b;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ud extends com.bytedance.sdk.openadsdk.component.reward.ud.qdl {
    private com.bytedance.sdk.openadsdk.fs.mo bjy;
    public com.bytedance.sdk.openadsdk.core.widget.ud exu;
    protected com.bytedance.sdk.openadsdk.core.lnr.mzz fs;
    public LinearLayout rdp;
    protected String rq;

    public interface qdl {
        void qdl(boolean z2);
    }

    public ud(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar);
    }

    private void lnr(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        fs fsVar = qdlVar.gy;
        if (fsVar == null || fsVar.to() == null) {
            return;
        }
        qdlVar.gy.to().performClick();
    }

    public void aaj() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        fs fsVar = qdlVar.gy;
        if (fsVar != null) {
            fsVar.jtx();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        boolean z2 = qdlVar2.gt;
        qdlVar2.ekw.qdl();
        DeviceUtils.wd();
        this.qdl.hkc.bjy();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        if (qdlVar3.gt) {
            qdlVar3.ag.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ud.ud.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ud.this.qdl.ekw.qdl() > 0) {
                        ud.this.qdl.ekw.qdl(false);
                    }
                }
            });
        }
    }

    public void bch() {
        this.fs = this.qdl.vu.lnr();
    }

    public void bjy() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (!qdlVar.wd && qdlVar.mml()) {
            this.qdl.fco.mzz();
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
            if (qdlVar2.ra && (qdlVar2.lq instanceof com.bytedance.sdk.openadsdk.activity.qdl)) {
                return;
            }
            qdlVar2.gy.mo(0);
        }
    }

    public final void bqt() {
        if (this.qdl.ag.isFinishing()) {
            return;
        }
        this.qdl.hkc.to();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        String str = qdlVar.mml ? "reward_endcard" : "fullscreen_endcard";
        qdlVar.hkc.qdl(this.bjy, str, qdlVar.wc);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        if (qdlVar2.rzg) {
            qdlVar2.xmv.qdl(qdlVar2.gt);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        qdlVar3.hkc.qdl(str, qdlVar3.wc);
        this.qdl.hkc.mzz();
    }

    public void exc() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        qdlVar.irn = false;
        boolean z2 = qdlVar.gt;
        if (!qdlVar.rq.get()) {
            this.qdl.bch.bjy();
        }
        jtx();
        this.qdl.hkc.jtx();
        this.qdl.xmv.jpc();
        this.qdl.oth.set(true);
        if (this.qdl.to.get()) {
            this.qdl.jyq.set(true);
        }
        rdp rdpVar = this.qdl.kab;
        if (rdpVar != null) {
            rdpVar.ud();
        }
        this.qdl.ud();
    }

    public void exu() {
    }

    public void fs() {
        LinearLayout linearLayout = (LinearLayout) this.qdl.ax.findViewById(jtx.exu);
        this.rdp = linearLayout;
        ax.qdl((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.ijp = new exu(qdlVar.ag, qdlVar.ud, "landingpage_endcard");
        this.qdl.ijp.lnr().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ud.ud.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ud.this.qdl.gy.to().performClick();
            }
        });
        this.rdp.addView(this.qdl.ijp.mzz(), new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        qdlVar2.hkc.qdl(qdlVar2.ijp);
    }

    public void jl() {
        int i2;
        if (this.qdl.to.get()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            if (!qdlVar.wd && qdlVar.jyq.getAndSet(false) && ((i2 = this.qdl.jpc) >= 0 || i2 == -1)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
                messageObtain.arg1 = qdlVar2.jpc;
                qdlVar2.cx.sendMessage(messageObtain);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        if (qdlVar3.tvp <= 0 || !qdlVar3.oth.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = b.z1;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.qdl;
        messageObtain2.arg1 = qdlVar4.tvp;
        qdlVar4.cx.sendMessage(messageObtain2);
    }

    public RFEndCardBackUpLayout jpc() {
        return new RFEndCardBackUpLayout(this.qdl.om);
    }

    public void jtx() {
        this.to.removeMessages(300);
    }

    public void jyq() {
        ud(false);
    }

    public boolean koa() {
        return true;
    }

    public void ljh() {
        this.qdl.fco.lnr();
        this.qdl.fco.mzz(true);
    }

    public qdl mml() {
        return null;
    }

    public abstract boolean mo();

    public abstract boolean mzz();

    public void oth() {
        if (!this.qdl.xmv.rq() && yt.mml().jyq(String.valueOf(this.qdl.mo)) == 1) {
            int iQdl = qdl(this.qdl);
            if (ud(this.qdl)) {
                lnr(this.qdl);
            } else if (qdl(this.qdl, iQdl)) {
                mml(this.qdl);
            }
        }
    }

    public abstract void qdl(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.qdl
    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, koa koaVar) {
        super.qdl(udVar, koaVar);
        if (this.qdl.ud.mo()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            if (qdlVar.nz) {
                qdlVar.hkc.qdl(false);
            }
        }
    }

    public void rdp() {
        com.bytedance.sdk.openadsdk.core.widget.ud udVar = this.exu;
        if (udVar == null || !udVar.isShowing()) {
            return;
        }
        this.exu.dismiss();
    }

    public void rq() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.koa.qdl(qdlVar.mml);
        this.qdl.gy.ud();
        this.qdl.mrf.qdl();
        if (!this.qdl.ud.uj()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
            if (qdlVar2.wd && TextUtils.isEmpty(ljh.qdl(qdlVar2.om, this.ud))) {
                fs();
            }
            this.qdl.hkc.qdl();
            this.qdl.hzv.qdl();
        }
        this.qdl.xmv.wd();
        this.qdl.fco.qdl();
        if (vu.mo(this.qdl.ud)) {
            this.qdl.gy.mml();
            ax.qdl((View) this.qdl.hkc.jpc(), 4);
        }
        if (aaj.mml(this.qdl.ud) || aaj.ud(this.qdl.ud) || aaj.wd(this.qdl.ud)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        fs fsVar = qdlVar3.gy;
        int iUd = ax.ud(qdlVar3.om, qdlVar3.tid);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.qdl;
        fsVar.qdl(iUd, ax.ud(qdlVar4.om, qdlVar4.sy));
        this.qdl.uw.qdl();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar5 = this.qdl;
        if (qdlVar5.zy) {
            qdlVar5.gy.qdl(0);
        }
    }

    public View to() {
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar;
        if (this.ud.gg() != 5) {
            wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(this.qdl.ag);
            wdVar.setId(jtx.fc);
        } else {
            wdVar = null;
        }
        Objects.toString(wdVar);
        return wdVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00f3  */
    public View tvp() {
        View viewCreatePAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(this.qdl.ag);
        lnrVar.setId(jtx.uj);
        View viewUd = com.bytedance.sdk.openadsdk.core.widget.mo.ud(this.qdl.ag);
        viewUd.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = ax.ud(this.qdl.ag, 20.0f);
        layoutParams.rightMargin = ax.ud(this.qdl.ag, 16.0f);
        viewUd.setLayoutParams(layoutParams);
        viewUd.setContentDescription(com.bytedance.sdk.component.utils.ljh.qdl(this.qdl.ag, "tt_ad_close_text"));
        viewUd.setVisibility(8);
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
        if (jpcVar == null || !jpcVar.cx().bch()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(qdlVar.ag, qdlVar.ud);
            viewCreatePAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, ax.ud(this.qdl.ag, 14.0f));
            layoutParams2.gravity = 8388691;
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            viewCreatePAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(this.qdl.ag);
        mmlVar.setId(jtx.xmr);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(ax.ud(this.qdl.ag, 32.0f), ax.ud(this.qdl.ag, 14.0f));
        layoutParams3.gravity = 8388693;
        mmlVar.setLayoutParams(layoutParams3);
        mmlVar.setPadding(ax.ud(this.qdl.ag, 9.0f), 0, ax.ud(this.qdl.ag, 9.0f), 0);
        mmlVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (viewCreatePAGLogoViewByMaterial != null) {
            lnrVar.addView(viewCreatePAGLogoViewByMaterial);
        }
        lnrVar.addView(mmlVar);
        if (this.qdl.ud.ax()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
            if (!qdlVar2.ra || qdlVar2.qdl != 1) {
                View lnrVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.lnr(this.qdl.ag);
                lnrVar2.setId(jtx.mwc);
                lnrVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                lnrVar.addView(lnrVar2);
            }
        } else {
            View lnrVar3 = new com.bytedance.sdk.openadsdk.component.reward.top.lnr(this.qdl.ag);
            lnrVar3.setId(jtx.mwc);
            lnrVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            lnrVar.addView(lnrVar3);
        }
        lnrVar.addView(viewUd);
        return lnrVar;
    }

    public void ud(boolean z2) {
        to toVar = this.qdl.bqt;
        if (toVar != null && !z2) {
            toVar.mo();
        }
        fs fsVar = this.qdl.gy;
        if (fsVar != null) {
            fsVar.rdp();
        }
        this.qdl.bch.ekw();
        if (!mzz()) {
            this.qdl.to.get();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.jtx jtxVar = this.qdl.hkc;
        if (jtxVar != null) {
            jtxVar.rq();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.jpc jpcVar = this.qdl.xmv;
        if (jpcVar != null) {
            jpcVar.lnr(com.bytedance.sdk.openadsdk.component.reward.qdl.jpc.qdl);
        }
        fs fsVar2 = this.qdl.gy;
        if (fsVar2 != null) {
            fsVar2.fs();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.mzz mzzVar = this.qdl.mrf;
        if (mzzVar != null) {
            mzzVar.lnr();
        }
        rdp rdpVar = this.qdl.kab;
        if (rdpVar != null) {
            rdpVar.lnr();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    public void uw() {
        ljh ljhVar;
        if (!mo() && ((this instanceof wd) || (this instanceof jpc))) {
            this.qdl.vu.ud();
            return;
        }
        if (!this.tvp.qdl(this.mzz.rdp(), false)) {
            this.to.removeMessages(300);
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            if (qdlVar.ra) {
                com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar.lq;
                if (jpcVar instanceof com.bytedance.sdk.openadsdk.activity.qdl) {
                    ((com.bytedance.sdk.openadsdk.activity.qdl) jpcVar).uw();
                } else {
                    qdl(com.bytedance.sdk.openadsdk.mml.ud.C0149ud.qdl);
                    bjy bjyVar = this.mzz;
                    bjyVar.qdl(!bjyVar.hzv() ? 1 : 0, 4);
                }
            } else {
                qdl(com.bytedance.sdk.openadsdk.mml.ud.C0149ud.qdl);
                bjy bjyVar2 = this.mzz;
                bjyVar2.qdl(!bjyVar2.hzv() ? 1 : 0, 4);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        if (qdlVar2 == null || (ljhVar = qdlVar2.ud) == null || qdlVar2.kab == null || !ljhVar.au()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        qdlVar3.kab.qdl(qdlVar3.bch.xmv());
    }

    public abstract void wd();

    public void xmv() {
        lnr();
        if (!this.qdl.ud.uj() && koa()) {
            bqt();
        }
        if (koa()) {
            this.qdl.mrf.ud();
        }
        if (aaj.mml(this.qdl.ud) || aaj.wd(this.qdl.ud)) {
            this.to.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.gy.qdl(qdlVar.taz == 100.0f);
        bch();
        wd();
    }

    public void yt() {
        if (this.qdl.lq != null || ((!vu.ud(this.ud) && !vu.lnr(this.ud)) || (vu.jpc(this.ud) && this.qdl.hkc.vu() && !this.qdl.hkc.ekw()))) {
            jl();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        rdp rdpVar = qdlVar.kab;
        if (rdpVar != null) {
            rdpVar.qdl();
        }
        this.qdl.qdl();
    }

    private void mml(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.fs fsVar = qdlVar.fco;
        if (fsVar != null) {
            fsVar.mml();
        }
    }

    public void qdl(tvp tvpVar) {
        qdl(tvpVar, this.qdl);
    }

    public void qdl(boolean z2, boolean z3, boolean z4, int i2) {
        this.qdl.mrf.qdl(z2, z3, z4, this, i2);
    }

    private int qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        if (vu.lnr(qdlVar.ud)) {
            return qdlVar.ud.sxp();
        }
        if (qdlVar.mml) {
            return qdlVar.ud.qg();
        }
        return qdlVar.ud.ws();
    }

    private boolean qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, int i2) {
        if (i2 == -1) {
            return false;
        }
        boolean z2 = !qdlVar.to.get() || vu.lnr(qdlVar.ud);
        bjy bjyVar = qdlVar.bch;
        boolean z3 = bjyVar != null && bjyVar.exu() >= ((long) i2) * 1000;
        com.bytedance.sdk.openadsdk.component.reward.qdl.jpc jpcVar = qdlVar.xmv;
        return z2 && (z3 || (jpcVar != null && jpcVar.mml()));
    }

    private boolean ud(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        fs fsVar = qdlVar.gy;
        return fsVar != null && fsVar.tvp();
    }

    public void qdl(int i2) {
        this.mzz.exc();
        qdl(false, true, false, i2);
        if (this.qdl.mml) {
            this.tvp.ud(10000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    public void qdl(Message message) {
        aaj aajVar;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        int i2 = message.what;
        if (i2 == 1) {
            ljh();
            return;
        }
        if (i2 == 300) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            if (qdlVar.ra) {
                com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar.lq;
                if (jpcVar instanceof com.bytedance.sdk.openadsdk.activity.qdl) {
                    ((com.bytedance.sdk.openadsdk.activity.qdl) jpcVar).uw();
                } else {
                    qdl(com.bytedance.sdk.openadsdk.mml.ud.C0149ud.ud);
                    bjy bjyVar = this.qdl.bch;
                    bjyVar.qdl(!bjyVar.hzv() ? 1 : 0, 1 ^ (this.qdl.bch.hzv() ? 1 : 0));
                }
            } else {
                qdl(com.bytedance.sdk.openadsdk.mml.ud.C0149ud.ud);
                bjy bjyVar2 = this.qdl.bch;
                bjyVar2.qdl(!bjyVar2.hzv() ? 1 : 0, 1 ^ (this.qdl.bch.hzv() ? 1 : 0));
            }
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.qdl.ud.zm();
            if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                mmlVarQdl.qdl(com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.GENERAL_LINEAR_AD_ERROR);
            }
            fs fsVar = this.qdl.gy;
            if (fsVar == null || (aajVar = fsVar.bjy) == null) {
                return;
            }
            aajVar.to();
            return;
        }
        if (i2 == 400) {
            this.qdl.bch.exc();
            qdl(false, true, false, 3);
            return;
        }
        if (i2 == 500) {
            if (!vu.mzz(this.qdl.ud)) {
                this.qdl.fco.lnr(false);
            }
            com.bytedance.sdk.component.tvp.mo moVarJpc = this.qdl.hkc.jpc();
            if (moVarJpc != null && moVarJpc.getWebView() != null) {
                moVarJpc.exu();
                moVarJpc.getWebView().resumeTimers();
            }
            if (this.qdl.hkc.jpc() != null) {
                this.qdl.hkc.qdl(1.0f);
                this.qdl.gy.qdl(1.0f);
            }
            if (!this.qdl.ud.mq() && this.qdl.bch.mo() && this.qdl.jl.get()) {
                this.qdl.bch.exc();
                return;
            }
            return;
        }
        if (i2 == 600) {
            bjy();
            return;
        }
        if (i2 == 700) {
            int i3 = message.arg1;
            if (this.qdl.jyq.get()) {
                return;
            }
            if (i3 > 0) {
                this.qdl.fco.ud();
                this.qdl.fco.qdl((CharSequence) ((i3 / 1000) + "s"));
                this.qdl.fco.mzz(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = i3 - 1000;
                this.qdl.jpc -= 1000;
                this.to.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            this.to.removeMessages(700);
            if (vu.wd(this.ud)) {
                if (!this.qdl.xmv.ud() && this.qdl.hkc.exu()) {
                    ljh();
                    return;
                } else {
                    bjy();
                    return;
                }
            }
            bjy();
            return;
        }
        if (i2 != 800) {
            if (i2 == 900 && !this.qdl.oth.get()) {
                int i4 = message.arg1;
                double dFco = this.qdl.bch.fco();
                qdl(i4, (long) (1000.0d * dFco));
                if (i4 > 0) {
                    this.qdl.fco.ud();
                    this.qdl.fco.qdl((CharSequence) ((i4 / 1000) + "s"));
                    this.qdl.fco.mzz(false);
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = b.z1;
                    int i5 = i4 - 1000;
                    messageObtain2.arg1 = i5;
                    this.qdl.tvp = i5;
                    this.to.sendMessageDelayed(messageObtain2, 1000L);
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
                    if (qdlVar2.ra) {
                        com.bytedance.sdk.openadsdk.activity.jpc jpcVar2 = qdlVar2.lq;
                        if (!(jpcVar2 instanceof com.bytedance.sdk.openadsdk.activity.qdl) || dFco <= 0.0d) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.activity.qdl) jpcVar2).qdl((float) (1.0d - (((double) (i4 / 1000.0f)) / dFco)));
                        return;
                    }
                    return;
                }
                this.to.removeMessages(b.z1);
                bjy();
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
                com.bytedance.sdk.openadsdk.activity.jpc jpcVar3 = qdlVar3.lq;
                if (qdlVar3.ra && (jpcVar3 instanceof com.bytedance.sdk.openadsdk.activity.qdl)) {
                    jpcVar3.cx().qdl(jpcVar3, new com.bytedance.sdk.openadsdk.activity.ud.mzz(5, this.qdl));
                    return;
                }
                return;
            }
            return;
        }
        if (!vu.ud(this.qdl.ud)) {
            this.qdl.fco.lnr(false);
        }
        this.qdl.gy.qdl(1.0f);
        if (!this.qdl.ud.mq() && this.qdl.bch.mo() && this.qdl.jl.get()) {
            this.qdl.bch.exc();
        }
    }

    private void qdl(long j, long j2) {
        long j3 = j2 - j;
        Activity activity = this.qdl.ag;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).lnr(j3, j2);
        }
    }

    public static void qdl(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        final com.bytedance.sdk.openadsdk.core.mo.mml mmlVar;
        Context context = frameLayout.getContext();
        if (qdlVar.nz) {
            com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
            lnrVar.setId(jtx.to);
            frameLayout.addView(lnrVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutQdl = qdl(context);
            String strQdl = "";
            if (ljh.mzz(qdlVar.ud)) {
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = qdlVar.ud.tdy();
                if (udVarTdy != null) {
                    strQdl = udVarTdy.to();
                }
            } else {
                List<jl> listVm = qdlVar.ud.vm();
                if (listVm != null && !listVm.isEmpty()) {
                    strQdl = listVm.get(0).qdl();
                }
            }
            if (TextUtils.isEmpty(strQdl)) {
                mmlVar = null;
            } else {
                mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
                int i2 = jtx.qh;
                mmlVar.setId(i2);
                mmlVar.setTag(i2, strQdl);
                mmlVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutQdl.addView(mmlVar);
            }
            lnrVar.addView(frameLayoutQdl);
            lnrVar.addView(new rq(context), new FrameLayout.LayoutParams(-1, -1));
            View mzzVar = new com.bytedance.sdk.openadsdk.component.reward.view.mzz(context);
            mzzVar.setId(jtx.fs);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(mzzVar, layoutParams);
            mzzVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ud.ud.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = qdlVar.ax.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = qdlVar.ax.findViewById(jtx.xmr);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = qdlVar.ax.findViewById(jtx.guw);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = mmlVar;
                    if (mmlVar2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = mmlVar2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            mmlVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
            mzzVar2.setId(jtx.exu);
            mzzVar2.setOrientation(1);
            mzzVar2.setVisibility(8);
            frameLayout.addView(mzzVar2, new FrameLayout.LayoutParams(-1, -1));
        }
        if (qdlVar.yh) {
            View moVar = new com.bytedance.sdk.component.tvp.mo(context, true, com.bytedance.sdk.component.tvp.mo.lnr.ENDCARD);
            moVar.setId(jtx.rdp);
            moVar.setLayerType(2, null);
            moVar.setVisibility(4);
            if (!qdlVar.ew && aaj.mo(qdlVar.ud)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = ax.ud(qdlVar.om, 58.0f);
                frameLayout.addView(moVar, layoutParams2);
            } else {
                frameLayout.addView(moVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(jtx.bjy);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (vu.ud(qdlVar.ud)) {
                View lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
                lnrVar2.setId(jtx.aoy);
                lnrVar2.setVisibility(4);
                frameLayout.addView(lnrVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout qdl(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar.setId(jtx.rq);
        lnrVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        lnrVar.setLayoutParams(layoutParams);
        return lnrVar;
    }
}
