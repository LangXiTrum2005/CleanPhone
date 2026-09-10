package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.pv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private final Context ik;
    private PAGBannerAdLoadListener ka;
    private com.bytedance.sdk.openadsdk.core.model.wjv mj;
    private AdSlot ri;
    private final AtomicBoolean fi = new AtomicBoolean(false);
    private int di = 5;
    private final pv xha = pv.ik();
    private final com.bytedance.sdk.openadsdk.core.wjv lr = com.bytedance.sdk.openadsdk.core.nr.ik();

    private xha(Context context) {
        if (context != null) {
            this.ik = context.getApplicationContext();
        } else {
            this.ik = com.bytedance.sdk.openadsdk.core.nr.ri();
        }
    }

    public static xha ri(Context context) {
        return new xha(context);
    }

    public void ri(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.xha xhaVar) {
        this.xha.fi();
        if (this.fi.get()) {
            return;
        }
        this.di = i;
        this.fi.set(true);
        this.ri = adSlot;
        if (xhaVar instanceof PAGBannerAdLoadListener) {
            this.ka = (PAGBannerAdLoadListener) xhaVar;
        }
        ri(adSlot);
    }

    private void ri(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        igq igqVar = new igq();
        igqVar.jbs = 2;
        this.lr.ri(adSlot, igqVar, this.di, new com.bytedance.sdk.openadsdk.core.uq() { // from class: com.bytedance.sdk.openadsdk.core.jbs.xha.1
            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                xha.this.ri(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                xha.this.ri(riVar, ikVar, adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar, AdSlot adSlot) {
        if (riVar.ka() != null && !riVar.ka().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVarJbs = riVar.jbs();
            this.mj = wjvVarJbs;
            ri(wjvVarJbs, adSlot);
            if (com.bytedance.sdk.component.utils.vr.ik()) {
                this.xha.ka();
                Thread.currentThread().getName();
            }
            if (this.fi.getAndSet(false)) {
                dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.xha.2
                    @Override // java.lang.Runnable
                    public void run() {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (xha.this.mj != null) {
                            xha xhaVar = xha.this;
                            xhaVar.ri(xhaVar.mj, jElapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        ri(-3, com.bytedance.sdk.openadsdk.core.jbs.ri(-3));
        ikVar.ri(-3);
        ikVar.ik(8);
        com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 : wjvVar.lsq()) {
            if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar2) && wjvVar2.eu() != null && wjvVar2.eu().supplicat() != null) {
                if (com.bytedance.sdk.openadsdk.core.nr.ka().fi(String.valueOf(wjvVar2.ur())) && com.bytedance.sdk.openadsdk.core.nr.ka().zb()) {
                    com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = com.bytedance.sdk.openadsdk.core.model.wjv.ri(CacheDirFactory.getICacheDir(wjvVar2.qf()).ik(), wjvVar2);
                    lrVarRi.ri("material_meta", wjvVar2);
                    lrVarRi.ri("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, null);
                }
            }
        }
    }

    private PAGBannerAd ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeVkd = wjvVar.vkd();
        float fMin = Math.min(this.ri.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeVkd != null) {
            width = pAGBannerSizeVkd.getWidth();
            height = pAGBannerSizeVkd.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.ri.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.ri.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.ka.xha(this.ik, wjvVar, this.ri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, long j) {
        if (this.ka != null) {
            PAGBannerAd pAGBannerAdRi = ri(wjvVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jKa = this.xha.ka();
            if (!TextUtils.isEmpty(this.ri.getBidAdm())) {
                com.bytedance.sdk.openadsdk.slm.ka.ri(wjvVar, jKa);
            }
            this.ka.onAdLoaded(pAGBannerAdRi);
            ri(wjvVar, jKa, j, jElapsedRealtime);
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final long j, final long j2, final long j3) {
        try {
            if (!com.bytedance.sdk.openadsdk.core.nr.ka().nd() || !com.bytedance.sdk.openadsdk.wjv.fi.ka() || this.di != 1 || wjvVar == null || wjvVar.lsq() == null || wjvVar.lsq().isEmpty() || wjvVar.ka().ri() == null) {
                return;
            }
            final JSONObject jSONObjectRi = wjvVar.ka().ri();
            com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, jSONObjectRi.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.jbs.xha.3
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ik() {
                    try {
                        long jOptLong = jSONObjectRi.optLong("callback_start", 0L);
                        long j4 = j2;
                        long j5 = j4 - jOptLong;
                        long j6 = j3 - j4;
                        JSONObject jSONObjectOptJSONObject = jSONObjectRi.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j5);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j6);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject lr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, jSONObjectRi.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.fi.getAndSet(false) || (pAGBannerAdLoadListener = this.ka) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i, str);
    }
}
