package com.bytedance.sdk.openadsdk.component.lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.xha;
import com.bytedance.sdk.openadsdk.core.bgr.ri.lr;
import com.bytedance.sdk.openadsdk.core.jbs;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.model.ik;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.uq;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.utils.pv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static volatile ri ri;
    private final wjv lr = nr.ik();

    private ri() {
    }

    public static ri ri() {
        if (ri == null) {
            synchronized (ri.class) {
                try {
                    if (ri == null) {
                        ri = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public void ri(final Context context, final AdSlot adSlot, final xha xhaVar) {
        final pv pvVarLr = pv.lr();
        this.lr.ri(adSlot, new igq(), 5, new uq() { // from class: com.bytedance.sdk.openadsdk.component.lr.ri.1
            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                xhaVar.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, ik ikVar) {
                ri.this.ri(riVar, ikVar, context, adSlot, xhaVar, pvVarLr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, ik ikVar, Context context, AdSlot adSlot, xha xhaVar, pv pvVar) {
        if (riVar.ka() != null && !riVar.ka().isEmpty()) {
            List<com.bytedance.sdk.openadsdk.core.model.wjv> listKa = riVar.ka();
            ArrayList arrayList = new ArrayList(listKa.size());
            for (com.bytedance.sdk.openadsdk.core.model.wjv wjvVar : listKa) {
                if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar) || (wjvVar != null && wjvVar.pye())) {
                    PAGNativeAd pAGNativeAdRi = ri(context, wjvVar, adSlot);
                    if (xhaVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(pAGNativeAdRi);
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar) && wjvVar.eu() != null && wjvVar.eu().supplicat() != null) {
                    if (nr.ka().fi(String.valueOf(wjvVar.ur())) && nr.ka().zb()) {
                        if (wjvVar.eu() != null) {
                            wjvVar.eu().competently(1);
                        }
                        if (wjvVar.kvj() != null) {
                            wjvVar.kvj().competently(1);
                        }
                        lr lrVarRi = com.bytedance.sdk.openadsdk.core.model.wjv.ri(CacheDirFactory.getICacheDir(wjvVar.qf()).ik(), wjvVar);
                        lrVarRi.ri("material_meta", wjvVar);
                        lrVarRi.ri("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, null);
                    }
                    IPBroadcastReceiver.lr(context, wjvVar);
                }
            }
            boolean z = xhaVar instanceof PAGNativeAdLoadListener;
            if (z && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    ka.ri(listKa.get(0), pvVar.ka());
                }
                if (z) {
                    ((PAGNativeAdLoadListener) xhaVar).onAdLoaded(arrayList.get(0));
                }
                if (ikVar.fi() == null || ikVar.fi().isEmpty()) {
                    return;
                }
                ikVar.ik(4);
                ik.ri(ikVar);
                return;
            }
            xhaVar.onError(-4, jbs.ri(-4));
            ikVar.ri(-4);
            ikVar.ik(4);
            ik.ri(ikVar);
            return;
        }
        xhaVar.onError(-3, jbs.ri(-3));
        ikVar.ri(-3);
        ikVar.ik(4);
        ik.ri(ikVar);
    }

    private PAGNativeAd ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot) {
        if (wjvVar.ajz() != 2) {
            return new com.bytedance.sdk.openadsdk.ri.lr.lr(context, wjvVar, 5, adSlot);
        }
        if (wjvVar.eu() != null) {
            return new com.bytedance.sdk.openadsdk.ri.lr.ri.lr(context, wjvVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.ri.lr.ri.ik(context, wjvVar, adSlot);
    }
}
