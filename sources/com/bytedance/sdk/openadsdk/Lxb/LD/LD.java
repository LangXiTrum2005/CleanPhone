package com.bytedance.sdk.openadsdk.Lxb.LD;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.VVE;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends OY implements Ho0, Lo0, com.bytedance.sdk.openadsdk.multipro.LD.Lxb.InterfaceC0115Lxb {
    private boolean JVA;
    private long NXR;
    private lk OY;
    private final com.bytedance.sdk.openadsdk.multipro.LD.Lxb QAg;
    private boolean nBu;
    private AdSlot sLN;

    public LD(@NonNull Context context, @NonNull tD tDVar, int i, AdSlot adSlot) {
        super(context, tDVar, i, true);
        this.nBu = false;
        this.JVA = true;
        this.JXs = i;
        this.sLN = adSlot;
        this.QAg = new com.bytedance.sdk.openadsdk.multipro.LD.Lxb();
        Lxb(this.lc);
        Lxb("embeded_ad");
        this.ZU.Lxb(this);
    }

    public View JXs() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar;
        tD tDVar = this.LD;
        if (tDVar != null && this.lk != null) {
            if (tD.JXs(tDVar)) {
                try {
                    lcVar = new com.bytedance.sdk.openadsdk.core.NXR.LD.lc(this.lk, this.LD, this.Lxb.Lxb());
                    tD tDVar2 = this.LD;
                    if (tDVar2 != null && tDVar2.chu()) {
                        com.bytedance.sdk.openadsdk.core.sLN.lc lcVarLxb = lcVar.Lxb((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        Lxb lxb = this.ZU;
                        if (lxb != null) {
                            lxb.Lxb(lcVarLxb);
                        }
                    }
                    this.Lxb.Lxb(lcVar.getNativeVideoController());
                    Lxb lxb2 = this.ZU;
                    if (lxb2 != null) {
                        lxb2.Lxb(lcVar);
                    }
                    lcVar.setVideoAdClickListenerTTNativeAd(this);
                    lcVar.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.NXR.LD.lc.Lxb() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.LD.1
                        @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc.Lxb
                        public void Lxb(View view, int i) {
                            VVE vve = LD.this.Lxb;
                            if (vve != null) {
                                vve.Lxb(view, i);
                            }
                        }
                    });
                    lcVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.NXR.LD.lc.LD() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.LD.2
                        @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc.LD
                        public void Lxb(boolean z, long j, long j2, long j3, boolean z2) {
                            LD.this.QAg.Lxb = z;
                            LD.this.QAg.JXs = j;
                            LD.this.QAg.lc = j2;
                            LD.this.QAg.ebl = j3;
                            LD.this.QAg.ZU = z2;
                        }
                    });
                    lcVar.setVideoAdLoadListener(this);
                    lcVar.setVideoAdInteractionListener(this);
                    if (5 == this.JXs) {
                        lcVar.setIsAutoPlay(this.nBu ? this.sLN.isAutoPlay() : this.JVA);
                    } else {
                        lcVar.setIsAutoPlay(this.JVA);
                    }
                    lcVar.setIsQuiet(kqm.ZU().lk(String.valueOf(this.lc)));
                } catch (Exception e) {
                    ApmHelper.reportCustomError("", "getAdView null", e);
                    lcVar = null;
                }
            } else {
                lcVar = null;
            }
            if (tD.JXs(this.LD) && lcVar != null && lcVar.Lxb(0L, true, false)) {
                return lcVar;
            }
            ApmHelper.reportCustomError(this.LD.FGm() + "," + lcVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void d_() {
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.Lxb(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void g_() {
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.LD(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void h_() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void i_() {
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.lk(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.LD.Lxb.InterfaceC0115Lxb
    public com.bytedance.sdk.openadsdk.multipro.LD.Lxb lc() {
        return this.QAg;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.LD.OY, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        Lxb lxb = this.ZU;
        if (lxb != null) {
            lxb.sLN();
        }
    }

    private void Lxb(int i) {
        int iLD = kqm.ZU().LD(i);
        int iLk = IeN.lk(kqm.Lxb());
        if (3 == iLD) {
            this.nBu = false;
            this.JVA = false;
        } else {
            if (1 == iLD && nJ.ZU(iLk)) {
                this.nBu = false;
            } else if (2 == iLD) {
                if (nJ.JXs(iLk) || nJ.ZU(iLk) || nJ.lc(iLk)) {
                    this.nBu = false;
                }
            } else if (4 == iLD) {
                this.nBu = true;
            } else if (5 == iLD && (nJ.ZU(iLk) || nJ.lc(iLk))) {
            }
            this.JVA = true;
        }
        Lxb lxb = this.ZU;
        if (lxb != null) {
            lxb.Lxb(this.nBu);
        }
    }

    public LD(@NonNull Context context, @NonNull tD tDVar, int i, AdSlot adSlot, Lxb lxb, VVE vve) {
        super(context, tDVar, i, false);
        this.nBu = false;
        this.JVA = true;
        this.ZU = lxb;
        this.Lxb = vve;
        this.JXs = i;
        this.sLN = adSlot;
        this.QAg = new com.bytedance.sdk.openadsdk.multipro.LD.Lxb();
        Lxb(this.lc);
        Lxb("embeded_ad");
        lxb.Lxb(this);
    }

    public void Lxb(lk lkVar) {
        this.OY = lkVar;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0
    public void Lxb(int i, int i2) {
        lk lkVar = this.OY;
        if (lkVar != null) {
            lkVar.Lxb(i, i2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0
    public void Lxb(long j, long j2) {
        this.NXR = j;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.LD.OY
    public void Lxb(String str) {
        super.Lxb(str);
    }
}
