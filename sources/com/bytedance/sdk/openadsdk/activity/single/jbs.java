package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.ay;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.bgr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.material.card.MaterialCardView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends ik {
    private lr.AbstractC0223lr aw;
    private int bgr;
    private int bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.di.mj f18073co;
    public bgr di;
    private com.bytedance.sdk.openadsdk.vr.ri jbs;
    private com.bytedance.sdk.openadsdk.component.reward.top.ik mj;
    private boolean nr;
    private com.bytedance.sdk.openadsdk.core.di.ik qt;
    private com.bytedance.sdk.openadsdk.core.di.ik sf;
    private mj slm;
    private fi vr;
    private final List<mj> xha;

    public jbs(Activity activity, wjv wjvVar, lr lrVar) {
        super(activity, wjvVar, lrVar);
        this.xha = new ArrayList();
        this.nr = false;
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(activity);
        this.qt = ikVar;
        if (Build.VERSION.SDK_INT >= 35) {
            ikVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.qt);
    }

    private void ihz() {
        boolean zBgr = sf.lr().bgr(String.valueOf(this.lr.ur()));
        int iLr = this.ka.di() ? lr(0, zBgr) : 0;
        if (this.xha.isEmpty() && !dw.ik(this.lr)) {
            int i = iLr + 1;
            this.xha.add(ri(this.ka, this.lr, iLr, i, true));
            iLr = i;
        }
        ri(iLr, zBgr);
    }

    private void ik(mj mjVar) {
        try {
            this.f18073co.setText(this.ri.getString(uq.lr(nr.ri(), "tt_multiple_ad_indicator"), Integer.valueOf(mjVar.sf + 1), Integer.valueOf(this.bgr)));
            this.f18073co.setVisibility(0);
        } catch (Throwable th) {
            ac.ri("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th);
        }
    }

    private void ka(mj mjVar) {
        com.bytedance.sdk.openadsdk.vr.ri riVar = this.jbs;
        if (riVar != null) {
            qd.xha(riVar);
            this.jbs = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = this.mj;
        if (ikVar != null) {
            qd.xha(ikVar);
            qd.xha(this.mj.getITopLayout());
            this.mj = null;
        }
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            abstractC0223lr.ik();
        }
        if (mjVar instanceof xha) {
            ((xha) mjVar).bnj();
        }
        bgr bgrVar = this.di;
        if (bgrVar != null) {
            bgrVar.ik();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011c A[PHI: r11
  0x011c: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00b7, B:42:0x0106, B:32:0x00c7, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    private int lr(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        List<wjv> listLsq = this.lr.lsq();
        if (listLsq.isEmpty()) {
            return i;
        }
        int size = listLsq.size();
        this.bgr = size;
        int i5 = i;
        int i6 = 0;
        while (i6 < size) {
            boolean z2 = i6 == size + (-1);
            wjv wjvVar = listLsq.get(i6);
            if (wjvVar != null) {
                wjvVar.ig(this.fi);
            }
            if (dw.lr(wjvVar)) {
                if (dw.ik(wjvVar)) {
                    List<mj> list = this.xha;
                    i2 = i5 + 1;
                    fi fiVar = new fi(this.ka, wjvVar, i5, i6, true, z2, false);
                    wjvVar = wjvVar;
                    list.add(fiVar);
                    i4 = i2;
                } else {
                    this.xha.add(ri(this.ka, wjvVar, i5, i6, z2));
                    i3 = i5 + 2;
                    this.xha.add(new fi(this.ka, wjvVar, i5 + 1, i6, true, z2, false));
                    i4 = i3;
                }
            } else if (!com.bytedance.sdk.openadsdk.core.model.ac.fi(wjvVar) && com.bytedance.sdk.openadsdk.core.model.ac.di(wjvVar)) {
                this.xha.add(ri(this.ka, wjvVar, i5, i6, z2));
                i3 = i5 + 2;
                this.xha.add(new fi(this.ka, wjvVar, i5 + 1, i6, false, z2, false));
                i4 = i3;
            } else {
                i2 = i5 + 1;
                this.xha.add(ri(this.ka, wjvVar, i5, i6, z2));
                i4 = i2;
            }
            if (z) {
                boolean zRi = this.ka.ri(wjvVar);
                if (z2) {
                    if (this.ka.ka() && zRi && !dw.lr(wjvVar)) {
                        this.xha.add(new fi(this.ka, wjvVar, i4, i6, false, z2, false));
                        i4++;
                    }
                    if (TextUtils.isEmpty(wjvVar.mj())) {
                        i5 = i4;
                    } else {
                        fi fiVar2 = new fi(this.ka, wjvVar, i4, i6, false, z2, true);
                        this.vr = fiVar2;
                        this.xha.add(fiVar2);
                        i5 = i4 + 1;
                    }
                } else if (this.ka.fi() && zRi) {
                    this.xha.add(new fi(this.ka, wjvVar, i4, i6, false, z2, false));
                    i5 = i4 + 1;
                } else {
                    i5 = i4;
                }
            } else {
                i5 = i4;
            }
            i6++;
        }
        return i5;
    }

    private void uq() {
        this.di = com.bytedance.sdk.openadsdk.utils.jbs.ri(this.ri, new com.bytedance.sdk.openadsdk.utils.jbs.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.jbs.1
            @Override // com.bytedance.sdk.openadsdk.utils.jbs.ri
            public void lr() {
                if (jbs.this.mj != null) {
                    jbs.this.mj.setSkipInvisiable();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbs.ri
            public View ri() {
                if (jbs.this.mj != null) {
                    return jbs.this.mj.getCloseButton();
                }
                return null;
            }
        });
    }

    public int ac() {
        mj mjVar = this.slm;
        if (mjVar != null) {
            return mjVar.qt;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public mj aw() {
        mj mjVar = this.slm;
        if (mjVar == null) {
            return null;
        }
        int i = mjVar.qt;
        while (true) {
            i++;
            if (i >= this.xha.size()) {
                return null;
            }
            mj mjVar2 = this.xha.get(i);
            if (mjVar2 instanceof ri) {
                return mjVar2;
            }
            if ((mjVar2 instanceof fi) && dw.ik(mjVar2.di) && mjVar2.slm) {
                return mjVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public fi bgr() {
        fi fiVar = this.vr;
        if (fiVar != null) {
            return fiVar;
        }
        mj mjVar = this.slm;
        int i = mjVar != null ? mjVar.qt : -1;
        for (int size = this.xha.size() - 1; size > i; size--) {
            mj mjVar2 = this.xha.get(size);
            if (mjVar2 instanceof fi) {
                fi fiVar2 = (fi) mjVar2;
                if (fiVar2.ri) {
                    this.vr = fiVar2;
                    break;
                }
            }
        }
        return this.vr;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public com.bytedance.sdk.openadsdk.component.reward.top.ik co() {
        return this.mj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void di() {
        super.di();
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.aw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void jbs() {
        super.jbs();
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.ac();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public int mj() {
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            return abstractC0223lr.ri();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void nr() {
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            abstractC0223lr.mj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public int qt() {
        return this.bu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public mj sf() {
        return this.slm;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void tan() {
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            abstractC0223lr.jbs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public List<wjv> vr() {
        return this.lr.lsq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void xha() {
        super.xha();
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.ka();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri() {
        super.ri();
        ihz();
    }

    private static mj ri(lr lrVar, wjv wjvVar, int i, int i2, boolean z) {
        boolean zQa = wjvVar.qa();
        AdSlot adSlotEb = wjvVar.eb();
        if (adSlotEb != null) {
            zQa = adSlotEb.getDurationSlotType() == 7;
        }
        if (zQa) {
            return new xha(lrVar, wjvVar, i, i2, z);
        }
        return new di(lrVar, wjvVar, i, i2, z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ik() {
        super.ik();
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.bgr();
        }
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            abstractC0223lr.ri(-1);
        }
        bgr bgrVar = this.di;
        if (bgrVar != null) {
            bgrVar.lr();
        }
    }

    private void ri(int i, boolean z) {
        if (bgr() == null && this.ka.di()) {
            uq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(Bundle bundle) {
        super.ri(bundle);
        this.sf = new com.bytedance.sdk.openadsdk.core.di.ik(this.ri);
        this.qt.addView(this.sf, new FrameLayout.LayoutParams(-1, -1));
        this.jbs = new com.bytedance.sdk.openadsdk.vr.ri(this.ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, qd.lr(this.ri, 2.0f));
        layoutParams.gravity = 80;
        this.qt.addView(this.jbs, layoutParams);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(this.ri);
        this.f18073co = mjVar;
        mjVar.setTextColor(-1);
        this.f18073co.setTextSize(15.0f);
        this.f18073co.setShadowLayer(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = qd.lr(this.ri, 60.0f);
        layoutParams2.rightMargin = qd.lr(this.ri, 16.0f);
        layoutParams2.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END;
        this.qt.addView(this.f18073co, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar = new com.bytedance.sdk.openadsdk.component.reward.top.ik(this.ri);
        this.mj = ikVar;
        this.qt.addView(ikVar, new FrameLayout.LayoutParams(-1, -2));
        this.mj.ri(this.lr);
        this.mj.setShowDislike(true);
        ri(null, null, new lr.fi(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public boolean ka() {
        if (this.xha.isEmpty()) {
            return false;
        }
        List<mj> list = this.xha;
        mj mjVar = list.get(list.size() - 1);
        return (mjVar instanceof fi) && ((fi) mjVar).ri;
    }

    private void lr(mj mjVar, mj mjVar2, lr.fi fiVar) {
        wjv wjvVar;
        if (this.aw == null) {
            if (mjVar2 != null && mjVar2.c_()) {
                this.aw = new lr.ka(this.ka, this.lr, this.mj);
            } else {
                this.aw = new lr.ri(this.ka, this.lr, this.mj);
            }
        }
        this.aw.lr();
        int iLr = lr(mjVar2);
        boolean z = mjVar2 instanceof fi;
        if (z && !((fi) mjVar2).ri && !mjVar2.slm && (wjvVar = mjVar2.di) != null && wjvVar.rbh()) {
            this.aw.ka();
        } else {
            this.aw.ri(iLr, mjVar2.di);
            boolean z2 = mjVar2 instanceof fi;
            if (z2 && ((fi) mjVar2).ri) {
                ka(mjVar);
            } else if (mjVar2.di.tl()) {
                boolean z3 = false;
                boolean z4 = (mjVar2 instanceof ri) && com.bytedance.sdk.openadsdk.core.model.ac.fi(mjVar2.di);
                if (z2 && (mjVar2.slm || com.bytedance.sdk.openadsdk.core.model.ac.di(mjVar2.di))) {
                    z3 = true;
                }
                if (z4 || z3) {
                    this.aw.ri(mjVar2);
                }
            } else if (mjVar2.slm) {
                this.aw.ri(mjVar2.di, mjVar2.bu);
            } else if (z2) {
                this.aw.ik(mjVar2.di.dob().ka());
            }
        }
        bgr bgrVar = this.di;
        if (bgrVar != null && mjVar == null) {
            bgrVar.ri(iLr * 1000);
        }
        if (mjVar2 instanceof ri) {
            this.bu++;
            ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (com.bytedance.sdk.openadsdk.core.model.ac.fi(mjVar2.di)) {
                this.f18073co.setVisibility(8);
                return;
            } else {
                ik(mjVar2);
                return;
            }
        }
        if (z) {
            if (((fi) mjVar2).ri) {
                this.f18073co.setVisibility(8);
                return;
            }
            if (mjVar2.slm && dw.ik(mjVar2.di)) {
                this.bu++;
            }
            if (!mjVar2.slm && !com.bytedance.sdk.openadsdk.core.model.ac.di(mjVar2.di)) {
                ik(mjVar2);
            } else {
                this.f18073co.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(mj mjVar, mj mjVar2, lr.fi fiVar) {
        mj mjVar3 = this.slm;
        if ((mjVar3 == null || mjVar3 == mjVar) && !com.bytedance.sdk.component.utils.lr.ri(this.ri)) {
            ac();
            if (mjVar2 == null) {
                mj mjVar4 = this.slm;
                int i = mjVar4 != null ? mjVar4.qt + 1 : 0;
                if (i < this.xha.size()) {
                    mjVar2 = this.xha.get(i);
                }
                if (mjVar2 == null) {
                    this.ka.xha();
                    return;
                }
            }
            mj mjVar5 = this.slm;
            if (mjVar5 != null) {
                if (mjVar5 == mjVar2) {
                    return;
                }
                mjVar5.bgr();
                this.slm.ka();
                com.bytedance.sdk.openadsdk.component.reward.view.mj mjVarRi = this.slm.ri();
                if (mjVarRi != null) {
                    this.sf.removeView(mjVarRi);
                }
                this.slm.tan();
                this.slm.f18078co = false;
                if (this.ka.fi()) {
                    mj mjVar6 = this.slm;
                    if (mjVar6 instanceof ri) {
                        int i2 = mjVar6.qt + 1;
                        mj mjVar7 = i2 < this.xha.size() ? this.xha.get(i2) : null;
                        if ((mjVar7 instanceof fi) && mjVar7 != mjVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.mj mjVarRi2 = mjVar7.ri();
                            if (mjVarRi2 != null && mjVarRi2.getParent() != null && (mjVarRi2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) mjVarRi2.getParent()).removeView(mjVarRi2);
                            }
                            mjVar7.tan();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.lr.ri(this.ri)) {
                return;
            }
            mjVar2.f18078co = true;
            mj mjVar8 = this.slm;
            this.slm = mjVar2;
            lr(mjVar8, mjVar2, fiVar);
            mjVar2.lr(this.ri, fiVar);
            com.bytedance.sdk.openadsdk.component.reward.view.mj mjVarRi3 = mjVar2.ri();
            if (mjVarRi3 != null) {
                ViewParent parent = mjVarRi3.getParent();
                if (parent != null) {
                    if (parent == this.sf) {
                        mjVarRi3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(mjVarRi3);
                    }
                }
                if (mjVarRi3.getParent() == null) {
                    this.sf.addView(mjVarRi3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i3 = mjVar8 != null ? mjVar8.qt : 0; i3 < this.xha.size(); i3++) {
                this.xha.get(i3).ri(mjVar8, this.slm, fiVar);
            }
            this.ka.lr(this.slm);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    private int lr(mj mjVar) {
        wjv wjvVar;
        int iKa = 0;
        for (int i = mjVar.qt; i < this.xha.size(); i++) {
            mj mjVar2 = this.xha.get(i);
            if ((mjVar2 instanceof fi) && ((fi) mjVar2).ri) {
                break;
            }
            boolean z = mjVar2.slm;
            boolean zDi = com.bytedance.sdk.openadsdk.core.model.ac.di(mjVar2.di);
            boolean zFi = com.bytedance.sdk.openadsdk.core.model.ac.fi(mjVar2.di);
            ay ayVarRi = mjVar2.di.ri();
            int iIk = ayVarRi != null ? ayVarRi.ik() : 10;
            if (mjVar2 instanceof ri) {
                if (zFi) {
                    iKa += iIk;
                } else {
                    com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVarEu = mjVar2.di.eu();
                    iKa = attabalVarEu != null ? (int) (((double) iKa) + attabalVarEu.beachfront()) : (int) (((long) iKa) + 10);
                }
            } else if (mjVar2 instanceof fi) {
                if (zDi) {
                    iKa += iIk;
                } else if (z) {
                    if (mjVar2.di.tl()) {
                        iKa += iIk;
                    } else {
                        iKa += dw.ihz(mjVar2.di) + dw.fr(mjVar2.di);
                    }
                } else if (this.ka.fi() && (wjvVar = mjVar2.di) != null && !wjvVar.rbh()) {
                    iKa += mjVar2.di.dob().ka();
                }
            }
        }
        return iKa;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(int i, int i2) {
        super.ri(i, i2);
        if (i >= 0) {
            if (TextUtils.isEmpty(this.ik)) {
                this.f18073co.setText(this.ri.getString(uq.lr(nr.ri(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i)));
            } else {
                this.f18073co.setText(String.format(this.ik, Integer.valueOf(i)));
            }
            this.f18073co.setVisibility(0);
            return;
        }
        this.f18073co.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void lr() {
        super.lr();
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.ik();
        }
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            abstractC0223lr.lr(-1);
        }
        bgr bgrVar = this.di;
        if (bgrVar != null) {
            bgrVar.ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(Activity activity) {
        super.ri(activity);
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.lr(activity);
        }
        int iAc = ac();
        for (mj mjVar2 : this.xha) {
            if (mjVar2.qt >= iAc) {
                mjVar2.tan();
            }
        }
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            abstractC0223lr.ik();
        }
        bgr bgrVar = this.di;
        if (bgrVar != null) {
            bgrVar.ik();
        }
        mj mjVar3 = this.slm;
        if (mjVar3 != null && !mjVar3.uq() && !this.lr.bl()) {
            vr.lr().post(new lr.ik(this.lr));
        }
        this.slm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void lr(mj mjVar, int i) {
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr == null) {
            return;
        }
        if (i == 2) {
            abstractC0223lr.ri(i);
            bgr bgrVar = this.di;
            if (bgrVar != null) {
                bgrVar.lr();
                return;
            }
            return;
        }
        if (i == 1) {
            abstractC0223lr.lr(i);
            bgr bgrVar2 = this.di;
            if (bgrVar2 != null) {
                bgrVar2.ri();
                return;
            }
            return;
        }
        if (i == 3 || i == 4) {
            try {
                this.slm.ay().ihz.oh();
            } catch (Throwable th) {
                ac.ik("SeqSwitchLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void lr(Activity activity) {
        super.lr(activity);
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.ri(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(float f) {
        com.bytedance.sdk.openadsdk.vr.ri riVar = this.jbs;
        if (riVar == null) {
            return;
        }
        riVar.setProgress(f);
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.jbs.getVisibility() == 0) {
            this.jbs.setVisibility(4);
        } else {
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.jbs.getVisibility() == 0) {
                return;
            }
            this.jbs.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(int i) {
        lr.AbstractC0223lr abstractC0223lr = this.aw;
        if (abstractC0223lr != null) {
            if (i == 2) {
                abstractC0223lr.ri(2);
            } else if (i == 1) {
                abstractC0223lr.lr(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(mj mjVar, lr.fi fiVar) {
        mj mjVar2 = this.slm;
        if (mjVar2 == null || mjVar2 == mjVar) {
            if (mjVar2 != null && (mjVar2 instanceof ri)) {
                final long jBgr = (mjVar2.ay() == null || this.slm.ay().ihz == null) ? 0L : this.slm.ay().ihz.bgr();
                final int i = this.slm.sf + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                mj mjVar3 = this.slm;
                com.bytedance.sdk.openadsdk.ka.ik.ri(jCurrentTimeMillis, mjVar3.di, mjVar3.d_(), "dislike_skip", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.jbs.2
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject lr() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jBgr);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ri() {
                        return com.bytedance.sdk.openadsdk.ka.ik.ri(i);
                    }
                });
            }
            mj mjVarAw = aw();
            if (mjVarAw == null) {
                mjVarAw = bgr();
            }
            ri(this.slm, mjVarAw, fiVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(mj mjVar, boolean z, boolean z2, boolean z3, int i) {
        fi fiVarBgr;
        mj mjVar2 = this.slm;
        if ((mjVar2 == null || mjVar2 == mjVar) && (fiVarBgr = bgr()) != null) {
            lr.fi fiVar = new lr.fi(i, mjVar != null ? mjVar.ay() : null);
            fiVar.ri.putBoolean("isSkip", z);
            fiVar.ri.putBoolean("force", z2);
            fiVar.ri.putBoolean("isFromLandingPage", z3);
            ri(this.slm, fiVarBgr, fiVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(ri riVar, boolean z) {
        lr.AbstractC0223lr abstractC0223lr;
        super.ri(riVar, z);
        if (riVar == null || riVar != this.slm || (abstractC0223lr = this.aw) == null) {
            return;
        }
        abstractC0223lr.lr(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(mj mjVar) {
        lr.AbstractC0223lr abstractC0223lr;
        super.ri(mjVar);
        if (mjVar == null) {
            return;
        }
        mjVar.toString();
        if (mjVar.f18078co && (abstractC0223lr = this.aw) != null) {
            abstractC0223lr.di();
        }
        mj mjVarAw = aw();
        if (mjVarAw instanceof ri) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarAy = mjVarAw.ay();
            if (riVarAy == null || !com.bytedance.sdk.openadsdk.core.model.ac.fi(riVarAy.lr)) {
                ((ri) mjVarAw).ihz();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(mj mjVar, boolean z) {
        lr.AbstractC0223lr abstractC0223lr;
        super.ri(mjVar, z);
        if (mjVar == null) {
            return;
        }
        mjVar.toString();
        if (!mjVar.f18078co || (abstractC0223lr = this.aw) == null) {
            return;
        }
        abstractC0223lr.ri(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(View view) {
        super.ri(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.sf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(View view, boolean z) {
        super.ri(view, z);
        if (view.getParent() == null && this.sf != null) {
            view.setVisibility(4);
            int childCount = this.sf.getChildCount();
            if (z) {
                this.sf.addView(view, 0);
            } else {
                this.sf.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public boolean ri(mj mjVar, int i) {
        return i == this.xha.size() - 1 && this.xha.get(i) != null && (this.xha.get(i) instanceof fi);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(boolean z) {
        super.ri(z);
        mj mjVar = this.slm;
        if (mjVar != null) {
            mjVar.ik(z);
        }
    }
}
