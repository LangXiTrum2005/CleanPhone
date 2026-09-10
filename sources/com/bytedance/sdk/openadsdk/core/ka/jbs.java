package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.nr;
import com.bytedance.sdk.openadsdk.core.model.slm;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.co;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.material.card.MaterialCardView;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import euthanasia.attabal;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends com.bytedance.sdk.openadsdk.core.jbs.ri implements attabal.InterfaceC0605attabal, attabal.saneness {
    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik aw;
    private com.bytedance.sdk.openadsdk.core.bgr.lr.di bgr;
    private PAGBannerAdWrapperListener bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private ac f18128co;
    public boolean ri;
    private long slm;
    private String vr;

    public static class ri {
        public com.bytedance.sdk.openadsdk.core.di.ka fi;
        public com.bytedance.sdk.openadsdk.core.di.ka ik;
        public PAGLogoView ka;
        public co lr;
        public FrameLayout ri;

        private ri() {
        }
    }

    public jbs(Context context) {
        super(context);
        this.ri = true;
        this.lr = context;
    }

    private void fi() {
        nr nrVarRi = lr.ri(this.f18128co.getExpectExpressWidth(), this.f18128co.getExpectExpressHeight());
        if (this.f18128co.getExpectExpressWidth() <= 0 || this.f18128co.getExpectExpressHeight() <= 0) {
            int iIk = qd.ik(this.lr);
            this.xha = iIk;
            this.mj = Float.valueOf(iIk / nrVarRi.lr).intValue();
        } else {
            this.xha = qd.lr(this.lr, this.f18128co.getExpectExpressWidth());
            this.mj = qd.lr(this.lr, this.f18128co.getExpectExpressHeight());
        }
        int i = this.xha;
        if (i > 0 && i > qd.ik(this.lr)) {
            float fIk = qd.ik(this.lr) / this.xha;
            this.xha = qd.ik(this.lr);
            this.mj = Float.valueOf(this.mj * fIk).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xha, this.mj);
        }
        layoutParams.width = this.xha;
        layoutParams.height = this.mj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        ri(nrVarRi);
    }

    public long getVideoProgress() {
        return this.slm;
    }

    @Override // euthanasia.attabal.saneness
    public void ri(int i, int i2) {
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.bu = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.vr = str;
    }

    private ri lr(nr nrVar) {
        ri riVar = new ri();
        riVar.ri = new FrameLayout(this.lr);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        riVar.ri.setLayoutParams(layoutParams);
        riVar.lr = new co(this.lr);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        riVar.lr.setLayoutParams(layoutParams2);
        riVar.ri.addView(riVar.lr);
        int iLr = qd.lr(this.lr, 5.0f);
        if (nrVar == null || nrVar.ri != 1) {
            riVar.ik = com.bytedance.sdk.openadsdk.core.widget.di.lr(getContext());
        } else {
            riVar.ik = com.bytedance.sdk.openadsdk.core.widget.di.ri(getContext());
        }
        riVar.ik.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(iLr, iLr, iLr, iLr);
        riVar.ik.setLayoutParams(layoutParams3);
        riVar.ri.addView(riVar.ik);
        riVar.ka = PAGLogoView.createPAGLogoViewByMaterial(this.lr, this.ik);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
        layoutParams4.setMargins(iLr, iLr, iLr, iLr);
        riVar.ka.setLayoutParams(layoutParams4);
        riVar.ri.addView(riVar.ka);
        riVar.fi = new com.bytedance.sdk.openadsdk.core.di.ka(this.lr);
        int iLr2 = qd.lr(this.lr, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iLr2, iLr2);
        layoutParams5.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_END;
        layoutParams5.rightMargin = iLr;
        layoutParams5.bottomMargin = iLr;
        riVar.fi.setVisibility(8);
        riVar.fi.setScaleType(ImageView.ScaleType.FIT_CENTER);
        riVar.fi.setLayoutParams(layoutParams5);
        riVar.ri.addView(riVar.fi);
        return riVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ri
    public void ri(View view, int i, slm slmVar) {
        ac acVar = this.f18128co;
        if (acVar != null) {
            acVar.ri(view, i, slmVar);
            com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
            if (diVar == null || diVar.getNativeVideoController() == null) {
                return;
            }
            this.bgr.getNativeVideoController().pv();
        }
    }

    public void ri(wjv wjvVar, ac acVar, com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar) {
        setBackgroundColor(-16777216);
        this.ik = wjvVar;
        this.f18128co = acVar;
        this.aw = ikVar;
        this.di = "banner_ad";
        acVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        fi();
    }

    private void ri(nr nrVar) {
        View view;
        wjv wjvVar = this.ik;
        if (wjvVar != null) {
            int iVz = wjvVar.vz();
            ri riVarLr = lr(nrVar);
            if (riVarLr == null || (view = riVarLr.ri) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.di.ka kaVar = riVarLr.ik;
            PAGLogoView pAGLogoView = riVarLr.ka;
            com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = riVarLr.fi;
            if (kaVar2 != null && this.ik.wjv()) {
                qd.ri((View) kaVar2, 0);
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri((int) qd.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), 11.0f, true), kaVar2, this.ik);
            }
            com.bytedance.sdk.openadsdk.core.bgr.lr.di videoView = getVideoView();
            if (videoView != null) {
                this.bgr = videoView;
                videoView.setVideoAdLoadListener(this);
                this.bgr.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(kaVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(kaVar2, friendlyObstructionPurpose));
                this.bgr.ri(arrayList);
                this.bgr.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.bgr.lr.di.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.jbs.1
                    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di.ri
                    public void ri(View view2, int i) {
                        if (jbs.this.bu != null) {
                            jbs.this.bu.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.jbs.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.ri(((com.bytedance.sdk.openadsdk.core.jbs.ri) jbs.this).lr, ((com.bytedance.sdk.openadsdk.core.jbs.ri) jbs.this).ik, ((com.bytedance.sdk.openadsdk.core.jbs.ri) jbs.this).di);
                    }
                });
            }
            if (kaVar != null) {
                kaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.jbs.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        jbs.this.ri();
                    }
                });
            }
            co coVar = riVarLr.lr;
            wjv wjvVar2 = this.ik;
            if (wjvVar2 != null && wjvVar2.sr() != null && coVar != null) {
                int iQt = this.ik.sr().qt();
                float fSf = this.ik.sr().sf();
                if (iQt > 0 && fSf > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    coVar.setRatio(iQt / fSf);
                } else if (iVz == 15) {
                    coVar.setRatio(0.5625f);
                } else if (iVz == 5) {
                    coVar.setRatio(1.7777778f);
                } else {
                    coVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && coVar != null) {
                coVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            ri((View) videoView, true);
            ri((View) this, true);
            ri(coVar);
        }
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void g_() {
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void h_() {
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void i_() {
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void j_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ri
    public void ri() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fi;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.ik.ik ikVar = this.ka;
        if (ikVar != null) {
            ikVar.ri();
        } else {
            TTDelegateActivity.ri(this.ik, this.vr);
        }
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void ri(long j, long j2) {
        this.slm = j;
    }
}
