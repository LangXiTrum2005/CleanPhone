package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.VVE;
import com.bytedance.sdk.openadsdk.core.model.NXR;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    private int DY;
    private lk HD;
    public kqm IeN;
    RelativeLayout JVA;
    ImageView JXs;
    final Activity LD;
    View OY;
    PAGLogoView QAg;
    private boolean Sfi;
    com.bytedance.sdk.openadsdk.core.JXs.lc VVE;
    final tD ZU;
    private final boolean brP;
    View ebl;
    FrameLayout lc;
    protected final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lk;
    ImageView nBu;
    VVE sLN;
    private final String tD;
    int Lxb = 3;
    protected int NXR = 0;
    protected final AtomicBoolean STP = new AtomicBoolean(false);
    Runnable kqm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.nBu.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                tD tDVar = nBu.this.ZU;
                if ((tDVar == null || !tDVar.JP()) && (imageView = nBu.this.JXs) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    nBu.this.lk.nJ.Lxb(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public nBu(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.lk = lxb;
        this.LD = lxb.Pw;
        this.ZU = lxb.LD;
        this.tD = lxb.JXs;
        this.brP = lxb.ZU;
    }

    private void brP() {
        RelativeLayout relativeLayout;
        lk lkVar = (lk) this.lk.rW.findViewById(STP.sLN);
        this.HD = lkVar;
        lkVar.Lxb(this.lk);
        this.QAg = (PAGLogoView) this.lk.rW.findViewById(520093757);
        this.nBu = (ImageView) this.lk.rW.findViewById(STP.xNP);
        this.JXs = (ImageView) this.lk.rW.findViewById(520093708);
        this.lc = (FrameLayout) this.lk.rW.findViewById(STP.JVA);
        this.ebl = this.lk.rW.findViewById(STP.kqm);
        this.OY = this.lk.rW.findViewById(STP.Za);
        this.JVA = (RelativeLayout) this.lk.rW.findViewById(STP.cf);
        VVE vve = this.sLN;
        if (vve == null || vve.ZU() == null || (relativeLayout = this.JVA) == null) {
            return;
        }
        relativeLayout.addView(this.sLN.ZU(), new LinearLayout.LayoutParams(-1, -1));
        this.sLN.LD();
    }

    public void IeN() {
        kqm kqmVar = this.IeN;
        if (kqmVar != null) {
            kqmVar.ebl();
        }
    }

    public View JVA() {
        return this.HD;
    }

    public void JXs() {
        int iCG = this.ZU.CG();
        this.Lxb = iCG;
        if (iCG == -200) {
            this.Lxb = com.bytedance.sdk.openadsdk.core.kqm.ZU().IeN(String.valueOf(this.ZU.Td()));
        }
        if (this.Lxb != -1 || Lxb()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk.bG;
        if ((ld instanceof com.bytedance.sdk.openadsdk.component.reward.LD.ZU) || (ld instanceof com.bytedance.sdk.openadsdk.component.reward.LD.lk)) {
            return;
        }
        LD(0);
    }

    public void LD() {
        if (this.Sfi) {
            return;
        }
        this.Sfi = true;
        this.DY = this.lk.Ns;
        if (Lxb()) {
            VVE vve = new VVE(this.lk);
            this.sLN = vve;
            vve.Lxb();
        }
        brP();
        Activity activity = this.LD;
        tD tDVar = this.ZU;
        String str = this.tD;
        FrameLayout frameLayout = this.lc;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        kqm kqmVar = new kqm(activity, tDVar, str, frameLayout, lxb.dR, lxb.rW);
        this.IeN = kqmVar;
        kqmVar.Lxb();
    }

    public boolean Lxb() {
        return true;
    }

    public void NXR() {
        try {
            Activity activity = this.lk.Pw;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, com.bytedance.sdk.component.utils.tD.QAg(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.lk.BcA.sLN();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.nBu.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        nBu.this.lk.BcA.sLN();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.lk.BcA.Lxb(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.lk.BcA.sLN();
        }
    }

    public void OY() {
        lk lkVar = this.HD;
        if (lkVar == null) {
            return;
        }
        lkVar.Lxb();
    }

    public boolean QAg() {
        ImageView imageView = this.JXs;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void STP() {
        kqm kqmVar = this.IeN;
        if (kqmVar != null) {
            kqmVar.lc();
        }
        ImageView imageView = this.JXs;
        if (imageView != null) {
            imageView.removeCallbacks(this.kqm);
        }
    }

    public void VVE() {
        kqm kqmVar = this.IeN;
        if (kqmVar != null) {
            kqmVar.OY();
        }
    }

    public void ZU() {
        le.Lxb((View) this.lc, 8);
        le.Lxb(this.ebl, 8);
        le.Lxb(this.OY, 8);
        LD(8);
        le.Lxb((View) this.JXs, 8);
        le.Lxb((View) this.QAg, 8);
        le.Lxb((View) this.JVA, 8);
        le.Lxb((View) this.nBu, 8);
    }

    public void ebl() {
        if (this.nBu.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.nBu.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.nBu.setLayoutParams(marginLayoutParams);
        }
    }

    public void kqm() {
        com.bytedance.sdk.openadsdk.core.LD.JXs JXs = this.lk.KPU.JXs();
        View view = this.HD;
        if (view == null) {
            view = this.lk.rW;
        }
        JXs.onClick(view);
    }

    public FrameLayout lc() {
        return this.lc;
    }

    public void lk() {
        this.lc.removeAllViews();
    }

    public View nBu() {
        return this.JXs;
    }

    public void sLN() {
        try {
            VVE vve = this.sLN;
            if (vve != null) {
                vve.lk();
            }
            RelativeLayout relativeLayout = this.JVA;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.JVA;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void lk(int i) {
        le.Lxb((View) this.QAg, i);
    }

    public void Lxb(boolean z) {
        le.Lxb((View) this.QAg, eK.lk(this.ZU) ? 8 : 0);
        le.Lxb((View) this.nBu, (this.ZU.chu() && this.ZU.OY()) ? 0 : 8);
        LD(z);
        if (this.brP) {
            JXs();
        }
    }

    public void JXs(int i) {
        le.Lxb((View) this.JXs, i);
        if (i == 0 && !this.lk.nBu.get() && eK.ebl(this.lk.LD)) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(lxb.LD, lxb.JXs, "show_close_button", (JSONObject) null, System.currentTimeMillis() - this.lk.FD);
        }
    }

    public void Lxb(int i) {
        if (this.VVE == null) {
            this.VVE = new com.bytedance.sdk.openadsdk.core.JXs.lc(this.lk.Pw);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.VVE.setLayoutParams(layoutParams);
            this.VVE.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(this.lk.Pw, "tt_video_loading_progress_bar"));
            this.lk.BcA.lc().addView(this.VVE);
        }
        this.VVE.setVisibility(i);
    }

    public void ZU(int i) {
        int i2 = this.Lxb;
        if (i2 == -1 || i != i2 || this.STP.get()) {
            return;
        }
        LD(0);
        this.STP.set(true);
        OY();
    }

    public void LD(boolean z) {
        ImageView imageView;
        int iLxb;
        if (this.DY != 1 && (imageView = this.JXs) != null && z) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iLxb = Lxb("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iLxb > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iLxb;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk.bG;
        if ((ld instanceof com.bytedance.sdk.openadsdk.component.reward.LD.ZU) || (ld instanceof com.bytedance.sdk.openadsdk.component.reward.LD.lk)) {
            return;
        }
        LD(0);
    }

    public void Lxb(int i, int i2) {
        FrameLayout frameLayout;
        if (this.ZU.nE() == 1 && (frameLayout = this.lc) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iLk = le.lk((Context) this.LD);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.lc.getLayoutParams();
            layoutParams.width = iLk;
            int i3 = (iLk * 9) / 16;
            layoutParams.height = i3;
            this.lc.setLayoutParams(layoutParams);
            this.NXR = (le.ZU((Context) this.LD) - i3) / 2;
            sLN.Lxb("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.NXR);
        }
    }

    public void LD(int i) {
        tD tDVar = this.ZU;
        if (tDVar != null && tDVar.chu() && NXR.Lxb(this.ZU)) {
            le.Lxb((View) this.HD, 8);
        } else {
            le.Lxb((View) this.HD, i);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.lk lkVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        tD tDVar;
        if (this.lc != null && (tDVar = this.ZU) != null && tDVar.xan() != null) {
            if (this.ZU.xan().lc && !kqm.LD(this.ZU)) {
                Lxb((View.OnClickListener) lkVar);
                Lxb(lkVar);
            } else {
                Lxb(onClickListener);
            }
        }
        tD tDVar2 = this.ZU;
        if (tDVar2 != null && tDVar2.nE() == 1) {
            if (this.ZU.xan() != null && (view2 = this.ebl) != null) {
                le.Lxb(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ebl.getLayoutParams();
                layoutParams.height = this.NXR;
                this.ebl.setLayoutParams(layoutParams);
                if (this.ZU.xan().LD) {
                    this.ebl.setOnClickListener(lkVar);
                    this.ebl.setOnTouchListener(onTouchListener);
                } else {
                    this.ebl.setOnClickListener(onClickListener);
                }
            }
            if (this.ZU.xan() != null && (view = this.OY) != null) {
                le.Lxb(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.OY.getLayoutParams();
                layoutParams2.height = this.NXR;
                this.OY.setLayoutParams(layoutParams2);
                if (this.ZU.xan().ZU) {
                    this.OY.setOnClickListener(lkVar);
                    this.OY.setOnTouchListener(onTouchListener);
                } else {
                    this.OY.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.QAg;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.nBu.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        nBu nbu = nBu.this;
                        TTWebsiteActivity.Lxb(nbu.LD, nbu.ZU, nbu.tD);
                    } catch (Throwable th) {
                        sLN.Lxb("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.nBu;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb((int) le.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 14.0f, true), this.nBu, this.lk.LD);
        }
    }

    private int Lxb(String str) {
        Resources resources = this.LD.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void Lxb(View.OnClickListener onClickListener) {
        le.Lxb(this.lc, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void Lxb(com.bytedance.sdk.openadsdk.core.LD.lk lkVar) {
        le.Lxb((View) this.lc, (View.OnTouchListener) lkVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void Lxb(float f) {
        le.Lxb(this.JXs, f);
    }

    public void Lxb(Animation animation) {
        RelativeLayout relativeLayout = this.JVA;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void Lxb(int i, com.bytedance.sdk.component.adexpress.LD.STP stp) {
        kqm kqmVar = this.IeN;
        if (kqmVar != null) {
            kqmVar.Lxb(i, stp);
        }
    }
}
