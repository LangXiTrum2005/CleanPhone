package com.bytedance.sdk.openadsdk.core.lk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.OY.kqm;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.core.model.STP;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.sLN;
import com.bytedance.sdk.openadsdk.utils.le;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends com.bytedance.sdk.openadsdk.core.OY.Lxb implements Ho0, Lo0 {
    private com.bytedance.sdk.openadsdk.core.NXR.LD.lc IeN;
    public boolean Lxb;
    private tD NXR;
    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc STP;
    private ImageView VVE;
    private long brP;
    private String kqm;
    private PAGBannerAdWrapperListener tD;

    public static class Lxb {
        public PAGLogoView JXs;
        public sLN LD;
        public FrameLayout Lxb;
        public com.bytedance.sdk.openadsdk.core.JXs.ZU ZU;
        public com.bytedance.sdk.openadsdk.core.JXs.ZU lc;
        public com.bytedance.sdk.openadsdk.core.JXs.ZU lk;

        private Lxb() {
        }
    }

    public ebl(@NonNull Context context) {
        super(context);
        this.Lxb = true;
        this.LD = context;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void d_() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void g_() {
    }

    public long getVideoProgress() {
        return this.brP;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void h_() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void i_() {
        ImageView imageView = this.VVE;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.tD = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.kqm = str;
    }

    private void JXs() {
        kqm kqmVarLxb = com.bytedance.sdk.openadsdk.core.lk.Lxb.Lxb(this.NXR.getExpectExpressWidth(), this.NXR.getExpectExpressHeight());
        if (this.NXR.getExpectExpressWidth() <= 0 || this.NXR.getExpectExpressHeight() <= 0) {
            int iLk = le.lk(this.LD);
            this.ebl = iLk;
            this.OY = Float.valueOf(iLk / kqmVarLxb.LD).intValue();
        } else {
            this.ebl = le.lk(this.LD, this.NXR.getExpectExpressWidth());
            this.OY = le.lk(this.LD, this.NXR.getExpectExpressHeight());
        }
        int i = this.ebl;
        if (i > 0 && i > le.lk(this.LD)) {
            float fLk = le.lk(this.LD) / this.ebl;
            this.ebl = le.lk(this.LD);
            this.OY = Float.valueOf(this.OY * fLk).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.ebl, this.OY);
        }
        layoutParams.width = this.ebl;
        layoutParams.height = this.OY;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        Lxb(kqmVarLxb);
    }

    private Lxb LD(kqm kqmVar) {
        Lxb lxb = new Lxb();
        lxb.Lxb = new FrameLayout(this.LD);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        lxb.Lxb.setLayoutParams(layoutParams);
        lxb.LD = new sLN(this.LD);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        lxb.LD.setLayoutParams(layoutParams2);
        lxb.Lxb.addView(lxb.LD);
        int iLk = le.lk(this.LD, 28.0f);
        int iLk2 = le.lk(this.LD, 12.0f);
        int iLk3 = le.lk(this.LD, 2.25f);
        int iLk4 = le.lk(this.LD, 5.0f);
        if (kqmVar != null && kqmVar.Lxb == 1) {
            iLk = iLk2;
        }
        if (kqmVar == null || kqmVar.Lxb != 1) {
            iLk3 = iLk4;
        }
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(getContext());
        lxb.lk = zu;
        zu.setPadding(iLk3, iLk3, iLk3, iLk3);
        lxb.lk.setBackground(com.bytedance.sdk.openadsdk.core.widget.ZU.Lxb());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iLk, iLk);
        layoutParams3.setMargins(iLk4, iLk4, iLk4, iLk4);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = lxb.lk;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        zu2.setScaleType(scaleType);
        lxb.lk.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(getContext(), "tt_reward_full_mute"));
        lxb.lk.setLayoutParams(layoutParams3);
        lxb.Lxb.addView(lxb.lk);
        if (kqmVar == null || kqmVar.Lxb != 1) {
            lxb.ZU = com.bytedance.sdk.openadsdk.core.widget.ebl.LD(getContext());
        } else {
            lxb.ZU = com.bytedance.sdk.openadsdk.core.widget.ebl.Lxb(getContext());
        }
        lxb.ZU.setId(520093697);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = GravityCompat.END;
        layoutParams4.setMargins(iLk4, iLk4, iLk4, iLk4);
        lxb.ZU.setLayoutParams(layoutParams4);
        lxb.Lxb.addView(lxb.ZU);
        lxb.JXs = new PAGLogoView(this.LD);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388691;
        layoutParams5.setMargins(iLk4, iLk4, iLk4, iLk4);
        lxb.JXs.setLayoutParams(layoutParams5);
        lxb.Lxb.addView(lxb.JXs);
        lxb.lc = new com.bytedance.sdk.openadsdk.core.JXs.ZU(this.LD);
        int iLk5 = le.lk(this.LD, 11.0f);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iLk5, iLk5);
        layoutParams6.gravity = 8388693;
        layoutParams6.rightMargin = iLk4;
        layoutParams6.bottomMargin = iLk4;
        lxb.lc.setVisibility(8);
        lxb.lc.setScaleType(scaleType);
        lxb.lc.setLayoutParams(layoutParams6);
        lxb.Lxb.addView(lxb.lc);
        return lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.Lxb
    public void Lxb(View view, int i, STP stp) {
        tD tDVar = this.NXR;
        if (tDVar != null) {
            tDVar.Lxb(view, i, stp);
            com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.IeN;
            if (lcVar == null || !(lcVar.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.NXR.LD.lk)) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.NXR.LD.lk) this.IeN.getNativeVideoController()).CG();
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, tD tDVar2, com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar) {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.lk = tDVar;
        this.NXR = tDVar2;
        this.STP = lcVar;
        this.lc = "banner_ad";
        tDVar2.addView(this, new ViewGroup.LayoutParams(-2, -2));
        JXs();
    }

    private void Lxb(kqm kqmVar) {
        View view;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar != null) {
            int iFGm = tDVar.FGm();
            Lxb lxbLD = LD(kqmVar);
            if (lxbLD == null || (view = lxbLD.Lxb) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.JXs.ZU zu = lxbLD.ZU;
            PAGLogoView pAGLogoView = lxbLD.JXs;
            com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = lxbLD.lc;
            if (zu2 != null && this.lk.OY()) {
                le.Lxb((View) zu2, 0);
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb((int) le.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 11.0f, true), zu2, this.lk);
            }
            this.VVE = lxbLD.lk;
            com.bytedance.sdk.openadsdk.core.NXR.LD.lc videoView = getVideoView();
            if (videoView instanceof com.bytedance.sdk.openadsdk.core.NXR.LD.lc) {
                this.IeN = videoView;
                videoView.setVideoAdLoadListener(this);
                this.IeN.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(zu, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(zu2, friendlyObstructionPurpose));
                arrayList.add(new Pair(this.VVE, FriendlyObstructionPurpose.VIDEO_CONTROLS));
                this.IeN.Lxb(arrayList);
                this.IeN.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.NXR.LD.lc.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.lk.ebl.1
                    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc.Lxb
                    public void Lxb(View view2, int i) {
                        if (ebl.this.tD != null) {
                            ebl.this.tD.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.ebl.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.Lxb(((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).LD, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).lk, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).lc);
                    }
                });
            }
            if (zu != null) {
                zu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.ebl.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        ebl.this.Lxb();
                    }
                });
                tD tDVar2 = this.NXR;
                if (tDVar2 != null) {
                    if (tDVar2.getClickListener() != null) {
                        this.NXR.getClickListener().LD(zu);
                    }
                    if (this.NXR.getClickCreativeListener() != null) {
                        this.NXR.getClickCreativeListener().LD(zu);
                    }
                }
            }
            ImageView imageView = this.VVE;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.ebl.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (ebl.this.IeN != null) {
                            boolean z = !ebl.this.IeN.QAg();
                            ebl eblVar = ebl.this;
                            Drawable drawableLk = z ? com.bytedance.sdk.component.utils.tD.lk(eblVar.getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.tD.lk(eblVar.getContext(), "tt_reward_full_unmute");
                            ebl.this.IeN.setIsQuiet(z);
                            ebl.this.VVE.setImageDrawable(drawableLk);
                            if (((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).lk == null || ((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).lk.SlV() == null || ((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).lk.SlV().Lxb() == null) {
                                return;
                            }
                            if (z) {
                                ((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).lk.SlV().Lxb().OY(ebl.this.brP);
                            } else {
                                ((com.bytedance.sdk.openadsdk.core.OY.Lxb) ebl.this).lk.SlV().Lxb().QAg(ebl.this.brP);
                            }
                        }
                    }
                });
            }
            sLN sln = lxbLD.LD;
            com.bytedance.sdk.openadsdk.core.model.tD tDVar3 = this.lk;
            if (tDVar3 != null && tDVar3.SlV() != null && sln != null) {
                int iSLN = this.lk.SlV().sLN();
                float fNXR = this.lk.SlV().NXR();
                if (iSLN > 0 && fNXR > 0.0f) {
                    sln.setRatio(iSLN / fNXR);
                } else if (iFGm == 15) {
                    sln.setRatio(0.5625f);
                } else if (iFGm == 5) {
                    sln.setRatio(1.7777778f);
                } else {
                    sln.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && sln != null) {
                sln.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            Lxb((View) videoView, true);
            Lxb((View) this, true);
            Lxb(sln);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.Lxb
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
            TTDelegateActivity.Lxb(this.lk, this.kqm);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0
    public void Lxb(int i, int i2) {
        ImageView imageView = this.VVE;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void Lxb(long j, long j2) {
        this.brP = j;
    }
}
