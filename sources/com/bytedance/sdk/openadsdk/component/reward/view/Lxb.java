package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.openadsdk.core.OY.Lxb {
    private com.bytedance.sdk.openadsdk.core.LD.JXs DY;
    private int IeN;
    private float Lxb;
    private boolean NXR;
    private int STP;
    private int VVE;
    private View brP;
    private View kqm;
    private FrameLayout tD;

    public Lxb(@NonNull Context context, String str) {
        super(context, str);
        this.VVE = 1;
        this.LD = context;
    }

    private void JVA() {
        View jXs = new com.bytedance.sdk.openadsdk.NXR.JXs(this.LD);
        this.kqm = jXs;
        LD(jXs);
        this.tD = (FrameLayout) this.kqm.findViewById(STP.chu);
        ImageView imageView = (ImageView) this.kqm.findViewById(STP.SlV);
        TextView textView = (TextView) this.kqm.findViewById(STP.Iyd);
        View viewFindViewById = this.kqm.findViewById(520093739);
        Lxb(this.tD, imageView);
        textView.setText(getDescription());
        lk(this.tD);
        lk(imageView);
        lk(textView);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Lxb.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Lxb(((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).LD, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lk, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lc);
                } catch (Throwable th) {
                    sLN.Lxb("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void NXR() {
        com.bytedance.sdk.openadsdk.NXR.QAg qAg = new com.bytedance.sdk.openadsdk.NXR.QAg(this.LD);
        this.kqm = qAg;
        LD(qAg);
        ZU();
        lc();
    }

    private void OY() {
        com.bytedance.sdk.openadsdk.NXR.ZU zu = new com.bytedance.sdk.openadsdk.NXR.ZU(this.LD);
        this.kqm = zu;
        LD(zu);
        ZU();
    }

    private void QAg() {
        com.bytedance.sdk.openadsdk.NXR.lc lcVar = new com.bytedance.sdk.openadsdk.NXR.lc(this.LD);
        this.kqm = lcVar;
        LD(lcVar);
        ZU();
        lc();
    }

    private void ebl() {
        com.bytedance.sdk.openadsdk.NXR.LD ld = new com.bytedance.sdk.openadsdk.NXR.LD(this.LD);
        this.kqm = ld;
        LD(ld);
        ZU();
        lc();
    }

    private float getHeightDp() {
        return le.ZU(this.LD, le.QAg(this.LD));
    }

    private float getWidthDp() {
        return le.ZU(this.LD, le.nBu(this.LD));
    }

    private void nBu() {
        com.bytedance.sdk.openadsdk.NXR.OY oy = new com.bytedance.sdk.openadsdk.NXR.OY(this.LD);
        this.kqm = oy;
        LD(oy);
        ZU();
    }

    private void sLN() {
        com.bytedance.sdk.openadsdk.NXR.ebl eblVar = new com.bytedance.sdk.openadsdk.NXR.ebl(this.LD);
        this.kqm = eblVar;
        LD(eblVar);
        ZU();
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.Lxb
    public void Lxb(View view, int i, com.bytedance.sdk.openadsdk.core.model.STP stp) {
    }

    public View getInteractionStyleRootView() {
        return this;
    }

    public FrameLayout getVideoContainer() {
        return this.tD;
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.LD.JXs jXs) {
        this.DY = jXs;
    }

    public void setIsMute(boolean z) {
        this.NXR = z;
        View view = this.brP;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.NXR.LD.lc)) {
            ((com.bytedance.sdk.openadsdk.core.NXR.LD.lc) view).setIsQuiet(z);
        }
    }

    private void JXs() {
        com.bytedance.sdk.openadsdk.NXR.lk lkVar = new com.bytedance.sdk.openadsdk.NXR.lk(this.LD);
        this.kqm = lkVar;
        LD(lkVar);
        ZU();
        lc();
    }

    private void LD() {
        this.ebl = le.lk(this.LD, this.STP);
        this.OY = le.lk(this.LD, this.IeN);
        int i = (int) (this.Lxb * 1000.0f);
        if (this.VVE == 1) {
            if (i == 666) {
                JXs();
                return;
            }
            if (i == 1000) {
                lk();
                return;
            }
            if (i == 1500) {
                JVA();
                return;
            } else if (i == 1777) {
                NXR();
                return;
            } else {
                Lxb(0.562f);
                sLN();
                return;
            }
        }
        if (i == 562) {
            QAg();
            return;
        }
        if (i == 666) {
            ebl();
            return;
        }
        if (i == 1000) {
            lk();
        } else if (i == 1500) {
            OY();
        } else {
            Lxb(1.777f);
            nBu();
        }
    }

    private void ZU() {
        this.tD = (FrameLayout) this.kqm.findViewById(STP.chu);
        ImageView imageView = (ImageView) this.kqm.findViewById(STP.mb);
        kqm kqmVar = (kqm) this.kqm.findViewById(STP.FV);
        TextView textView = (TextView) this.kqm.findViewById(STP.Rt);
        TextView textView2 = (TextView) this.kqm.findViewById(STP.JD);
        View viewFindViewById = this.kqm.findViewById(520093739);
        if (!TextUtils.isEmpty(this.lk.xr())) {
            textView2.setText(this.lk.xr());
        }
        Lxb(this.tD, imageView);
        if (this.lk.Lpq() != null && !TextUtils.isEmpty(this.lk.Lpq().Lxb())) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.lk.Lpq().Lxb(), this.lk.Lpq().LD(), this.lk.Lpq().lk(), kqmVar, this.lk);
        }
        textView.setText(getTitle());
        lk(this.tD);
        lk(imageView);
        lk(kqmVar);
        lk(textView);
        lk(textView2);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Lxb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Lxb(((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).LD, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lk, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lc);
                } catch (Throwable th) {
                    sLN.Lxb("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void lc() {
        TextView textView = (TextView) this.kqm.findViewById(STP.pyu);
        if (textView != null) {
            textView.setText(getDescription());
            lk(textView);
        }
    }

    private void lk() {
        com.bytedance.sdk.openadsdk.NXR.Lxb lxb = new com.bytedance.sdk.openadsdk.NXR.Lxb(this.LD);
        this.kqm = lxb;
        LD(lxb);
        ZU();
        lc();
    }

    public void Lxb(tD tDVar, float f, int i, int i2, int i3) {
        this.Lxb = f;
        this.VVE = i;
        this.lk = tDVar;
        this.lc = "fullscreen_interstitial_ad";
        this.STP = i2;
        this.IeN = i3;
        Lxb(this.QAg);
        LD();
    }

    private void lk(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = this.DY;
        if (lxb == null) {
            Context context = this.LD;
            tD tDVar = this.lk;
            String str = this.lc;
            lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(context, tDVar, str, nJ.Lxb(str));
            lxb.Lxb(Lxb(this.lk, this.LD));
        }
        view.setOnTouchListener(lxb);
        view.setOnClickListener(lxb);
    }

    private void Lxb(FrameLayout frameLayout, ImageView imageView) {
        tD tDVar = this.lk;
        if (tDVar == null) {
            return;
        }
        boolean zJXs = tD.JXs(tDVar);
        if (this.lk.JJ() != null && zJXs) {
            le.Lxb((View) imageView, 8);
            le.Lxb((View) frameLayout, 0);
        } else {
            Lxb(imageView);
            le.Lxb((View) imageView, 0);
            le.Lxb((View) frameLayout, 8);
        }
    }

    private void LD(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void Lxb(ImageView imageView) {
        List<IeN> listUxf;
        IeN ieN;
        tD tDVar = this.lk;
        if (tDVar == null || (listUxf = tDVar.uxf()) == null || listUxf.size() <= 0 || (ieN = listUxf.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(ieN).lk(2).Lxb(com.bytedance.sdk.openadsdk.QAg.lk.Lxb(this.lk, ieN.Lxb(), imageView));
    }

    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc Lxb(tD tDVar, Context context) {
        if (tDVar != null && tDVar.sRq() == 4) {
            return new com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU(context, tDVar, this.lc);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    private void Lxb(float f) {
        float fMin;
        float fMax;
        int iMax;
        int i;
        int iMax2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.VVE == 2) {
            fMin = Math.max(heightDp, widthDp);
            fMax = Math.min(heightDp, widthDp);
        } else {
            fMin = Math.min(heightDp, widthDp);
            fMax = Math.max(heightDp, widthDp);
        }
        if (this.VVE != 2 && le.lk((Activity) this.LD)) {
            fMax -= le.ZU(this.LD, le.Lxb());
        }
        int i2 = 20;
        if (this.VVE != 2) {
            if (f == 0.0f || f == 100.0f) {
                i2 = 0;
                iMax2 = 0;
                iMax = 0;
                i = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                i2 = iMax2;
                iMax = 20;
                i = 20;
            }
        } else if (f == 0.0f || f == 100.0f) {
            i2 = 0;
            iMax2 = 0;
            iMax = 0;
            i = 0;
        } else {
            iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f)) / 2.0f, 0.0f);
            i = iMax;
            iMax2 = 20;
        }
        ((Activity) this.LD).getWindow().getDecorView().setPadding(le.lk(this.LD, iMax), le.lk(this.LD, i2), le.lk(this.LD, i), le.lk(this.LD, iMax2));
    }
}
