package com.bytedance.sdk.openadsdk.component.ud;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.mo;
import com.bytedance.sdk.openadsdk.core.aaj;
import com.bytedance.sdk.openadsdk.core.jpc;
import com.bytedance.sdk.openadsdk.core.jyq;
import com.bytedance.sdk.openadsdk.core.model.bqt;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.lnr;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.bytedance.sdk.openadsdk.utils.ud;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static volatile qdl qdl;
    private final oth ud = yt.lnr();

    private qdl() {
    }

    public static qdl qdl() {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public void qdl(final Context context, final AdSlot adSlot, final mo moVar) {
        final mrf mrfVarUd = mrf.ud();
        if (ud.qdl()) {
            this.ud.qdl(adSlot, new bqt(), 5, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.ud.qdl.1
                @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(int i2, String str) {
                    moVar.onError(i2, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, lnr lnrVar) {
                    qdl.this.qdl(qdlVar, lnrVar, context, adSlot, moVar, mrfVarUd);
                }
            });
        } else {
            this.ud.qdl(adSlot, new bqt(), 5, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.ud.qdl.2
                @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(int i2, String str) {
                    moVar.onError(i2, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, lnr lnrVar) {
                    qdl.this.qdl(qdlVar, lnrVar, context, adSlot, moVar, mrfVarUd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, lnr lnrVar, Context context, AdSlot adSlot, mo moVar, mrf mrfVar) {
        if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
            List<ljh> listMml = qdlVar.mml();
            ArrayList arrayList = new ArrayList(listMml.size());
            for (ljh ljhVar : listMml) {
                if (ljh.mzz(ljhVar) || (ljhVar != null && ljhVar.jee())) {
                    PAGNativeAd pAGNativeAdQdl = qdl(context, ljhVar, adSlot);
                    if (moVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(pAGNativeAdQdl);
                    }
                }
                if (ljh.mzz(ljhVar) && ljhVar.tdy() != null && ljhVar.tdy().rq() != null) {
                    if (yt.mml().mzz(String.valueOf(ljhVar.fz())) && yt.mml().ijp()) {
                        if (ljhVar.tdy() != null) {
                            ljhVar.tdy().mo(1);
                        }
                        if (ljhVar.xil() != null) {
                            ljhVar.xil().mo(1);
                        }
                        com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(ljhVar.lhl()).lnr(), ljhVar);
                        udVarQdl.qdl("material_meta", ljhVar);
                        udVarQdl.qdl("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, null);
                    }
                    IPMiBroadcastReceiver.qdl(context, ljhVar);
                }
            }
            boolean z2 = moVar instanceof PAGNativeAdLoadListener;
            if (z2 && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.bjy.lnr.qdl(listMml.get(0), mrfVar.mml());
                }
                if (z2) {
                    ((PAGNativeAdLoadListener) moVar).onAdLoaded(arrayList.get(0));
                }
                if (lnrVar.mzz() == null || lnrVar.mzz().isEmpty()) {
                    return;
                }
                lnrVar.lnr(4);
                lnr.qdl(lnrVar);
                return;
            }
            moVar.onError(-4, jpc.qdl(-4));
            lnrVar.qdl(-4);
            lnrVar.lnr(4);
            lnr.qdl(lnrVar);
            return;
        }
        moVar.onError(-3, jpc.qdl(-3));
        lnrVar.qdl(-3);
        lnrVar.lnr(4);
        lnr.qdl(lnrVar);
    }

    private PAGNativeAd qdl(Context context, ljh ljhVar, AdSlot adSlot) {
        if (ljhVar.dk() != 2) {
            return new com.bytedance.sdk.openadsdk.qdl.ud.ud(context, ljhVar, 5, adSlot);
        }
        if (ljhVar.tdy() != null) {
            return new com.bytedance.sdk.openadsdk.qdl.ud.qdl.ud(context, ljhVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr(context, ljhVar, adSlot);
    }
}
