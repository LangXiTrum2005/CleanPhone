package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends LD {
    private final int IeN;
    private ViewGroup VVE;
    private String brP;
    private com.bytedance.sdk.openadsdk.component.reward.view.JXs kqm;

    public OY(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
        this.brP = "fullscreen_interstitial_ad";
        this.IeN = this.LD.FGm();
    }

    private void Ivz() {
        FrameLayout frameLayout = new FrameLayout(this.Lxb.Pw);
        this.VVE = frameLayout;
        frameLayout.setId(STP.cFD);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.VVE.setLayoutParams(layoutParams);
        View viewJVA = this.Lxb.BcA.JVA();
        if (viewJVA != null) {
            layoutParams.bottomMargin = viewJVA.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.JXs jXs = new com.bytedance.sdk.openadsdk.component.reward.view.JXs(this.Lxb.Pw);
        this.kqm = jXs;
        jXs.setId(STP.iC);
        FrameLayout.LayoutParams layoutParams2 = this.Lxb.LD.wCT() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.kqm.setLayoutParams(layoutParams2);
        this.VVE.addView(this.kqm);
        nE();
    }

    private void LD(tD tDVar) {
        if (tDVar == null || this.kqm == null) {
            return;
        }
        xan();
        Lxb((ImageView) this.kqm);
    }

    private void Lxb(ImageView imageView) {
        List<IeN> listUxf;
        IeN ieN;
        tD tDVar = this.LD;
        if (tDVar == null || (listUxf = tDVar.uxf()) == null || listUxf.size() <= 0 || (ieN = listUxf.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(listUxf.get(0)).lk(2).Lxb(com.bytedance.sdk.openadsdk.QAg.lk.Lxb(this.LD, ieN.Lxb(), imageView));
    }

    private boolean hg() {
        tD tDVar = this.LD;
        return tDVar != null && tDVar.eK() == 2;
    }

    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lk(tD tDVar) {
        if (tDVar.sRq() == 4) {
            return new com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU(kqm.Lxb(), tDVar, this.brP);
        }
        return null;
    }

    private void nE() {
        if (this.VVE == null) {
            return;
        }
        Lxb((View) this.kqm);
    }

    private void xan() {
        IeN ieN;
        List<IeN> listUxf = this.LD.uxf();
        if (listUxf == null || listUxf.size() <= 0 || (ieN = listUxf.get(0)) == null) {
            return;
        }
        try {
            int iLD = ieN.LD();
            int iLk = ieN.lk();
            if (iLD != 0 && iLk != 0) {
                this.kqm.setRatio(iLD / iLk);
                return;
            }
            int i = this.IeN;
            if (i == 33) {
                this.kqm.setRatio(1.0f);
            } else if (i == 3) {
                this.kqm.setRatio(1.91f);
            } else {
                this.kqm.setRatio(0.56f);
            }
        } catch (Exception e) {
            sLN.Lxb("TTAD.RFTI", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean JXs() {
        return hg() || eK.ebl(this.LD);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void ebl() {
        if (com.bytedance.sdk.openadsdk.core.model.kqm.LD(this.LD)) {
            this.lc.LD(8);
        }
        this.OY.lk(false);
        this.OY.ZU(false);
        if (this.LD.eK() == 2) {
            this.OY.Lxb(false);
            this.lc.JXs(8);
            return;
        }
        this.OY.Lxb(this.LD.FV());
        if (this.Lxb.jeq) {
            Message messageObtain = Message.obtain();
            messageObtain.what = TypedValues.Custom.TYPE_INT;
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            int iKPU = (int) (lxb.eK.KPU() * 1000.0d);
            lxb.QAg = iKPU;
            messageObtain.arg1 = iKPU;
            this.Lxb.JJ.sendMessage(messageObtain);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean lc() {
        return hg();
    }

    public void Lxb(View view) {
        if (view == null || this.Lxb.Pw == null || this.LD == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = this.sLN;
        if (lxb == null) {
            Activity activity = this.Lxb.Pw;
            tD tDVar = this.LD;
            String str = this.brP;
            lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(activity, tDVar, str, nJ.Lxb(str));
            lxb.Lxb(lk(this.LD));
            HashMap map = new HashMap();
            if (eK.brP(this.LD)) {
                map.put("click_scence", 3);
            } else {
                map.put("click_scence", 1);
            }
            lxb.Lxb(map);
        }
        Activity activity2 = this.Lxb.Pw;
        if (activity2 != null) {
            lxb.Lxb(activity2);
        }
        view.setOnTouchListener(lxb);
        view.setOnClickListener(lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(FrameLayout frameLayout) {
        try {
            Ivz();
            LD(this.LD);
            frameLayout.addView(this.VVE);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.view.ebl eblVar) {
        if (com.bytedance.sdk.openadsdk.core.model.kqm.LD(this.LD)) {
            ZU.LD(eblVar);
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            lxb.MGT.Lxb((long) (lxb.eK.KPU() * 1000.0d));
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.kqm.ZU(this.LD) && !com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.LD)) {
                super.Lxb(eblVar);
                return;
            }
            ZU.lk(eblVar);
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.Lxb;
            lxb2.MGT.Lxb((long) (lxb2.eK.KPU() * 1000.0d));
        }
    }

    public static boolean Lxb(tD tDVar) {
        return !tD.JXs(tDVar) && tDVar.Za() == 100.0f;
    }
}
