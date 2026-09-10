package com.bytedance.sdk.openadsdk.qdl.ud;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.jtx;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends jpc implements com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.mml, com.bytedance.sdk.openadsdk.multipro.ud.qdl.InterfaceC0150qdl {
    private long exu;
    private AdSlot fs;
    private lnr jpc;
    private boolean rq;
    private boolean to;
    private final com.bytedance.sdk.openadsdk.multipro.ud.qdl tvp;

    public ud(Context context, ljh ljhVar, int i2, AdSlot adSlot) {
        super(context, ljhVar, i2, true);
        this.to = false;
        this.rq = true;
        this.mzz = i2;
        this.fs = adSlot;
        this.tvp = new com.bytedance.sdk.openadsdk.multipro.ud.qdl();
        qdl(this.mo);
        qdl("embeded_ad");
        this.mml.qdl(this);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void e_() {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.qdl(this);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void f_() {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.ud(this);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void g_() {
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void h_() {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.lnr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ud.qdl.InterfaceC0150qdl
    public com.bytedance.sdk.openadsdk.multipro.ud.qdl mo() {
        return this.tvp;
    }

    public View mzz() {
        com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar;
        ljh ljhVar = this.ud;
        if (ljhVar != null && this.lnr != null) {
            if (ljh.mzz(ljhVar)) {
                try {
                    moVar = new com.bytedance.sdk.openadsdk.core.exu.ud.mo(this.lnr, this.ud, this.qdl.qdl());
                    ljh ljhVar2 = this.ud;
                    if (ljhVar2 != null && ljhVar2.uj()) {
                        com.bytedance.sdk.openadsdk.core.fs.mo moVarQdl = moVar.qdl((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        qdl qdlVar = this.mml;
                        if (qdlVar != null) {
                            qdlVar.qdl(moVarQdl);
                        }
                    }
                    this.qdl.qdl(moVar.getNativeVideoController());
                    qdl qdlVar2 = this.mml;
                    if (qdlVar2 != null) {
                        qdlVar2.qdl(moVar);
                    }
                    moVar.setVideoAdClickListenerTTNativeAd(this);
                    moVar.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.exu.ud.mo.qdl() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.ud.1
                        @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.qdl
                        public void qdl(View view, int i2) {
                            jtx jtxVar = ud.this.qdl;
                            if (jtxVar != null) {
                                jtxVar.qdl(view, i2);
                            }
                        }
                    });
                    moVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.exu.ud.mo.ud() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.ud.2
                        @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.ud
                        public void qdl(boolean z2, long j, long j2, long j3, boolean z3) {
                            ud.this.tvp.qdl = z2;
                            ud.this.tvp.mzz = j;
                            ud.this.tvp.mo = j2;
                            ud.this.tvp.wd = j3;
                            ud.this.tvp.mml = z3;
                        }
                    });
                    moVar.setVideoAdLoadListener(this);
                    moVar.setVideoAdInteractionListener(this);
                    if (5 == this.mzz) {
                        moVar.setIsAutoPlay(this.to ? this.fs.isAutoPlay() : this.rq);
                    } else {
                        moVar.setIsAutoPlay(this.rq);
                    }
                    moVar.qdl(yt.mml().lnr(String.valueOf(this.mo)), "feedGetAdView");
                } catch (Exception e2) {
                    ApmHelper.reportCustomError("", "getAdView null", e2);
                    moVar = null;
                }
            } else {
                moVar = null;
            }
            if (ljh.mzz(this.ud) && moVar != null && moVar.qdl(0L, true, false)) {
                return moVar;
            }
            ApmHelper.reportCustomError(this.ud.vxg() + "," + moVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.jpc, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        qdl qdlVar = this.mml;
        if (qdlVar != null) {
            qdlVar.fs();
        }
    }

    private void qdl(int i2) {
        int iUd = yt.mml().ud(i2);
        int iLnr = jl.lnr(yt.qdl());
        if (3 == iUd) {
            this.to = false;
            this.rq = false;
        } else {
            if (1 == iUd && gy.mml(iLnr)) {
                this.to = false;
            } else if (2 == iUd) {
                if (gy.mzz(iLnr) || gy.mml(iLnr) || gy.mo(iLnr)) {
                    this.to = false;
                }
            } else if (4 == iUd) {
                this.to = true;
            } else if (5 == iUd && (gy.mml(iLnr) || gy.mo(iLnr))) {
            }
            this.rq = true;
        }
        qdl qdlVar = this.mml;
        if (qdlVar != null) {
            qdlVar.qdl(this.to);
        }
    }

    public ud(Context context, ljh ljhVar, int i2, AdSlot adSlot, qdl qdlVar, jtx jtxVar) {
        super(context, ljhVar, i2, false);
        this.to = false;
        this.rq = true;
        this.mml = qdlVar;
        this.qdl = jtxVar;
        this.mzz = i2;
        this.fs = adSlot;
        this.tvp = new com.bytedance.sdk.openadsdk.multipro.ud.qdl();
        qdl(this.mo);
        qdl("embeded_ad");
        qdlVar.qdl(this);
    }

    public void qdl(lnr lnrVar) {
        this.jpc = lnrVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.mml
    public void qdl(int i2, int i3) {
        lnr lnrVar = this.jpc;
        if (lnrVar != null) {
            lnrVar.qdl(i2, i3);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void qdl(long j, long j2) {
        this.exu = j;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.jpc
    public void qdl(String str) {
        super.qdl(str);
    }
}
