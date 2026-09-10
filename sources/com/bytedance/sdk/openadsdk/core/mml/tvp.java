package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.jtx;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.jl;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.fs;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends com.bytedance.sdk.openadsdk.core.tvp.qdl implements com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.mml {
    private com.bytedance.sdk.openadsdk.core.exu.ud.mo bjy;
    private aaj exu;
    private PAGBannerAdWrapperListener jl;
    private String jtx;
    public boolean qdl;
    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo rdp;
    private long yt;

    public static class qdl {
        public com.bytedance.sdk.openadsdk.core.mo.mml lnr;
        public PAGLogoView mml;
        public com.bytedance.sdk.openadsdk.core.mo.mml mzz;
        public FrameLayout qdl;
        public fs ud;

        private qdl() {
        }
    }

    public tvp(Context context) {
        super(context);
        this.qdl = true;
        this.ud = context;
    }

    private void mzz() {
        jl jlVarQdl = ud.qdl(this.exu.getExpectExpressWidth(), this.exu.getExpectExpressHeight());
        if (this.exu.getExpectExpressWidth() <= 0 || this.exu.getExpectExpressHeight() <= 0) {
            int iLnr = ax.lnr(this.ud);
            this.wd = iLnr;
            this.jpc = Float.valueOf(iLnr / jlVarQdl.ud).intValue();
        } else {
            this.wd = ax.ud(this.ud, this.exu.getExpectExpressWidth());
            this.jpc = ax.ud(this.ud, this.exu.getExpectExpressHeight());
        }
        int i2 = this.wd;
        if (i2 > 0 && i2 > ax.lnr(this.ud)) {
            float fLnr = ax.lnr(this.ud) / this.wd;
            this.wd = ax.lnr(this.ud);
            this.jpc = Float.valueOf(this.jpc * fLnr).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.wd, this.jpc);
        }
        layoutParams.width = this.wd;
        layoutParams.height = this.jpc;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        qdl(jlVarQdl);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void e_() {
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void f_() {
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void g_() {
    }

    public long getVideoProgress() {
        return this.yt;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void h_() {
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.mml
    public void qdl(int i2, int i3) {
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.jl = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.jtx = str;
    }

    private qdl ud(jl jlVar) {
        qdl qdlVar = new qdl();
        qdlVar.qdl = new FrameLayout(this.ud);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        qdlVar.qdl.setLayoutParams(layoutParams);
        qdlVar.ud = new fs(this.ud);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        qdlVar.ud.setLayoutParams(layoutParams2);
        qdlVar.qdl.addView(qdlVar.ud);
        int iUd = ax.ud(this.ud, 5.0f);
        if (jlVar == null || jlVar.qdl != 1) {
            qdlVar.lnr = com.bytedance.sdk.openadsdk.core.widget.mo.ud(getContext());
        } else {
            qdlVar.lnr = com.bytedance.sdk.openadsdk.core.widget.mo.qdl(getContext());
        }
        qdlVar.lnr.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(iUd, iUd, iUd, iUd);
        qdlVar.lnr.setLayoutParams(layoutParams3);
        qdlVar.qdl.addView(qdlVar.lnr);
        qdlVar.mml = PAGLogoView.createPAGLogoViewByMaterial(this.ud, this.lnr);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(iUd, iUd, iUd, iUd);
        qdlVar.mml.setLayoutParams(layoutParams4);
        qdlVar.qdl.addView(qdlVar.mml);
        qdlVar.mzz = new com.bytedance.sdk.openadsdk.core.mo.mml(this.ud);
        int iUd2 = ax.ud(this.ud, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iUd2, iUd2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = iUd;
        layoutParams5.bottomMargin = iUd;
        qdlVar.mzz.setVisibility(8);
        qdlVar.mzz.setScaleType(ImageView.ScaleType.FIT_CENTER);
        qdlVar.mzz.setLayoutParams(layoutParams5);
        qdlVar.qdl.addView(qdlVar.mzz);
        return qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.qdl
    public void qdl(View view, int i2, jtx jtxVar) {
        aaj aajVar = this.exu;
        if (aajVar != null) {
            aajVar.qdl(view, i2, jtxVar);
            com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar = this.bjy;
            if (moVar == null || moVar.getNativeVideoController() == null) {
                return;
            }
            this.bjy.getNativeVideoController().mrf();
        }
    }

    public void qdl(ljh ljhVar, aaj aajVar, com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar) {
        setBackgroundColor(-16777216);
        this.lnr = ljhVar;
        this.exu = aajVar;
        this.rdp = moVar;
        this.mo = "banner_ad";
        aajVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        mzz();
    }

    private void qdl(jl jlVar) {
        View view;
        ljh ljhVar = this.lnr;
        if (ljhVar != null) {
            int iVxg = ljhVar.vxg();
            qdl qdlVarUd = ud(jlVar);
            if (qdlVarUd == null || (view = qdlVarUd.qdl) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = qdlVarUd.lnr;
            PAGLogoView pAGLogoView = qdlVarUd.mml;
            com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = qdlVarUd.mzz;
            if (mmlVar2 != null && this.lnr.exc()) {
                ax.qdl((View) mmlVar2, 0);
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl((int) ax.qdl(yt.qdl(), 11.0f, true), mmlVar2, this.lnr);
            }
            com.bytedance.sdk.openadsdk.core.exu.ud.mo videoView = getVideoView();
            if (videoView != null) {
                this.bjy = videoView;
                videoView.setVideoAdLoadListener(this);
                this.bjy.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(mmlVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(mmlVar2, friendlyObstructionPurpose));
                this.bjy.qdl(arrayList);
                this.bjy.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.exu.ud.mo.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mml.tvp.1
                    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.qdl
                    public void qdl(View view2, int i2) {
                        if (tvp.this.jl != null) {
                            tvp.this.jl.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.tvp.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.qdl(((com.bytedance.sdk.openadsdk.core.tvp.qdl) tvp.this).ud, ((com.bytedance.sdk.openadsdk.core.tvp.qdl) tvp.this).lnr, ((com.bytedance.sdk.openadsdk.core.tvp.qdl) tvp.this).mo);
                    }
                });
            }
            if (mmlVar != null) {
                mmlVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.tvp.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        tvp.this.qdl();
                    }
                });
            }
            fs fsVar = qdlVarUd.ud;
            ljh ljhVar2 = this.lnr;
            if (ljhVar2 != null && ljhVar2.aoy() != null && fsVar != null) {
                int iRq = this.lnr.aoy().rq();
                float fFs = this.lnr.aoy().fs();
                if (iRq > 0 && fFs > 0.0f) {
                    fsVar.setRatio(iRq / fFs);
                } else if (iVxg == 15) {
                    fsVar.setRatio(0.5625f);
                } else if (iVxg == 5) {
                    fsVar.setRatio(1.7777778f);
                } else {
                    fsVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && fsVar != null) {
                fsVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            qdl((View) videoView, true);
            qdl((View) this, true);
            qdl(fsVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.qdl
    public void qdl() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.mzz;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lnr.lnr lnrVar = this.mml;
        if (lnrVar != null) {
            lnrVar.qdl();
        } else {
            TTDelegateActivity.qdl(this.lnr, this.jtx);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void qdl(long j, long j2) {
        this.yt = j;
    }
}
