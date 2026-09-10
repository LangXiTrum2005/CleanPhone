package com.bytedance.sdk.openadsdk.ri.lr;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.bu;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import euthanasia.attabal;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends mj implements attabal.InterfaceC0605attabal, attabal.saneness, com.bytedance.sdk.openadsdk.tan.ik.ri.InterfaceC0276ri {
    private long aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private AdSlot f18160co;
    private final com.bytedance.sdk.openadsdk.tan.ik.ri jbs;
    private ik mj;
    private boolean qt;
    private boolean sf;

    public lr(Context context, wjv wjvVar, int i, AdSlot adSlot) {
        super(context, wjvVar, i, true);
        this.qt = false;
        this.sf = true;
        this.fi = i;
        this.f18160co = adSlot;
        this.jbs = new com.bytedance.sdk.openadsdk.tan.ik.ri();
        ri(this.di);
        ri("embeded_ad");
        this.ka.ri(this);
    }

    @Override // com.bytedance.sdk.openadsdk.tan.ik.ri.InterfaceC0276ri
    public com.bytedance.sdk.openadsdk.tan.ik.ri di() {
        return this.jbs;
    }

    public View fi() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar;
        wjv wjvVar = this.lr;
        if (wjvVar != null && this.ik != null) {
            if (wjv.fi(wjvVar)) {
                try {
                    diVar = new com.bytedance.sdk.openadsdk.core.bgr.lr.di(this.ik, this.lr, this.ri.ri());
                    wjv wjvVar2 = this.lr;
                    if (wjvVar2 != null && wjvVar2.zz()) {
                        com.bytedance.sdk.openadsdk.core.aw.di diVarRi = diVar.ri((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        ri riVar = this.ka;
                        if (riVar != null) {
                            riVar.ri(diVarRi);
                        }
                    }
                    this.ri.ri(diVar.getNativeVideoController());
                    ri riVar2 = this.ka;
                    if (riVar2 != null) {
                        riVar2.ri(diVar);
                    }
                    diVar.setVideoAdClickListenerTTNativeAd(this);
                    diVar.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.bgr.lr.di.ri() { // from class: com.bytedance.sdk.openadsdk.ri.lr.lr.1
                        @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di.ri
                        public void ri(View view, int i) {
                            bu buVar = lr.this.ri;
                            if (buVar != null) {
                                buVar.ri(view, i);
                            }
                        }
                    });
                    diVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.bgr.lr.di.lr() { // from class: com.bytedance.sdk.openadsdk.ri.lr.lr.2
                        @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di.lr
                        public void ri(boolean z, long j, long j2, long j3, boolean z2) {
                            lr.this.jbs.ri = z;
                            lr.this.jbs.fi = j;
                            lr.this.jbs.di = j2;
                            lr.this.jbs.xha = j3;
                            lr.this.jbs.ka = z2;
                        }
                    });
                    diVar.setVideoAdLoadListener(this);
                    diVar.setVideoAdInteractionListener(this);
                    if (5 == this.fi) {
                        diVar.setIsAutoPlay(this.qt ? this.f18160co.isAutoPlay() : this.sf);
                    } else {
                        diVar.setIsAutoPlay(this.sf);
                    }
                    diVar.ri(nr.ka().ik(String.valueOf(this.di)), "feedGetAdView");
                } catch (Exception e) {
                    ApmHelper.reportCustomError("", "getAdView null", e);
                    diVar = null;
                }
            } else {
                diVar = null;
            }
            if (wjv.fi(this.lr) && diVar != null && diVar.ri(0L, true, false)) {
                return diVar;
            }
            ApmHelper.reportCustomError(this.lr.vz() + "," + diVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void g_() {
        ik ikVar = this.mj;
        if (ikVar != null) {
            ikVar.ri(this);
        }
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void h_() {
        ik ikVar = this.mj;
        if (ikVar != null) {
            ikVar.lr(this);
        }
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void j_() {
        ik ikVar = this.mj;
        if (ikVar != null) {
            ikVar.ik(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ri.lr.mj, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        ri riVar = this.ka;
        if (riVar != null) {
            riVar.co();
        }
    }

    private void ri(int i) {
        int iLr = nr.ka().lr(i);
        int iIk = com.bytedance.sdk.component.utils.nr.ik(nr.ri());
        if (3 == iLr) {
            this.qt = false;
            this.sf = false;
        } else {
            if (1 == iLr && ig.ka(iIk)) {
                this.qt = false;
            } else if (2 == iLr) {
                if (ig.fi(iIk) || ig.ka(iIk) || ig.di(iIk)) {
                    this.qt = false;
                }
            } else if (4 == iLr) {
                this.qt = true;
            } else if (5 == iLr && (ig.ka(iIk) || ig.di(iIk))) {
            }
            this.sf = true;
        }
        ri riVar = this.ka;
        if (riVar != null) {
            riVar.ri(this.qt);
        }
    }

    public lr(Context context, wjv wjvVar, int i, AdSlot adSlot, ri riVar, bu buVar) {
        super(context, wjvVar, i, false);
        this.qt = false;
        this.sf = true;
        this.ka = riVar;
        this.ri = buVar;
        this.fi = i;
        this.f18160co = adSlot;
        this.jbs = new com.bytedance.sdk.openadsdk.tan.ik.ri();
        ri(this.di);
        ri("embeded_ad");
        riVar.ri(this);
    }

    public void ri(ik ikVar) {
        this.mj = ikVar;
    }

    @Override // euthanasia.attabal.saneness
    public void ri(int i, int i2) {
        ik ikVar = this.mj;
        if (ikVar != null) {
            ikVar.ri(i, i2);
        }
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void i_() {
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void ri(long j, long j2) {
        this.aw = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ri.lr.mj
    public void ri(String str) {
        super.ri(str);
    }
}
