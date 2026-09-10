package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.component.utils.bqt;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.aaj;
import com.bytedance.sdk.openadsdk.core.jyq;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.uw;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz {
    private static volatile mzz qdl;
    private final AtomicBoolean lnr = new AtomicBoolean(false);
    private final List<lnr> mml = a.u();
    private final bqt.qdl mo = new bqt.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.2
        @Override // com.bytedance.sdk.component.utils.bqt.qdl
        public void qdl(Context context, Intent intent, boolean z2, int i2) {
            if (z2) {
                if (mzz.this.mzz == null) {
                    mzz mzzVar = mzz.this;
                    mzzVar.mzz = new com.bytedance.sdk.openadsdk.component.reward.ud("fsv net connect task", mzzVar.mml);
                }
                com.bytedance.sdk.component.utils.tvp.qdl().post(mzz.this.mzz);
            }
        }
    };
    private com.bytedance.sdk.component.jpc.jpc mzz;
    private final Context ud;

    public static class lnr extends com.bytedance.sdk.component.jpc.jpc {
        final com.bytedance.sdk.openadsdk.core.model.qdl lnr;
        final ljh qdl;
        final AdSlot ud;

        public lnr(ljh ljhVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
            super("Fullscreen Task");
            this.qdl = ljhVar;
            this.ud = adSlot;
            this.lnr = qdlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ljh ljhVar = this.qdl;
            if (ljhVar == null || ljhVar.tdy() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(this.qdl.lhl()).qdl(), this.qdl);
            udVarQdl.qdl("material_meta", this.qdl);
            udVarQdl.qdl("ad_slot", this.ud);
            com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.lnr.1
                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2, String str) {
                }

                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2) {
                    mml mmlVarQdl = mml.qdl(yt.qdl());
                    lnr lnrVar2 = lnr.this;
                    mmlVarQdl.qdl(lnrVar2.ud, lnrVar2.lnr);
                }
            });
        }
    }

    public static class qdl implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.qdl lnr;
        private final PAGInterstitialAdLoadListener mml;
        private final boolean mzz;
        private final Context qdl;
        private final AdSlot ud;

        public qdl(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z2) {
            this.qdl = context;
            this.ud = adSlot;
            this.lnr = qdlVar;
            this.mml = pAGInterstitialAdLoadListener;
            this.mzz = z2;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public void onError(int i2, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.mml;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i2, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            mzz.qdl(this.qdl).qdl(this.ud, this.lnr, this.mml, pAGInterstitialAd, this.mzz);
        }
    }

    public static class ud implements PAGInterstitialAdLoadListener {
        private final AtomicInteger lnr;
        private final com.bytedance.sdk.openadsdk.core.model.qdl mml;
        private final PAGInterstitialAdLoadListener qdl;
        private final AtomicBoolean ud;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
        public void onError(int i2, String str) {
            if (this.lnr.decrementAndGet() > 0 || !this.ud.compareAndSet(false, true)) {
                return;
            }
            this.qdl.onError(i2, str);
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.ud.1
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", ud.this.mml.ud());
                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("choose_ad_load_error").ud(jSONObject.toString());
                }
            });
        }

        private ud(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
            this.ud = new AtomicBoolean(false);
            this.qdl = pAGInterstitialAdLoadListener;
            this.mml = qdlVar;
            this.lnr = new AtomicInteger(qdl());
        }

        private int qdl() {
            if (!this.mml.mzz()) {
                return 0;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.mml.mml().size(); i3++) {
                ljh ljhVar = this.mml.mml().get(i3);
                if (ljhVar != null && !vu.lnr(ljhVar) && ljhVar.tdy() != null) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.lnr.decrementAndGet();
            if (this.qdl == null || !this.ud.compareAndSet(false, true)) {
                return;
            }
            this.qdl.onAdLoaded(pAGInterstitialAd);
        }
    }

    private mzz(Context context) {
        this.ud = context == null ? yt.qdl() : context.getApplicationContext();
        lnr();
    }

    private void mml(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 1;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.8
            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i2, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i2, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
                if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
                    rdp rdpVar = new rdp(mzz.this.ud, qdlVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(qdlVar.mml().isEmpty() ? null : qdlVar.mml().get(0));
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(qdlVar.mo(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || yt.mml().vu() != 0) {
                        qdlVar2 = qdlVar;
                    } else {
                        mzz.this.qdl(adSlot, qdlVar, pAGInterstitialAdLoadListener, (PAGInterstitialAd) rdpVar.qdl(), false);
                        qdlVar2 = qdlVar;
                    }
                    mzz.this.qdl(qdlVar2, rdpVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
                    lnrVar.qdl(-3);
                    lnrVar.lnr(5);
                    com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                }
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.mzz != null) {
            try {
                com.bytedance.sdk.component.utils.tvp.qdl().removeCallbacks(this.mzz);
            } catch (Exception unused) {
            }
            this.mzz = null;
        }
        mml();
    }

    private void lnr(final AdSlot adSlot) {
        if (mml.qdl(this.ud).ud(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 2;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.3
            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i2, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                if (qdlVar.mml() == null || qdlVar.mml().isEmpty()) {
                    return;
                }
                mzz.this.qdl(qdlVar, new rdp(mzz.this.ud, qdlVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    private void ud(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 2;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.1
            boolean qdl = false;

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i2, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public String qdl() {
                return mml.qdl(mzz.this.ud).qdl(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                boolean zQdl = mml.qdl(mzz.this.ud).qdl(qdlVar);
                this.qdl = zQdl;
                return zQdl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                if (this.qdl || qdlVar.mml() == null || qdlVar.mml().isEmpty()) {
                    return;
                }
                mzz.this.qdl(qdlVar, new rdp(mzz.this.ud, qdlVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    public static mzz qdl(Context context) {
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml(AdSlot adSlot) {
        if (ud() != 2) {
            return;
        }
        mml.qdl(this.ud).qdl(adSlot.getCodeId());
    }

    private void ud(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.bqt bqtVar = new com.bytedance.sdk.openadsdk.core.model.bqt();
        bqtVar.lnr = 1;
        if (yt.mml().fs(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            bqtVar.tvp = 2;
        }
        yt.lnr().qdl(adSlot, bqtVar, 8, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.4
            boolean qdl = false;

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i2, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i2, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
                if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
                    rdp rdpVar = new rdp(mzz.this.ud, qdlVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(qdlVar.mml().isEmpty() ? null : qdlVar.mml().get(0));
                        com.bytedance.sdk.openadsdk.bjy.lnr.qdl(qdlVar.mo(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || yt.mml().vu() != 0) {
                        qdlVar2 = qdlVar;
                    } else {
                        mzz.this.qdl(adSlot, qdlVar, pAGInterstitialAdLoadListener, rdpVar.qdl(), this.qdl);
                        qdlVar2 = qdlVar;
                    }
                    mzz.this.qdl(qdlVar2, rdpVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
                    lnrVar.qdl(-3);
                    lnrVar.lnr(5);
                    com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public String qdl() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strQdl = mml.qdl(mzz.this.ud).qdl(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strQdl)) {
                    return null;
                }
                return strQdl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                boolean zQdl = mml.qdl(mzz.this.ud).qdl(qdlVar);
                this.qdl = zQdl;
                return zQdl;
            }
        });
    }

    private void lnr(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarUd;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (qdlVarUd = mml.qdl(this.ud).ud(adSlot.getCodeId(), true)) != null && qdlVarUd.mzz()) {
            qdl(adSlot, qdlVarUd, pAGInterstitialAdLoadListener);
        } else {
            mml(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    private void mml() {
        if (this.lnr.get()) {
            this.lnr.set(false);
            try {
                bqt.qdl(this.mo);
            } catch (Exception unused) {
            }
        }
    }

    public void qdl() {
        try {
            mml.qdl(this.ud).qdl();
        } catch (Throwable unused) {
        }
    }

    public void qdl(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            ud(adSlot);
        } else {
            lnr(adSlot);
        }
    }

    private void lnr() {
        if (this.lnr.get()) {
            return;
        }
        this.lnr.set(true);
        bqt.qdl(this.mo, this.ud);
    }

    public static int ud() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("ivrv_load_ad_cache_strategy", 0);
    }

    public void qdl(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) throws Throwable {
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            ud(adSlot, pAGInterstitialAdLoadListener);
        } else {
            lnr(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    private void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
        mzz mzzVar;
        AdSlot adSlot2;
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar3;
        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
        ljh ljhVarMo = qdlVar.mo();
        for (ljh ljhVar : qdlVar.mml()) {
            if (ljhVar.ji() == null) {
                ljhVar.qdl(adSlot);
            }
        }
        rdp rdpVar = new rdp(this.ud, qdlVar);
        if (!vu.lnr(ljhVarMo)) {
            rdpVar.ud();
        }
        if (pAGInterstitialAdLoadListener != null) {
            com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(qdlVar);
            if (yt.mml().vu() == 0) {
                mzzVar = this;
                adSlot2 = adSlot;
                qdlVar3 = qdlVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                mzzVar.qdl(adSlot2, qdlVar3, pAGInterstitialAdLoadListener2, (PAGInterstitialAd) rdpVar.qdl(), true);
            } else {
                mzzVar = this;
                adSlot2 = adSlot;
                qdlVar3 = qdlVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
            }
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener3 = pAGInterstitialAdLoadListener2;
            AdSlot adSlot3 = adSlot2;
            com.bytedance.sdk.openadsdk.core.model.qdl qdlVar4 = qdlVar3;
            qdlVar2 = qdlVar4;
            ud udVar = new ud(new qdl(mzzVar.ud, adSlot3, qdlVar4, pAGInterstitialAdLoadListener3, true), qdlVar2);
            for (int i2 = 0; i2 < qdlVar2.mml().size(); i2++) {
                qdl(qdlVar2.mml().get(i2), adSlot3, udVar, rdpVar);
                if (qdlVar2.to()) {
                    break;
                }
            }
        } else {
            qdlVar2 = qdlVar;
        }
        for (int i3 = 0; i3 < qdlVar2.mml().size(); i3++) {
            com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdlVar2.mml().get(i3), new com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0108qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.5
                @Override // com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0108qdl
                public void qdl(boolean z2) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.6
            @Override // java.lang.Runnable
            public void run() {
                int iUd = mzz.ud();
                if (!z2) {
                    if (iUd == 2) {
                        mml.qdl(mzz.this.ud).qdl(adSlot, qdlVar);
                        mzz.this.mml(adSlot);
                        return;
                    }
                    return;
                }
                if (iUd == 2) {
                    mzz.this.mml(adSlot);
                } else if (iUd == 1) {
                    mml.qdl(mzz.this.ud).qdl(adSlot.getCodeId(), (ljh) null);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    private void qdl(ljh ljhVar, AdSlot adSlot, final ud udVar, final rdp rdpVar) {
        boolean z2;
        boolean z3 = false;
        if (udVar != null) {
            z2 = yt.mml().vu() == 1;
        }
        if (vu.lnr(ljhVar) || !ljh.mzz(ljhVar)) {
            z3 = z2;
        } else {
            com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(ljhVar.lhl()).qdl(), ljhVar);
            udVarQdl.qdl("material_meta", ljhVar);
            udVarQdl.qdl("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.7
                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2) {
                    if (udVar == null || yt.mml().vu() != 1) {
                        return;
                    }
                    udVar.onAdLoaded(rdpVar.qdl());
                }

                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2, String str) {
                    if (udVar == null || yt.mml().vu() != 1) {
                        return;
                    }
                    udVar.onError(i2, str);
                }
            });
        }
        if (z3) {
            udVar.onAdLoaded(rdpVar.qdl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, rdp rdpVar, AdSlot adSlot, boolean z2, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z2) {
            com.bytedance.sdk.openadsdk.exu.qdl.qdl().qdl(qdlVar.mo());
        }
        AdSlot adSlot2 = adSlot;
        ud udVar = new ud(new qdl(this.ud, adSlot2, qdlVar, pAGInterstitialAdLoadListener, false), qdlVar);
        qdl(qdlVar);
        int i2 = 0;
        while (i2 < qdlVar.mml().size()) {
            ljh ljhVar = qdlVar.mml().get(i2);
            int iTaz = ljhVar.taz();
            if (i2 == 0 && iTaz == 43) {
                ljhVar.tdy().mo(0);
            }
            rdp rdpVar2 = rdpVar;
            boolean z3 = z2;
            AdSlot adSlot3 = adSlot2;
            qdl(qdlVar, ljhVar, rdpVar2, adSlot3, z3, udVar);
            adSlot2 = adSlot3;
            if (qdlVar.to() && ljhVar.taz() != 43) {
                return;
            }
            i2++;
            rdpVar = rdpVar2;
            z2 = z3;
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        uw uwVarFs = qdlVar.fs();
        int iJtx = qdlVar.to() ? 10 : 1;
        if (uwVarFs != null) {
            iJtx = uwVarFs.jtx();
        }
        for (final int i2 = 0; i2 < qdlVar.mml().size() && i2 < iJtx; i2++) {
            com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdlVar.mml().get(i2), new com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0108qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.9
                @Override // com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.InterfaceC0108qdl
                public void qdl(boolean z2) {
                    com.bytedance.sdk.component.utils.aaj.qdl("ScreenVideoLoadM", "onCachedResponse: i=" + i2 + ", isSuccess=" + z2);
                }
            });
        }
    }

    private void qdl(final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, ljh ljhVar, rdp rdpVar, final AdSlot adSlot, final boolean z2, ud udVar) {
        final rdp rdpVar2;
        final ud udVar2;
        if (z2 && !vu.lnr(ljhVar) && ljh.mzz(ljhVar) && yt.mml().xmv(adSlot.getCodeId()).mml == 1 && !jl.mml(this.ud)) {
            qdl(new lnr(ljhVar, adSlot, qdlVar));
            return;
        }
        boolean z3 = false;
        boolean z4 = udVar != null && yt.mml().vu() == 1;
        if (vu.lnr(ljhVar)) {
            rdpVar2 = rdpVar;
            udVar2 = udVar;
            if (z2) {
                mml.qdl(this.ud).qdl(adSlot, qdlVar);
            }
        } else if (ljh.mzz(ljhVar)) {
            if (ljhVar.tdy() != null) {
                com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(ljhVar.lhl()).qdl(), ljhVar);
                udVarQdl.qdl("material_meta", ljhVar);
                udVarQdl.qdl("ad_slot", adSlot);
                rdpVar2 = rdpVar;
                udVar2 = udVar;
                com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mzz.10
                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2) {
                        rdpVar2.ud();
                        if (z2) {
                            mml.qdl(mzz.this.ud).qdl(adSlot, qdlVar);
                        } else {
                            if (udVar2 == null || yt.mml().vu() != 1) {
                                return;
                            }
                            udVar2.onAdLoaded(rdpVar2.qdl());
                        }
                    }

                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2, String str) {
                        if (udVar2 == null || yt.mml().vu() != 1) {
                            return;
                        }
                        udVar2.onError(i2, str);
                    }
                });
            } else {
                rdpVar2 = rdpVar;
                udVar2 = udVar;
                z3 = z4;
            }
            z4 = z3;
        } else {
            rdpVar2 = rdpVar;
            udVar2 = udVar;
            if (z2) {
                mml.qdl(this.ud).qdl(adSlot, qdlVar);
            }
        }
        if (z4) {
            udVar2.onAdLoaded(rdpVar2.qdl());
        }
    }

    private void qdl(lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        if (this.mml.size() > 0) {
            this.mml.remove(0);
        }
        this.mml.add(lnrVar);
    }

    public void qdl(String str, ljh ljhVar) {
        mml.qdl(this.ud).qdl(str, ljhVar);
    }
}
