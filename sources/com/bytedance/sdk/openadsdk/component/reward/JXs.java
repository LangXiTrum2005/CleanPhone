package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.HD;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.Sfi;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.CG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile JXs Lxb;
    private com.bytedance.sdk.component.OY.OY JXs;
    private final Context LD;
    private final AtomicBoolean lk = new AtomicBoolean(false);
    private final List<lk> ZU = Collections.synchronizedList(new ArrayList());
    private final HD.Lxb lc = new HD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.7
        @Override // com.bytedance.sdk.component.utils.HD.Lxb
        public void Lxb(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (JXs.this.JXs == null) {
                    JXs jXs = JXs.this;
                    jXs.JXs = new com.bytedance.sdk.openadsdk.component.reward.LD("fsv net connect task", jXs.ZU);
                }
                com.bytedance.sdk.component.utils.ebl.Lxb().post(JXs.this.JXs);
            }
        }
    };

    public static class LD implements PAGInterstitialAdLoadListener {
        private final AtomicBoolean LD;
        private final PAGInterstitialAdLoadListener Lxb;
        private final com.bytedance.sdk.openadsdk.core.model.Lxb ZU;
        private final AtomicInteger lk;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
        public void onError(int i, String str) {
            if (this.lk.decrementAndGet() > 0 || !this.LD.compareAndSet(false, true)) {
                return;
            }
            this.Lxb.onError(i, str);
            com.bytedance.sdk.openadsdk.STP.lk.Lxb("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.LD.1
                @Override // com.bytedance.sdk.openadsdk.STP.LD
                @Nullable
                public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", LD.this.ZU.LD());
                    return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("choose_ad_load_error").LD(jSONObject.toString());
                }
            });
        }

        private LD(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
            this.LD = new AtomicBoolean(false);
            this.Lxb = pAGInterstitialAdLoadListener;
            this.ZU = lxb;
            this.lk = new AtomicInteger(Lxb());
        }

        private int Lxb() {
            if (!this.ZU.JXs()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.ZU.ZU().size(); i2++) {
                tD tDVar = this.ZU.ZU().get(i2);
                if (tDVar != null && !eK.lk(tDVar) && tDVar.JJ() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.lk.decrementAndGet();
            if (this.Lxb == null || !this.LD.compareAndSet(false, true)) {
                return;
            }
            this.Lxb.onAdLoaded(pAGInterstitialAd);
        }
    }

    public static class Lxb implements PAGInterstitialAdLoadListener {
        private final boolean JXs;
        private final AdSlot LD;
        private final Context Lxb;
        private final PAGInterstitialAdLoadListener ZU;
        private final com.bytedance.sdk.openadsdk.core.model.Lxb lk;

        public Lxb(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z) {
            this.Lxb = context;
            this.LD = adSlot;
            this.lk = lxb;
            this.ZU = pAGInterstitialAdLoadListener;
            this.JXs = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            JXs.Lxb(this.Lxb).Lxb(this.LD, this.lk, this.ZU, pAGInterstitialAd, this.JXs);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
        public void onError(int i, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.ZU;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i, str);
            }
        }
    }

    public static class lk extends com.bytedance.sdk.component.OY.OY {
        final AdSlot LD;
        final tD Lxb;
        final com.bytedance.sdk.openadsdk.core.model.Lxb lk;

        public lk(tD tDVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
            super("Fullscreen Task");
            this.Lxb = tDVar;
            this.LD = adSlot;
            this.lk = lxb;
        }

        @Override // java.lang.Runnable
        public void run() {
            tD tDVar = this.Lxb;
            if (tDVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23) {
                ZU.Lxb(kqm.Lxb()).Lxb(this.Lxb, new com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.lk.2
                    @Override // com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb
                    public void Lxb(boolean z, Object obj) {
                        if (z) {
                            ZU zuLxb = ZU.Lxb(kqm.Lxb());
                            lk lkVar = lk.this;
                            zuLxb.Lxb(lkVar.LD, lkVar.lk);
                        }
                    }
                });
            } else if (tDVar.JJ() != null) {
                com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(this.Lxb.tv())).b(), this.Lxb);
                ldLxb.Lxb("material_meta", this.Lxb);
                ldLxb.Lxb("ad_slot", this.LD);
                com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new PG() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.lk.1
                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo0, int i, String str) {
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo0, int i) {
                        ZU zuLxb = ZU.Lxb(kqm.Lxb());
                        lk lkVar = lk.this;
                        zuLxb.Lxb(lkVar.LD, lkVar.lk);
                    }
                });
            }
        }
    }

    private JXs(Context context) {
        this.LD = context == null ? kqm.Lxb() : context.getApplicationContext();
        lk();
    }

    private void ZU() {
        if (this.lk.get()) {
            this.lk.set(false);
            try {
                HD.Lxb(this.lc);
            } catch (Exception unused) {
            }
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.JXs != null) {
            try {
                com.bytedance.sdk.component.utils.ebl.Lxb().removeCallbacks(this.JXs);
            } catch (Exception unused) {
            }
            this.JXs = null;
        }
        ZU();
    }

    private void LD(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.Lxb Lxb2;
        CG cgLD = CG.LD();
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) || (Lxb2 = ZU.Lxb(this.LD).Lxb(adSlot.getCodeId(), true)) == null || !Lxb2.JXs()) {
            Lxb(adSlot, false, cgLD, pAGInterstitialAdLoadListener);
            return;
        }
        tD tDVarLc = Lxb2.lc();
        for (tD tDVar : Lxb2.ZU()) {
            if (tDVar.hg() == null) {
                tDVar.Lxb(adSlot);
            }
        }
        NXR nxr = new NXR(this.LD, Lxb2);
        if (!Lxb2.ebl() && !eK.lk(tDVarLc)) {
            nxr.LD();
        }
        if (pAGInterstitialAdLoadListener != null) {
            if (!Lxb2.ebl() && kqm.ZU().tD() == 0) {
                Lxb(adSlot, Lxb2, pAGInterstitialAdLoadListener, nxr.Lxb(), true);
            }
            LD ld = new LD(new Lxb(this.LD, adSlot, Lxb2, pAGInterstitialAdLoadListener, true), Lxb2);
            for (int i = 0; i < Lxb2.ZU().size(); i++) {
                Lxb(Lxb2.ZU().get(i), adSlot, ld, cgLD, nxr, Lxb2.ebl());
                if (Lxb2.sLN()) {
                    break;
                }
            }
        }
        for (int i2 = 0; i2 < Lxb2.ZU().size(); i2++) {
            com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(Lxb2.ZU().get(i2), new com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.InterfaceC0098Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.1
            });
        }
    }

    private void lk() {
        if (this.lk.get()) {
            return;
        }
        this.lk.set(true);
        HD.Lxb(this.lc, this.LD);
    }

    public static JXs Lxb(Context context) {
        if (Lxb == null) {
            synchronized (JXs.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new JXs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public void Lxb() {
        try {
            ZU.Lxb(this.LD).Lxb();
        } catch (Throwable unused) {
        }
    }

    public void Lxb(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm()) || ZU.Lxb(this.LD).Lxb(adSlot.getCodeId(), false) != null) {
            return;
        }
        Lxb(adSlot, true, CG.LD(), null);
    }

    public void Lxb(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        LD(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, boolean z) {
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
        int iLD = LD();
        if (!z) {
            if (iLD == 2) {
                ZU.Lxb(this.LD).Lxb(adSlot, lxb);
                LD(adSlot);
                return;
            }
            return;
        }
        if (iLD == 2) {
            LD(adSlot);
        } else if (iLD == 1) {
            ZU.Lxb(this.LD).Lxb(adSlot.getCodeId(), (tD) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    private void Lxb(tD tDVar, AdSlot adSlot, final LD ld, CG cg, final NXR nxr, final boolean z) {
        boolean z2;
        if (ld != null) {
            z2 = true;
            if (!z && kqm.ZU().tD() != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (eK.lk(tDVar) || !tD.JXs(tDVar) || Build.VERSION.SDK_INT < 23) {
            if (z2) {
                ld.onAdLoaded(nxr.Lxb());
            }
        } else {
            tDVar.JJ();
            com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(tDVar.tv())).b(), tDVar);
            ldLxb.Lxb("material_meta", tDVar);
            ldLxb.Lxb("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new PG() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.2
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                public void Lxb(Uo0 uo0, int i) {
                    if (ld != null) {
                        if (z || kqm.ZU().tD() == 1) {
                            ld.onAdLoaded(nxr.Lxb());
                        }
                    }
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                public void Lxb(Uo0 uo0, int i, String str) {
                    if (ld != null) {
                        if (z || kqm.ZU().tD() == 1) {
                            ld.onError(i, str);
                        }
                    }
                }
            });
        }
    }

    private void LD(AdSlot adSlot) {
        if (LD() != 2) {
            return;
        }
        ZU.Lxb(this.LD).Lxb(adSlot.getCodeId());
    }

    public static int LD() {
        return com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("ivrv_load_ad_cache_strategy", 0);
    }

    private void Lxb(final AdSlot adSlot, final boolean z, final CG cg, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Sfi sfi = new Sfi();
        sfi.lk = z ? 2 : 1;
        if (kqm.ZU().sLN(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sfi.OY = 2;
        }
        kqm.lk().Lxb(adSlot, sfi, 8, new com.bytedance.sdk.openadsdk.core.tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.3
            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(int i, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (z || (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) == null) {
                    return;
                }
                pAGInterstitialAdLoadListener2.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (lxb.ZU() != null && !lxb.ZU().isEmpty()) {
                    NXR nxr = new NXR(JXs.this.LD, lxb);
                    if (!z) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.tD.Lxb.ZU.Lxb().Lxb(lxb.ZU().isEmpty() ? null : lxb.ZU().get(0));
                            com.bytedance.sdk.openadsdk.STP.lk.Lxb(lxb.lc(), System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        if (!lxb.ebl() && pAGInterstitialAdLoadListener != null && kqm.ZU().tD() == 0) {
                            JXs.this.Lxb(adSlot, lxb, pAGInterstitialAdLoadListener, nxr.Lxb(), false);
                        }
                    }
                    LD ld2 = new LD(new Lxb(JXs.this.LD, adSlot, lxb, pAGInterstitialAdLoadListener, false), lxb);
                    for (int i = 0; i < lxb.ZU().size(); i++) {
                        JXs.this.Lxb(lxb, lxb.ZU().get(i), nxr, adSlot, z, cg, ld2, lxb.ebl());
                        if (lxb.sLN()) {
                            return;
                        }
                    }
                    return;
                }
                if (z || (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) == null) {
                    return;
                }
                pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.OY.Lxb(-3));
                ld.Lxb(-3);
                com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final com.bytedance.sdk.openadsdk.core.model.Lxb lxb, tD tDVar, final NXR nxr, final AdSlot adSlot, final boolean z, CG cg, final LD ld, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(tDVar, new com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.InterfaceC0098Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.4
        });
        boolean z3 = true;
        if (z && !eK.lk(tDVar) && tD.JXs(tDVar) && kqm.ZU().foI(adSlot.getCodeId()).ZU == 1 && !IeN.ZU(this.LD)) {
            Lxb(new lk(tDVar, adSlot, lxb));
            return;
        }
        if (ld == null || (!z2 && kqm.ZU().tD() != 1)) {
            z3 = false;
        }
        if (eK.lk(tDVar)) {
            if (z) {
                ZU.Lxb(this.LD).Lxb(adSlot, lxb);
            }
        } else if (tD.JXs(tDVar)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (tDVar.JJ() != null) {
                    com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(tDVar.tv())).b(), tDVar);
                    ldLxb.Lxb("material_meta", tDVar);
                    ldLxb.Lxb("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new PG() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.5
                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                        public void Lxb(Uo0 uo0, int i) {
                            nxr.LD();
                            if (z) {
                                ZU.Lxb(JXs.this.LD).Lxb(adSlot, lxb);
                            } else if (ld != null) {
                                if (z2 || kqm.ZU().tD() == 1) {
                                    ld.onAdLoaded(nxr.Lxb());
                                }
                            }
                        }

                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                        public void Lxb(Uo0 uo0, int i, String str) {
                            if (ld != null) {
                                if (z2 || kqm.ZU().tD() == 1) {
                                    ld.onError(i, str);
                                }
                            }
                        }
                    });
                    return;
                }
            } else {
                ZU.Lxb(this.LD).Lxb(tDVar, new com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.JXs.6
                    @Override // com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb
                    public void Lxb(boolean z4, Object obj) {
                        if (z4) {
                            nxr.LD();
                        }
                        if (z) {
                            if (z4) {
                                ZU.Lxb(JXs.this.LD).Lxb(adSlot, lxb);
                            }
                        } else {
                            if (z4) {
                                if (ld != null) {
                                    if (z2 || kqm.ZU().tD() == 1) {
                                        ld.onAdLoaded(nxr.Lxb());
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (ld != null) {
                                if (z2 || kqm.ZU().tD() == 1) {
                                    ld.onError(-1, "");
                                }
                            }
                        }
                    }
                });
                return;
            }
        } else if (z) {
            ZU.Lxb(this.LD).Lxb(adSlot, lxb);
        }
        if (z3) {
            ld.onAdLoaded(nxr.Lxb());
        }
    }

    private void Lxb(lk lkVar) {
        if (lkVar == null) {
            return;
        }
        if (this.ZU.size() > 0) {
            this.ZU.remove(0);
        }
        this.ZU.add(lkVar);
    }

    public void Lxb(String str, tD tDVar) {
        ZU.Lxb(this.LD).Lxb(str, tDVar);
    }
}
