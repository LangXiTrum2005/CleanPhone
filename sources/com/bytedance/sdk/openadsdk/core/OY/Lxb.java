package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.CSn;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Lxb extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    protected boolean JVA;
    protected TTDislikeDialogAbstract JXs;
    protected Context LD;
    private com.bytedance.sdk.openadsdk.ZU.ebl Lxb;
    protected int OY;
    protected int QAg;
    protected com.bytedance.sdk.openadsdk.lk.lk ZU;
    protected int ebl;
    protected String lc;
    protected com.bytedance.sdk.openadsdk.core.model.tD lk;
    protected boolean nBu;
    protected String sLN;

    public Lxb(@NonNull Context context) {
        super(context);
        this.lc = "embeded_ad";
        this.nBu = true;
        this.JVA = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void Lxb() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.JXs;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lk.lk lkVar = this.ZU;
        if (lkVar != null) {
            lkVar.Lxb();
        } else {
            TTDelegateActivity.Lxb(this.lk, (String) null);
        }
    }

    public abstract void Lxb(View view, int i, com.bytedance.sdk.openadsdk.core.model.STP stp);

    public String getDescription() {
        if (TextUtils.isEmpty(this.lk.FD())) {
            return !TextUtils.isEmpty(this.lk.ae()) ? this.lk.ae() : "";
        }
        return this.lk.FD();
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar == null) {
            return "";
        }
        if (tDVar.MGT() == null || TextUtils.isEmpty(this.lk.MGT().LD())) {
            return !TextUtils.isEmpty(this.lk.VU()) ? this.lk.VU() : "";
        }
        return this.lk.MGT().LD();
    }

    public float getRealHeight() {
        return le.ZU(this.LD, this.OY);
    }

    public float getRealWidth() {
        return le.ZU(this.LD, this.ebl);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        if (this.lk.MGT() != null && !TextUtils.isEmpty(this.lk.MGT().LD())) {
            return this.lk.MGT().LD();
        }
        if (TextUtils.isEmpty(this.lk.VU())) {
            return !TextUtils.isEmpty(this.lk.FD()) ? this.lk.FD() : "";
        }
        return this.lk.VU();
    }

    public com.bytedance.sdk.openadsdk.core.NXR.LD.lc getVideoView() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar != null && this.LD != null) {
            if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar)) {
                try {
                    lcVar = new com.bytedance.sdk.openadsdk.core.NXR.LD.lc(this.LD, this.lk, this.lc, true, false, this.Lxb);
                    lcVar.setVideoCacheUrl(this.sLN);
                    lcVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.NXR.LD.lc.LD() { // from class: com.bytedance.sdk.openadsdk.core.OY.Lxb.2
                        @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc.LD
                        public void Lxb(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    lcVar.setIsAutoPlay(this.nBu);
                    lcVar.setIsQuiet(this.JVA);
                } catch (Throwable unused) {
                    lcVar = null;
                }
            } else {
                lcVar = null;
            }
            if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.lk) && lcVar != null && lcVar.Lxb(0L, true, false)) {
                return lcVar;
            }
        }
        return null;
    }

    public void setDislikeInner(CSn cSn) {
        if (cSn instanceof com.bytedance.sdk.openadsdk.lk.lk) {
            this.ZU = (com.bytedance.sdk.openadsdk.lk.lk) cSn;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar;
        if (tTDislikeDialogAbstract != null && (tDVar = this.lk) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(tDVar.Lv(), this.lk.Wi());
        }
        this.JXs = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public Lxb(@NonNull Context context, String str) {
        super(context);
        this.lc = "embeded_ad";
        this.nBu = true;
        this.JVA = true;
        this.sLN = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void Lxb(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.LD.LD ld;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.LD;
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
            String str = this.lc;
            ld = new com.bytedance.sdk.openadsdk.core.LD.Lxb(context, tDVar, str, nJ.Lxb(str));
        } else {
            Context context2 = this.LD;
            com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.lk;
            String str2 = this.lc;
            ld = new com.bytedance.sdk.openadsdk.core.LD.LD(context2, tDVar2, str2, nJ.Lxb(str2));
        }
        view.setOnTouchListener(ld);
        view.setOnClickListener(ld);
        ld.Lxb(new LD() { // from class: com.bytedance.sdk.openadsdk.core.OY.Lxb.1
            @Override // com.bytedance.sdk.openadsdk.core.OY.LD
            public void Lxb(View view2, int i, com.bytedance.sdk.openadsdk.core.model.STP stp) {
                Lxb.this.Lxb(view2, i, stp);
            }
        });
    }

    public void Lxb(int i) {
        this.JVA = com.bytedance.sdk.openadsdk.core.kqm.ZU().lk(String.valueOf(this.QAg));
        int iLD = com.bytedance.sdk.openadsdk.core.kqm.ZU().LD(i);
        if (3 == iLD) {
            this.nBu = false;
            return;
        }
        int iLk = com.bytedance.sdk.component.utils.IeN.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
        if (1 != iLD || !nJ.ZU(iLk)) {
            if (2 == iLD) {
                if (nJ.JXs(iLk) || nJ.ZU(iLk) || nJ.lc(iLk)) {
                    this.nBu = true;
                    return;
                }
                return;
            }
            if (5 != iLD) {
                return;
            }
            if (!nJ.ZU(iLk) && !nJ.lc(iLk)) {
                return;
            }
        }
        this.nBu = true;
    }

    public void Lxb(View view) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar == null || tDVar.JJ() == null || view == null) {
            return;
        }
        Lxb(view, this.lk.CSn() == 1 && this.nBu);
    }
}
