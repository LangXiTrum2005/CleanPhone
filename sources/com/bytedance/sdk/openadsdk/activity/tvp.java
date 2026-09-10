package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.bch;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.rdp.rq;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.rdp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends lnr {
    private mzz bjy;
    private ud.AbstractC0102ud exu;
    private com.bytedance.sdk.openadsdk.core.mo.jpc fs;
    private boolean jl;
    private com.bytedance.sdk.openadsdk.component.reward.top.lnr jpc;
    private jpc jtx;
    public rdp mo;
    private int rdp;
    private com.bytedance.sdk.openadsdk.core.mo.lnr rq;
    private com.bytedance.sdk.openadsdk.core.mo.lnr to;
    private rq tvp;
    private final List<jpc> wd;
    private int yt;

    public tvp(Activity activity, ljh ljhVar, ud udVar) {
        super(activity, ljhVar, udVar);
        this.wd = new ArrayList();
        this.jl = false;
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(activity);
        this.to = lnrVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lnrVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.to);
    }

    private void jyq() {
        boolean zRdp = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().rdp(String.valueOf(this.ud.fz()));
        int iUd = this.mml.mzz() ? ud(0, zRdp) : 0;
        if (this.wd.isEmpty() && !vu.lnr(this.ud)) {
            int i2 = iUd + 1;
            this.wd.add(qdl(this.mml, this.ud, iUd, i2, true));
            iUd = i2;
        }
        qdl(iUd, zRdp);
    }

    private void lnr(jpc jpcVar) {
        try {
            this.fs.setText(this.qdl.getString(com.bytedance.sdk.component.utils.ljh.ud(yt.qdl(), "tt_multiple_ad_indicator"), Integer.valueOf(jpcVar.rq + 1), Integer.valueOf(this.rdp)));
            this.fs.setVisibility(0);
        } catch (Throwable th) {
            aaj.qdl("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th);
        }
    }

    private void mml(jpc jpcVar) {
        rq rqVar = this.tvp;
        if (rqVar != null) {
            ax.wd(rqVar);
            this.tvp = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            ax.wd(lnrVar);
            ax.wd(this.jpc.getITopLayout());
            this.jpc = null;
        }
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            abstractC0102ud.lnr();
        }
        if (jpcVar instanceof wd) {
            ((wd) jpcVar).xi();
        }
        rdp rdpVar = this.mo;
        if (rdpVar != null) {
            rdpVar.lnr();
        }
    }

    private void oth() {
        this.mo = com.bytedance.sdk.openadsdk.utils.tvp.qdl(this.qdl, new com.bytedance.sdk.openadsdk.utils.tvp.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.tvp.1
            @Override // com.bytedance.sdk.openadsdk.utils.tvp.qdl
            public View qdl() {
                if (tvp.this.jpc != null) {
                    return tvp.this.jpc.getCloseButton();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.tvp.qdl
            public void ud() {
                if (tvp.this.jpc != null) {
                    tvp.this.jpc.setSkipInvisiable();
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011e A[PHI: r11
  0x011e: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00b7, B:42:0x0108, B:32:0x00c7, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    private int ud(int i2, boolean z2) {
        int i3;
        int i4;
        int i5;
        List<ljh> listGxp = this.ud.gxp();
        if (listGxp.isEmpty()) {
            return i2;
        }
        int size = listGxp.size();
        this.rdp = size;
        int i6 = i2;
        int i7 = 0;
        while (i7 < size) {
            boolean z3 = i7 == size + (-1);
            ljh ljhVar = listGxp.get(i7);
            if (ljhVar != null) {
                ljhVar.fco(this.mzz);
            }
            if (vu.ud(ljhVar)) {
                if (vu.lnr(ljhVar)) {
                    List<jpc> list = this.wd;
                    i3 = i6 + 1;
                    mzz mzzVar = new mzz(this.mml, ljhVar, i6, i7, true, z3, false);
                    ljhVar = ljhVar;
                    list.add(mzzVar);
                    i5 = i3;
                } else {
                    this.wd.add(qdl(this.mml, ljhVar, i6, i7, z3));
                    i4 = i6 + 2;
                    this.wd.add(new mzz(this.mml, ljhVar, i6 + 1, i7, true, z3, false));
                    i5 = i4;
                }
            } else if (!com.bytedance.sdk.openadsdk.core.model.aaj.mzz(ljhVar) && com.bytedance.sdk.openadsdk.core.model.aaj.mo(ljhVar)) {
                this.wd.add(qdl(this.mml, ljhVar, i6, i7, z3));
                i4 = i6 + 2;
                this.wd.add(new mzz(this.mml, ljhVar, i6 + 1, i7, false, z3, false));
                i5 = i4;
            } else {
                i3 = i6 + 1;
                this.wd.add(qdl(this.mml, ljhVar, i6, i7, z3));
                i5 = i3;
            }
            if (z2) {
                boolean zQdl = this.mml.qdl(ljhVar);
                if (z3) {
                    if (this.mml.lnr() && zQdl && !vu.ud(ljhVar)) {
                        this.wd.add(new mzz(this.mml, ljhVar, i5, i7, false, z3, false));
                        i5++;
                    }
                    if (TextUtils.isEmpty(this.ud.wd())) {
                        i6 = i5;
                    } else {
                        mzz mzzVar2 = new mzz(this.mml, ljhVar, i5, i7, false, z3, true);
                        this.bjy = mzzVar2;
                        this.wd.add(mzzVar2);
                        i6 = i5 + 1;
                    }
                } else if (this.mml.mml() && zQdl) {
                    this.wd.add(new mzz(this.mml, ljhVar, i5, i7, false, z3, false));
                    i6 = i5 + 1;
                } else {
                    i6 = i5;
                }
            } else {
                i6 = i5;
            }
            i7++;
        }
        return i6;
    }

    public int aaj() {
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            return jpcVar.to;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public List<ljh> bjy() {
        return this.ud.gxp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void exc() {
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            abstractC0102ud.tvp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public jpc exu() {
        jpc jpcVar = this.jtx;
        if (jpcVar == null) {
            return null;
        }
        int i2 = jpcVar.to;
        while (true) {
            i2++;
            if (i2 >= this.wd.size()) {
                return null;
            }
            jpc jpcVar2 = this.wd.get(i2);
            if (jpcVar2 instanceof qdl) {
                return jpcVar2;
            }
            if ((jpcVar2 instanceof mzz) && vu.lnr(jpcVar2.mo) && jpcVar2.jtx) {
                return jpcVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public com.bytedance.sdk.openadsdk.component.reward.top.lnr fs() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void jl() {
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            abstractC0102ud.jpc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public int jpc() {
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            return abstractC0102ud.qdl();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void mo() {
        super.mo();
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.exu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public mzz rdp() {
        mzz mzzVar = this.bjy;
        if (mzzVar != null) {
            return mzzVar;
        }
        jpc jpcVar = this.jtx;
        int i2 = jpcVar != null ? jpcVar.to : -1;
        for (int size = this.wd.size() - 1; size > i2; size--) {
            jpc jpcVar2 = this.wd.get(size);
            if (jpcVar2 instanceof mzz) {
                mzz mzzVar2 = (mzz) jpcVar2;
                if (mzzVar2.qdl) {
                    this.bjy = mzzVar2;
                    break;
                }
            }
        }
        return this.bjy;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public jpc rq() {
        return this.jtx;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public int to() {
        return this.yt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void tvp() {
        super.tvp();
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.jyq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void wd() {
        super.wd();
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.mml();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl() {
        super.qdl();
        jyq();
    }

    private static jpc qdl(ud udVar, ljh ljhVar, int i2, int i3, boolean z2) {
        boolean zMq = ljhVar.mq();
        AdSlot adSlotJi = ljhVar.ji();
        if (adSlotJi != null) {
            zMq = adSlotJi.getDurationSlotType() == 7;
        }
        if (zMq) {
            return new wd(udVar, ljhVar, i2, i3, z2);
        }
        return new mo(udVar, ljhVar, i2, i3, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void lnr() {
        super.lnr();
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.rdp();
        }
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            abstractC0102ud.qdl(-1);
        }
        rdp rdpVar = this.mo;
        if (rdpVar != null) {
            rdpVar.ud();
        }
    }

    private void qdl(int i2, boolean z2) {
        if (rdp() == null && this.mml.mzz()) {
            oth();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(Bundle bundle) {
        super.qdl(bundle);
        this.rq = new com.bytedance.sdk.openadsdk.core.mo.lnr(this.qdl);
        this.to.addView(this.rq, new FrameLayout.LayoutParams(-1, -1));
        this.tvp = new rq(this.qdl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ax.ud(this.qdl, 2.0f));
        layoutParams.gravity = 80;
        this.to.addView(this.tvp, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(this.qdl);
        this.fs = jpcVar;
        jpcVar.setTextColor(-1);
        this.fs.setTextSize(15.0f);
        this.fs.setShadowLayer(1.0f, 0.0f, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = ax.ud(this.qdl, 60.0f);
        layoutParams2.rightMargin = ax.ud(this.qdl, 16.0f);
        layoutParams2.gravity = 8388661;
        this.to.addView(this.fs, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = new com.bytedance.sdk.openadsdk.component.reward.top.lnr(this.qdl);
        this.jpc = lnrVar;
        this.to.addView(lnrVar, new FrameLayout.LayoutParams(-1, -2));
        this.jpc.qdl(this.ud);
        this.jpc.setShowDislike(true);
        qdl(null, null, new ud.mzz(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public boolean mml() {
        if (this.wd.isEmpty()) {
            return false;
        }
        jpc jpcVar = (jpc) a.h(1, this.wd);
        return (jpcVar instanceof mzz) && ((mzz) jpcVar).qdl;
    }

    private void ud(jpc jpcVar, jpc jpcVar2, ud.mzz mzzVar) {
        ljh ljhVar;
        if (this.exu == null) {
            if (jpcVar2 instanceof mo) {
                this.exu = new ud.qdl(this.mml, this.ud, this.jpc);
            } else {
                this.exu = new ud.mml(this.mml, this.ud, this.jpc);
            }
        }
        this.exu.ud();
        int iUd = ud(jpcVar2);
        boolean z2 = jpcVar2 instanceof mzz;
        if (z2 && !((mzz) jpcVar2).qdl && !jpcVar2.jtx && (ljhVar = jpcVar2.mo) != null && ljhVar.jc()) {
            this.exu.mml();
        } else {
            this.exu.qdl(iUd, jpcVar2.mo);
            boolean z3 = jpcVar2 instanceof mzz;
            if (z3 && ((mzz) jpcVar2).qdl) {
                mml(jpcVar);
            } else if (jpcVar2.mo.vg()) {
                boolean z4 = false;
                boolean z5 = (jpcVar2 instanceof qdl) && com.bytedance.sdk.openadsdk.core.model.aaj.mzz(jpcVar2.mo);
                if (z3 && (jpcVar2.jtx || com.bytedance.sdk.openadsdk.core.model.aaj.mo(jpcVar2.mo))) {
                    z4 = true;
                }
                if (z5 || z4) {
                    this.exu.qdl(jpcVar2);
                }
            } else if (jpcVar2.jtx) {
                this.exu.qdl(jpcVar2.mo, jpcVar2.yt);
            } else if (z3) {
                this.exu.lnr(jpcVar2.mo.raf().mml());
            }
        }
        rdp rdpVar = this.mo;
        if (rdpVar != null && jpcVar == null) {
            rdpVar.qdl(iUd * 1000);
        }
        if (jpcVar2 instanceof qdl) {
            this.yt++;
            qdl(0.0f);
            if (com.bytedance.sdk.openadsdk.core.model.aaj.mzz(jpcVar2.mo)) {
                this.fs.setVisibility(8);
                return;
            } else {
                lnr(jpcVar2);
                return;
            }
        }
        if (z2) {
            if (((mzz) jpcVar2).qdl) {
                this.fs.setVisibility(8);
                return;
            }
            if (jpcVar2.jtx && vu.lnr(jpcVar2.mo)) {
                this.yt++;
            }
            if (!jpcVar2.jtx && !com.bytedance.sdk.openadsdk.core.model.aaj.mo(jpcVar2.mo)) {
                lnr(jpcVar2);
            } else {
                this.fs.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(jpc jpcVar, jpc jpcVar2, ud.mzz mzzVar) {
        jpc jpcVar3 = this.jtx;
        if ((jpcVar3 == null || jpcVar3 == jpcVar) && !com.bytedance.sdk.component.utils.ud.qdl(this.qdl)) {
            aaj();
            if (jpcVar2 == null) {
                jpc jpcVar4 = this.jtx;
                int i2 = jpcVar4 != null ? jpcVar4.to + 1 : 0;
                if (i2 < this.wd.size()) {
                    jpcVar2 = this.wd.get(i2);
                }
                if (jpcVar2 == null) {
                    this.mml.mo();
                    return;
                }
            }
            jpc jpcVar5 = this.jtx;
            if (jpcVar5 != null) {
                if (jpcVar5 == jpcVar2) {
                    return;
                }
                jpcVar5.rdp();
                this.jtx.mml();
                com.bytedance.sdk.openadsdk.component.reward.view.tvp tvpVarQdl = this.jtx.qdl();
                if (tvpVarQdl != null) {
                    this.rq.removeView(tvpVarQdl);
                }
                this.jtx.aaj();
                this.jtx.fs = false;
                if (this.mml.mml()) {
                    jpc jpcVar6 = this.jtx;
                    if (jpcVar6 instanceof qdl) {
                        int i3 = jpcVar6.to + 1;
                        jpc jpcVar7 = i3 < this.wd.size() ? this.wd.get(i3) : null;
                        if ((jpcVar7 instanceof mzz) && jpcVar7 != jpcVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.tvp tvpVarQdl2 = jpcVar7.qdl();
                            if (tvpVarQdl2 != null && tvpVarQdl2.getParent() != null && (tvpVarQdl2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) tvpVarQdl2.getParent()).removeView(tvpVarQdl2);
                            }
                            jpcVar7.aaj();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.ud.qdl(this.qdl)) {
                return;
            }
            jpcVar2.fs = true;
            jpc jpcVar8 = this.jtx;
            this.jtx = jpcVar2;
            ud(jpcVar8, jpcVar2, mzzVar);
            jpcVar2.ud(this.qdl, mzzVar);
            com.bytedance.sdk.openadsdk.component.reward.view.tvp tvpVarQdl3 = jpcVar2.qdl();
            if (tvpVarQdl3 != null) {
                ViewParent parent = tvpVarQdl3.getParent();
                if (parent != null) {
                    if (parent == this.rq) {
                        tvpVarQdl3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(tvpVarQdl3);
                    }
                }
                if (tvpVarQdl3.getParent() == null) {
                    this.rq.addView(tvpVarQdl3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i4 = jpcVar8 != null ? jpcVar8.to : 0; i4 < this.wd.size(); i4++) {
                this.wd.get(i4).qdl(jpcVar8, this.jtx, mzzVar);
            }
            this.mml.ud(this.jtx);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    private int ud(jpc jpcVar) {
        ljh ljhVar;
        int iMml;
        int iMo = 0;
        for (int i2 = jpcVar.to; i2 < this.wd.size(); i2++) {
            jpc jpcVar2 = this.wd.get(i2);
            if ((jpcVar2 instanceof mzz) && ((mzz) jpcVar2).qdl) {
                break;
            }
            boolean z2 = jpcVar2.jtx;
            boolean zMo = com.bytedance.sdk.openadsdk.core.model.aaj.mo(jpcVar2.mo);
            boolean zMzz = com.bytedance.sdk.openadsdk.core.model.aaj.mzz(jpcVar2.mo);
            bch bchVarQdl = jpcVar2.mo.qdl();
            int iLnr = bchVarQdl != null ? bchVarQdl.lnr() : 10;
            if (jpcVar2 instanceof qdl) {
                if (zMzz) {
                    iMo += iLnr;
                } else {
                    com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = jpcVar2.mo.tdy();
                    iMo = udVarTdy != null ? (int) (udVarTdy.mo() + ((double) iMo)) : (int) (((long) iMo) + 10);
                }
            } else if (jpcVar2 instanceof mzz) {
                if (zMo) {
                    iMo += iLnr;
                } else {
                    if (z2) {
                        if (jpcVar2.mo.vg()) {
                            iMo += iLnr;
                        } else {
                            iMml = vu.uw(jpcVar2.mo) + vu.jyq(jpcVar2.mo);
                        }
                    } else if (this.mml.mml() && (ljhVar = jpcVar2.mo) != null && !ljhVar.jc()) {
                        iMml = jpcVar2.mo.raf().mml();
                    }
                    iMo = iMml + iMo;
                }
            }
        }
        return iMo;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(int i2, int i3) {
        super.qdl(i2, i3);
        if (i2 >= 0) {
            if (TextUtils.isEmpty(this.lnr)) {
                this.fs.setText(this.qdl.getString(com.bytedance.sdk.component.utils.ljh.ud(yt.qdl(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i2)));
            } else {
                this.fs.setText(String.format(this.lnr, Integer.valueOf(i2)));
            }
            this.fs.setVisibility(0);
            return;
        }
        this.fs.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void ud() {
        super.ud();
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.lnr();
        }
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            abstractC0102ud.ud(-1);
        }
        rdp rdpVar = this.mo;
        if (rdpVar != null) {
            rdpVar.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(Activity activity) {
        super.qdl(activity);
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.ud(activity);
        }
        int iAaj = aaj();
        for (jpc jpcVar2 : this.wd) {
            if (jpcVar2.to >= iAaj) {
                jpcVar2.aaj();
            }
        }
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            abstractC0102ud.lnr();
        }
        rdp rdpVar = this.mo;
        if (rdpVar != null) {
            rdpVar.lnr();
        }
        jpc jpcVar3 = this.jtx;
        if (jpcVar3 != null && !jpcVar3.ljh() && !this.ud.ilu()) {
            com.bytedance.sdk.openadsdk.core.rdp.ud().post(new ud.lnr(this.ud));
        }
        this.jtx = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void ud(jpc jpcVar, int i2) {
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud == null) {
            return;
        }
        if (i2 == 2) {
            abstractC0102ud.qdl(i2);
            rdp rdpVar = this.mo;
            if (rdpVar != null) {
                rdpVar.ud();
                return;
            }
            return;
        }
        if (i2 == 1) {
            abstractC0102ud.ud(i2);
            rdp rdpVar2 = this.mo;
            if (rdpVar2 != null) {
                rdpVar2.qdl();
                return;
            }
            return;
        }
        if (i2 == 3 || i2 == 4) {
            try {
                this.jtx.xmv().bch.rc();
            } catch (Throwable th) {
                aaj.lnr("SeqSwitchLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void ud(Activity activity) {
        super.ud(activity);
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.qdl(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(float f) {
        rq rqVar = this.tvp;
        if (rqVar == null) {
            return;
        }
        rqVar.setProgress(f);
        if (f == 0.0f && this.tvp.getVisibility() == 0) {
            this.tvp.setVisibility(4);
        } else {
            if (f <= 0.0f || this.tvp.getVisibility() == 0) {
                return;
            }
            this.tvp.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(int i2) {
        ud.AbstractC0102ud abstractC0102ud = this.exu;
        if (abstractC0102ud != null) {
            if (i2 == 2) {
                abstractC0102ud.qdl(2);
            } else if (i2 == 1) {
                abstractC0102ud.ud(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(jpc jpcVar, ud.mzz mzzVar) {
        jpc jpcVar2 = this.jtx;
        if (jpcVar2 == null || jpcVar2 == jpcVar) {
            if (jpcVar2 != null && (jpcVar2 instanceof qdl)) {
                final long jExu = (jpcVar2.xmv() == null || this.jtx.xmv().bch == null) ? 0L : this.jtx.xmv().bch.exu();
                final int i2 = this.jtx.rq + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                jpc jpcVar3 = this.jtx;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(jCurrentTimeMillis, jpcVar3.mo, jpcVar3.b_(), "dislike_skip", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.tvp.2
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        return com.bytedance.sdk.openadsdk.mml.lnr.qdl(i2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject ud() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", jExu);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
            }
            jpc jpcVarExu = exu();
            if (jpcVarExu == null) {
                jpcVarExu = rdp();
            }
            qdl(this.jtx, jpcVarExu, mzzVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(jpc jpcVar, boolean z2, boolean z3, boolean z4, int i2) {
        mzz mzzVarRdp;
        jpc jpcVar2 = this.jtx;
        if ((jpcVar2 == null || jpcVar2 == jpcVar) && (mzzVarRdp = rdp()) != null) {
            ud.mzz mzzVar = new ud.mzz(i2, jpcVar != null ? jpcVar.xmv() : null);
            mzzVar.qdl.putBoolean("isSkip", z2);
            mzzVar.qdl.putBoolean("force", z3);
            mzzVar.qdl.putBoolean("isFromLandingPage", z4);
            qdl(this.jtx, mzzVarRdp, mzzVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(qdl qdlVar, boolean z2) {
        ud.AbstractC0102ud abstractC0102ud;
        super.qdl(qdlVar, z2);
        if (qdlVar == null || qdlVar != this.jtx || (abstractC0102ud = this.exu) == null) {
            return;
        }
        abstractC0102ud.ud(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(jpc jpcVar) {
        ud.AbstractC0102ud abstractC0102ud;
        super.qdl(jpcVar);
        if (jpcVar == null) {
            return;
        }
        aaj.qdl("SeqSwitchLayoutManager", "onPlayableLoadingDismiss [scene=]" + jpcVar + ",isActive=" + jpcVar.fs);
        if (jpcVar.fs && (abstractC0102ud = this.exu) != null) {
            abstractC0102ud.mo();
        }
        jpc jpcVarExu = exu();
        if (jpcVarExu instanceof qdl) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv = jpcVarExu.xmv();
            if (qdlVarXmv == null || !com.bytedance.sdk.openadsdk.core.model.aaj.mzz(qdlVarXmv.ud)) {
                ((qdl) jpcVarExu).oth();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(jpc jpcVar, boolean z2) {
        ud.AbstractC0102ud abstractC0102ud;
        super.qdl(jpcVar, z2);
        if (jpcVar == null) {
            return;
        }
        aaj.qdl("SeqSwitchLayoutManager", "setIsHappenInteraction [scene=]" + jpcVar + ",isActive=" + jpcVar.fs + ",isHappenInteraction=" + z2);
        if (!jpcVar.fs || (abstractC0102ud = this.exu) == null) {
            return;
        }
        abstractC0102ud.qdl(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(View view) {
        super.qdl(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.rq.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(View view, boolean z2) {
        super.qdl(view, z2);
        if (view.getParent() == null && this.rq != null) {
            view.setVisibility(4);
            int childCount = this.rq.getChildCount();
            if (z2) {
                this.rq.addView(view, 0);
            } else {
                this.rq.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public boolean qdl(jpc jpcVar, int i2) {
        return i2 == this.wd.size() - 1 && this.wd.get(i2) != null && (this.wd.get(i2) instanceof mzz);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(boolean z2) {
        super.qdl(z2);
        jpc jpcVar = this.jtx;
        if (jpcVar != null) {
            jpcVar.lnr(z2);
        }
    }
}
