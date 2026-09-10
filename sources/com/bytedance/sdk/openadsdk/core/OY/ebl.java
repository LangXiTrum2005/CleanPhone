package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private AdSlot Lxb;
    private Lxb OY;
    private PAGBannerAdLoadListener ZU;
    private List<com.bytedance.sdk.openadsdk.core.model.tD> ebl;
    private List<com.bytedance.sdk.openadsdk.core.model.tD> lc;
    private final Context lk;
    private final AtomicBoolean JXs = new AtomicBoolean(false);
    private int QAg = 5;
    private final CG nBu = CG.lk();
    private final com.bytedance.sdk.openadsdk.core.tD LD = com.bytedance.sdk.openadsdk.core.kqm.lk();

    public interface Lxb {
    }

    private ebl(Context context) {
        if (context != null) {
            this.lk = context.getApplicationContext();
        } else {
            this.lk = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        }
    }

    public static ebl Lxb(Context context) {
        return new ebl(context);
    }

    public void Lxb(AdSlot adSlot, int i, @NonNull com.bytedance.sdk.openadsdk.common.lc lcVar, int i2) {
        Lxb(adSlot, i, lcVar, null, i2);
    }

    public void Lxb(AdSlot adSlot, int i, @Nullable com.bytedance.sdk.openadsdk.common.lc lcVar, @Nullable Lxb lxb, int i2) {
        this.nBu.JXs();
        if (this.JXs.get()) {
            com.bytedance.sdk.component.utils.sLN.Lxb("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.QAg = i;
        this.JXs.set(true);
        this.Lxb = adSlot;
        if (lcVar instanceof PAGBannerAdLoadListener) {
            this.ZU = (PAGBannerAdLoadListener) lcVar;
        }
        this.OY = lxb;
        Lxb(adSlot, lcVar);
    }

    private void Lxb(final AdSlot adSlot, com.bytedance.sdk.openadsdk.common.lc lcVar) {
        if (adSlot == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.Sfi sfi = new com.bytedance.sdk.openadsdk.core.model.Sfi();
        sfi.OY = 2;
        this.LD.Lxb(adSlot, sfi, this.QAg, new com.bytedance.sdk.openadsdk.core.tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.OY.ebl.1
            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(int i, String str) {
                ebl.this.Lxb(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(final com.bytedance.sdk.openadsdk.core.model.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld) {
                if (lxb.ZU() == null || lxb.ZU().isEmpty()) {
                    ebl.this.Lxb(-3, com.bytedance.sdk.openadsdk.core.OY.Lxb(-3));
                    ld.Lxb(-3);
                    com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld);
                    return;
                }
                ebl.this.lc = lxb.ZU();
                ebl.this.ebl = lxb.ZU();
                ebl.this.Lxb(adSlot);
                if (com.bytedance.sdk.component.utils.sLN.ZU()) {
                    ebl.this.nBu.ZU();
                    Thread.currentThread().getName();
                }
                if (ebl.this.JXs.getAndSet(false)) {
                    hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.ebl.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (ebl.this.ebl != null && ebl.this.ebl.size() > 0) {
                                ebl eblVar = ebl.this;
                                eblVar.Lxb(lxb, eblVar.nBu, jElapsedRealtime);
                                if (ebl.this.OY != null) {
                                    Lxb unused = ebl.this.OY;
                                    List unused2 = ebl.this.ebl;
                                }
                            } else if (ebl.this.OY != null) {
                                Lxb unused3 = ebl.this.OY;
                            }
                            ebl.this.Lxb();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(AdSlot adSlot) {
        List<com.bytedance.sdk.openadsdk.core.model.tD> list = this.lc;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.model.tD tDVar : list) {
            if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar) && tDVar.JJ() != null && tDVar.JJ().g != null) {
                if (com.bytedance.sdk.openadsdk.core.kqm.ZU().JXs(String.valueOf(tDVar.Td())) && com.bytedance.sdk.openadsdk.core.kqm.ZU().Ns()) {
                    com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = com.bytedance.sdk.openadsdk.core.model.tD.Lxb(((OK) CacheDirFactory.getICacheDir(tDVar.tv())).f(), tDVar);
                    ldLxb.Lxb("material_meta", tDVar);
                    ldLxb.Lxb("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, null);
                }
            }
        }
    }

    @Nullable
    private PAGBannerAd Lxb(CG cg) {
        Iterator<com.bytedance.sdk.openadsdk.core.model.tD> it = this.ebl.iterator();
        PAGBannerAd pAGBannerAdLxb = null;
        while (it.hasNext() && (pAGBannerAdLxb = Lxb(it.next())) == null) {
        }
        return pAGBannerAdLxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, CG cg, long j) {
        if (this.ZU != null) {
            PAGBannerAd pAGBannerAdLxb = Lxb(cg);
            if (pAGBannerAdLxb != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long jZU = this.nBu.ZU();
                if (!TextUtils.isEmpty(this.Lxb.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb(this.ebl.get(0), jZU);
                }
                this.ZU.onAdLoaded(pAGBannerAdLxb);
                Lxb(lxb, jZU, j, jElapsedRealtime);
                return;
            }
            this.ZU.onError(103, com.bytedance.sdk.openadsdk.core.OY.Lxb(103));
            Lxb(103);
        }
    }

    private void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, final long j, final long j2, final long j3) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar;
        try {
            if (com.bytedance.sdk.openadsdk.core.kqm.ZU().Lpq() && com.bytedance.sdk.openadsdk.DY.Lxb.ZU()) {
                try {
                    if (this.QAg != 1 || lxb == null || lxb.ZU() == null || lxb.ZU().isEmpty() || lxb.Lxb() == null || (tDVar = lxb.ZU().get(0)) == null) {
                        return;
                    }
                    final JSONObject jSONObjectLxb = lxb.Lxb();
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), tDVar, jSONObjectLxb.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.OY.ebl.2
                        @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                        public JSONObject Lxb() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                long jOptLong = jSONObjectLxb.optLong("callback_start", 0L);
                                long j4 = j2;
                                long j5 = j4 - jOptLong;
                                long j6 = j3 - j4;
                                long jOptLong2 = jSONObjectLxb.optLong("duration", 0L);
                                JSONObject jSONObjectOptJSONObject = jSONObjectLxb.optJSONObject("extra_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("thread_dispatch_duration", j5);
                                jSONObjectOptJSONObject.put("build_banner_ad_duration", j6);
                                jSONObjectOptJSONObject.put("ad_load_duration_full", j);
                                jSONObject.put("duration", jOptLong2);
                                jSONObject.put("ad_extra_data", jSONObjectOptJSONObject.toString());
                                if (com.bytedance.sdk.component.utils.sLN.ZU()) {
                                    com.bytedance.sdk.component.utils.sLN.Lxb("ExpressAdLoadManager", "reportAdLoadTime: result = ".concat(String.valueOf(jSONObject)));
                                }
                            } catch (Throwable unused) {
                            }
                            return jSONObject;
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private void Lxb(int i) {
        String strXNP;
        List<com.bytedance.sdk.openadsdk.core.model.tD> list = this.lc;
        if (list != null && list.size() > 0) {
            strXNP = this.lc.get(0).xNP();
        } else {
            strXNP = "";
        }
        com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb(this.QAg).lk(this.Lxb.getCodeId()).JXs(strXNP).LD(i).lc(com.bytedance.sdk.openadsdk.core.OY.Lxb(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(int i, String str) {
        if (this.JXs.getAndSet(false)) {
            PAGBannerAdLoadListener pAGBannerAdLoadListener = this.ZU;
            if (pAGBannerAdLoadListener != null) {
                pAGBannerAdLoadListener.onError(i, str);
            }
            Lxb();
        }
    }

    private PAGBannerAd Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (this.QAg != 1) {
            return null;
        }
        if (tDVar.JJ() != null) {
            return new com.bytedance.sdk.openadsdk.core.lk.lc(this.lk, tDVar, this.Lxb);
        }
        return new com.bytedance.sdk.openadsdk.core.lk.ZU(this.lk, tDVar, this.Lxb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb() {
        List<com.bytedance.sdk.openadsdk.core.model.tD> list = this.lc;
        if (list != null) {
            list.clear();
        }
        List<com.bytedance.sdk.openadsdk.core.model.tD> list2 = this.ebl;
        if (list2 != null) {
            list2.clear();
        }
    }
}
