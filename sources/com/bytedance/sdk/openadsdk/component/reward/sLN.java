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
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.Sfi;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sLN {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile sLN Lxb;
    private com.bytedance.sdk.component.OY.OY JXs;
    private final Context LD;
    private final AtomicBoolean lk = new AtomicBoolean(false);
    private final List<LD> ZU = Collections.synchronizedList(new ArrayList());
    private final HD.Lxb lc = new HD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.7
        @Override // com.bytedance.sdk.component.utils.HD.Lxb
        public void Lxb(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (sLN.this.JXs == null) {
                    sLN sln = sLN.this;
                    sln.JXs = new com.bytedance.sdk.openadsdk.component.reward.LD("net connect task", sln.ZU);
                }
                com.bytedance.sdk.component.utils.ebl.Lxb().post(sLN.this.JXs);
            }
        }
    };

    public static class LD extends com.bytedance.sdk.component.OY.OY {
        final AdSlot LD;
        final tD Lxb;
        final com.bytedance.sdk.openadsdk.core.model.Lxb lk;

        public LD(tD tDVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
            super("Reward Task");
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
                JVA.Lxb(kqm.Lxb()).Lxb(this.Lxb, new com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.LD.2
                    @Override // com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb
                    public void Lxb(boolean z, Object obj) {
                        if (z) {
                            JVA jvaLxb = JVA.Lxb(kqm.Lxb());
                            LD ld = LD.this;
                            jvaLxb.Lxb(ld.LD, ld.lk);
                        }
                    }
                });
            } else if (tDVar.JJ() != null) {
                com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(this.Lxb.tv())).b(), this.Lxb);
                ldLxb.Lxb("material_meta", this.Lxb);
                ldLxb.Lxb("ad_slot", this.LD);
                com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new PG() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.LD.1
                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo0, int i, String str) {
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo0, int i) {
                        JVA jvaLxb = JVA.Lxb(kqm.Lxb());
                        LD ld = LD.this;
                        jvaLxb.Lxb(ld.LD, ld.lk);
                    }
                });
            }
        }
    }

    public static class Lxb implements PAGRewardedAdLoadListener {
        private final boolean JXs;
        private final AdSlot LD;
        private final Context Lxb;
        private final PAGRewardedAdLoadListener ZU;
        private final com.bytedance.sdk.openadsdk.core.model.Lxb lk;

        public Lxb(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z) {
            this.Lxb = context;
            this.LD = adSlot;
            this.lk = lxb;
            this.ZU = pAGRewardedAdLoadListener;
            this.JXs = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            sLN.Lxb(this.Lxb).Lxb(this.LD, this.lk, this.ZU, pAGRewardedAd, this.JXs);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
        public void onError(int i, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.ZU;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }
    }

    public static class lk implements PAGRewardedAdLoadListener {
        private final AtomicBoolean LD;
        private final PAGRewardedAdLoadListener Lxb;
        private final com.bytedance.sdk.openadsdk.core.model.Lxb ZU;
        private final AtomicInteger lk;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
        public void onError(int i, String str) {
            if (this.lk.decrementAndGet() > 0 || this.Lxb == null || !this.LD.compareAndSet(false, true)) {
                return;
            }
            this.Lxb.onError(i, str);
            com.bytedance.sdk.openadsdk.STP.lk.Lxb("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.lk.1
                @Override // com.bytedance.sdk.openadsdk.STP.LD
                @Nullable
                public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lk.this.ZU.LD());
                    return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("choose_ad_load_error").LD(jSONObject.toString());
                }
            });
        }

        private lk(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
            this.LD = new AtomicBoolean(false);
            this.Lxb = pAGRewardedAdLoadListener;
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
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.lk.decrementAndGet();
            if (this.Lxb == null || !this.LD.compareAndSet(false, true)) {
                return;
            }
            this.Lxb.onAdLoaded(pAGRewardedAd);
        }
    }

    private sLN(Context context) {
        this.LD = context == null ? kqm.Lxb() : context.getApplicationContext();
        LD();
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
        lk();
    }

    private void LD(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.Lxb Lxb2;
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) || (Lxb2 = JVA.Lxb(this.LD).Lxb(adSlot.getCodeId(), true)) == null || !Lxb2.JXs()) {
            Lxb(adSlot, false, pAGRewardedAdLoadListener);
            return;
        }
        tD tDVarLc = Lxb2.lc();
        for (tD tDVar : Lxb2.ZU()) {
            if (tDVar.hg() == null) {
                tDVar.Lxb(adSlot);
            }
        }
        STP stp = new STP(this.LD, Lxb2, adSlot);
        if (!Lxb2.ebl() && !eK.lk(tDVarLc)) {
            stp.LD();
        }
        if (pAGRewardedAdLoadListener != null) {
            if (!Lxb2.ebl() && kqm.ZU().tD() == 0) {
                Lxb(adSlot, Lxb2, pAGRewardedAdLoadListener, (PAGRewardedAd) stp.Lxb(), true);
            }
            lk lkVar = new lk(new Lxb(this.LD, adSlot, Lxb2, pAGRewardedAdLoadListener, true), Lxb2);
            for (int i = 0; i < Lxb2.ZU().size(); i++) {
                Lxb(Lxb2.ZU().get(i), adSlot, lkVar, stp, Lxb2.ebl());
                if (Lxb2.sLN()) {
                    break;
                }
            }
        }
        for (int i2 = 0; i2 < Lxb2.ZU().size(); i2++) {
            com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(Lxb2.ZU().get(i2), new com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.InterfaceC0098Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.1
            });
        }
    }

    private void lk() {
        if (this.lk.get()) {
            this.lk.set(false);
            try {
                HD.Lxb(this.lc);
            } catch (Exception unused) {
            }
        }
    }

    public static sLN Lxb(Context context) {
        if (Lxb == null) {
            synchronized (sLN.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new sLN(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public void Lxb(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm()) || JVA.Lxb(this.LD).Lxb(adSlot.getCodeId(), false) != null) {
            return;
        }
        Lxb(adSlot, true, null);
    }

    public void Lxb(String str, tD tDVar) {
        JVA.Lxb(this.LD).Lxb(str, tDVar);
    }

    public void Lxb() {
        try {
            JVA.Lxb(this.LD).Lxb();
        } catch (Throwable unused) {
        }
    }

    public void Lxb(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        LD(adSlot, pAGRewardedAdLoadListener);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    private void Lxb(tD tDVar, AdSlot adSlot, final lk lkVar, final STP stp, final boolean z) {
        boolean z2;
        if (lkVar != null) {
            z2 = true;
            if (!z && kqm.ZU().tD() != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (eK.lk(tDVar) || Build.VERSION.SDK_INT < 23) {
            if (z2) {
                lkVar.onAdLoaded(stp.Lxb());
            }
        } else {
            com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(tDVar.tv())).b(), tDVar);
            ldLxb.Lxb("material_meta", tDVar);
            ldLxb.Lxb("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new PG() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.2
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                public void Lxb(Uo0 uo0, int i) {
                    if (lkVar != null) {
                        if (z || kqm.ZU().tD() == 1) {
                            lkVar.onAdLoaded(stp.Lxb());
                        }
                    }
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                public void Lxb(Uo0 uo0, int i, String str) {
                    if (lkVar != null) {
                        if (z || kqm.ZU().tD() == 1) {
                            lkVar.onError(i, str);
                        }
                    }
                }
            });
        }
    }

    private void LD(AdSlot adSlot) {
        if (JXs.LD() != 2) {
            return;
        }
        JVA.Lxb(this.LD).Lxb(adSlot.getCodeId());
    }

    private void Lxb(final AdSlot adSlot, final boolean z, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.sLN.ZU()) {
            SG.a(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Sfi sfi = new Sfi();
        sfi.LD = z ? 2 : 1;
        if (kqm.ZU().sLN(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            sfi.OY = 2;
        }
        kqm.lk().Lxb(adSlot, sfi, 7, new com.bytedance.sdk.openadsdk.core.tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.3
            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (z || (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) == null) {
                    return;
                }
                pAGRewardedAdLoadListener2.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (lxb.ZU() != null && !lxb.ZU().isEmpty()) {
                    STP stp = new STP(sLN.this.LD, lxb, adSlot);
                    if (!z) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.tD.Lxb.ZU.Lxb().Lxb(lxb.ZU().isEmpty() ? null : lxb.ZU().get(0));
                            com.bytedance.sdk.openadsdk.STP.lk.Lxb(lxb.lc(), System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        if (!lxb.ebl() && pAGRewardedAdLoadListener != null && kqm.ZU().tD() == 0) {
                            sLN.this.Lxb(adSlot, lxb, pAGRewardedAdLoadListener, (PAGRewardedAd) stp.Lxb(), false);
                        }
                    }
                    lk lkVar = new lk(new Lxb(sLN.this.LD, adSlot, lxb, pAGRewardedAdLoadListener, false), lxb);
                    for (int i = 0; i < lxb.ZU().size(); i++) {
                        sLN.this.Lxb(lxb, lxb.ZU().get(i), stp, adSlot, z, lkVar, lxb.ebl());
                        if (lxb.sLN()) {
                            return;
                        }
                    }
                    return;
                }
                if (z || (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) == null) {
                    return;
                }
                pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.OY.Lxb(-3));
                ld.Lxb(-3);
                com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld);
            }
        });
    }

    private void LD() {
        if (this.lk.get()) {
            return;
        }
        this.lk.set(true);
        HD.Lxb(this.lc, this.LD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final com.bytedance.sdk.openadsdk.core.model.Lxb lxb, tD tDVar, final STP stp, final AdSlot adSlot, final boolean z, final lk lkVar, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(tDVar, new com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.InterfaceC0098Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.4
        });
        boolean z3 = true;
        if (z && !eK.lk(tDVar) && kqm.ZU().foI(adSlot.getCodeId()).ZU == 1 && !IeN.ZU(this.LD)) {
            Lxb(new LD(tDVar, adSlot, lxb));
            return;
        }
        if (lkVar == null || (!z2 && kqm.ZU().tD() != 1)) {
            z3 = false;
        }
        if (eK.lk(tDVar)) {
            if (z) {
                JVA.Lxb(this.LD).Lxb(adSlot, lxb);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            if (tDVar.JJ() != null) {
                com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(tDVar.tv())).b(), tDVar);
                ldLxb.Lxb("material_meta", tDVar);
                ldLxb.Lxb("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new PG() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.5
                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo0, int i) {
                        stp.LD();
                        if (z) {
                            JVA.Lxb(sLN.this.LD).Lxb(adSlot, lxb);
                        } else if (lkVar != null) {
                            if (z2 || kqm.ZU().tD() == 1) {
                                lkVar.onAdLoaded(stp.Lxb());
                            }
                        }
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo0, int i, String str) {
                        if (lkVar != null) {
                            if (z2 || kqm.ZU().tD() == 1) {
                                lkVar.onError(i, str);
                            }
                        }
                    }
                });
                return;
            }
        } else {
            JVA.Lxb(this.LD).Lxb(tDVar, new com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.sLN.6
                @Override // com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb
                public void Lxb(boolean z4, Object obj) {
                    if (z4) {
                        stp.LD();
                    }
                    if (z) {
                        if (z4) {
                            JVA.Lxb(sLN.this.LD).Lxb(adSlot, lxb);
                        }
                    } else {
                        if (z4) {
                            if (lkVar != null) {
                                if (z2 || kqm.ZU().tD() == 1) {
                                    lkVar.onAdLoaded(stp.Lxb());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (lkVar != null) {
                            if (z2 || kqm.ZU().tD() == 1) {
                                lkVar.onError(-1, "");
                            }
                        }
                    }
                }
            });
            return;
        }
        if (z3) {
            lkVar.onAdLoaded(stp.Lxb());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, boolean z) {
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
        int iLD = JXs.LD();
        if (!z) {
            if (iLD == 2) {
                JVA.Lxb(this.LD).Lxb(adSlot, lxb);
                LD(adSlot);
                return;
            }
            return;
        }
        if (iLD == 2) {
            LD(adSlot);
        } else if (iLD == 1) {
            JVA.Lxb(this.LD).Lxb(adSlot.getCodeId(), (tD) null);
        }
    }

    private void Lxb(LD ld) {
        if (ld == null) {
            return;
        }
        if (this.ZU.size() > 0) {
            this.ZU.remove(0);
        }
        this.ZU.add(ld);
    }
}
