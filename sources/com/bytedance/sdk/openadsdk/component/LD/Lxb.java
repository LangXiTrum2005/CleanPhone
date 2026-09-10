package com.bytedance.sdk.openadsdk.component.LD;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.STP.lk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.lc;
import com.bytedance.sdk.openadsdk.core.OY;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.LD;
import com.bytedance.sdk.openadsdk.core.model.Sfi;
import com.bytedance.sdk.openadsdk.core.tD;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.CG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static volatile Lxb Lxb;
    private final tD LD = kqm.lk();

    private Lxb() {
    }

    public static Lxb Lxb() {
        if (Lxb == null) {
            synchronized (Lxb.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new Lxb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public void Lxb(final Context context, final AdSlot adSlot, final lc lcVar) {
        final CG cgLD = CG.LD();
        this.LD.Lxb(adSlot, new Sfi(), 5, new tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.LD.Lxb.1
            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(int i, String str) {
                lcVar.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, LD ld) {
                if (lxb.ZU() == null || lxb.ZU().isEmpty()) {
                    lcVar.onError(-3, OY.Lxb(-3));
                    ld.Lxb(-3);
                    LD.Lxb(ld);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.core.model.tD> listZU = lxb.ZU();
                ArrayList arrayList = new ArrayList(listZU.size());
                for (com.bytedance.sdk.openadsdk.core.model.tD tDVar : listZU) {
                    if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar) || (tDVar != null && tDVar.wPa())) {
                        PAGNativeAd pAGNativeAdLxb = Lxb(context, tDVar, adSlot);
                        if (lcVar instanceof PAGNativeAdLoadListener) {
                            arrayList.add(pAGNativeAdLxb);
                        }
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar) && tDVar.JJ() != null && tDVar.JJ().g != null) {
                        if (kqm.ZU().JXs(String.valueOf(tDVar.Td())) && kqm.ZU().Ns()) {
                            if (tDVar.JJ() != null) {
                                tDVar.JJ().o = 1;
                            }
                            if (tDVar.rK() != null) {
                                tDVar.rK().o = 1;
                            }
                            com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = com.bytedance.sdk.openadsdk.core.model.tD.Lxb(((OK) CacheDirFactory.getICacheDir(tDVar.tv())).f(), tDVar);
                            ldLxb.Lxb("material_meta", tDVar);
                            ldLxb.Lxb("ad_slot", adSlot);
                            com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, null);
                        }
                        IPMiBroadcastReceiver.Lxb(context, tDVar);
                    }
                }
                if (!(lcVar instanceof PAGNativeAdLoadListener) || arrayList.isEmpty()) {
                    lcVar.onError(-4, OY.Lxb(-4));
                    ld.Lxb(-4);
                    LD.Lxb(ld);
                    return;
                }
                AdSlot adSlot2 = adSlot;
                if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                    lk.Lxb(listZU.get(0), cgLD.ZU());
                }
                lc lcVar2 = lcVar;
                if (lcVar2 instanceof PAGNativeAdLoadListener) {
                    ((PAGNativeAdLoadListener) lcVar2).onAdLoaded(arrayList.get(0));
                }
                if (ld.JXs() == null || ld.JXs().isEmpty()) {
                    return;
                }
                LD.Lxb(ld);
            }

            private PAGNativeAd Lxb(Context context2, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot2) {
                if (tDVar.eK() != 2) {
                    return new com.bytedance.sdk.openadsdk.Lxb.LD.LD(context2, tDVar, 5, adSlot2);
                }
                if (tDVar.JJ() != null) {
                    return new com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.LD(context2, tDVar, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk(context2, tDVar, adSlot2);
            }
        });
    }
}
