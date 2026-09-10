package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.fr;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.uq;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import laky.attabal;
import org.json.JSONObject;
import shimmery.dern;

/* JADX INFO: loaded from: classes2.dex */
public class slm {
    private static volatile slm ri;
    private com.bytedance.sdk.component.mj.lr.ik fi;
    private final Context lr;
    private final AtomicBoolean ik = new AtomicBoolean(false);
    private final List<lr> ka = Collections.synchronizedList(new ArrayList());
    private final su.ri di = new su.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.6
        @Override // com.bytedance.sdk.component.utils.su.ri
        public void ri(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (slm.this.fi == null) {
                    slm slmVar = slm.this;
                    slmVar.fi = new com.bytedance.sdk.openadsdk.component.reward.ik("net connect task", slmVar.ka);
                }
                com.bytedance.sdk.component.utils.jbs.ri().post(slm.this.fi);
            }
        }
    };

    public static class ik implements PAGRewardedAdLoadListener {
        private final AtomicInteger ik;
        private final com.bytedance.sdk.openadsdk.core.model.ri ka;
        private final AtomicBoolean lr;
        private final PAGRewardedAdLoadListener ri;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            if (this.ik.decrementAndGet() > 0 || this.ri == null || !this.lr.compareAndSet(false, true)) {
                return;
            }
            this.ri.onError(i, str);
            com.bytedance.sdk.openadsdk.slm.ka.ri("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.ik.1
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", ik.this.ka.lr());
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("choose_ad_load_error").lr(jSONObject.toString());
                }
            });
        }

        private ik(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
            this.lr = new AtomicBoolean(false);
            this.ri = pAGRewardedAdLoadListener;
            this.ka = riVar;
            this.ik = new AtomicInteger(ri());
        }

        private int ri() {
            if (!this.ka.fi()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.ka.ka().size(); i2++) {
                wjv wjvVar = this.ka.ka().get(i2);
                if (wjvVar != null && !dw.ik(wjvVar) && wjvVar.eu() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.ik.decrementAndGet();
            if (this.ri == null || !this.lr.compareAndSet(false, true)) {
                return;
            }
            this.ri.onAdLoaded(pAGRewardedAd);
        }
    }

    public static class lr extends com.bytedance.sdk.component.mj.lr.ik {
        final com.bytedance.sdk.openadsdk.core.model.ri ik;
        final AdSlot lr;
        final wjv ri;

        public lr(wjv wjvVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
            super("Reward Task");
            this.ri = wjvVar;
            this.lr = adSlot;
            this.ik = riVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            wjv wjvVar = this.ri;
            if (wjvVar == null || wjvVar.eu() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(this.ri.qf()).ri(), this.ri);
            lrVarRi.ri("material_meta", this.ri);
            lrVarRi.ri("ad_slot", this.lr);
            com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new attabal() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.lr.1
                @Override // laky.saneness.attabal
                public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i, String str) {
                }

                @Override // laky.saneness.attabal
                public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
                    vr vrVarRi = vr.ri(com.bytedance.sdk.openadsdk.core.nr.ri());
                    lr lrVar = lr.this;
                    vrVarRi.ri(lrVar.lr, lrVar.ik);
                }
            });
        }
    }

    public static class ri implements PAGRewardedAdLoadListener {
        private final boolean fi;
        private final com.bytedance.sdk.openadsdk.core.model.ri ik;
        private final PAGRewardedAdLoadListener ka;
        private final AdSlot lr;
        private final Context ri;

        public ri(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z) {
            this.ri = context;
            this.lr = adSlot;
            this.ik = riVar;
            this.ka = pAGRewardedAdLoadListener;
            this.fi = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.ka;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            slm.ri(this.ri).ri(this.lr, this.ik, this.ka, pAGRewardedAd, this.fi);
        }
    }

    private slm(Context context) {
        this.lr = context == null ? com.bytedance.sdk.openadsdk.core.nr.ri() : context.getApplicationContext();
        lr();
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.fi != null) {
            try {
                com.bytedance.sdk.component.utils.jbs.ri().removeCallbacks(this.fi);
            } catch (Exception unused) {
            }
            this.fi = null;
        }
        ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(AdSlot adSlot) {
        vr.ri(this.lr).ri(adSlot.getCodeId());
    }

    private void lr(final AdSlot adSlot) {
        igq igqVar = new igq();
        igqVar.lr = 2;
        if (com.bytedance.sdk.openadsdk.core.nr.ka().co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        com.bytedance.sdk.openadsdk.core.nr.ik().ri(adSlot, igqVar, 7, new uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.1
            boolean ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public String ri() {
                return vr.ri(slm.this.lr).ri(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                boolean zRi = vr.ri(slm.this.lr).ri(riVar);
                this.ri = zRi;
                return zRi;
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                if (this.ri || riVar.ka() == null || riVar.ka().isEmpty()) {
                    return;
                }
                slm.this.ri(riVar, new tan(slm.this.lr, riVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    private void ik() {
        if (this.ik.get()) {
            this.ik.set(false);
            try {
                su.ri(this.di);
            } catch (Exception unused) {
            }
        }
    }

    public static slm ri(Context context) {
        if (ri == null) {
            synchronized (slm.class) {
                try {
                    if (ri == null) {
                        ri = new slm(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    private void lr(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.vr.ik()) {
            dern.attabal(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        igq igqVar = new igq();
        igqVar.lr = 1;
        if (com.bytedance.sdk.openadsdk.core.nr.ka().co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        com.bytedance.sdk.openadsdk.core.nr.ik().ri(adSlot, igqVar, 7, new uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.2
            boolean ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                com.bytedance.sdk.openadsdk.core.model.ri riVar2;
                if (riVar.ka() != null && !riVar.ka().isEmpty()) {
                    tan tanVar = new tan(slm.this.lr, riVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.uq.ri.ka.ri().ri(riVar.ka().isEmpty() ? null : riVar.ka().get(0));
                        com.bytedance.sdk.openadsdk.slm.ka.ri(riVar.di(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || com.bytedance.sdk.openadsdk.core.nr.ka().zf() != 0) {
                        riVar2 = riVar;
                    } else {
                        slm.this.ri(adSlot, riVar, pAGRewardedAdLoadListener, tanVar.ri(), this.ri);
                        riVar2 = riVar;
                    }
                    slm.this.ri(riVar2, tanVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jbs.ri(-3));
                    ikVar.ri(-3);
                    ikVar.ik(6);
                    com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public String ri() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strRi = vr.ri(slm.this.lr).ri(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strRi)) {
                    return null;
                }
                return strRi;
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                boolean zRi = vr.ri(slm.this.lr).ri(riVar);
                this.ri = zRi;
                return zRi;
            }
        });
    }

    public void ri(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        lr(adSlot);
    }

    public void ri(String str, wjv wjvVar) {
        vr.ri(this.lr).ri(str, wjvVar);
    }

    public void ri() {
        try {
            vr.ri(this.lr).ri();
        } catch (Throwable unused) {
        }
    }

    public void ri(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        lr(adSlot, pAGRewardedAdLoadListener);
    }

    private void lr() {
        if (this.ik.get()) {
            return;
        }
        this.ik.set(true);
        su.ri(this.di, this.lr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, tan tanVar, AdSlot adSlot, boolean z, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z) {
            com.bytedance.sdk.openadsdk.bgr.ri.ri().ri(riVar.di());
        }
        AdSlot adSlot2 = adSlot;
        ik ikVar = new ik(new ri(this.lr, adSlot2, riVar, pAGRewardedAdLoadListener, false), riVar);
        ri(riVar);
        int i = 0;
        while (i < riVar.ka().size()) {
            wjv wjvVar = riVar.ka().get(i);
            int iNd = wjvVar.nd();
            if (i == 0 && iNd == 43) {
                wjvVar.eu().competently(0);
            }
            tan tanVar2 = tanVar;
            boolean z2 = z;
            AdSlot adSlot3 = adSlot2;
            ri(riVar, wjvVar, tanVar2, adSlot3, z2, ikVar);
            adSlot2 = adSlot3;
            if (riVar.mj() && iNd != 43) {
                return;
            }
            i++;
            tanVar = tanVar2;
            z = z2;
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        fr frVarQt = riVar.qt();
        int iSlm = riVar.mj() ? 10 : 1;
        if (frVarQt != null) {
            iSlm = frVarQt.slm();
        }
        for (final int i = 0; i < riVar.ka().size(); i++) {
            wjv wjvVar = riVar.ka().get(i);
            if (i >= iSlm) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(wjvVar, new com.bytedance.sdk.openadsdk.core.bgr.ik.ri.InterfaceC0232ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.3
                @Override // com.bytedance.sdk.openadsdk.core.bgr.ik.ri.InterfaceC0232ri
                public void ri(boolean z) {
                    com.bytedance.sdk.component.utils.ac.ri("RewardVideoLoadManager", "onCachedResponse: i=" + i + ", isSuccess=" + z);
                }
            });
        }
    }

    private void ri(final com.bytedance.sdk.openadsdk.core.model.ri riVar, wjv wjvVar, tan tanVar, final AdSlot adSlot, final boolean z, ik ikVar) {
        final tan tanVar2;
        final ik ikVar2;
        if (z && !dw.ik(wjvVar) && com.bytedance.sdk.openadsdk.core.nr.ka().su(adSlot.getCodeId()).ka == 1 && !com.bytedance.sdk.component.utils.nr.ka(this.lr)) {
            ri(new lr(wjvVar, adSlot, riVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = ikVar != null && com.bytedance.sdk.openadsdk.core.nr.ka().zf() == 1;
        if (dw.ik(wjvVar)) {
            tanVar2 = tanVar;
            ikVar2 = ikVar;
            if (z) {
                vr.ri(this.lr).ri(adSlot, riVar);
            }
        } else {
            if (wjvVar.eu() != null) {
                com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(wjvVar.qf()).ri(), wjvVar);
                lrVarRi.ri("material_meta", wjvVar);
                lrVarRi.ri("ad_slot", adSlot);
                tanVar2 = tanVar;
                ikVar2 = ikVar;
                com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new attabal() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.4
                    @Override // laky.saneness.attabal
                    public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar3, int i) {
                        tanVar2.lr();
                        if (z) {
                            vr.ri(slm.this.lr).ri(adSlot, riVar);
                        } else {
                            if (ikVar2 == null || com.bytedance.sdk.openadsdk.core.nr.ka().zf() != 1) {
                                return;
                            }
                            ikVar2.onAdLoaded(tanVar2.ri());
                        }
                    }

                    @Override // laky.saneness.attabal
                    public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar3, int i, String str) {
                        if (ikVar2 == null || com.bytedance.sdk.openadsdk.core.nr.ka().zf() != 1) {
                            return;
                        }
                        ikVar2.onError(i, str);
                    }
                });
            } else {
                tanVar2 = tanVar;
                ikVar2 = ikVar;
                z2 = z3;
            }
            z3 = z2;
        }
        if (z3) {
            ikVar2.onAdLoaded(tanVar2.ri());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ri riVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.slm.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    slm.this.ik(adSlot);
                } else {
                    vr.ri(slm.this.lr).ri(adSlot, riVar);
                    slm.this.ik(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    private void ri(lr lrVar) {
        if (lrVar == null) {
            return;
        }
        if (this.ka.size() > 0) {
            this.ka.remove(0);
        }
        this.ka.add(lrVar);
    }
}
