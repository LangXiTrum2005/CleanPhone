package com.bytedance.sdk.openadsdk.core.OY;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.CSn;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private tD JXs;
    private final Context LD;
    com.bytedance.sdk.openadsdk.core.model.tD Lxb;
    private ScheduledFuture<?> OY;
    private int QAg;
    private com.bytedance.sdk.component.adexpress.LD.IeN ZU;
    private int ebl;
    private int lc;
    private Lxb lk;

    public static class LD implements Runnable {
        InterfaceC0100lk Lxb;

        public LD(InterfaceC0100lk interfaceC0100lk) {
            this.Lxb = interfaceC0100lk;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0100lk interfaceC0100lk = this.Lxb;
            if (interfaceC0100lk != null) {
                interfaceC0100lk.Lxb(107, 107);
            }
        }
    }

    public static class Lxb implements com.bytedance.sdk.component.adexpress.LD.ZU<View>, JXs.LD {
        private PAGExpressAdWrapperListener IeN;
        private String JVA;
        private final Context JXs;
        private com.bytedance.sdk.openadsdk.lk.lk LD;
        AtomicBoolean Lxb = new AtomicBoolean(false);
        private int NXR;
        private FrameLayout OY;
        private com.bytedance.sdk.openadsdk.core.model.tD QAg;
        private com.bytedance.sdk.component.adexpress.LD.ebl STP;
        private String ZU;
        private final int ebl;
        private final int lc;
        private TTDislikeDialogAbstract lk;
        private final int nBu;
        private JXs sLN;

        public Lxb(Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, int i2, String str, int i3) {
            this.JVA = str;
            if (tDVar != null && tDVar.JP()) {
                this.JVA = "fullscreen_interstitial_ad";
            }
            this.JXs = context;
            this.lc = i;
            this.ebl = i2;
            this.QAg = tDVar;
            this.nBu = le.lk(context, 3.0f);
            this.NXR = i3;
            lc();
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private JXs OY() {
            JXs jXsLD = ZU.Lxb().LD();
            this.sLN = jXsLD;
            if (jXsLD == null) {
                this.sLN = new JXs(this.JXs);
            }
            ZU.Lxb().lk(this.sLN);
            this.sLN.Lxb(this.QAg, this, this.JVA);
            this.sLN.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.sLN;
        }

        private View ebl() {
            PAGLogoView pAGLogoView = new PAGLogoView(this.JXs);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.QAg;
            if (tDVar == null || !tDVar.JP()) {
                int i = this.nBu;
                layoutParams.topMargin = i;
                layoutParams.leftMargin = i;
            } else {
                layoutParams.leftMargin = le.lk(this.JXs, 20.0f);
                layoutParams.bottomMargin = le.lk(this.JXs, 20.0f);
                layoutParams.gravity = 8388691;
            }
            pAGLogoView.setLayoutParams(layoutParams);
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.OY.lk.Lxb.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.Lxb(Lxb.this.JXs, Lxb.this.QAg, Lxb.this.JVA);
                }
            });
            return pAGLogoView;
        }

        private void lc() {
            FrameLayout frameLayout = new FrameLayout(this.JXs);
            this.OY = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.lc, this.ebl);
            }
            layoutParams.width = this.lc;
            layoutParams.height = this.ebl;
            layoutParams.gravity = 17;
            this.OY.setLayoutParams(layoutParams);
            JXs jXsOY = OY();
            this.OY.addView(jXsOY);
            View viewEbl = ebl();
            this.OY.addView(viewEbl);
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.QAg;
            if (tDVar != null && tDVar.JP()) {
                jXsOY.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                jXsOY.Lxb(((Activity) this.JXs).findViewById(com.bytedance.sdk.openadsdk.utils.STP.Yc), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            jXsOY.Lxb(viewEbl, friendlyObstructionPurpose);
            Context context = this.JXs;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.STP.Yw);
            if (viewFindViewById != null) {
                jXsOY.Lxb(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) this.JXs).findViewById(com.bytedance.sdk.openadsdk.utils.STP.cf);
            if (viewFindViewById2 != null) {
                jXsOY.Lxb(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.LD.ZU
        public View JXs() {
            return this.OY;
        }

        @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
        public View Lxb() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
        @SuppressLint({"ClickableViewAccessibility"})
        public void e_() {
            if (this.STP != null) {
                com.bytedance.sdk.component.adexpress.LD.STP stp = new com.bytedance.sdk.component.adexpress.LD.STP();
                stp.Lxb(true);
                stp.Lxb(le.ZU(this.JXs, this.lc));
                stp.LD(le.ZU(this.JXs, this.ebl));
                this.STP.Lxb(this.OY, stp);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.LD.ZU
        public int lk() {
            return 5;
        }

        @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
        public View LD() {
            FrameLayout frameLayout = this.OY;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        public void ZU() {
            this.OY = null;
            this.LD = null;
            this.lk = null;
            this.STP = null;
            this.QAg = null;
            JXs jXs = this.sLN;
            if (jXs != null) {
                jXs.sLN();
                ZU.Lxb().Lxb(this.sLN);
            }
            this.Lxb.set(true);
        }

        @Override // com.bytedance.sdk.component.adexpress.LD.ZU
        public void Lxb(com.bytedance.sdk.component.adexpress.LD.ebl eblVar) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar;
            if (this.Lxb.get()) {
                return;
            }
            if (this.JXs != null && (tDVar = this.QAg) != null) {
                this.STP = eblVar;
                if (TextUtils.isEmpty(tDVar.owi())) {
                    eblVar.Lxb(106, "dsp data is null");
                    return;
                } else {
                    this.sLN.VVE();
                    return;
                }
            }
            eblVar.Lxb(106, "material null");
        }

        public void Lxb(CSn cSn) {
            if (cSn instanceof com.bytedance.sdk.openadsdk.lk.lk) {
                this.LD = (com.bytedance.sdk.openadsdk.lk.lk) cSn;
            }
        }

        public void Lxb(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar;
            if (tTDislikeDialogAbstract != null && (tDVar = this.QAg) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(tDVar.Lv(), this.QAg.Wi());
            }
            this.lk = tTDislikeDialogAbstract;
        }

        public void Lxb(String str) {
            this.ZU = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
        public void Lxb(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.IeN;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.OY.JXs.LD
        public void Lxb(int i, int i2) {
            com.bytedance.sdk.component.adexpress.LD.ebl eblVar = this.STP;
            if (eblVar != null) {
                eblVar.Lxb(i, "render fail");
            }
        }

        public void Lxb(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.IeN = pAGExpressAdWrapperListener;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.OY.lk$lk, reason: collision with other inner class name */
    public interface InterfaceC0100lk {
        void LD(String str);

        void Lxb();

        void Lxb(int i, int i2);

        void Lxb(String str);
    }

    public lk(Context context, tD tDVar, com.bytedance.sdk.openadsdk.core.model.tD tDVar2, String str) {
        this.Lxb = tDVar2;
        this.LD = context;
        this.JXs = tDVar;
        Lxb(tDVar);
        this.lk = new Lxb(context, tDVar2, this.lc, this.ebl, str, this.QAg);
    }

    private void Lxb(tD tDVar) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.Lxb;
        if (tDVar2 != null && tDVar2.JP()) {
            this.lc = -1;
            this.ebl = -1;
            return;
        }
        kqm kqmVarLxb = com.bytedance.sdk.openadsdk.core.lk.Lxb.Lxb(tDVar.getExpectExpressWidth(), tDVar.getExpectExpressHeight());
        this.QAg = kqmVarLxb.Lxb;
        if (tDVar.getExpectExpressWidth() <= 0 || tDVar.getExpectExpressHeight() <= 0) {
            int iLk = le.lk(this.LD);
            this.lc = iLk;
            this.ebl = Float.valueOf(iLk / kqmVarLxb.LD).intValue();
        } else {
            this.lc = le.lk(this.LD, tDVar.getExpectExpressWidth());
            this.ebl = le.lk(this.LD, tDVar.getExpectExpressHeight());
        }
        int i = this.lc;
        if (i <= 0 || i <= le.lk(this.LD)) {
            return;
        }
        float fLk = le.lk(this.LD) / this.lc;
        this.lc = le.lk(this.LD);
        this.ebl = Float.valueOf(this.ebl * fLk).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk() {
        try {
            ScheduledFuture<?> scheduledFuture = this.OY;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.OY.cancel(false);
            this.OY = null;
        } catch (Throwable unused) {
        }
    }

    public void LD() {
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.ZU();
            this.lk = null;
        }
        lk();
        this.ZU = null;
        this.JXs = null;
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.LD.IeN ieN) {
        this.ZU = ieN;
    }

    public void Lxb() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb;
        if (tDVar != null && tDVar.JP()) {
            this.OY = hg.Lxb().schedule(new LD(this.lk.sLN), com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(), TimeUnit.MILLISECONDS);
        }
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.Lxb(new com.bytedance.sdk.component.adexpress.LD.ebl() { // from class: com.bytedance.sdk.openadsdk.core.OY.lk.1
                @Override // com.bytedance.sdk.component.adexpress.LD.ebl
                public void Lxb(View view, com.bytedance.sdk.component.adexpress.LD.STP stp) {
                    if (lk.this.JXs == null || view == null) {
                        if (lk.this.ZU != null) {
                            lk.this.ZU.a_(106);
                        }
                    } else if (lk.this.ZU != null) {
                        lk.this.ZU.Lxb(lk.this.lk, stp);
                    }
                    lk.this.lk();
                }

                @Override // com.bytedance.sdk.component.adexpress.LD.ebl
                public void Lxb(int i, String str) {
                    if (lk.this.ZU != null) {
                        lk.this.ZU.a_(106);
                    }
                    lk.this.lk();
                }
            });
            View viewJXs = this.lk.JXs();
            this.JXs.removeView(viewJXs);
            if (viewJXs.getParent() != null) {
                ((ViewGroup) viewJXs.getParent()).removeView(viewJXs);
            }
            this.JXs.addView(viewJXs, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.LD.IeN ieN = this.ZU;
        if (ieN != null) {
            ieN.a_(106);
        }
    }

    public void Lxb(CSn cSn) {
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.Lxb(cSn);
        }
    }

    public void Lxb(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.Lxb(tTDislikeDialogAbstract);
        }
    }

    public void Lxb(String str) {
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.Lxb(str);
        }
    }

    public void Lxb(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.Lxb(pAGExpressAdWrapperListener);
        }
    }
}
