package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
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

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private static volatile di ri;
    private com.bytedance.sdk.component.mj.lr.ik fi;
    private final Context lr;
    private final AtomicBoolean ik = new AtomicBoolean(false);
    private final List<ik> ka = Collections.synchronizedList(new ArrayList());
    private final su.ri di = new su.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.6
        @Override // com.bytedance.sdk.component.utils.su.ri
        public void ri(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (di.this.fi == null) {
                    di diVar = di.this;
                    diVar.fi = new com.bytedance.sdk.openadsdk.component.reward.ik("fsv net connect task", diVar.ka);
                }
                com.bytedance.sdk.component.utils.jbs.ri().post(di.this.fi);
            }
        }
    };

    public static class ik extends com.bytedance.sdk.component.mj.lr.ik {
        final com.bytedance.sdk.openadsdk.core.model.ri ik;
        final AdSlot lr;
        final wjv ri;

        public ik(wjv wjvVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
            super("Fullscreen Task");
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
            com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new attabal() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.ik.1
                @Override // laky.saneness.attabal
                public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i, String str) {
                }

                @Override // laky.saneness.attabal
                public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
                    fi fiVarRi = fi.ri(com.bytedance.sdk.openadsdk.core.nr.ri());
                    ik ikVar2 = ik.this;
                    fiVarRi.ri(ikVar2.lr, ikVar2.ik);
                }
            });
        }
    }

    public static class lr implements PAGInterstitialAdLoadListener {
        private final AtomicInteger ik;
        private final com.bytedance.sdk.openadsdk.core.model.ri ka;
        private final AtomicBoolean lr;
        private final PAGInterstitialAdLoadListener ri;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            if (this.ik.decrementAndGet() > 0 || !this.lr.compareAndSet(false, true)) {
                return;
            }
            this.ri.onError(i, str);
            com.bytedance.sdk.openadsdk.slm.ka.ri("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.lr.1
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lr.this.ka.lr());
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("choose_ad_load_error").lr(jSONObject.toString());
                }
            });
        }

        private lr(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
            this.lr = new AtomicBoolean(false);
            this.ri = pAGInterstitialAdLoadListener;
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
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.ik.decrementAndGet();
            if (this.ri == null || !this.lr.compareAndSet(false, true)) {
                return;
            }
            this.ri.onAdLoaded(pAGInterstitialAd);
        }
    }

    public static class ri implements PAGInterstitialAdLoadListener {
        private final boolean fi;
        private final com.bytedance.sdk.openadsdk.core.model.ri ik;
        private final PAGInterstitialAdLoadListener ka;
        private final AdSlot lr;
        private final Context ri;

        public ri(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z) {
            this.ri = context;
            this.lr = adSlot;
            this.ik = riVar;
            this.ka = pAGInterstitialAdLoadListener;
            this.fi = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
        public void onError(int i, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.ka;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            di.ri(this.ri).ri(this.lr, this.ik, this.ka, pAGInterstitialAd, this.fi);
        }
    }

    private di(Context context) {
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
        fi.ri(this.lr).ri(adSlot.getCodeId());
    }

    private void lr(final AdSlot adSlot) {
        igq igqVar = new igq();
        igqVar.ik = 2;
        if (com.bytedance.sdk.openadsdk.core.nr.ka().co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        com.bytedance.sdk.openadsdk.core.nr.ik().ri(adSlot, igqVar, 8, new uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.1
            boolean ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public String ri() {
                return fi.ri(di.this.lr).ri(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                boolean zRi = fi.ri(di.this.lr).ri(riVar);
                this.ri = zRi;
                return zRi;
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                if (this.ri || riVar.ka() == null || riVar.ka().isEmpty()) {
                    return;
                }
                di.this.ri(riVar, new nr(di.this.lr, riVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
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

    public static di ri(Context context) {
        if (ri == null) {
            synchronized (di.class) {
                try {
                    if (ri == null) {
                        ri = new di(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    private void lr(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        igq igqVar = new igq();
        igqVar.ik = 1;
        if (com.bytedance.sdk.openadsdk.core.nr.ka().co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd()) {
            igqVar.jbs = 2;
        }
        com.bytedance.sdk.openadsdk.core.nr.ik().ri(adSlot, igqVar, 8, new uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.2
            boolean ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                com.bytedance.sdk.openadsdk.core.model.ri riVar2;
                if (riVar.ka() != null && !riVar.ka().isEmpty()) {
                    nr nrVar = new nr(di.this.lr, riVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.uq.ri.ka.ri().ri(riVar.ka().isEmpty() ? null : riVar.ka().get(0));
                        com.bytedance.sdk.openadsdk.slm.ka.ri(riVar.di(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || com.bytedance.sdk.openadsdk.core.nr.ka().zf() != 0) {
                        riVar2 = riVar;
                    } else {
                        di.this.ri(adSlot, riVar, pAGInterstitialAdLoadListener, nrVar.ri(), this.ri);
                        riVar2 = riVar;
                    }
                    di.this.ri(riVar2, nrVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jbs.ri(-3));
                    ikVar.ri(-3);
                    ikVar.ik(5);
                    com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public String ri() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strRi = fi.ri(di.this.lr).ri(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strRi)) {
                    return null;
                }
                return strRi;
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                boolean zRi = fi.ri(di.this.lr).ri(riVar);
                this.ri = zRi;
                return zRi;
            }
        });
    }

    public void ri() {
        try {
            fi.ri(this.lr).ri();
        } catch (Throwable unused) {
        }
    }

    public void ri(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        lr(adSlot);
    }

    private void lr() {
        if (this.ik.get()) {
            return;
        }
        this.ik.set(true);
        su.ri(this.di, this.lr);
    }

    public void ri(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        lr(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ri riVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    di.this.ik(adSlot);
                } else {
                    fi.ri(di.this.lr).ri(adSlot, riVar);
                    di.this.ik(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, nr nrVar, AdSlot adSlot, boolean z, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z) {
            com.bytedance.sdk.openadsdk.bgr.ri.ri().ri(riVar.di());
        }
        AdSlot adSlot2 = adSlot;
        lr lrVar = new lr(new ri(this.lr, adSlot2, riVar, pAGInterstitialAdLoadListener, false), riVar);
        ri(riVar);
        int i = 0;
        while (i < riVar.ka().size()) {
            wjv wjvVar = riVar.ka().get(i);
            int iNd = wjvVar.nd();
            if (i == 0 && iNd == 43) {
                wjvVar.eu().competently(0);
            }
            nr nrVar2 = nrVar;
            boolean z2 = z;
            AdSlot adSlot3 = adSlot2;
            ri(riVar, wjvVar, nrVar2, adSlot3, z2, lrVar);
            adSlot2 = adSlot3;
            if (riVar.mj() && wjvVar.nd() != 43) {
                return;
            }
            i++;
            nrVar = nrVar2;
            z = z2;
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        fr frVarQt = riVar.qt();
        int iSlm = riVar.mj() ? 10 : 1;
        if (frVarQt != null) {
            iSlm = frVarQt.slm();
        }
        for (final int i = 0; i < riVar.ka().size() && i < iSlm; i++) {
            com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(riVar.ka().get(i), new com.bytedance.sdk.openadsdk.core.bgr.ik.ri.InterfaceC0232ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.4
                @Override // com.bytedance.sdk.openadsdk.core.bgr.ik.ri.InterfaceC0232ri
                public void ri(boolean z) {
                    com.bytedance.sdk.component.utils.ac.ri("ScreenVideoLoadM", "onCachedResponse: i=" + i + ", isSuccess=" + z);
                }
            });
        }
    }

    private void ri(final com.bytedance.sdk.openadsdk.core.model.ri riVar, wjv wjvVar, nr nrVar, final AdSlot adSlot, final boolean z, lr lrVar) {
        final nr nrVar2;
        final lr lrVar2;
        if (z && !dw.ik(wjvVar) && wjv.fi(wjvVar) && com.bytedance.sdk.openadsdk.core.nr.ka().su(adSlot.getCodeId()).ka == 1 && !com.bytedance.sdk.component.utils.nr.ka(this.lr)) {
            ri(new ik(wjvVar, adSlot, riVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = lrVar != null && com.bytedance.sdk.openadsdk.core.nr.ka().zf() == 1;
        if (dw.ik(wjvVar)) {
            nrVar2 = nrVar;
            lrVar2 = lrVar;
            if (z) {
                fi.ri(this.lr).ri(adSlot, riVar);
            }
        } else if (wjv.fi(wjvVar)) {
            if (wjvVar.eu() != null) {
                com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(wjvVar.qf()).ri(), wjvVar);
                lrVarRi.ri("material_meta", wjvVar);
                lrVarRi.ri("ad_slot", adSlot);
                nrVar2 = nrVar;
                lrVar2 = lrVar;
                com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new attabal() { // from class: com.bytedance.sdk.openadsdk.component.reward.di.5
                    @Override // laky.saneness.attabal
                    public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
                        nrVar2.lr();
                        if (z) {
                            fi.ri(di.this.lr).ri(adSlot, riVar);
                        } else {
                            if (lrVar2 == null || com.bytedance.sdk.openadsdk.core.nr.ka().zf() != 1) {
                                return;
                            }
                            lrVar2.onAdLoaded(nrVar2.ri());
                        }
                    }

                    @Override // laky.saneness.attabal
                    public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i, String str) {
                        if (lrVar2 == null || com.bytedance.sdk.openadsdk.core.nr.ka().zf() != 1) {
                            return;
                        }
                        lrVar2.onError(i, str);
                    }
                });
            } else {
                nrVar2 = nrVar;
                lrVar2 = lrVar;
                z2 = z3;
            }
            z3 = z2;
        } else {
            nrVar2 = nrVar;
            lrVar2 = lrVar;
            if (z) {
                fi.ri(this.lr).ri(adSlot, riVar);
            }
        }
        if (z3) {
            lrVar2.onAdLoaded(nrVar2.ri());
        }
    }

    private void ri(ik ikVar) {
        if (ikVar == null) {
            return;
        }
        if (this.ka.size() > 0) {
            this.ka.remove(0);
        }
        this.ka.add(ikVar);
    }

    public void ri(String str, wjv wjvVar) {
        fi.ri(this.lr).ri(str, wjvVar);
    }
}
